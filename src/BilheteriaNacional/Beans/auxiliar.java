package BilheteriaNacional.Beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lulu
 */
public class auxiliar {
    public static void main(String[]args){
        String nome="if(cadeirasSessao.contains(\"cad3\")){\n" +
"            cad3.setIcon(new javax.swing.ImageIcon(getClass().getResource(\"/ocupada.png\")));   \n" +
"            s.getCadeiras().get(2).setEstado(0);\n" +
"        }\n" +
"        else{\n" +
"            cad3.setIcon(new javax.swing.ImageIcon(getClass().getResource(\"/livre.png\")));   \n" +
"            s.getCadeiras().get(2).setEstado(1);\n" +
"        }";
        for(int i=4;i<27;i++){
            String nome2="";
            for(int aux=0;aux<nome.length();aux++){
                char c=nome.charAt(aux);
                if( (!Character.isDigit(c)) || c=='0' || c=='1'){
       
                    nome2+=c;
                }
                else if(Character.isDigit(c) && c!='1' && c!='0' ){
                    nome2+=i;
                }
                
            }
            System.out.print(nome2);
            
        }
    }
}
