package view;


import control.ManipuladorPacientes;
import javax.swing.JOptionPane;
import model.Paciente;
import exception.ErroCadastroException;
import model.Telefone;
import control.ManipuladorTelefones;
public class PacienteRemover extends javax.swing.JFrame {

    private Paciente pacienteEncontrado;
    private Telefone telefoneEncontrado;
    public PacienteRemover() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btPacienteRemoverOK = new javax.swing.JButton();
        btPacienteRemoverrLimpar = new javax.swing.JButton();
        textPacienteRemoverCPF = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPacienteRemover = new javax.swing.JTextArea();
        btPacienteRemoverVoltar = new javax.swing.JButton();
        btPacienteRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Remover paciente"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Busca por CPF"));

        btPacienteRemoverOK.setText("Buscar");
        btPacienteRemoverOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPacienteRemoverOKActionPerformed(evt);
            }
        });

        btPacienteRemoverrLimpar.setText("Limpar");
        btPacienteRemoverrLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPacienteRemoverrLimparActionPerformed(evt);
            }
        });

        textPacienteRemoverCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPacienteRemoverCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textPacienteRemoverCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btPacienteRemoverOK, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btPacienteRemoverrLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPacienteRemoverCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPacienteRemoverOK)
                    .addComponent(btPacienteRemoverrLimpar))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do paciente"));

        textPacienteRemover.setColumns(20);
        textPacienteRemover.setRows(5);
        jScrollPane1.setViewportView(textPacienteRemover);

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
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btPacienteRemoverVoltar.setText("Voltar");
        btPacienteRemoverVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPacienteRemoverVoltarActionPerformed(evt);
            }
        });

        btPacienteRemover.setText("Remover");
        btPacienteRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPacienteRemoverActionPerformed(evt);
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
                .addGap(286, 286, 286)
                .addComponent(btPacienteRemoverVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btPacienteRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
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
                    .addComponent(btPacienteRemoverVoltar)
                    .addComponent(btPacienteRemover))
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

    private void textPacienteRemoverCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPacienteRemoverCPFActionPerformed
        
    }//GEN-LAST:event_textPacienteRemoverCPFActionPerformed

    private void btPacienteRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPacienteRemoverActionPerformed
        
        try {
            if (pacienteEncontrado != null && telefoneEncontrado != null) {
                new ManipuladorTelefones().remove(telefoneEncontrado.getTelefone(), telefoneEncontrado);
            } else {
                throw new RuntimeException();
            }
            verificaRemoverNovamente();
        } catch (ErroCadastroException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Erro ao remover paciente",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btPacienteRemoverActionPerformed

    private void btPacienteRemoverOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPacienteRemoverOKActionPerformed
        Paciente paciente;
        Telefone telefone;
        int nTelefone;
        String cpf = textPacienteRemoverCPF.getText();
        ManipuladorPacientes manipPaciente = new ManipuladorPacientes();
        ManipuladorTelefones manipTelefone = new ManipuladorTelefones();
        
        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Digite um cpf.",
                    "Busca", JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            paciente = manipPaciente.buscaPorCpf(Integer.parseInt(cpf));
            if(paciente !=null){
                nTelefone = paciente.getTelefone();
                telefone = manipTelefone.buscaPorTelefone(nTelefone);
            }
            else telefone = null;
            if (telefone == null ) {
                throw new NullPointerException("Não encontrado !");
                
            } else {
                
                telefoneEncontrado = telefone;
                pacienteEncontrado = paciente;
                mostraDados();
            }
        }
    }//GEN-LAST:event_btPacienteRemoverOKActionPerformed

    private void btPacienteRemoverVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPacienteRemoverVoltarActionPerformed
        textPacienteRemoverCPF.setText(""); 
        textPacienteRemover.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_btPacienteRemoverVoltarActionPerformed

    private void btPacienteRemoverrLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPacienteRemoverrLimparActionPerformed
        textPacienteRemoverCPF.setText(""); 
        textPacienteRemover.setText("");
    }//GEN-LAST:event_btPacienteRemoverrLimparActionPerformed
private void verificaRemoverNovamente() {
        int respUsuario = JOptionPane.showConfirmDialog(rootPane,
                "Remoção realizada com sucesso! Deseja remover outro "
                + "paciente?", "Sucesso!", JOptionPane.YES_NO_OPTION);
        switch (respUsuario) {
            case JOptionPane.YES_OPTION:
                btPacienteRemoverrLimpar.doClick();
                break;
            case JOptionPane.NO_OPTION:
                btPacienteRemoverVoltar.doClick();
                break;
            default:
                btPacienteRemoverVoltar.doClick();
                break;
        }
    }
    

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
            java.util.logging.Logger.getLogger(ConsultaRemover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaRemover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaRemover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaRemover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaRemover().setVisible(true);
            }
        });
    }
    private void limpaCampos() {
        textPacienteRemoverCPF.setText("");
        textPacienteRemover.setText("");
        
} 
    private void mostraDados() {
        
            
            textPacienteRemover.setText("NOME: "+ pacienteEncontrado.getNome() +"\n" +
            "TELEFONE: "  + pacienteEncontrado.getTelefone() + "\n" +
            "DATA DE NASCIMENTO: "+ pacienteEncontrado.getNascimento() + "\n" +
            "CPF: "+ pacienteEncontrado.getCpf() + "\n" +
            "ENDEREÇO: "+pacienteEncontrado.getEndereco());    
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPacienteRemover;
    private javax.swing.JButton btPacienteRemoverOK;
    private javax.swing.JButton btPacienteRemoverVoltar;
    private javax.swing.JButton btPacienteRemoverrLimpar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textPacienteRemover;
    private javax.swing.JTextField textPacienteRemoverCPF;
    // End of variables declaration//GEN-END:variables
}
