/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.view;

import br.com.control.Habilidade;
import br.com.model.ManterHabilidade;
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
public final class TelaMenuHabilidade extends javax.swing.JFrame {

    Habilidade h = new Habilidade();
    ManterHabilidade dao = new ManterHabilidade();

    public TelaMenuHabilidade() {
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
        jTregistrarNomeHabilidade = new javax.swing.JTextField();
        jBregistrarRegiao = new javax.swing.JButton();
        jBdeletarHabilidade = new javax.swing.JButton();
        jBatualizarLista = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTdeletarIdHabilidade = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTAlterarIdHabilidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTalterarNomeHabilidade = new javax.swing.JTextField();
        jBalterarHabilidade = new javax.swing.JButton();
        jBpesquisarHabilidade = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTregistroDescricaoHabilidade = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTAlterarDescricaoHabilidade = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(239, 238, 221));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Menu Habilidade");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setAlignmentX(0.2F);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setMinimumSize(new java.awt.Dimension(20, 0));
        jScrollPane1.setViewportView(jTable1);

        jBregistrarRegiao.setText("Registrar");
        jBregistrarRegiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregistrarRegiaoActionPerformed(evt);
            }
        });

        jBdeletarHabilidade.setText("Deletar");
        jBdeletarHabilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdeletarHabilidadeActionPerformed(evt);
            }
        });

        jBatualizarLista.setText("Altualizar");
        jBatualizarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBatualizarListaActionPerformed(evt);
            }
        });

        jLabel2.setText("Digite o nome da Habilidade :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Registrar Habilidade");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Deletar Habilidade ");

        jLabel5.setText("Digite o Id da região :");

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Alterar Habilidade");

        jLabel7.setText("Digite o Id que deseja alterar :");

        jLabel8.setText("Nome :");

        jBalterarHabilidade.setText("Alterar");
        jBalterarHabilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarHabilidadeActionPerformed(evt);
            }
        });

        jBpesquisarHabilidade.setText("Pesquisar");
        jBpesquisarHabilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpesquisarHabilidadeActionPerformed(evt);
            }
        });

        jLabel9.setText("Digite a descrição da Habilidade :");

        jTregistroDescricaoHabilidade.setColumns(20);
        jTregistroDescricaoHabilidade.setRows(5);
        jScrollPane2.setViewportView(jTregistroDescricaoHabilidade);

        jLabel10.setText("Descrição:");

        jTAlterarDescricaoHabilidade.setColumns(20);
        jTAlterarDescricaoHabilidade.setRows(5);
        jScrollPane3.setViewportView(jTAlterarDescricaoHabilidade);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBatualizarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jBregistrarRegiao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel2))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jTregistrarNomeHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(74, 74, 74)
                                        .addComponent(jTdeletarIdHabilidade))
                                    .addComponent(jLabel3))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTAlterarIdHabilidade))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTalterarNomeHabilidade)
                                            .addComponent(jScrollPane3)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBpesquisarHabilidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBalterarHabilidade)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton4)
                        .addGap(212, 212, 212)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jBdeletarHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(jLabel7)
                    .addComponent(jTAlterarIdHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTregistrarNomeHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTalterarNomeHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTdeletarIdHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jBdeletarHabilidade))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBalterarHabilidade)
                            .addComponent(jBregistrarRegiao)
                            .addComponent(jBpesquisarHabilidade))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBatualizarLista)
                .addContainerGap())
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

    private void jBdeletarHabilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdeletarHabilidadeActionPerformed
        // TODO add your handling code here:
        DeletarRegiao();
    }//GEN-LAST:event_jBdeletarHabilidadeActionPerformed

    private void jBpesquisarHabilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpesquisarHabilidadeActionPerformed
        // TODO add your handling code here:
        PesquisarRegiao();
    }//GEN-LAST:event_jBpesquisarHabilidadeActionPerformed

    private void jBalterarHabilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalterarHabilidadeActionPerformed
        // TODO add your handling code here:
        AlterarRegiao();
        jTAlterarIdHabilidade.setEditable(true);
    }//GEN-LAST:event_jBalterarHabilidadeActionPerformed

    public void ListarPesquisa() {
        try {

            DefaultTableModel consulta = (DefaultTableModel) jTable1.getModel();
            consulta.setNumRows(0);

            ArrayList<Habilidade> habilidade = dao.PesquisarTudoHabilidade();

            for (int i = 0; i < habilidade.size(); i++) {
                h = habilidade.get(i);
                consulta.addRow(new Object[]{
                    habilidade.get(i).getId(),
                    habilidade.get(i).getHabilidade_nome(),
                    habilidade.get(i).getDescricao()
                });
            }
        } catch (Exception e) {
            System.out.println("Erro ListarPesquisa()" + e.getMessage());
        }
    }
    
    public void DeletarRegiao(){
        h.setId(Integer.valueOf(jTdeletarIdHabilidade.getText()));
        jTdeletarIdHabilidade.setText("");

        try {
            dao.deletar(h);
        } catch (Exception ex) {
            Logger.getLogger(TelaMenuHabilidade.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Deletado!");
    }
    
    public void RegistrarRegiao(){
        h.setHabilidade_nome(jTregistrarNomeHabilidade.getText());
        h.setDescricao(jTregistroDescricaoHabilidade.getText());
        jTregistrarNomeHabilidade.setText("");
        jTregistroDescricaoHabilidade.setText("");

        try {
            dao.inserir(h);
        } catch (SQLException ex) {
            Logger.getLogger(TelaMenuHabilidade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void PesquisarRegiao() {
        try {
            h.setId(Integer.valueOf(jTAlterarIdHabilidade.getText()));
            dao.PesquisarRegistroHabilidade(h);
            JOptionPane.showMessageDialog(null, h.getHabilidade_nome());
            jTalterarNomeHabilidade.setText(h.getHabilidade_nome());
            jTAlterarDescricaoHabilidade.setText(h.getDescricao());
            jTAlterarIdHabilidade.setEditable(false);

        } catch (Exception e) {
            System.out.println("Erro PesquisarRegiao :" + e.getMessage());
        }
    }

    public void AlterarRegiao() {
        try {

            h.setId(Integer.valueOf(jTAlterarIdHabilidade.getText()));
            h.setHabilidade_nome(jTalterarNomeHabilidade.getText());
            h.setDescricao(jTAlterarDescricaoHabilidade.getText());
            dao.EditarHabilidade(h);

            jTalterarNomeHabilidade.setText("");
            jTAlterarIdHabilidade.setText("");
            jTAlterarDescricaoHabilidade.setText("");
            jTAlterarIdHabilidade.requestFocus();
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
            java.util.logging.Logger.getLogger(TelaMenuHabilidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenuHabilidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenuHabilidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenuHabilidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuHabilidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBalterarHabilidade;
    private javax.swing.JButton jBatualizarLista;
    private javax.swing.JButton jBdeletarHabilidade;
    private javax.swing.JButton jBpesquisarHabilidade;
    private javax.swing.JButton jBregistrarRegiao;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTAlterarDescricaoHabilidade;
    private javax.swing.JTextField jTAlterarIdHabilidade;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTalterarNomeHabilidade;
    private javax.swing.JTextField jTdeletarIdHabilidade;
    private javax.swing.JTextField jTregistrarNomeHabilidade;
    private javax.swing.JTextArea jTregistroDescricaoHabilidade;
    // End of variables declaration//GEN-END:variables
}