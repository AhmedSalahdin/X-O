
import javax.swing.JOptionPane;
public class play extends javax.swing.JFrame {
    public play() {
        initComponents();
    }
int x=1,o=0,z=0,d=1;
char c1='1',c2='2',c3='3',c4='4',c5='5',c6='6',c7='7',c8='8',c9='9';
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        z1 = new javax.swing.JButton();
        z2 = new javax.swing.JButton();
        z3 = new javax.swing.JButton();
        z4 = new javax.swing.JButton();
        z5 = new javax.swing.JButton();
        z6 = new javax.swing.JButton();
        z7 = new javax.swing.JButton();
        z8 = new javax.swing.JButton();
        z9 = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        scro = new javax.swing.JLabel();
        scrx = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        z1.setFont(new java.awt.Font("Buxton Sketch", 3, 36)); // NOI18N
        z1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z1ActionPerformed(evt);
            }
        });

        z2.setFont(new java.awt.Font("Buxton Sketch", 3, 36)); // NOI18N
        z2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z2ActionPerformed(evt);
            }
        });

        z3.setFont(new java.awt.Font("Buxton Sketch", 3, 36)); // NOI18N
        z3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z3ActionPerformed(evt);
            }
        });

        z4.setFont(new java.awt.Font("Buxton Sketch", 3, 36)); // NOI18N
        z4.setToolTipText("");
        z4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z4ActionPerformed(evt);
            }
        });

        z5.setFont(new java.awt.Font("Buxton Sketch", 3, 36)); // NOI18N
        z5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z5ActionPerformed(evt);
            }
        });

        z6.setFont(new java.awt.Font("Buxton Sketch", 3, 36)); // NOI18N
        z6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z6ActionPerformed(evt);
            }
        });

        z7.setFont(new java.awt.Font("Buxton Sketch", 3, 36)); // NOI18N
        z7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z7ActionPerformed(evt);
            }
        });

        z8.setFont(new java.awt.Font("Buxton Sketch", 3, 36)); // NOI18N
        z8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z8ActionPerformed(evt);
            }
        });

        z9.setFont(new java.awt.Font("Buxton Sketch", 3, 36)); // NOI18N
        z9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z9ActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Buxton Sketch", 0, 36)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Buxton Sketch", 2, 36)); // NOI18N
        jLabel1.setText("Player O");

        jLabel2.setFont(new java.awt.Font("Buxton Sketch", 2, 36)); // NOI18N
        jLabel2.setText("Player X");

        scro.setFont(new java.awt.Font("Buxton Sketch", 2, 36)); // NOI18N
        scro.setText("0");

        scrx.setFont(new java.awt.Font("Buxton Sketch", 2, 36)); // NOI18N
        scrx.setText("0");

        jLabel5.setFont(new java.awt.Font("Buxton Sketch", 2, 36)); // NOI18N
        jLabel5.setText("V.S");

        tu.setFont(new java.awt.Font("Buxton Sketch", 1, 24)); // NOI18N
        tu.setText("O Turn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(tu, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(z1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(z4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(z7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(z2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(z5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(z8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(z9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(z6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(z3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrx, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(scro, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(scrx, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(z4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(z8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void z1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z1ActionPerformed
        if(x%2==0)
        {
            d++;
            z1.setText("X");
            tu.setText("O Turn");
            z1.setEnabled(false);
            c1='x';
            if(((c1==c2)&&(c1==c3))||((c1==c4)&&(c1==c7))||((c1==c5)&&(c1==c9)))
                xwin();
            
        }
        else
        {
            d++;
            z1.setText("O");
            tu.setText("X Turn");
            c1='o';
            z1.setEnabled(false);
                if(((c1==c2)&&(c1==c3))||((c1==c4)&&(c1==c7))||((c1==c5)&&(c1==c9)))
                    owin();
        }
        x++; 
        if(d==10)
            draw();
    }//GEN-LAST:event_z1ActionPerformed

    private void z2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z2ActionPerformed
        if(x%2==0)
        {
            d++;
            z2.setText("X");
            tu.setText("O Turn");
            c2='x';
            z2.setEnabled(false);
              if(((c2==c1)&&(c2==c3))||((c2==c5)&&(c2==c8)))
                  xwin();
        }
        else
        {
            d++;
            z2.setText("O");
            tu.setText("X Turn");
            c2='o';
            z2.setEnabled(false);
            if(((c2==c1)&&(c2==c3))||((c2==c5)&&(c2==c8)))
                  owin();  
        }
        x++;
        if(d==10)
            draw();
    }//GEN-LAST:event_z2ActionPerformed

    private void z3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z3ActionPerformed
        if(x%2==0)
        {
            d++;
            z3.setText("X");
            tu.setText("O Turn");
            c3='x';
            z3.setEnabled(false);
            if(((c3==c2)&&(c3==c1))||((c3==c6)&&(c3==c9))||((c3==c5)&&(c3==c7)))
                xwin();
        }
        else
        {
            d++;
            z3.setText("O");
            tu.setText("X Turn");
            c3='o';
            z3.setEnabled(false);
            if(((c3==c2)&&(c3==c1))||((c3==c6)&&(c3==c9))||((c3==c5)&&(c3==c7)))
                owin();
        }
        x++;
        if(d==10)
            draw();
    }//GEN-LAST:event_z3ActionPerformed

    private void z4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z4ActionPerformed
        if(x%2==0)
        {
            d++;
            z4.setText("X");
            tu.setText("O Turn");
            c4='x';
            z4.setEnabled(false);
            if(((c4==c5)&&(c4==c6))||((c4==c1)&&(c4==c7)))
                xwin();
        }
        else
        {
            d++;
            z4.setText("O");
            tu.setText("X Turn");
            c4='o';
            z4.setEnabled(false);
            if(((c4==c5)&&(c4==c6))||((c4==c1)&&(c4==c7)))
                owin();  
        }
        x++;
        if(d==10)
            draw();
    }//GEN-LAST:event_z4ActionPerformed

    private void z5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z5ActionPerformed
        if(x%2==0)
        {
            d++;
            z5.setText("X");
            tu.setText("O Turn");
            c5='x';
            z5.setEnabled(false);
            if(((c5==c4)&&(c5==c6))||((c5==c2)&&(c5==c8)))
                xwin();
        }
        else
        {
            d++;
            z5.setText("O");
            tu.setText("X Turn");
            c5='o';
            z5.setEnabled(false);
            if(((c5==c4)&&(c5==c6))||((c5==c2)&&(c5==c8)))
                owin();
        }
        x++;
        if(d==10)
            draw();
    }//GEN-LAST:event_z5ActionPerformed

    private void z6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z6ActionPerformed
        if(x%2==0)
        {
            d++;
            z6.setText("X");
            tu.setText("O Turn");
            c6='x';
            z6.setEnabled(false);
            if(((c6==c4)&&(c6==c5))||((c6==c3)&&(c6==c9)))
                xwin();
        }
        else
        {
            d++;
            z6.setText("O");
            tu.setText("X Turn");
            c6='o';
            z6.setEnabled(false);
            if(((c6==c4)&&(c6==c5))||((c6==c3)&&(c6==c9)))
                owin();
        }
        x++;
        if(d==10)
            draw();
    }//GEN-LAST:event_z6ActionPerformed

    private void z7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z7ActionPerformed
       if(x%2==0)
        {
            d++;
            z7.setText("X");
            tu.setText("O Turn");
            c7='x';
            z7.setEnabled(false);
            if(((c7==c8)&&(c7==c9))||((c7==c5)&&(c7==c3))||((c7==c4)&&(c7==c1)))
                xwin();
        }
        else
        {
            d++;
            z7.setText("O");
            tu.setText("X Turn");
            c7='o';
            z7.setEnabled(false);
            if(((c7==c8)&&(c7==c9))||((c7==c5)&&(c7==c3))||((c7==c4)&&(c7==c1)))
                owin();
        }
        x++;
        if(d==10)
           draw();
    }//GEN-LAST:event_z7ActionPerformed

    private void z8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z8ActionPerformed
        if(x%2==0)
        {
            d++;
            z8.setText("X");
            tu.setText("O Turn");
            c8='x';
            z8.setEnabled(false);
            if(((c8==c7)&&(c8==c9))||((c8==c5)&&(c8==c2)))
                xwin();
        }
        else
        {
            d++;
            z8.setText("O");
            tu.setText("X Turn");
            c8='o';
            z8.setEnabled(false);
            if(((c8==c7)&&(c8==c9))||((c8==c5)&&(c8==c2)))
                owin();
        }
        x++;
        if(d==10)
            draw();
    }//GEN-LAST:event_z8ActionPerformed

    private void z9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z9ActionPerformed
        if(x%2==0)
        {
            d++;
            z9.setText("X");
            tu.setText("O Turn");
            c9='x';
            z9.setEnabled(false);
            if(((c9==c8)&&(c9==c7))||((c9==c6)&&(c9==c3))||((c9==c5)&&(c9==c1)))
                xwin();
        }
        else
        {
            d++;
            z9.setText("O");
            tu.setText("X Turn");
            c9='o';
            z9.setEnabled(false);
            if(((c9==c8)&&(c9==c7))||((c9==c6)&&(c9==c3))||((c9==c5)&&(c9==c1)))
                owin();
        }
        x++;
        if(d==10)
           draw();
    }//GEN-LAST:event_z9ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new play().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel scro;
    private javax.swing.JLabel scrx;
    private javax.swing.JLabel tu;
    private javax.swing.JButton z1;
    private javax.swing.JButton z2;
    private javax.swing.JButton z3;
    private javax.swing.JButton z4;
    private javax.swing.JButton z5;
    private javax.swing.JButton z6;
    private javax.swing.JButton z7;
    private javax.swing.JButton z8;
    private javax.swing.JButton z9;
    // End of variables declaration//GEN-END:variables

    public void draw(){
         JOptionPane.showMessageDialog(null,"DRAW","Draw",JOptionPane.INFORMATION_MESSAGE);
            z1.setText("");
           z1.setEnabled(true);
           c1='1';
           z2.setText("");
           z2.setEnabled(true);
           c2='2';
           z3.setText("");
           z3.setEnabled(true);
           c3='3';
           z4.setText("");
           z4.setEnabled(true);
           c4='4';
           z5.setText("");
           z5.setEnabled(true);
           c5='5';
           z6.setText("");
           z6.setEnabled(true);
           c6='6';
           z7.setText("");
           z7.setEnabled(true);
           c7='7';
           z8.setText("");
           z8.setEnabled(true);
           c8='8';
           z9.setText("");
           z9.setEnabled(true);
           c9='9';
           d=1;      
}
    public void xwin(){
        JOptionPane.showMessageDialog(null,"Player X Win","Win",JOptionPane.INFORMATION_MESSAGE);
           z++;
           scrx.setText(String.valueOf(z));
           z1.setText("");
           z1.setEnabled(true);
           c1='1';
           z2.setText("");
           z2.setEnabled(true);
           c2='2';
           z3.setText("");
           z3.setEnabled(true);
           c3='3';
           z4.setText("");
           z4.setEnabled(true);
           c4='4';
           z5.setText("");
           z5.setEnabled(true);
           c5='5';
           z6.setText("");
           z6.setEnabled(true);
           c6='6';
           z7.setText("");
           z7.setEnabled(true);
           c7='7';
           z8.setText("");
           z8.setEnabled(true);
           c8='8';
           z9.setText("");
           z9.setEnabled(true);
           c9='9';
           d=1;
    }
    public void owin(){
         JOptionPane.showMessageDialog(null,"Player O Win","Win",JOptionPane.INFORMATION_MESSAGE);
           o++;
           scro.setText(String.valueOf(o));
           z1.setText("");
           z1.setEnabled(true);
           c1='1';
           z2.setText("");
           z2.setEnabled(true);
           c2='2';
           z3.setText("");
           z3.setEnabled(true);
           c3='3';
           z4.setText("");
           z4.setEnabled(true);
           c4='4';
           z5.setText("");
           z5.setEnabled(true);
           c5='5';
           z6.setText("");
           z6.setEnabled(true);
           c6='6';
           z7.setText("");
           z7.setEnabled(true);
           c7='7';
           z8.setText("");
           z8.setEnabled(true);
           c8='8';
           z9.setText("");
           z9.setEnabled(true);
           c9='9';
           d=1;
    }
}
