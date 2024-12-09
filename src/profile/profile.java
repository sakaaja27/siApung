/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package profile;

import auth.splash;
import dashboard.dashboard;
import javax.swing.JFrame;
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
         // Mengatur ukuran jendela
        this.setSize(1920, 1080); // Atur ukuran sesuai kebutuhan
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

        myaccount_txt = new javax.swing.JLabel();
        daftar_pasien = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        nama_profile = new javax.swing.JLabel();
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

        password.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Ganti Kata Sandi");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 468, -1, 50));

        nama_profile.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        nama_profile.setForeground(new java.awt.Color(255, 255, 255));
        nama_profile.setText("Username");
        getContentPane().add(nama_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

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
        getContentPane().add(icon_hum, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 440, 70, 100));

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
        getContentPane().add(icon_password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 70, 90));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon.png"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 230, -1, -1));

        icon_pasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_peoplewhite.png"))); // NOI18N
        icon_pasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_pasienMouseClicked(evt);
            }
        });
        getContentPane().add(icon_pasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, 90, 150));

        icon_people.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_userwhie.png"))); // NOI18N
        getContentPane().add(icon_people, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 287, 70, 90));

        rectangle_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rectangle_profile.png"))); // NOI18N
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
    private javax.swing.JLabel nama_profile;
    private javax.swing.JPanel navTop;
    private javax.swing.JLabel password;
    private javax.swing.JLabel rectangle_profile;
    // End of variables declaration//GEN-END:variables
}