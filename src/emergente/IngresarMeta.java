
package emergente;

import dao.DAOGrupoFamiliar;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.Utils;
import dao.DAOMeta;
import interfaz.IGrupoFamiliar;
import modelo.Meta;

/**
 *
 * @author michimisimo
 */
public class IngresarMeta extends javax.swing.JFrame {
    
    private int posicionX;  
    private int posicionY;
    
    public static void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * Creates new form actualizargastos
     */
    public IngresarMeta() {
        initComponents();
        
        Utils utils = new Utils();
        
        
        IGrupoFamiliar.RellenarComboInt("integrante", "desc_int", this.jcbo_integrante);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbl_ingresosMes2 = new javax.swing.JLabel();
        jlbl_ingresosMes4 = new javax.swing.JLabel();
        jtxt_montoGasto = new javax.swing.JTextField();
        jlbl_ingresosMes3 = new javax.swing.JLabel();
        jtxt_descGasto = new javax.swing.JTextField();
        jbtn_actualizar = new javax.swing.JButton();
        jcbo_integrante = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbl_ingresosMes2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes2.setText("Integrante:");

        jlbl_ingresosMes4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes4.setText("Monto:");

        jtxt_montoGasto.setBackground(new java.awt.Color(204, 204, 204));
        jtxt_montoGasto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jtxt_montoGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_montoGastoActionPerformed(evt);
            }
        });

        jlbl_ingresosMes3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes3.setText("Nombre meta:");

        jtxt_descGasto.setBackground(new java.awt.Color(204, 204, 204));
        jtxt_descGasto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jtxt_descGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_descGastoActionPerformed(evt);
            }
        });

        jbtn_actualizar.setBackground(new java.awt.Color(204, 204, 204));
        jbtn_actualizar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtn_actualizar.setText("Ingresar");
        jbtn_actualizar.setBorder(null);
        jbtn_actualizar.setBorderPainted(false);
        jbtn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_actualizarActionPerformed(evt);
            }
        });

        jcbo_integrante.setBackground(new java.awt.Color(204, 204, 204));
        jcbo_integrante.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jcbo_integrante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        jcbo_integrante.setBorder(null);
        jcbo_integrante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbo_integranteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlbl_ingresosMes2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbo_integrante, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbl_ingresosMes3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jbtn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68))
                                    .addComponent(jtxt_descGasto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbl_ingresosMes4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxt_montoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbo_integrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_ingresosMes2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_montoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_ingresosMes4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_ingresosMes3)
                    .addComponent(jtxt_descGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DAOMeta cmeta = new DAOMeta();
    Meta meta = new Meta();
    IGrupoFamiliar IGrupoFamiliar = new DAOGrupoFamiliar();
    
    private void jtxt_montoGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_montoGastoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_montoGastoActionPerformed

    private void jtxt_descGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_descGastoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_descGastoActionPerformed

    private void jbtn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_actualizarActionPerformed

        meta.setMonto_meta(Integer.parseInt(this.jtxt_montoGasto.getText()));
        meta.setNombre_meta(this.jtxt_descGasto.getText().toUpperCase());
        
        try {
            if(cmeta.agregar(meta)){
                System.out.println("gasto modificado con exto " + meta.toString());   
                this.setVisible(false);
            }
                    } catch (Exception ex) {
            Logger.getLogger(IngresarMeta.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_jbtn_actualizarActionPerformed

    private void jcbo_integranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbo_integranteActionPerformed
        // TODO add your handling code here:

        String desc_int = jcbo_integrante.getSelectedItem().toString().toUpperCase();
        try {
            cmeta.obtenerMetaCodInt(meta, desc_int);
            System.out.println("integrante guardado "+meta.getCod_int());
        } catch (Exception ex) {
            Logger.getLogger(IngresarMeta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jcbo_integranteActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_actualizar;
    private javax.swing.JComboBox<String> jcbo_integrante;
    private javax.swing.JLabel jlbl_ingresosMes2;
    private javax.swing.JLabel jlbl_ingresosMes3;
    private javax.swing.JLabel jlbl_ingresosMes4;
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
