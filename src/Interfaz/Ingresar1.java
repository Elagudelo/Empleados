package Interfaz;

import Emp.Formu;
//import Emp.Formulario;

import java.util.ArrayList;
import Interfaz.listadoscorre;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Ingresar1 extends javax.swing.JFrame {

    ArrayList<Formu> bases = new ArrayList<Formu>();
   

    public Ingresar1() {
        initComponents();
        
        listadoscorre recibir=new listadoscorre();
        recibir.setVisible(true);
        recibir.setSize(663, 453);  
        this.setVisible(false);
        this.setLocationRelativeTo(null);
        
        
    }
 

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
        jTextField1nombres = new javax.swing.JTextField();
        jTextField1apellidos = new javax.swing.JTextField();
        jTextField3cedula = new javax.swing.JTextField();
        jTextField4celular = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField5direccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField6correo = new javax.swing.JTextField();
        jTextField7telefonofijo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField8salariobase = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField9valorh = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField10horasexn = new javax.swing.JTextField();
        jTextField11horaexd = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField12valorexn = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField14totalen = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField15subtransporte = new javax.swing.JTextField();
        jButton4guardar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jButton5calcular = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jButton6limpiar = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jTextField13valorexd1 = new javax.swing.JTextField();
        jTextField14salariofinal14 = new javax.swing.JTextField();
        jTextField14totaled = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1basesdatos = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jButton4eliminar = new javax.swing.JButton();
        jButton5modificar = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Ingresar Empleado");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(270, 30, 420, 25);

        jLabel3.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText(" Nombres: ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 80, 110, 20);

        jLabel4.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Apellidos: ");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 120, 110, 20);

        jLabel5.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Cedula:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(50, 160, 80, 20);

        jLabel6.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Celular:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(50, 200, 81, 20);

        jLabel7.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Salario:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(530, 350, 100, 40);

        jTextField1nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1nombresActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1nombres);
        jTextField1nombres.setBounds(150, 80, 275, 20);
        jPanel2.add(jTextField1apellidos);
        jTextField1apellidos.setBounds(150, 120, 275, 20);
        jPanel2.add(jTextField3cedula);
        jTextField3cedula.setBounds(150, 160, 275, 20);

        jTextField4celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4celularActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField4celular);
        jTextField4celular.setBounds(150, 200, 275, 20);

        jLabel8.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Area:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(430, 80, 80, 13);

        jButton1.setText("Guardar en Gerencia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(520, 77, 140, 23);

        jButton2.setText("Administrativa");
        jPanel2.add(jButton2);
        jButton2.setBounds(670, 77, 120, 23);

        jButton3.setText("Planta");
        jPanel2.add(jButton3);
        jButton3.setBounds(800, 77, 80, 23);

        jLabel9.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Direccion:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(440, 120, 130, 20);
        jPanel2.add(jTextField5direccion);
        jTextField5direccion.setBounds(580, 120, 240, 20);

        jLabel10.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Telefono:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(460, 200, 110, 20);

        jLabel11.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("E-mail:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(490, 160, 80, 20);

        jTextField6correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6correoActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField6correo);
        jTextField6correo.setBounds(580, 160, 240, 20);
        jPanel2.add(jTextField7telefonofijo);
        jTextField7telefonofijo.setBounds(580, 200, 240, 20);

        jLabel12.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Valor Hora:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(550, 240, 130, 20);

        jTextField8salariobase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8salariobaseActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField8salariobase);
        jTextField8salariobase.setBounds(430, 240, 120, 20);

        jLabel13.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Nocturnas:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(500, 280, 150, 40);

        jTextField9valorh.setBackground(new java.awt.Color(0, 0, 0));
        jTextField9valorh.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jTextField9valorh.setForeground(new java.awt.Color(153, 255, 51));
        jTextField9valorh.setEnabled(false);
        jTextField9valorh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9valorhActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField9valorh);
        jTextField9valorh.setBounds(690, 240, 150, 24);

        jLabel14.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Genero:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(40, 240, 90, 20);

        jLabel15.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 153, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Salario Base:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(260, 240, 160, 20);

        jLabel16.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Diurnas:");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(250, 280, 110, 40);
        jPanel2.add(jTextField10horasexn);
        jTextField10horasexn.setBounds(670, 290, 65, 20);

        jTextField11horaexd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11horaexdActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField11horaexd);
        jTextField11horaexd.setBounds(380, 290, 65, 20);

        jLabel17.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 153, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Horas extras:");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(50, 280, 160, 40);

        jLabel19.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Diurna:");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(250, 310, 110, 40);
        jPanel2.add(jTextField12valorexn);
        jTextField12valorexn.setBounds(670, 320, 65, 20);

        jLabel20.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 153, 102));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Valor hora extra:");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(40, 310, 210, 40);

        jTextField14totalen.setBackground(new java.awt.Color(0, 0, 0));
        jTextField14totalen.setForeground(new java.awt.Color(0, 204, 204));
        jTextField14totalen.setEnabled(false);
        jPanel2.add(jTextField14totalen);
        jTextField14totalen.setBounds(860, 290, 150, 20);

        jLabel21.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 153, 102));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Subsidio Transporte:");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(60, 350, 260, 40);

        jTextField15subtransporte.setEnabled(false);
        jTextField15subtransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15subtransporteActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField15subtransporte);
        jTextField15subtransporte.setBounds(350, 360, 150, 20);

        jButton4guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar (1).jpg"))); // NOI18N
        jButton4guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4guardarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4guardar);
        jButton4guardar.setBounds(270, 510, 60, 60);

        jLabel22.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Nocturna:");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(500, 310, 150, 40);

        jButton5calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cal.jpg"))); // NOI18N
        jButton5calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5calcularActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5calcular);
        jButton5calcular.setBounds(410, 510, 60, 60);

        jLabel23.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Guardar");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(260, 570, 90, 40);

        jButton6limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limp.jpg"))); // NOI18N
        jButton6limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6limpiarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6limpiar);
        jButton6limpiar.setBounds(560, 510, 60, 60);

        jLabel24.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Calcular");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(380, 570, 110, 40);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Hombre", "Mujer" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(150, 240, 100, 20);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guar.jpg"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(90, 510, 50, 60);

        jLabel25.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Volver al menu");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(10, 570, 180, 40);

        jTextField13valorexd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13valorexd1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField13valorexd1);
        jTextField13valorexd1.setBounds(380, 320, 65, 20);

        jTextField14salariofinal14.setBackground(new java.awt.Color(102, 0, 0));
        jTextField14salariofinal14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14salariofinal14.setEnabled(false);
        jPanel2.add(jTextField14salariofinal14);
        jTextField14salariofinal14.setBounds(650, 360, 150, 20);

        jTextField14totaled.setBackground(new java.awt.Color(0, 0, 0));
        jTextField14totaled.setForeground(new java.awt.Color(0, 204, 204));
        jTextField14totaled.setEnabled(false);
        jPanel2.add(jTextField14totaled);
        jTextField14totaled.setBounds(860, 240, 150, 20);

        jTable1basesdatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NOMBRES", "APELLIDOS", "CORREO", "DIRECCION", "CEDULA", "CELULAR", "TELEFONO FIJO", "SALARIO"
            }
        ));
        jScrollPane1.setViewportView(jTable1basesdatos);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(40, 400, 1260, 90);

        jLabel27.setFont(new java.awt.Font("Wide Latin", 0, 10)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("ELIMINAR");
        jPanel2.add(jLabel27);
        jLabel27.setBounds(810, 570, 110, 40);

        jButton4eliminar.setBackground(new java.awt.Color(153, 51, 0));
        jButton4eliminar.setForeground(new java.awt.Color(153, 51, 0));
        jButton4eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4eliminar);
        jButton4eliminar.setBounds(820, 510, 90, 60);

        jButton5modificar.setBackground(new java.awt.Color(153, 51, 0));
        jButton5modificar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton5modificar.setForeground(new java.awt.Color(153, 51, 0));
        jButton5modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5modificarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5modificar);
        jButton5modificar.setBounds(680, 510, 80, 60);

        jLabel28.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Limpiar");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(530, 570, 110, 40);

        jLabel29.setFont(new java.awt.Font("Wide Latin", 0, 10)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("MODIFICAR");
        jPanel2.add(jLabel29);
        jLabel29.setBounds(660, 570, 120, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 20, 1400, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5modificarActionPerformed

        int m;
        Formu aux;

        try {
            m = jTable1basesdatos.getSelectedRow();
            aux = bases.get(m);

            jTextField1nombres.setText(JOptionPane.showInputDialog("NUEVO NOMBRE"));
            aux.setNombres(jTextField1nombres.getText());

            jTextField1apellidos.setText(JOptionPane.showInputDialog("NUEVO APELLIDOS"));
            aux.setApellidos(jTextField1apellidos.getText());

            aux.setCedula(jTextField3cedula.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " SELECCIONAR EMPLEADO");

        }

        mostrarDatos();

        try {
            m = jTable1basesdatos.getSelectedRow();
            aux = bases.get(m);

            jTextField3cedula.setText(JOptionPane.showInputDialog("NUEVO CELULAR"));
            aux.setCedula(jTextField3cedula.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " MODIFICADO CORRECTAMENTE");

        }

        mostrarDatos();

    }//GEN-LAST:event_jButton5modificarActionPerformed

    private void jButton4eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4eliminarActionPerformed

        int c;
        try {

            c = jTable1basesdatos.getSelectedRow();
            bases.remove(c);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "POR FAVOR ESCOGER LA FILA");

        }

        mostrarDatos();

    }//GEN-LAST:event_jButton4eliminarActionPerformed

    private void jTextField13valorexd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13valorexd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13valorexd1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        Diseño1 ver = new Diseño1();
        ver.setVisible(true);
        ver.setSize(928, 575);
        this.setVisible(false);
        this.setLocationRelativeTo(null);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton6limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6limpiarActionPerformed

        jTextField1nombres.setText(" ");
        jTextField1apellidos.setText(" ");
        jTextField3cedula.setText(" ");
        jTextField4celular.setText(" ");
        jTextField5direccion.setText(" ");
        jTextField6correo.setText(" ");
        jTextField7telefonofijo.setText(" ");
        jTextField8salariobase.setText(" ");
        jTextField11horaexd.setText(" ");
        jTextField10horasexn.setText(" ");
        jTextField12valorexn.setText(" ");
        jTextField15subtransporte.setText(" ");

    }//GEN-LAST:event_jButton6limpiarActionPerformed

    private void jButton5calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5calcularActionPerformed

        totalempleado();
    }//GEN-LAST:event_jButton5calcularActionPerformed

    private void jButton4guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4guardarActionPerformed

        Formu em = new Formu(jTextField1nombres.getText(), jTextField6correo.getText(), jTextField1apellidos.getText(),
            jTextField5direccion.getText(), jTextField3cedula.getText(), jTextField4celular.getText(),
            jTextField14salariofinal14.getText(),jTextField7telefonofijo.getText());

