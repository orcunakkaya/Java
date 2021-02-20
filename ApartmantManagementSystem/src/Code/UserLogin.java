package Code;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UserLogin extends javax.swing.JFrame {

    public UserLogin() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtkullaniciadi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtsifre = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/images (1) (1) (1).png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 150, 40, 40);

        txtkullaniciadi.setText("Kullanıcı Adı");
        txtkullaniciadi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtkullaniciadiMouseClicked(evt);
            }
        });
        txtkullaniciadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkullaniciadiActionPerformed(evt);
            }
        });
        jPanel1.add(txtkullaniciadi);
        txtkullaniciadi.setBounds(160, 150, 220, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/icon.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 30, 120, 100);

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setFont(new java.awt.Font("PT Sans Caption", 0, 18)); // NOI18N
        jButton2.setText("GİRİŞ");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        jButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton2MouseMoved(evt);
            }
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jButton2MouseDragged(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jButton2AncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(110, 270, 270, 40);

        jButton1.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        jButton1.setText("ÇIKIŞ");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(180, 320, 120, 40);

        txtsifre.setText("s       adw");
        txtsifre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsifreMouseClicked(evt);
            }
        });
        txtsifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsifreActionPerformed(evt);
            }
        });
        jPanel1.add(txtsifre);
        txtsifre.setBounds(160, 200, 220, 40);

        jLabel3.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/1 (1) (1) (1) (1).jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 210, 40, 30);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 520, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkullaniciadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkullaniciadiActionPerformed


    }//GEN-LAST:event_txtkullaniciadiActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (JOptionPane.YES_NO_OPTION == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String sifre = txtsifre.getText();
        String kuladi = txtkullaniciadi.getText();

        if (sifre.contains("admin") && kuladi.contains("admin")) {
            txtsifre.setText(null);
            txtkullaniciadi.setText(null);
            Menu m = new Menu();
            m.main(null);
            setVisible(false);

        } else {
            JOptionPane.showMessageDialog(null, "Şifreniz yanlış ,Tekrar Deneyiniz ", "TEKRAR DENEYİNİZ", JOptionPane.ERROR_MESSAGE);
            txtsifre.setText(null);
            txtkullaniciadi.setText(null);

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtsifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsifreActionPerformed

    private void txtkullaniciadiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtkullaniciadiMouseClicked
        // TODO add your handling code here:
        txtkullaniciadi.setText(null);
    }//GEN-LAST:event_txtkullaniciadiMouseClicked

    private void txtsifreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsifreMouseClicked

        txtsifre.setText(null);

        // TODO add your handling code here:
    }//GEN-LAST:event_txtsifreMouseClicked

    private void jButton2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseMoved


    }//GEN-LAST:event_jButton2MouseMoved


    private void jButton2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseDragged


    }//GEN-LAST:event_jButton2MouseDragged

    private void jButton2AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButton2AncestorMoved

    }//GEN-LAST:event_jButton2AncestorMoved

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased


    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered

        jButton1.setBackground(new java.awt.Color(255, 0, 0));


    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited

        jButton1.setBackground(new java.awt.Color(238, 238, 238));

    }//GEN-LAST:event_jButton1MouseExited

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtkullaniciadi;
    private javax.swing.JPasswordField txtsifre;
    // End of variables declaration//GEN-END:variables
}
