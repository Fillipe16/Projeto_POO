package BilheteriaNacional.DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fillipe
 */
import BilheteriaNacional.Beans.Sessao;
import java.sql.*;

public class SessaoDAO {
     private Connection conexao=null;

    public SessaoDAO() {
        conexao=new ConexaoBanco().getConexao();
    }
     public void adicionar(Sessao s){
        String sql = "insert ignore into sessao (sala,horario,cadeiras,dia) values (?,?,?,?)";
        PreparedStatement stmt = null;
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, s.getSala());
            stmt.setString(2, s.getHorario());
            stmt.setString(3,"");
            stmt.setString(4, s.getDia());
            stmt.execute();
            stmt.close();

            System.out.println("Dados inseridos no banco!");
        }catch(SQLException e){
            System.out.println("Erro na insercao do banco de dados: "+e);
        }
     }
     public void atualizarCadeiras(String cadeiras,String sala,String h,String dia){//Atualiza a coluna cadeiras, uma String contendo as cadeiras compradas para uma determinada sessao.
         PreparedStatement stmt=null;
         try{
             stmt=conexao.prepareStatement("update sessao set cadeiras=? where sala=? and horario=? and dia=?");
             stmt.setString(1,cadeiras);
             stmt.setString(2,sala);
             stmt.setString(3,h);
             stmt.setString(4,dia);
             stmt.execute();
             stmt.close();
             
             System.out.println("Atualização realizada com sucesso");
         }catch(SQLException ex){
             System.out.println("Erro na atualização das informação: "+ex);
         }
     }
     public String getCadeiras(String sala,String h,String dia){//Retorna a coluna cadeiras.
         String cads="";
         
         try{
            PreparedStatement stmt = conexao.prepareStatement("select cadeiras from sessao where sala=? and horario=? and dia=?");
            stmt.setString(1, sala);
            stmt.setString(2,h);
            stmt.setString(3,dia);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                cads=rs.getString("cadeiras");
            }
            rs.close();
            stmt.close();
            System.out.println("Consulta das cadeiras ocupadas na sessao realizada com sucesso");
      }catch(SQLException ex){
          System.out.println("Erro na consulta das cadeiras da sessao: "+ex);
      }
      return cads;
    }
    public void atualizarCadeirasTrocarSessao(String cadeira,String sala,String horario,String dia){//Diferentemente da anterior esse metodo atualiza as cadeiras para troca de sessao, sendo assim, ele da o update ja mudando a String cadeiras, não sendo necessario recebe-lo como argumento.
        try{
            PreparedStatement stmt=conexao.prepareStatement("update sessao set cadeiras=replace(cadeiras,if(cadeiras like CONCAT('5',?,', %'),CONCAT(?,', '),CONCAT(', ',?)),'') "
            + "where cadeiras like CONCAT('%',?,',%') or cadeiras like CONCAT('%',?,']%') and sala=? and horario=? and dia=?");//Codigo sql para dar um update na coluna cadeiras da tabela sessao, trocando a String por uma na qual o nome da cadeira, passado por argumento, não exista. Sendo assim é necessario analisar em que parte da String original tal cadeira está para que seja feita a troca dessa parte por uma String vazia, ou seja, eliminando-na. O where foi utilizado pois existem diversas sessoes e é necessario retirar a cadeira desejada da String cadeiras da sessao correta.
            stmt.setString(1, cadeira);                                                                                        // Foi necessario colocar os CONCAT, pois a função era preciso analisar em que parte da String a ceira está(começo, meio, fim)sendo assim a anlise mudaria.
            stmt.setString(2, cadeira);
            stmt.setString(3, cadeira);
            stmt.setString(4, cadeira);
            stmt.setString(5, cadeira);
            stmt.setString(6, sala);
            stmt.setString(7, horario);
            stmt.setString(8, dia);
            
            stmt.execute();
            stmt.close();
             
            System.out.println("Atualização nas cadeiras da troca realizada com sucesso");
        }catch(SQLException ex){
            System.out.println("Erro na atualização das cadeiras da troca");
        }
    }
     
}
