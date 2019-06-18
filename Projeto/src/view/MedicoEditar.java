/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ManipuladorMedicos;
import exception.ErroCadastroException;
import exception.ValorInvalidoException;
import model.Medico;
import javax.swing.JOptionPane;

public class MedicoEditar extends javax.swing.JFrame {
    
    MedicoBuscarEditar telaMedicoEditarBuscar;
    
    private final Medico medicoEdit;
    
   public MedicoEditar(MedicoBuscarEditar telaMedicoBuscarEditar, Medico medicoEdit) {
        initComponents();
        
        this.telaMedicoEditarBuscar = telaMedicoBuscarEditar;
        this.medicoEdit = medicoEdit;
        
        
    }
    
  
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btMedicoEditar = new javax.swing.JButton();
        btMedicoEditarVoltar = new javax.swing.JButton();
        textMedicoEditarTelefone = new javax.swing.JTextField();
        textMedicoEditarEspecializacao = new javax.swing.JTextField();
        textMedicoEditarNome = new javax.swing.JTextField();
        textMedicoEditarCRM = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar médico"));

        jLabel4.setText("Especialização");

        jLabel3.setText("CRM");

        jLabel2.setText("Nome");

        jLabel5.setText("Telefone");

        btMedicoEditar.setText("Editar");
        btMedicoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMedicoEditarActionPerformed(evt);
            }
        });

        btMedicoEditarVoltar.setText("Voltar");
        btMedicoEditarVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMedicoEditarVoltarActionPerformed(evt);
            }
        });

        textMedicoEditarCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMedicoEditarCRMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btMedicoEditarVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btMedicoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(textMedicoEditarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textMedicoEditarEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textMedicoEditarCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textMedicoEditarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textMedicoEditarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textMedicoEditarCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textMedicoEditarEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textMedicoEditarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btMedicoEditar)
                        .addComponent(btMedicoEditarVoltar))
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

    private void textMedicoEditarCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMedicoEditarCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMedicoEditarCRMActionPerformed

    private void btMedicoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMedicoEditarActionPerformed
        if (passouNaPreValidacao()) {
            try {
                editaMedico();
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
    }//GEN-LAST:event_btMedicoEditarActionPerformed

    private void btMedicoEditarVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMedicoEditarVoltarActionPerformed
        this.setVisible(false); 
        limpaCampos();
        telaMedicoEditarBuscar.setLocationRelativeTo(null);
        telaMedicoEditarBuscar.setVisible(true);
    }//GEN-LAST:event_btMedicoEditarVoltarActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicoEditar(new MedicoBuscarEditar(), new Medico()).setVisible(true);
            }
        });
    }
    private boolean passouNaPreValidacao() {
        String nome = textMedicoEditarNome.getText();
        String crm = textMedicoEditarCRM.getText();
        String especializacao = textMedicoEditarEspecializacao.getText();
        String telefone = textMedicoEditarTelefone.getText();
        

        if (nome.isEmpty() || crm.isEmpty() || telefone.isEmpty()|| especializacao.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Nem todos os campos foram "
                    + "preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }
        private void editaMedico() throws ValorInvalidoException, ErroCadastroException {
        String nome = textMedicoEditarNome.getText();
        String crm = textMedicoEditarCRM.getText();
        String especializacao =textMedicoEditarEspecializacao.getText();
        String telefone = textMedicoEditarTelefone.getText();  
           
        Medico medicoE = new Medico();
       
        medicoE.setNome(nome);
        medicoE.setCrm(Integer.parseInt(crm));
        medicoE.setEspecializacao(especializacao);
        medicoE.setTelefone(Integer.parseInt(telefone));
        new ManipuladorMedicos().edita(medicoEdit.getCrm(), medicoE);
    }
    private void limpaCampos() {
        textMedicoEditarNome.setText("");
        textMedicoEditarCRM.setText("");
        textMedicoEditarEspecializacao.setText("");
        textMedicoEditarTelefone.setText("");
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMedicoEditar;
    private javax.swing.JButton btMedicoEditarVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textMedicoEditarCRM;
    private javax.swing.JTextField textMedicoEditarEspecializacao;
    private javax.swing.JTextField textMedicoEditarNome;
    private javax.swing.JTextField textMedicoEditarTelefone;
    // End of variables declaration//GEN-END:variables
}
