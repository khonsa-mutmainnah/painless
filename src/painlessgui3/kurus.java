/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painlessgui3;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import painlessgui.print;
import painlessgui.resultKiriTiga;
import painlessgui.start;

/**
 *
 * @author BiBul
 */
public class kurus extends javax.swing.JFrame {

    /**
     * Creates new form kurus
     */
    public kurus() {
        initComponents();
        setTitle("PainLESS v1.0.0");
        setIcon();
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
        detail = new javax.swing.JButton();
        ectos = new javax.swing.JToggleButton();
        DONE = new javax.swing.JButton();
        satuan = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        resultt = new javax.swing.JLabel();
        sknny = new javax.swing.JLabel();
        skinnybod = new javax.swing.JLabel();
        namaUser = new javax.swing.JLabel();
        tinggiBadan = new javax.swing.JLabel();
        beratBadan = new javax.swing.JLabel();
        jenisKelamin = new javax.swing.JLabel();
        umurUser = new javax.swing.JLabel();
        bmrResult = new javax.swing.JLabel();
        gizi = new javax.swing.JLabel();
        karbo = new javax.swing.JLabel();
        proto = new javax.swing.JLabel();
        lemaks = new javax.swing.JLabel();
        hearts = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        detail.setText("Detail");
        detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailActionPerformed(evt);
            }
        });
        jPanel1.add(detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 70, 30));

        ectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui3/ECTOMORPH.png"))); // NOI18N
        ectos.setToolTipText("");
        ectos.setContentAreaFilled(false);
        ectos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ectosActionPerformed(evt);
            }
        });
        jPanel1.add(ectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 280, 60));

        DONE.setText("DONE");
        DONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DONEActionPerformed(evt);
            }
        });
        jPanel1.add(DONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 80, 30));

        satuan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui3/cm  kg    thn  Kkl  Kkl  gram_day  gram_day  gram_day.png"))); // NOI18N
        jPanel1.add(satuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 80, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui3/PainLESS.png"))); // NOI18N
        logo.setText("jLabel1");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 330, -1));

        resultt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui3/ Tinggi Badan  Berat Badan   Jenis Kelamin  Umur   BMR  Kebutuh.png"))); // NOI18N
        resultt.setText("jLabel1");
        jPanel1.add(resultt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 180, -1));

        sknny.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui3/skinny.png"))); // NOI18N
        sknny.setText("jLabel2");
        jPanel1.add(sknny, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 530, -1));

        skinnybod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui3/skinn.png"))); // NOI18N
        jPanel1.add(skinnybod, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 400, -1));

        namaUser.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        namaUser.setText("jLabel1");
        jPanel1.add(namaUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        tinggiBadan.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        tinggiBadan.setText("jLabel1");
        jPanel1.add(tinggiBadan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 50, -1));

        beratBadan.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        beratBadan.setText("jLabel1");
        jPanel1.add(beratBadan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 50, -1));

        jenisKelamin.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        jenisKelamin.setText("jLabel1");
        jPanel1.add(jenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 110, -1));

        umurUser.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        umurUser.setText("jLabel1");
        jPanel1.add(umurUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 70, -1));

        bmrResult.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        bmrResult.setText("jLabel1");
        jPanel1.add(bmrResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 70, -1));

        gizi.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        gizi.setText("jLabel1");
        jPanel1.add(gizi, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 70, -1));

        karbo.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        karbo.setText("jLabel1");
        jPanel1.add(karbo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 70, -1));

        proto.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        proto.setText("jLabel1");
        jPanel1.add(proto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 70, -1));

        lemaks.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        lemaks.setText("jLabel1");
        jPanel1.add(lemaks, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 70, -1));

        hearts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui3/heart-cardiogram-health-icon-image-vector-12781394.png"))); // NOI18N
        hearts.setText("jLabel2");
        jPanel1.add(hearts, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 410, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui3/Cloud.png"))); // NOI18N
        bg.setText("jLabel6");
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DONEActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
            start e = new start();
            e.setVisible(true);
    }//GEN-LAST:event_DONEActionPerformed

    private void ectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ectosActionPerformed
        // TODO add your handling code here:
        if ( ectos.isSelected()){
    skinnybod.setIcon( new ImageIcon(getClass().getResource("/painlessgui3/ecto.png")));
}
else {
     skinnybod.setIcon( new ImageIcon(getClass().getResource("/painlessgui3/skinn.png")));
    }//GEN-LAST:event_ectosActionPerformed
    }
    private void detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailActionPerformed

            print a = new print();
            a.setVisible(true);
        
    }//GEN-LAST:event_detailActionPerformed

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
            java.util.logging.Logger.getLogger(kurus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kurus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kurus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kurus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kurus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DONE;
    public static javax.swing.JLabel beratBadan;
    private javax.swing.JLabel bg;
    public static javax.swing.JLabel bmrResult;
    private javax.swing.JButton detail;
    private javax.swing.JToggleButton ectos;
    public static javax.swing.JLabel gizi;
    private javax.swing.JLabel hearts;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel jenisKelamin;
    public static javax.swing.JLabel karbo;
    public static javax.swing.JLabel lemaks;
    private javax.swing.JLabel logo;
    public static javax.swing.JLabel namaUser;
    public static javax.swing.JLabel proto;
    private javax.swing.JLabel resultt;
    private javax.swing.JLabel satuan;
    private javax.swing.JLabel skinnybod;
    private javax.swing.JLabel sknny;
    public static javax.swing.JLabel tinggiBadan;
    public static javax.swing.JLabel umurUser;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/painlessgui/Painlessicon.png")));
    }
}
