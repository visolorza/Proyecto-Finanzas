package vistas;

import Utils.Utils;
import controlador.ControlIngresos;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Ingresos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author María José
 */
public class VIngresos extends javax.swing.JFrame {
    
    //Almacenar la posición de la ventana
    private int posicionX;  
    private int posicionY;

    /**
     * Creates new form Inicio
     */
    public VIngresos() throws Exception {
        initComponents();
        
        Utils utils = new Utils();
        this.jlbl_mesActual.setText(utils.obtenerMesActual());
        
        this.jlbl_totalIngresos.setText(utils.obtenerTotalIngresosMes());
        this.jlbl_totalIngresos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        
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
        jPanel7 = new javax.swing.JPanel();
        jbtn_grupoFamiliar2 = new javax.swing.JButton();
        jbtn_grupoFamiliar3 = new javax.swing.JButton();
        jbtn_grupoFamiliar4 = new javax.swing.JButton();
        jbtn_eliminar = new javax.swing.JButton();
        jbtn_modificar = new javax.swing.JButton();
        jlbl_ListaIngresos = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jlbl_ingresos = new javax.swing.JLabel();
        jlbl_mesActual = new javax.swing.JLabel();
        jlbl_totalIngresos = new javax.swing.JLabel();
        jlbl_ingresosMes2 = new javax.swing.JLabel();
        jlbl_ingresosMes3 = new javax.swing.JLabel();
        jlbl_ingresosMes4 = new javax.swing.JLabel();
        jcbo_integrante = new javax.swing.JComboBox<>();
        jtxt_montoIngreso = new javax.swing.JTextField();
        jtxt_descIngreso = new javax.swing.JTextField();
        jbtn_anadir = new javax.swing.JButton();
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

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));

        jbtn_grupoFamiliar2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtn_grupoFamiliar2.setForeground(new java.awt.Color(0, 0, 0));
        jbtn_grupoFamiliar2.setText("Fecha");
        jbtn_grupoFamiliar2.setBorder(null);
        jbtn_grupoFamiliar2.setBorderPainted(false);
        jbtn_grupoFamiliar2.setContentAreaFilled(false);
        jbtn_grupoFamiliar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_grupoFamiliar2ActionPerformed(evt);
            }
        });

        jbtn_grupoFamiliar3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtn_grupoFamiliar3.setForeground(new java.awt.Color(0, 0, 0));
        jbtn_grupoFamiliar3.setText("Detalle");
        jbtn_grupoFamiliar3.setBorder(null);
        jbtn_grupoFamiliar3.setBorderPainted(false);
        jbtn_grupoFamiliar3.setContentAreaFilled(false);
        jbtn_grupoFamiliar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_grupoFamiliar3ActionPerformed(evt);
            }
        });

        jbtn_grupoFamiliar4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtn_grupoFamiliar4.setForeground(new java.awt.Color(0, 0, 0));
        jbtn_grupoFamiliar4.setText("Monto");
        jbtn_grupoFamiliar4.setBorder(null);
        jbtn_grupoFamiliar4.setBorderPainted(false);
        jbtn_grupoFamiliar4.setContentAreaFilled(false);
        jbtn_grupoFamiliar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_grupoFamiliar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jbtn_grupoFamiliar2)
                .addGap(89, 89, 89)
                .addComponent(jbtn_grupoFamiliar3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(jbtn_grupoFamiliar4)
                .addGap(34, 34, 34))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_grupoFamiliar2)
                    .addComponent(jbtn_grupoFamiliar3)
                    .addComponent(jbtn_grupoFamiliar4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtn_eliminar.setBackground(new java.awt.Color(255, 153, 153));
        jbtn_eliminar.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N

        jbtn_modificar.setBackground(new java.awt.Color(255, 255, 153));
        jbtn_modificar.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N

        jlbl_ListaIngresos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jlbl_ListaIngresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jbtn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbl_ListaIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jlbl_ingresos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbl_ingresos.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_ingresos.setText("INGRESOS");

        jlbl_mesActual.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jlbl_mesActual.setForeground(new java.awt.Color(0, 0, 0));

        jlbl_totalIngresos.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jlbl_totalIngresos.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_ingresos)
                    .addComponent(jlbl_mesActual, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbl_totalIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlbl_ingresos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbl_mesActual, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbl_totalIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlbl_ingresosMes2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes2.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_ingresosMes2.setText("Integrante:");

        jlbl_ingresosMes3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes3.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_ingresosMes3.setText("Descripción:");

        jlbl_ingresosMes4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes4.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_ingresosMes4.setText("Monto:");

        jcbo_integrante.setBackground(new java.awt.Color(204, 204, 204));
        jcbo_integrante.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jcbo_integrante.setForeground(new java.awt.Color(0, 0, 0));
        jcbo_integrante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- SELECCIONAR -", "Grupo Familiar" }));
        jcbo_integrante.setBorder(null);
        jcbo_integrante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbo_integranteActionPerformed(evt);
            }
        });

        jtxt_montoIngreso.setBackground(new java.awt.Color(204, 204, 204));
        jtxt_montoIngreso.setForeground(new java.awt.Color(0, 0, 0));
        jtxt_montoIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jtxt_montoIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtxt_montoIngreso.setFocusable(false);
        jtxt_montoIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_montoIngresoActionPerformed(evt);
            }
        });

        jtxt_descIngreso.setBackground(new java.awt.Color(204, 204, 204));
        jtxt_descIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jtxt_descIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_descIngresoActionPerformed(evt);
            }
        });

        jbtn_anadir.setBackground(new java.awt.Color(204, 204, 204));
        jbtn_anadir.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtn_anadir.setForeground(new java.awt.Color(0, 0, 0));
        jbtn_anadir.setText("Añadir");
        jbtn_anadir.setBorder(null);
        jbtn_anadir.setBorderPainted(false);
        jbtn_anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_anadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlbl_ingresosMes2)
                                            .addComponent(jlbl_ingresosMes4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlbl_ingresosMes3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxt_montoIngreso)
                                    .addComponent(jcbo_integrante, 0, 165, Short.MAX_VALUE)
                                    .addComponent(jtxt_descIngreso)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtn_anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbl_ingresosMes2)
                            .addComponent(jcbo_integrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbl_ingresosMes4)
                            .addComponent(jtxt_montoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbl_ingresosMes3)
                            .addComponent(jtxt_descIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jbtn_detHist.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtn_detHist.setForeground(new java.awt.Color(0, 0, 0));
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
        jbtn_Meta.setForeground(new java.awt.Color(0, 0, 0));
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
        jbtn_GastosMes.setForeground(new java.awt.Color(0, 0, 0));
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
        jbtn_ingresosMes.setForeground(new java.awt.Color(0, 0, 0));
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
        jbtn_grupoFamiliar.setForeground(new java.awt.Color(0, 0, 0));
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
        jbtn_inicio.setForeground(new java.awt.Color(0, 0, 0));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
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

    ControlIngresos controlIngresos = new ControlIngresos();
    Ingresos ingreso = new Ingresos();
    
    private void jcbo_integranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbo_integranteActionPerformed
        
        String desc_int = jcbo_integrante.getSelectedItem().toString().toUpperCase();
        try {
            controlIngresos.obt_int(ingreso, desc_int);
            System.out.println("integrante guardado "+ingreso.getCod_int());
        } catch (Exception ex) {
            Logger.getLogger(VGastos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jcbo_integranteActionPerformed

    private void jtxt_descIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_descIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_descIngresoActionPerformed

    private void jbtn_grupoFamiliar2ActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   
    
    private void jbtn_anadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_anadirActionPerformed
        
        //String desc = this.jtxt_descIngreso.getText();
        //int monto =  Integer.parseInt(this.jtxt_montoIngreso.getText());
        //String integrante = (String) this.jcbo_integrante.getSelectedItem();
                
        //Ingresos ingreso = new Ingresos();
        
        //ingreso.setDesc_ing(desc);
        //ingreso.setMonto_ing(monto);
        //ingreso.setCod_int(1); //Esto debe ser modificado para que lo que obtenga sea de un integrante real.
        
        //ControlIngresos controlIngresos = new ControlIngresos();
        
        //try {
            //controlIngresos.agregar(ingreso);
        //} catch (Exception ex) {
            //Logger.getLogger(VIngresos.class.getName()).log(Level.SEVERE, null, ex);
        //}
        
        ingreso.setMonto_ing(Integer.parseInt(this.jtxt_montoIngreso.getText()));
        ingreso.setDesc_ing(this.jtxt_descIngreso.getText());

        try {
            if(controlIngresos.agregar(ingreso)){
                System.out.println("ingreso agregado con exito "+ingreso.toString());
            }
            this.jtxt_montoIngreso.setText(""); 
            this.jtxt_descIngreso.setText(""); 
            
            //Mostrar total ingresos del mes
            ArrayList<Ingresos> listaIngresos;
            ControlIngresos lista = new ControlIngresos();
            listaIngresos=lista.mostrarIngresosMes();
            int sumaMontos=0;
            for (Ingresos ingreso: listaIngresos) {
                sumaMontos += ingreso.getMonto_ing();}
            NumberFormat formatoMonto = NumberFormat.getCurrencyInstance(Locale.getDefault());
            String totalMes = formatoMonto.format(sumaMontos);
            this.jlbl_totalIngresos.setText(totalMes);
            
        } catch (Exception ex) {
            Logger.getLogger(VIngresos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtn_anadirActionPerformed

    private void jbtn_grupoFamiliar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_grupoFamiliar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_grupoFamiliar4ActionPerformed

    private void jbtn_grupoFamiliar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_grupoFamiliar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_grupoFamiliar3ActionPerformed
/*
    private void jbtn_grupoFamiliar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_grupoFamiliar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_grupoFamiliar2ActionPerformed
*/
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
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
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

    private void jtxt_montoIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_montoIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_montoIngresoActionPerformed

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
//            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Inicio().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtn_GastosMes;
    private javax.swing.JButton jbtn_Meta;
    private javax.swing.JButton jbtn_anadir;
    private javax.swing.JButton jbtn_detHist;
    private javax.swing.JButton jbtn_eliminar;
    private javax.swing.JButton jbtn_grupoFamiliar;
    private javax.swing.JButton jbtn_grupoFamiliar2;
    private javax.swing.JButton jbtn_grupoFamiliar3;
    private javax.swing.JButton jbtn_grupoFamiliar4;
    private javax.swing.JButton jbtn_ingresosMes;
    private javax.swing.JButton jbtn_inicio;
    private javax.swing.JButton jbtn_modificar;
    private javax.swing.JComboBox<String> jcbo_integrante;
    private javax.swing.JLabel jlbl_ListaIngresos;
    private javax.swing.JLabel jlbl_ingresos;
    private javax.swing.JLabel jlbl_ingresosMes2;
    private javax.swing.JLabel jlbl_ingresosMes3;
    private javax.swing.JLabel jlbl_ingresosMes4;
    private javax.swing.JLabel jlbl_mesActual;
    private javax.swing.JLabel jlbl_totalIngresos;
    private javax.swing.JTextField jtxt_descIngreso;
    private javax.swing.JTextField jtxt_montoIngreso;
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
