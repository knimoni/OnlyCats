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
public class DetailsTabel extends javax.swing.JFrame {
    

    /**
     */
    public DetailsTabel() {
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

        jPanel2 = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Lama = new javax.swing.JLabel();
        Berat = new javax.swing.JLabel();
        Jam = new javax.swing.JLabel();
        Tanggal2 = new javax.swing.JLabel();
        Nama = new javax.swing.JLabel();
        Jenis = new javax.swing.JLabel();
        Tanggal1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setBackground(new java.awt.Color(0, 0, 0));
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/icons8_close_window_30px.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitMousePressed(evt);
            }
        });
        jPanel2.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 40, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/logo-2 30px_1.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/cat_footprint_24px.png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 15, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/cat_footprint_gede.png"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 15, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/cat_footprint_kecil.png"))); // NOI18N
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 0, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/cat_footprint_24px.png"))); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 34, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 50));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel9.setText("Nama Pemilik");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel10.setText("Berat Kucing");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel11.setText("Jenis Kucing");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel13.setText("Lama Penitipan");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel14.setText("Tanggal Penitipan");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel15.setText("Jam Pengambilan");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel16.setText("DETAILS ");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        Lama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lama.setText(":");
        jPanel3.add(Lama, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        Berat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Berat.setText(":");
        jPanel3.add(Berat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        Jam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Jam.setText(":");
        jPanel3.add(Jam, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        Tanggal2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tanggal2.setText(":");
        jPanel3.add(Tanggal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        Nama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nama.setText(":");
        jPanel3.add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        Jenis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Jenis.setText(":");
        jPanel3.add(Jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        Tanggal1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tanggal1.setText(":");
        jPanel3.add(Tanggal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("=");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 20, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("=");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("=");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 20, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("=");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 20, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("=");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 20, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("=");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 20, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/cat 1.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/cat 3.png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/cat 4.png"))); // NOI18N
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/cat 2.png"))); // NOI18N
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        jPanel1.setBackground(new java.awt.Color(217, 217, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setText("→");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 30, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 230, 190));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 420, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMousePressed
        // TODO add your handling code here:
        dispose();
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
            java.util.logging.Logger.getLogger(DetailsTabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailsTabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailsTabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailsTabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailsTabel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Berat;
    private javax.swing.JLabel Exit;
    public javax.swing.JLabel Jam;
    public javax.swing.JLabel Jenis;
    public javax.swing.JLabel Lama;
    public javax.swing.JLabel Nama;
    public javax.swing.JLabel Tanggal1;
    public javax.swing.JLabel Tanggal2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
