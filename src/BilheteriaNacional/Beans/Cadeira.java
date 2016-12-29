package BilheteriaNacional.Beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Cadeira {


    private int estado; //Diz respeito se ela está livre,selecionada(hora da compra), ou já esta comprada estando associados aos numeros 1,-1 e 0, respectivamente.
                
    private String nome;

    public Cadeira(int estado, String nome) {
        this.estado = estado;
        this.nome = nome;
    }
    public Cadeira() {
        this.nome="";
    }
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String toString(){
        return nome;
    }
    
}
