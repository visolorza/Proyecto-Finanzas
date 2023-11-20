/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package emergente;

import dao.DAOMeta;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Meta;

/**
 *
 * @author felip
 */
public class EliminarMeta extends javax.swing.JFrame {
    
    private int posicionX;  
    private int posicionY;
    
    public static void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * Creates new form EliminarGastos
     */
    public EliminarMeta() {
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

        jlbl_ingresosMes6 = new javax.swing.JLabel();
        jbtn_eliminar = new javax.swing.JButton();
        jcbo_Meta = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jlbl_ingresosMes6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes6.setText("Nombre meta:");

        jbtn_eliminar.setBackground(new java.awt.Color(204, 204, 204));
        jbtn_eliminar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtn_eliminar.setText("eliminar");
        jbtn_eliminar.setBorder(null);
        jbtn_eliminar.setBorderPainted(false);
        jbtn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlbl_ingresosMes6)
                    .addComponent(jbtn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbo_Meta, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jlbl_ingresosMes6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbo_Meta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jbtn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    DAOMeta cmeta = new DAOMeta();
    Meta meta = new Meta();
    
    private void jbtn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminarActionPerformed

        int cod_meta=meta.getCod_meta();

        try {
            if(cmeta.eliminar(cod_meta)){
                System.out.println("meta eliminado con exito ");
                this.setVisible(false);
            }
        } catch (Exception ex) {
            Logger.getLogger(EliminarMeta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbtn_eliminarActionPerformed

    private void jcbo_MetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbo_MetaActionPerformed
        try {
            // TODO add your handling code here:

            String nombre_meta= jcbo_Meta.getSelectedItem().toString();
            meta.setCod_meta(cmeta.obtenerCodigoMeta(nombre_meta));
        } catch (Exception ex) {
            Logger.getLogger(ActulizarMeta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jcbo_MetaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_eliminar;
    private javax.swing.JComboBox<String> jcbo_Meta;
    private javax.swing.JLabel jlbl_ingresosMes6;
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