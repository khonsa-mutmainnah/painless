/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painlessgui;

import java.awt.Toolkit;

/**
 *
 * @author USER
 */
public class resultKiriDua extends javax.swing.JFrame {

    /**
     * Creates new form resultKiriDua
     */
    public resultKiriDua() {
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        gewees = new javax.swing.JLabel();
        obatSatu = new javax.swing.JLabel();
        solusiSatu = new javax.swing.JLabel();
        sebabSatu = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        sebabDua1 = new javax.swing.JLabel();
        sebabDua2 = new javax.swing.JLabel();
        sebabDua3 = new javax.swing.JLabel();
        sebabDua = new javax.swing.JLabel();
        solusiSatu1 = new javax.swing.JLabel();
        solusiSatu2 = new javax.swing.JLabel();
        solusiSatu4 = new javax.swing.JLabel();
        solusiSatu3 = new javax.swing.JLabel();
        obatSatu1 = new javax.swing.JLabel();
        obatSatu2 = new javax.swing.JLabel();
        obatSatu3 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/bek.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 660, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Headache left Head MEDIUM level");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        gewees.setFont(new java.awt.Font("Courier New", 1, 50)); // NOI18N
        gewees.setText("GET WELL SOON");
        jPanel1.add(gewees, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 610, -1, -1));

        obatSatu.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        obatSatu.setText("disarankan untuk mengkonsumsi obat pereda nyeri seperti :");
        jPanel1.add(obatSatu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, -1, -1));

        solusiSatu.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        solusiSatu.setText("yang harus kamu lakukan");
        jPanel1.add(solusiSatu, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 260, -1));

        sebabSatu.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        sebabSatu.setText("yang menyebabkan kamu sakit kepala di bagian kiri adalah");
        jPanel1.add(sebabSatu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/PainLESS.png"))); // NOI18N
        Logo.setText("jLabel1");
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, -1));

        sebabDua1.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        sebabDua1.setText("- makan tidak teratur");
        jPanel1.add(sebabDua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        sebabDua2.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        sebabDua2.setText("- kurang istirahat");
        jPanel1.add(sebabDua2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        sebabDua3.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        sebabDua3.setText("- stres");
        jPanel1.add(sebabDua3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        sebabDua.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        sebabDua.setText("- hipertensi");
        jPanel1.add(sebabDua, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        solusiSatu1.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        solusiSatu1.setText("- istirahat yang cukup ");
        jPanel1.add(solusiSatu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 250, -1));

        solusiSatu2.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        solusiSatu2.setText("- lakukan peregangan sederhana");
        jPanel1.add(solusiSatu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 310, -1));

        solusiSatu4.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        solusiSatu4.setText("- perbanyak minum air putih");
        jPanel1.add(solusiSatu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 310, -1));

        solusiSatu3.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        solusiSatu3.setText("- jauhi gadget untuk sementara waktu");
        jPanel1.add(solusiSatu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 340, -1));

        obatSatu1.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        obatSatu1.setText("- propanol");
        jPanel1.add(obatSatu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, -1, -1));

        obatSatu2.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        obatSatu2.setText("- amitriptyline (untuk gangguan tidur)");
        jPanel1.add(obatSatu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, -1, -1));

        obatSatu3.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        obatSatu3.setText("- aspirin");
        jPanel1.add(obatSatu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 70, 20));

        background.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/Cloud.png"))); // NOI18N
        background.setText("jLabel1");
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

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

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/_BACK.png")));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/bek.png")));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        start e = new start();
        e.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(resultKiriDua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultKiriDua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultKiriDua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultKiriDua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultKiriDua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel background;
    private javax.swing.JLabel gewees;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel obatSatu;
    private javax.swing.JLabel obatSatu1;
    private javax.swing.JLabel obatSatu2;
    private javax.swing.JLabel obatSatu3;
    private javax.swing.JLabel sebabDua;
    private javax.swing.JLabel sebabDua1;
    private javax.swing.JLabel sebabDua2;
    private javax.swing.JLabel sebabDua3;
    private javax.swing.JLabel sebabSatu;
    private javax.swing.JLabel solusiSatu;
    private javax.swing.JLabel solusiSatu1;
    private javax.swing.JLabel solusiSatu2;
    private javax.swing.JLabel solusiSatu3;
    private javax.swing.JLabel solusiSatu4;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/painlessgui/Painlessicon.png")));
    }
}
