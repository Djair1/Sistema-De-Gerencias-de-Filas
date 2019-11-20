/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QMS.FastLine.Telas;

import com.QMS.FastLine.CadastroModelo.LoginSistema;
import javax.swing.JOptionPane;

/**
 *
 * @author query
 */
public class JfuncioLogin extends javax.swing.JFrame {

    /**
     * Creates new form JCadastro
     */
    public JfuncioLogin() {
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

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        entrar = new javax.swing.JButton();
        ajuda = new javax.swing.JButton();
        codigo = new javax.swing.JPasswordField();
        usuarioFuncio = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        senhaFuncio = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setTitle("Fast Line");
        setMinimumSize(new java.awt.Dimension(250, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USUARIO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 80, 210, 14);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SENHA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 180, 210, 14);

        entrar.setBackground(new java.awt.Color(0, 0, 153));
        entrar.setForeground(new java.awt.Color(255, 255, 255));
        entrar.setText("ENTRAR");
        entrar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        getContentPane().add(entrar);
        entrar.setBounds(30, 263, 90, 30);

        ajuda.setBackground(new java.awt.Color(0, 0, 153));
        ajuda.setForeground(new java.awt.Color(255, 255, 255));
        ajuda.setText("AJUDA");
        ajuda.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajudaActionPerformed(evt);
            }
        });
        getContentPane().add(ajuda);
        ajuda.setBounds(130, 263, 90, 30);

        codigo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        codigo.setBorder(null);
        getContentPane().add(codigo);
        codigo.setBounds(30, 150, 190, 30);

        usuarioFuncio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        usuarioFuncio.setBorder(null);
        usuarioFuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioFuncioActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioFuncio);
        usuarioFuncio.setBounds(30, 100, 190, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 100, 210, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 150, 210, 30);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));

        senhaFuncio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        senhaFuncio.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(senhaFuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(senhaFuncio, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 200, 212, 30);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CODIGO");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 130, 210, 14);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/QMS/FastLine/PNG/Funcionario.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 250, 350);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioFuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioFuncioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioFuncioActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        // TODO add your handling code here:

        try {
            LoginSistema ls = new LoginSistema();
            String usuario = this.usuarioFuncio.getText();
            String senha = this.senhaFuncio.getText();
            int codigo = Integer.parseInt(this.codigo.getText());
            ls.LoginFuncionario(usuario, senha, codigo);
            clean();
        } catch (Exception e) {
            clean();
            JOptionPane.showMessageDialog(rootPane, "Funcionario não encontrado !!!!!");
        }

    }//GEN-LAST:event_entrarActionPerformed

    private void ajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajudaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Não consegue efetuar o login !\n Entre em contato com o administrador.");
    }//GEN-LAST:event_ajudaActionPerformed

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
            java.util.logging.Logger.getLogger(JfuncioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfuncioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfuncioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfuncioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfuncioLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajuda;
    private javax.swing.JPasswordField codigo;
    private javax.swing.JButton entrar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField senhaFuncio;
    private javax.swing.JTextField usuarioFuncio;
    // End of variables declaration//GEN-END:variables

    public void clean() {

        usuarioFuncio.setText("");
        senhaFuncio.setText("");
        codigo.setText("");

    }

}
