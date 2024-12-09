/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package auth;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author sakab
 */
public class splash extends javax.swing.JFrame {

    /**
     * Creates new form splash
     */


    public splash() {
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(true);
        initComponents();

        try {
            // Memuat font dari file
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("src/fontAssets/FontsFree-Net-Poppins-ExtraBold.ttf")).deriveFont(70f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);

            textApung = new JLabel();
            textApung.setFont(customFont); // Menggunakan font kustom
            textApung.setForeground(new Color(255, 111, 113));
            textApung.setText("Si APUNG");

            // Menambahkan JLabel ke jPanel1 dengan AbsoluteConstraints
            jPanel1.add(textApung, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 230, -1, -1));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Mengatur ukuran jendela
        this.setSize(1920, 1080); // Atur ukuran sesuai kebutuhan
        this.setLocationRelativeTo(null); // Agar posisi center saat dibuka
    }

  



    public void customInit() {

        this.setLocationRelativeTo(null);
        this.setResizable(false);

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textApung = new javax.swing.JLabel();
        si = new javax.swing.JLabel();
        get_started = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/kemenkes_icon.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 17, 140, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/splash_icon.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, 830));

        jLabel5.setFont(new java.awt.Font("Calisto MT", 1, 50)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 111, 113));
        jLabel5.setText("Selamat Datang");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 390, 60));

        textApung.setFont(new java.awt.Font("Arial", 1, 45)); // NOI18N
        textApung.setForeground(new java.awt.Color(255, 111, 113));
        textApung.setText("Sistem Antrian Pengunjung");
        jPanel1.add(textApung, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 310, 620, 60));

        si.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        si.setForeground(new java.awt.Color(255, 153, 204));
        si.setText("Si APUNG");
        jPanel1.add(si, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 190, 10, 10));

        get_started.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        get_started.setForeground(new java.awt.Color(255, 255, 255));
        get_started.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        get_started.setText("Get Started");
        get_started.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                get_startedMouseClicked(evt);
            }
        });
        jPanel1.add(get_started, new org.netbeans.lib.awtextra.AbsoluteConstraints(1229, 632, 310, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/corner.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 640, -1, -1));

        exit.setBackground(new java.awt.Color(204, 0, 51));
        exit.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 0, 51));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1890, 10, 20, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void get_startedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_get_startedMouseClicked
        // TODO add your handling code here:
        loginauth loginFrame = new loginauth();
        loginFrame.setVisible(true); // Menampilkan JFrame login
        this.dispose(); // Menutup JFrame splash
    }//GEN-LAST:event_get_startedMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
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
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel get_started;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel si;
    private javax.swing.JLabel textApung;
    // End of variables declaration//GEN-END:variables
}