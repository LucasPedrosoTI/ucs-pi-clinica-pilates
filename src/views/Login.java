/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author lucas
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        camposenha = new javax.swing.JPasswordField();
        LabelUsuario = new javax.swing.JLabel();
        labelsenha = new javax.swing.JLabel();
        botaosair = new javax.swing.JButton();
        botaoentrar = new javax.swing.JButton();
        campousuario = new javax.swing.JTextField();
        labelbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(241, 239, 232));
        jPanel1.setLayout(null);
        jPanel1.add(camposenha);
        camposenha.setBounds(30, 180, 168, 43);

        LabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelUsuario.setText("Usuário:");
        jPanel1.add(LabelUsuario);
        LabelUsuario.setBounds(80, 20, 65, 43);

        labelsenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelsenha.setText("Senha:");
        jPanel1.add(labelsenha);
        labelsenha.setBounds(90, 130, 54, 43);

        botaosair.setText("Sair");
        botaosair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaosairActionPerformed(evt);
            }
        });
        jPanel1.add(botaosair);
        botaosair.setBounds(140, 240, 80, 69);

        botaoentrar.setText("Entrar");
        botaoentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoentrarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoentrar);
        botaoentrar.setBounds(10, 240, 90, 69);
        jPanel1.add(campousuario);
        campousuario.setBounds(30, 80, 168, 43);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(530, 170, 230, 320);

        labelbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/pilates_1.jpg"))); // NOI18N
        getContentPane().add(labelbackground);
        labelbackground.setBounds(0, 0, 1270, 690);

        setSize(new java.awt.Dimension(1280, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaosairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaosairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaosairActionPerformed

    private void botaoentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoentrarActionPerformed
        
        Menu tela = new Menu();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoentrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JButton botaoentrar;
    private javax.swing.JButton botaosair;
    private javax.swing.JPasswordField camposenha;
    private javax.swing.JTextField campousuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelbackground;
    private javax.swing.JLabel labelsenha;
    // End of variables declaration//GEN-END:variables
}