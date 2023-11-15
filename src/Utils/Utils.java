/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import controlador.ControlGasto;
import controlador.ControlIngresos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.ConexionBD;
import modelo.Gasto;
import modelo.Ingresos;

/**
 *
 * @author Usuario
 */
public class Utils {
    
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
    
    public String obtenerTotalCat (int codcat) throws Exception{
        ArrayList<Gasto> listaGastos;
        ControlGasto cgasto = new ControlGasto();
        listaGastos=cgasto.mostrarGastosMesCat(codcat);
        int sumaMontosGas=0;
        for (Gasto gasto : listaGastos) {
            sumaMontosGas+=gasto.getMontoGast();
        }
        NumberFormat formatoMontoGas = NumberFormat.getCurrencyInstance(Locale.getDefault());
        return formatoMontoGas.format(sumaMontosGas);
    }
    
    public String obtenerTotalGastosMes () throws Exception{
        ArrayList<Gasto> listaGastos;
        ControlGasto cgasto = new ControlGasto();
        listaGastos=cgasto.mostrarGastosMes();
        int sumaMontosGas=0;
        for (Gasto gasto : listaGastos) {
            sumaMontosGas+=gasto.getMontoGast();
        }
        NumberFormat formatoMontoGas = NumberFormat.getCurrencyInstance(Locale.getDefault());
        return formatoMontoGas.format(sumaMontosGas);
    }
    
    public String obtenerTotalIngresosMes () throws Exception{
        ArrayList<Ingresos> listaIngresos;
        ControlIngresos cingresos = new ControlIngresos();
        listaIngresos=cingresos.mostrarIngresosMes();
        int sumaMontosIng=0;
        for (Ingresos ingreso : listaIngresos) {
            sumaMontosIng+=ingreso.getMonto_ing();
        }
        NumberFormat formatoMontoIng = NumberFormat.getCurrencyInstance(Locale.getDefault());
        return formatoMontoIng.format(sumaMontosIng);
    }
    
    public JTable refrescar(JTable tabla,int codcat) throws Exception{
        
        ArrayList<Gasto> listaGast = new ArrayList<>();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("codigo");
        modelo.addColumn("fecha");
        modelo.addColumn("descripcion");
        modelo.addColumn("monto");
        ControlGasto cgasto = new ControlGasto();
        
        listaGast = cgasto.mostrar(codcat);
        while (modelo.getRowCount()>0) {
            modelo.removeRow(0);
        }
        tabla.setModel(modelo);
        
        for (Gasto listag : listaGast) {
            Object a[] = new Object[4];
            a[0]=listag.getCodGast();
            a[1]=listag.getFechaGast();
            a[2]=listag.getDescGast();
            a[3]=listag.getMontoGast();
            modelo.addRow(a);
        }
        return tabla;
    } 
    
    
}
