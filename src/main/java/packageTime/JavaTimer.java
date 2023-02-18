package packageTime;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.BorderFactory;

public class JavaTimer extends javax.swing.JFrame {
private int ss, mm, hh , posX, posY;;
private Timer timer = new Timer();
private String stringhh, stringmm, stringss;
private boolean key = false, aux = false;

    public JavaTimer() {
        initComponents();
        
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.black));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTimer = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btTime = new javax.swing.JButton();
        btStart = new javax.swing.JButton();
        btCro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        tfhh = new javax.swing.JTextField();
        tfmm = new javax.swing.JTextField();
        tfss = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTimer.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        labelTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTimer.setText("00:00:00");
        jPanel1.add(labelTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 54, 160, 100));

        jPanel2.setBackground(new java.awt.Color(53, 177, 208));

        btTime.setBackground(new java.awt.Color(0, 102, 255));
        btTime.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        btTime.setForeground(new java.awt.Color(255, 255, 255));
        btTime.setText("RELOJ");
        btTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimeActionPerformed(evt);
            }
        });

        btStart.setBackground(new java.awt.Color(0, 102, 255));
        btStart.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        btStart.setForeground(new java.awt.Color(255, 255, 255));
        btStart.setText("EMPEZAR");
        btStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStartActionPerformed(evt);
            }
        });

        btCro.setBackground(new java.awt.Color(0, 102, 255));
        btCro.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        btCro.setForeground(new java.awt.Color(255, 255, 255));
        btCro.setText("CRONOMETRO");
        btCro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCroActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 102, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btTime, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btStart, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btCro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTime, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btStart, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 400, 70));

        tfhh.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        tfhh.setForeground(new java.awt.Color(153, 153, 153));
        tfhh.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfhh.setText("HORAS");
        tfhh.setToolTipText("HORA");
        tfhh.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfhhFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfhhFocusLost(evt);
            }
        });
        jPanel1.add(tfhh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 110, -1));

        tfmm.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        tfmm.setForeground(new java.awt.Color(153, 153, 153));
        tfmm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfmm.setText("MINUTOS");
        tfmm.setToolTipText("MINUTOS");
        tfmm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfmmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfmmFocusLost(evt);
            }
        });
        jPanel1.add(tfmm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 120, -1));

        tfss.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        tfss.setForeground(new java.awt.Color(153, 153, 153));
        tfss.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfss.setText("SEGUNDOS");
        tfss.setToolTipText("SEGUNDOS");
        tfss.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfssFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfssFocusLost(evt);
            }
        });
        jPanel1.add(tfss, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 110, -1));

        jPanel3.setBackground(new java.awt.Color(53, 177, 208));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        labelExit.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        labelExit.setForeground(new java.awt.Color(255, 255, 255));
        labelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelExit.setText("X");
        labelExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 337, Short.MAX_VALUE)
                .addComponent(labelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelExit, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 102, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStartActionPerformed
        if(aux == true){
            this.setVisible(false);
            JavaTimer f3 = new JavaTimer();
            f3.setVisible(true);
        }
        btStart.setText("DETENER");
        
        
        hh = Integer.parseInt(tfhh.getText());
        mm = Integer.parseInt(tfmm.getText());
        ss = Integer.parseInt(tfss.getText());
        
        if(hh >= 100 || mm >= 61 || ss >= 61 || hh < 0 || mm < 0 || ss < 0 || tfhh.getText() == "" || tfmm.getText() == "" || tfss.getText() == ""){
            hh = 0;
            mm = 0;
            ss = 0;
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        
        else{
            TimerTask task = new TimerTask(){
                
                @Override
                public void run(){
                    ss--;
                    
                    if(ss == -1 && mm > 0){
                        mm--;
                        ss = 59;
                    }

                    if(ss == 0 && mm == 0 && hh == 0){
                        timer.cancel();
                    }
                    
                    if(ss == -1 && mm == -1 && hh > 0){
                        hh--;
                        ss = 59;
                        mm = 59;
                    }
                    
                    if(ss < 10 && mm == 0 && hh == 0){
                        stringss = Integer.toString(ss);
                        labelTimer.setText("00:00:0" + stringss);
                    }
                    
                    if(ss >= 10 && mm == 0 && hh == 0){
                        stringss = Integer.toString(ss);
                        labelTimer.setText("00:00:" + stringss);
                    }
                    
                    if(ss < 10 && mm < 10 && hh == 0){
                        stringmm = Integer.toString(mm);
                        stringss = Integer.toString(ss);
                        labelTimer.setText("00:0" + stringmm + ":0" + stringss);
                    }
                    
                    if(ss >= 10 && mm < 10 && hh == 0){
                        stringmm = Integer.toString(mm);
                        stringss = Integer.toString(ss);
                        labelTimer.setText("00:0" + stringmm + ":" + stringss);
                    }
                    
                    if(ss >= 10 && mm >= 10 && hh == 0){
                        stringmm = Integer.toString(mm);
                        stringss = Integer.toString(ss);
                        labelTimer.setText("00:" + stringmm + ":" + stringss);
                    }
                    
                    if(ss < 10 && mm < 10 && hh < 10){
                        stringmm = Integer.toString(mm);
                        stringss = Integer.toString(ss);
                         stringhh = Integer.toString(hh);
                        labelTimer.setText("0" + stringhh + ":0"+ stringmm + ":0" + stringss);
                    }
                    
                    if(ss >= 10 && mm < 10 && hh < 10){
                        stringmm = Integer.toString(mm);
                        stringss = Integer.toString(ss);
                         stringhh = Integer.toString(hh);
                        labelTimer.setText("0" + stringhh + ":0"+ stringmm + ":" + stringss);
                    }
                    
                    if(ss >= 10 && mm >= 10 && hh < 10){
                        stringmm = Integer.toString(mm);
                        stringss = Integer.toString(ss);
                         stringhh = Integer.toString(hh);
                        labelTimer.setText("0" + stringhh + ":" + stringmm + ":" + stringss);
                    }
                    
                    if(ss >= 10 && mm >= 10 && hh >= 10){
                        stringmm = Integer.toString(mm);
                        stringss = Integer.toString(ss);
                         stringhh = Integer.toString(hh);
                        labelTimer.setText(stringhh +  ":" + stringmm + ":" + stringss);
                    }
                    
                    if(ss < 10 && mm >= 10 && hh < 10){
                        stringmm = Integer.toString(mm);
                        stringss = Integer.toString(ss);
                         stringhh = Integer.toString(hh);
                        labelTimer.setText("0" + stringhh + ":" + stringmm + ":0" + stringss);
                    }
                    
                    if(ss < 10 && mm >= 10 && hh >= 10){
                        stringmm = Integer.toString(mm);
                        stringss = Integer.toString(ss);
                         stringhh = Integer.toString(hh);
                        labelTimer.setText(stringhh + ":" + stringmm + ":0" + stringss);
                    }
                    
                    if(ss >= 10 && mm < 10 && hh >= 10){
                        stringmm = Integer.toString(mm);
                        stringss = Integer.toString(ss);
                         stringhh = Integer.toString(hh);
                        labelTimer.setText(stringhh + ":0" + stringmm + ":" + stringss);
                    }
                }
            };
            timer.schedule(task,0,1000);
       }
       aux = true; 
    }//GEN-LAST:event_btStartActionPerformed

    private void btTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimeActionPerformed
        JavaTime f2 = new JavaTime();
        f2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btTimeActionPerformed

    private void btCroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCroActionPerformed
        javaChronometer f2 = new javaChronometer();
        f2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btCroActionPerformed

    private void tfhhFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfhhFocusGained
        if(tfhh.getText().equals("HORAS")){
            tfhh.setText("");
            tfhh.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_tfhhFocusGained

    private void tfhhFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfhhFocusLost
        if(tfhh.getText().equals("")){
            tfhh.setText("HORAS");
            tfhh.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_tfhhFocusLost

    private void tfmmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfmmFocusGained
        if(tfmm.getText().equals("MINUTOS")){
            tfmm.setText("");
            tfmm.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_tfmmFocusGained

    private void tfmmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfmmFocusLost
        if(tfmm.getText().equals("")){
            tfmm.setText("MINUTOS");
            tfmm.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_tfmmFocusLost

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        
    }//GEN-LAST:event_jPanel1FocusGained

    private void tfssFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfssFocusGained
        if(tfss.getText().equals("SEGUNDOS")){
            tfss.setText("");
            tfss.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_tfssFocusGained

    private void tfssFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfssFocusLost
        if(tfss.getText().equals("")){
            tfss.setText("SEGUNDOS");
            tfss.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_tfssFocusLost

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelExitMouseClicked

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x -posX,y - posY);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        posY = evt.getY();
        posX = evt.getX();
    }//GEN-LAST:event_jPanel3MousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaTimer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCro;
    private javax.swing.JButton btStart;
    private javax.swing.JButton btTime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelTimer;
    private javax.swing.JTextField tfhh;
    private javax.swing.JTextField tfmm;
    private javax.swing.JTextField tfss;
    // End of variables declaration//GEN-END:variables
}
