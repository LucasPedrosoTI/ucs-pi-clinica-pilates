/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

/**
 *
 * @author lucas
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenucadastro = new javax.swing.JMenu();
        jMenucadaluno = new javax.swing.JMenuItem();
        jMenucadprofessor = new javax.swing.JMenuItem();
        jMenucadturma = new javax.swing.JMenuItem();
        jMenucadatividade = new javax.swing.JMenuItem();
        jMenurelatorio = new javax.swing.JMenu();
        jMenusair = new javax.swing.JMenu();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/pilates_1.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/pilates_1.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 4, 1120, 700);

        jMenucadastro.setText("Cadastro");

        jMenucadaluno.setText("Aluno");
        jMenucadaluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenucadalunoActionPerformed(evt);
            }
        });
        jMenucadastro.add(jMenucadaluno);

        jMenucadprofessor.setText("Professor");
        jMenucadprofessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenucadprofessorActionPerformed(evt);
            }
        });
        jMenucadastro.add(jMenucadprofessor);

        jMenucadturma.setText("Turma");
        jMenucadturma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenucadturmaActionPerformed(evt);
            }
        });
        jMenucadastro.add(jMenucadturma);

        jMenucadatividade.setText("Atividades");
        jMenucadatividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenucadatividadeActionPerformed(evt);
            }
        });
        jMenucadastro.add(jMenucadatividade);

        jMenuBar1.add(jMenucadastro);

        jMenurelatorio.setText("Relatório");
        jMenuBar1.add(jMenurelatorio);

        jMenusair.setText("Sair");
        jMenuBar1.add(jMenusair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1135, 749));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenucadalunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenucadalunoActionPerformed
        // TODO add your handling code here:
        Aluno aluno1 = new Aluno();
        aluno1.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jMenucadalunoActionPerformed

    private void jMenucadprofessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenucadprofessorActionPerformed
        // TODO add your handling code here:
        
        Professor professor1 = new Professor();
        professor1.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jMenucadprofessorActionPerformed

    private void jMenucadturmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenucadturmaActionPerformed
        // TODO add your handling code here:
        
        Turma  turma1 = new Turma();
        turma1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenucadturmaActionPerformed

    private void jMenucadatividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenucadatividadeActionPerformed
        // TODO add your handling code here:
        
        Atividade atividade1 = new Atividade();
        atividade1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenucadatividadeActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenucadaluno;
    private javax.swing.JMenu jMenucadastro;
    private javax.swing.JMenuItem jMenucadatividade;
    private javax.swing.JMenuItem jMenucadprofessor;
    private javax.swing.JMenuItem jMenucadturma;
    private javax.swing.JMenu jMenurelatorio;
    private javax.swing.JMenu jMenusair;
    // End of variables declaration//GEN-END:variables
}
