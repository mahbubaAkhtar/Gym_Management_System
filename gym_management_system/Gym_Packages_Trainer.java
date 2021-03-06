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
public class Gym_Packages_Trainer extends javax.swing.JFrame {

    /**
     * Creates new form Gym_Packages
     */
    String pack;
    public Gym_Packages_Trainer() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }
     
    
    
    String getpackage() {
        if (packageCheckBox1.isSelected()) {
            return " Quaterly ----------------3 months ------------ 4000 ";
        } else if (packageCheckBox2.isSelected()) {
            return " Half Yearly --------------6 months ------------6000";
        } else if (packageCheckBox3.isSelected()) {
            return " One Year Single --------12th months -------- 8000 ";
        } else if (packageCheckBox4.isSelected()) {
            return " One Year Couple -------12th months --------14000";
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
        jLabel2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        packageCheckBox1 = new javax.swing.JCheckBox();
        packageCheckBox2 = new javax.swing.JCheckBox();
        packageCheckBox3 = new javax.swing.JCheckBox();
        packageCheckBox4 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 0, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/package (1).png"))); // NOI18N
        jLabel1.setText("gym packages");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 490, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 620, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, -1, 30));

        backButton.setFont(new java.awt.Font("Blackadder ITC", 1, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 51, 102));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 3));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 110, 50));

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 51, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 14)); // NOI18N
        jLabel3.setText(" Quaterly ----------------3 months ------------ 4000 ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 310, 30));

        jLabel4.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 14)); // NOI18N
        jLabel4.setText(" Half Yearly --------------6 months ------------6000");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 300, 30));

        jLabel5.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 14)); // NOI18N
        jLabel5.setText(" One Year Single --------12th months -------- 8000 ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 310, 30));

        jLabel6.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 14)); // NOI18N
        jLabel6.setText(" One Year Couple -------12th months --------14000");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 320, 30));

        packageCheckBox1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        packageCheckBox1.setText("PACKAGE-1:");
        packageCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageCheckBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(packageCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        packageCheckBox2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        packageCheckBox2.setText("PACKAGE-2:");
        packageCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageCheckBox2ActionPerformed(evt);
            }
        });
        jPanel3.add(packageCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        packageCheckBox3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        packageCheckBox3.setText("PACKAGE-3:");
        packageCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageCheckBox3ActionPerformed(evt);
            }
        });
        jPanel3.add(packageCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, 20));

        packageCheckBox4.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        packageCheckBox4.setText("PACKAGE-4:");
        packageCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageCheckBox4ActionPerformed(evt);
            }
        });
        jPanel3.add(packageCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 560, 210));

        jButton1.setFont(new java.awt.Font("Blackadder ITC", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Done");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 3));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 90, 50));

        jLabel7.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        jLabel7.setText("Name :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        jLabel8.setText("ID      :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        nameTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 330, -1));

        idTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 330, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        int close=JOptionPane.showConfirmDialog(null,"Do you really want to close application","Selet",JOptionPane.YES_NO_OPTION);
        if(close==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Trainer_Home_Page().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void packageCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageCheckBox1ActionPerformed
        // TODO add your handling code here:
        pack="packageCheckBox1";
        if(packageCheckBox1.isSelected())
        {
            packageCheckBox2.setSelected(false);
            packageCheckBox3.setSelected(false);
            packageCheckBox4.setSelected(false);
            
        }
    }//GEN-LAST:event_packageCheckBox1ActionPerformed

    private void packageCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageCheckBox3ActionPerformed
        // TODO add your handling code here:
        pack="packageCheckBox3";
        if(packageCheckBox3.isSelected())
        {
            packageCheckBox1.setSelected(false);
            packageCheckBox2.setSelected(false);
            packageCheckBox4.setSelected(false);
            
        }
    }//GEN-LAST:event_packageCheckBox3ActionPerformed

    private void packageCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageCheckBox2ActionPerformed
        // TODO add your handling code here:
        pack="packageCheckBox2";
        if(packageCheckBox2.isSelected())
        {
            packageCheckBox1.setSelected(false);
            packageCheckBox3.setSelected(false);
            packageCheckBox4.setSelected(false);
            
        }
    }//GEN-LAST:event_packageCheckBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String member_id=idTextField.getText();
        String name=nameTextField.getText();
        
        
        
        try {
             File f =new File("gym_package.txt");
            //FileWriter fw=new FileWriter(f);
            FileWriter fw=new FileWriter(f,true);
            fw.write("ID :  "  +member_id);
            fw.write("\r\n");
            fw.write("Name :  " +name);
            fw.write("\r\n");
            fw.write(getpackage());
            fw.write("\r\n");
            fw.close();
        }
        catch (Exception e) {
             JOptionPane.showMessageDialog(this, "File not found");
        }
        
    
        
        JOptionPane.showMessageDialog(this, "Thank you for taking our package");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void packageCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageCheckBox4ActionPerformed
        // TODO add your handling code here:
        pack="packageCheckBox4";
        if(packageCheckBox4.isSelected())
        {
            packageCheckBox1.setSelected(false);
            packageCheckBox2.setSelected(false);
            packageCheckBox3.setSelected(false);
            
        }
    }//GEN-LAST:event_packageCheckBox4ActionPerformed

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
            java.util.logging.Logger.getLogger(Gym_Packages_Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gym_Packages_Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gym_Packages_Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gym_Packages_Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gym_Packages_Trainer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JCheckBox packageCheckBox1;
    private javax.swing.JCheckBox packageCheckBox2;
    private javax.swing.JCheckBox packageCheckBox3;
    private javax.swing.JCheckBox packageCheckBox4;
    // End of variables declaration//GEN-END:variables
}
