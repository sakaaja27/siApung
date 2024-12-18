/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package profile;

import DB_koneksi.DB;
import auth.splash;
import dashboard.dashboard;
import global.GlobalPreferences;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import pasien.pasien;

/**
 *
 * @author sakab
 */
public class profile extends javax.swing.JFrame {

    /**
     * Creates new form profile
     */
    public profile() {
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(true);
        
        initComponents();
        this.setSize(1920, 1080); // Atur ukuran sesuai kebutuhan
        this.setLocationRelativeTo(null); // Agar posisi center saat dibuka
        username_field.setText(GlobalPreferences.getUsername());
        username_field.addActionListener(e -> {
            isUsernameEdit = false;
            username_field.setEditable(false);
            username_field.setBorder(null);
            username_field.requestFocus(false);
            boolean updateSuccess = updateUsernameInDatabase(username_field.getText());
            if (updateSuccess) {
                JOptionPane.showMessageDialog(null, "Username berhasil diperbarui!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                GlobalPreferences.setUsername(username_field.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat memperbarui username.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
    
    public static boolean updateUsernameInDatabase(String newUsername) {
        boolean success = false;
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            
            String sql = "UPDATE users SET username = ? WHERE username = ?";
            stmt = DB.getConnection().prepareStatement(sql);
            stmt.setString(1, newUsername);
            stmt.setString(2, GlobalPreferences.getUsername());
            // Execute the update
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                success = true; // Update was successful
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
        return success;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myaccount_txt = new javax.swing.JLabel();
        daftar_pasien = new javax.swing.JLabel();
        edit_username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        icon_prof = new javax.swing.JLabel();
        icon_hum1 = new javax.swing.JLabel();
        icon_hum = new javax.swing.JLabel();
        icon_home = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        judul_txt1 = new javax.swing.JLabel();
        judul_txt = new javax.swing.JLabel();
        icon_signout = new javax.swing.JLabel();
        icon_password1 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        icon_pasien = new javax.swing.JLabel();
        username_field = new javax.swing.JTextField();
        icon_people = new javax.swing.JLabel();
        rectangle_profile = new javax.swing.JLabel();
        navTop = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myaccount_txt.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        myaccount_txt.setForeground(new java.awt.Color(255, 111, 113));
        myaccount_txt.setText("My Account");
        getContentPane().add(myaccount_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        daftar_pasien.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        daftar_pasien.setForeground(new java.awt.Color(255, 255, 255));
        daftar_pasien.setText("Daftar Pasien");
        daftar_pasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daftar_pasienMouseClicked(evt);
            }
        });
        getContentPane().add(daftar_pasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, 670, 150));

        edit_username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_humwhite.png"))); // NOI18N
        edit_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_usernameMouseClicked(evt);
            }
        });
        getContentPane().add(edit_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, 70, 100));

        password.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Ganti Kata Sandi");
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 418, 670, 180));

        icon_prof.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_profile.png"))); // NOI18N
        getContentPane().add(icon_prof, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        icon_hum1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_humwhite.png"))); // NOI18N
        icon_hum1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_hum1MouseClicked(evt);
            }
        });
        getContentPane().add(icon_hum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 610, 80, 140));

        icon_hum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_humwhite.png"))); // NOI18N
        getContentPane().add(icon_hum, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 450, 70, 100));

        icon_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_home.png"))); // NOI18N
        icon_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_homeMouseClicked(evt);
            }
        });
        getContentPane().add(icon_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1810, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/kemenkes_icon.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 940, -1, -1));

        judul_txt1.setFont(new java.awt.Font("Trebuchet MS", 1, 40)); // NOI18N
        judul_txt1.setForeground(new java.awt.Color(255, 111, 113));
        judul_txt1.setText("Sistem  Antrian Pengunjung");
        getContentPane().add(judul_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 250, -1, -1));

        judul_txt.setFont(new java.awt.Font("Trebuchet MS", 1, 70)); // NOI18N
        judul_txt.setForeground(new java.awt.Color(255, 111, 113));
        judul_txt.setText("Si APUNG");
        getContentPane().add(judul_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 170, -1, -1));

        icon_signout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_signout.png"))); // NOI18N
        icon_signout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_signoutMouseClicked(evt);
            }
        });
        getContentPane().add(icon_signout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 970, -1, 50));

        icon_password1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_keywhite.png"))); // NOI18N
        getContentPane().add(icon_password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 100, 180));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon.png"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 230, -1, -1));

        icon_pasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_peoplewhite.png"))); // NOI18N
        icon_pasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_pasienMouseClicked(evt);
            }
        });
        getContentPane().add(icon_pasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, 90, 150));

        username_field.setEditable(false);
        username_field.setBackground(new java.awt.Color(255, 111, 113));
        username_field.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        username_field.setForeground(new java.awt.Color(255, 255, 255));
        username_field.setText("Username");
        username_field.setBorder(null);
        username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(username_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 660, 100));

        icon_people.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_userwhie.png"))); // NOI18N
        getContentPane().add(icon_people, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 287, 70, 90));

        rectangle_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rectangle_profile.png"))); // NOI18N
        rectangle_profile.setText("Username");
        getContentPane().add(rectangle_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 910, -1));

        navTop.setBackground(new java.awt.Color(217, 217, 217));
        navTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(navTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 130));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void icon_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_homeMouseClicked
        // TODO add your handling code here:
        dashboard dash = new dashboard();
        dash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_icon_homeMouseClicked

    private void icon_signoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_signoutMouseClicked
        // TODO add your handling code here:
        splash front = new splash();
        this.dispose();
        front.setVisible(true);
    }//GEN-LAST:event_icon_signoutMouseClicked

    private void daftar_pasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftar_pasienMouseClicked
        pasien daftarpasien = new pasien();
        daftarpasien.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_daftar_pasienMouseClicked

    private void icon_pasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_pasienMouseClicked
        pasien daftarpasien = new pasien();
        daftarpasien.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_icon_pasienMouseClicked

    private void icon_hum1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_hum1MouseClicked
        pasien daftarpasien = new pasien();
        daftarpasien.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_icon_hum1MouseClicked
    boolean isUsernameEdit = false;
    private void edit_usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_usernameMouseClicked
        if (isUsernameEdit) {
            isUsernameEdit = false;
            username_field.setEditable(false);
            username_field.setBorder(null);
            username_field.requestFocus(false);
            boolean updateSuccess = updateUsernameInDatabase(username_field.getText());
            if (updateSuccess) {
                JOptionPane.showMessageDialog(null, "Username berhasil diperbarui!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                GlobalPreferences.setUsername(username_field.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat memperbarui username.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } else {
            Border lineBorder = BorderFactory.createLineBorder(Color.WHITE, 2);
            Border emptyBorder = new EmptyBorder(0, 5, 0, 0);  // left padding 10px
            Border compoundBorder = BorderFactory.createCompoundBorder(lineBorder, emptyBorder);
            username_field.setEditable(true);
            username_field.setBorder(compoundBorder);
            username_field.requestFocusInWindow();
            isUsernameEdit = true;
        }
    }//GEN-LAST:event_edit_usernameMouseClicked

    private void username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_fieldActionPerformed

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        try {
            EditPassword editPassword = new EditPassword();
            editPassword.setVisible(true);
            System.out.println("Halooo");
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_passwordMouseClicked

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
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel daftar_pasien;
    private javax.swing.JLabel edit_username;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon_home;
    private javax.swing.JLabel icon_hum;
    private javax.swing.JLabel icon_hum1;
    private javax.swing.JLabel icon_pasien;
    private javax.swing.JLabel icon_password1;
    private javax.swing.JLabel icon_people;
    private javax.swing.JLabel icon_prof;
    private javax.swing.JLabel icon_signout;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel judul_txt;
    private javax.swing.JLabel judul_txt1;
    private javax.swing.JLabel myaccount_txt;
    private javax.swing.JPanel navTop;
    private javax.swing.JLabel password;
    private javax.swing.JLabel rectangle_profile;
    private javax.swing.JTextField username_field;
    // End of variables declaration//GEN-END:variables
}
