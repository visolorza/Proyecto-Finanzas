package vistas;

import controlador.ControlAhorro;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import modelo.Ahorro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author María José
 */
public class VAhorros extends javax.swing.JFrame {
    
    //Almacenar la posición de la ventana
    private int posicionX;  
    private int posicionY;
    
    public VAhorros() throws Exception {
        initComponents();
           
        //Mostrar total ahorro en el año
        ArrayList<Ahorro> listaAhorros;
        ControlAhorro listaA = new ControlAhorro();
        listaAhorros=listaA.mostrar();
        int sumaAhorros=0;
        for (Ahorro ahorro: listaAhorros) {
            sumaAhorros += ahorro.getMonto_ahorro();}
        NumberFormat formatoAhorros = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String totalAhorros = formatoAhorros.format(sumaAhorros);
        this.jlbl_totalAhorros.setText(totalAhorros);
        jlbl_totalAhorros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
         
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
        jbtn_crearMeta1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jbtn_grupoFamiliar = new javax.swing.JButton();
        jbtn_ingresosMes = new javax.swing.JButton();
        jbtn_ahorros = new javax.swing.JButton();
        jbtn_detHist = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jbtn_grupoFamiliar2 = new javax.swing.JButton();
        jbtn_grupoFamiliar3 = new javax.swing.JButton();
        jbtn_grupoFamiliar4 = new javax.swing.JButton();
        jbtn_eliminar = new javax.swing.JButton();
        jbtn_modificar = new javax.swing.JButton();
        jlbl_ListaMetas = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jlbl_ahorros = new javax.swing.JLabel();
        jlbl_totalAhorros = new javax.swing.JLabel();
        jlbl_total = new javax.swing.JLabel();
        jlbl_ingresosMes5 = new javax.swing.JLabel();
        jtxt_montoCrearMeta = new javax.swing.JTextField();
        jtxt_descMeta = new javax.swing.JTextField();
        jlbl_ingresosMes6 = new javax.swing.JLabel();
        jlbl_ingresosMes7 = new javax.swing.JLabel();
        jtxt_nombreMeta = new javax.swing.JTextField();
        jbtn_crearMeta = new javax.swing.JButton();
        jbtn_vistaMeta = new javax.swing.JButton();
        jlbl_ingresosMes2 = new javax.swing.JLabel();
        jcbo_Meta = new javax.swing.JComboBox<>();
        jcbo_gastosMes = new javax.swing.JComboBox<>();
        jbtn_inicio = new javax.swing.JButton();

        jbtn_crearMeta1.setBackground(new java.awt.Color(204, 204, 204));
        jbtn_crearMeta1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtn_crearMeta1.setForeground(new java.awt.Color(0, 0, 0));
        jbtn_crearMeta1.setText("Crear nueva meta");
        jbtn_crearMeta1.setBorder(null);
        jbtn_crearMeta1.setBorderPainted(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jbtn_grupoFamiliar.setBackground(new java.awt.Color(204, 204, 204));
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

        jbtn_ahorros.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtn_ahorros.setForeground(new java.awt.Color(0, 0, 0));
        jbtn_ahorros.setText("Ahorros");
        jbtn_ahorros.setBorder(null);
        jbtn_ahorros.setBorderPainted(false);
        jbtn_ahorros.setContentAreaFilled(false);
        jbtn_ahorros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ahorrosActionPerformed(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jlbl_ListaMetas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlbl_ListaMetas, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
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
                .addComponent(jlbl_ListaMetas, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jlbl_ahorros.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbl_ahorros.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_ahorros.setText("AHORROS");

        jlbl_totalAhorros.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jlbl_totalAhorros.setForeground(new java.awt.Color(0, 0, 0));

        jlbl_total.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jlbl_total.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_total.setText("TOTAL");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(jlbl_totalAhorros, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_total)
                    .addComponent(jlbl_ahorros))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlbl_ahorros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbl_total)
                .addGap(14, 14, 14)
                .addComponent(jlbl_totalAhorros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jlbl_ingresosMes5.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_ingresosMes5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes5.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_ingresosMes5.setText("Monto:");

        jtxt_montoCrearMeta.setBackground(new java.awt.Color(204, 204, 204));
        jtxt_montoCrearMeta.setForeground(new java.awt.Color(0, 0, 0));
        jtxt_montoCrearMeta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jtxt_descMeta.setBackground(new java.awt.Color(204, 204, 204));
        jtxt_descMeta.setForeground(new java.awt.Color(0, 0, 0));
        jtxt_descMeta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jlbl_ingresosMes6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes6.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_ingresosMes6.setText("Descripción:");

        jlbl_ingresosMes7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes7.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_ingresosMes7.setText("Nombre meta:");

        jtxt_nombreMeta.setBackground(new java.awt.Color(204, 204, 204));
        jtxt_nombreMeta.setForeground(new java.awt.Color(0, 0, 0));
        jtxt_nombreMeta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jbtn_crearMeta.setBackground(new java.awt.Color(204, 204, 204));
        jbtn_crearMeta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtn_crearMeta.setForeground(new java.awt.Color(0, 0, 0));
        jbtn_crearMeta.setText("Crear nueva meta");
        jbtn_crearMeta.setBorder(null);
        jbtn_crearMeta.setBorderPainted(false);
        jbtn_crearMeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_crearMetaActionPerformed(evt);
            }
        });

