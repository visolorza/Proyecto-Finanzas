/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package emergente;

import dao.DAOGasto;
import dao.DAOGrupoFamiliar;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Integrante;

/**
 *
 * @author felip
 */
public class EliminarIntegrante extends javax.swing.JFrame {

    /**
     * Creates new form EliminarGastos
     */
    public EliminarIntegrante() {
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
        jtxt_cod_int = new javax.swing.JTextField();
        jbtn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jlbl_ingresosMes6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes6.setText("Codigo Integrante:");

        jtxt_cod_int.setBackground(new java.awt.Color(204, 204, 204));
        jtxt_cod_int.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jtxt_cod_int.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_cod_intActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtxt_cod_int, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_ingresosMes6)
                    .addComponent(jbtn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jlbl_ingresosMes6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_cod_int, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jbtn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Integrante integrante = new Integrante();
    DAOGrupoFamiliar cintegrante = new DAOGrupoFamiliar();
    
    
    private void jtxt_cod_intActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_cod_intActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_cod_intActionPerformed

    private void jbtn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminarActionPerformed

        int cod_int = Integer.parseInt(this.jtxt_cod_int.getText());

        try {
            if(cintegrante.eliminar(cod_int)){
                System.out.println("integrante eliminado con exto ");
                this.setVisible(false);
            }
        } catch (Exception ex) {
            Logger.getLogger(EliminarIntegrante.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbtn_eliminarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_eliminar;
    private javax.swing.JLabel jlbl_ingresosMes6;
    private javax.swing.JTextField jtxt_cod_int;
    // End of variables declaration//GEN-END:variables
}