/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painlessgui;

import java.awt.Toolkit;

/**
 *
 * @author BiBul
 */
public class start extends javax.swing.JFrame {

    /**
     * Creates new form start
     */
    public start() {
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
        jLabel3 = new javax.swing.JLabel();
        subtile = new javax.swing.JLabel();
        subtile1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pain = new javax.swing.JButton();
        hearrt = new javax.swing.JButton();
        bgBlue = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/PainLESS.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/welcome to.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 140, -1));

        subtile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/Health Meter.png"))); // NOI18N
        subtile.setText("jLabel2");
        jPanel1.add(subtile, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 210, -1));

        subtile1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/headache Indicator.png"))); // NOI18N
        subtile1.setText("jLabel2");
        jPanel1.add(subtile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 330, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/Created by Khonsa M.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, 150, -1));

        pain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/headehed.png"))); // NOI18N
        pain.setContentAreaFilled(false);
        pain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                painMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painMouseExited(evt);
            }
        });
        pain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                painActionPerformed(evt);
            }
        });
        jPanel1.add(pain, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 240, -1));

        hearrt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/Heart.png"))); // NOI18N
        hearrt.setContentAreaFilled(false);
        hearrt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hearrt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hearrtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hearrtMouseExited(evt);
            }
        });
        hearrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hearrtActionPerformed(evt);
            }
        });
        jPanel1.add(hearrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 240, -1));

        bgBlue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/Cloud.png"))); // NOI18N
        jPanel1.add(bgBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 700));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/Shape 1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 10, -1));

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

    private void painActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_painActionPerformed
        this.setVisible(false);
        BiodataDua b = new BiodataDua();
        b.setVisible(true);
    }//GEN-LAST:event_painActionPerformed

    private void hearrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hearrtActionPerformed
        this.setVisible(false);
        Biodata a = new Biodata();
        a.setVisible(true);
    }//GEN-LAST:event_hearrtActionPerformed

    private void hearrtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hearrtMouseEntered
        // TODO add your handling code here:
         hearrt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/Heart2.png")));
    }//GEN-LAST:event_hearrtMouseEntered

    private void hearrtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hearrtMouseExited
        // TODO add your handling code here:
         hearrt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/Heart.png")));
    }//GEN-LAST:event_hearrtMouseExited

    private void painMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painMouseEntered
        // TODO add your handling code here:
         pain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/headache.png")));
    }//GEN-LAST:event_painMouseEntered

    private void painMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painMouseExited
        // TODO add your handling code here:
         pain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/headehed.png")));
    }//GEN-LAST:event_painMouseExited

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        // TODO add your handling code here:
         jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/PainLESS.png")));
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/PainLESS copy.png")));
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(true);
            aboutUs d = new aboutUs();
            d.setVisible(true);
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
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgBlue;
    private javax.swing.JButton hearrt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pain;
    private javax.swing.JLabel subtile;
    private javax.swing.JLabel subtile1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/painlessgui/Painlessicon.png")));
                }

    private void setResizeable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}