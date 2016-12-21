package BilheteriaNacional.JFrames;


import BilheteriaNacional.DAO.IngressoDAO;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fillipe
 */
public class ValidarIngresso extends javax.swing.JFrame {

    /**
     * Creates new form ValidarIngresso
     */
    public ValidarIngresso() {
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
        jvalidaricon = new javax.swing.JLabel();
        jvalidar = new javax.swing.JButton();
        jcancelaricon = new javax.swing.JLabel();
        jcancelar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jlabeltitulo = new javax.swing.JLabel();
        jbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jcodigotitulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jcodigotitulo.setForeground(new java.awt.Color(242, 241, 239));
        jcodigotitulo.setText("Código:");
        getContentPane().add(jcodigotitulo);
        jcodigotitulo.setBounds(40, 90, 70, 50);

        jcodigo.setBackground(new java.awt.Color(37, 116, 169));
        jcodigo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jcodigo.setForeground(new java.awt.Color(242, 241, 239));
        jcodigo.setBorder(null);
        getContentPane().add(jcodigo);
        jcodigo.setBounds(110, 100, 330, 30);

        jvalidaricon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/validar.png"))); // NOI18N
        getContentPane().add(jvalidaricon);
        jvalidaricon.setBounds(340, 170, 40, 70);

        jvalidar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jvalidar.setForeground(new java.awt.Color(242, 241, 239));
        jvalidar.setText("Validar");
        jvalidar.setBorderPainted(false);
        jvalidar.setContentAreaFilled(false);
        jvalidar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jvalidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvalidarActionPerformed(evt);
            }
        });
        getContentPane().add(jvalidar);
        jvalidar.setBounds(350, 190, 110, 33);

        jcancelaricon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/remover.png"))); // NOI18N
        getContentPane().add(jcancelaricon);
        jcancelaricon.setBounds(30, 170, 40, 70);

        jcancelar.setBackground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(30, 140, 420, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(30, 90, 420, 10);

        jSeparator1.setBackground(new java.awt.Color(242, 241, 239));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(120, 50, 250, 10);

        jlabeltitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jlabeltitulo.setForeground(new java.awt.Color(242, 241, 239));
        jlabeltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabeltitulo.setText("B. N. - Validar");
        getContentPane().add(jlabeltitulo);
        jlabeltitulo.setBounds(2, 0, 480, 60);

        jbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BilheteriaNacional/Image/background 4.1.png"))); // NOI18N
        jbackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 241, 239)));
        getContentPane().add(jbackground);
        jbackground.setBounds(0, 0, 480, 240);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jvalidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvalidarActionPerformed
        // TODO add your handling code here:
        IngressoDAO Ibanco=new IngressoDAO();
        System.out.println("CT:"+jcodigo.getText());
        String cod=Ibanco.validarI(jcodigo.getText());
        System.out.println(cod);
        if(!cod.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ingresso validado com sucesso");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro na validação do ingresso");
        }
        ValidarIngresso.this.dispose();
    }//GEN-LAST:event_jvalidarActionPerformed

    private void jcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jcancelarActionPerformed

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
            java.util.logging.Logger.getLogger(ValidarIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValidarIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValidarIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValidarIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ValidarIngresso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jbackground;
    private javax.swing.JButton jcancelar;
    private javax.swing.JLabel jcancelaricon;
    private javax.swing.JTextField jcodigo;
    private javax.swing.JLabel jcodigotitulo;
    private javax.swing.JLabel jlabeltitulo;
    private javax.swing.JButton jvalidar;
    private javax.swing.JLabel jvalidaricon;
    // End of variables declaration//GEN-END:variables
}
