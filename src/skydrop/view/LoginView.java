package skydrop.view;


import Database.dbcon;
import admin.adminlogin;


import java.awt.Color;
import java.sql.SQLException;

import javax.swing.JOptionPane;




public class LoginView extends javax.swing.JFrame {

 
    public LoginView() {
        initComponents();
        usernametxt.setBackground(new Color(0,0,0,1));
        passwordtxt.setBackground(new Color(0,0,0,1));
        showpass.setVisible(false);
        showpass.setEnabled(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        hidepass = new javax.swing.JLabel();
        remcheckbox = new javax.swing.JCheckBox();
        forgetpasslabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        signuplabel = new javax.swing.JLabel();
        usernametxt = new javax.swing.JTextField();
        passwordtxt = new javax.swing.JPasswordField();
        showpass = new javax.swing.JLabel();
        adminloginbtn = new javax.swing.JLabel();

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/invisible.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 255));
        setBounds(new java.awt.Rectangle(100, 100, 0, 0));
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/bg.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 573, 575));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 580));

        jPanel2.setBackground(new java.awt.Color(25, 118, 221));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 44, 42));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 38)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 70, 598, 57));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Hello! Let's get started");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 133, 598, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(199, 226, 255));
        jLabel5.setText("Username");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 169, 510, -1));

        jLabel6.setForeground(new java.awt.Color(102, 255, 255));
        jLabel6.setText("______________________________________________________________________________");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 214, 390, -1));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 241, -1, 28));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/user.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 200, -1, 35));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(199, 226, 255));
        jLabel9.setText("Password");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 244, -1, -1));

        jLabel10.setForeground(new java.awt.Color(153, 255, 255));
        jLabel10.setText("________________________________________________________");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 294, -1, -1));

        hidepass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/invisible.png"))); // NOI18N
        hidepass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hidepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidepassMouseClicked(evt);
            }
        });
        jPanel2.add(hidepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, 37));

        remcheckbox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        remcheckbox.setForeground(new java.awt.Color(199, 226, 255));
        remcheckbox.setText("Remember Password");
        remcheckbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(remcheckbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 321, -1, -1));

        forgetpasslabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        forgetpasslabel.setForeground(new java.awt.Color(199, 226, 255));
        forgetpasslabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        forgetpasslabel.setText("Forget Password?");
        forgetpasslabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(forgetpasslabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 321, 151, -1));

        jButton1.setBackground(new java.awt.Color(199, 226, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(25, 118, 221));
        jButton1.setText("LOGIN");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 364, 442, 45));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(199, 226, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Don't have an account?");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 441, 290, -1));

        signuplabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signuplabel.setForeground(new java.awt.Color(255, 255, 255));
        signuplabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        signuplabel.setText("Sign Up");
        signuplabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signuplabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signuplabelMouseClicked(evt);
            }
        });
        jPanel2.add(signuplabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 441, 146, -1));

        usernametxt.setFont(usernametxt.getFont().deriveFont(usernametxt.getFont().getSize()+4f));
        usernametxt.setForeground(new java.awt.Color(255, 255, 255));
        usernametxt.setBorder(null);
        usernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametxtActionPerformed(evt);
            }
        });
        jPanel2.add(usernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 188, 390, 40));

        passwordtxt.setFont(passwordtxt.getFont().deriveFont(passwordtxt.getFont().getSize()+4f));
        passwordtxt.setForeground(new java.awt.Color(255, 255, 255));
        passwordtxt.setBorder(null);
        jPanel2.add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 268, 390, 40));

        showpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/eye.png"))); // NOI18N
        showpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpassMouseClicked(evt);
            }
        });
        jPanel2.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, 37));

        adminloginbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        adminloginbtn.setForeground(new java.awt.Color(255, 255, 255));
        adminloginbtn.setText("Admin Login");
        adminloginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminloginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminloginbtnMouseClicked(evt);
            }
        });
        jPanel2.add(adminloginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 610, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void hidepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidepassMouseClicked
        passwordtxt.setEchoChar((char)0);
        hidepass.setVisible(false);
        hidepass.setEnabled(false);
        showpass.setVisible(true);
        showpass.setEnabled(true);
    }//GEN-LAST:event_hidepassMouseClicked

    private void showpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpassMouseClicked
        passwordtxt.setEchoChar((char)8226);
        hidepass.setVisible(true);
        hidepass.setEnabled(true);
        showpass.setVisible(false);
        showpass.setEnabled(false);
    }//GEN-LAST:event_showpassMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dbcon dbconnect=new dbcon();
        String email=usernametxt.getText();
        String password=passwordtxt.getText();
        
          
     
        if (email.equals("")) {
            
            JOptionPane.showMessageDialog(null, "Enter your Username");
            return;
        }
        if (password.equals("")) {
            
            JOptionPane.showMessageDialog(null, "Enter your Password");
            return;
        }
        try {
            
           
             String loginQuery="SELECT *FROM signup WHERE email='"+email+"' AND password='"+password+"'";
             java.sql.ResultSet rs    =   dbconnect.s.executeQuery(loginQuery);
             
            while(rs.next()){
                  JOptionPane.showMessageDialog(null, "login Successfull");
                String name=rs.getString("name");
                String phone=rs.getString("number");
                String gender=rs.getString("gender");
                String address=rs.getString("address");
                
                MainActivity mainActivity=new MainActivity(name, phone, gender, email,address);
                mainActivity.setVisible(true);
                dispose();
              
               // System.out.println("Name:"+name+ "\n" + "phone:"+phone);
            }
             
             
             
            
             
             
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Incorrect Email and Password");
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void usernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametxtActionPerformed

    private void signuplabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signuplabelMouseClicked
        signup s=new signup();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_signuplabelMouseClicked

    private void adminloginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminloginbtnMouseClicked
        // TODO add your handling code here:
         adminlogin s=new adminlogin();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_adminloginbtnMouseClicked

   
    public static void main(String args[]) {
        
      
         

        
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminloginbtn;
    private javax.swing.JLabel forgetpasslabel;
    private javax.swing.JLabel hidepass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JCheckBox remcheckbox;
    private javax.swing.JLabel showpass;
    private javax.swing.JLabel signuplabel;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
