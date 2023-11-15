/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import modelo.ConexionBD;

/**
 *
 * @author Usuario
 */
public class Utils {
    
    //Escribir aquí lo que está en métodos.
    
    public Date obtenerFecha() {
        Date fechaActual = new Date();
        return fechaActual;
    }
    
    public String obtenerMes(Date fecha){
        SimpleDateFormat fechaFormatoMes = new SimpleDateFormat("MMMM");
        String nombreMes = fechaFormatoMes.format(fecha);
        return nombreMes;
    }
    

    public void RellenarComboInt(String tabla, String valor, JComboBox combo){
        
        try {
        
        ConexionBD con = new ConexionBD();
        Connection cnx = ConexionBD.obtenerConexion();
        
        String query = "SELECT * FROM "+tabla;
        PreparedStatement stmt = cnx.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        
            while (rs.next()) {
                combo.addItem(rs.getString(valor));
            }
        
        } catch (Exception e) {
        }
       
    }
    
    public void RellenarComboSubcat(String tabla, String valor, JComboBox combo,int codcat){
        
        try {
        
        ConexionBD con = new ConexionBD();
        Connection cnx = ConexionBD.obtenerConexion();
        
        String query = "SELECT * FROM "+tabla+" where cod_cat = "+codcat;
        PreparedStatement stmt = cnx.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        
            while (rs.next()) {
                combo.addItem(rs.getString(valor));
            }
        
        } catch (Exception e) {
        }
       
    }
        

    public String obtenerAnno(Date fecha){
        SimpleDateFormat fechaFormatoAnno = new SimpleDateFormat("yyyy");
        String anno = fechaFormatoAnno.format(fecha);
        return anno;
    }
    
    

}
