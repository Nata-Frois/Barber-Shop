/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author User
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        textnomesenha = new javax.swing.JLabel();
        textsenha = new javax.swing.JPasswordField();
        jToggleButton1 = new javax.swing.JToggleButton();
        Usuariotext = new javax.swing.JTextField();
        textsenha1 = new javax.swing.JPasswordField();
        Textnameusuario = new javax.swing.JLabel();
        textnomelogin = new javax.swing.JLabel();
        imagempainel = new javax.swing.JLabel();
        Imagemlogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textnomesenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textnomesenha.setForeground(new java.awt.Color(255, 255, 255));
        textnomesenha.setText("Senha");
        getContentPane().add(textnomesenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 50, 50));
        getContentPane().add(textsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 130, 40));

        jToggleButton1.setBackground(new java.awt.Color(51, 204, 0));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jToggleButton1.setText("Entrar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 430, 130, -1));
        getContentPane().add(Usuariotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 130, 40));
        getContentPane().add(textsenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 130, 40));

        Textnameusuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Textnameusuario.setForeground(new java.awt.Color(255, 255, 255));
        Textnameusuario.setText("Usuario");
        getContentPane().add(Textnameusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 70, 50));

        textnomelogin.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        textnomelogin.setForeground(new java.awt.Color(255, 255, 255));
        textnomelogin.setText("Login");
        getContentPane().add(textnomelogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 90, 50));

        imagempainel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/painel login.png"))); // NOI18N
        imagempainel.setText("jLabel3");
        getContentPane().add(imagempainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 310, 360));

        Imagemlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/login.jpg"))); // NOI18N
        Imagemlogin.setText("jLabel1");
        getContentPane().add(Imagemlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 702, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagemlogin;
    private javax.swing.JLabel Textnameusuario;
    private javax.swing.JTextField Usuariotext;
    private javax.swing.JLabel imagempainel;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel textnomelogin;
    private javax.swing.JLabel textnomesenha;
    private javax.swing.JPasswordField textsenha;
    private javax.swing.JPasswordField textsenha1;
    // End of variables declaration//GEN-END:variables
}
