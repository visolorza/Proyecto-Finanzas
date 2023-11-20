
package emergente;

import dao.DAOAhorro;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Ahorro;
import utils.Utils;
import dao.DAOMeta;
import interfaz.IAhorro;
import interfaz.IMeta;

/**
 *
 * @author Calderón, Solorza, Urbina
 * @version 20/11/2023
 */
public class ActualizarAhorro extends javax.swing.JFrame {
    
    private int posicionX;  
    private int posicionY;
    
    public static void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    /**
     * Creates new form actualizargastos
     */
    public ActualizarAhorro() {
        initComponents();
        
        Utils utils = new Utils();
        IMeta.RellenarComboMeta("meta", "nombre_meta", this.jcbo_Meta);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbl_ingresosMes4 = new javax.swing.JLabel();
        jtxt_montoGasto = new javax.swing.JTextField();
        jbtn_actualizar = new javax.swing.JButton();
        jlbl_ingresosMes6 = new javax.swing.JLabel();
        jtxt_cod_gast = new javax.swing.JTextField();
        jcbo_Meta = new javax.swing.JComboBox<>();
        jlbl_ingresosMes7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbl_ingresosMes4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes4.setText("Monto:");

        jtxt_montoGasto.setBackground(new java.awt.Color(204, 204, 204));
        jtxt_montoGasto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jtxt_montoGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_montoGastoActionPerformed(evt);
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

        jlbl_ingresosMes6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes6.setText("Código:");

        jtxt_cod_gast.setBackground(new java.awt.Color(204, 204, 204));
        jtxt_cod_gast.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jtxt_cod_gast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_cod_gastActionPerformed(evt);
            }
        });

        jcbo_Meta.setBackground(new java.awt.Color(204, 204, 204));
        jcbo_Meta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jcbo_Meta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- SELECCIONAR -" }));
        jcbo_Meta.setBorder(null);
        jcbo_Meta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbo_MetaActionPerformed(evt);
            }
        });

        jlbl_ingresosMes7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes7.setText("Meta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlbl_ingresosMes4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxt_montoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlbl_ingresosMes6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jtxt_cod_gast, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlbl_ingresosMes7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbo_Meta, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jbtn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_cod_gast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_ingresosMes6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jlbl_ingresosMes7))
                    .addComponent(jcbo_Meta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_montoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_ingresosMes4))
                .addGap(18, 18, 18)
                .addComponent(jbtn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    IAhorro IAhorro = new DAOAhorro();
    Ahorro ahorro = new Ahorro();
    IMeta IMeta = new DAOMeta();
    
    
    private void jtxt_montoGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_montoGastoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_montoGastoActionPerformed

    private void jbtn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_actualizarActionPerformed

        ahorro.setMonto_ahorro(Integer.parseInt(this.jtxt_montoGasto.getText()));
        ahorro.setCod_ahorro(Integer.parseInt(this.jtxt_cod_gast.getText().toUpperCase()));
        
        try {
            if(IAhorro.actualizar(ahorro)){
                System.out.println("ahorro modificado con exito "+ahorro.toString());   
                this.setVisible(false);
            }
                    } catch (Exception ex) {
            Logger.getLogger(ActualizarAhorro.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_jbtn_actualizarActionPerformed

    private void jtxt_cod_gastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_cod_gastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_cod_gastActionPerformed

    private void jcbo_MetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbo_MetaActionPerformed
        try {
            // TODO add your handling code here:

            String nombre_meta= jcbo_Meta.getSelectedItem().toString();
            ahorro.setCod_meta(IMeta.obtenerCodigoMeta(nombre_meta));
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
    private javax.swing.JLabel jlbl_ingresosMes4;
    private javax.swing.JLabel jlbl_ingresosMes6;
    private javax.swing.JLabel jlbl_ingresosMes7;
    private javax.swing.JTextField jtxt_cod_gast;
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
