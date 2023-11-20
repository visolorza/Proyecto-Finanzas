/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import interfaz.IDetalleHistorico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import modelo.ConexionBD;

/**
 *
 * @author Calderón, Solorza, Urbina
 * @version 20/11/2023
 */
public class DAODetalleHistorico implements IDetalleHistorico{
    
    @Override
    public void RellenarComboAño(String tabla, String fecha, JComboBox combo){
        
        try {
        
            ConexionBD con = new ConexionBD();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "SELECT Extract(YEAR FROM " + fecha + ") AS year FROM " + tabla + " GROUP BY Extract(YEAR FROM " + fecha + ")";
            PreparedStatement stmt = cnx.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
        
            while (rs.next()) {
                combo.addItem(rs.getString("year"));
            }
        
        } catch (Exception e) {
        }
       
    }
    
    public void RellenarComboMes(int year,String tabla, String fecha, JComboBox combo){
        
        try {
        
            ConexionBD con = new ConexionBD();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "SELECT EXTRACT(MONTH FROM " + fecha + ") AS mes FROM " + tabla + 
               " WHERE EXTRACT(YEAR FROM " + fecha + ") = ? GROUP BY EXTRACT (MONTH FROM "+fecha+
               ") order by EXTRACT (MONTH FROM "+fecha+") desc";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, year);
            ResultSet rs = stmt.executeQuery();
        
            while (rs.next()) {
                combo.addItem(rs.getString("mes"));
            }
        
        } catch (Exception e) {
        }
       
    }
    
}
