package allpage;


import Project.InsertUpdateDelete;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
//        setSize(2000 , 1050);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        answer_txt = new javax.swing.JTextField();
        signup_passwrd = new javax.swing.JPasswordField();
        SecurityQtn = new javax.swing.JComboBox<>();
        signUp_Btn = new javax.swing.JButton();
        login_btn = new javax.swing.JButton();
        frgtpass_btn = new javax.swing.JButton();
        address_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 30, 40, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Signup");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Security Question");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Answer");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 50, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, -1, 20));

        name_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_txtActionPerformed(evt);
            }
        });
        getContentPane().add(name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 340, -1));

        email_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_txtActionPerformed(evt);
            }
        });
        getContentPane().add(email_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 340, -1));

        answer_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        answer_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer_txtActionPerformed(evt);
            }
        });
        getContentPane().add(answer_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 340, -1));

        signup_passwrd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        signup_passwrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_passwrdActionPerformed(evt);
            }
        });
        getContentPane().add(signup_passwrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 340, -1));

        SecurityQtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SecurityQtn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is the name of your first pet ?", "What was your first car ?", "What elementary school did you attend ?", "What is the name of the town where  you were born ?" }));
        SecurityQtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecurityQtnActionPerformed(evt);
            }
        });
        getContentPane().add(SecurityQtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 340, -1));

        signUp_Btn.setBackground(new java.awt.Color(102, 0, 0));
        signUp_Btn.setForeground(new java.awt.Color(255, 255, 255));
        signUp_Btn.setText("Signup");
        signUp_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUp_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(signUp_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, -1, -1));

        login_btn.setBackground(new java.awt.Color(102, 0, 0));
        login_btn.setForeground(new java.awt.Color(255, 255, 255));
        login_btn.setText("Login");
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        getContentPane().add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, -1, -1));

        frgtpass_btn.setBackground(new java.awt.Color(102, 0, 0));
        frgtpass_btn.setForeground(new java.awt.Color(255, 255, 255));
        frgtpass_btn.setText("Forget Password ?");
        frgtpass_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frgtpass_btnActionPerformed(evt);
            }
        });
        getContentPane().add(frgtpass_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 500, -1, -1));

        address_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(address_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 340, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/signup.PNG"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code her
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Exit ?","SELECT",JOptionPane.YES_NO_OPTION);
        if(a==0)
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_txtActionPerformed

    private void SecurityQtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecurityQtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecurityQtnActionPerformed

    private void signup_passwrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_passwrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signup_passwrdActionPerformed

    private void answer_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer_txtActionPerformed

    private void signUp_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUp_BtnActionPerformed
        // TODO add your handling code here:
        String name = name_txt.getText();
        String email = email_txt.getText();
        String password = signup_passwrd.getText();
        String security_question = (String)SecurityQtn.getSelectedItem();
        String answer = answer_txt.getText();
        String address = address_txt.getText();
        
        if(name_txt.getText().trim().isEmpty() || email_txt.getText().trim().isEmpty() || password.equals("") || answer_txt.getText().trim().isEmpty() || address_txt.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "All entries is Required");
        }
        else{
            String Query ;
            Query = "Insert into users Values('"+name+"','"+email+"','"+password+"','"+security_question+"','"+answer+"','"+address+"','false') ";
            InsertUpdateDelete.setData(Query , "Register Successfully.");
            setVisible(false);    //Reset the window 
            new SignUp().setVisible(true);
            
        }
        
    }//GEN-LAST:event_signUp_BtnActionPerformed

    private void frgtpass_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frgtpass_btnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ForgetPassword().setVisible(true);
    }//GEN-LAST:event_frgtpass_btnActionPerformed

    private void name_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_txtActionPerformed

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_login_btnActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SecurityQtn;
    private javax.swing.JTextField address_txt;
    private javax.swing.JTextField answer_txt;
    private javax.swing.JTextField email_txt;
    private javax.swing.JButton frgtpass_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton login_btn;
    private javax.swing.JTextField name_txt;
    private javax.swing.JButton signUp_Btn;
    private javax.swing.JPasswordField signup_passwrd;
    // End of variables declaration//GEN-END:variables
}