//        
//               listadoscorre.txtempleado1.setText(jTextField14salariofinal14.getText());
//               listadoscorre.txtempleado2.setText(jTextField14salariofinal14.getText());
//        
//               jTextField14salariofinal14.setText(" ");
//               jTextField14salariofinal14.setText(" ");
        //

        bases.add(em);

        mostrarDatos();

    }//GEN-LAST:event_jButton4guardarActionPerformed

    private void jTextField11horaexdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11horaexdActionPerformed

    }//GEN-LAST:event_jTextField11horaexdActionPerformed

    private void jTextField9valorhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9valorhActionPerformed

    }//GEN-LAST:event_jTextField9valorhActionPerformed

    private void jTextField8salariobaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8salariobaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8salariobaseActionPerformed

    private void jTextField6correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6correoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4celularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4celularActionPerformed

    private void jTextField1nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1nombresActionPerformed

    private void jTextField15subtransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15subtransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15subtransporteActionPerformed

    public void cargardatos(){
          
    
    
            }
    
    
    
    
    public void totalempleado() {

        float horasextrad, valorhexd, al;

        horasextrad = Float.parseFloat(jTextField11horaexd.getText());
        valorhexd = Float.parseFloat(jTextField13valorexd1.getText());

        al = horasextrad * valorhexd;
        jTextField14totaled.setText(String.valueOf(al));

        float horasextran, valorhexn, la;

        horasextran = Float.parseFloat(jTextField10horasexn.getText());
        valorhexn = Float.parseFloat(jTextField12valorexn.getText());

        la = horasextran * valorhexn;
        jTextField14totalen.setText(String.valueOf(la));

        float salariobase = 0, valorh, hora = 240;

        salariobase = Float.parseFloat(jTextField8salariobase.getText());
        valorh = salariobase / 240;
        jTextField9valorh.setText(String.valueOf(valorh));

        float fina;

        fina = al + la + salariobase;

        jTextField14salariofinal14.setText(String.valueOf(fina));
        
        
        if (fina < 908526.0){
          
          jTextField15subtransporte.setText(String.valueOf(908526.0));   
            
            
            
        } else{
            
            int subsidio = 0;
        } 
            
        fina = al + la+ salariobase;
        
        
        
       
        
        
       
 
    }
    
    public void  subsidio2(){
      
        
    }
    

    

    public void mostrarDatos() {

        Object matriz[][] = new Object[bases.size()][8];

        for (int i = 0; i < bases.size(); i++) {

            matriz[i][0] = bases.get(i).getNombres();
            matriz[i][1] = bases.get(i).getApellidos();
            matriz[i][2] = bases.get(i).getCorreo();
            matriz[i][3] = bases.get(i).getDireccion();
            matriz[i][4] = bases.get(i).getCedula();
            matriz[i][5] = bases.get(i).getCelular();
            matriz[i][6] = bases.get(i).getTelefonofijo();
            matriz[i][7] = bases.get(i).getSalariofinal1();

        }

        jTable1basesdatos.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new Object[]{
                    "NOMBRES", "APELLIDOS", "CORREO", "DIRECCION", "CEDULA", "CELULAR"," TELEFONO FIJO",
                    " SALARIO FINAL"
                }
        ));

    }

  public void buscar(){
     
       for (int i = 0; i < bases.size(); i++) {
         
           
           
       }
     
  }  
    
    
    
    
   

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
            java.util.logging.Logger.getLogger(Ingresar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4eliminar;
    private javax.swing.JButton jButton4guardar;
    private javax.swing.JButton jButton5calcular;
    private javax.swing.JButton jButton5modificar;
    private javax.swing.JButton jButton6limpiar;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1basesdatos;
    private javax.swing.JTextField jTextField10horasexn;
    private javax.swing.JTextField jTextField11horaexd;
    private javax.swing.JTextField jTextField12valorexn;
    private javax.swing.JTextField jTextField13valorexd1;
    private javax.swing.JTextField jTextField14salariofinal14;
    private javax.swing.JTextField jTextField14totaled;
    private javax.swing.JTextField jTextField14totalen;
    private javax.swing.JTextField jTextField15subtransporte;
    private javax.swing.JTextField jTextField1apellidos;
    private javax.swing.JTextField jTextField1nombres;
    private javax.swing.JTextField jTextField3cedula;
    private javax.swing.JTextField jTextField4celular;
    private javax.swing.JTextField jTextField5direccion;
    private javax.swing.JTextField jTextField6correo;
    private javax.swing.JTextField jTextField7telefonofijo;
    private javax.swing.JTextField jTextField8salariobase;
    private javax.swing.JTextField jTextField9valorh;
    // End of variables declaration//GEN-END:variables
}
