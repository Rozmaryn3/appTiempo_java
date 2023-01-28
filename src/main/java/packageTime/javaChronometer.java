package packageTime;

import java.util.*;

public class javaChronometer extends javax.swing.JFrame {
    private int ss = 0;
    private int mm = 0;
    private int hh = 0;

    public javaChronometer() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCro = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        labelCro.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        labelCro.setText("00:00:00");

        jButton1.setText("RELOJ");
        jButton1.setMaximumSize(new java.awt.Dimension(119, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(95, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("TEMPORIZADOR");

        jButton6.setText("RESTABLECER");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("INICIO");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(labelCro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(labelCro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         Timer timer = new Timer();
        
         TimerTask tareaCronometro = new TimerTask(){
            @Override
            public void run(){
                String numSS = "0", numMM = "0", numHH = "0";   
                ss++;
                
                 if(hh == 99 && mm == 59 && ss == 59){
                    System.out.print("CRONOMETRO FINALIZADO");
                    timer.cancel();
                }

                if(mm == 59 && ss == 59){
                    hh++;
                    mm = 0;
                    ss = 0;
                }
                
                if(ss == 59 ){
                    mm++;
                    ss = 0;
                }

                if(ss < 10 || mm < 10 || hh < 10){
                    numSS = Integer.toString(ss);
                    numMM = Integer.toString(mm);
                    numHH = Integer.toString(hh);
                    
                    labelCro.setText("0" + numHH + ":0" + numMM + ":0" + numSS);
                }
                
                if(ss >= 10 && mm < 10 && hh < 10){
                    numSS = Integer.toString(ss);
                    numMM = Integer.toString(mm);
                    numHH = Integer.toString(hh);
                    
                    labelCro.setText("0" + numHH + ":0" + numMM + ":" + numSS);
                }
                
                if(ss < 10 && mm >= 10 && hh < 10){
                    numSS = Integer.toString(ss);
                    numMM = Integer.toString(mm);
                    numHH = Integer.toString(hh);
                    
                    labelCro.setText("0" + numHH + ":" + numMM + ":0" + numSS);
                }
                
                if(ss >= 10 && mm >= 10 && hh < 10){
                    numSS = Integer.toString(ss);
                    numMM = Integer.toString(mm);
                    numHH = Integer.toString(hh);
                    
                    labelCro.setText("0" + numHH + ":" + numMM + ":" + numSS);
                }
                
                if(ss < 10 && mm < 10 && hh >= 10){
                    numSS = Integer.toString(ss);
                    numMM = Integer.toString(mm);
                    numHH = Integer.toString(hh);
                    
                    labelCro.setText("" + numHH + ":0" + numMM + ":0" + numSS);
                }
                
                if(ss < 10 && mm < 10 && hh >= 10){
                    numSS = Integer.toString(ss);
                    numMM = Integer.toString(mm);
                    numHH = Integer.toString(hh);
                    
                    labelCro.setText("" + numHH + ":0" + numMM + ":0" + numSS);
                }
                
                if(ss >= 10 && mm < 10 && hh >= 10){
                    numSS = Integer.toString(ss);
                    numMM = Integer.toString(mm);
                    numHH = Integer.toString(hh);
                    
                    labelCro.setText("" + numHH + ":" + numMM + "0:" + numSS);
                }
                
                if(ss < 10 && mm >= 10 && hh >= 10){
                    numSS = Integer.toString(ss);
                    numMM = Integer.toString(mm);
                    numHH = Integer.toString(hh);
                    
                    labelCro.setText("" + numHH + ":" + numMM + ":0" + numSS);
                }
                
                if(ss >= 10 && mm >= 10 && hh >= 10){
                    numSS = Integer.toString(ss);
                    numMM = Integer.toString(mm);
                    numHH = Integer.toString(hh);
                    
                    labelCro.setText("" + numHH + ":" + numMM + ":" + numSS);
                }
                
            }
        };
        timer.schedule(tareaCronometro,0,1000);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       ss = 0;
       mm = 0;
       hh = 0;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JavaTime f1 = new JavaTime();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new javaChronometer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel labelCro;
    // End of variables declaration//GEN-END:variables
}
