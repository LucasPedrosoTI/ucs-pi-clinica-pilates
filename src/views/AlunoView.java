/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.directory.InvalidAttributeValueException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.Acesso;
import model.BD;
import model.Aluno;
import model.Professor;
import model.Telefone;
import model.Usuario;
import utils.Utils;
import utils.Validator;

import static javax.swing.JOptionPane.showMessageDialog;
import static utils.Utils.tiverCamposNaoPreenchidos;
import static utils.Utils.toggleButton;

/**
 *
 * @author lucas
 */
public class AlunoView extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    private List<JTextField> campos = new ArrayList<>();
    private List<JButton> botoes = new ArrayList<>();
    DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale("pt", "BR"));

    /**
     * Creates new form NewJFrame
     */
    public AlunoView() throws CloneNotSupportedException {
        initComponents();
        jTextFieldDataMatricula.setText(df.format(new Date()));

        campos.add(jTextFieldAltura);
        campos.add(jTextFieldDataNasc);
        campos.add(jTextFieldEndereco);
        campos.add(jTextFieldIMC);
        campos.add(jTextFieldNome);
        campos.add(jTextFieldPeso);
        campos.add(jTextFieldTelefone);

        botoes.add(jButtonALTERAR);
        botoes.add(jButtonPesquisar);
        botoes.add(jButtonSALVAR);

        Usuario usuarioLogado = Validator.configurarAcesso(BD.getUsuarioLogado());

        if (!Validator.eGestor(usuarioLogado)) {
            Utils.desabilitarCampos(campos);
            Utils.desabilitarBotoes(botoes);
        }

        if (usuarioLogado instanceof Professor) {
            jTextFieldPeso.setEditable(true);
            jTextFieldPeso.setEnabled(true);
            toggleButton(jButtonALTERAR);
            toggleButton(jButtonPesquisar);
        }

        if (usuarioLogado instanceof Aluno) {
            aluno = (Aluno) usuarioLogado.clone();

            jTextFieldCODIGO.setText(aluno.getCodigoMatricula().toString());
            jTextFieldNome.setText(usuarioLogado.getUsername());
            jTextFieldDataNasc.setText(aluno.getDataNascimento());
            jTextFieldEndereco.setText(aluno.getEndereco());
            jTextFieldDataMatricula.setText(aluno.getDataMatricula());
            jTextFieldTelefone.setText(aluno.getTelefone().getNumero());
            jTextFieldPeso.setText(aluno.getPeso());
            jTextFieldAltura.setText(aluno.getAltura());
            jTextFieldIMC.setText(aluno.getImc().toString());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelFORMULARIO = new javax.swing.JPanel();
        jLabelDataNasc = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelPESO = new javax.swing.JLabel();
        jLabelIMC = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldIMC = new javax.swing.JTextField();
        jTextFieldDataNasc = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldCODIGO = new javax.swing.JTextField();
        jLabelDATACADASTRO = new javax.swing.JLabel();
        jLabelCODIGO = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldDataMatricula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLISTAGEM = new javax.swing.JTable();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldPeso = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelAltura = new javax.swing.JLabel();
        jTextFieldAltura = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonALTERAR = new javax.swing.JButton();
        jButtonVOLTAR = new javax.swing.JButton();
        jButtonSALVAR = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanelFORMULARIO
                .setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));

        jLabelDataNasc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDataNasc.setText("*Data de Nascimento:");

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNome.setText("*Nome Completo:");

        jLabelEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEndereco.setText("*Endereço:");

        jLabelPESO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPESO.setText("*Peso:");

        jLabelIMC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelIMC.setText("*IMC:");

        jTextFieldIMC.setEnabled(false);

        jTextFieldDataNasc.setToolTipText("//");

        jTextFieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnderecoActionPerformed(evt);
            }
        });

        jTextFieldCODIGO.setEnabled(false);

        jLabelDATACADASTRO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDATACADASTRO.setText("*DATA MATRICULA:");

        jLabelCODIGO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCODIGO.setText("CÓDIGO:");

        jTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneActionPerformed(evt);
            }
        });

        jTextFieldDataMatricula.setEnabled(false);
        jTextFieldDataMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataMatriculaActionPerformed(evt);
            }
        });

        jTableLISTAGEM
                .setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][] { { null, null, null, null }, { null, null, null, null },
                                { null, null, null, null }, { null, null, null, null } },
                        new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
        jScrollPane1.setViewportView(jTableLISTAGEM);

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/lupa2.png"))); // NOI18N
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTextFieldPeso.setToolTipText("Peso");
        jTextFieldPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesoActionPerformed(evt);
            }
        });

        jLabelTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTelefone.setText("*Telefone:");

        jLabelAltura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelAltura.setText("*Altura:");

        jTextFieldAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlturaActionPerformed(evt);
            }

            private void jTextFieldAlturaActionPerformed(ActionEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanelFORMULARIOLayout = new javax.swing.GroupLayout(jPanelFORMULARIO);
        jPanelFORMULARIO.setLayout(jPanelFORMULARIOLayout);
        jPanelFORMULARIOLayout.setHorizontalGroup(jPanelFORMULARIOLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFORMULARIOLayout.createSequentialGroup().addContainerGap()
                        .addGroup(jPanelFORMULARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1176,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelFORMULARIOLayout.createSequentialGroup().addComponent(jLabelCODIGO)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldCODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 155,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18).addComponent(jLabelDATACADASTRO)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldDataMatricula, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jPanelFORMULARIOLayout.createSequentialGroup().addGap(51, 51, 51)
                        .addGroup(jPanelFORMULARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelFORMULARIOLayout.createSequentialGroup().addComponent(jLabelTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 155,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        jPanelFORMULARIOLayout.createSequentialGroup().addGroup(jPanelFORMULARIOLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanelFORMULARIOLayout.createSequentialGroup()
                                                        .addComponent(jLabelEndereco).addGap(18, 18, 18)
                                                        .addComponent(jTextFieldEndereco).addGap(142, 142, 142))
                                                .addGroup(jPanelFORMULARIOLayout.createSequentialGroup()
                                                        .addComponent(jLabelNome).addGap(36, 36, 36)
                                                        .addGroup(jPanelFORMULARIOLayout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanelFORMULARIOLayout.createSequentialGroup()
                                                                        .addGap(84, 84, 84).addComponent(jLabelAltura)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jTextFieldAltura,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                82,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18).addComponent(jLabelPESO)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(jTextFieldPeso,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                73,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(33, 33, 33).addComponent(jLabelIMC)
                                                                        .addGap(18, 18, 18).addComponent(jTextFieldIMC,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                190,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanelFORMULARIOLayout.createSequentialGroup()
                                                                        .addComponent(jTextFieldNome,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                493,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jLabelDataNasc)))
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jTextFieldDataNasc,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 188,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)))
                                                .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(51, 51, 51)))));
        jPanelFORMULARIOLayout.setVerticalGroup(jPanelFORMULARIOLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFORMULARIOLayout.createSequentialGroup().addContainerGap()
                        .addGroup(jPanelFORMULARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelCODIGO)
                                .addComponent(jTextFieldCODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelDATACADASTRO).addComponent(jTextFieldDataMatricula,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanelFORMULARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelFORMULARIOLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelNome).addComponent(jLabelDataNasc)
                                        .addComponent(jTextFieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanelFORMULARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelPESO).addComponent(jLabelIMC)
                                .addComponent(jTextFieldIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelTelefone)
                                .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelAltura))
                        .addGap(36, 36, 36)
                        .addGroup(jPanelFORMULARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelEndereco).addComponent(jTextFieldEndereco,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(93, Short.MAX_VALUE)));

        jTextFieldPeso.getAccessibleContext().setAccessibleName("");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));

        jButtonALTERAR.setText("ALTERAR");
        jButtonALTERAR.setEnabled(false);

        jButtonVOLTAR.setText("VOLTAR");
        jButtonVOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVOLTARActionPerformed(evt);
            }
        });

        jButtonSALVAR.setText("SALVAR");
        jButtonSALVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButtonSALVARActionPerformed(evt);
                } catch (InvalidAttributeValueException e) {
                    e.printStackTrace();
                }
            }
        });

        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setVisible(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
                        .addComponent(jButtonVOLTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 105,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonALTERAR, javax.swing.GroupLayout.PREFERRED_SIZE, 105,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18).addComponent(jButtonSALVAR, javax.swing.GroupLayout.PREFERRED_SIZE, 105,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonALTERAR, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addComponent(jButtonVOLTAR, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addComponent(jButtonSALVAR, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap()));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                .addComponent(jPanelFORMULARIO, javax.swing.GroupLayout.Alignment.TRAILING,
                        javax.swing.GroupLayout.PREFERRED_SIZE, 1200, Short.MAX_VALUE));
        jPanel1Layout
                .setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanelFORMULARIO, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 20, 1200, 680);

        jLabelbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/pilates_1.jpg"))); // NOI18N
        getContentPane().add(jLabelbackground);
        jLabelbackground.setBounds(0, 4, 1280, 720);

        setSize(new java.awt.Dimension(1296, 759));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    protected void jTextFieldPesoActionPerformed(ActionEvent evt) {
    }

    protected void jTextFieldDataMatriculaActionPerformed(ActionEvent evt) {
    }

    protected void jTextFieldEnderecoActionPerformed(ActionEvent evt) {
    }

    protected void jTextFieldTelefoneActionPerformed(ActionEvent evt) {
    }

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCancelarActionPerformed
        Utils.limparCampos(campos);
        toggleButton(jButtonSALVAR);
        toggleButton(jButtonALTERAR);
        jButtonCancelar.setVisible(false);
        jTextFieldCODIGO.setText("");
    }// GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        try {

            String codigoMatricula = JOptionPane.showInputDialog("Digite o número de matricula do Aluno");

            if (codigoMatricula == null) {
                return;
            }

            if (codigoMatricula.length() == 0) {
                throw new InvalidAttributeValueException("Informe um número de matrícula válido");
            }

            Usuario resultado = Optional.of(BD.getAlunoByCodigoMatricula(codigoMatricula))
                    .orElseThrow(() -> new InvalidAttributeValueException("Aluno não encontrado"));

            Aluno alunoEncontrado = (Aluno) resultado.clone();

            jTextFieldCODIGO.setText(alunoEncontrado.getCodigoMatricula().toString());
            jTextFieldNome.setText(alunoEncontrado.getUsername());
            jTextFieldDataNasc.setText(alunoEncontrado.getDataNascimento());
            jTextFieldEndereco.setText(alunoEncontrado.getEndereco());
            jTextFieldDataMatricula.setText(alunoEncontrado.getDataMatricula());
            jTextFieldTelefone.setText(alunoEncontrado.getTelefone().getNumero());
            jTextFieldPeso.setText(alunoEncontrado.getPeso());
            jTextFieldAltura.setText(alunoEncontrado.getAltura());
            jTextFieldIMC.setText(alunoEncontrado.getImc().toString());

            toggleButton(jButtonALTERAR);
            toggleButton(jButtonSALVAR);
            jButtonCancelar.setVisible(true);

        } catch (Exception e) {
            showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.ERROR_MESSAGE);
        }

    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButtonVOLTARActionPerformed(java.awt.event.ActionEvent evt) {
        Menu menu1 = new Menu();
        menu1.setVisible(true);
        dispose();
    }

    private void jButtonSALVARActionPerformed(java.awt.event.ActionEvent evt) throws InvalidAttributeValueException {

        try {
            if (tiverCamposNaoPreenchidos(campos)) {
                throw new InvalidAttributeValueException("Todos os campos são obrigatórios");
            }

            String nome = jTextFieldNome.getText();
            String dataNascimento = jTextFieldDataNasc.getText();
            Telefone telefone = new Telefone(jTextFieldTelefone.getText());
            String altura = jTextFieldAltura.getText();
            String peso = jTextFieldPeso.getText();
            String dataMatricula = jTextFieldDataMatricula.getText();
            String endereco = jTextFieldEndereco.getText();

            Aluno aluno = new Aluno(dataMatricula, nome, endereco, dataNascimento, telefone, peso, altura, nome,
                    Acesso.ALUNO);

            BD.getUsuarios().add(aluno);

            Utils.limparCampos(campos);

            showMessageDialog(this, "Aluno criado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.ERROR_MESSAGE);
        }

    }// GEN-LAST:event_jButtonSALVARActionPerformed

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
            java.util.logging.Logger.getLogger(Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AlunoView().setVisible(true);
                } catch (CloneNotSupportedException ex) {
                    Logger.getLogger(AlunoView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonALTERAR;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSALVAR;
    private javax.swing.JButton jButtonVOLTAR;
    private javax.swing.JLabel jLabelAltura;
    private javax.swing.JLabel jLabelCODIGO;
    private javax.swing.JLabel jLabelDATACADASTRO;
    private javax.swing.JLabel jLabelDataNasc;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelIMC;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPESO;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelbackground;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelFORMULARIO;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLISTAGEM;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldCODIGO;
    private javax.swing.JTextField jTextFieldDataMatricula;
    private javax.swing.JTextField jTextFieldDataNasc;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldIMC;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
    private Aluno aluno;
}
