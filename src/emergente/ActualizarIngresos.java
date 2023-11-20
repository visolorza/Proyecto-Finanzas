
package emergente;

import controlador.ControlIngreso;
import dao.DAOGrupoFamiliar;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.Utils;
import dao.DAOIngreso;
import interfaz.IGrupoFamiliar;
import interfaz.IIngreso;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;

import modelo.Ingreso;

/**
 *
 * @author Calderón, Solorza, Urbina
 * @version 20/11/2023
 */
public class ActualizarIngresos extends javax.swing.JFrame {
    
    private int posicionX;  
    private int posicionY;
    
    public static void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    /**
     * Creates new form actualizargastos
     */
    public ActualizarIngresos() {
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
        jtxt_montoIngreso = new javax.swing.JTextField();
        jlbl_ingresosMes3 = new javax.swing.JLabel();
        jtxt_descIngreso = new javax.swing.JTextField();
        jbtn_actualizar = new javax.swing.JButton();
        jcbo_integrante = new javax.swing.JComboBox<>();
        jlbl_ingresosMes6 = new javax.swing.JLabel();
        jtxt_cod_ing = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbl_ingresosMes2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes2.setText("Integrante:");

        jlbl_ingresosMes4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes4.setText("Monto:");

        jtxt_montoIngreso.setBackground(new java.awt.Color(204, 204, 204));
        jtxt_montoIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jtxt_montoIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_montoIngresoActionPerformed(evt);
            }
        });

        jlbl_ingresosMes3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes3.setText("Descripción:");

        jtxt_descIngreso.setBackground(new java.awt.Color(204, 204, 204));
        jtxt_descIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jtxt_descIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_descIngresoActionPerformed(evt);
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
        jcbo_integrante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        jcbo_integrante.setBorder(null);
        jcbo_integrante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbo_integranteActionPerformed(evt);
            }
        });

        jlbl_ingresosMes6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jlbl_ingresosMes6.setText("Codigo ingreso:");

        jtxt_cod_ing.setBackground(new java.awt.Color(204, 204, 204));
        jtxt_cod_ing.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jtxt_cod_ing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_cod_ingActionPerformed(evt);
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
                        .addComponent(jlbl_ingresosMes3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxt_descIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlbl_ingresosMes4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxt_montoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlbl_ingresosMes2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbo_integrante, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlbl_ingresosMes6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxt_cod_ing, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_cod_ing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_ingresosMes6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_ingresosMes2)
                    .addComponent(jcbo_integrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_ingresosMes4)
                    .addComponent(jtxt_montoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_ingresosMes3)
                    .addComponent(jtxt_descIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jbtn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    IIngreso IIngreso = new DAOIngreso();
    Ingreso ingreso = new Ingreso();
    ControlIngreso cingresos = new ControlIngreso();
    IGrupoFamiliar IGrupoFamiliar = new DAOGrupoFamiliar();
    
    private void jtxt_montoIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_montoIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_montoIngresoActionPerformed

    private void jtxt_descIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_descIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_descIngresoActionPerformed

    private void jbtn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_actualizarActionPerformed


            try {
    
                if (this.jtxt_cod_ing.getText().isBlank() || this.jtxt_descIngreso.getText().isBlank() || this.jtxt_montoIngreso.getText().isBlank() || this.jcbo_integrante.getSelectedItem().toString().equalsIgnoreCase("- SELECCIONAR -")) {
                    JOptionPane.showMessageDialog(null, "Asegurese de ingresar el código del ingreso, su monto y seleccionar un integrante", "Error: falta rellenar campos", HEIGHT);

                }
                else {
                    ingreso.setMonto_ing(Integer.parseInt(this.jtxt_montoIngreso.getText()));
                    ingreso.setDesc_ing(this.jtxt_descIngreso.getText().toUpperCase());
                    ingreso.setCod_ing(Integer.parseInt(this.jtxt_cod_ing.getText()));

                    if(IIngreso.actualizar(ingreso)){
                        System.out.println("ingreso modificado con exto "+ingreso.toString());
                        this.setVisible(false);

                        JOptionPane.showMessageDialog(null, "Modificación hecha con éxito", "Moficación ingreso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
 
            } catch (Exception ex) {
                Logger.getLogger(ActualizarIngresos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
              
    }//GEN-LAST:event_jbtn_actualizarActionPerformed

    private void jcbo_integranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbo_integranteActionPerformed
        // TODO add your handling code here:

        String desc_int = jcbo_integrante.getSelectedItem().toString().toUpperCase();
        try {
            IIngreso.obtenerIngresoCodInt(ingreso, desc_int);
            System.out.println("integrsnte guardado "+ingreso.getCod_int());
        } catch (Exception ex) {
            Logger.getLogger(ActualizarIngresos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jcbo_integranteActionPerformed

    private void jtxt_cod_ingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_cod_ingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_cod_ingActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_actualizar;
    private javax.swing.JComboBox<String> jcbo_integrante;
    private javax.swing.JLabel jlbl_ingresosMes2;
    private javax.swing.JLabel jlbl_ingresosMes3;
    private javax.swing.JLabel jlbl_ingresosMes4;
    private javax.swing.JLabel jlbl_ingresosMes6;
    private javax.swing.JTextField jtxt_cod_ing;
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
