/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym_management_system;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ZC
 */
public class Admin_Home_Page extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Home_Page
     */
    public Admin_Home_Page() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
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
        newMemberButton = new javax.swing.JButton();
        memberListButton = new javax.swing.JButton();
        gymPackageButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        paymentButton = new javax.swing.JButton();
        memberDetailsButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        packageButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newMemberButton.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        newMemberButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add-user_1.png"))); // NOI18N
        newMemberButton.setText("New Member");
        newMemberButton.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 0, 255)));
        newMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMemberButtonActionPerformed(evt);
            }
        });
        jPanel1.add(newMemberButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 250, 80));

        memberListButton.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        memberListButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/members.png"))); // NOI18N
        memberListButton.setText("Members List");
        memberListButton.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 0, 255)));
        memberListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberListButtonActionPerformed(evt);
            }
        });
        jPanel1.add(memberListButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 270, 80));

        gymPackageButton.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        gymPackageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/package (1).png"))); // NOI18N
        gymPackageButton.setText("Gym Packages");
        gymPackageButton.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 0, 255)));
        gymPackageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gymPackageButtonActionPerformed(evt);
            }
        });
        jPanel1.add(gymPackageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 250, 80));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setText("TO Admin page");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        welcomeLabel.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        welcomeLabel.setText("WELCOME");
        jPanel1.add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 320, -1));

        paymentButton.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        paymentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hand.png"))); // NOI18N
        paymentButton.setText("Payment");
        paymentButton.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 0, 255)));
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });
        jPanel1.add(paymentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 280, 80));

        memberDetailsButton.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        memberDetailsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/resume.png"))); // NOI18N
        memberDetailsButton.setText("Members Details");
        memberDetailsButton.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 0, 255)));
        memberDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberDetailsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(memberDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 280, 80));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 40, 30));

        backButton.setFont(new java.awt.Font("Blackadder ITC", 1, 24)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 3));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 130, 50));

        packageButton.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        packageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/checklist (1).png"))); // NOI18N
        packageButton.setText("Package List");
        packageButton.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 0, 255)));
        packageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageButtonActionPerformed(evt);
            }
        });
        jPanel1.add(packageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 280, 80));

        jButton2.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/list.png"))); // NOI18N
        jButton2.setText("Payment Member List");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 0, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 270, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMemberButtonActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
        NewMember member=new NewMember();
        member.setVisible(true);
    }//GEN-LAST:event_newMemberButtonActionPerformed

    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Payment member=new Payment();
        member.setVisible(true);
    }//GEN-LAST:event_paymentButtonActionPerformed

    private void memberDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberDetailsButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Member_Details member=new Member_Details();
        member.setVisible(true);
    }//GEN-LAST:event_memberDetailsButtonActionPerformed

    private void memberListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberListButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Member_List member=new Member_List();
        member.setVisible(true);
        
    }//GEN-LAST:event_memberListButtonActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        int close=JOptionPane.showConfirmDialog(null,"Do you really want to close application","Selet",JOptionPane.YES_NO_OPTION);
        if(close==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void gymPackageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gymPackageButtonActionPerformed
        // TODO add your handling code here:
        
      setVisible(false);
        Gym_Packages_Admin pack=new Gym_Packages_Admin();
        pack.setVisible(true);
        
    }//GEN-LAST:event_gymPackageButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new Login_Admin().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Payment_Member_List payment=new Payment_Member_List();
        payment.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void packageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Package_List_Admin list=new Package_List_Admin();
        list.setVisible(true);

    }//GEN-LAST:event_packageButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Home_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton gymPackageButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton memberDetailsButton;
    private javax.swing.JButton memberListButton;
    private javax.swing.JButton newMemberButton;
    private javax.swing.JButton packageButton;
    private javax.swing.JButton paymentButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
