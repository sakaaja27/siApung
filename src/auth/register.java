/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package auth;

import DB_koneksi.DB;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sakab
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
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

        jPanel1 = new javax.swing.JPanel();
        kemenkes_icon = new javax.swing.JLabel();
        icon_regis = new javax.swing.JLabel();
        registext = new javax.swing.JLabel();
        jCheckBox = new javax.swing.JCheckBox();
        PassField = new javax.swing.JPasswordField();
        rectfive = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        rectfour = new javax.swing.JLabel();
        AddressField = new javax.swing.JTextField();
        recttree = new javax.swing.JLabel();
        LastNameField = new javax.swing.JTextField();
        rectsecond = new javax.swing.JLabel();
        firstNameField1 = new javax.swing.JTextField();
        rectfirst = new javax.swing.JLabel();
        addresstext = new javax.swing.JLabel();
        passtext = new javax.swing.JLabel();
        lastnametext = new javax.swing.JLabel();
        firstnametext = new javax.swing.JLabel();
        usernametext = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        kembali = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        register = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        rectangle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kemenkes_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/kemenkes_icon.png"))); // NOI18N
        jPanel1.add(kemenkes_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, -1, 90));

        icon_regis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_regis.png"))); // NOI18N
        jPanel1.add(icon_regis, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 200, 170));

        registext.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        registext.setForeground(new java.awt.Color(255, 255, 255));
        registext.setText("Register");
        jPanel1.add(registext, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, 70));

        jCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox.setBorder(null);
        jCheckBox.setContentAreaFilled(false);
        jCheckBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/eye_icon.png"))); // NOI18N
        jCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 710, -1, 50));

        PassField.setBackground(new java.awt.Color(255, 255, 255));
        PassField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        PassField.setForeground(new java.awt.Color(0, 0, 0));
        PassField.setBorder(null);
        PassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassFieldActionPerformed(evt);
            }
        });
        jPanel1.add(PassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 710, 900, 60));

        rectfive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rectangle_fullwhite.png"))); // NOI18N
        jPanel1.add(rectfive, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 700, -1, -1));

        UsernameField.setBackground(new java.awt.Color(255, 255, 255));
        UsernameField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        UsernameField.setForeground(new java.awt.Color(0, 0, 0));
        UsernameField.setToolTipText("");
        UsernameField.setBorder(null);
        UsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(UsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 610, 960, 60));

        rectfour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rectangle_fullwhite.png"))); // NOI18N
        jPanel1.add(rectfour, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, -1, -1));

        AddressField.setBackground(new java.awt.Color(255, 255, 255));
        AddressField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        AddressField.setForeground(new java.awt.Color(0, 0, 0));
        AddressField.setToolTipText("");
        AddressField.setBorder(null);
        AddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressFieldActionPerformed(evt);
            }
        });
        jPanel1.add(AddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, 960, 60));

        recttree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rectangle_fullwhite.png"))); // NOI18N
        jPanel1.add(recttree, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, -1, -1));

        LastNameField.setBackground(new java.awt.Color(255, 255, 255));
        LastNameField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        LastNameField.setForeground(new java.awt.Color(0, 0, 0));
        LastNameField.setToolTipText("");
        LastNameField.setBorder(null);
        LastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(LastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 960, 60));

        rectsecond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rectangle_fullwhite.png"))); // NOI18N
        jPanel1.add(rectsecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, -1, -1));

        firstNameField1.setBackground(new java.awt.Color(255, 255, 255));
        firstNameField1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        firstNameField1.setForeground(new java.awt.Color(0, 0, 0));
        firstNameField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        firstNameField1.setToolTipText("");
        firstNameField1.setBorder(null);
        firstNameField1.setMinimumSize(new java.awt.Dimension(1, 28));
        firstNameField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameField1ActionPerformed(evt);
            }
        });
        jPanel1.add(firstNameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 960, 60));

        rectfirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rectangle_fullwhite.png"))); // NOI18N
        jPanel1.add(rectfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, -1, -1));

        addresstext.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        addresstext.setForeground(new java.awt.Color(255, 255, 255));
        addresstext.setText("Address");
        jPanel1.add(addresstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, -1, 50));

        passtext.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        passtext.setForeground(new java.awt.Color(255, 255, 255));
        passtext.setText("Password");
        jPanel1.add(passtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 720, -1, 50));

        lastnametext.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lastnametext.setForeground(new java.awt.Color(255, 255, 255));
        lastnametext.setText("Last Name");
        jPanel1.add(lastnametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, 50));

        firstnametext.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        firstnametext.setForeground(new java.awt.Color(255, 255, 255));
        firstnametext.setText("First Name");
        jPanel1.add(firstnametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, 50));

        usernametext.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        usernametext.setForeground(new java.awt.Color(255, 255, 255));
        usernametext.setText("Username");
        jPanel1.add(usernametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 620, -1, 50));

        jPanel3.setBackground(new java.awt.Color(226, 79, 82));

        kembali.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        kembali.setForeground(new java.awt.Color(255, 255, 255));
        kembali.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kembali.setText("Kembali");
        kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(kembali, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 850, 420, 90));

        jPanel2.setBackground(new java.awt.Color(226, 79, 82));

        register.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        register.setText("Register");
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(register, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 850, 420, 90));

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

        rectangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rectangle.png"))); // NOI18N
        jPanel1.add(rectangle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, 880));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameFieldActionPerformed

    private void firstNameField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameField1ActionPerformed

    private void UsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameFieldActionPerformed

    private void AddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressFieldActionPerformed

    private void PassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassFieldActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliMouseClicked
        // TODO add your handling code here:
        loginauth front = new loginauth();
        this.dispose();
        front.setVisible(true);
    }//GEN-LAST:event_kembaliMouseClicked

    private void jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxActionPerformed
        // untuk melihat password
        if (jCheckBox.isSelected()) {
            PassField.setEchoChar((char) 0);
        } else {
            PassField.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBoxActionPerformed

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        String firstName = firstNameField1.getText().trim();
        String lastName = LastNameField.getText().trim();
        String address = AddressField.getText().trim();
        String username = UsernameField.getText().trim();
        String password = String.valueOf(PassField.getPassword()).trim();

        
        if (firstName.isEmpty() || lastName.isEmpty() || address.isEmpty() || username.isEmpty() || password.isEmpty()) {
            showMessage("Harap isi semua field", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

       
        if (isUsernameTaken(username)) {
            showMessage("Username sudah digunakan, harap ganti username lain", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        String hashedPassword = hashPassword(password);

       
        if (registerUser(firstName, lastName, address, username, hashedPassword)) {
            showMessage("Register berhasil", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            openLoginForm();
        }
    }//GEN-LAST:event_registerMouseClicked

    private void showMessage(String message, String title, int messageType) {
        JOptionPane.showMessageDialog(null, message, title, messageType);
    }
    
    private boolean isUsernameTaken(String username) {
        String query = "SELECT COUNT(*) FROM `users` WHERE `username` = ?";
        try (PreparedStatement ps = DB.getConnection().prepareStatement(query)) {
            ps.setString(1, username);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0; 
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; 
    }

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

    private boolean registerUser(String firstName, String lastName, String address, String username, String password) {
        String query = "INSERT INTO `users` (`first_name`, `last_name`, `address`, `username`, `password`) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = DB.getConnection().prepareStatement(query)) {
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, address);
            ps.setString(4, username);
            ps.setString(5, password);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    private void openLoginForm() {
        loginauth loginForm = new loginauth(); 
        loginForm.setVisible(true);
        this.dispose();
    }

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressField;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel addresstext;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField firstNameField1;
    private javax.swing.JLabel firstnametext;
    private javax.swing.JLabel icon_regis;
    private javax.swing.JCheckBox jCheckBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel kembali;
    private javax.swing.JLabel kemenkes_icon;
    private javax.swing.JLabel lastnametext;
    private javax.swing.JLabel passtext;
    private javax.swing.JLabel rectangle;
    private javax.swing.JLabel rectfirst;
    private javax.swing.JLabel rectfive;
    private javax.swing.JLabel rectfour;
    private javax.swing.JLabel rectsecond;
    private javax.swing.JLabel recttree;
    private javax.swing.JLabel register;
    private javax.swing.JLabel registext;
    private javax.swing.JLabel usernametext;
    // End of variables declaration//GEN-END:variables
}
