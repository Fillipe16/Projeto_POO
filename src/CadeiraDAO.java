
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fillipe
 */
public class CadeiraDAO {
    private Connection conexao=null;

    public CadeiraDAO() {
        conexao=new ConexaoBanco().getConexao();
    }
     public void adicionar(Cadeira c){
        String sql = "insert into cadeira (nome,estado) values (?,?)";
        PreparedStatement stmt = null;
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setInt(2, c.getEstado());
            stmt.execute();
            stmt.close();

            System.out.println("Dados inseridos no banco!");
        }catch(SQLException e){
            System.out.println("Erro na insercao do banco de dados: "+e);
        }
     }
}
