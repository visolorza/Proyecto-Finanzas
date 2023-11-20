/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOAhorro;
import interfaz.IAhorro;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Ahorro;
import utils.FormatoTabla;

/**
 *
 * @author Calderón, Solorza, Urbina
 * @version 20/11/2023
 */
public class ControlAhorro {
    
    public JTable refrescarAhorroAño(JTable tabla,int año) throws Exception{
        
        ArrayList<Ahorro> listaAhorro = new ArrayList<>();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("CODIGO");
        modelo.addColumn("FECHA");
        modelo.addColumn("META");
        modelo.addColumn("MONTO");
        IAhorro IAhorro = new DAOAhorro();
        
        listaAhorro = IAhorro.mostrar(0,año,0);
       
        while (modelo.getRowCount()>0) {
            modelo.removeRow(0);
        }
        
        tabla.setModel(modelo);
        NumberFormat formatoMeta = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));
        tabla.getColumnModel().getColumn(1).setCellRenderer(new FormatoTabla("dd-MM-yyyy"));
        
        String monto;
            
        for (Ahorro lista : listaAhorro) {
            
            int sumaMontosGas=lista.getMonto_ahorro();
            monto=formatoMeta.format(sumaMontosGas);
            
            Object a[] = new Object[4];
            a[0]=lista.getCod_ahorro();
            a[1]=lista.getFecha_ahorro();
            a[2]=lista.getDesc_meta();
            a[3]=monto;
            modelo.addRow(a);
        }
        return tabla;
    } 
    
    public JTable refrescarAhorroMes(JTable tabla,int año,int mes) throws Exception{
        
        ArrayList<Ahorro> listaAhorro = new ArrayList<>();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("CODIGO");
        modelo.addColumn("META");
        modelo.addColumn("FECHA");
        modelo.addColumn("MONTO");
        IAhorro IAhorro = new DAOAhorro();
        
        listaAhorro = IAhorro.mostrar(0,año,mes);
       
        while (modelo.getRowCount()>0) {
            modelo.removeRow(0);
        }
        
        tabla.setModel(modelo);
        NumberFormat formatoMeta = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));
        tabla.getColumnModel().getColumn(1).setCellRenderer(new FormatoTabla("dd-MM-yyyy"));
        
        String monto;
            
        for (Ahorro listag : listaAhorro) {
            
            int sumaMontosGas=listag.getMonto_ahorro();
            monto=formatoMeta.format(sumaMontosGas);
            Object a[] = new Object[4];
            a[0]=listag.getCod_ahorro();
            a[1]=listag.getFecha_ahorro();
            a[2]=listag.getDesc_meta();
            a[3]=monto;
            modelo.addRow(a);
        }
        return tabla;
    }
    
    public String obtenerTotalAhorros () throws Exception{
        ArrayList<Ahorro> listaAhorros;
        IAhorro IAhorro = new DAOAhorro();
        listaAhorros=IAhorro.mostrar(0,0,0);
        int sumaMontosA=0;
        for (Ahorro ahorro : listaAhorros) {
            sumaMontosA+=ahorro.getMonto_ahorro();
        }
        NumberFormat formatoMontoA = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));
        return formatoMontoA.format(sumaMontosA);
    }
    
     public int obtenerTotalAhorroMesDH (int year,int mes) throws Exception{
        ArrayList<Ahorro> listaAhorros;
        IAhorro IAhorro = new DAOAhorro();
        listaAhorros=IAhorro.mostrar(0,year, mes);
        int sumaMontosAho=0;
        for (Ahorro ahorro : listaAhorros) {
            sumaMontosAho+=ahorro.getMonto_ahorro();
        }
        return sumaMontosAho;
    }
    
    public int obtenerTotalAhorroPorMeta(int codMeta) throws Exception{
        ArrayList<Ahorro> listaAhorros;
        IAhorro IAhorro = new DAOAhorro();
        listaAhorros=IAhorro.mostrar(codMeta,0,0);
        int sumaMontosAho=0;
        for (Ahorro ahorro : listaAhorros) {
            sumaMontosAho+=ahorro.getMonto_ahorro();
        }
        return sumaMontosAho;
    }
    
    
}
