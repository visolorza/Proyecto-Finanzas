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
 * @author María José
 */
public class ControlMeta {
    
    public JTable refrescarTodoMeta(JTable tabla) throws Exception{
        
        ArrayList<Ahorro> listaAhorro = new ArrayList<>();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("CODIGO");
        modelo.addColumn("FECHA");
        modelo.addColumn("META");
        modelo.addColumn("MONTO");
        
        IAhorro IAhorro = new DAOAhorro();
        
        listaAhorro = IAhorro.mostrarAhorroJoinMeta();
       
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
    
    public JTable refrescarMeta(JTable tabla,int codmeta) throws Exception{
        
        ArrayList<Ahorro> listaAhorro = new ArrayList<>();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("CODIGO");
        modelo.addColumn("FECHA");
        modelo.addColumn("MONTO");
        DAOAhorro cAhorro = new DAOAhorro();
        
        listaAhorro = cAhorro.mostrar(codmeta,0,0);
       
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
            
            Object a[] = new Object[3];
            a[0]=listag.getCod_ahorro();
            a[1]=listag.getFecha_ahorro();
            a[2]=monto;
            modelo.addRow(a);
        }
        return tabla;
    } 
    
}
