/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BilheteriaNacional.DAO;
import java.sql.*;
/**
 *
 * @author Aluno
 */
public class CriarBanco {
    
    Connection conexao = null;

    public CriarBanco() {
        conexao=new ConexaoBanco().getConexao();
    }
    
    String sql1="use bilheteria";
    
    String sql2 = "create table if not exists ingresso(\n" +
"	codigo varchar(50) primary key,\n" +
"	data_filme varchar(10) not null,\n" +
"    cadeira varchar(5) not null,\n" +
"    sala varchar(3) not null,\n" +
"    dia varchar(20) not null,\n" +
"	filme varchar(100) not null,\n" +
"    preco double not null\n" +
");";
    
    String sql3 = "create table if not exists sessao(\n" +
"	sala varchar(2),\n" +
"    horario varchar(10),\n" +
"    cadeiras varchar(500),\n" +
"    dia varchar(20),\n" +
"    primary key(sala,horario,dia)\n" +
");";
    
    public void CriarTabelas(){
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;
        try{
            stmt = conexao.prepareStatement(sql1);
            stmt.execute(sql1);
            stmt.close();            
            stmt2 = conexao.prepareStatement(sql2);
            stmt2.execute(sql2);
            stmt2.close();
            stmt2 = conexao.prepareStatement(sql3);
            stmt2.execute(sql3);
            stmt2.close();
            
        }catch(SQLException e){
            System.out.println("Erro na criacao de tabelas");
        }
    }
    
}
