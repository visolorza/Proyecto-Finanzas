package vistas;

import Utils.Utils;
import java.awt.HeadlessException;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author María José
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        
        Date fechaActual;
        String mesActual;
        Utils utils = new Utils();
        fechaActual=utils.obtenerFecha();
        mesActual=utils.obtenerMes(fechaActual);
        this.jlbl_mesActual.setText(mesActual.toUpperCase());
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
        jbtn_grupoFamiliar = new javax.swing.JButton();
        jbtn_ingresosMes = new javax.swing.JButton();
        jbtn_ahorros = new javax.swing.JButton();
        jbtn_detHist = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jlbl_mesActual1 = new javax.swing.JLabel();
        jlbl_totalGastos = new javax.swing.JLabel();
        jlbl_ingresosMes1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jlbl_ingresosMes = new javax.swing.JLabel();
        jlbl_mesActual = new javax.swing.JLabel();
        jlbl_totalIngresos = new javax.swing.JLabel();
        jcbo_gastosMes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

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

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jlbl_mesActual1.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jlbl_mesActual1.setForeground(new java.awt.Color(0, 0, 0));

        jlbl_totalGastos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_totalGastos.setForeground(new java.awt.Color(0, 0, 0));

        jlbl_ingresosMes1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes1.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_ingresosMes1.setText("GASTOS DEL MES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_mesActual1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_ingresosMes1))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbl_totalGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlbl_ingresosMes1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbl_mesActual1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbl_totalGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jlbl_ingresosMes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_ingresosMes.setText("INGRESOS DEL MES");

        jlbl_mesActual.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jlbl_mesActual.setForeground(new java.awt.Color(0, 0, 0));

        jlbl_totalIngresos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_totalIngresos.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbl_totalIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jlbl_mesActual, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbl_ingresosMes)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlbl_ingresosMes)
                .addGap(5, 5, 5)
                .addComponent(jlbl_mesActual, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jlbl_totalIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
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
                    .addComponent(jbtn_detHist))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
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
        
        VDetalleHistorico detalleHistorico = new VDetalleHistorico();
        detalleHistorico.setVisible(true);
        this.dispose(); 
        
    }//GEN-LAST:event_jbtn_detHistActionPerformed

    private void jbtn_ahorrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ahorrosActionPerformed
        
        VAhorros ahorros = new VAhorros();
        ahorros.setVisible(true);
        this.dispose(); 
        
    }//GEN-LAST:event_jbtn_ahorrosActionPerformed

    private void jbtn_ingresosMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ingresosMesActionPerformed
        
        VIngresos ingresos = new VIngresos();
        ingresos.setVisible(true);
        this.dispose(); 

    }//GEN-LAST:event_jbtn_ingresosMesActionPerformed

    private void jbtn_grupoFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_grupoFamiliarActionPerformed

        VGrupoFamiliar grupoFamiliar = new VGrupoFamiliar();
        grupoFamiliar.setVisible(true);
        this.dispose(); 
        
    }//GEN-LAST:event_jbtn_grupoFamiliarActionPerformed

    private void jcbo_gastosMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbo_gastosMesActionPerformed
        
        String opcion = (String) jcbo_gastosMes.getSelectedItem();
        
        switch (opcion) {
            //case "Gastos del mes":
               //JOptionPane.showMessageDialog(null, "Selecciona una categoría", "Error", JOptionPane.INFORMATION_MESSAGE);
                //break;
            case "Compras":
                VCompras compras = new VCompras();
                compras.setVisible(true);
                this.dispose(); 
                break;
            case "Cuentas":
                VCuentas cuentas = new VCuentas();
                cuentas.setVisible(true);
                this.dispose();
                break;
            case "Deudas":
                VDeudas deudas = new VDeudas();
                deudas.setVisible(true);
                this.dispose();
                break;
            case "Educación":
                VEducacion educacion = new VEducacion();
                educacion.setVisible(true);
                this.dispose(); 
                break;
            case "Salud":
                VSalud salud = new VSalud();
                salud.setVisible(true);
                this.dispose();
                break;
            case "Transporte":
                VTransporte transporte = new VTransporte();
                transporte.setVisible(true);
                this.dispose();
                break;
            case "Vivienda":
                VVivienda vivienda = new VVivienda();
                vivienda.setVisible(true);
                this.dispose();
                break;
            case "Otros":
                VOtros otros = new VOtros();
                otros.setVisible(true);
                this.dispose();
                break;
            default:
                throw new AssertionError();
        }
        
    }//GEN-LAST:event_jcbo_gastosMesActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtn_ahorros;
    private javax.swing.JButton jbtn_detHist;
    private javax.swing.JButton jbtn_grupoFamiliar;
    private javax.swing.JButton jbtn_ingresosMes;
    private javax.swing.JComboBox<String> jcbo_gastosMes;
    private javax.swing.JLabel jlbl_ingresosMes;
    private javax.swing.JLabel jlbl_ingresosMes1;
    private javax.swing.JLabel jlbl_mesActual;
    private javax.swing.JLabel jlbl_mesActual1;
    private javax.swing.JLabel jlbl_totalGastos;
    private javax.swing.JLabel jlbl_totalIngresos;
    // End of variables declaration//GEN-END:variables
}
