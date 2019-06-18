/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import model.Consulta;
import control.ManipuladorConsultas;
import exception.ErroCadastroException;
import exception.ValorInvalidoException;
import model.Consulta;
import javax.swing.JOptionPane;

public class ConsultaEditar extends javax.swing.JFrame {
    
    ConsultaBuscarEditar telaConsultaBuscarEditar;
    
    private final Consulta consultaEdit;
    
    public ConsultaEditar(ConsultaBuscarEditar telaConsultaBuscarEditar,Consulta consultaEdit) {
        initComponents();
        
        this.telaConsultaBuscarEditar = telaConsultaBuscarEditar;
        this.consultaEdit = consultaEdit;
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
        buttonVoltar = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        textConsultaEditarCPF = new javax.swing.JTextField();
        textConsultaEditarConvenio = new javax.swing.JTextField();
        textConsultaEditarCRM = new javax.swing.JTextField();
        textConsultaEditarHorario = new javax.swing.JTextField();
        textConsultaEditarData = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar consulta"));

        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        buttonEditar.setText("Editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        textConsultaEditarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textConsultaEditarCPFActionPerformed(evt);
            }
        });

        textConsultaEditarConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textConsultaEditarConvenioActionPerformed(evt);
            }
        });

        textConsultaEditarCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textConsultaEditarCRMActionPerformed(evt);
            }
        });

        textConsultaEditarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textConsultaEditarHorarioActionPerformed(evt);
            }
        });

        textConsultaEditarData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textConsultaEditarDataActionPerformed(evt);
            }
        });

        jLabel1.setText("Data");

        jLabel3.setText("Horário");

        jLabel5.setText("CRM");

        jLabel6.setText("Convênio");

        jLabel7.setText("CPF do paciente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textConsultaEditarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textConsultaEditarConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textConsultaEditarCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textConsultaEditarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textConsultaEditarData, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textConsultaEditarData, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textConsultaEditarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textConsultaEditarCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textConsultaEditarConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textConsultaEditarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEditar)
                    .addComponent(buttonVoltar))
                .addContainerGap())
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

    private void textConsultaEditarDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textConsultaEditarDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textConsultaEditarDataActionPerformed

    private void textConsultaEditarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textConsultaEditarHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textConsultaEditarHorarioActionPerformed

    private void textConsultaEditarConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textConsultaEditarConvenioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textConsultaEditarConvenioActionPerformed

    private void textConsultaEditarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textConsultaEditarCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textConsultaEditarCPFActionPerformed

    private void textConsultaEditarCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textConsultaEditarCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textConsultaEditarCRMActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        if (passouNaPreValidacao()) {
            try {
                editaConsulta();
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
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        this.setVisible(false);
        limpaCampos();
        
        telaConsultaBuscarEditar.setLocationRelativeTo(null);
        telaConsultaBuscarEditar.setVisible(true);
    }//GEN-LAST:event_buttonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaEditar(new ConsultaBuscarEditar(), new Consulta()).setVisible(true);
            }
        });
    }
    
    private boolean passouNaPreValidacao() {
        String cpf = textConsultaEditarCPF.getText();
        String convenio = textConsultaEditarConvenio.getText();
        String data = textConsultaEditarData.getText();
        String horario = textConsultaEditarHorario.getText();
        String crm = textConsultaEditarCRM.getText();
        
        

        if (cpf.isEmpty() || convenio.isEmpty() || data.isEmpty()|| horario.isEmpty()||crm.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Nem todos os campos foram "
                    + "preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }
    private void editaConsulta() throws ValorInvalidoException, ErroCadastroException {
        String cpf = textConsultaEditarCPF.getText();
        String data = textConsultaEditarData.getText();
        String horario =textConsultaEditarHorario.getText();
        String crm = textConsultaEditarCRM.getText();  
        String convenio = textConsultaEditarConvenio.getText();
           
        Consulta consultaE = new Consulta();
       
        consultaE.setCrm(Integer.parseInt(crm));
        consultaE.setHorario(Integer.parseInt(horario));
        consultaE.setDataConsulta(data);
        consultaE.setCpf(Integer.parseInt(cpf));
        consultaE.setConvenio(convenio);
        new ManipuladorConsultas().edita(consultaEdit.getCpf(), consultaE);
    }
    private void limpaCampos() {
        textConsultaEditarCRM.setText("");
        textConsultaEditarData.setText("");
        textConsultaEditarHorario.setText("");
        textConsultaEditarCPF.setText("");
        textConsultaEditarConvenio.setText("");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textConsultaEditarCPF;
    private javax.swing.JTextField textConsultaEditarCRM;
    private javax.swing.JTextField textConsultaEditarConvenio;
    private javax.swing.JTextField textConsultaEditarData;
    private javax.swing.JTextField textConsultaEditarHorario;
    // End of variables declaration//GEN-END:variables
}