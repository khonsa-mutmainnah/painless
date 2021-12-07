/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painlessgui;

//import painlessgui.start;
//import java.awt.Color;
import java.awt.Toolkit;
import java.util.Date;
import javax.swing.JOptionPane;
import painlessgui3.*;
/**
 *
 * @author USER
 */
public class Biodata extends javax.swing.JFrame {

    /**
     * Creates new form Biodata
     */
    public Biodata() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        TanggalLahir = new javax.swing.JLabel();
        jenisKelamin = new javax.swing.JLabel();
        Berat = new javax.swing.JLabel();
        tinggi = new javax.swing.JLabel();
        aktivitas1 = new javax.swing.JLabel();
        isianNama = new javax.swing.JTextField();
        isianBerat = new javax.swing.JTextField();
        isianTinggi = new javax.swing.JTextField();
        listJenisKelamin = new javax.swing.JComboBox();
        kilogram = new javax.swing.JLabel();
        centimeter = new javax.swing.JLabel();
        listAktivitas = new javax.swing.JComboBox();
        nextButton = new javax.swing.JToggleButton();
        logo = new javax.swing.JLabel();
        backButton = new javax.swing.JToggleButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/HM.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 420, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 300, 10));

        nama.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        nama.setText("Nama");
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 100, 40));

        TanggalLahir.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        TanggalLahir.setText("Tanggal lahir");
        jPanel1.add(TanggalLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 160, 40));

        jenisKelamin.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jenisKelamin.setText("Jenis Kelamin");
        jPanel1.add(jenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 140, 40));

        Berat.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        Berat.setText("Berat badan");
        jPanel1.add(Berat, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 150, 40));

        tinggi.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        tinggi.setText("Tinggi badan");
        jPanel1.add(tinggi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 140, 40));

        aktivitas1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        aktivitas1.setText("Aktivitas");
        jPanel1.add(aktivitas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 140, 40));

        isianNama.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        isianNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isianNamaActionPerformed(evt);
            }
        });
        isianNama.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                isianNamaPropertyChange(evt);
            }
        });
        jPanel1.add(isianNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 280, 40));

        isianBerat.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        isianBerat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isianBeratActionPerformed(evt);
            }
        });
        isianBerat.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                isianBeratPropertyChange(evt);
            }
        });
        isianBerat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                isianBeratKeyPressed(evt);
            }
        });
        jPanel1.add(isianBerat, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 90, 40));

        isianTinggi.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        isianTinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isianTinggiActionPerformed(evt);
            }
        });
        isianTinggi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                isianTinggiKeyPressed(evt);
            }
        });
        jPanel1.add(isianTinggi, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 90, 40));

        listJenisKelamin.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        listJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laki-laki", "Perempuan" }));
        listJenisKelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listJenisKelaminActionPerformed(evt);
            }
        });
        jPanel1.add(listJenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 280, 40));

        kilogram.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        kilogram.setText("kg");
        jPanel1.add(kilogram, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 99, 30));

        centimeter.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        centimeter.setText("m");
        jPanel1.add(centimeter, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 99, 27));

        listAktivitas.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        listAktivitas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sangat ringan ( 0 - 1,5 km / hari )", "Ringan ( 1,5 - 3,0 km / hari)", "Sedang ( 3 - 10 km / hari )", "Berat ( 10 atau lebih km / hari )" }));
        listAktivitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAktivitasActionPerformed(evt);
            }
        });
        jPanel1.add(listAktivitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 280, 40));

        nextButton.setBackground(new java.awt.Color(255, 255, 255));
        nextButton.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/cek _.png"))); // NOI18N
        nextButton.setContentAreaFilled(false);
        nextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextButtonMouseExited(evt);
            }
        });
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        jPanel1.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 580, 160, 30));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/PainLESS.png"))); // NOI18N
        logo.setText("jLabel2");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, 330, 80));

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/bek.png"))); // NOI18N
        backButton.setContentAreaFilled(false);
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButtonMouseExited(evt);
            }
        });
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 580, 120, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/Cloud.png"))); // NOI18N
        Background.setText("jLabel1");
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

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

    private void isianNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isianNamaActionPerformed

    }//GEN-LAST:event_isianNamaActionPerformed

    private void isianNamaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_isianNamaPropertyChange

    }//GEN-LAST:event_isianNamaPropertyChange

    private void isianBeratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isianBeratActionPerformed

    }//GEN-LAST:event_isianBeratActionPerformed

    private void isianBeratPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_isianBeratPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_isianBeratPropertyChange

    private void isianTinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isianTinggiActionPerformed

    }//GEN-LAST:event_isianTinggiActionPerformed

    private void listJenisKelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listJenisKelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listJenisKelaminActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        start d = new start();
        d.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void listAktivitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAktivitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listAktivitasActionPerformed

    private void isianBeratKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_isianBeratKeyPressed

        // TODO add your handling code here:
        try{
            int i = Integer.parseInt(isianBerat.getText());
            jLabel1.setText("");
        }catch (NumberFormatException e){
            jLabel1.setText("use only numbers");
        }
    }//GEN-LAST:event_isianBeratKeyPressed

    private void isianTinggiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_isianTinggiKeyPressed
        // TODO add your handling code here:
        try{
            Double i = Double.parseDouble(isianTinggi.getText());
            jLabel2.setText("");
        }catch (NumberFormatException e){
            jLabel2.setText("use M not cm , or coma");
        }
    }//GEN-LAST:event_isianTinggiKeyPressed

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        // TODO add your handling code here:
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/_BACK.png")));
    }//GEN-LAST:event_backButtonMouseEntered

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        // TODO add your handling code here:
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/bek.png")));
    }//GEN-LAST:event_backButtonMouseExited

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed

        if (isianNama.getText().trim().isEmpty() && isianTinggi.getText().trim().isEmpty() && isianBerat.getText().trim().isEmpty()){
            jLabel3.setText("FIELD STILL EMPTY");
        }
        else if (isianNama.getText().trim().isEmpty()){
            jLabel3.setText("Name Still EMPTY");
            JOptionPane.showMessageDialog(null, "ur mom give u a good name , so use it!");
        }
        else if (isianTinggi.getText().trim().isEmpty()){
            jLabel3.setText("your Height EMPTY");
            JOptionPane.showMessageDialog(null, "tall must be filled ");
        }
        else if (isianBerat.getText().trim().isEmpty()){
            jLabel3.setText("your Weight EMPTY");
            JOptionPane.showMessageDialog(null, "weight dude , OMG!");
        }
        

        double bmr,res,kar,pro,fat;
        //bmr= 0;
        double bb = Double.parseDouble(isianBerat.getText());
        double tb = Double.parseDouble(isianTinggi.getText());

        String jk = (String) listJenisKelamin.getSelectedItem();
        String act = (String) listAktivitas.getSelectedItem();

        Date lahir = jDateChooser1.getDate();
        Date kini = new Date();
        int ur = kini.getYear()-lahir.getYear();

        double bmi = bb / (tb*tb);
        System.out.println(bmi);
        
        //kurus
        if (bmi <=18.5) // kurus
        {
            
            kurus a = new kurus();
            kurus.namaUser.setText(isianNama.getText());
            kurus.tinggiBadan.setText(isianTinggi.getText());
            kurus.beratBadan.setText(isianBerat.getText());
            kurus.jenisKelamin.setText((String ) listJenisKelamin.getSelectedItem());
            kurus.umurUser.setText(String.valueOf(ur));
            
            a.setVisible(true);
            

            // kurus male
            if ( jk.equals("Laki-laki")&& act.equals("Sangat ringan  0 - 1,5 km / hari" ))
            {
                bmr = 88 + (13*bb)+(5*tb)-(6*ur);
                res = bmr *1.2;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;

                // wherepain.duar.setText("hai"+" "+isianNama.getText());
                kurus.bmrResult.setText(String.valueOf(bmr));
                kurus.gizi.setText(String.valueOf(res));
                kurus.karbo.setText(String.valueOf(kar));
                kurus.proto.setText(String.valueOf(pro));
                kurus.lemaks.setText(String.valueOf(fat));

            }
            else if (jk.equals("Laki-laki")&& act.equals("Ringan ( 1,5 - 3,0 km / hari)" ) )
            {
                 bmr = 88 + (13*bb)+(5*tb)-(6*ur);
                res = bmr *1.4;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;
                kurus.bmrResult.setText(String.valueOf(bmr));
                kurus.gizi.setText(String.valueOf(res));
                kurus.karbo.setText(String.valueOf(kar));
                kurus.proto.setText(String.valueOf(pro));
                kurus.lemaks.setText(String.valueOf(fat));

            }
            else if (jk.equals("Laki-laki")&& act.equals("Sedang ( 3 - 10 km / hari )" ))
            {
                 bmr = 88 + (13*bb)+(5*tb)-(6*ur);
                res = bmr *1.7;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;
                kurus.bmrResult.setText(String.valueOf(bmr));
                kurus.gizi.setText(String.valueOf(res));
                kurus.karbo.setText(String.valueOf(kar));
                kurus.proto.setText(String.valueOf(pro));
                kurus.lemaks.setText(String.valueOf(fat));
            }
            else if (jk.equals("Laki-laki")&& act.equals("Berat ( 10 atau lebih km / hari )" ))
            {
                 bmr = 88 + (13*bb)+(5*tb)-(6*ur);
                res = bmr *1.9;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;
                kurus.bmrResult.setText(String.valueOf(bmr));
                kurus.gizi.setText(String.valueOf(res));
                kurus.karbo.setText(String.valueOf(kar));
                kurus.proto.setText(String.valueOf(pro));
                kurus.lemaks.setText(String.valueOf(fat));
            }
            // female ( PR )
            else if ( jk.equals("Perempuan")&& act.equals("Sangat ringan  0 - 1,5 km / hari" ))
            {
                bmr = 448 + (9*bb)+(3*tb)-(4*ur);
                res = bmr *1.2;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;
                kurus.bmrResult.setText(String.valueOf(bmr));
                kurus.gizi.setText(String.valueOf(res));
                kurus.karbo.setText(String.valueOf(kar));
                kurus.proto.setText(String.valueOf(pro));
                kurus.lemaks.setText(String.valueOf(fat));
            }
            else if ( jk.equals("Perempuan")&& act.equals("Ringan ( 1,5 - 3,0 km / hari)" ))
            {
                bmr = 448 + (9*bb)+(3*tb)-(4*ur);
                res = bmr *1.4;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;
                kurus.bmrResult.setText(String.valueOf(bmr));
                kurus.gizi.setText(String.valueOf(res));
                kurus.karbo.setText(String.valueOf(kar));
                kurus.proto.setText(String.valueOf(pro));
                kurus.lemaks.setText(String.valueOf(fat));
            }
            else if ( jk.equals("Perempuan")&& act.equals("Sedang ( 3 - 10 km / hari )" ))
            {
                bmr = 448 + (9*bb)+(3*tb)-(4*ur);
                res = bmr *1.7;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;
                kurus.bmrResult.setText(String.valueOf(bmr));
                kurus.gizi.setText(String.valueOf(res));
                kurus.karbo.setText(String.valueOf(kar));
                kurus.proto.setText(String.valueOf(pro));
                kurus.lemaks.setText(String.valueOf(fat));
            }
            else if ( jk.equals("Perempuan")&& act.equals("Berat ( 10 atau lebih km / hari )" ))
            {
                bmr = 448 + (9*bb)+(3*tb)-(4*ur);
                res = bmr *1.9;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;
                kurus.bmrResult.setText(String.valueOf(bmr));
                kurus.gizi.setText(String.valueOf(res));
                kurus.karbo.setText(String.valueOf(kar));
                kurus.proto.setText(String.valueOf(pro));
                kurus.lemaks.setText(String.valueOf(fat));
            }
        }

        // ideal Body
        else if ( bmi <=24.0 ) // normal
        {

            ideal b = new ideal();

            ideal.namaUser1.setText(isianNama.getText());
            ideal.tinggiBadan1.setText(isianTinggi.getText());
            ideal.beratBadan1.setText(isianBerat.getText());
            ideal.jenisKelamin1.setText((String ) listJenisKelamin.getSelectedItem());
            ideal.umurUser1.setText(String.valueOf(ur));
        
            
            b.setVisible(true);
            // ideal
            if ( jk.equals("Laki-laki")&& act.equals("Sangat ringan  0 - 1,5 km / hari" ))
            {
                bmr = 88 + (13*bb)+(5*tb)-(6*ur);
                res = bmr *1.2;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;

                ideal.bmrResult1.setText(String.valueOf(bmr));
                ideal.gizi1.setText(String.valueOf(res));
                ideal.karbo1.setText(String.valueOf(kar));
                ideal.proto1.setText(String.valueOf(pro));
                ideal.lemaks1.setText(String.valueOf(fat));

            }
            else if (jk.equals("Laki-laki")&& act.equals("Ringan ( 1,5 - 3,0 km / hari)" ) )
            {
                bmr = 88 + (13*bb)+(5*tb)-(6*ur);
                res = bmr *1.4;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;
                ideal.bmrResult1.setText(String.valueOf(bmr));
                ideal.gizi1.setText(String.valueOf(res));
                ideal.karbo1.setText(String.valueOf(kar));
                ideal.proto1.setText(String.valueOf(pro));
                ideal.lemaks1.setText(String.valueOf(fat));
            }
            else if (jk.equals("Laki-laki")&& act.equals("Sedang ( 3 - 10 km / hari )" ))
            {
                bmr = 88 + (13*bb)+(5*tb)-(6*ur);
                res = bmr *1.7;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;
                ideal.bmrResult1.setText(String.valueOf(bmr));
                ideal.gizi1.setText(String.valueOf(res));
                ideal.karbo1.setText(String.valueOf(kar));
                ideal.proto1.setText(String.valueOf(pro));
                ideal.lemaks1.setText(String.valueOf(fat));
            }
            else if (jk.equals("Laki-laki")&& act.equals("Berat ( 10 atau lebih km / hari )" ))
            {
                bmr = 88 + (13*bb)+(5*tb)-(6*ur);
                res = bmr *1.9;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;
                ideal.bmrResult1.setText(String.valueOf(bmr));
                ideal.gizi1.setText(String.valueOf(res));
                ideal.karbo1.setText(String.valueOf(kar));
                ideal.proto1.setText(String.valueOf(pro));
                ideal.lemaks1.setText(String.valueOf(fat));
            }
            // female ( PR )
            else if ( jk.equals("Perempuan")&& act.equals("Sangat ringan  0 - 1,5 km / hari" ))
            {
                bmr = 448 + (9*bb)+(3*tb)-(4*ur);
                res = bmr *1.2;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;
                ideal.bmrResult1.setText(String.valueOf(bmr));
                ideal.gizi1.setText(String.valueOf(res));
                ideal.karbo1.setText(String.valueOf(kar));
                ideal.proto1.setText(String.valueOf(pro));
                ideal.lemaks1.setText(String.valueOf(fat));
            }
            else if ( jk.equals("Perempuan")&& act.equals("Ringan ( 1,5 - 3,0 km / hari)" ))
            {
                bmr = 448 + (9*bb)+(3*tb)-(4*ur);
                res = bmr *1.4;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;
                ideal.bmrResult1.setText(String.valueOf(bmr));
                ideal.gizi1.setText(String.valueOf(res));
                ideal.karbo1.setText(String.valueOf(kar));
                ideal.proto1.setText(String.valueOf(pro));
                ideal.lemaks1.setText(String.valueOf(fat));
            }
            else if ( jk.equals("Perempuan")&& act.equals("Sedang ( 3 - 10 km / hari )" ))
            {
                bmr = 448 + (9*bb)+(3*tb)-(4*ur);
                res = bmr *1.7;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;
                ideal.bmrResult1.setText(String.valueOf(bmr));
                ideal.gizi1.setText(String.valueOf(res));
                ideal.karbo1.setText(String.valueOf(kar));
                ideal.proto1.setText(String.valueOf(pro));
                ideal.lemaks1.setText(String.valueOf(fat));
            }
            else if ( jk.equals("Perempuan")&& act.equals("Berat ( 10 atau lebih km / hari )" ))
            {
                bmr = 448 + (9*bb)+(3*tb)-(4*ur);
                res = bmr *1.9;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;

                ideal.bmrResult1.setText(String.valueOf(bmr));
                ideal.gizi1.setText(String.valueOf(res));
                ideal.karbo1.setText(String.valueOf(kar));
                ideal.proto1.setText(String.valueOf(pro));
                ideal.lemaks1.setText(String.valueOf(fat));
            }
        }

        // gendut
        else if ( bmi >=30.0 )// embul
        {

            gendut c = new gendut();
            gendut.namaUser2.setText(isianNama.getText());
            gendut.tinggiBadan2.setText(isianTinggi.getText());
            gendut.beratBadan2.setText(isianBerat.getText());
            gendut.jenisKelamin2.setText((String ) listJenisKelamin.getSelectedItem());
            gendut.umurUser2.setText(String.valueOf(ur));
            
            c.setVisible(true);
            
            if ( jk.equals("Laki-laki")&& act.equals("Sangat ringan  0 - 1,5 km / hari" ))
            {
                bmr = 88 + (13*bb)+(5*tb)-(6*ur);
                res = bmr *1.2;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;

                gendut.bmrResult2.setText(String.valueOf(bmr));
                gendut.gizi2.setText(String.valueOf(res));
                gendut.karbo2.setText(String.valueOf(kar));
                gendut.proto2.setText(String.valueOf(pro));
                gendut.lemaks2.setText(String.valueOf(fat));

            }
            else if (jk.equals("Laki-laki")&& act.equals("Ringan ( 1,5 - 3,0 km / hari)" ) )
            {
                bmr = 88 + (13*bb)+(5*tb)-(6*ur);
                res = bmr *1.4;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;

                gendut.bmrResult2.setText(String.valueOf(bmr));
                gendut.gizi2.setText(String.valueOf(res));
                gendut.karbo2.setText(String.valueOf(kar));
                gendut.proto2.setText(String.valueOf(pro));
                gendut.lemaks2.setText(String.valueOf(fat));
            }
            else if (jk.equals("Laki-laki")&& act.equals("Sedang ( 3 - 10 km / hari )" ))
            {
                bmr = 88 + (13*bb)+(5*tb)-(6*ur);
                res = bmr *1.7;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;

                gendut.bmrResult2.setText(String.valueOf(bmr));
                gendut.gizi2.setText(String.valueOf(res));
                gendut.karbo2.setText(String.valueOf(kar));
                gendut.proto2.setText(String.valueOf(pro));
                gendut.lemaks2.setText(String.valueOf(fat));
            }
            else if (jk.equals("Laki-laki")&& act.equals("Berat ( 10 atau lebih km / hari )" ))
            {
                bmr = 88 + (13*bb)+(5*tb)-(6*ur);
                res = bmr *1.9;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;

                gendut.bmrResult2.setText(String.valueOf(bmr));
                gendut.gizi2.setText(String.valueOf(res));
                gendut.karbo2.setText(String.valueOf(kar));
                gendut.proto2.setText(String.valueOf(pro));
                gendut.lemaks2.setText(String.valueOf(fat));
            }
            // female ( PR )
            else if ( jk.equals("Perempuan")&& act.equals("Sangat ringan  0 - 1,5 km / hari" ))
            {
                bmr = 448 + (9*bb)+(3*tb)-(4*ur);
                res = bmr *1.2;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;

                gendut.bmrResult2.setText(String.valueOf(bmr));
                gendut.gizi2.setText(String.valueOf(res));
                gendut.karbo2.setText(String.valueOf(kar));
                gendut.proto2.setText(String.valueOf(pro));
                gendut.lemaks2.setText(String.valueOf(fat));
            }
            else if ( jk.equals("Perempuan")&& act.equals("Ringan ( 1,5 - 3,0 km / hari)" ))
            {
               bmr = 448 + (9*bb)+(3*tb)-(4*ur);
                res = bmr *1.4;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;

                gendut.bmrResult2.setText(String.valueOf(bmr));
                gendut.gizi2.setText(String.valueOf(res));
                gendut.karbo2.setText(String.valueOf(kar));
                gendut.proto2.setText(String.valueOf(pro));
                gendut.lemaks2.setText(String.valueOf(fat));
            }
            else if ( jk.equals("Perempuan")&& act.equals("Sedang ( 3 - 10 km / hari )" ))
            {
                bmr = 448 + (9*bb)+(3*tb)-(4*ur);
                res = bmr *1.7;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;

                gendut.bmrResult2.setText(String.valueOf(bmr));
                gendut.gizi2.setText(String.valueOf(res));
                gendut.karbo2.setText(String.valueOf(kar));
                gendut.proto2.setText(String.valueOf(pro));
                gendut.lemaks2.setText(String.valueOf(fat));
            }
            else if ( jk.equals("Perempuan")&& act.equals("Berat ( 10 atau lebih km / hari )" ))
            {
               bmr = 448 + (9*bb)+(3*tb)-(4*ur);
                res = bmr *1.9;
                kar = (bmr*15/100)/4;
                pro = (bmr*20/100)/9;
                fat = (bmr*65/100)/4;

                gendut.bmrResult2.setText(String.valueOf(bmr));
                gendut.gizi2.setText(String.valueOf(res));
                gendut.karbo2.setText(String.valueOf(kar));
                gendut.proto2.setText(String.valueOf(pro));
                gendut.lemaks2.setText(String.valueOf(fat));
            }
            
        }

    }//GEN-LAST:event_nextButtonActionPerformed

    private void nextButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseExited
        // TODO add your handling code here:
nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/cek _.png")));
    }//GEN-LAST:event_nextButtonMouseExited

    private void nextButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseEntered
        // TODO add your handling code here:

nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui/CHECK _.png")));
    }//GEN-LAST:event_nextButtonMouseEntered

    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nextButtonMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Biodata().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Berat;
    private javax.swing.JLabel TanggalLahir;
    private javax.swing.JLabel aktivitas1;
    private javax.swing.JToggleButton backButton;
    private javax.swing.JLabel centimeter;
    public static javax.swing.JTextField isianBerat;
    public javax.swing.JTextField isianNama;
    public static javax.swing.JTextField isianTinggi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jenisKelamin;
    private javax.swing.JLabel kilogram;
    public static javax.swing.JComboBox listAktivitas;
    private javax.swing.JComboBox listJenisKelamin;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nama;
    private javax.swing.JToggleButton nextButton;
    private javax.swing.JLabel tinggi;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/painlessgui/Painlessicon.png")));
    }
}
