/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.view;

import br.com.control.Regiao;
import br.com.model.ManterRegiao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karol
 */
public class TelaMenuRegiao extends javax.swing.JFrame {

    Regiao r = new Regiao();
    ManterRegiao dao = new ManterRegiao();

    public TelaMenuRegiao() {
        initComponents();
        ListarPesquisa();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTregistrarNomeRegiao = new javax.swing.JTextField();
        jBregistrarRegiao = new javax.swing.JButton();
        jBdeletarRegiao = new javax.swing.JButton();
        jBatualizarLista = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTdeletarRegiao = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTslterarIdRegiao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTalterarNome = new javax.swing.JTextField();
        jBalterarRegiao = new javax.swing.JButton();
        jBpesquisarRegiao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(239, 238, 221));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Menu Região");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jBregistrarRegiao.setText("Registrar");
        jBregistrarRegiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregistrarRegiaoActionPerformed(evt);
            }
        });

        jBdeletarRegiao.setText("Deletar");
        jBdeletarRegiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdeletarRegiaoActionPerformed(evt);
            }
        });

        jBatualizarLista.setText("Altualizar");
        jBatualizarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBatualizarListaActionPerformed(evt);
            }
        });

        jLabel2.setText("Digite o nome da Região :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Registrar Região");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Deletar Região ");

        jLabel5.setText("Digite o Id da região :");

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Alterar Região");

        jLabel7.setText("Digite o Id que deseja alterar :");

        jLabel8.setText("Nome :");

        jBalterarRegiao.setText("Alterar");
        jBalterarRegiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarRegiaoActionPerformed(evt);
            }
        });

        jBpesquisarRegiao.setText("Pesquisar");
        jBpesquisarRegiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpesquisarRegiaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jBdeletarRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBatualizarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton4)
                                    .addGap(174, 174, 174)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(119, 119, 119)
                                            .addComponent(jBregistrarRegiao))
                                        .addComponent(jLabel4))
                                    .addGap(202, 202, 202)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jBpesquisarRegiao)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBalterarRegiao))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTalterarNome))
                                        .addComponent(jLabel6)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTslterarIdRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTdeletarRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTregistrarNomeRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTregistrarNomeRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTslterarIdRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTalterarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBregistrarRegiao)
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTdeletarRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBalterarRegiao)
                            .addComponent(jBpesquisarRegiao))))
                .addComponent(jBdeletarRegiao)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBatualizarLista)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBregistrarRegiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregistrarRegiaoActionPerformed
        // TODO add your handling code here:
        RegistrarRegiao();

    }//GEN-LAST:event_jBregistrarRegiaoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        TelaBoasVindas Principal = new TelaBoasVindas();
        Principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jBatualizarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBatualizarListaActionPerformed
        // TODO add your handling code here:
           ListarPesquisa();
    }//GEN-LAST:event_jBatualizarListaActionPerformed

    private void jBdeletarRegiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdeletarRegiaoActionPerformed
        // TODO add your handling code here:
        DeletarRegiao();
    }//GEN-LAST:event_jBdeletarRegiaoActionPerformed

    private void jBpesquisarRegiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpesquisarRegiaoActionPerformed
        // TODO add your handling code here:
        PesquisarRegiao();
    }//GEN-LAST:event_jBpesquisarRegiaoActionPerformed

    private void jBalterarRegiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalterarRegiaoActionPerformed
        // TODO add your handling code here:
        AlterarRegiao();
        jTslterarIdRegiao.setEditable(true);
    }//GEN-LAST:event_jBalterarRegiaoActionPerformed

    public void ListarPesquisa() {
        try {

            DefaultTableModel consulta = (DefaultTableModel) jTable1.getModel();
            consulta.setNumRows(0);

            ArrayList<Regiao> regiao = dao.PesquisarTudo();

            for (int i = 0; i < regiao.size(); i++) {
                r = regiao.get(i);
                consulta.addRow(new Object[]{
                    regiao.get(i).getId(),
                    regiao.get(i).getRegiaoNome()
                });
            }
        } catch (Exception e) {
            System.out.println("Erro ListarPesquisa()" + e.getMessage());
        }
    }
    
    public void DeletarRegiao(){
        r.setId(Integer.valueOf(jTdeletarRegiao.getText()));
        jTdeletarRegiao.setText("");

        try {
            dao.deletar(r);
        } catch (Exception ex) {
            Logger.getLogger(TelaMenuRegiao.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Deletado!");
    }
    
    public void RegistrarRegiao(){
        r.setRegiaoNome(jTregistrarNomeRegiao.getText());
        jTregistrarNomeRegiao.setText("");

        try {
            dao.inserir(r);
        } catch (SQLException ex) {
            Logger.getLogger(TelaMenuRegiao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void PesquisarRegiao() {
        try {
            r.setId(Integer.valueOf(jTslterarIdRegiao.getText()));
            dao.PesquisarRegistroRegiao(r);
            JOptionPane.showMessageDialog(null, r.getRegiaoNome());
            jTalterarNome.setText(r.getRegiaoNome());
            jTslterarIdRegiao.setEditable(false);

        } catch (Exception e) {
            System.out.println("Erro PesquisarRegiao :" + e.getMessage());
        }
    }

    public void AlterarRegiao() {
        try {

            r.setId(Integer.valueOf(jTslterarIdRegiao.getText()));
            r.setRegiaoNome(jTalterarNome.getText());
            dao.EditarRegiao(r);

            jTalterarNome.setText("");
            jTslterarIdRegiao.setText("");
            jTslterarIdRegiao.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro de AlterarRegiao: " + e.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(TelaMenuRegiao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenuRegiao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenuRegiao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenuRegiao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuRegiao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBalterarRegiao;
    private javax.swing.JButton jBatualizarLista;
    private javax.swing.JButton jBdeletarRegiao;
    private javax.swing.JButton jBpesquisarRegiao;
    private javax.swing.JButton jBregistrarRegiao;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTalterarNome;
    private javax.swing.JTextField jTdeletarRegiao;
    private javax.swing.JTextField jTregistrarNomeRegiao;
    private javax.swing.JTextField jTslterarIdRegiao;
    // End of variables declaration//GEN-END:variables
}