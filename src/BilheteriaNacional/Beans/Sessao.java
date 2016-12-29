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
    
    private ArrayList<Cadeira> cadeiras=new ArrayList();
    
    private String sala;
    private String horario;
    private String dia;

    public Sessao(String sala, String horario, String dia) {
        this.sala = sala;
        this.horario = horario;
        this.dia = dia;
    }


    public Sessao() {
        this.sala="";
        this.horario="";
        this.dia="";
    }
    
    
    
    public void init(Sessao se){       //Inicializa o Array de cadeiras todas com o valor de estado 1.
        for(int i=1;i<27;i++){
            String nome="cad"+i;
            Cadeira c=new Cadeira(1,nome);
            cadeiras.add(c);               
        }
    }
   
    public void selecionar(String nome){ //Chamada todas as vezes que alguma cadeira é selecionada.
        for(int i=0;i<26;i++){
            if(cadeiras.get(i).getNome().equals(nome) && cadeiras.get(i).getEstado()==1){ //Alterna o estado cadeiras de 1 para -1, ou seja, seleciona para compra
                cadeiras.get(i).setEstado(-1);
            }
            else if(cadeiras.get(i).getNome().equals(nome) && cadeiras.get(i).getEstado()==-1){//Alterna o esatdo da cadeira de -1 para 1, ou seja, deseleciona.
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

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
    public static ArrayList<String> dados(String s){ //Metodo que é usado para facilitar pegar determinados daods de uma string, deste caso, a sala, horario e dia de uma determinada sessao.
        ArrayList<String> dados=new ArrayList();
        
        int contador=0;
        String sala="";
        String hr="";
        String filme="";
        
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            if(c=='|'){ //Os pipelines na String sessao são usados para separar os dados.
                contador++;
            }
            if(contador==0 && j>5){ //Condição para que o Character c seja pertecente ao nome do filme.
                filme+=s.charAt(j);//Armazenando os caracteres do filme em uma String, o mesmo acontecendo para os posteriores.
            }
            if(contador==1 && Character.isDigit(c)){//Condição para que o Character c seja pertecente a sala.
                sala+=c; 
            }
            if(contador==2 && Character.isDigit(c) ||(c==':' && Character.isDigit(s.charAt(j+1)))){//Condição para que o Character c seja pertecente ao dia.
                hr+=c;
            }
        }
        dados.add(sala);
        dados.add(hr);
        dados.add(filme);
        
        return dados;
    }
    
    @Override
    public String toString(){
        return "Horario:"+horario+",Sala:"+sala+",Dia:"+dia;
    }
    
}
  

