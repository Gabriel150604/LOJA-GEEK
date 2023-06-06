/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import javax.swing.JOptionPane; //Serve para exibir caixas de dialogo de mensagens
import java.sql.Connection; //Conectar ao Banco de dados
import java.sql.SQLException; //Para mostrar erros relacionados ao Banco de dados
import java.sql.PreparedStatement; //Para inserir os dados no banco de dados usando o comando SQL INSERT
import java.sql.DriverManager; //Para informar o nome do Banco de dados, a senha etc.
import java.sql.ResultSet;  //Guardar o que um comando SELECT retorna do banco de dados
/**
 *
 * @author guidi
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        txtSenha = new javax.swing.JPasswordField();
        btnCadastrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();

        setTitle("Login");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 20, 130, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(70, 50, 380, 10);

        lblSenha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(70, 140, 60, 20);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(70, 90, 380, 30);

        lblUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblUsuario.setText("Usuário");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(70, 70, 60, 20);

        jCheckBox1.setText("Visualizar senha");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(70, 190, 130, 20);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(70, 160, 380, 30);

        btnCadastrar.setBackground(new java.awt.Color(51, 102, 255));
        btnCadastrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCadastrar.setText("Cadastre-se");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(340, 270, 110, 30);

        jLabel4.setText("Ainda não tem conta?");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 270, 120, 30);

        btnSalvar.setBackground(new java.awt.Color(51, 102, 255));
        btnSalvar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSalvar.setText("Entrar");
        btnSalvar.setMaximumSize(new java.awt.Dimension(90, 27));
        btnSalvar.setMinimumSize(new java.awt.Dimension(90, 27));
        btnSalvar.setPreferredSize(new java.awt.Dimension(90, 27));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(70, 220, 380, 30);

        setSize(new java.awt.Dimension(536, 379));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        new loginCadastro().setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
          try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_lojageek", "root", "divino");
    PreparedStatement st = conectado.prepareStatement("SELECT * FROM usuarios WHERE usuario = ? AND senha = ?");
    
    st.setString(1, txtUsuario.getText());
    st.setString(2, txtSenha.getText());
    ResultSet resultado =  st.executeQuery();
    
   if (resultado.next()){ //Se encontrou os dados do usuário
               dispose();
               new telaPrincipal().setVisible(true);
            } else { //Se não encontrou o sdadosdo usuário
               JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos");
            }
    
    
} catch (ClassNotFoundException ex) {
    JOptionPane.showMessageDialog(null, ex.getMessage());
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, ex.getMessage());
}
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
