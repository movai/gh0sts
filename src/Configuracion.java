
import javax.swing.ButtonGroup;
public class Configuracion extends javax.swing.JFrame {
        

    public Configuracion() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
ButtonGroup grupo=new ButtonGroup();
ButtonGroup grupo2=new ButtonGroup();
    

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        ALEATORIO = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Normal = new javax.swing.JRadioButton();
        Defalto = new javax.swing.JButton();
        Expert = new javax.swing.JRadioButton();
        Genius = new javax.swing.JRadioButton();
        MANUAL = new javax.swing.JRadioButton();

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(800, 600, 800, 600));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 500));
        setName("frame"); // NOI18N
        setSize(new java.awt.Dimension(720, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ALEATORIO.setText("Aleatorio");
        ALEATORIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALEATORIOActionPerformed(evt);
            }
        });
        getContentPane().add(ALEATORIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 120, -1));

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 64, -1));

        jLabel1.setText("Dificultad");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 70, 32));

        jLabel2.setText("Modo de Juego");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        Normal.setText("Normal");
        Normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NormalActionPerformed(evt);
            }
        });
        getContentPane().add(Normal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 100, -1));

        Defalto.setText("Por Defalto");
        Defalto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaltoActionPerformed(evt);
            }
        });
        getContentPane().add(Defalto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 100, -1));

        Expert.setText("Expert");
        Expert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpertActionPerformed(evt);
            }
        });
        getContentPane().add(Expert, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 110, -1));

        Genius.setText("Genius");
        Genius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeniusActionPerformed(evt);
            }
        });
        getContentPane().add(Genius, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 110, -1));

        MANUAL.setText("Manual");
        MANUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MANUALActionPerformed(evt);
            }
        });
        getContentPane().add(MANUAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 100, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          // Boton back
        PantallaMenu Back_Menu = new PantallaMenu();
        Back_Menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void MANUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MANUALActionPerformed
    grupo2.add(MANUAL);
    this.add(MANUAL);
    this.setLocationRelativeTo(null);
    MANUAL.setSelected(true);
    this.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_MANUALActionPerformed

    private void ALEATORIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALEATORIOActionPerformed
    grupo2.add(ALEATORIO);
    this.add(ALEATORIO);
    this.setLocationRelativeTo(null);
    ALEATORIO.setSelected(true);
    this.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_ALEATORIOActionPerformed

    private void DefaltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefaltoActionPerformed
        Normal.setSelected(true);
        Normal.setVisible(true);
        this.setLocationRelativeTo(null);
        ALEATORIO.setSelected(true);
        ALEATORIO.setVisible(true);
        
    // TODO add your handling code here:
    }//GEN-LAST:event_DefaltoActionPerformed

    private void ExpertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpertActionPerformed
        grupo.add(Expert); // TODO add your handling code here:
        this.add(Expert);
        this.setLocationRelativeTo(null);
        Expert.setSelected(true);
        this.setVisible(true);

    }//GEN-LAST:event_ExpertActionPerformed

    private void GeniusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeniusActionPerformed
        grupo.add(Genius);
        this.add(Genius);
        this.setLocationRelativeTo(null);
        Genius.setSelected(true);
        this.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_GeniusActionPerformed

    private void NormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NormalActionPerformed
        grupo.add(Normal);
        this.add(Normal);
        this.setLocationRelativeTo(null);
        Normal.setSelected(true);
        this.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_NormalActionPerformed

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
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ALEATORIO;
    private javax.swing.JButton Defalto;
    private javax.swing.JRadioButton Expert;
    private javax.swing.JRadioButton Genius;
    private javax.swing.JRadioButton MANUAL;
    private javax.swing.JRadioButton Normal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