        jbtn_vistaMeta.setBackground(new java.awt.Color(204, 204, 204));
        jbtn_vistaMeta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtn_vistaMeta.setForeground(new java.awt.Color(0, 0, 0));
        jbtn_vistaMeta.setText("Añadir abono");
        jbtn_vistaMeta.setBorder(null);
        jbtn_vistaMeta.setBorderPainted(false);
        jbtn_vistaMeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_vistaMetaActionPerformed(evt);
            }
        });

        jlbl_ingresosMes2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes2.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_ingresosMes2.setText("Meta:");

        jcbo_Meta.setBackground(new java.awt.Color(204, 204, 204));
        jcbo_Meta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jcbo_Meta.setForeground(new java.awt.Color(0, 0, 0));
        jcbo_Meta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -", "Grupo Familiar" }));
        jcbo_Meta.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbl_ingresosMes5)
                                    .addComponent(jlbl_ingresosMes7)
                                    .addComponent(jlbl_ingresosMes6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtn_crearMeta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtxt_descMeta)
                                        .addComponent(jtxt_montoCrearMeta, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jtxt_nombreMeta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jlbl_ingresosMes2)
                        .addGap(18, 18, 18)
                        .addComponent(jcbo_Meta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jbtn_vistaMeta, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jlbl_ingresosMes7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlbl_ingresosMes5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlbl_ingresosMes6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtxt_nombreMeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxt_montoCrearMeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxt_descMeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_crearMeta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbo_Meta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_ingresosMes2)
                    .addComponent(jbtn_vistaMeta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jcbo_gastosMes.setBackground(new java.awt.Color(204, 204, 204));
        jcbo_gastosMes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jcbo_gastosMes.setForeground(new java.awt.Color(0, 0, 0));
        jcbo_gastosMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gastos del mes", "Compras", "Cuentas", "Deudas", "Educación", "Salud", "Transporte", "Vivienda", "Otros" }));
        jcbo_gastosMes.setBorder(null);
        jcbo_gastosMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbo_gastosMesActionPerformed(evt);
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
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_ingresosMes)
                    .addComponent(jbtn_grupoFamiliar)
                    .addComponent(jcbo_gastosMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_ahorros)
                    .addComponent(jbtn_detHist)
                    .addComponent(jbtn_inicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jbtn_inicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtn_grupoFamiliar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtn_ingresosMes)
                .addGap(16, 16, 16)
                .addComponent(jcbo_gastosMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtn_ahorros, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    private void jbtn_detHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_detHistActionPerformed
        
        this.obtenerPosicion();
        VDetalleHistorico detalleHistorico = new VDetalleHistorico();
        detalleHistorico.establecerPosicion(posicionX,posicionY);
        detalleHistorico.obtenerPosicion();
        detalleHistorico.setVisible(true);
        this.dispose(); 
        
    }//GEN-LAST:event_jbtn_detHistActionPerformed

    private void jbtn_ahorrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ahorrosActionPerformed
        
        try {
            this.obtenerPosicion();
            VAhorros ahorros = new VAhorros();
            ahorros.establecerPosicion(posicionX,posicionY);
            ahorros.obtenerPosicion();
            ahorros.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(VAhorros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbtn_ahorrosActionPerformed

    private void jbtn_ingresosMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ingresosMesActionPerformed
        
        this.obtenerPosicion();
        VIngresos ingresos = null;
        try {
            ingresos = new VIngresos();
            ingresos.establecerPosicion(posicionX,posicionY);
            ingresos.obtenerPosicion();
        } catch (Exception ex) {
            Logger.getLogger(VAhorros.class.getName()).log(Level.SEVERE, null, ex);
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

    private void jcbo_gastosMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbo_gastosMesActionPerformed
        
        
        try {
            String opcion = (String) jcbo_gastosMes.getSelectedItem();
            this.obtenerPosicion();
            switch (opcion) {
                //case "Gastos del mes":
                //JOptionPane.showMessageDialog(null, "Selecciona una categoría", "Error", JOptionPane.INFORMATION_MESSAGE);
                //break;
                case "Compras":
                    VCompras compras = new VCompras();
                    compras.establecerPosicion(posicionX,posicionY);
                    compras.obtenerPosicion();
                    compras.setVisible(true);
                    this.dispose();
                    break;
                case "Cuentas":
                    VCuentas cuentas = new VCuentas();
                    cuentas.establecerPosicion(posicionX,posicionY);
                    cuentas.obtenerPosicion();
                    cuentas.setVisible(true);
                    this.dispose();
                    break;
                case "Deudas":
                    VDeudas deudas = new VDeudas();
                    deudas.establecerPosicion(posicionX,posicionY);
                    deudas.obtenerPosicion();
                    deudas.setVisible(true);
                    this.dispose();
                    break;
                case "Educación":
                    VEducacion educacion = new VEducacion();
                    educacion.establecerPosicion(posicionX,posicionY);
                    educacion.obtenerPosicion();
                    educacion.setVisible(true);
                    this.dispose();
                    break;
                case "Salud":
                    VSalud salud = new VSalud();
                    salud.establecerPosicion(posicionX,posicionY);
                    salud.obtenerPosicion();
                    salud.setVisible(true);
                    this.dispose();
                    break;
                case "Transporte":
                    VTransporte transporte = new VTransporte();
                    transporte.establecerPosicion(posicionX,posicionY);
                    transporte.obtenerPosicion();
                    transporte.setVisible(true);
                    this.dispose();
                    break;
                case "Vivienda":
                    VVivienda vivienda = new VVivienda();
                    vivienda.establecerPosicion(posicionX,posicionY);
                    vivienda.obtenerPosicion();
                    vivienda.setVisible(true);
                    this.dispose();
                    break;
                case "Otros":
                    VOtros otros = new VOtros();
                    otros.establecerPosicion(posicionX,posicionY);
                    otros.obtenerPosicion();
                    otros.setVisible(true);
                    this.dispose();
                    break;
                default:
                    throw new AssertionError();
            }
        } catch (Exception ex) {
            Logger.getLogger(VAhorros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jcbo_gastosMesActionPerformed

    private void jbtn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_inicioActionPerformed
        
        this.obtenerPosicion();
        Inicio inicio = null;
        try {
            inicio = new Inicio();
            inicio.establecerPosicion(posicionX,posicionY);
            inicio.obtenerPosicion();
        } catch (Exception ex) {
            Logger.getLogger(VAhorros.class.getName()).log(Level.SEVERE, null, ex);
        }
        inicio.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jbtn_inicioActionPerformed

    private void jbtn_grupoFamiliar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_grupoFamiliar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_grupoFamiliar4ActionPerformed

    private void jbtn_grupoFamiliar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_grupoFamiliar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_grupoFamiliar3ActionPerformed

    private void jbtn_grupoFamiliar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_grupoFamiliar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_grupoFamiliar2ActionPerformed

    private void jbtn_crearMetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_crearMetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_crearMetaActionPerformed

    private void jbtn_vistaMetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_vistaMetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_vistaMetaActionPerformed

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
//            java.util.logging.Logger.getLoggVIniciocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogVInicioicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLoVInicionicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLVInicioInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//             VInicio Inicio().setVisible(true);
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
    private javax.swing.JButton jbtn_ahorros;
    private javax.swing.JButton jbtn_crearMeta;
    private javax.swing.JButton jbtn_crearMeta1;
    private javax.swing.JButton jbtn_detHist;
    private javax.swing.JButton jbtn_eliminar;
    private javax.swing.JButton jbtn_grupoFamiliar;
    private javax.swing.JButton jbtn_grupoFamiliar2;
    private javax.swing.JButton jbtn_grupoFamiliar3;
    private javax.swing.JButton jbtn_grupoFamiliar4;
    private javax.swing.JButton jbtn_ingresosMes;
    private javax.swing.JButton jbtn_inicio;
    private javax.swing.JButton jbtn_modificar;
    private javax.swing.JButton jbtn_vistaMeta;
    private javax.swing.JComboBox<String> jcbo_Meta;
    private javax.swing.JComboBox<String> jcbo_gastosMes;
    private javax.swing.JLabel jlbl_ListaMetas;
    private javax.swing.JLabel jlbl_ahorros;
    private javax.swing.JLabel jlbl_ingresosMes2;
    private javax.swing.JLabel jlbl_ingresosMes5;
    private javax.swing.JLabel jlbl_ingresosMes6;
    private javax.swing.JLabel jlbl_ingresosMes7;
    private javax.swing.JLabel jlbl_total;
    private javax.swing.JLabel jlbl_totalAhorros;
    private javax.swing.JTextField jtxt_descMeta;
    private javax.swing.JTextField jtxt_montoCrearMeta;
    private javax.swing.JTextField jtxt_nombreMeta;
    // End of variables declaration//GEN-END:variables

    public JComboBox<String> getJcbo_Meta() {
        return jcbo_Meta;
    }

    public void setJcbo_Meta(JComboBox<String> jcbo_Meta) {
        this.jcbo_Meta = jcbo_Meta;
    }

    // Obtener y establecer la posición de la ventana
    public void obtenerPosicion() {
        posicionX = this.getLocation().x;
        posicionY = this.getLocation().y;
    }
    public void establecerPosicion(int posicionX,int posicionY) {
        this.setLocation(posicionX,posicionY);
    }

}
