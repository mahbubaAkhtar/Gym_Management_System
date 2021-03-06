/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym_management_system;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author ZC
 */
public class Gym_Member_Attendence extends javax.swing.JFrame {

    /**
     * Creates new form Attendence
     */
    private String attendence;
    public Gym_Member_Attendence() {
        initComponents();
        
         Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }
    
    
    
    
    
    String getattendence() {
        if (presentRadioButton.isSelected()) {
            return "Present";
        } else if (absentRadioButton.isSelected()) {
            return "Absent";
        } else {
            return null;
        }
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
        jLabel1 = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        memberidTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        presentRadioButton = new javax.swing.JRadioButton();
        absentRadioButton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 0, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/immigration.png"))); // NOI18N
        jLabel1.setText("member attendence form");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 770, 100));

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close.png"))); // NOI18N
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 50, 30));

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 0, 204)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        memberidTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        memberidTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberidTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(memberidTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 270, -1));

        jLabel2.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        jLabel2.setText("Member ID  : ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        nameTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 270, -1));

        jLabel3.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        jLabel3.setText("Name           :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        presentRadioButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        presentRadioButton.setText("Present");
        presentRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentRadioButtonActionPerformed(evt);
            }
        });
        jPanel3.add(presentRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        absentRadioButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        absentRadioButton.setText("Absent");
        absentRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absentRadioButtonActionPerformed(evt);
            }
        });
        jPanel3.add(absentRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        jLabel4.setText("Attendence :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        jLabel5.setText("Date          :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        dateTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(dateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 270, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 600, 230));

        submitButton.setFont(new java.awt.Font("Blackadder ITC", 1, 24)); // NOI18N
        submitButton.setForeground(new java.awt.Color(0, 51, 153));
        submitButton.setText("Submit");
        submitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 100, 40));

        backButton.setFont(new java.awt.Font("Blackadder ITC", 1, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 51, 153));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        int close=JOptionPane.showConfirmDialog(null,"Do you really want to close application","Selet",JOptionPane.YES_NO_OPTION);
        if(close==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_closeButtonActionPerformed

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        // TODO add your handling code here:
//        int close=JOptionPane.showConfirmDialog(null,"Do you really want to close application","Selet",JOptionPane.YES_NO_OPTION);
//        if(close==0)
//        {
//            System.exit(0);
//        }
    }//GEN-LAST:event_closeButtonMouseClicked

    private void memberidTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberidTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memberidTextFieldActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void absentRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absentRadioButtonActionPerformed
        // TODO add your handling code here:
          attendence="absentRadioButton";
        if(absentRadioButton.isSelected())
        {
            presentRadioButton.setSelected(false);
            
        }
    }//GEN-LAST:event_absentRadioButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
        new Trainer_Home_Page().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String member_id=memberidTextField.getText();
        String name=nameTextField.getText();
        String date=dateTextField.getText();
        
        
         try
        {
            File f =new File("attendence.txt");
            //FileWriter fw=new FileWriter(f);
            FileWriter fw=new FileWriter(f,true);
            fw.write (member_id);
            fw.write("\r\n");
            fw.write (name);
            fw.write("\r\n");
            fw.write (date);
            fw.write("\r\n");
            fw.write (getattendence());
            fw.write("\r\n");
            fw.close();
            
            JOptionPane.showMessageDialog(null, "Success your attendence");
        }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, "Error");
         }
        
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void presentRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentRadioButtonActionPerformed
        // TODO add your handling code here:
        attendence="presenrRadioButton";
        if(presentRadioButton.isSelected())
        {
            absentRadioButton.setSelected(false);
            
        }
        
    }//GEN-LAST:event_presentRadioButtonActionPerformed

    private void dateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Gym_Member_Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gym_Member_Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gym_Member_Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gym_Member_Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gym_Member_Attendence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton absentRadioButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField memberidTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JRadioButton presentRadioButton;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
