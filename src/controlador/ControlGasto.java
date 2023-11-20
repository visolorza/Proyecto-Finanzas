/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOGasto;
import interfaz.IGasto;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Gasto;
import utils.FormatoTabla;
import utils.Utils;

/**
 *
 * @author Calderón, Solorza, Urbina
 * @version 20/11/2023
 */
public class ControlGasto {
    
    Utils utils = new Utils();
    
    public int obtenerTotalCat (int codcat) throws Exception{
        ArrayList<Gasto> listaGastos;
        IGasto IGasto = new DAOGasto();
        listaGastos=IGasto.mostrar(0,0,codcat);
        int sumaMontosGas=0;
        for (Gasto gasto : listaGastos) {
            sumaMontosGas+=gasto.getMontoGast();
        }
        return sumaMontosGas;
    }
    
    public String obtenerTotalGastosMesActual () throws Exception{
        ArrayList<Gasto> listaGastos;
        IGasto IGasto = new DAOGasto();
        listaGastos=IGasto.mostrar(0,utils.obtenerNumMesActual(),0);
        int sumaMontosGas=0;
        for (Gasto gasto : listaGastos) {
            sumaMontosGas+=gasto.getMontoGast();
        }
        NumberFormat formatoMontoGas = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));
        return formatoMontoGas.format(sumaMontosGas);
    }
    
    public JTable refrescar(JTable tabla,int codcat) throws Exception{
        
        ArrayList<Gasto> listaGast = new ArrayList<>();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("CODIGO");
        modelo.addColumn("FECHA");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("INTEGRANTE");
        modelo.addColumn("MONTO");
        IGasto IGasto = new DAOGasto();
        
        listaGast = IGasto.mostrarGastJoinInt(codcat,0);
       
        while (modelo.getRowCount()>0) {
            modelo.removeRow(0);
        }
        
        tabla.setModel(modelo);
        
        NumberFormat formatoMontoGas = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));
        tabla.getColumnModel().getColumn(1).setCellRenderer(new FormatoTabla("dd-MM-yyyy"));
        
        String monto;
        
        for (Gasto listag : listaGast) {
            Object a[] = new Object[5];
            int sumaMontosGas=listag.getMontoGast();
            
            monto=formatoMontoGas.format(sumaMontosGas);
                    
            a[0]=listag.getCodGast();
            a[1]=listag.getFechaGast();
            a[2]=listag.getDescGast();
            a[3]=listag.getDesc_int();
            a[4]=monto;
            modelo.addRow(a);
        }
        return tabla;
    }
    
    public JTable refrescarTodoGasto(JTable tabla) throws Exception{
        
        ArrayList<Gasto> listaGast = new ArrayList<>();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("CODIGO");
        modelo.addColumn("FECHA");
        modelo.addColumn("SUBCATEGORIA");
        modelo.addColumn("DETALLE");
        modelo.addColumn("MONTO");
        IGasto IGasto = new DAOGasto();
        
        listaGast = IGasto.mostrarGastJoinSubcat(0,0);
       
        while (modelo.getRowCount()>0) {
            modelo.removeRow(0);
        }
        
        tabla.setModel(modelo);
        
        NumberFormat formatoMontoGas = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));
        tabla.getColumnModel().getColumn(1).setCellRenderer(new FormatoTabla("dd-MM-yyyy"));
        
        String monto;
        
        for (Gasto listag : listaGast) {
            
            int sumaMontosGas=listag.getMontoGast();
            monto=formatoMontoGas.format(sumaMontosGas);
            
            Object a[] = new Object[5];
            a[0]=listag.getCodGast();
            a[1]=listag.getFechaGast();
            a[2]=listag.getDescSubcat();
            a[3]=listag.getDescGast();
            a[4]=monto;
            modelo.addRow(a);
        }
        return tabla;
    }
    
     public JTable refrescarGastoAño(JTable tabla,int año) throws Exception{
        
        ArrayList<Gasto> listaGasto = new ArrayList<>();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("CODIGO");
        modelo.addColumn("FECHA");
        modelo.addColumn("SUBCATEGORIA");
        modelo.addColumn("DETALLE");
        modelo.addColumn("MONTO");
        
        IGasto IGasto = new DAOGasto();
        
        listaGasto = IGasto.mostrarGastJoinSubcat(año,0);
       
        while (modelo.getRowCount()>0) {
            modelo.removeRow(0);
        }
        
        tabla.setModel(modelo);
        NumberFormat formatoMeta = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));
        tabla.getColumnModel().getColumn(1).setCellRenderer(new FormatoTabla("dd-MM-yyyy"));
        
        String monto;
            
        for (Gasto listag : listaGasto) {
            
            int sumaMontosGas=listag.getMontoGast();
            monto=formatoMeta.format(sumaMontosGas);
            
            Object a[] = new Object[5];
            a[0]=listag.getCodGast();
            a[1]=listag.getFechaGast();
            a[2]=listag.getDescSubcat();
            a[3]=listag.getDescGast();
            a[4]=monto;
            modelo.addRow(a);
        }
        return tabla;
    } 
     
    public JTable refrescarGastoMes(JTable tabla,int año,int mes) throws Exception{
        
        ArrayList<Gasto> listaGasto = new ArrayList<>();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("CODIGO");
        modelo.addColumn("FECHA");
        modelo.addColumn("SUBCATEGORIA");
        modelo.addColumn("DETALLE");
        modelo.addColumn("MONTO");
        IGasto IGasto = new DAOGasto();
        
        listaGasto = IGasto.mostrarGastJoinSubcat(año,mes);
       
        while (modelo.getRowCount()>0) {
            modelo.removeRow(0);
        }
        
        tabla.setModel(modelo);
        NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));
        tabla.getColumnModel().getColumn(1).setCellRenderer(new FormatoTabla("dd-MM-yyyy"));
        
        String monto;
            
        for (Gasto gasto : listaGasto) {
            
            int sumaMontosGas=gasto.getMontoGast();
            monto=formato.format(sumaMontosGas);
            
            Object a[] = new Object[5];
            a[0]=gasto.getCodGast();
            a[1]=gasto.getFechaGast();
            a[2]=gasto.getDescSubcat();
            a[3]=gasto.getDescGast();
            a[4]=monto;
            modelo.addRow(a);
        }
        return tabla;
    } 
    
    public JTable refrescarPorSubcat(JTable tabla,int codcat,int subcat) throws Exception{
        
        ArrayList<Gasto> listaGast = new ArrayList<>();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("CODIGO");
        modelo.addColumn("FECHA");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("INTEGRANTE");
        modelo.addColumn("MONTO");
        IGasto IGasto = new DAOGasto();
        
        listaGast = IGasto.mostrarGastJoinInt(codcat,subcat);
       
        while (modelo.getRowCount()>0) {
            modelo.removeRow(0);
        }
        
        tabla.setModel(modelo);
        
        NumberFormat formatoMontoGas = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));
        tabla.getColumnModel().getColumn(1).setCellRenderer(new FormatoTabla("dd-MM-yyyy"));
        
        String monto;
        
        for (Gasto listag : listaGast) {
            Object a[] = new Object[5];
            int sumaMontosGas=listag.getMontoGast();
            
            monto=formatoMontoGas.format(sumaMontosGas);
                    
            a[0]=listag.getCodGast();
            a[1]=listag.getFechaGast();
            a[2]=listag.getDescGast();
            a[3]=listag.getDesc_int();
            a[4]=monto;
            modelo.addRow(a);
        }
        return tabla;
    }
     
    public int obtenerTotalGastoDH (int year,int mes, int codcat) throws Exception{
        ArrayList<Gasto> listaGastos;
        IGasto IGasto = new DAOGasto();
        listaGastos=IGasto.mostrar(year,mes,codcat);
        int sumaMontosGas=0;
        for (Gasto gasto : listaGastos) {
            sumaMontosGas+=gasto.getMontoGast();
        }
        return sumaMontosGas;
    }
 
    public int obtenerTotalGastoMesDH (int year,int mes) throws Exception{
        ArrayList<Gasto> listaGastos;
        IGasto IGasto = new DAOGasto();
        listaGastos=IGasto.mostrarGastJoinSubcat(year,mes);
        int sumaMontosGas=0;
        for (Gasto gasto : listaGastos) {
            sumaMontosGas+=gasto.getMontoGast();
        }
        return sumaMontosGas;
    }
}
