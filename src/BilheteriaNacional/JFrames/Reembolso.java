package BilheteriaNacional.JFrames;


import BilheteriaNacional.Beans.Sessao;
import BilheteriaNacional.Beans.Cadeira;
import BilheteriaNacional.DAO.SessaoDAO;
import BilheteriaNacional.DAO.IngressoDAO;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fillipe
 */
public class Reembolso extends javax.swing.JFrame {

    /**
     * Creates new form Reembolo
     */
    SessaoDAO Sbanco=new SessaoDAO();
    IngressoDAO Ibanco=new IngressoDAO();    
    ArrayList<Sessao> sessoes=new ArrayList();
    public void recebendo(ArrayList<Sessao> s){
        sessoes=s;
    }
    public ArrayList<Object> getSessaoCodigoCadeira(String codigo){
        Sessao sessao=new Sessao();
        ArrayList<Object> dados=new ArrayList();
        
        String nomeCad=codigo.substring(0, codigo.length()-9);
        String salaAntiga=codigo.substring(codigo.length()-9,codigo.length()-8);
        
        String horario=codigo.substring(codigo.length()-8,codigo.length()-6) + ":" + codigo.substring(codigo.length()-6,codigo.length()-4);
        
        for(int i=0;i<sessoes.size();i++){
            if(sessoes.get(i).getSala().equals(salaAntiga) && sessoes.get(i).getHorario().equals(horario)){
                sessao=sessoes.get(i);
            }
        }
        char ultimoDigitodaCad;
        if(nomeCad.length()>1){
               ultimoDigitodaCad=nomeCad.charAt(1);
           }else{
               ultimoDigitodaCad=nomeCad.charAt(0);
           }
        Cadeira c=new Cadeira();
        String cads=Sbanco.verC(salaAntiga, horario);
        int tamanho=cads.length();
        int indexfim=0;
        for(int i=0;i<cads.length();i++){

            if(cads.charAt(i)==ultimoDigitodaCad && (cads.charAt(i+1)==',' || cads.charAt(i+1)==',')){
                indexfim=i;
            }
        }
        if(nomeCad.length()>1){
            cads=cads.substring(0, indexfim-4)+cads.substring(indexfim+3, tamanho);
        }else{
            cads=cads.substring(0, indexfim-3)+cads.substring(indexfim+3, tamanho);
        }
        System.out.println("Nome Cadeira:"+nomeCad);
        System.out.println("Sessao:"+sessao);
        dados.add(sessao);
        dados.add(cads);
        return dados;
    }
    public Reembolso() {
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

        jcodigotitulo = new javax.swing.JLabel();
        jcodigo = new javax.swing.JTextField();
        jcancelaricon = new javax.swing.JLabel();
        jcancelar = new javax.swing.JButton();
        jreembolsaricon = new javax.swing.JLabel();
        jreembolsar = new javax.swing.JButton();
        jLabeltitulo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 240));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jcodigotitulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jcodigotitulo.setForeground(new java.awt.Color(242, 241, 239));
        jcodigotitulo.setText("Código:");
        getContentPane().add(jcodigotitulo);
        jcodigotitulo.setBounds(40, 90, 62, 50);

        jcodigo.setBackground(new java.awt.Color(37, 116, 169));
        jcodigo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jcodigo.setForeground(new java.awt.Color(242, 241, 239));
        jcodigo.setBorder(null);
        getContentPane().add(jcodigo);
        jcodigo.setBounds(110, 100, 330, 30);

        jcancelaricon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/remover.png"))); // NOI18N
        getContentPane().add(jcancelaricon);
        jcancelaricon.setBounds(30, 170, 40, 70);

        jcancelar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jcancelar.setForeground(new java.awt.Color(242, 241, 239));
        jcancelar.setText("Cancelar");
        jcancelar.setBorderPainted(false);
        jcancelar.setContentAreaFilled(false);
        jcancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jcancelar);
        jcancelar.setBounds(50, 190, 105, 33);

        jreembolsaricon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/validar.png"))); // NOI18N
        getContentPane().add(jreembolsaricon);
        jreembolsaricon.setBounds(290, 170, 40, 70);

        jreembolsar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jreembolsar.setForeground(new java.awt.Color(242, 241, 239));
        jreembolsar.setText("Reembolsar");
        jreembolsar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 241, 239)));
        jreembolsar.setBorderPainted(false);
        jreembolsar.setContentAreaFilled(false);
        jreembolsar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jreembolsar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jreembolsarActionPerformed(evt);
            }
        });
        getContentPane().add(jreembolsar);
        jreembolsar.setBounds(330, 190, 99, 27);

        jLabeltitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabeltitulo.setForeground(new java.awt.Color(242, 241, 239));
        jLabeltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeltitulo.setText("B. N. - Reembolso");
        getContentPane().add(jLabeltitulo);
        jLabeltitulo.setBounds(0, 0, 480, 60);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(30, 90, 420, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(30, 140, 420, 10);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(80, 50, 320, 20);

        jbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/background 4.1.png"))); // NOI18N
        jbackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 241, 239)));
        getContentPane().add(jbackground);
        jbackground.setBounds(0, 0, 480, 240);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jreembolsarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jreembolsarActionPerformed
        // TODO add your handling code here:
        String cod=jcodigo.getText();
        Sessao sessao=(Sessao)getSessaoCodigoCadeira(cod).get(0);
        String cad=getSessaoCodigoCadeira(cod).get(1).toString();
        Ibanco.deleteI(cod);
        Sbanco.atualizarCadeiras(cad, sessao.getSala(), sessao.getHorario());
        dispose();
    }//GEN-LAST:event_jreembolsarActionPerformed

    private void jcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jcancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Reembolso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reembolso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reembolso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reembolso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Reembolso r = new Reembolso();
                r.setVisible(true);
                r.setSize(480,240);
                r.setLocationRelativeTo(null);
                r.setResizable(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabeltitulo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jbackground;
    private javax.swing.JButton jcancelar;
    private javax.swing.JLabel jcancelaricon;
    private javax.swing.JTextField jcodigo;
    private javax.swing.JLabel jcodigotitulo;
    private javax.swing.JButton jreembolsar;
    private javax.swing.JLabel jreembolsaricon;
    // End of variables declaration//GEN-END:variables
}
