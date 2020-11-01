package views;

import javax.naming.directory.InvalidAttributeValueException;

import model.*;
import model.BD;

import utils.Validator;

public class Login extends javax.swing.JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private boolean gerarBanco = true;

    /**
     * Creates new form Login
     * 
     * @throws InvalidAttributeValueException
     */
    public Login() throws InvalidAttributeValueException {
        if (gerarBanco) {
            BD.generateBd();
            gerarBanco = false;
        }

        initComponents();

        // for (Usuario usuario : BD.usuarios) {
        // System.out.println(">>>>>> " + usuario.getUsername());
        // System.out.println(">>>>>> " + usuario.getSenha());
        // }

        campousuario.setText("gestor");
        camposenha.setText("gestor");

        erro.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        camposenha = new javax.swing.JPasswordField();
        LabelUsuario = new javax.swing.JLabel();
        labelsenha = new javax.swing.JLabel();
        botaosair = new javax.swing.JButton();
        botaoentrar = new javax.swing.JButton();
        campousuario = new javax.swing.JTextField();
        erro = new javax.swing.JTextField();
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
                try {

                    botaoentrarActionPerformed(evt);

                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }

            }
        });
        jPanel1.add(botaoentrar);
        botaoentrar.setBounds(10, 240, 90, 69);
        jPanel1.add(campousuario);
        campousuario.setBounds(30, 80, 168, 43);

        erro.setBackground(new java.awt.Color(255, 255, 255));
        erro.setForeground(new java.awt.Color(255, 0, 0));
        erro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        erro.setText("Usuário ou Senha Inválidos");
        erro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erroActionPerformed(evt);
            }
        });
        jPanel1.add(erro);
        erro.setBounds(11, 320, 210, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(530, 170, 230, 350);

        labelbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/pilates_1.jpg"))); // NOI18N
        getContentPane().add(labelbackground);
        labelbackground.setBounds(0, 0, 1270, 690);

        setSize(new java.awt.Dimension(1280, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void botaosairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaosairActionPerformed
        this.dispose();
    }

    private void botaoentrarActionPerformed(java.awt.event.ActionEvent evt) throws CloneNotSupportedException {// GEN-FIRST:event_botaoentrarActionPerformed
        String username = this.campousuario.getText();
        String password = String.copyValueOf(this.camposenha.getPassword());

        if (Validator.eUsuarioValido(BD.getUsuarios(), username, password)) {
            Usuario usuarioLogado = BD.getUsuarioByUsername(username);
            BD.setUsuarioLogado(usuarioLogado);

            Menu tela = new Menu();
            tela.setVisible(true);
            dispose();

        } else {
            erro.setVisible(true);
        }
    }// GEN-LAST:event_botaoentrarActionPerformed

    private void erroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_erroActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_erroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
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
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (InvalidAttributeValueException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    // Variables declaration - do not modify
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JButton botaoentrar;
    private javax.swing.JButton botaosair;
    private javax.swing.JPasswordField camposenha;
    private javax.swing.JTextField campousuario;
    private javax.swing.JTextField erro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelbackground;
    private javax.swing.JLabel labelsenha;
}
