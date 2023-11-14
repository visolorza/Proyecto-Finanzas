package vistas;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author María José
 */
public class VDetalleHistorico extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public VDetalleHistorico() {
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

        jSeparator1 = new javax.swing.JSeparator();
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
        jlbl_ListaDetHist = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jcbo_gastosMes = new javax.swing.JComboBox<>();
        jbtn_inicio = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                .addComponent(jbtn_grupoFamiliar4)
                .addGap(48, 48, 48))
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

        jlbl_ListaDetHist.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ListaDetHist.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbl_ListaDetHist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbl_ListaDetHist, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
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
        
        VDetalleHistorico detalleHistorico = new VDetalleHistorico();
        detalleHistorico.setVisible(true);
        this.dispose(); 
        
    }//GEN-LAST:event_jbtn_detHistActionPerformed

    private void jbtn_ahorrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ahorrosActionPerformed
        
        try {
            VAhorros ahorros = new VAhorros();
            ahorros.setVisible(true); 
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(VDetalleHistorico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbtn_ahorrosActionPerformed

    private void jbtn_ingresosMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ingresosMesActionPerformed
        
        VIngresos ingresos = null;
        try {
            ingresos = new VIngresos();
        } catch (Exception ex) {
            Logger.getLogger(VDetalleHistorico.class.getName()).log(Level.SEVERE, null, ex);
        }
        ingresos.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jbtn_ingresosMesActionPerformed

    private void jbtn_grupoFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_grupoFamiliarActionPerformed
        
        VGrupoFamiliar grupoFamiliar = new VGrupoFamiliar();
        grupoFamiliar.setVisible(true);
        this.dispose(); 
        
    }//GEN-LAST:event_jbtn_grupoFamiliarActionPerformed

    private void jcbo_gastosMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbo_gastosMesActionPerformed
        
        try {
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
        } catch (Exception ex) {
            Logger.getLogger(VDetalleHistorico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jcbo_gastosMesActionPerformed

    private void jbtn_grupoFamiliar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_grupoFamiliar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_grupoFamiliar2ActionPerformed

    private void jbtn_grupoFamiliar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_grupoFamiliar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_grupoFamiliar3ActionPerformed

    private void jbtn_grupoFamiliar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_grupoFamiliar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_grupoFamiliar4ActionPerformed

    private void jbtn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_inicioActionPerformed
        
        try {
            Inicio inicio = new Inicio();
            inicio.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(VDetalleHistorico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbtn_inicioActionPerformed

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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtn_ahorros;
    private javax.swing.JButton jbtn_detHist;
    private javax.swing.JButton jbtn_grupoFamiliar;
    private javax.swing.JButton jbtn_grupoFamiliar2;
    private javax.swing.JButton jbtn_grupoFamiliar3;
    private javax.swing.JButton jbtn_grupoFamiliar4;
    private javax.swing.JButton jbtn_ingresosMes;
    private javax.swing.JButton jbtn_inicio;
    private javax.swing.JComboBox<String> jcbo_gastosMes;
    private javax.swing.JLabel jlbl_ListaDetHist;
    // End of variables declaration//GEN-END:variables
}
