








package Interfaz;


import Interfaz.Diseño1;
import Interfaz.Ingresar1;
import Interfaz.Consultar1;

import Interfaz.Ingresar1;
import Interfaz.Listados1;
import Interfaz.Modificar1;
import Interfaz.Ingresar1;
import javax.swing.JOptionPane;

public class Diseño1 extends javax.swing.JFrame {

    /**
     * Creates new form Diseño1
     */
    public Diseño1() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 928, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mod.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(340, 260, 60, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/list.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(340, 380, 60, 50);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(790, 380, 60, 50);

        jLabel6.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Salir");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(650, 380, 80, 50);

        jLabel5.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Listar");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(180, 390, 100, 19);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ing.png"))); // NOI18N
        jButton5.setMinimumSize(new java.awt.Dimension(90, 23));
        jButton5.setPreferredSize(new java.awt.Dimension(90, 23));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(340, 130, 60, 60);

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Menu Principal");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(820, 20, 80, 19);

        jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Empleados");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(400, 40, 240, 25);

        jLabel4.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Eliminar");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(560, 280, 170, 19);

        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Ingresar ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(130, 150, 150, 19);

        jLabel7.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Modificar");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(110, 280, 170, 19);

        jLabel8.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Consultar");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(560, 150, 170, 19);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/elim.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(790, 260, 60, 60);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mod.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(790, 130, 60, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 930, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        Modificar1 verr= new Modificar1();
        verr.setVisible(true);
        verr.setSize(949,555);  
        this.setVisible(false);
        this.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
//        
//        int i =JOptionPane.showConfirmDialog(this,"¿Realmente Desea Salir del programa?",
//                "Confirmar Salida",JOptionPane.YES_NO_OPTION);
//        if(i==0){
//        System.exit(0);
//}
//        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     
        Ingresar1 v= new Ingresar1();
        v.setVisible(true);
        v.setSize(1232, 575);
        this.setVisible(false);
        this.setLocationRelativeTo(null);
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        Listados1 obj= new Listados1();
        
        
        obj.setVisible(true);
        obj.setSize(949,555);
        this.setVisible(false);
        this.setLocationRelativeTo(null);
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        Consultar1 ve= new Consultar1();
        ve.setVisible(true);
        ve.setSize(949,555);
        this.setVisible(false);
        this.setLocationRelativeTo(null);
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Diseño1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diseño1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diseño1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diseño1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diseño1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
