package BilheteriaNacional.DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
import BilheteriaNacional.Beans.Ingresso;
import java.sql.*;
import java.util.ArrayList;

public class IngressoDAO {
    private Connection conexao=null;

    public IngressoDAO() {
        conexao=new ConexaoBanco().getConexao();
    }
     public void adicionar(Ingresso i){
        String sql = "insert into ingresso (codigo,filme,cadeira,sala,dia,data_filme,preco) values (?,?,?,?,?,?,?)";
        PreparedStatement stmt = null;
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, i.getCodigo());
            stmt.setString(2, i.getFilme());
            stmt.setString(3, i.getCadeira());
            stmt.setString(4, i.getSala());
            stmt.setString(5, i.getDia());
            stmt.setString(6, i.getData_Filme());
            stmt.setDouble(7, i.getPreco());
            stmt.execute();
            stmt.close();

            System.out.println("Dados inseridos no banco!");
        }catch(SQLException e){
            System.out.println("Erro na insercao do banco de dados: "+e);
        }
     }
    
    public ArrayList<String> cadeirasOcupadas(String sala,String h,String dia){ //Retorna um Array contendo o nome das cadeiras ocupadas,por exemplo:[cad1,cad2,cad3].
      ArrayList<String> cadeirasO =new ArrayList();
      try{
            PreparedStatement stmt = conexao.prepareStatement("select cadeira from ingresso where sala=? and data_filme=? and dia=?");
            stmt.setString(1, sala);
            stmt.setString(2,h);
            stmt.setString(3,dia);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                String cad=rs.getString("cadeira");
                cadeirasO.add(cad);
            }
            rs.close();
            stmt.close();
      }catch(SQLException ex){
          System.out.println("Erro na consulta das cadeiras ocupadas: "+ex);
      }
      System.out.println(cadeirasO);
      return cadeirasO;
  }
  public String validarI(String codig){//Retorna uma String apenas para ver se tal ingresso existe no banco e assim verificar sua veracidade.
      String cod="";
      try{
            PreparedStatement stmt = conexao.prepareStatement("select codigo from ingresso where codigo=?");
            stmt.setString(1, codig);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                cod=rs.getString("codigo"); 
            }
            rs.close();
            stmt.close();
      }catch(SQLException ex){
          System.out.println("Erro na consulta dos codigos ocupadas: "+ex);
      }
      return cod;
  }
  
  public void deleteI(String cod){
      try{
        PreparedStatement stmt=conexao.prepareStatement("delete from ingresso where codigo=?");
        stmt.setString(1,cod);
        stmt.execute();
        stmt.close();
        System.out.println("Ingresso deletado com sucesso");
      }catch(SQLException ex){
          System.out.println("Erro no deletar do ingresso:"+ex);
      }
  }
    
}
