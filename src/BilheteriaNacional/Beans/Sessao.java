package BilheteriaNacional.Beans;


import BilheteriaNacional.DAO.IngressoDAO;
import java.util.ArrayList;
import javax.swing.JButton;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Sessao {
    IngressoDAO Ibanco=new IngressoDAO();
    private ArrayList<Cadeira> cadeiras=new ArrayList();
    private String sala;
    private String horario;

    public Sessao(String sala, String horario) {
        this.sala = sala;
        this.horario = horario;
    }

    public Sessao() {
        this.sala="";
        this.horario="";
    }
    
    
    
    public void init(Sessao se){
        for(int i=1;i<27;i++){
            String nome="cad"+i;
            Cadeira c=new Cadeira(1,nome);
            cadeiras.add(c);               
        }
    }
   
    public void selecionar(String nome){
        for(int i=0;i<26;i++){
            if(cadeiras.get(i).getNome().equals(nome) && cadeiras.get(i).getEstado()==1){
                cadeiras.get(i).setEstado(-1);
            }
            else if(cadeiras.get(i).getNome().equals(nome) && cadeiras.get(i).getEstado()==-1){
                cadeiras.get(i).setEstado(1);
            }
        }
    }
    public int verEstado(String nome){
        for(int i=0;i<26;i++){
            if(cadeiras.get(i).getNome().equals(nome)){
                return cadeiras.get(i).getEstado();
            }
        }
        return -1000;
    }
 
    public ArrayList<Cadeira> getCadeiras() {
        return cadeiras;
    }

    public void setCadeiras(ArrayList<Cadeira> cadeiras) {
        this.cadeiras = cadeiras;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    public static ArrayList<String> dados(String s){
        ArrayList<String> dados=new ArrayList();
        int contador=0;
        String sala="";
        String hr="";
        String filme="";
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            if(c=='|'){
                contador++;
            }
            if(contador==0 && j>5){
                filme+=s.charAt(j);
            }
            if(contador==1 && Character.isDigit(c)){
                sala+=c;
            }
            if(contador==2 && Character.isDigit(c) ||(c==':' && Character.isDigit(s.charAt(j+1)))){
                hr+=c;
            }
        }
        dados.add(sala);
        dados.add(hr);
        dados.add(filme);
        return dados;
    }
    public Cadeira getCad(String nCad,Sessao s){
        for(int i=0;i<s.getCadeiras().size();i++){
            if(s.getCadeiras().get(i).getNome().equals(nCad)){
                return s.getCadeiras().get(i);
            }
        }
        return null;
    }
    public String toString(){
        return "Horario:"+horario+",Sala:"+sala;
    }
    
}
  

