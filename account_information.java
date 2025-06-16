
package internalFrame;

import Database.dbcon;
import activity.login;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class account_information extends javax.swing.JInternalFrame {

      public  String UserNumber;
      dbcon databasecon=new dbcon();
   
    public account_information(String name, String number, String email, String gender, String address) {
        initComponents();
        setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI UI = (BasicInternalFrameUI) getUI();
        UI.setNorthPane(null);
        
        nametxt.setText("Name : "+name);
        numbertxt.setText("Number : "+ number);
        emailtxt.setText("Email : "+ email);
        gendertxt.setText("Gender : "+ gender);
        adrtxt.setText("Address : "+address);
        UserNumber=number;
        System.out.println(number);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nametxt = new javax.swing.JLabel();
        emailtxt = new javax.swing.JLabel();
        adrtxt = new javax.swing.JLabel();
        numbertxt = new javax.swing.JLabel();
        gendertxt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1280, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Account Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 480, 50));

        nametxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        nametxt.setForeground(new java.awt.Color(255, 255, 255));
        nametxt.setText("Name : Rasel Ahmed");
        jPanel1.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 415, 36));

        emailtxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        emailtxt.setForeground(new java.awt.Color(255, 255, 255));
        emailtxt.setText("Email: Raselj71@gmail.com");
        jPanel1.add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 415, 36));

        adrtxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        adrtxt.setForeground(new java.awt.Color(255, 255, 255));
        adrtxt.setText("Address: Pachani, Bangla Bazar, Sonargaon");
        adrtxt.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(adrtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 415, 90));

        numbertxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        numbertxt.setForeground(new java.awt.Color(255, 255, 255));
        numbertxt.setText("Number : 01836849353");
        jPanel1.add(numbertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 415, 36));

        gendertxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        gendertxt.setForeground(new java.awt.Color(255, 255, 255));
        gendertxt.setText("Gender : Male");
        jPanel1.add(gendertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 415, 36));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Delete Your Profile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 565, 460, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 620));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 790, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String query="DELETE FROM signup WHERE number="+UserNumber+"";
        int option= JOptionPane.showConfirmDialog(null, "Do you want to delete your Profile?","YES",JOptionPane.YES_NO_OPTION);
         if(option==JOptionPane.YES_OPTION){
             try {
                 databasecon.s.executeUpdate(query);
                 JOptionPane.showMessageDialog(null, "Delete Successfully");
                 dispose();
                 login log=new login();
             } catch (SQLException ex) {
                 Logger.getLogger(account_information.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adrtxt;
    private javax.swing.JLabel emailtxt;
    private javax.swing.JLabel gendertxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nametxt;
    private javax.swing.JLabel numbertxt;
    // End of variables declaration//GEN-END:variables
}
