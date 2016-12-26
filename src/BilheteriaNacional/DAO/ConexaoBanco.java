package BilheteriaNacional.DAO;


import java.sql.*;

public class ConexaoBanco {
    Connection conexao = null; 
    static String url = "jdbc:mysql://localhost"; 
    String usuario = "root";
    String senha = "";
    
    public ConexaoBanco(){
        try {
            conexao = DriverManager.getConnection(getUrl(), usuario, senha);
            System.out.println("Conexao com o banco de dados realizada com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro na conexao com o banco: "+e);
        }
    }
    
    public Connection getConexao(){
        return conexao;
    }

    public String getUrl() {
        return url;
    }

    public static void setUrl(String nUrl) {
        url = nUrl;
    }
    
}
