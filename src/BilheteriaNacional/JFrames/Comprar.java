package BilheteriaNacional.JFrames;

import BilheteriaNacional.Beans.Sessao;
import BilheteriaNacional.Beans.Ingresso;
import BilheteriaNacional.DAO.SessaoDAO;
import BilheteriaNacional.DAO.IngressoDAO;

import java.util.ArrayList;
import java.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JButton;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
//************************ATUALIZADO**********************
public class Comprar extends javax.swing.JFrame {
    IngressoDAO Ibanco=new IngressoDAO();
    SessaoDAO Sbanco=new SessaoDAO();
    
    String cadeirasSessao="";
    
    ArrayList<String> cads;
    ArrayList<Sessao> sessoes=new ArrayList();
    
    String sessao="";
    String sala="";
    String horario="";
    Sessao s;
    
    public void atualizarComprar(ArrayList<Sessao> sessoes,String sessao,String horario,String sala,Sessao s){
        this.sessoes=sessoes;
        this.sessao=sessao;
        this.sala=sala;
        this.horario=horario;
        this.s=s;
        
        jsessao.setText(sessao);
        
        cadeirasSessao=Sbanco.verC(sala,horario);
        
        atualizandoCadeiras();
    }
    public JButton getConfirmar(){
        return jconfirma;
    }
    public void atualizandoCadeiras(){
        
        if(cadeirasSessao.contains("cad1,") || cadeirasSessao.contains("cad1]")){
            cad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(0).setEstado(0);
        }
        else{
            cad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(0).setEstado(1);
        }
      
        if(cadeirasSessao.contains("cad2,") ||cadeirasSessao.contains("cad2]")){
            cad2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(1).setEstado(0);
        }
        else{
            cad2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(1).setEstado(1);
        }
        if(cadeirasSessao.contains("cad3")){
            cad3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(2).setEstado(0);
        }
        else{
            cad3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(2).setEstado(1);
        }
         if(cadeirasSessao.contains("cad4")){
            cad4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(3).setEstado(0);
        }
        else{
            cad4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(3).setEstado(1);
        }if(cadeirasSessao.contains("cad5")){
            cad5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(4).setEstado(0);
        }
        else{
            cad5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(4).setEstado(1);
        }if(cadeirasSessao.contains("cad6")){
            cad6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(5).setEstado(0);
        }
        else{
            cad6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(5).setEstado(1);
        }if(cadeirasSessao.contains("cad7")){
            cad7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(6).setEstado(0);
        }
        else{
            cad7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(6).setEstado(1);
        }if(cadeirasSessao.contains("cad8")){
            cad8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(7).setEstado(0);
        }
        else{
            cad8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(7).setEstado(1);
        }if(cadeirasSessao.contains("cad9")){
            cad9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(8).setEstado(0);
        }
        else{
            cad9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(8).setEstado(1);
        }if(cadeirasSessao.contains("cad10")){
            cad10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(9).setEstado(0);
        }
        else{
            cad10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(9).setEstado(1);
        }if(cadeirasSessao.contains("cad11")){
            cad11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(10).setEstado(0);
        }
        else{
            cad11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(10).setEstado(1);
        }if(cadeirasSessao.contains("cad12")){
            cad12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(11).setEstado(0);
        }
        else{
            cad12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(11).setEstado(1);
        }if(cadeirasSessao.contains("cad13")){
            cad13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(12).setEstado(0);
        }
        else{
            cad13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(12).setEstado(1);
        }if(cadeirasSessao.contains("cad14")){
            cad14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(13).setEstado(0);
        }
        else{
            cad14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(13).setEstado(1);
        }if(cadeirasSessao.contains("cad15")){
            cad15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(14).setEstado(0);
        }
        else{
            cad15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(14).setEstado(1);
        }if(cadeirasSessao.contains("cad16")){
            cad16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(15).setEstado(0);
        }
        else{
            cad16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(15).setEstado(1);
        }if(cadeirasSessao.contains("cad17")){
            cad17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(16).setEstado(0);
        }
        else{
            cad17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(16).setEstado(1);
        }if(cadeirasSessao.contains("cad18")){
            cad18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(17).setEstado(0);
        }
        else{
            cad18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(17).setEstado(1);
        }if(cadeirasSessao.contains("cad19")){
            cad19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(18).setEstado(0);
        }
        else{
            cad19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(18).setEstado(1);
        }if(cadeirasSessao.contains("cad20")){
            cad20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(19).setEstado(0);
        }
        else{
            cad20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(19).setEstado(1);
        }if(cadeirasSessao.contains("cad21")){
            cad21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(20).setEstado(0);
        }
        else{
            cad21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(20).setEstado(1);
        }if(cadeirasSessao.contains("cad22")){
            cad22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(21).setEstado(0);
        }
        else{
            cad22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(21).setEstado(1);
        }if(cadeirasSessao.contains("cad23")){
            cad23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(22).setEstado(0);
        }
        else{
            cad23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(22).setEstado(1);
        }if(cadeirasSessao.contains("cad24")){
            cad24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(23).setEstado(0);
        }
        else{
            cad24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(23).setEstado(1);
        }if(cadeirasSessao.contains("cad25")){
            cad25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(24).setEstado(0);
        }
        else{
            cad25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(24).setEstado(1);
        }if(cadeirasSessao.contains("cad26")){
            cad26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/ocupada.png")));   
            s.getCadeiras().get(25).setEstado(0);
        }
        else{
            cad26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));   
            s.getCadeiras().get(25).setEstado(1);
        }
    
    }
    public Comprar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelbackground = new javax.swing.JLabel();
        jlabeltitulo = new javax.swing.JLabel();
        jsessaotitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cad1 = new javax.swing.JButton();
        cad4 = new javax.swing.JButton();
        cad2 = new javax.swing.JButton();
        cad6 = new javax.swing.JButton();
        cad7 = new javax.swing.JButton();
        cad5 = new javax.swing.JButton();
        cad8 = new javax.swing.JButton();
        cad9 = new javax.swing.JButton();
        cad11 = new javax.swing.JButton();
        cad12 = new javax.swing.JButton();
        cad14 = new javax.swing.JButton();
        cad15 = new javax.swing.JButton();
        cad10 = new javax.swing.JButton();
        cad13 = new javax.swing.JButton();
        cad16 = new javax.swing.JButton();
        cad17 = new javax.swing.JButton();
        cad18 = new javax.swing.JButton();
        cad3 = new javax.swing.JButton();
        cad19 = new javax.swing.JButton();
        cad20 = new javax.swing.JButton();
        cad21 = new javax.swing.JButton();
        cad22 = new javax.swing.JButton();
        cad23 = new javax.swing.JButton();
        cad24 = new javax.swing.JButton();
        cad25 = new javax.swing.JButton();
        cad26 = new javax.swing.JButton();
        jconfirmaicon = new javax.swing.JLabel();
        jconfirma = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jcancelaicon = new javax.swing.JLabel();
        jcancela = new javax.swing.JButton();
        jsessao = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 480));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jlabeltitulo.setFont(new java.awt.Font("Dialog", 1, 45)); // NOI18N
        jlabeltitulo.setForeground(new java.awt.Color(242, 241, 239));
        jlabeltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabeltitulo.setText("B. N. - Comprar");
        getContentPane().add(jlabeltitulo);
        jlabeltitulo.setBounds(0, 10, 640, 60);

        jsessaotitulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jsessaotitulo.setForeground(new java.awt.Color(242, 241, 239));
        jsessaotitulo.setText("Sessão:");
        getContentPane().add(jsessaotitulo);
        jsessaotitulo.setBounds(120, 150, 65, 30);

        jSeparator1.setBackground(new java.awt.Color(242, 241, 239));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(112, 190, 420, 10);

        cad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad1.setContentAreaFilled(false);
        cad1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad1.setFocusPainted(false);
        cad1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                cad1AncestorRemoved(evt);
            }
        });
        cad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad1ActionPerformed(evt);
            }
        });
        getContentPane().add(cad1);
        cad1.setBounds(180, 200, 40, 40);

        cad4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad4.setContentAreaFilled(false);
        cad4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad4.setFocusPainted(false);
        cad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad4ActionPerformed(evt);
            }
        });
        getContentPane().add(cad4);
        cad4.setBounds(260, 200, 40, 40);

        cad2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad2.setContentAreaFilled(false);
        cad2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad2.setFocusPainted(false);
        cad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad2ActionPerformed(evt);
            }
        });
        getContentPane().add(cad2);
        cad2.setBounds(220, 200, 40, 40);

        cad6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad6.setContentAreaFilled(false);
        cad6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad6.setFocusPainted(false);
        cad6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad6ActionPerformed(evt);
            }
        });
        getContentPane().add(cad6);
        cad6.setBounds(380, 200, 40, 40);

        cad7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad7.setContentAreaFilled(false);
        cad7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad7.setFocusPainted(false);
        cad7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad7ActionPerformed(evt);
            }
        });
        getContentPane().add(cad7);
        cad7.setBounds(340, 200, 40, 40);

        cad5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad5.setContentAreaFilled(false);
        cad5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad5.setFocusPainted(false);
        cad5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad5ActionPerformed(evt);
            }
        });
        getContentPane().add(cad5);
        cad5.setBounds(300, 200, 40, 40);

        cad8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad8.setContentAreaFilled(false);
        cad8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad8.setFocusPainted(false);
        cad8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad8ActionPerformed(evt);
            }
        });
        getContentPane().add(cad8);
        cad8.setBounds(420, 200, 40, 40);

        cad9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad9.setContentAreaFilled(false);
        cad9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad9.setFocusPainted(false);
        cad9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad9ActionPerformed(evt);
            }
        });
        getContentPane().add(cad9);
        cad9.setBounds(260, 240, 40, 40);

        cad11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad11.setContentAreaFilled(false);
        cad11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad11.setFocusPainted(false);
        cad11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad11ActionPerformed(evt);
            }
        });
        getContentPane().add(cad11);
        cad11.setBounds(340, 240, 40, 40);

        cad12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad12.setContentAreaFilled(false);
        cad12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad12.setFocusPainted(false);
        cad12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad12ActionPerformed(evt);
            }
        });
        getContentPane().add(cad12);
        cad12.setBounds(300, 240, 40, 40);

        cad14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad14.setContentAreaFilled(false);
        cad14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad14.setFocusPainted(false);
        cad14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad14ActionPerformed(evt);
            }
        });
        getContentPane().add(cad14);
        cad14.setBounds(420, 240, 40, 40);

        cad15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad15.setContentAreaFilled(false);
        cad15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad15.setFocusPainted(false);
        cad15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad15ActionPerformed(evt);
            }
        });
        getContentPane().add(cad15);
        cad15.setBounds(380, 240, 40, 40);

        cad10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad10.setContentAreaFilled(false);
        cad10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad10.setFocusPainted(false);
        cad10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad10ActionPerformed(evt);
            }
        });
        getContentPane().add(cad10);
        cad10.setBounds(260, 280, 40, 40);

        cad13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad13.setContentAreaFilled(false);
        cad13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad13.setFocusPainted(false);
        cad13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad13ActionPerformed(evt);
            }
        });
        getContentPane().add(cad13);
        cad13.setBounds(340, 280, 40, 40);

        cad16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad16.setContentAreaFilled(false);
        cad16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad16.setFocusPainted(false);
        cad16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad16ActionPerformed(evt);
            }
        });
        getContentPane().add(cad16);
        cad16.setBounds(300, 280, 40, 40);

        cad17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad17.setContentAreaFilled(false);
        cad17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad17.setFocusPainted(false);
        cad17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad17ActionPerformed(evt);
            }
        });
        getContentPane().add(cad17);
        cad17.setBounds(420, 280, 40, 40);

        cad18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad18.setContentAreaFilled(false);
        cad18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad18.setFocusPainted(false);
        cad18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad18ActionPerformed(evt);
            }
        });
        getContentPane().add(cad18);
        cad18.setBounds(380, 280, 40, 40);

        cad3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad3.setContentAreaFilled(false);
        cad3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad3.setFocusPainted(false);
        cad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad3ActionPerformed(evt);
            }
        });
        getContentPane().add(cad3);
        cad3.setBounds(180, 320, 40, 40);

        cad19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad19.setContentAreaFilled(false);
        cad19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad19.setFocusPainted(false);
        cad19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad19ActionPerformed(evt);
            }
        });
        getContentPane().add(cad19);
        cad19.setBounds(260, 320, 40, 40);

        cad20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad20.setContentAreaFilled(false);
        cad20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad20.setFocusPainted(false);
        cad20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad20ActionPerformed(evt);
            }
        });
        getContentPane().add(cad20);
        cad20.setBounds(220, 320, 40, 40);

        cad21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad21.setContentAreaFilled(false);
        cad21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad21.setFocusPainted(false);
        cad21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad21ActionPerformed(evt);
            }
        });
        getContentPane().add(cad21);
        cad21.setBounds(380, 320, 40, 40);

        cad22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad22.setContentAreaFilled(false);
        cad22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad22.setFocusPainted(false);
        cad22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad22ActionPerformed(evt);
            }
        });
        getContentPane().add(cad22);
        cad22.setBounds(340, 320, 40, 40);

        cad23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad23.setContentAreaFilled(false);
        cad23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad23.setFocusPainted(false);
        cad23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad23ActionPerformed(evt);
            }
        });
        getContentPane().add(cad23);
        cad23.setBounds(300, 320, 40, 40);

        cad24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad24.setContentAreaFilled(false);
        cad24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad24.setFocusPainted(false);
        cad24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad24ActionPerformed(evt);
            }
        });
        getContentPane().add(cad24);
        cad24.setBounds(420, 320, 40, 40);

        cad25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad25.setContentAreaFilled(false);
        cad25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad25.setFocusPainted(false);
        cad25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad25ActionPerformed(evt);
            }
        });
        getContentPane().add(cad25);
        cad25.setBounds(220, 240, 40, 40);

        cad26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png"))); // NOI18N
        cad26.setContentAreaFilled(false);
        cad26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad26.setFocusPainted(false);
        cad26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad26ActionPerformed(evt);
            }
        });
        getContentPane().add(cad26);
        cad26.setBounds(220, 280, 40, 40);

        jconfirmaicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/validar.png"))); // NOI18N
        getContentPane().add(jconfirmaicon);
        jconfirmaicon.setBounds(490, 410, 40, 70);

        jconfirma.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jconfirma.setForeground(new java.awt.Color(242, 241, 239));
        jconfirma.setText("Confirmar");
        jconfirma.setBorderPainted(false);
        jconfirma.setContentAreaFilled(false);
        jconfirma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jconfirma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jconfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jconfirmaActionPerformed(evt);
            }
        });
        getContentPane().add(jconfirma);
        jconfirma.setBounds(510, 430, 110, 33);

        jSeparator2.setBackground(new java.awt.Color(242, 241, 239));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(110, 370, 420, 10);

        jcancelaicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/remover.png"))); // NOI18N
        getContentPane().add(jcancelaicon);
        jcancelaicon.setBounds(20, 410, 40, 70);

        jcancela.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jcancela.setForeground(new java.awt.Color(242, 241, 239));
        jcancela.setText("Cancelar");
        jcancela.setBorderPainted(false);
        jcancela.setContentAreaFilled(false);
        jcancela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcancela.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jcancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcancelaActionPerformed(evt);
            }
        });
        getContentPane().add(jcancela);
        jcancela.setBounds(40, 430, 105, 33);

        jsessao.setBackground(new java.awt.Color(204, 204, 204));
        jsessao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jsessao.setForeground(new java.awt.Color(242, 241, 239));
        getContentPane().add(jsessao);
        jsessao.setBounds(190, 150, 340, 30);

        jSeparator3.setBackground(new java.awt.Color(242, 241, 239));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(150, 70, 350, 10);

        jbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/background 4.png"))); // NOI18N
        jbackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 241, 239)));
        getContentPane().add(jbackground);
        jbackground.setBounds(0, 0, 640, 480);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad1ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(0).getEstado();
      
        if(aux==1){
            cad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad1");
        }
        else if(aux==-1){
            cad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad1");
        }
    }//GEN-LAST:event_cad1ActionPerformed

    private void cad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad4ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(3).getEstado();
        if(aux==1){
            cad4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad4");
        }
        else if(aux==-1){
            cad4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad4");
        }
    }//GEN-LAST:event_cad4ActionPerformed

    private void cad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad2ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(1).getEstado();
        if(aux==1){
            cad2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad2");
        }
        else if(aux==-1){
            cad2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad2");
        }
    }//GEN-LAST:event_cad2ActionPerformed

    private void cad6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad6ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(5).getEstado();
        if(aux==1){
            cad6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad6");
        }
        else if(aux==-1){
            cad6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad6");
        }
    }//GEN-LAST:event_cad6ActionPerformed

    private void cad7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad7ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(6).getEstado();
        if(aux==1){
            cad7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad7");
        }
        else if(aux==-1){
            cad7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad7");
        }
    }//GEN-LAST:event_cad7ActionPerformed

    private void cad5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad5ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(4).getEstado();
        if(aux==1){
            cad5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad5");
        }
        else if(aux==-1){
            cad5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad5");
        }
    }//GEN-LAST:event_cad5ActionPerformed

    private void cad8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad8ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(7).getEstado();
        if(aux==1){
            cad8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad8");
        }
        else if(aux==-1){
            cad8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad8");
        }
    }//GEN-LAST:event_cad8ActionPerformed

    private void cad9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad9ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(8).getEstado();
        if(aux==1){
            cad9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad9");
        }
        else if(aux==-1){
            cad9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad9");
        }
    }//GEN-LAST:event_cad9ActionPerformed

    private void cad11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad11ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(10).getEstado();
        if(aux==1){
            cad11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad11");
        }
        else if(aux==-1){
            cad11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad11");
        }
    }//GEN-LAST:event_cad11ActionPerformed

    private void cad12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad12ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(11).getEstado();
        if(aux==1){
            cad12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad12");
        }
        else if(aux==-1){
            cad12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad12");
        }
    }//GEN-LAST:event_cad12ActionPerformed

    private void cad14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad14ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(13).getEstado();
        if(aux==1){
            cad14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad14");
        }
        else if(aux==-1){
            cad14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad14");
        }
    }//GEN-LAST:event_cad14ActionPerformed

    private void cad15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad15ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(14).getEstado();
        if(aux==1){
            cad15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad15");
        }
        else if(aux==-1){
            cad15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad15");
        }
    }//GEN-LAST:event_cad15ActionPerformed

    private void cad10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad10ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(9).getEstado();
        if(aux==1){
            cad10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad10");
        }
        else if(aux==-1){
            cad10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad10");
        }
    }//GEN-LAST:event_cad10ActionPerformed

    private void cad13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad13ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(12).getEstado();
        if(aux==1){
            cad13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad13");
        }
        else if(aux==-1){
            cad13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad13");
        }
    }//GEN-LAST:event_cad13ActionPerformed

    private void cad16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad16ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(15).getEstado();
        if(aux==1){
            cad16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad16");
        }
        else if(aux==-1){
            cad16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad16");
        }
    }//GEN-LAST:event_cad16ActionPerformed

    private void cad17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad17ActionPerformed
        // TODO add your handling code here:
         int aux=s.getCadeiras().get(16).getEstado();
        if(aux==1){
            cad17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad17");
        }
        else if(aux==-1){
            cad17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad17");
        }
    }//GEN-LAST:event_cad17ActionPerformed

    private void cad18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad18ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(17).getEstado();
        if(aux==1){
            cad18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad18");
        }
        else if(aux==-1){
            cad18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad18");
        }
    }//GEN-LAST:event_cad18ActionPerformed

    private void cad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad3ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(2).getEstado();
        if(aux==1){
            cad3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad3");
        }
        else if(aux==-1){
            cad3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad3");
        }
    }//GEN-LAST:event_cad3ActionPerformed

    private void cad19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad19ActionPerformed
        // TODO add your handling code here:
       int aux=s.getCadeiras().get(18).getEstado();
        if(aux==1){
            cad19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad19");
        }
        else if(aux==-1){
            cad19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad19");
        }
    }//GEN-LAST:event_cad19ActionPerformed

    private void cad20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad20ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(19).getEstado();
        if(aux==1){
            cad20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad20");
        }
        else if(aux==-1){
            cad20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad20");
        }
    }//GEN-LAST:event_cad20ActionPerformed

    private void cad21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad21ActionPerformed
        // TODO add your handling code here:
         int aux=s.getCadeiras().get(20).getEstado();
        if(aux==1){
            cad21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad21");
        }
        else if(aux==-1){
            cad21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad21");
        }
    }//GEN-LAST:event_cad21ActionPerformed

    private void cad22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad22ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(21).getEstado();
        if(aux==1){
            cad22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad22");
        }
        else if(aux==-1){
            cad22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad22");
        }
    }//GEN-LAST:event_cad22ActionPerformed

    private void cad23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad23ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(22).getEstado();
        if(aux==1){
            cad23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad23");
        }
        else if(aux==-1){
            cad23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad23");
        }
    }//GEN-LAST:event_cad23ActionPerformed

    private void cad24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad24ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(23).getEstado();
        if(aux==1){
            cad24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad24");
        }
        else if(aux==-1){
            cad24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad24");
        }
    }//GEN-LAST:event_cad24ActionPerformed

    private void cad25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad25ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(24).getEstado();
        if(aux==1){
            cad25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad25");
        }
        else if(aux==-1){
            cad25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad25");
        }
    }//GEN-LAST:event_cad25ActionPerformed

    private void cad26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad26ActionPerformed
        // TODO add your handling code here:
        int aux=s.getCadeiras().get(25).getEstado();
        if(aux==1){
            cad26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/selecionada.png")));
            s.selecionar("cad26");
        }
        else if(aux==-1){
            cad26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/livre.png")));
            s.selecionar("cad26");
        }
    }//GEN-LAST:event_cad26ActionPerformed

    private void jconfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jconfirmaActionPerformed
        // TODO add your handling code here:
        String filme=Sessao.dados(sessao).get(2);
        
        int index_sala=Integer.parseInt(sala)-1;
        
        Random random=new Random(); 
        
        for(int i=0;i<s.getCadeiras().size();i++){
            if(s.getCadeiras().get(i).getEstado()==-1){
                String cad,codigo;
                codigo=String.valueOf(i+1)+sala+horario.substring(0, 2)+horario.substring(3, 5)+String.valueOf(random.nextInt(10))+String.valueOf(random.nextInt(10))+String.valueOf(random.nextInt(10))+String.valueOf(random.nextInt(10));
                cad=s.getCadeiras().get(i).getNome();
                s.getCadeiras().get(i).setEstado(0);
                Ingresso ingresso=new Ingresso(codigo,horario,cad,sala,filme,10);
                Ibanco.adicionar(ingresso);
            }
        }
        
        cads=Ibanco.cadeirasOcupadas(sala,horario);
        Sbanco.atualizarCadeiras(cads.toString(), sala, horario);
        cadeirasSessao=Sbanco.verC(sala,horario);
        
        atualizandoCadeiras();
        
        dispose();  
        
    }//GEN-LAST:event_jconfirmaActionPerformed

    private void cad1AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cad1AncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_cad1AncestorRemoved

    private void jcancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcancelaActionPerformed
        // TODO add your handling code here:
        Comprar.this.dispose(); 
    }//GEN-LAST:event_jcancelaActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Comprar comprar = new Comprar();
                comprar.setVisible(true);
                comprar.setSize(640,480);
                comprar.setResizable(false);
                comprar.setLocationRelativeTo(null);
                atualizandoCadeiras();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cad1;
    private javax.swing.JButton cad10;
    private javax.swing.JButton cad11;
    private javax.swing.JButton cad12;
    private javax.swing.JButton cad13;
    private javax.swing.JButton cad14;
    private javax.swing.JButton cad15;
    private javax.swing.JButton cad16;
    private javax.swing.JButton cad17;
    private javax.swing.JButton cad18;
    private javax.swing.JButton cad19;
    private javax.swing.JButton cad2;
    private javax.swing.JButton cad20;
    private javax.swing.JButton cad21;
    private javax.swing.JButton cad22;
    private javax.swing.JButton cad23;
    private javax.swing.JButton cad24;
    private javax.swing.JButton cad25;
    private javax.swing.JButton cad26;
    private javax.swing.JButton cad3;
    private javax.swing.JButton cad4;
    private javax.swing.JButton cad5;
    private javax.swing.JButton cad6;
    private javax.swing.JButton cad7;
    private javax.swing.JButton cad8;
    private javax.swing.JButton cad9;
    private javax.swing.JLabel jLabelbackground;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jbackground;
    private javax.swing.JButton jcancela;
    private javax.swing.JLabel jcancelaicon;
    private javax.swing.JButton jconfirma;
    private javax.swing.JLabel jconfirmaicon;
    private javax.swing.JLabel jlabeltitulo;
    private javax.swing.JLabel jsessao;
    private javax.swing.JLabel jsessaotitulo;
    // End of variables declaration//GEN-END:variables
}
