/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Emp.Formu;
import java.util.ArrayList;


public class Listados1 extends javax.swing.JFrame {

    
    
     ArrayList<Formu> bases = new ArrayList<Formu>();
     
    public Listados1() {
        initComponents();
        
        listadoscorre recibir=new listadoscorre();
        recibir.setVisible(true);
        recibir.setSize(663, 453);  
        this.setVisible(false);
        this.setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Reportes Empleados");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(250, 40, 420, 25);

        jLabel3.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Direcciones / E-mail:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(200, 420, 370, 20);

        jLabel4.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Sueldos con salario minimo:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(200, 120, 370, 20);

        jLabel5.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Listado area gerencia:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(200, 180, 370, 20);

        jLabel6.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Listado area administrativa:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(200, 240, 370, 20);

        jLabel7.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Listado area planta:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(200, 300, 370, 20);

        jLabel8.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Subsidio transporte:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(200, 360, 370, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listado (1).jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(610, 400, 50, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listado (1).jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(610, 100, 50, 50);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listado (1).jpg"))); // NOI18N
        jPanel2.add(jButton3);
        jButton3.setBounds(610, 160, 50, 50);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listado (1).jpg"))); // NOI18N
        jPanel2.add(jButton4);
        jButton4.setBounds(610, 220, 50, 50);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listado (1).jpg"))); // NOI18N
        jPanel2.add(jButton5);
        jButton5.setBounds(610, 280, 50, 50);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listado (1).jpg"))); // NOI18N
        jPanel2.add(jButton6);
        jButton6.setBounds(610, 340, 50, 50);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guar.jpg"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(70, 420, 60, 60);

        jLabel25.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Volver al menu");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(-10, 480, 200, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 930, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      Diseño1 ver= new Diseño1();
        ver.setVisible(true);
        ver.setSize(928, 575);
        this.setVisible(false);
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        
        
        
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Listados1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listados1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listados1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listados1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listados1().setVisible(true);
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
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
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