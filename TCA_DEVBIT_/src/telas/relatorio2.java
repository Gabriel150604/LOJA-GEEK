/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author guidi
 */
public class relatorio2 extends javax.swing.JFrame {

    /**
     * Creates new form relatorio2
     */
    public relatorio2() {
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

        BtnMaiorEstoque = new javax.swing.JButton();
        BtnMenorEstoque = new javax.swing.JButton();
        BtnMenosVendidos = new javax.swing.JButton();
        BtnMaisVendidos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnMaiorEstoque1 = new javax.swing.JButton();
        BtnMenorEstoque6 = new javax.swing.JButton();
        BtnMaisVendidos2 = new javax.swing.JButton();
        BtnMenosVendidos2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnCadastrarTelaPrincipal = new javax.swing.JMenu();
        MnRelatorioTelaPrincipal = new javax.swing.JMenu();
        MnAjudaTelaPrincipal = new javax.swing.JMenu();

        BtnMaiorEstoque.setBackground(new java.awt.Color(102, 102, 255));
        BtnMaiorEstoque.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnMaiorEstoque.setForeground(new java.awt.Color(255, 255, 255));
        BtnMaiorEstoque.setText("Maior Estoque");
        BtnMaiorEstoque.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnMaiorEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMaiorEstoqueActionPerformed(evt);
            }
        });

        BtnMenorEstoque.setBackground(new java.awt.Color(102, 102, 255));
        BtnMenorEstoque.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnMenorEstoque.setForeground(new java.awt.Color(255, 255, 255));
        BtnMenorEstoque.setText("Menor Estoque");
        BtnMenorEstoque.setToolTipText("");
        BtnMenorEstoque.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnMenorEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenorEstoqueActionPerformed(evt);
            }
        });

        BtnMenosVendidos.setBackground(new java.awt.Color(102, 102, 255));
        BtnMenosVendidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnMenosVendidos.setForeground(new java.awt.Color(255, 255, 255));
        BtnMenosVendidos.setText("Menos Vendidos");
        BtnMenosVendidos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnMenosVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenosVendidosActionPerformed(evt);
            }
        });

        BtnMaisVendidos.setBackground(new java.awt.Color(102, 102, 255));
        BtnMaisVendidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnMaisVendidos.setForeground(new java.awt.Color(255, 255, 255));
        BtnMaisVendidos.setText("Mais Vendidos");
        BtnMaisVendidos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnMaisVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMaisVendidosActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        BtnMaiorEstoque1.setBackground(new java.awt.Color(102, 102, 255));
        BtnMaiorEstoque1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnMaiorEstoque1.setForeground(new java.awt.Color(255, 255, 255));
        BtnMaiorEstoque1.setText("Maior Estoque");
        BtnMaiorEstoque1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnMaiorEstoque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMaiorEstoque1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMaiorEstoque1);
        BtnMaiorEstoque1.setBounds(390, 180, 180, 60);

        BtnMenorEstoque6.setBackground(new java.awt.Color(102, 102, 255));
        BtnMenorEstoque6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnMenorEstoque6.setForeground(new java.awt.Color(255, 255, 255));
        BtnMenorEstoque6.setText("Menor Estoque");
        BtnMenorEstoque6.setToolTipText("");
        BtnMenorEstoque6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnMenorEstoque6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenorEstoque6ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMenorEstoque6);
        BtnMenorEstoque6.setBounds(390, 250, 180, 60);

        BtnMaisVendidos2.setBackground(new java.awt.Color(102, 102, 255));
        BtnMaisVendidos2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnMaisVendidos2.setForeground(new java.awt.Color(255, 255, 255));
        BtnMaisVendidos2.setText("Mais Vendidos");
        BtnMaisVendidos2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnMaisVendidos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMaisVendidos2ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMaisVendidos2);
        BtnMaisVendidos2.setBounds(390, 40, 180, 60);

        BtnMenosVendidos2.setBackground(new java.awt.Color(102, 102, 255));
        BtnMenosVendidos2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnMenosVendidos2.setForeground(new java.awt.Color(255, 255, 255));
        BtnMenosVendidos2.setText("Menos Vendidos");
        BtnMenosVendidos2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnMenosVendidos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenosVendidos2ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMenosVendidos2);
        BtnMenosVendidos2.setBounds(390, 110, 180, 60);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Produto", "Tipo Unitario", "Fornecedor"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 40, 340, 280);

        jMenuBar1.setBackground(new java.awt.Color(51, 102, 255));

        MnCadastrarTelaPrincipal.setText("Cadastro");
        jMenuBar1.add(MnCadastrarTelaPrincipal);

        MnRelatorioTelaPrincipal.setText("Relatorio");
        jMenuBar1.add(MnRelatorioTelaPrincipal);

        MnAjudaTelaPrincipal.setText("Ajuda");
        jMenuBar1.add(MnAjudaTelaPrincipal);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(616, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMaiorEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMaiorEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMaiorEstoqueActionPerformed

    private void BtnMenorEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenorEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMenorEstoqueActionPerformed

    private void BtnMaisVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMaisVendidosActionPerformed

    }//GEN-LAST:event_BtnMaisVendidosActionPerformed

    private void BtnMenosVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenosVendidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMenosVendidosActionPerformed

    private void BtnMaiorEstoque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMaiorEstoque1ActionPerformed
        
    }//GEN-LAST:event_BtnMaiorEstoque1ActionPerformed

    private void BtnMenorEstoque6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenorEstoque6ActionPerformed
        
    }//GEN-LAST:event_BtnMenorEstoque6ActionPerformed

    private void BtnMaisVendidos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMaisVendidos2ActionPerformed
       
    }//GEN-LAST:event_BtnMaisVendidos2ActionPerformed

    private void BtnMenosVendidos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenosVendidos2ActionPerformed
        
    }//GEN-LAST:event_BtnMenosVendidos2ActionPerformed

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
            java.util.logging.Logger.getLogger(relatorio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(relatorio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(relatorio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(relatorio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new relatorio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMaiorEstoque;
    private javax.swing.JButton BtnMaiorEstoque1;
    private javax.swing.JButton BtnMaisVendidos;
    private javax.swing.JButton BtnMaisVendidos2;
    private javax.swing.JButton BtnMenorEstoque;
    private javax.swing.JButton BtnMenorEstoque6;
    private javax.swing.JButton BtnMenosVendidos;
    private javax.swing.JButton BtnMenosVendidos2;
    private javax.swing.JMenu MnAjudaTelaPrincipal;
    private javax.swing.JMenu MnCadastrarTelaPrincipal;
    private javax.swing.JMenu MnRelatorioTelaPrincipal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
