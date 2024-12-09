/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dashboard;

import auth.splash;
import javax.swing.JFrame;
import pasien.pasien;
import profile.profile;

/**
 *
 * @author sakab
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
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

        icon = new javax.swing.JLabel();
        number_antrian_harian = new javax.swing.JLabel();
        total_antri_hari_txt = new javax.swing.JLabel();
        total_seluruh_antrian_txt = new javax.swing.JLabel();
        icon_profile = new javax.swing.JLabel();
        profile_txt = new javax.swing.JLabel();
        chart = new javax.swing.JPanel();
        pasien_side = new javax.swing.JLabel();
        icon_signout = new javax.swing.JLabel();
        signout_txt = new javax.swing.JLabel();
        profile_side = new javax.swing.JLabel();
        icon_samepeople = new javax.swing.JLabel();
        daftarpasien_txt = new javax.swing.JLabel();
        signout_side = new javax.swing.JLabel();
        icon_kemenkes = new javax.swing.JLabel();
        icon_queue_harian = new javax.swing.JLabel();
        number_total = new javax.swing.JLabel();
        icon_queue = new javax.swing.JLabel();
        card_total_antrian = new javax.swing.JLabel();
        card_antrianhariini1 = new javax.swing.JLabel();
        icon_humb = new javax.swing.JLabel();
        dashboard_txt1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel_sidebar = new javax.swing.JPanel();
        jPanel_topnav = new javax.swing.JPanel();
        jPanel_bottomnav = new javax.swing.JPanel();
        dashboard_txt = new javax.swing.JLabel();
        ractangle_dashboard = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_regis.png"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 200, 170));

        number_antrian_harian.setFont(new java.awt.Font("Trebuchet MS", 1, 64)); // NOI18N
        number_antrian_harian.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        number_antrian_harian.setText("99");
        getContentPane().add(number_antrian_harian, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 80, 120));

        total_antri_hari_txt.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        total_antri_hari_txt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_antri_hari_txt.setText("Total Antrian hari ini");
        getContentPane().add(total_antri_hari_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, 260, 50));

        total_seluruh_antrian_txt.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        total_seluruh_antrian_txt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_seluruh_antrian_txt.setText("Total Seluruh Antrian");
        getContentPane().add(total_seluruh_antrian_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 240, 260, 50));

        icon_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_people.png"))); // NOI18N
        getContentPane().add(icon_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        profile_txt.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        profile_txt.setForeground(new java.awt.Color(52, 55, 217));
        profile_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile_txt.setText("Profile");
        profile_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profile_txtMouseClicked(evt);
            }
        });
        getContentPane().add(profile_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 240, 80));

        chart.setBackground(new java.awt.Color(255, 255, 255));
        chart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(177, 0, 7), 5));
        chart.setLayout(new java.awt.BorderLayout());
        getContentPane().add(chart, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 1380, 430));

        pasien_side.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/grey_corner.png"))); // NOI18N
        getContentPane().add(pasien_side, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 90));

        icon_signout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_signout.png"))); // NOI18N
        getContentPane().add(icon_signout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 905, -1, -1));

        signout_txt.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        signout_txt.setForeground(new java.awt.Color(52, 55, 217));
        signout_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signout_txt.setText("Keluar");
        signout_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signout_txtMouseClicked(evt);
            }
        });
        getContentPane().add(signout_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 890, 240, 70));

        profile_side.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/grey_corner.png"))); // NOI18N
        getContentPane().add(profile_side, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 880, -1, 90));

        icon_samepeople.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_otherpeople.png"))); // NOI18N
        getContentPane().add(icon_samepeople, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        daftarpasien_txt.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        daftarpasien_txt.setForeground(new java.awt.Color(52, 55, 217));
        daftarpasien_txt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        daftarpasien_txt.setText("Daftar Pasien");
        daftarpasien_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daftarpasien_txtMouseClicked(evt);
            }
        });
        getContentPane().add(daftarpasien_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 209, 220, 80));

        signout_side.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/grey_corner.png"))); // NOI18N
        getContentPane().add(signout_side, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 90));

        icon_kemenkes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/kemenkes_icon.png"))); // NOI18N
        getContentPane().add(icon_kemenkes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 80, 140, 90));

        icon_queue_harian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_queue.png"))); // NOI18N
        getContentPane().add(icon_queue_harian, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, -1, -1));

        number_total.setFont(new java.awt.Font("Trebuchet MS", 1, 64)); // NOI18N
        number_total.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        number_total.setText("99");
        getContentPane().add(number_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 280, 80, 120));

        icon_queue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_queue.png"))); // NOI18N
        getContentPane().add(icon_queue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 290, -1, -1));

        card_total_antrian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rectanglewhite.png"))); // NOI18N
        getContentPane().add(card_total_antrian, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 240, -1, -1));

        card_antrianhariini1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rectanglewhite.png"))); // NOI18N
        getContentPane().add(card_antrianhariini1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, -1, -1));

        icon_humb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_hamburger.png"))); // NOI18N
        getContentPane().add(icon_humb, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        dashboard_txt1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        dashboard_txt1.setForeground(new java.awt.Color(52, 55, 217));
        dashboard_txt1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboard_txt1.setText("Dashboard");
        getContentPane().add(dashboard_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 120, 50));

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1890, 10, 20, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_sidebar.setBackground(new java.awt.Color(217, 217, 217));
        jPanel_sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel_sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 317, 1080));

        jPanel_topnav.setBackground(new java.awt.Color(250, 154, 156));
        jPanel_topnav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel_topnav, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 1610, 80));

        jPanel_bottomnav.setBackground(new java.awt.Color(253, 217, 217));
        jPanel_bottomnav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard_txt.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        dashboard_txt.setForeground(new java.awt.Color(52, 55, 217));
        dashboard_txt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboard_txt.setText("JAM BUKA LAYANAN KAMI ADALAH PUKUL 07.00 sd 21.00. TERIMA KASIH ATAS KUNJUNGAN ANDA");
        jPanel_bottomnav.add(dashboard_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 1480, 50));

        jPanel1.add(jPanel_bottomnav, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 1020, 1610, 60));

        ractangle_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rectangledashboard.png"))); // NOI18N
        jPanel1.add(ractangle_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void daftarpasien_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarpasien_txtMouseClicked
        // TODO add your handling code here:
        pasien daftarpasien = new pasien();
        daftarpasien.setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_daftarpasien_txtMouseClicked

    private void profile_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_txtMouseClicked
        // TODO add your handling code here:
        profile prof = new profile();
        prof.setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_profile_txtMouseClicked

    private void signout_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signout_txtMouseClicked
        // TODO add your handling code here:
        splash front = new splash();
        this.dispose();
        front.setVisible(true);
    }//GEN-LAST:event_signout_txtMouseClicked

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel card_antrianhariini1;
    private javax.swing.JLabel card_total_antrian;
    private javax.swing.JPanel chart;
    private javax.swing.JLabel daftarpasien_txt;
    private javax.swing.JLabel dashboard_txt;
    private javax.swing.JLabel dashboard_txt1;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon_humb;
    private javax.swing.JLabel icon_kemenkes;
    private javax.swing.JLabel icon_profile;
    private javax.swing.JLabel icon_queue;
    private javax.swing.JLabel icon_queue_harian;
    private javax.swing.JLabel icon_samepeople;
    private javax.swing.JLabel icon_signout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_bottomnav;
    private javax.swing.JPanel jPanel_sidebar;
    private javax.swing.JPanel jPanel_topnav;
    private javax.swing.JLabel number_antrian_harian;
    private javax.swing.JLabel number_total;
    private javax.swing.JLabel pasien_side;
    private javax.swing.JLabel profile_side;
    private javax.swing.JLabel profile_txt;
    private javax.swing.JLabel ractangle_dashboard;
    private javax.swing.JLabel signout_side;
    private javax.swing.JLabel signout_txt;
    private javax.swing.JLabel total_antri_hari_txt;
    private javax.swing.JLabel total_seluruh_antrian_txt;
    // End of variables declaration//GEN-END:variables
}