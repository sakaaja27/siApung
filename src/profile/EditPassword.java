/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profile;

import DB_koneksi.DB;
import global.GlobalPreferences;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Hidayah Arif
 */
public class EditPassword extends javax.swing.JFrame {

    /**
     * Creates new form EditPassword
     */
    public EditPassword() {

       this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(true);

        initComponents();
        
        
        this.setLocationRelativeTo(null); // Agar posisi center saat dibuka
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        checkbox_baru = new javax.swing.JCheckBox();
        checkbox_lama = new javax.swing.JCheckBox();
        pw_baru = new javax.swing.JPasswordField();
        pw_lama = new javax.swing.JPasswordField();
        exit = new javax.swing.JLabel();

        jCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox.setBorder(null);
        jCheckBox.setContentAreaFilled(false);
        jCheckBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/eye_icon.png"))); // NOI18N
        jCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 111, 113));
        jLabel1.setText("Ubah Password");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Password Lama");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Password Baru");

        jButton1.setBackground(new java.awt.Color(255, 111, 113));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ubah");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        checkbox_baru.setBackground(new java.awt.Color(255, 255, 255));
        checkbox_baru.setBorder(null);
        checkbox_baru.setContentAreaFilled(false);
        checkbox_baru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/eye_icon.png"))); // NOI18N
        checkbox_baru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_baruActionPerformed(evt);
            }
        });

        checkbox_lama.setBackground(new java.awt.Color(255, 255, 255));
        checkbox_lama.setBorder(null);
        checkbox_lama.setContentAreaFilled(false);
        checkbox_lama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/eye_icon.png"))); // NOI18N
        checkbox_lama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_lamaActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(204, 0, 51));
        exit.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 0, 51));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(pw_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pw_lama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkbox_baru)
                            .addComponent(checkbox_lama))
                        .addContainerGap(83, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addComponent(exit))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkbox_lama)
                    .addComponent(pw_lama, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkbox_baru)
                        .addGap(31, 31, 31)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pw_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxActionPerformed
        // untuk melihat password
        if (checkbox_lama.isSelected()) {
            pw_lama.setEchoChar((char) 0);
        } else {
            pw_lama.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBoxActionPerformed

    private void checkbox_baruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_baruActionPerformed
        // untuk melihat password
        if (checkbox_baru.isSelected()) {
            pw_baru.setEchoChar((char) 0);
        } else {
            pw_baru.setEchoChar('*');
        }
    }//GEN-LAST:event_checkbox_baruActionPerformed

    private void checkbox_lamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_lamaActionPerformed
        if (checkbox_lama.isSelected()) {
            pw_lama.setEchoChar((char) 0);
        } else {
            pw_lama.setEchoChar('*');
        }
    }//GEN-LAST:event_checkbox_lamaActionPerformed
    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] byteData = md.digest();

            StringBuilder sb = new StringBuilder();
            for (byte b : byteData) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        System.out.println(pw_lama.getText().equals(GlobalPreferences.getPassword()));
        System.out.println(GlobalPreferences.getPassword());

        if (pw_lama.getText().equals(GlobalPreferences.getPassword())) {
            try {
                String updateQuery = "UPDATE users SET password = ? WHERE username = ?";
                PreparedStatement pstmt = DB.getConnection().prepareStatement(updateQuery);
                pstmt.setString(1, hashPassword(pw_baru.getText())); // Set the new password
                pstmt.setString(2, GlobalPreferences.getUsername()); // Set the username to find the user

                // Execute the update and check if any rows were affected
                int rowsUpdated = pstmt.executeUpdate();

                if (rowsUpdated > 0) {
                    // Show success message using JOptionPane
                    JOptionPane.showMessageDialog(null, "Password berhasil diubah!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                } else {
                    // Show error message if no rows were updated
                    JOptionPane.showMessageDialog(null, "Ubah password gagal!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {

            }
        } else {
            JOptionPane.showMessageDialog(null, "Password lama salah!", "Gagal!", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

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
            java.util.logging.Logger.getLogger(EditPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkbox_baru;
    private javax.swing.JCheckBox checkbox_lama;
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pw_baru;
    private javax.swing.JPasswordField pw_lama;
    // End of variables declaration//GEN-END:variables
}
