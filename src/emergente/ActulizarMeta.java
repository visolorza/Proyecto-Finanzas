
package emergente;

import dao.DAOGrupoFamiliar;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.Utils;
import dao.DAOMeta;
import interfaz.IGrupoFamiliar;
import interfaz.IMeta;
import modelo.Meta;

/**
 *
 * @author Calderón, Solorza, Urbina
 * @version 20/11/2023
 */
public class ActulizarMeta extends javax.swing.JFrame {

    private int posicionX;  
    private int posicionY;
    
    public static void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * Creates new form actualizargastos
     */
    public ActulizarMeta() {
        initComponents();
        
        Utils utils = new Utils();
        IMeta.RellenarComboMeta("meta", "nombre_meta", this.jcbo_Meta);
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
        jlbl_ingresosMes6 = new javax.swing.JLabel();
        jcbo_Meta = new javax.swing.JComboBox<>();

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
        jbtn_actualizar.setText("Modificar");
        jbtn_actualizar.setBorder(null);
        jbtn_actualizar.setBorderPainted(false);
        jbtn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_actualizarActionPerformed(evt);
            }
        });

        jcbo_integrante.setBackground(new java.awt.Color(204, 204, 204));
        jcbo_integrante.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jcbo_integrante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- SELECCIONAR -" }));
        jcbo_integrante.setBorder(null);
        jcbo_integrante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbo_integranteActionPerformed(evt);
            }
        });

        jlbl_ingresosMes6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes6.setText("Meta:");

        jcbo_Meta.setBackground(new java.awt.Color(204, 204, 204));
        jcbo_Meta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jcbo_Meta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- SELECCIONAR -" }));
        jcbo_Meta.setBorder(null);
        jcbo_Meta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbo_MetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbl_ingresosMes2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbo_integrante, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jbtn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlbl_ingresosMes4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxt_montoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlbl_ingresosMes3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtxt_descGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbl_ingresosMes6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbo_Meta, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jlbl_ingresosMes6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jcbo_Meta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_ingresosMes2)
                    .addComponent(jcbo_integrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_montoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_ingresosMes4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_descGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_ingresosMes3))
                .addGap(32, 32, 32)
                .addComponent(jbtn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Meta meta = new Meta();
    IGrupoFamiliar IGrupoFamiliar = new DAOGrupoFamiliar();
    IMeta IMeta = new DAOMeta();
    
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
            if(IMeta.actualizar(meta)){
                System.out.println("meta modificado con exito " +meta.toString());   
                this.setVisible(false);
            }
                    } catch (Exception ex) {
            Logger.getLogger(ActulizarMeta.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_jbtn_actualizarActionPerformed

    private void jcbo_integranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbo_integranteActionPerformed
        // TODO add your handling code here:

        String desc_int = jcbo_integrante.getSelectedItem().toString().toUpperCase();
        try {
            IMeta.obtenerMetaCodInt(meta, desc_int);
            System.out.println("integrsnte guardado "+meta.getCod_int());
        } catch (Exception ex) {
            Logger.getLogger(ActulizarMeta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jcbo_integranteActionPerformed

    private void jcbo_MetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbo_MetaActionPerformed
        try {
            // TODO add your handling code here:
            
            String nombre_meta= jcbo_Meta.getSelectedItem().toString();
            meta.setCod_meta(IMeta.obtenerCodigoMeta(nombre_meta));
        } catch (Exception ex) {
            Logger.getLogger(ActulizarMeta.class.getName()).log(Level.SEVERE, null, ex);
        }

        

    }//GEN-LAST:event_jcbo_MetaActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_actualizar;
    private javax.swing.JComboBox<String> jcbo_Meta;
    private javax.swing.JComboBox<String> jcbo_integrante;
    private javax.swing.JLabel jlbl_ingresosMes2;
    private javax.swing.JLabel jlbl_ingresosMes3;
    private javax.swing.JLabel jlbl_ingresosMes4;
    private javax.swing.JLabel jlbl_ingresosMes6;
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
