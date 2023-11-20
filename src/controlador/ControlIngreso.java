/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOIngreso;
import interfaz.IIngreso;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Ingreso;
import utils.FormatoTabla;
import utils.Utils;

/**
 *
 * @author María José
 */
public class ControlIngreso {
    
    Utils utils = new Utils();
    
    public JTable refrescarTodoIngreso(JTable tabla) throws Exception{
        
        ArrayList<Ingreso> listaIng = new ArrayList<>();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("CODIGO");
        modelo.addColumn("FECHA");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("MONTO");
        IIngreso IIngreso = new DAOIngreso();
        
        listaIng = IIngreso.mostrar(0,0);
       
        while (modelo.getRowCount()>0) {
            modelo.removeRow(0);
        }
        
        tabla.setModel(modelo);
        
        NumberFormat formatoMontoGas = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));
        tabla.getColumnModel().getColumn(1).setCellRenderer(new FormatoTabla("dd-MM-yyyy"));
        
        String monto;
        
        for (Ingreso ingreso : listaIng) {
            Object a[] = new Object[4];
            int sumaMontosGas=ingreso.getMonto_ing();
            
            monto=formatoMontoGas.format(sumaMontosGas);
                    
            a[0]=ingreso.getCod_ing();
            a[1]=ingreso.getFecha_ing();
            a[2]=ingreso.getDesc_ing();
            a[3]=monto;
            modelo.addRow(a);
        }
        return tabla;
    }
    
    public String obtenerTotalIngresosMes () throws Exception{
        ArrayList<Ingreso> listaIngresos;
        IIngreso IIngreso = new DAOIngreso();
        listaIngresos=IIngreso.mostrar(utils.obtenerNumYearActual(),utils.obtenerNumMesActual());
        int sumaMontosIng=0;
        for (Ingreso ingreso : listaIngresos) {
            sumaMontosIng+=ingreso.getMonto_ing();
        }
        NumberFormat formatoMontoIng = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));
        return formatoMontoIng.format(sumaMontosIng);
    }
    
     public JTable refrescarIngresoAño(JTable tabla,int año) throws Exception{
        
        ArrayList<Ingreso> listaIngreso = new ArrayList<>();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("CODIGO");
        modelo.addColumn("FECHA");
        modelo.addColumn("DETALLE");
        modelo.addColumn("MONTO");
        IIngreso IIngreso = new DAOIngreso();
        
        listaIngreso = IIngreso.mostrar(año,0);
       
        while (modelo.getRowCount()>0) {
            modelo.removeRow(0);
        }
        
        tabla.setModel(modelo);
        NumberFormat formatoMeta = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));
        tabla.getColumnModel().getColumn(1).setCellRenderer(new FormatoTabla("dd-MM-yyyy"));
        
        String monto;
            
        for (Ingreso listag : listaIngreso) {
            
            int sumaMontosGas=listag.getMonto_ing();
            monto=formatoMeta.format(sumaMontosGas);
            
            Object a[] = new Object[4];
            a[0]=listag.getCod_ing();
            a[1]=listag.getFecha_ing();
            a[2]=listag.getDesc_ing();
            a[3]=monto;
            modelo.addRow(a);
        }
        return tabla;
    } 
     
     public JTable refrescarIngresoMes(JTable tabla,int año,int mes) throws Exception{
        
        ArrayList<Ingreso> listaIngreso = new ArrayList<>();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("CODIGO");
        modelo.addColumn("FECHA");
        modelo.addColumn("DETALLE");
        modelo.addColumn("MONTO");
        IIngreso IIngreso = new DAOIngreso();
        
        listaIngreso = IIngreso.mostrar(año,mes);
       
        while (modelo.getRowCount()>0) {
            modelo.removeRow(0);
        }
        
        tabla.setModel(modelo);
        NumberFormat formatoMeta = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));
        tabla.getColumnModel().getColumn(1).setCellRenderer(new FormatoTabla("dd-MM-yyyy"));
        
        String monto;
            
        for (Ingreso listag : listaIngreso) {
            
            int sumaMontosGas=listag.getMonto_ing();
            monto=formatoMeta.format(sumaMontosGas);
            
            Object a[] = new Object[4];
            a[0]=listag.getCod_ing();
            a[1]=listag.getFecha_ing();
            a[2]=listag.getDesc_ing();
            a[3]=monto;
            modelo.addRow(a);
        }
        return tabla;
    } 
     
    public int obtenerTotalIngresoMesDH (int year,int mes) throws Exception{
        ArrayList<Ingreso> listaIngresos;
        IIngreso IIngreso = new DAOIngreso();
        listaIngresos=IIngreso.mostrar(year,mes);
        int sumaMontosIng=0;
        for (Ingreso ingreso : listaIngresos) {
            sumaMontosIng+=ingreso.getMonto_ing();
        }
        return sumaMontosIng;
    }

}
