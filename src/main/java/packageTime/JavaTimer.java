package packageTime;

import javax.swing.JOptionPane;
import java.util.*;

public class JavaTimer extends javax.swing.JFrame {
private int ss, mm, hh;
private Timer timer = new Timer();
private String stringhh, stringmm, stringss;
private boolean key = false;

    public JavaTimer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTimer = new javax.swing.JLabel();
        btTime = new javax.swing.JButton();
        btStart = new javax.swing.JButton();
        btCro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfmm = new javax.swing.JTextField();
        tfss = new javax.swing.JTextField();
        tfhh = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTimer.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        labelTimer.setText("00:00:00");

        btTime.setText("RELOJ");
        btTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimeActionPerformed(evt);
            }
        });

        btStart.setText("EMPEZAR");
        btStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStartActionPerformed(evt);
            }
        });

        btCro.setText("CRONOMETRO");
        btCro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCroActionPerformed(evt);
            }
        });

        jLabel2.setText("HH:");

        jLabel3.setText("mm:");

        jLabel4.setText("ss:");

        tfmm.setToolTipText("MINUTOS");

        tfss.setToolTipText("SEGUNDOS");

        tfhh.setToolTipText("HORA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelTimer)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfhh, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfmm, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfss, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btStart, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(labelTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfmm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfhh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btStart, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTime, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStartActionPerformed
        hh = Integer.parseInt(tfhh.getText());
        mm = Integer.parseInt(tfmm.getText());
        ss = Integer.parseInt(tfss.getText());
        
        JavaTimer f3 = new JavaTimer();
        f3.setVisible(true);
        
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelTimer;
    private javax.swing.JTextField tfhh;
    private javax.swing.JTextField tfmm;
    private javax.swing.JTextField tfss;
    // End of variables declaration//GEN-END:variables
}
