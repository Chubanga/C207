/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import control.ManipuladorPacientes;
import model.Paciente;
import model.Telefone;
import control.ManipuladorTelefones;

import javax.swing.JOptionPane;

public class PacienteBuscarEditar extends javax.swing.JFrame {
    
    PacienteEditar telaPacienteEditar;
    private Paciente pacienteEncontrado;
    private Telefone telefoneEncontrado;

    public PacienteBuscarEditar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btPacienteBuscarEditarLimpar = new javax.swing.JButton();
        textPacienteBuscarEditarCPF = new javax.swing.JTextField();
        btPacienteBuscarEditarBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPacienteBuscarEditar = new javax.swing.JTextArea();
        btPacienteBuscarEditarVoltar = new javax.swing.JButton();
        btPacienteBuscarEditarConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Busca para edição do paciente"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Busca pelo CPF"));

        btPacienteBuscarEditarLimpar.setText("Limpar");
        btPacienteBuscarEditarLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPacienteBuscarEditarLimparActionPerformed(evt);
            }
        });

        textPacienteBuscarEditarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPacienteBuscarEditarCPFActionPerformed(evt);
            }
        });

        btPacienteBuscarEditarBuscar.setText("Buscar");
        btPacienteBuscarEditarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPacienteBuscarEditarBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textPacienteBuscarEditarCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btPacienteBuscarEditarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPacienteBuscarEditarLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPacienteBuscarEditarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPacienteBuscarEditarLimpar)
                    .addComponent(btPacienteBuscarEditarBuscar))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do paciente"));

        textPacienteBuscarEditar.setEditable(false);
        textPacienteBuscarEditar.setColumns(20);
        textPacienteBuscarEditar.setRows(5);
        jScrollPane1.setViewportView(textPacienteBuscarEditar);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btPacienteBuscarEditarVoltar.setText("Voltar");
        btPacienteBuscarEditarVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPacienteBuscarEditarVoltarActionPerformed(evt);
            }
        });

        btPacienteBuscarEditarConfirmar.setText("Confirmar");
        btPacienteBuscarEditarConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPacienteBuscarEditarConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btPacienteBuscarEditarVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPacienteBuscarEditarConfirmar)
                .addGap(11, 11, 11))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPacienteBuscarEditarVoltar)
                    .addComponent(btPacienteBuscarEditarConfirmar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textPacienteBuscarEditarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPacienteBuscarEditarCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPacienteBuscarEditarCPFActionPerformed

    private void btPacienteBuscarEditarConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPacienteBuscarEditarConfirmarActionPerformed
        
        if(pacienteEncontrado!=null && telefoneEncontrado != null){
        Telefone telefone = null;
        Paciente paciente = null;
        telaPacienteEditar = new PacienteEditar(this,pacienteEncontrado,telefoneEncontrado);
        telaPacienteEditar.setLocationRelativeTo(null);
        telaPacienteEditar.setVisible(true);
        this.setVisible(false);
        limpaCampos();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Paciente não encontrado");
        }    
    }//GEN-LAST:event_btPacienteBuscarEditarConfirmarActionPerformed

    private void btPacienteBuscarEditarVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPacienteBuscarEditarVoltarActionPerformed
        textPacienteBuscarEditarCPF.setText(""); 
        textPacienteBuscarEditar.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_btPacienteBuscarEditarVoltarActionPerformed

    private void btPacienteBuscarEditarLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPacienteBuscarEditarLimparActionPerformed
        textPacienteBuscarEditarCPF.setText(""); 
        textPacienteBuscarEditar.setText("");
    }//GEN-LAST:event_btPacienteBuscarEditarLimparActionPerformed

    private void btPacienteBuscarEditarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPacienteBuscarEditarBuscarActionPerformed
        
        Paciente paciente = new Paciente();
        Telefone telefone = new Telefone();
        int nTelefone;
        String cpf = textPacienteBuscarEditarCPF.getText();
        ManipuladorPacientes manipPaciente = new ManipuladorPacientes();
        ManipuladorTelefones manipTelefone = new ManipuladorTelefones();
        
        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Digite um cpf.",
                    "Busca", JOptionPane.INFORMATION_MESSAGE);
        } else {         
            paciente = manipPaciente.buscaPorCpf(Integer.parseInt(cpf)); 
            nTelefone = paciente.getTelefone();
            telefone = manipTelefone.buscaPorTelefone(nTelefone);
            if (paciente != null ) {
                pacienteEncontrado = paciente;
                telefoneEncontrado = telefone;
                mostraDados();
                
            
            } else {
                JOptionPane.showMessageDialog(rootPane, "Não encontrado!",
                        "Busca", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_btPacienteBuscarEditarBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(PacienteBuscarEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacienteBuscarEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacienteBuscarEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacienteBuscarEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacienteBuscarEditar().setVisible(true);
            }
        });
    }
    private void limpaCampos() {
        textPacienteBuscarEditar.setText("");
        textPacienteBuscarEditarCPF.setText("");
        
}    
    
    
    private void mostraDados() {      
            textPacienteBuscarEditar.setText("NOME: "+ pacienteEncontrado.getNome() +"\n" +
            "TELEFONE: "  + pacienteEncontrado.getTelefone() + "\n" +
            "DATA DE NASCIMENTO: "+ pacienteEncontrado.getNascimento() + "\n" +
            "CPF: "+pacienteEncontrado.getCpf() + "\n" +
            "ENDEREÇO: "+pacienteEncontrado.getEndereco());    
       
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPacienteBuscarEditarBuscar;
    private javax.swing.JButton btPacienteBuscarEditarConfirmar;
    private javax.swing.JButton btPacienteBuscarEditarLimpar;
    private javax.swing.JButton btPacienteBuscarEditarVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textPacienteBuscarEditar;
    private javax.swing.JTextField textPacienteBuscarEditarCPF;
    // End of variables declaration//GEN-END:variables
}
