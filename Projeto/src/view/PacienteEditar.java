/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ManipuladorPacientes;
import control.ManipuladorTelefones;
import exception.ErroCadastroException;
import exception.ValorInvalidoException;
import model.Paciente;
import javax.swing.JOptionPane;
import model.Telefone;


/**
 *
 * @author Mateus
 */
public class PacienteEditar extends javax.swing.JFrame {
    
    PacienteBuscarEditar telaPacienteBuscarEditar;
    private final Paciente pacienteEdit;
    private final Telefone telefoneEdit;
   
    
    public PacienteEditar(PacienteBuscarEditar telaPacienteBuscarEditar, Paciente pacienteEdit,Telefone telefoneEdit) {
        initComponents();
        
        this.telaPacienteBuscarEditar = telaPacienteBuscarEditar;
        this.pacienteEdit = pacienteEdit;
        this.telefoneEdit = telefoneEdit;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btConsultaAdicionarVoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btPacienteEditar = new javax.swing.JButton();
        btPacienteEditarVoltar = new javax.swing.JButton();
        textPacienteEditarNascimento = new javax.swing.JTextField();
        textPacienteEditarNome = new javax.swing.JTextField();
        textPacienteEditarTelefone = new javax.swing.JTextField();
        textPacienteEditarEndereco = new javax.swing.JTextField();
        textPacienteEditarCPF = new javax.swing.JTextField();

        btConsultaAdicionarVoltar.setText("VOLTAR");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar paciente"));

        jLabel6.setText("Telefone");

        jLabel5.setText("Endereço");

        jLabel4.setText("CPF");

        jLabel3.setText("Nascimento");

        jLabel2.setText("Nome");

        btPacienteEditar.setText("Editar");
        btPacienteEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPacienteEditarActionPerformed(evt);
            }
        });

        btPacienteEditarVoltar.setText("Voltar");
        btPacienteEditarVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPacienteEditarVoltarActionPerformed(evt);
            }
        });

        textPacienteEditarNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPacienteEditarNascimentoActionPerformed(evt);
            }
        });

        textPacienteEditarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPacienteEditarNomeActionPerformed(evt);
            }
        });

        textPacienteEditarTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPacienteEditarTelefoneActionPerformed(evt);
            }
        });

        textPacienteEditarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPacienteEditarEnderecoActionPerformed(evt);
            }
        });

        textPacienteEditarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPacienteEditarCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)))
                .addContainerGap(234, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btPacienteEditarVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btPacienteEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textPacienteEditarNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPacienteEditarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPacienteEditarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPacienteEditarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPacienteEditarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addContainerGap(165, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(textPacienteEditarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(textPacienteEditarNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(textPacienteEditarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textPacienteEditarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textPacienteEditarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btPacienteEditarVoltar)
                        .addComponent(btPacienteEditar))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textPacienteEditarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPacienteEditarCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPacienteEditarCPFActionPerformed

    private void textPacienteEditarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPacienteEditarEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPacienteEditarEnderecoActionPerformed

    private void textPacienteEditarTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPacienteEditarTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPacienteEditarTelefoneActionPerformed

    private void textPacienteEditarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPacienteEditarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPacienteEditarNomeActionPerformed

    private void textPacienteEditarNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPacienteEditarNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPacienteEditarNascimentoActionPerformed

    private void btPacienteEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPacienteEditarActionPerformed
        if (passouNaPreValidacao()) {
            try {
                editaTelefone();
                editaPaciente();
                JOptionPane.showMessageDialog(rootPane, "Alterações salvas "
                        + "com sucesso!", "Edição",
                        JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                dispose();
            } catch (ValorInvalidoException | ErroCadastroException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        
        this.setVisible(false); 
    }//GEN-LAST:event_btPacienteEditarActionPerformed

    private void btPacienteEditarVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPacienteEditarVoltarActionPerformed
        this.setVisible(false); 
        limpaCampos();
        telaPacienteBuscarEditar.setLocationRelativeTo(null);
        telaPacienteBuscarEditar.setVisible(true);
    }//GEN-LAST:event_btPacienteEditarVoltarActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacienteEditar(new PacienteBuscarEditar(), new Paciente(), new Telefone()).setVisible(true);
            }
        });
    }
    private boolean passouNaPreValidacao() {
        String nome = textPacienteEditarNome.getText();
        String telefone = textPacienteEditarTelefone.getText();
        String dataNascimento = textPacienteEditarNascimento.getText();
        String cpf = textPacienteEditarCPF.getText();
        String endereco = textPacienteEditarTelefone.getText();

        if (nome.isEmpty() || cpf.isEmpty() || telefone.isEmpty()|| dataNascimento.isEmpty() || endereco.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Nem todos os campos foram "
                    + "preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }
    private void editaTelefone() throws ValorInvalidoException, ErroCadastroException {
        String nome = textPacienteEditarNome.getText();
        String telefone = textPacienteEditarTelefone.getText();

        Telefone telefoneE = new Telefone();
       
        telefoneE.setNome(nome);
        telefoneE.setTelefone(Integer.parseInt(telefone)); 
        new ManipuladorTelefones().edita(telefoneEdit.getTelefone(), telefoneE);
    }
    private void editaPaciente() throws ValorInvalidoException, ErroCadastroException {
        String nome = textPacienteEditarNome.getText();
        String dataNascimento =textPacienteEditarNascimento.getText();
        String cpf = textPacienteEditarCPF.getText();
        String endereco = textPacienteEditarEndereco.getText();
           
        Paciente pacienteE = new Paciente();
       
        pacienteE.setNome(nome);
        pacienteE.setNascimento(dataNascimento);
        pacienteE.setCpf(Integer.parseInt(cpf));
        pacienteE.setEndereco(endereco);
        new ManipuladorPacientes().edita(pacienteEdit.getCpf(), pacienteE);
    }

    private void limpaCampos() {
        textPacienteEditarNome.setText("");
        textPacienteEditarTelefone.setText("");
        textPacienteEditarNascimento.setText("");
        textPacienteEditarCPF.setText("");
        textPacienteEditarEndereco.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultaAdicionarVoltar;
    private javax.swing.JButton btPacienteEditar;
    private javax.swing.JButton btPacienteEditarVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textPacienteEditarCPF;
    private javax.swing.JTextField textPacienteEditarEndereco;
    private javax.swing.JTextField textPacienteEditarNascimento;
    private javax.swing.JTextField textPacienteEditarNome;
    private javax.swing.JTextField textPacienteEditarTelefone;
    // End of variables declaration//GEN-END:variables
}
