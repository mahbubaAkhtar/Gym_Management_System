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
public class NewMember extends javax.swing.JFrame{

    /**
     * Creates new form NewMember
     */
    private String gender;
    public NewMember() {
        initComponents();
         Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }
    
    String getGender() {
        if (maleRadioButton.isSelected()) {
            return "Male";
        } else if (femaleRadioButton.isSelected()) {
            return "Female";
        } else {
            return null;
        }

    }
  
    public void Newmem()
    {
        String member_id=memberIDTextField.getText();
       
        String phone_number=phoneNumberTextField.getText();
        String email=emailTextField.getText();
        //String gender =femaleRadioButton.getText().toString();
        String age=ageComboBox.getSelectedItem().toString();
        String home_address=homeAddressComboBox.getSelectedItem().toString();
        String nid_number=nidTextField.getText();
        String gym_time=gymTimeComboBox.getSelectedItem().toString();
        String payment=payAmountTextField.getText();
        String name=nameTextField.getText();
        NewMember_constructor m1 = new NewMember_constructor(name,member_id,phone_number,email,age,home_address,nid_number,payment);
    
        
        try
        {
            File f =new File("gym.txt");
            //FileWriter fw=new FileWriter(f);
            FileWriter fw=new FileWriter(f,true);
            fw.write (member_id);
            fw.write("\r\n");
            fw.write (name);
            fw.write("\r\n");
            fw.write (phone_number);
            fw.write("\r\n");
            fw.write (email);
            fw.write("\r\n");
            fw.write(getGender());
            fw.write("\r\n");
            fw.write (age);
            fw.write("\r\n");
            fw.write (home_address);
            fw.write("\r\n");
            fw.write (nid_number);
            fw.write("\r\n");
            fw.write (gym_time);
            fw.write("\r\n");
            fw.write (payment);
            fw.write("\r\n");
            fw.close();
            
            JOptionPane.showMessageDialog(null, "Success");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        try
        {
            File fi =new File("member_list.txt");
            //FileWriter fw=new FileWriter(fi);
            FileWriter fw=new FileWriter(fi,true);
            fw.write (member_id);
            fw.write("\r\n");
            fw.write (name);
            fw.write("\r\n");
        
            fw.close();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
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

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        memberIDLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        femaleRadioButton = new javax.swing.JRadioButton();
        maleRadioButton = new javax.swing.JRadioButton();
        homeAddressLabel = new javax.swing.JLabel();
        gymTimeLabel = new javax.swing.JLabel();
        gymTimeComboBox = new javax.swing.JComboBox<>();
        nidLabel = new javax.swing.JLabel();
        nidTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        payAmountLabel = new javax.swing.JLabel();
        payAmountTextField = new javax.swing.JTextField();
        memberIDTextField = new javax.swing.JTextField();
        ageComboBox = new javax.swing.JComboBox<>();
        homeAddressComboBox = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 153));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setForeground(new java.awt.Color(0, 0, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        memberIDLabel.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        memberIDLabel.setForeground(new java.awt.Color(0, 0, 153));
        memberIDLabel.setText("Member ID ");
        jPanel4.add(memberIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 25, -1, -1));

        nameLabel.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 0, 153));
        nameLabel.setText("Name ");
        jPanel4.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 63, -1, -1));

        nameTextField.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        nameTextField.setForeground(new java.awt.Color(0, 0, 153));
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        jPanel4.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 60, 290, -1));

        phoneNumberLabel.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        phoneNumberLabel.setForeground(new java.awt.Color(0, 0, 153));
        phoneNumberLabel.setText("Phone Number");
        jPanel4.add(phoneNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 107, -1, -1));

        phoneNumberTextField.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        phoneNumberTextField.setForeground(new java.awt.Color(0, 0, 153));
        jPanel4.add(phoneNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 104, 288, -1));

        emailLabel.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(0, 0, 153));
        emailLabel.setText("Email Address");
        jPanel4.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, -1, -1));

        emailTextField.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(0, 0, 153));
        jPanel4.add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 133, 288, -1));

        genderLabel.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(0, 0, 153));
        genderLabel.setText("Gender  ");
        jPanel4.add(genderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 176, -1, -1));

        femaleRadioButton.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        femaleRadioButton.setForeground(new java.awt.Color(0, 0, 153));
        femaleRadioButton.setText("Female");
        femaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioButtonActionPerformed(evt);
            }
        });
        jPanel4.add(femaleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 172, -1, -1));

        maleRadioButton.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        maleRadioButton.setForeground(new java.awt.Color(0, 0, 153));
        maleRadioButton.setText("Male");
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });
        jPanel4.add(maleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 200, -1, -1));

        homeAddressLabel.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        homeAddressLabel.setForeground(new java.awt.Color(0, 0, 153));
        homeAddressLabel.setText(" Home Address  ");
        jPanel4.add(homeAddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        gymTimeLabel.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        gymTimeLabel.setForeground(new java.awt.Color(0, 0, 153));
        gymTimeLabel.setText("Gym Time  ");
        jPanel4.add(gymTimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 355, -1, -1));

        gymTimeComboBox.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        gymTimeComboBox.setForeground(new java.awt.Color(0, 0, 153));
        gymTimeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5:00 AM- 7:00 AM", "7:00 AM-9:00 AM", "9:00 AM-12:00 PM", "4:00 PM-6:00 PM", "6:00 PM-8:00 PM", "8:00 PM-10:00 PM" }));
        jPanel4.add(gymTimeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 352, -1, -1));

        nidLabel.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        nidLabel.setForeground(new java.awt.Color(0, 0, 153));
        nidLabel.setText("NID Number ");
        jPanel4.add(nidLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 278, -1, -1));

        nidTextField.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        nidTextField.setForeground(new java.awt.Color(0, 0, 153));
        jPanel4.add(nidTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 290, -1));

        ageLabel.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(0, 0, 153));
        ageLabel.setText("Age  ");
        jPanel4.add(ageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 232, -1, -1));

        payAmountLabel.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        payAmountLabel.setForeground(new java.awt.Color(0, 0, 153));
        payAmountLabel.setText("Amount to Pay/month ");
        jPanel4.add(payAmountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 393, -1, 25));

        payAmountTextField.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        payAmountTextField.setForeground(new java.awt.Color(0, 0, 153));
        jPanel4.add(payAmountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 394, 223, -1));

        memberIDTextField.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        memberIDTextField.setForeground(new java.awt.Color(0, 0, 102));
        jPanel4.add(memberIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 22, 290, -1));

        ageComboBox.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        ageComboBox.setForeground(new java.awt.Color(0, 0, 204));
        ageComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80" }));
        jPanel4.add(ageComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 170, 30));

        homeAddressComboBox.setFont(new java.awt.Font("ArhialkhanGMJ", 1, 18)); // NOI18N
        homeAddressComboBox.setForeground(new java.awt.Color(0, 0, 204));
        homeAddressComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Faridpur", "Gazipur", "Gopalganj", "Jamalpur", "Kishoreganj", "Madaripur", "Manikganj", "Munshiganj", "Mymensingh", "Narayanganj", "Narsingdi", "Netrokona", "Rajbari", "Shariatpur", "Sherpur", "Tangail                         ", "Bogra                              ", "Joypurhat                         ", "Naogaon                      ", "Natore                             ", "Nawabganj                          ", "Pabna                              ", "Rajshahi                         ", "Sirajgonj                           ", "Dinajpur                           ", "Gaibandha                          ", "Kurigram                           ", "Lalmonirhat                        ", "Nilphamari                         ", "Panchagarh                         ", "Rangpur                            ", "Thakurgaon                         ", "Barguna                       ", "Barisal                       ", "Bhola                              ", "Jhalokati                          ", "Patuakhali                         ", "Pirojpur                          ", "Bandarban                          ", "Brahmanbaria                       ", "Chandpur                           ", "Chittagong                         ", "Comilla                            ", "Cox''s Bazar                       ", "Feni                               ", "Khagrachari                        ", "Lakshmipur                         ", "Noakhali                           ", "Rangamati                          ", "Habiganj                           ", "Maulvibazar                        ", "Sunamganj                          ", "Sylhet                             ", "Bagerhat                           ", "Chuadanga                          ", "Jessore                            ", "Jhenaidah                          ", "Khulna                             ", "Kushtia                             ", "Magura                             ", "Meherpur                           ", "Narail                             ", "Satkhira   " }));
        jPanel4.add(homeAddressComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 170, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        saveButton.setFont(new java.awt.Font("Blackadder ITC", 1, 24)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 51, 51));
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/direct-download.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel3.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, -1, -1));

        jButton5.setFont(new java.awt.Font("Blackadder ITC", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 102));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 520, 530));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add-user_1.png"))); // NOI18N
        jLabel1.setText("New member");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 11, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 118, 221));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        int close=JOptionPane.showConfirmDialog(null,"Do you really want to Close Application","Selet",JOptionPane.YES_NO_OPTION);
        if(close==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int close=JOptionPane.showConfirmDialog(null,"Do you really want to close application","Selet",JOptionPane.YES_NO_OPTION);
        if(close==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Admin_Home_Page().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
      
        Newmem();
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void femaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioButtonActionPerformed
        // TODO add your handling code here:
        gender="femaleRadioButton";
        if(femaleRadioButton.isSelected())
        {
            maleRadioButton.setSelected(false);
            
        }
    }//GEN-LAST:event_femaleRadioButtonActionPerformed

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed
        // TODO add your handling code here:
        gender="maleRadioButton";
        if(maleRadioButton.isSelected())
        {
            femaleRadioButton.setSelected(false);
            
        }
    }//GEN-LAST:event_maleRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ageComboBox;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JComboBox<String> gymTimeComboBox;
    private javax.swing.JLabel gymTimeLabel;
    private javax.swing.JComboBox<String> homeAddressComboBox;
    private javax.swing.JLabel homeAddressLabel;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JLabel memberIDLabel;
    private javax.swing.JTextField memberIDTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel nidLabel;
    private javax.swing.JTextField nidTextField;
    private javax.swing.JLabel payAmountLabel;
    private javax.swing.JTextField payAmountTextField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
