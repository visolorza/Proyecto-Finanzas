package vistas;

import Utils.Utils;
import controlador.ControlGasto;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Gasto;
import Emergente.ActulizarGastos;
import Emergente.EliminarGastos;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.Locale;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author María José/michimisimo
 */
public class VGastos extends javax.swing.JFrame {

    //Almacenar la posición de la ventana
    private int posicionX;  
    private int posicionY;
    
    public static void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Creates new form Inicio
     */      
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public VGastos() throws Exception {
        initComponents();
        
        this.jlbl_mesActual.setText(utils.obtenerMesActual());
        
        this.jlbl_totalGastos.setText(utils.obtenerTotalGastosMes());
        this.jlbl_totalGastos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        
        utils.RellenarCombocat("categoria", "desc_cat", this.jcbo_gastosMes);
        utils.RellenarComboInt("integrante", "desc_int", this.jcbo_integrante);
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CODIGO");
        modelo.addColumn("FECHA");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("INTEGRANTE");
        modelo.addColumn("MONTO");
        
        Locale.setDefault(new Locale("es", "ES"));
        
        this.jTableMostrar.setModel(modelo); 
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
        jlbl_ListaCompras = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMostrar = new javax.swing.JTable();
        jbtn_refrescar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jlbl_tituloCat = new javax.swing.JLabel();
        jlbl_mesActual = new javax.swing.JLabel();
        jlbl_totalGastos = new javax.swing.JLabel();
        jlbl_ingresosMes2 = new javax.swing.JLabel();
        jlbl_ingresosMes3 = new javax.swing.JLabel();
        jlbl_ingresosMes4 = new javax.swing.JLabel();
        jcbo_integrante = new javax.swing.JComboBox<>();
        jtxt_montoGasto = new javax.swing.JTextField();
        jtxt_descGasto = new javax.swing.JTextField();
        jcbo_subcategoria = new javax.swing.JComboBox<>();
        jlbl_ingresosMes5 = new javax.swing.JLabel();
        jbtn_anadir = new javax.swing.JButton();
        jcbo_gastosMes = new javax.swing.JComboBox<>();
        jlbl_ingresosMes6 = new javax.swing.JLabel();
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

        jbtn_eliminar.setBackground(new java.awt.Color(255, 153, 153));
        jbtn_eliminar.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jbtn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminarActionPerformed(evt);
            }
        });

        jbtn_modificar.setBackground(new java.awt.Color(255, 255, 153));
        jbtn_modificar.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jbtn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_modificarActionPerformed(evt);
            }
        });

        jlbl_ListaCompras.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jTableMostrar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableMostrar);

        jbtn_refrescar.setBackground(new java.awt.Color(153, 204, 255));
        jbtn_refrescar.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jbtn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtn_refrescar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbl_ListaCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_ListaCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jlbl_tituloCat.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbl_tituloCat.setText("GASTOS DEL MES");

        jlbl_mesActual.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N

        jlbl_totalGastos.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_tituloCat)
                    .addComponent(jlbl_mesActual, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbl_totalGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlbl_tituloCat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbl_mesActual, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbl_totalGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jlbl_ingresosMes2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes2.setText("Integrante:");

        jlbl_ingresosMes3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes3.setText("Descripción:");

        jlbl_ingresosMes4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes4.setText("Monto:");

        jcbo_integrante.setBackground(new java.awt.Color(204, 204, 204));
        jcbo_integrante.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jcbo_integrante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- SELECCIONAR -" }));
        jcbo_integrante.setBorder(null);
        jcbo_integrante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbo_integranteActionPerformed(evt);
            }
        });

        jtxt_montoGasto.setBackground(new java.awt.Color(204, 204, 204));
        jtxt_montoGasto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jtxt_montoGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_montoGastoActionPerformed(evt);
            }
        });

        jtxt_descGasto.setBackground(new java.awt.Color(204, 204, 204));
        jtxt_descGasto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jtxt_descGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_descGastoActionPerformed(evt);
            }
        });

        jcbo_subcategoria.setBackground(new java.awt.Color(204, 204, 204));
        jcbo_subcategoria.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jcbo_subcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- SELECCIONAR -" }));
        jcbo_subcategoria.setBorder(null);
        jcbo_subcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbo_subcategoriaActionPerformed(evt);
            }
        });

        jlbl_ingresosMes5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes5.setText("Subcategoría:");

        jbtn_anadir.setBackground(new java.awt.Color(204, 204, 204));
        jbtn_anadir.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtn_anadir.setText("Añadir");
        jbtn_anadir.setBorder(null);
        jbtn_anadir.setBorderPainted(false);
        jbtn_anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_anadirActionPerformed(evt);
            }
        });

        jcbo_gastosMes.setBackground(new java.awt.Color(204, 204, 204));
        jcbo_gastosMes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jcbo_gastosMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- SELECCIONAR -" }));
        jcbo_gastosMes.setBorder(null);
        jcbo_gastosMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbo_gastosMesActionPerformed(evt);
            }
        });

        jlbl_ingresosMes6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes6.setText("Categoría:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 538, Short.MAX_VALUE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbl_ingresosMes5)
                                    .addComponent(jlbl_ingresosMes6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbo_subcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbo_gastosMes, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbl_ingresosMes4)
                                    .addComponent(jlbl_ingresosMes3)
                                    .addComponent(jlbl_ingresosMes2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbo_integrante, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxt_montoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxt_descGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jbtn_anadir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbo_gastosMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbl_ingresosMes6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbo_subcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbl_ingresosMes5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbo_integrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbl_ingresosMes2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxt_montoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbl_ingresosMes4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxt_descGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbl_ingresosMes3))))
                .addGap(15, 15, 15)
                .addComponent(jbtn_anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
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
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_inicio)
                    .addComponent(jbtn_ingresosMes)
                    .addComponent(jbtn_grupoFamiliar)
                    .addComponent(jbtn_Meta)
                    .addComponent(jbtn_detHist)
                    .addComponent(jbtn_GastosMes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
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
    
    ControlGasto cgasto = new ControlGasto();
    Gasto gasto = new Gasto();
    Utils utils = new Utils();
 
    private void jcbo_gastosMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbo_gastosMesActionPerformed

        
        try {
            this.jcbo_subcategoria.removeAllItems();
            this.jcbo_subcategoria.addItem("- SELECCIONAR -");
                
                String desc_cat = jcbo_gastosMes.getSelectedItem() != null ? jcbo_gastosMes.getSelectedItem().toString() : "";
                if (!"- SELECCIONAR -".equals(desc_cat) && !"".equals(desc_cat)) {
                    
                    int codcat = cgasto.obtCat(desc_cat);
                    utils.RellenarComboSubcat("subcategoria", "desc_subcat", this.jcbo_subcategoria, codcat);

                    this.jlbl_totalGastos.setText(utils.obtenerTotal(codcat));
                    this.jlbl_tituloCat.setText(desc_cat);
                    
                    utils.refrescar(jTableMostrar, codcat);

                    gasto.setCodInt(0);
                    gasto.setCodSubcat(0);

                    jlbl_totalGastos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                }

        } catch (Exception ex) {
            Logger.getLogger(VGastos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jcbo_gastosMesActionPerformed

    private void jcbo_integranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbo_integranteActionPerformed
        // TODO add your handling code here:

        String desc_int = jcbo_integrante.getSelectedItem().toString().toUpperCase();
        try {
            cgasto.obt_int(gasto, desc_int);
            System.out.println("integrante guardado "+gasto.getCodInt());
        } catch (Exception ex) {
            Logger.getLogger(VGastos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jcbo_integranteActionPerformed

    private void jtxt_descGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_descGastoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_descGastoActionPerformed

    private void jcbo_subcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbo_subcategoriaActionPerformed
        // TODO add your handling code here:
        
        String desc_subcat = jcbo_subcategoria.getSelectedItem() != null ? jcbo_subcategoria.getSelectedItem().toString().toUpperCase() : "";
        
        
        if (!"".equals(desc_subcat) && !"- SELECCIONAR -".equals(desc_subcat)) {
           try {    
            
                cgasto.obt_subcat(gasto, desc_subcat);
                String desc_cat = this.jcbo_gastosMes.getSelectedItem() != null ? this.jcbo_gastosMes.getSelectedItem().toString() : "";
            
                if (!"- SELECCIONAR -".equals(desc_cat) && !"".equals(desc_cat)) {
                    
                    int codcat = cgasto.obtCat(desc_cat);
                    utils.refrescarPorSubcat(jTableMostrar, codcat,gasto.getCodSubcat());
             
            System.out.println("subcat guardado "+gasto.getCodSubcat());
                }
            } catch (Exception ex) {
                Logger.getLogger(VGastos.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        
        
 
    }//GEN-LAST:event_jcbo_subcategoriaActionPerformed

    private void jtxt_montoGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_montoGastoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_montoGastoActionPerformed

    private void jbtn_anadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_anadirActionPerformed
       
        //gasto.setMontoGast(Integer.parseInt(this.jtxt_montoGasto.getText()));
        //gasto.setDescGast(this.jtxt_descGasto.getText().toUpperCase());

        try {
            
            if (this.jtxt_montoGasto.getText().isBlank() || this.jtxt_descGasto.getText().isBlank() || this.jcbo_gastosMes.getSelectedItem().toString().equalsIgnoreCase("- SELECCIONAR -") 
                || this.jcbo_integrante.getSelectedItem().toString().equalsIgnoreCase("- SELECCIONAR -") || this.jcbo_subcategoria.getSelectedItem().toString().equalsIgnoreCase("- SELECCIONAR -")) {
                JOptionPane.showMessageDialog(null, "Asegurese de ingresar monto, descripcion y seleccionar todos los campos", "Error: falta llenar campos", HEIGHT);
            }
                else {
                
                gasto.setMontoGast(Integer.parseInt(this.jtxt_montoGasto.getText()));
                gasto.setDescGast(this.jtxt_descGasto.getText().toUpperCase());
                
                String desc_cat = jcbo_gastosMes.getSelectedItem() != null ? jcbo_gastosMes.getSelectedItem().toString() : "";
                int cod_cat = cgasto.obtCat(desc_cat);
                if(cgasto.agregar(gasto)){

                    System.out.println("gasto agregado con exito "+gasto.toString());
                    utils.refrescar(jTableMostrar,cod_cat);

                    this.jtxt_montoGasto.setText(""); 
                    this.jtxt_descGasto.setText("");

                    this.jlbl_totalGastos.setText(utils.obtenerTotal(cod_cat));


                }
            }   
        } catch (Exception ex) {
            Logger.getLogger(VGastos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbtn_anadirActionPerformed

    private void jbtn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_modificarActionPerformed
        try {
            // TODO add your handling code here:
            
            ActulizarGastos actualizar = new ActulizarGastos();
            actualizar.setVisible(true);
            actualizar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } catch (Exception ex) {
            Logger.getLogger(VGastos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbtn_modificarActionPerformed

    private void jbtn_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_refrescarActionPerformed
            // TODO add your handling code here:
        
            try {
            String desc_cat = jcbo_gastosMes.getSelectedItem().toString().toUpperCase();
            int codcat=cgasto.obtCat(desc_cat);
            utils.refrescar(jTableMostrar,codcat);
        } catch (Exception ex) {
            Logger.getLogger(VGastos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbtn_refrescarActionPerformed

    private void jbtn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminarActionPerformed
        // TODO add your handling code here:
        
        EliminarGastos eliminar = new EliminarGastos();
        eliminar.setVisible(true);
        eliminar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jbtn_eliminarActionPerformed

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
     
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableMostrar;
    private javax.swing.JButton jbtn_GastosMes;
    private javax.swing.JButton jbtn_Meta;
    private javax.swing.JButton jbtn_anadir;
    private javax.swing.JButton jbtn_detHist;
    private javax.swing.JButton jbtn_eliminar;
    private javax.swing.JButton jbtn_grupoFamiliar;
    private javax.swing.JButton jbtn_ingresosMes;
    private javax.swing.JButton jbtn_inicio;
    private javax.swing.JButton jbtn_modificar;
    private javax.swing.JButton jbtn_refrescar;
    private javax.swing.JComboBox<String> jcbo_gastosMes;
    private javax.swing.JComboBox<String> jcbo_integrante;
    private javax.swing.JComboBox<String> jcbo_subcategoria;
    private javax.swing.JLabel jlbl_ListaCompras;
    private javax.swing.JLabel jlbl_ingresosMes2;
    private javax.swing.JLabel jlbl_ingresosMes3;
    private javax.swing.JLabel jlbl_ingresosMes4;
    private javax.swing.JLabel jlbl_ingresosMes5;
    private javax.swing.JLabel jlbl_ingresosMes6;
    private javax.swing.JLabel jlbl_mesActual;
    private javax.swing.JLabel jlbl_tituloCat;
    private javax.swing.JLabel jlbl_totalGastos;
    private javax.swing.JTextField jtxt_descGasto;
    private javax.swing.JTextField jtxt_montoGasto;
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
