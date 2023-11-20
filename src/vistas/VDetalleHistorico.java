package vistas;

import Utils.Grafico;
import Utils.Utils;
import controlador.ControlGasto;
import java.awt.BorderLayout;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author María José
 */
public class VDetalleHistorico extends javax.swing.JFrame {
    
    //Almacenar la posición de la ventana
    private int posicionX;  
    private int posicionY;

    /**
     * Creates new form Inicio
     */
    public VDetalleHistorico() {
        initComponents();
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
        this.jTableDHist.setModel(modelo);
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDHist = new javax.swing.JTable();
        jpan_grafico = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbo_mes = new javax.swing.JComboBox<>();
        jcbo_año = new javax.swing.JComboBox<>();
        jcbo_cat = new javax.swing.JComboBox<>();
        jlbl_ingresosMes = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlbl_total = new javax.swing.JLabel();
        jlbl_montoTotal = new javax.swing.JLabel();
        jbtn_inicio = new javax.swing.JButton();
        jbtn_grupoFamiliar = new javax.swing.JButton();
        jbtn_ingresosMes = new javax.swing.JButton();
        jbtn_GastosMes = new javax.swing.JButton();
        jbtn_Meta = new javax.swing.JButton();
        jbtn_detHist = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jTableDHist.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableDHist);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
        );

        jpan_grafico.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpan_graficoLayout = new javax.swing.GroupLayout(jpan_grafico);
        jpan_grafico.setLayout(jpan_graficoLayout);
        jpan_graficoLayout.setHorizontalGroup(
            jpan_graficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jpan_graficoLayout.setVerticalGroup(
            jpan_graficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Año:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Categoria:");

        jcbo_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- SELECCIONAR -" }));
        jcbo_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbo_mesActionPerformed(evt);
            }
        });

        jcbo_año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- SELECCIONAR -" }));
        jcbo_año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbo_añoActionPerformed(evt);
            }
        });

        jcbo_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- SELECCIONAR -", "INGRESO", "GASTO", "AHORRO" }));
        jcbo_cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbo_catActionPerformed(evt);
            }
        });

        jlbl_ingresosMes.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbl_ingresosMes.setText("DETALLE HISTÓRICO");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Mes:");

        jlbl_total.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jlbl_montoTotal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbl_ingresosMes)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbl_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbo_cat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbo_mes, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbo_año, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlbl_montoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpan_grafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpan_grafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlbl_ingresosMes)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbo_cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbo_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbo_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlbl_total, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                            .addComponent(jlbl_montoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_inicio)
                    .addComponent(jbtn_ingresosMes)
                    .addComponent(jbtn_grupoFamiliar)
                    .addComponent(jbtn_Meta)
                    .addComponent(jbtn_detHist)
                    .addComponent(jbtn_GastosMes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Utils utils = new Utils();
    ControlGasto cgasto = new ControlGasto();
    
    private void jbtn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_inicioActionPerformed

        this.obtenerPosicion();
        Inicio inicio = null;
        try {
            inicio = new Inicio();
            inicio.establecerPosicion(posicionX,posicionY);
            inicio.obtenerPosicion();
        } catch (Exception ex) {
            Logger.getLogger(VDetalleHistorico.class.getName()).log(Level.SEVERE, null, ex);
        }
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_inicioActionPerformed

    private void jbtn_grupoFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_grupoFamiliarActionPerformed

        this.obtenerPosicion();
        VGrupoFamiliar grupoFamiliar = new VGrupoFamiliar();
        grupoFamiliar.establecerPosicion(posicionX,posicionY);
        grupoFamiliar.obtenerPosicion();
        grupoFamiliar.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jbtn_grupoFamiliarActionPerformed

    private void jbtn_ingresosMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ingresosMesActionPerformed

        this.obtenerPosicion();
        VIngresos ingresos = null;
        try {
            ingresos = new VIngresos();
            ingresos.establecerPosicion(posicionX,posicionY);
            ingresos.obtenerPosicion();
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        ingresos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_ingresosMesActionPerformed

    private void jbtn_GastosMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_GastosMesActionPerformed

        try {

            this.obtenerPosicion();
            VGastos detalleHistorico = new VGastos();
            detalleHistorico.establecerPosicion(posicionX,posicionY);
            detalleHistorico.obtenerPosicion();
            detalleHistorico.setVisible(true);
            this.dispose();

        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbtn_GastosMesActionPerformed

    private void jbtn_MetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_MetaActionPerformed

        try {
            this.obtenerPosicion();
            VMeta detalleHistorico = new VMeta();
            detalleHistorico.establecerPosicion(posicionX,posicionY);
            detalleHistorico.obtenerPosicion();
            detalleHistorico.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbtn_MetaActionPerformed

    private void jbtn_detHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_detHistActionPerformed

        this.obtenerPosicion();
        VDetalleHistorico detalleHistorico = new VDetalleHistorico();
        detalleHistorico.establecerPosicion(posicionX,posicionY);
        detalleHistorico.obtenerPosicion();
        detalleHistorico.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jbtn_detHistActionPerformed

    private void jcbo_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbo_mesActionPerformed
        
        int year = 0; 

        Object item1 = this.jcbo_año.getSelectedItem();
        if (item1 != null) {
            if (!"- SELECCIONAR -".equals(item1)) {
                try {
                    
                    year = Integer.parseInt(item1.toString());
                    
                } catch (NumberFormatException e) {
                    System.err.println("Error al convertir el año a un entero: " + e.getMessage());
                }
            }
        }
        
        
        int mes = 0; 

        Object item2 = this.jcbo_mes.getSelectedItem();
        if (item2 != null) {
            if (!"- SELECCIONAR -".equals(item2)) {
                try {
                    
                    mes = Integer.parseInt(item2.toString());
                    
                } catch (NumberFormatException e) {
                    System.err.println("Error al convertir el año a un entero: " + e.getMessage());
                }
            }
        }
        

        String cat = this.jcbo_cat.getSelectedItem() != null ? this.jcbo_cat.getSelectedItem().toString() : "";
        
        
        
        if (!"- SELECCIONAR -".equals(year) && !"".equals(year)) {

            switch (cat) {
                case "INGRESO":
                    this.jlbl_total.setText("");
                    this.jlbl_montoTotal.setText("");
                    this.jpan_grafico.removeAll();
                    
                     try {
                        utils.refrescarIngresoMes(jTableDHist, year, mes);
                        if (year!=0 && mes!=0) {
                        
                            Grafico grafico = new Grafico();
                            ChartPanel chartPanel;       
                            try {
                                chartPanel = grafico.crearGraficoIngDetHis(year,mes);
                                this.jpan_grafico.setLayout(new java.awt.BorderLayout());
                                this.jpan_grafico.add(chartPanel, BorderLayout.CENTER);
                                this.jpan_grafico.revalidate();
                                this.jpan_grafico.repaint();
                            } catch (Exception ex) {
                                Logger.getLogger(VDetalleHistorico.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            this.jlbl_total.setText("TOTAL:");
                            NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));
                            this.jlbl_montoTotal.setText(formato.format(utils.obtenerTotalIngresoMesDH(year,mes)));
                        }
                        
                    } catch (Exception ex) {
                        Logger.getLogger(VDetalleHistorico.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case "GASTO":
                    this.jlbl_total.setText("");
                    this.jlbl_montoTotal.setText("");
                    this.jpan_grafico.removeAll();
                    
                    try {
                        utils.refrescarGastoMes(jTableDHist, year, mes);
                        if (year!=0 && mes!=0) {
                        
                            Grafico grafico = new Grafico();
                            ChartPanel chartPanel;       
                            try {
                                chartPanel = grafico.crearGraficoGasDetHis(year,mes);
                                this.jpan_grafico.setLayout(new java.awt.BorderLayout());
                                this.jpan_grafico.add(chartPanel, BorderLayout.CENTER);
                                this.jpan_grafico.revalidate();
                                this.jpan_grafico.repaint();
                            } catch (Exception ex) {
                                Logger.getLogger(VDetalleHistorico.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            this.jlbl_total.setText("TOTAL:");
                            NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));
                            this.jlbl_montoTotal.setText(formato.format(utils.obtenerTotalGastoMesDH(year,mes)));
                        }
                        
                    } catch (Exception ex) {
                        Logger.getLogger(VDetalleHistorico.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                    
                case "AHORRO":
                    this.jlbl_total.setText("");
                    this.jlbl_montoTotal.setText("");
                    this.jpan_grafico.removeAll();
                    
                    try {
                        utils.refrescarAhorroMes(jTableDHist, year, mes);
                        
                        if (year!=0 && mes!=0) {
                            Grafico grafico = new Grafico();
                            ChartPanel chartPanel;       
                            try {
                                chartPanel = grafico.crearGraficoAhorroDetHis(year,mes);
                                this.jpan_grafico.setLayout(new java.awt.BorderLayout());
                                this.jpan_grafico.add(chartPanel, BorderLayout.CENTER);
                                this.jpan_grafico.revalidate();
                                this.jpan_grafico.repaint();
                            } catch (Exception ex) {
                                Logger.getLogger(VDetalleHistorico.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            this.jlbl_total.setText("TOTAL:");
                            NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));
                            this.jlbl_montoTotal.setText(formato.format(utils.obtenerTotalAhorroMesDH(year,mes)));
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(VDetalleHistorico.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;

                default:
                    throw new AssertionError();
            }
        }
        
    }//GEN-LAST:event_jcbo_mesActionPerformed

    private void jcbo_catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbo_catActionPerformed
        // TODO add your handling code here:
        
        String cat = this.jcbo_cat.getSelectedItem() != null ? this.jcbo_cat.getSelectedItem().toString() : "";
        
        if (!"- SELECCIONAR -".equals(cat) && !"".equals(cat)) {
            
            this.jcbo_año.removeAllItems();
            this.jcbo_año.addItem("- SELECCIONAR -");
            
            String fecha_cat="";
            
            switch (cat) {
                case "GASTO":
                    
                    try {
                        utils.refrescarTodoGasto(this.jTableDHist);
                        fecha_cat="fecha_gast"; 
                        if (!"".equals(fecha_cat)) {
                            utils.RellenarComboAño(cat,fecha_cat, this.jcbo_año); 
                        }
                        
                    } catch (Exception ex) {
                        Logger.getLogger(VDetalleHistorico.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                
                case("INGRESO"):
                    
                    try {
                        utils.refrescarTodoIngreso(this.jTableDHist);
                        fecha_cat="fecha_ing";
                        if (!"".equals(fecha_cat)) {
                            utils.RellenarComboAño(cat,fecha_cat, this.jcbo_año); 
                        }
                        
                    } catch (Exception ex) {
                    Logger.getLogger(VDetalleHistorico.class.getName()).log(Level.SEVERE, null, ex);
                    }  
                    break;
                
                case ("AHORRO"):
                    
                    try {
                        utils.refrescarTodoMeta(this.jTableDHist);
                        fecha_cat="fecha_ahor";
                        if (!"".equals(fecha_cat)) {
                            utils.RellenarComboAño(cat,fecha_cat, this.jcbo_año); 
                        }
                  
                    } catch (Exception ex) {
                    Logger.getLogger(VDetalleHistorico.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                    
                default:
                    throw new AssertionError();
            }   
        }
    }//GEN-LAST:event_jcbo_catActionPerformed

    private void jcbo_añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbo_añoActionPerformed
        // TODO add your handling code here:
        int year = 0; 

        Object item = this.jcbo_año.getSelectedItem();
        if (item != null) {
            if (!"- SELECCIONAR -".equals(item)) {
                try {
                    
                    year = Integer.parseInt(item.toString());
                    
                } catch (NumberFormatException e) {
                    System.err.println("Error al convertir el año a un entero: " + e.getMessage());
                }
            }
        }
        

        String cat = this.jcbo_cat.getSelectedItem() != null ? this.jcbo_cat.getSelectedItem().toString() : "";
        

        if (!"- SELECCIONAR -".equals(year) && !"".equals(year)) {
            this.jcbo_mes.removeAllItems();
            this.jcbo_mes.addItem("- SELECCIONAR -");
            String fecha;
            switch (cat) {
                case "INGRESO":
                    fecha = "fecha_ing";
                    
                     try {
                        utils.refrescarIngresoAño(jTableDHist, year);
                        utils.RellenarComboMes(year, cat, fecha, this.jcbo_mes);
                    } catch (Exception ex) {
                        Logger.getLogger(VDetalleHistorico.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case "GASTO":
                    fecha = "fecha_gast";
                    
                    try {
                        utils.refrescarGastoAño(jTableDHist, year);
                        utils.RellenarComboMes(year, cat, fecha, this.jcbo_mes);
                    } catch (Exception ex) {
                        Logger.getLogger(VDetalleHistorico.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case "AHORRO":
                    fecha = "fecha_ahor";
         
                    try {
                        utils.refrescarAhorroAño(jTableDHist, year);
                        utils.RellenarComboMes(year, cat, fecha, this.jcbo_mes);
                    } catch (Exception ex) {
                        Logger.getLogger(VDetalleHistorico.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;

                default:
                    throw new AssertionError();
            }
        }
     
    }//GEN-LAST:event_jcbo_añoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableDHist;
    private javax.swing.JButton jbtn_GastosMes;
    private javax.swing.JButton jbtn_Meta;
    private javax.swing.JButton jbtn_detHist;
    private javax.swing.JButton jbtn_grupoFamiliar;
    private javax.swing.JButton jbtn_ingresosMes;
    private javax.swing.JButton jbtn_inicio;
    private javax.swing.JComboBox<String> jcbo_año;
    private javax.swing.JComboBox<String> jcbo_cat;
    private javax.swing.JComboBox<String> jcbo_mes;
    private javax.swing.JLabel jlbl_ingresosMes;
    private javax.swing.JLabel jlbl_montoTotal;
    private javax.swing.JLabel jlbl_total;
    private javax.swing.JPanel jpan_grafico;
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
