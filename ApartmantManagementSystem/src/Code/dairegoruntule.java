package Code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class dairegoruntule extends javax.swing.JFrame {

    public dairegoruntule() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(null);

        jButton2.setText("ARA");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(860, 420, 130, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daire No", "Daire Oturan Sayısı", "Daire GSM", "Kat No", "Su Abone No", "Elektrik Abone No", "Doğalgaz Abone No" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(580, 430, 224, 65);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1);
        jTextField1.setBounds(290, 430, 264, 65);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Daire No", "Daire Oturan Sayısı", "Daire GSM", "Daire Kat No", "Su Abone No", "Doğalgaz Abone No", "Elektrik Abone No"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(5, 3, 1020, 390);

        jButton3.setText("GERİ");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(40, 460, 100, 30);

        jButton1.setText("HEPSİNİ GÖSTER");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(860, 460, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/LG-V30-Duvar-Kağıdı-Koleksiyonu2 (1).jpg"))); // NOI18N
        jPanel3.add(jLabel1);
        jLabel1.setBounds(0, 0, 1040, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1037, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String secim = (String) jComboBox1.getSelectedItem();
        String yazi = (String) jTextField1.getText();
        int j = 0;
        while (j < 20) {
            jTable1.setValueAt("", j, 0);
            jTable1.setValueAt("", j, 1);
            jTable1.setValueAt("", j, 2);
            jTable1.setValueAt("", j, 3);
            jTable1.setValueAt("", j, 4);
            jTable1.setValueAt("", j, 5);
            jTable1.setValueAt("", j, 6);
            j++;

        }

        if (secim.contains("Daire No")) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apatmanyonetim", "root", "123");

                Statement st = conn.createStatement();
                String b = "select * from daire where daireNo=" + yazi;

                ResultSet rs = st.executeQuery(b);

                int i = 0;
                while (rs.next()) {

                    jTable1.setValueAt(rs.getString("daireNo"), i, 0);
                    jTable1.setValueAt(rs.getString("oturanSayisi"), i, 1);
                    jTable1.setValueAt(rs.getString("gsm"), i, 2);
                    jTable1.setValueAt(rs.getString("katno"), i, 3);
                    jTable1.setValueAt(rs.getString("SuAboneNo"), i, 4);
                    jTable1.setValueAt(rs.getString("DGazAboneNo"), i, 5);
                    jTable1.setValueAt(rs.getString("ElkAboneNo"), i, 6);

                    i++;
                }
            } catch (SQLException ex) {
                System.out.println("asf");
            }
        } else if (secim.contains("Daire Oturan Sayısı")) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apatmanyonetim", "root", "123");

                Statement st = conn.createStatement();
                String b = "select * from daire where oturansayisi=" + yazi;

                ResultSet rs = st.executeQuery(b);

                int i = 0;
                while (rs.next()) {

                    jTable1.setValueAt(rs.getString("daireNo"), i, 0);
                    jTable1.setValueAt(rs.getString("oturanSayisi"), i, 1);
                    jTable1.setValueAt(rs.getString("gsm"), i, 2);
                    jTable1.setValueAt(rs.getString("katno"), i, 3);
                    jTable1.setValueAt(rs.getString("SuAboneNo"), i, 4);
                    jTable1.setValueAt(rs.getString("DGazAboneNo"), i, 5);
                    jTable1.setValueAt(rs.getString("ElkAboneNo"), i, 6);

                    i++;
                }
            } catch (SQLException ex) {
                System.out.println("asf");
            }

        } else if (secim.contains("Daire GSM")) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apatmanyonetim", "root", "123");

                Statement st = conn.createStatement();
                String b = "select * from daire where gsm=" + yazi;

                ResultSet rs = st.executeQuery(b);

                int i = 0;
                while (rs.next()) {

                    jTable1.setValueAt(rs.getString("daireNo"), i, 0);
                    jTable1.setValueAt(rs.getString("oturanSayisi"), i, 1);
                    jTable1.setValueAt(rs.getString("gsm"), i, 2);
                    jTable1.setValueAt(rs.getString("katno"), i, 3);
                    jTable1.setValueAt(rs.getString("SuAboneNo"), i, 4);
                    jTable1.setValueAt(rs.getString("DGazAboneNo"), i, 5);
                    jTable1.setValueAt(rs.getString("ElkAboneNo"), i, 6);

                    i++;
                }
            } catch (SQLException ex) {
                System.out.println("asf");
            }

        } else if (secim.contains("Kat No")) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apatmanyonetim", "root", "123");

                Statement st = conn.createStatement();
                String b = "select * from daire where katno=" + yazi;

                ResultSet rs = st.executeQuery(b);

                int i = 0;
                while (rs.next()) {

                    jTable1.setValueAt(rs.getString("daireNo"), i, 0);
                    jTable1.setValueAt(rs.getString("oturanSayisi"), i, 1);
                    jTable1.setValueAt(rs.getString("gsm"), i, 2);
                    jTable1.setValueAt(rs.getString("katno"), i, 3);
                    jTable1.setValueAt(rs.getString("SuAboneNo"), i, 4);
                    jTable1.setValueAt(rs.getString("DGazAboneNo"), i, 5);
                    jTable1.setValueAt(rs.getString("ElkAboneNo"), i, 6);

                    i++;
                }
            } catch (SQLException ex) {
                System.out.println("asf");
            }

        } else if (secim.contains("Su Abone No")) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apatmanyonetim", "root", "123");

                Statement st = conn.createStatement();
                String b = "select * from daire where SuAboneNo=" + yazi;

                ResultSet rs = st.executeQuery(b);

                int i = 0;
                while (rs.next()) {

                    jTable1.setValueAt(rs.getString("daireNo"), i, 0);
                    jTable1.setValueAt(rs.getString("oturanSayisi"), i, 1);
                    jTable1.setValueAt(rs.getString("gsm"), i, 2);
                    jTable1.setValueAt(rs.getString("katno"), i, 3);
                    jTable1.setValueAt(rs.getString("SuAboneNo"), i, 4);
                    jTable1.setValueAt(rs.getString("DGazAboneNo"), i, 5);
                    jTable1.setValueAt(rs.getString("ElkAboneNo"), i, 6);

                    i++;
                }
            } catch (SQLException ex) {
                System.out.println("asf");
            }

        } else if (secim.contains("Elektrik Abone No")) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apatmanyonetim", "root", "123");

                Statement st = conn.createStatement();
                String b = "select * from daire where ElkAboneNo=" + yazi;

                ResultSet rs = st.executeQuery(b);

                int i = 0;
                while (rs.next()) {

                    jTable1.setValueAt(rs.getString("daireNo"), i, 0);
                    jTable1.setValueAt(rs.getString("oturanSayisi"), i, 1);
                    jTable1.setValueAt(rs.getString("gsm"), i, 2);
                    jTable1.setValueAt(rs.getString("katno"), i, 3);
                    jTable1.setValueAt(rs.getString("SuAboneNo"), i, 4);
                    jTable1.setValueAt(rs.getString("DGazAboneNo"), i, 5);
                    jTable1.setValueAt(rs.getString("ElkAboneNo"), i, 6);

                    i++;
                }
            } catch (SQLException ex) {
                System.out.println("asf");
            }

        } else if (secim.contains("Doğalgaz Abone No")) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apatmanyonetim", "root", "123");

                Statement st = conn.createStatement();
                String b = "select * from daire where DGazAboneNo=" + yazi;

                ResultSet rs = st.executeQuery(b);

                int i = 0;
                while (rs.next()) {

                    jTable1.setValueAt(rs.getString("daireNo"), i, 0);
                    jTable1.setValueAt(rs.getString("oturanSayisi"), i, 1);
                    jTable1.setValueAt(rs.getString("gsm"), i, 2);
                    jTable1.setValueAt(rs.getString("katno"), i, 3);
                    jTable1.setValueAt(rs.getString("SuAboneNo"), i, 4);
                    jTable1.setValueAt(rs.getString("DGazAboneNo"), i, 5);
                    jTable1.setValueAt(rs.getString("ElkAboneNo"), i, 6);

                    i++;
                }
            } catch (SQLException ex) {
                System.out.println("asf");
            }

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Menu h = new Menu();
        h.main(null);
        setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        jButton2.setBackground(new java.awt.Color(255, 153, 0));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        jButton2.setBackground(new java.awt.Color(238, 238, 238));


    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));


    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        jButton3.setBackground(new java.awt.Color(238, 238, 238));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));

    }//GEN-LAST:event_jButton3MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apatmanyonetim", "root", "123");

            Statement st = conn.createStatement();
            String b = "select * from daire";

            ResultSet rs = st.executeQuery(b);

            int i = 0;
            while (rs.next()) {

                jTable1.setValueAt(rs.getString("daireNo"), i, 0);
                jTable1.setValueAt(rs.getString("oturanSayisi"), i, 1);
                jTable1.setValueAt(rs.getString("gsm"), i, 2);
                jTable1.setValueAt(rs.getString("katno"), i, 3);
                jTable1.setValueAt(rs.getString("SuAboneNo"), i, 4);
                jTable1.setValueAt(rs.getString("DGazAboneNo"), i, 5);
                jTable1.setValueAt(rs.getString("ElkAboneNo"), i, 6);

                i++;
            }

        } catch (SQLException ex) {
            System.out.println("asf");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(new java.awt.Color(51, 255, 51));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBackground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_jButton1MouseExited

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
            java.util.logging.Logger.getLogger(dairegoruntule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dairegoruntule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dairegoruntule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dairegoruntule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dairegoruntule().setVisible(true);

            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
