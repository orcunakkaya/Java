package Code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class kisigoster extends javax.swing.JFrame {

    public kisigoster() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kisitctxt = new javax.swing.JTextField();
        adtxt = new javax.swing.JTextField();
        soyadtxt = new javax.swing.JTextField();
        dogumtxt = new javax.swing.JTextField();
        cinsiyettxt = new javax.swing.JTextField();
        dairetxt = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jButton1.setText("ARA");
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
        jPanel2.add(jButton1);
        jButton1.setBounds(860, 420, 130, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kişi Tc", "Adı", "Soyadı", "D Tarihi", "Cinsiyet", "Daire No" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(580, 430, 224, 65);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(290, 430, 264, 65);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kişi TC", "Adı ", "Soyadı", "D Tarihi", "Cinsiyet", "Daire No"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(5, 3, 1020, 390);

        jButton2.setText("GERİ");
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
        jPanel2.add(jButton2);
        jButton2.setBounds(40, 460, 110, 30);

        jButton3.setText("HEPSİNİ GÖSTER");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(860, 460, 130, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kişi TC :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(1080, 110, 50, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Adı :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(1090, 150, 24, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Soyadı :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(1070, 190, 44, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("D Tarihi :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(1070, 230, 49, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cinsiyet :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(1060, 310, 51, 14);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Daire No :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(1060, 270, 60, 14);
        jPanel2.add(kisitctxt);
        kisitctxt.setBounds(1130, 100, 108, 30);
        jPanel2.add(adtxt);
        adtxt.setBounds(1130, 140, 108, 30);
        jPanel2.add(soyadtxt);
        soyadtxt.setBounds(1130, 180, 108, 30);
        jPanel2.add(dogumtxt);
        dogumtxt.setBounds(1130, 220, 108, 30);
        jPanel2.add(cinsiyettxt);
        cinsiyettxt.setBounds(1130, 260, 108, 30);
        jPanel2.add(dairetxt);
        dairetxt.setBounds(1130, 300, 108, 30);

        jButton4.setText("SİL");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(1130, 363, 80, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("KİŞİ BİLGİLERİ");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(1110, 60, 130, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/V30 (1).jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1298, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

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

            j++;
        }

        if (secim.contains("Kişi Tc")) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apatmanyonetim", "root", "123");

                Statement st = conn.createStatement();
                String b = "select * from kisi where kisiTC=" + yazi;

                ResultSet rs = st.executeQuery(b);

                int i = 0;
                while (rs.next()) {

                    jTable1.setValueAt(rs.getString("kisiTC"), i, 0);
                    jTable1.setValueAt(rs.getString("ad"), i, 1);
                    jTable1.setValueAt(rs.getString("soyad"), i, 2);
                    jTable1.setValueAt(rs.getString("dogumTar"), i, 3);
                    jTable1.setValueAt(rs.getString("cinsiyet"), i, 4);
                    jTable1.setValueAt(rs.getString("OturDaireNo"), i, 5);

                    i++;
                }
            } catch (SQLException ex) {
                System.out.println("asf");
            }
        } else if (secim.contains("Adı")) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apatmanyonetim", "root", "123");

                Statement st = conn.createStatement();
                String b = "select * from kisi where ad='" + yazi + "'";

                ResultSet rs = st.executeQuery(b);

                int i = 0;
                while (rs.next()) {

                    jTable1.setValueAt(rs.getString("kisiTC"), i, 0);
                    jTable1.setValueAt(rs.getString("ad"), i, 1);
                    jTable1.setValueAt(rs.getString("soyad"), i, 2);
                    jTable1.setValueAt(rs.getString("dogumTar"), i, 3);
                    jTable1.setValueAt(rs.getString("cinsiyet"), i, 4);
                    jTable1.setValueAt(rs.getString("OturDaireNo"), i, 5);

                    i++;
                }
            } catch (SQLException ex) {
                System.out.println("asf");
            }
        } else if (secim.contains("Soyadı")) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apatmanyonetim", "root", "123");

                Statement st = conn.createStatement();
                String b = "select * from kisi where soyad='" + yazi + "'";

                ResultSet rs = st.executeQuery(b);

                int i = 0;
                while (rs.next()) {

                    jTable1.setValueAt(rs.getString("kisiTC"), i, 0);
                    jTable1.setValueAt(rs.getString("ad"), i, 1);
                    jTable1.setValueAt(rs.getString("soyad"), i, 2);
                    jTable1.setValueAt(rs.getString("dogumTar"), i, 3);
                    jTable1.setValueAt(rs.getString("cinsiyet"), i, 4);
                    jTable1.setValueAt(rs.getString("OturDaireNo"), i, 5);

                    i++;
                }
            } catch (SQLException ex) {
                System.out.println("asf");
            }
        } else if (secim.contains("D Tarihi")) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apatmanyonetim", "root", "123");

                Statement st = conn.createStatement();
                String b = "select * from kisi where dogumTar='" + yazi + "'";

                ResultSet rs = st.executeQuery(b);

                int i = 0;
                while (rs.next()) {

                    jTable1.setValueAt(rs.getString("kisiTC"), i, 0);
                    jTable1.setValueAt(rs.getString("ad"), i, 1);
                    jTable1.setValueAt(rs.getString("soyad"), i, 2);
                    jTable1.setValueAt(rs.getString("dogumTar"), i, 3);
                    jTable1.setValueAt(rs.getString("cinsiyet"), i, 4);
                    jTable1.setValueAt(rs.getString("OturDaireNo"), i, 5);

                    i++;
                }
            } catch (SQLException ex) {
                System.out.println("asf");
            }
        } else if (secim.contains("Cinsiyet")) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apatmanyonetim", "root", "123");

                Statement st = conn.createStatement();
                String b = "select * from kisi where cinsiyet='" + yazi + "'";

                ResultSet rs = st.executeQuery(b);

                int i = 0;
                while (rs.next()) {

                    jTable1.setValueAt(rs.getString("kisiTC"), i, 0);
                    jTable1.setValueAt(rs.getString("ad"), i, 1);
                    jTable1.setValueAt(rs.getString("soyad"), i, 2);
                    jTable1.setValueAt(rs.getString("dogumTar"), i, 3);
                    jTable1.setValueAt(rs.getString("cinsiyet"), i, 4);
                    jTable1.setValueAt(rs.getString("OturDaireNo"), i, 5);

                    i++;
                }
            } catch (SQLException ex) {
                System.out.println("asf");
            }
        } else if (secim.contains("Daire No")) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apatmanyonetim", "root", "123");

                Statement st = conn.createStatement();
                String b = "select * from kisi where OturDaireNo='" + yazi + "'";

                ResultSet rs = st.executeQuery(b);

                int i = 0;
                while (rs.next()) {

                    jTable1.setValueAt(rs.getString("kisiTC"), i, 0);
                    jTable1.setValueAt(rs.getString("ad"), i, 1);
                    jTable1.setValueAt(rs.getString("soyad"), i, 2);
                    jTable1.setValueAt(rs.getString("dogumTar"), i, 3);
                    jTable1.setValueAt(rs.getString("cinsiyet"), i, 4);
                    jTable1.setValueAt(rs.getString("OturDaireNo"), i, 5);

                    i++;
                }
            } catch (SQLException ex) {
                System.out.println("asf");
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Menu h = new Menu();
        h.main(null);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBackground(new java.awt.Color(238, 238, 238));


    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:

        jButton1.setBackground(new java.awt.Color(255, 153, 0));

    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));


    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        jButton2.setBackground(new java.awt.Color(238, 238, 238));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));

    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int j = 0;
        while (j < 20) {
            jTable1.setValueAt("", j, 0);
            jTable1.setValueAt("", j, 1);
            jTable1.setValueAt("", j, 2);
            jTable1.setValueAt("", j, 3);
            jTable1.setValueAt("", j, 4);
            jTable1.setValueAt("", j, 5);

            j++;

        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apatmanyonetim", "root", "123");

            Statement st = conn.createStatement();
            String b = "select * from kisi";

            ResultSet rs = st.executeQuery(b);

            int i = 0;
            while (rs.next()) {

                jTable1.setValueAt(rs.getString("kisiTC"), i, 0);
                jTable1.setValueAt(rs.getString("ad"), i, 1);
                jTable1.setValueAt(rs.getString("soyad"), i, 2);
                jTable1.setValueAt(rs.getString("dogumTar"), i, 3);
                jTable1.setValueAt(rs.getString("cinsiyet"), i, 4);
                jTable1.setValueAt(rs.getString("OturDaireNo"), i, 5);

                i++;
            }

        } catch (SQLException ex) {
            System.out.println("asf");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        kisitctxt.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        adtxt.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        soyadtxt.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        dogumtxt.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        cinsiyettxt.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        dairetxt.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String ad, soyad, tc, dtarihi, dno, cinsiyet;
        ad = adtxt.getText();
        soyad = soyadtxt.getText();
        tc = kisitctxt.getText();
        dtarihi = dogumtxt.getText();
        dno = dairetxt.getText();
        cinsiyet = cinsiyettxt.getText();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apatmanyonetim", "root", "123");

            Statement st = conn.createStatement();
            String b = "delete from kisi where kisiTC=" + tc + ";";

            st.executeUpdate(b);

        } catch (SQLException ex) {
            System.out.println("asf");
        }

        JOptionPane.showMessageDialog(null, "..SİLİNDİ.. ");


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        jButton3.setBackground(new java.awt.Color(51, 255, 51));

    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        jButton3.setBackground(new java.awt.Color(237, 237, 237));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        jButton4.setBackground(new java.awt.Color(237, 237, 237));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));

    }//GEN-LAST:event_jButton4MouseExited

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
            java.util.logging.Logger.getLogger(kisigoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kisigoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kisigoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kisigoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kisigoster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adtxt;
    private javax.swing.JTextField cinsiyettxt;
    private javax.swing.JTextField dairetxt;
    private javax.swing.JTextField dogumtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField kisitctxt;
    private javax.swing.JTextField soyadtxt;
    // End of variables declaration//GEN-END:variables
}
