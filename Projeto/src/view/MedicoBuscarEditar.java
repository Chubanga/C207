/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.Medico;
import control.ManipuladorMedicos;
import javax.swing.JOptionPane;

public class MedicoBuscarEditar extends javax.swing.JFrame {
    
    MedicoEditar telaMedicoEditar;
    private Medico medicoEncontrado;
    
    public MedicoBuscarEditar() {
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
        jPanel2 = new javax.swing.JPanel();
        btMedicoBuscarEditarBuscar = new javax.swing.JButton();
        btMedicoBuscarEditarLimpar = new javax.swing.JButton();
        textMedicoBuscarEditarCRM = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textMedicoBuscarEditar = new javax.swing.JTextArea();
        btMedicoBuscarEditarVoltar = new javax.swing.JButton();
        btMedicoBuscarEditarConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Busca para edição de médico"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Busca pelo CRM"));

        btMedicoBuscarEditarBuscar.setText("Buscar");
        btMedicoBuscarEditarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMedicoBuscarEditarBuscarActionPerformed(evt);
            }
        });

        btMedicoBuscarEditarLimpar.setText("Limpar");
        btMedicoBuscarEditarLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMedicoBuscarEditarLimparActionPerformed(evt);
            }
        });

        textMedicoBuscarEditarCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMedicoBuscarEditarCRMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textMedicoBuscarEditarCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btMedicoBuscarEditarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btMedicoBuscarEditarLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMedicoBuscarEditarCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMedicoBuscarEditarBuscar)
                    .addComponent(btMedicoBuscarEditarLimpar))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do médico"));

        textMedicoBuscarEditar.setEditable(false);
        textMedicoBuscarEditar.setColumns(20);
        textMedicoBuscarEditar.setRows(5);
        jScrollPane1.setViewportView(textMedicoBuscarEditar);

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

        btMedicoBuscarEditarVoltar.setText("Voltar");
        btMedicoBuscarEditarVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMedicoBuscarEditarVoltarActionPerformed(evt);
            }
        });

        btMedicoBuscarEditarConfirmar.setText("Confirmar");
        btMedicoBuscarEditarConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMedicoBuscarEditarConfirmarActionPerformed(evt);
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
                .addComponent(btMedicoBuscarEditarVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMedicoBuscarEditarConfirmar)
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
                    .addComponent(btMedicoBuscarEditarVoltar)
                    .addComponent(btMedicoBuscarEditarConfirmar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.getAccessibleContext().setAccessibleName("Busca pelo CRM");

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

    private void textMedicoBuscarEditarCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMedicoBuscarEditarCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMedicoBuscarEditarCRMActionPerformed

    private void btMedicoBuscarEditarConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMedicoBuscarEditarConfirmarActionPerformed
        if(medicoEncontrado!=null){
 
        Medico medico = null;
        telaMedicoEditar = new MedicoEditar(this,medicoEncontrado);
        telaMedicoEditar.setLocationRelativeTo(null);
        telaMedicoEditar.setVisible(true);
        this.setVisible(false);
        limpaCampos();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Paciente não encontrado");
        }
    }//GEN-LAST:event_btMedicoBuscarEditarConfirmarActionPerformed

    private void btMedicoBuscarEditarVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMedicoBuscarEditarVoltarActionPerformed
        textMedicoBuscarEditarCRM.setText("");
        textMedicoBuscarEditar.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_btMedicoBuscarEditarVoltarActionPerformed

    private void btMedicoBuscarEditarLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMedicoBuscarEditarLimparActionPerformed
        textMedicoBuscarEditarCRM.setText("");
        textMedicoBuscarEditar.setText("");
    }//GEN-LAST:event_btMedicoBuscarEditarLimparActionPerformed

    private void btMedicoBuscarEditarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMedicoBuscarEditarBuscarActionPerformed
        Medico medico;
        
        String crm = textMedicoBuscarEditarCRM.getText();
        ManipuladorMedicos manipMedico = new ManipuladorMedicos();
        
        if (crm.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Digite um cpf.",
                    "Busca", JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            medico = manipMedico.buscaPorCrm(Integer.parseInt(crm));
            
            
            if (medico != null ) {
                medicoEncontrado = medico;
                mostraDados();
                
            
            } else {
                JOptionPane.showMessageDialog(rootPane, "Não encontrado!",
                        "Busca", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btMedicoBuscarEditarBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(MedicoBuscarEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicoBuscarEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicoBuscarEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicoBuscarEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicoBuscarEditar().setVisible(true);
            }
        });
    }
    private void limpaCampos() {
        textMedicoBuscarEditar.setText("");
        textMedicoBuscarEditarCRM.setText("");
        
}    
    
    
    private void mostraDados() {
    textMedicoBuscarEditar.setText("NOME: "+ medicoEncontrado.getNome() +"\n" +
    "CRM: "  + medicoEncontrado.getCrm()+ "\n" +
    "ESPECIALIZAÇÃO: "+ medicoEncontrado.getEspecializacao()+ "\n" +
    "TELEFONE: " + medicoEncontrado.getTelefone()+ "\n");    
       
 }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMedicoBuscarEditarBuscar;
    private javax.swing.JButton btMedicoBuscarEditarConfirmar;
    private javax.swing.JButton btMedicoBuscarEditarLimpar;
    private javax.swing.JButton btMedicoBuscarEditarVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textMedicoBuscarEditar;
    private javax.swing.JTextField textMedicoBuscarEditarCRM;
    // End of variables declaration//GEN-END:variables
}
