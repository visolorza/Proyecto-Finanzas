package vistas;

import controlador.ControlAhorro;
import controlador.ControlMeta;
import emergente.EliminarAhorro;
import emergente.ActualizarAhorro;
import emergente.ActulizarMeta;
import utils.Utils;
import emergente.EliminarMeta;
import emergente.IngresarMeta;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import dao.DAOAhorro;
import dao.DAOMeta;
import interfaz.IAhorro;
import interfaz.IMeta;
import java.text.NumberFormat;
import java.util.Locale;
import modelo.Ahorro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author María José/michimisimo
 */
public class VMeta extends javax.swing.JFrame {

    //Almacenar la posición de la ventana
    private int posicionX;  
    private int posicionY;
    
    public static void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Creates new form VInicio
     */      
    
    
    public VMeta() throws Exception {
        initComponents();
        
        
        this.jlbl_totalMeta.setText(controlAhorro.obtenerTotalAhorros());
        this.jlbl_totalMeta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        
        IMeta.RellenarComboMeta("meta", "nombre_meta", this.jcbo_Meta);
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("codigo");
        modelo.addColumn("fecha");
        modelo.addColumn("monto");
        this.jTableMostrarMeta.setModel(modelo);
        
        this.jlbl_tituloAhorro1.setText("");
        this.jlbl_tituloMeta1.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jbtn_eliminar = new javax.swing.JButton();
        jbtn_modificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMostrarMeta = new javax.swing.JTable();
        jbtn_refrescar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jlbl_tituloAhorro = new javax.swing.JLabel();
        jlbl_totalMeta = new javax.swing.JLabel();
        jlbl_totalAhorro = new javax.swing.JLabel();
        jlbl_tituloAhorro1 = new javax.swing.JLabel();
        jlbl_tituloMeta1 = new javax.swing.JLabel();
        jcbo_Meta = new javax.swing.JComboBox<>();
        jlbl_ingresosMes5 = new javax.swing.JLabel();
        jtxt_montoAbonoMeta = new javax.swing.JTextField();
        jlbl_ingresosMes4 = new javax.swing.JLabel();
        jbtn_abonar = new javax.swing.JButton();
        jbtn_agregarMeta = new javax.swing.JButton();
        jbtn_modificarMeta = new javax.swing.JButton();
        jbtn_eliminarMeta = new javax.swing.JButton();
        jlbl_tituloMetas = new javax.swing.JLabel();
        jbtn_detHist = new javax.swing.JButton();
        jbtn_Meta = new javax.swing.JButton();
        jbtn_GastosMes = new javax.swing.JButton();
        jbtn_ingresosMes = new javax.swing.JButton();
        jbtn_grupoFamiliar = new javax.swing.JButton();
        jbtn_inicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jbtn_eliminar.setBackground(new java.awt.Color(255, 153, 153));
        jbtn_eliminar.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jbtn_eliminar.setForeground(new java.awt.Color(102, 0, 0));
        jbtn_eliminar.setText("ELIMINAR");
        jbtn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminarActionPerformed(evt);
            }
        });

        jbtn_modificar.setBackground(new java.awt.Color(255, 255, 153));
        jbtn_modificar.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jbtn_modificar.setForeground(new java.awt.Color(102, 102, 0));
        jbtn_modificar.setText("MODIFICAR");
        jbtn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_modificarActionPerformed(evt);
            }
        });

        jTableMostrarMeta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableMostrarMeta);

        jbtn_refrescar.setBackground(new java.awt.Color(153, 204, 255));
        jbtn_refrescar.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jbtn_refrescar.setForeground(new java.awt.Color(0, 102, 102));
        jbtn_refrescar.setText("REFRESCAR");
        jbtn_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_refrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jbtn_refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jbtn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtn_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jbtn_refrescar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jlbl_tituloAhorro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbl_tituloAhorro.setText("AHORROS");

        jlbl_totalMeta.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        jlbl_totalAhorro.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        jlbl_tituloAhorro1.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jlbl_tituloAhorro1.setText("Ahorrado:");

        jlbl_tituloMeta1.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jlbl_tituloMeta1.setText("Objetivo:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbl_tituloAhorro1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbl_tituloAhorro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbl_totalAhorro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jlbl_tituloMeta1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbl_totalMeta, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlbl_tituloAhorro)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jlbl_tituloAhorro1)
                        .addGap(18, 18, 18)
                        .addComponent(jlbl_tituloMeta1)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jlbl_totalAhorro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbl_totalMeta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jcbo_Meta.setBackground(new java.awt.Color(204, 204, 204));
        jcbo_Meta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jcbo_Meta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- SELECCIONAR -" }));
        jcbo_Meta.setBorder(null);
        jcbo_Meta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbo_MetaActionPerformed(evt);
            }
        });

        jlbl_ingresosMes5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes5.setText("Meta:");

        jtxt_montoAbonoMeta.setBackground(new java.awt.Color(204, 204, 204));
        jtxt_montoAbonoMeta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jlbl_ingresosMes4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes4.setText("Monto:");

        jbtn_abonar.setBackground(new java.awt.Color(204, 204, 204));
        jbtn_abonar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtn_abonar.setText("Abonar");
        jbtn_abonar.setBorder(null);
        jbtn_abonar.setBorderPainted(false);
        jbtn_abonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_abonarActionPerformed(evt);
            }
        });

        jbtn_agregarMeta.setBackground(new java.awt.Color(153, 255, 153));
        jbtn_agregarMeta.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jbtn_agregarMeta.setForeground(new java.awt.Color(0, 51, 0));
        jbtn_agregarMeta.setText("CREAR");
        jbtn_agregarMeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_agregarMetaActionPerformed(evt);
            }
        });

        jbtn_modificarMeta.setBackground(new java.awt.Color(255, 255, 153));
        jbtn_modificarMeta.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jbtn_modificarMeta.setForeground(new java.awt.Color(102, 102, 0));
        jbtn_modificarMeta.setText("MODIFICAR");
        jbtn_modificarMeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_modificarMetaActionPerformed(evt);
            }
        });

        jbtn_eliminarMeta.setBackground(new java.awt.Color(255, 153, 153));
        jbtn_eliminarMeta.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jbtn_eliminarMeta.setForeground(new java.awt.Color(102, 0, 0));
        jbtn_eliminarMeta.setText("ELIMINAR");
        jbtn_eliminarMeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminarMetaActionPerformed(evt);
            }
        });

        jlbl_tituloMetas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_tituloMetas.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_tituloMetas.setText("META:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jlbl_ingresosMes4))
                                    .addComponent(jlbl_ingresosMes5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbo_Meta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxt_montoAbonoMeta)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbtn_abonar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jbtn_agregarMeta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(jbtn_modificarMeta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtn_eliminarMeta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jlbl_tituloMetas)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlbl_tituloMetas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn_eliminarMeta)
                            .addComponent(jbtn_modificarMeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtn_agregarMeta))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbo_Meta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbl_ingresosMes5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbl_ingresosMes4)
                            .addComponent(jtxt_montoAbonoMeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_abonar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jbtn_detHist.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtn_detHist.setText("Detalle histórico");
        jbtn_detHist.setBorder(null);
        jbtn_detHist.setBorderPainted(false);
        jbtn_detHist.setContentAreaFilled(false);
        jbtn_detHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_detHistActionPerformed(evt);
            }
        });

        jbtn_Meta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtn_Meta.setText("Ahorros");
        jbtn_Meta.setBorder(null);
        jbtn_Meta.setBorderPainted(false);
        jbtn_Meta.setContentAreaFilled(false);
        jbtn_Meta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_MetaActionPerformed(evt);
            }
        });

        jbtn_GastosMes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtn_GastosMes.setText("Gastos del mes");
        jbtn_GastosMes.setBorder(null);
        jbtn_GastosMes.setBorderPainted(false);
        jbtn_GastosMes.setContentAreaFilled(false);
        jbtn_GastosMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_GastosMesActionPerformed(evt);
            }
        });

        jbtn_ingresosMes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtn_ingresosMes.setText("Ingresos del mes");
        jbtn_ingresosMes.setBorder(null);
        jbtn_ingresosMes.setBorderPainted(false);
        jbtn_ingresosMes.setContentAreaFilled(false);
        jbtn_ingresosMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ingresosMesActionPerformed(evt);
            }
        });

        jbtn_grupoFamiliar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtn_grupoFamiliar.setText("Grupo familiar");
        jbtn_grupoFamiliar.setBorder(null);
        jbtn_grupoFamiliar.setBorderPainted(false);
        jbtn_grupoFamiliar.setContentAreaFilled(false);
        jbtn_grupoFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_grupoFamiliarActionPerformed(evt);
            }
        });

        jbtn_inicio.setBackground(new java.awt.Color(204, 204, 204));
        jbtn_inicio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtn_inicio.setText("Inicio");
        jbtn_inicio.setBorder(null);
        jbtn_inicio.setBorderPainted(false);
        jbtn_inicio.setContentAreaFilled(false);
        jbtn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_inicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_inicio)
                    .addComponent(jbtn_ingresosMes)
                    .addComponent(jbtn_grupoFamiliar)
                    .addComponent(jbtn_Meta)
                    .addComponent(jbtn_detHist)
                    .addComponent(jbtn_GastosMes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jbtn_inicio)
                .addGap(30, 30, 30)
                .addComponent(jbtn_grupoFamiliar)
                .addGap(30, 30, 30)
                .addComponent(jbtn_ingresosMes)
                .addGap(31, 31, 31)
                .addComponent(jbtn_GastosMes)
                .addGap(31, 31, 31)
                .addComponent(jbtn_Meta, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jbtn_detHist)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
    
    DefaultTableModel modelo = new DefaultTableModel();
    IAhorro IAhorro = new DAOAhorro();
    Ahorro ahorro = new Ahorro();
    IMeta IMeta = new DAOMeta();
    Utils utils = new Utils();
    ControlMeta controlMeta = new ControlMeta();
    ControlAhorro controlAhorro = new ControlAhorro();
 
    private void jcbo_MetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbo_MetaActionPerformed
        // TODO add your handling code here:
        
        String nombre_meta= jcbo_Meta.getSelectedItem().toString().toUpperCase();
         
        try {
            ahorro.setCod_meta(IMeta.obtenerCodigoMeta(nombre_meta)); 
            controlMeta.refrescarMeta(jTableMostrarMeta, ahorro.getCod_meta());
        } catch (Exception ex) {
            Logger.getLogger(VMeta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        NumberFormat formatoMeta = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));
        
        
        if (!"- SELECCIONAR -".equals(nombre_meta) && nombre_meta != null) {
            this.jlbl_tituloAhorro.setText(nombre_meta);
            
             try {
                this.jlbl_tituloAhorro1.setText("AHORRADO:");
                this.jlbl_tituloMeta1.setText(("OBJETIVO:"));
                this.jlbl_totalAhorro.setText(controlAhorro.ahorroPorMeta(nombre_meta));
                this.jlbl_totalMeta.setText(String.valueOf(formatoMeta.format(IMeta.obtenerTotalMeta(nombre_meta))));
                this.jlbl_totalAhorro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                this.jlbl_totalMeta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                this.jlbl_tituloAhorro1.setVisible(true);
                this.jlbl_tituloMeta1.setVisible(true);
                 
             } catch (Exception ex) {
                 Logger.getLogger(VMeta.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            this.jlbl_tituloAhorro.setText("AHORROS");
            this.jlbl_tituloAhorro1.setText("");
            this.jlbl_tituloMeta1.setText((""));
            
        }
        
    }//GEN-LAST:event_jcbo_MetaActionPerformed

    private void jbtn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_modificarActionPerformed
        // TODO add your handling code here:
        this.obtenerPosicion();
        ActualizarAhorro actualizar = new ActualizarAhorro();
        actualizar.establecerPosicion(posicionX,posicionY);
        actualizar.obtenerPosicion();
        actualizar.setVisible(true);
        actualizar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jbtn_modificarActionPerformed

    private void jbtn_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_refrescarActionPerformed
            // TODO add your handling code here:
        
         try {
            controlMeta.refrescarMeta(jTableMostrarMeta,ahorro.getCod_meta());
        } catch (Exception ex) {
            Logger.getLogger(VGastos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbtn_refrescarActionPerformed

    private void jbtn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminarActionPerformed
        // TODO add your handling code here:
        this.obtenerPosicion();
        EliminarAhorro eliminar = new EliminarAhorro();
        eliminar.establecerPosicion(posicionX,posicionY);
        eliminar.obtenerPosicion();
        eliminar.setVisible(true);
        eliminar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jbtn_eliminarActionPerformed

    private void jbtn_abonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_abonarActionPerformed
        // TODO add your handling code here:
        
        ahorro.setMonto_ahorro(Integer.parseInt(this.jtxt_montoAbonoMeta.getText()));
        ahorro.toString();
        try {
            if(IAhorro.agregar(ahorro)){
                System.out.println("ahorro agregado con exto "+ahorro.toString());
                controlMeta.refrescarMeta(jTableMostrarMeta, ahorro.getCod_meta());
                this.jtxt_montoAbonoMeta.setText("");
            }
        } catch (Exception ex) {
            Logger.getLogger(VMeta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbtn_abonarActionPerformed

    private void jbtn_detHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_detHistActionPerformed

        this.obtenerPosicion();
        VDetalleHistorico detalleHistorico = new VDetalleHistorico();
        detalleHistorico.establecerPosicion(posicionX,posicionY);
        detalleHistorico.obtenerPosicion();
        detalleHistorico.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_detHistActionPerformed

    private void jbtn_MetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_MetaActionPerformed

        try {
            this.obtenerPosicion();
            VMeta detalleHistorico = new VMeta();
            detalleHistorico.establecerPosicion(posicionX,posicionY);
            detalleHistorico.obtenerPosicion();
            detalleHistorico.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(VInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jbtn_MetaActionPerformed

    private void jbtn_GastosMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_GastosMesActionPerformed

        try {

            this.obtenerPosicion();
            VGastos detalleHistorico = new VGastos();
            detalleHistorico.establecerPosicion(posicionX,posicionY);
            detalleHistorico.obtenerPosicion();
            detalleHistorico.setVisible(true);
            this.dispose();

        } catch (Exception ex) {
            Logger.getLogger(VInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtn_GastosMesActionPerformed

    private void jbtn_ingresosMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ingresosMesActionPerformed

        this.obtenerPosicion();
        VIngresos ingresos = null;
        try {
            ingresos = new VIngresos();
            ingresos.establecerPosicion(posicionX,posicionY);
            ingresos.obtenerPosicion();
        } catch (Exception ex) {
            Logger.getLogger(VInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        ingresos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_ingresosMesActionPerformed

    private void jbtn_grupoFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_grupoFamiliarActionPerformed

        this.obtenerPosicion();
        VGrupoFamiliar grupoFamiliar = new VGrupoFamiliar();
        grupoFamiliar.establecerPosicion(posicionX,posicionY);
        grupoFamiliar.obtenerPosicion();
        grupoFamiliar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_grupoFamiliarActionPerformed

    private void jbtn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_inicioActionPerformed

        this.obtenerPosicion();
        VInicio inicio = null;
        try {
            inicio = new VInicio();
            inicio.establecerPosicion(posicionX,posicionY);
            inicio.obtenerPosicion();
        } catch (Exception ex) {
            Logger.getLogger(VDetalleHistorico.class.getName()).log(Level.SEVERE, null, ex);
        }
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_inicioActionPerformed

    private void jbtn_agregarMetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_agregarMetaActionPerformed
        // TODO add your handling code here:
        this.obtenerPosicion();
        IngresarMeta ingresar = new IngresarMeta();
        ingresar.establecerPosicion(posicionX,posicionY);
        ingresar.obtenerPosicion();
        ingresar.setVisible(true);
        ingresar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jbtn_agregarMetaActionPerformed

    private void jbtn_modificarMetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_modificarMetaActionPerformed
        // TODO add your handling code here:
        this.obtenerPosicion();
        ActulizarMeta actualizar = new ActulizarMeta();
        actualizar.establecerPosicion(posicionX,posicionY);
        actualizar.obtenerPosicion();
        actualizar.setVisible(true);
        actualizar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
 
    }//GEN-LAST:event_jbtn_modificarMetaActionPerformed

    private void jbtn_eliminarMetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminarMetaActionPerformed
        // TODO add your handling code here:
        this.obtenerPosicion();
        EliminarMeta eliminar = new EliminarMeta();
        eliminar.establecerPosicion(posicionX,posicionY);
        eliminar.obtenerPosicion();
        eliminar.setVisible(true);
        eliminar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jbtn_eliminarMetaActionPerformed
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VInicio.class.getName()).log(java.utijTableMostrarMetael.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VInicio().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableMostrarMeta;
    private javax.swing.JButton jbtn_GastosMes;
    private javax.swing.JButton jbtn_Meta;
    private javax.swing.JButton jbtn_abonar;
    private javax.swing.JButton jbtn_agregarMeta;
    private javax.swing.JButton jbtn_detHist;
    private javax.swing.JButton jbtn_eliminar;
    private javax.swing.JButton jbtn_eliminarMeta;
    private javax.swing.JButton jbtn_grupoFamiliar;
    private javax.swing.JButton jbtn_ingresosMes;
    private javax.swing.JButton jbtn_inicio;
    private javax.swing.JButton jbtn_modificar;
    private javax.swing.JButton jbtn_modificarMeta;
    private javax.swing.JButton jbtn_refrescar;
    private javax.swing.JComboBox<String> jcbo_Meta;
    private javax.swing.JLabel jlbl_ingresosMes4;
    private javax.swing.JLabel jlbl_ingresosMes5;
    private javax.swing.JLabel jlbl_tituloAhorro;
    private javax.swing.JLabel jlbl_tituloAhorro1;
    private javax.swing.JLabel jlbl_tituloMeta1;
    private javax.swing.JLabel jlbl_tituloMetas;
    private javax.swing.JLabel jlbl_totalAhorro;
    private javax.swing.JLabel jlbl_totalMeta;
    private javax.swing.JTextField jtxt_montoAbonoMeta;
    // End of variables declaration//GEN-END:variables

 // Obtener y establecer la posición de la ventana
    public void obtenerPosicion() {
        posicionX = this.getLocation().x;
        posicionY = this.getLocation().y;
    }
    public void establecerPosicion(int posicionX,int posicionY) {
        this.setLocation(posicionX,posicionY);
    }
    
}
