/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Naura
 */
public class Kucingkucingan extends javax.swing.JFrame {
        SetterGetter setget = new SetterGetter();
        DaftarKucing lihat = new DaftarKucing();

    /**
     */
    public Kucingkucingan() {
        initComponents();
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jeniskucing = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Siamese = new javax.swing.JRadioButton();
        Bengals = new javax.swing.JRadioButton();
        Sphynxes = new javax.swing.JRadioButton();
        Persians = new javax.swing.JRadioButton();
        Britishshorthair = new javax.swing.JRadioButton();
        Domestik = new javax.swing.JRadioButton();
        Anggora = new javax.swing.JRadioButton();
        Ragdoll = new javax.swing.JRadioButton();
        MaineCoon = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(159, 217, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jeniskucing.add(Siamese);
        Siamese.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Siamese.setText("Siamese");
        Siamese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiameseActionPerformed(evt);
            }
        });
        jPanel1.add(Siamese, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jeniskucing.add(Bengals);
        Bengals.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Bengals.setText("Bengals");
        Bengals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BengalsActionPerformed(evt);
            }
        });
        jPanel1.add(Bengals, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 80, -1));

        jeniskucing.add(Sphynxes);
        Sphynxes.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Sphynxes.setText("Sphynxes");
        jPanel1.add(Sphynxes, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 90, -1));

        jeniskucing.add(Persians);
        Persians.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Persians.setText("Persians");
        jPanel1.add(Persians, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 80, -1));

        jeniskucing.add(Britishshorthair);
        Britishshorthair.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Britishshorthair.setText("British shorthair");
        Britishshorthair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BritishshorthairActionPerformed(evt);
            }
        });
        jPanel1.add(Britishshorthair, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jeniskucing.add(Domestik);
        Domestik.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Domestik.setText("Domestik");
        Domestik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DomestikActionPerformed(evt);
            }
        });
        jPanel1.add(Domestik, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        jeniskucing.add(Anggora);
        Anggora.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Anggora.setText("Anggora");
        jPanel1.add(Anggora, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 80, -1));

        jeniskucing.add(Ragdoll);
        Ragdoll.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Ragdoll.setText("Ragdoll");
        jPanel1.add(Ragdoll, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jeniskucing.add(MaineCoon);
        MaineCoon.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        MaineCoon.setText("Maine Coon");
        jPanel1.add(MaineCoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/bengals_jpg.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(0, 0, 0));
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/icons8_close_window_30px.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitMousePressed(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/icons8_cat_footprint_30px_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 801, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/sphynx_jpg.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/mainecoon_jpg.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/british_jpg.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/siamese_jpg.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/persian_jpg.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/kampung_jpg.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/ragdoll_jpg.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/anggora_jpg.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Pilih");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SiameseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiameseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SiameseActionPerformed

    private void BritishshorthairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BritishshorthairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BritishshorthairActionPerformed

    private void DomestikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DomestikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DomestikActionPerformed

    private void ExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitMousePressed

    int xx, xy;
    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BengalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BengalsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BengalsActionPerformed

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
            java.util.logging.Logger.getLogger(Kucingkucingan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kucingkucingan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kucingkucingan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kucingkucingan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Kucingkucingan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Anggora;
    private javax.swing.JRadioButton Bengals;
    private javax.swing.JRadioButton Britishshorthair;
    private javax.swing.JRadioButton Domestik;
    private javax.swing.JLabel Exit;
    private javax.swing.JRadioButton MaineCoon;
    private javax.swing.JRadioButton Persians;
    private javax.swing.JRadioButton Ragdoll;
    private javax.swing.JRadioButton Siamese;
    private javax.swing.JRadioButton Sphynxes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.ButtonGroup jeniskucing;
    // End of variables declaration//GEN-END:variables
}