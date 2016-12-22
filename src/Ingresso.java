/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Ingresso {
    private String codigo,data_filme,nome_cadeira,nome_sala,filme;
    private double preco;
 
    public Ingresso(String codigo, String data_filme, String nome_cadeira, String nome_sala, String filme, double preco) {
        this.codigo = codigo;
        this.data_filme = data_filme;
        this.nome_cadeira = nome_cadeira;
        this.nome_sala = nome_sala;
        this.filme = filme;
        this.preco = preco;
    }

    public Ingresso(String codigo,String filme, String nome_sala,String nome_cadeira, double preco) {
        this.codigo = codigo;
        this.nome_cadeira = nome_cadeira;
        this.nome_sala = nome_sala;
        this.filme = filme;
        this.preco = preco;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getData_Filme() {
        return data_filme;
    }

    public void setData_Filme(String data) {
        this.data_filme = data;
    }

    public String getCadeira() {
        return nome_cadeira;
    }

    public void setCadeira(String nome_cadeira) {
        this.nome_cadeira = nome_cadeira;
    }

    public String getSala() {
        return nome_sala;
    }

    public void setSala(String nome_sala) {
        this.nome_sala = nome_sala;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    @Override
    public String toString(){
        return "Filme:"+filme+",Preço:"+preco;
    }
}
