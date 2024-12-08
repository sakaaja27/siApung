/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pasien;

import auth.splash;
import dashboard.dashboard;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ScrollPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author sakab
 */
public class pasien extends javax.swing.JFrame {

    /**
     * Creates new form pasien
     */
    public pasien() {
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(true);

        initComponents();
        // Mengatur ukuran jendela
        this.setSize(1920, 1080); // Atur ukuran sesuai kebutuhan
        this.setLocationRelativeTo(null);

        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dafpasien_txt = new javax.swing.JLabel();
        nama_pasien = new javax.swing.JLabel();
        nik_txt = new javax.swing.JLabel();
        no_antrian_txt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        nik_field = new javax.swing.JTextField();
        nama_pasien_field = new javax.swing.JTextField();
        nomor_antrian_field = new javax.swing.JTextField();
        nik_grey = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        namapasien_grey1 = new javax.swing.JLabel();
        antrian_grey1 = new javax.swing.JLabel();
        hps_btn = new javax.swing.JLabel();
        simpan_btn = new javax.swing.JLabel();
        delete_bgdark = new javax.swing.JLabel();
        simpan_bgdark = new javax.swing.JLabel();
        icon_signout = new javax.swing.JLabel();
        icon_home = new javax.swing.JLabel();
        navTop = new javax.swing.JPanel();
        sidepanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dafpasien_txt.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        dafpasien_txt.setForeground(new java.awt.Color(255, 255, 255));
        dafpasien_txt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dafpasien_txt.setText("Data Antrian Pasien");
        getContentPane().add(dafpasien_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 350, 50));

        nama_pasien.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        nama_pasien.setForeground(new java.awt.Color(52, 55, 217));
        nama_pasien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nama_pasien.setText("Nama Pasien");
        getContentPane().add(nama_pasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 190, 50));

        nik_txt.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        nik_txt.setForeground(new java.awt.Color(52, 55, 217));
        nik_txt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nik_txt.setText("Nomor Induk Keluarga");
        getContentPane().add(nik_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 270, 50));

        no_antrian_txt.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        no_antrian_txt.setForeground(new java.awt.Color(52, 55, 217));
        no_antrian_txt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        no_antrian_txt.setText("Nomor Antrian");
        getContentPane().add(no_antrian_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 50));

        jTable.setBackground(new java.awt.Color(250, 154, 156));
        jTable.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTable.setForeground(new java.awt.Color(0, 0, 0));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {" B01", "Saka", "1234567212"},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No Antrian", "Nama Pasien", "NIK"
            }
        ));
        // Mengatur header tabel
        javax.swing.table.JTableHeader tableHeader = jTable.getTableHeader();
        tableHeader.setFont(new java.awt.Font("Trebuchet MS", java.awt.Font.PLAIN, 24)); // Mengatur font header
        tableHeader.setBackground(Color.BLACK);
        tableHeader.setForeground(Color.BLACK);
        jTable.setGridColor(new java.awt.Color(0, 0, 0));
        jTable.setOpaque(false);
        jTable.setRowHeight(40);
        jTable.setRowHeight(40);
        jTable.setSelectionBackground(new java.awt.Color(225, 232, 237));
        jTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable.setShowGrid(true);
        jTable.setUpdateSelectionOnSort(false);
        jTable.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 1300, 880));

        nik_field.setBackground(new java.awt.Color(225, 232, 237));
        nik_field.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        nik_field.setForeground(new java.awt.Color(0, 0, 0));
        nik_field.setBorder(null);
        getContentPane().add(nik_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 430, 70));

        nama_pasien_field.setBackground(new java.awt.Color(225, 232, 237));
        nama_pasien_field.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        nama_pasien_field.setForeground(new java.awt.Color(0, 0, 0));
        nama_pasien_field.setBorder(null);
        getContentPane().add(nama_pasien_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 430, 70));

        nomor_antrian_field.setBackground(new java.awt.Color(225, 232, 237));
        nomor_antrian_field.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        nomor_antrian_field.setForeground(new java.awt.Color(0, 0, 0));
        nomor_antrian_field.setBorder(null);
        getContentPane().add(nomor_antrian_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 430, 70));

        nik_grey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rectanglegrey.png"))); // NOI18N
        getContentPane().add(nik_grey, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 460, 90));

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

        namapasien_grey1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rectanglegrey.png"))); // NOI18N
        getContentPane().add(namapasien_grey1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 460, 90));

        antrian_grey1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rectanglegrey.png"))); // NOI18N
        getContentPane().add(antrian_grey1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 140, 460, 90));

        hps_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        hps_btn.setForeground(new java.awt.Color(255, 255, 255));
        hps_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hps_btn.setText("Hapus");
        getContentPane().add(hps_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 170, 50));

        simpan_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        simpan_btn.setForeground(new java.awt.Color(255, 255, 255));
        simpan_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simpan_btn.setText("Simpan");
        getContentPane().add(simpan_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 170, 50));

        delete_bgdark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rectangledarkrey.png"))); // NOI18N
        getContentPane().add(delete_bgdark, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, -1, 60));

        simpan_bgdark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rectangledarkrey.png"))); // NOI18N
        getContentPane().add(simpan_bgdark, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, -1, 60));

        icon_signout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_signout.png"))); // NOI18N
        icon_signout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_signoutMouseClicked(evt);
            }
        });
        getContentPane().add(icon_signout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 1011, -1, 50));

        icon_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_home.png"))); // NOI18N
        icon_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_homeMouseClicked(evt);
            }
        });
        getContentPane().add(icon_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 970, -1, -1));

        navTop.setBackground(new java.awt.Color(250, 154, 156));

        javax.swing.GroupLayout navTopLayout = new javax.swing.GroupLayout(navTop);
        navTop.setLayout(navTopLayout);
        navTopLayout.setHorizontalGroup(
            navTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        navTopLayout.setVerticalGroup(
            navTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(navTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 60));

        sidepanel.setBackground(new java.awt.Color(217, 217, 217));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 530, 1020));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

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
            java.util.logging.Logger.getLogger(pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pasien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel antrian_grey1;
    private javax.swing.JLabel dafpasien_txt;
    private javax.swing.JLabel delete_bgdark;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel hps_btn;
    private javax.swing.JLabel icon_home;
    private javax.swing.JLabel icon_signout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel nama_pasien;
    private javax.swing.JTextField nama_pasien_field;
    private javax.swing.JLabel namapasien_grey1;
    private javax.swing.JPanel navTop;
    private javax.swing.JTextField nik_field;
    private javax.swing.JLabel nik_grey;
    private javax.swing.JLabel nik_txt;
    private javax.swing.JLabel no_antrian_txt;
    private javax.swing.JTextField nomor_antrian_field;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JLabel simpan_bgdark;
    private javax.swing.JLabel simpan_btn;
    // End of variables declaration//GEN-END:variables
}
