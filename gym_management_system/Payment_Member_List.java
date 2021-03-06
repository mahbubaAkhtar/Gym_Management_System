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
public class Payment_Member_List extends javax.swing.JFrame {

    /**
     * Creates new form Payment_Member_List
     */
    public Payment_Member_List() {
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
        jPanel2 = new javax.swing.JPanel();
        payMemberListLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        clickButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        paymentMemberListTextField = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 0, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        payMemberListLabel.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        payMemberListLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/list.png"))); // NOI18N
        payMemberListLabel.setText("payment member list");
        jPanel2.add(payMemberListLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 800, 80));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 50, 30));

        backButton.setFont(new java.awt.Font("Blackadder ITC", 1, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(51, 0, 204));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 3));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 100, 50));

        clickButton.setFont(new java.awt.Font("Blackadder ITC", 1, 24)); // NOI18N
        clickButton.setForeground(new java.awt.Color(204, 0, 0));
        clickButton.setText("Click Here");
        clickButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 3));
        clickButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clickButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 130, 60));

        paymentMemberListTextField.setBackground(new java.awt.Color(255, 153, 255));
        paymentMemberListTextField.setColumns(20);
        paymentMemberListTextField.setRows(5);
        jScrollPane1.setViewportView(paymentMemberListTextField);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 640, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        int close=JOptionPane.showConfirmDialog(null,"Do you really want to close application","Selet",JOptionPane.YES_NO_OPTION);
        if(close==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void clickButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickButtonActionPerformed
        // TODO add your handling code here:
        try{
            File f=new File("payment.txt");
            Scanner input=new Scanner(f);
            String read= " ";
            while(input.hasNext())
            {
                read+=input.nextLine()+"\n";
            }
            paymentMemberListTextField.setText(read);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "File not found");
        }
    }//GEN-LAST:event_clickButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Admin_Home_Page().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Payment_Member_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment_Member_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment_Member_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment_Member_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment_Member_List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton clickButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel payMemberListLabel;
    private javax.swing.JTextArea paymentMemberListTextField;
    // End of variables declaration//GEN-END:variables
}
