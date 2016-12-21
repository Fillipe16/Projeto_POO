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
        String sql = "insert into sessao (sala,horario,cadeiras) values (?,?,?)";
        PreparedStatement stmt = null;
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, s.getSala());
            stmt.setString(2, s.getHorario());
            stmt.setString(3,"");
            stmt.execute();
            stmt.close();

            System.out.println("Dados inseridos no banco!");
        }catch(SQLException e){
            System.out.println("Erro na insercao do banco de dados: "+e);
        }
     }
     public void atualizarCadeiras(String cad,String sala,String h){
         PreparedStatement stmt=null;
         try{
             stmt=conexao.prepareStatement("update sessao set cadeiras=? where sala=? and horario=?");
             stmt.setString(1,cad);
             stmt.setString(2,sala);
             stmt.setString(3,h);
             stmt.execute();
             stmt.close();
             
             System.out.println("Atualização realizada com sucesso");
         }catch(SQLException ex){
             System.out.println("Erro na atualização das informação: "+ex);
         }
     }
     public String verC(String sala,String h){
         String cads="";
         
         try{
            PreparedStatement stmt = conexao.prepareStatement("select cadeiras from sessao where sala=? and horario=?");
            stmt.setString(1, sala);
            stmt.setString(2,h);
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
   
     
}
