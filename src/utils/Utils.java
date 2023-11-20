/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import dao.DAOAhorro;
import dao.DAOGasto;
import dao.DAOGrupoFamiliar;
import dao.DAOIngreso;
import interfaz.IAhorro;
import interfaz.IGasto;
import interfaz.IGrupoFamiliar;
import interfaz.IIngreso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Ahorro;
import modelo.ConexionBD;
import modelo.Gasto;
import modelo.Ingreso;
import modelo.Integrante;


/**
 *
 * @author Calderón, Solorza, Urbina
 * @version 20/11/2023
 */
public class Utils {
    
    //Escribir aquí lo que está en métodos.
    
    public String obtenerNombreMesActual(){
        Date fecha = new Date();
        SimpleDateFormat fechaFormatoMes = new SimpleDateFormat("MMMM");
        String nombreMes = fechaFormatoMes.format(fecha);
        return nombreMes.toUpperCase();
    }
    
    public int obtenerNumMesActual(){
        Date fecha = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        int numMes = calendar.get(Calendar.MONTH) + 1; 
        return numMes;
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
    
    public void RellenarCombocat(String tabla, String valor, JComboBox combo){
        
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

    public String obtenerNombreYearActual(Date fecha){
        SimpleDateFormat fechaFormatoAnno = new SimpleDateFormat("yyyy");
        String year = fechaFormatoAnno.format(fecha);
        return year;
    }
    
    public int obtenerNumYearActual(){
        Date fecha = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        int numYear = calendar.get(Calendar.YEAR); 
        return numYear;
    }
    
    public String obtenerTotal (int codcat) throws Exception{
        ArrayList<Gasto> listaGastos;
        IGasto IGasto = new DAOGasto();
        
        listaGastos=IGasto.mostrar(0,0,codcat);
        int sumaMontosGas=0;
        
        for (Gasto listaGasto : listaGastos) {
            sumaMontosGas+=listaGasto.getMontoGast();
        }
        NumberFormat formatoMontoGas = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));
        return formatoMontoGas.format(sumaMontosGas);
    }
    
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
        DAOGasto cgasto = new DAOGasto();
        
        listaGast = cgasto.mostrarGastJoinSubcat(0,0);
       
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
    
    public void RellenarComboMeta(String tabla, String valor, JComboBox combo){
        
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
    
    public String obtenerTotalGastosMes () throws Exception{
        ArrayList<Gasto> listaGastos;
        IGasto IGasto = new DAOGasto();
        listaGastos=IGasto.mostrar(0,this.obtenerNumMesActual(),0);
        int sumaMontosGas=0;
        for (Gasto gasto : listaGastos) {
            sumaMontosGas+=gasto.getMontoGast();
        }
        NumberFormat formatoMontoGas = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));
        return formatoMontoGas.format(sumaMontosGas);
    }
    
    public String obtenerTotalIngresosMes () throws Exception{
        ArrayList<Ingreso> listaIngresos;
        IIngreso IIngreso = new DAOIngreso();
        listaIngresos=IIngreso.mostrar(this.obtenerNumYearActual(),this.obtenerNumMesActual());
        int sumaMontosIng=0;
        for (Ingreso ingreso : listaIngresos) {
            sumaMontosIng+=ingreso.getMonto_ing();
        }
        NumberFormat formatoMontoIng = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));
        return formatoMontoIng.format(sumaMontosIng);
    }

    
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
    
    public JTable refrescarGrupoFamiliar(JTable tabla) throws Exception{

        ArrayList<Integrante> listaGrupo = new ArrayList<>();

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("CODIGO");
        modelo.addColumn("INTEGRANTE");
        IGrupoFamiliar IGrupoFamiliar = new DAOGrupoFamiliar();

        listaGrupo = IGrupoFamiliar.mostrar();

        while (modelo.getRowCount()>0) {
            modelo.removeRow(0);
        }

        tabla.setModel(modelo);

        for (Integrante listaGr : listaGrupo) {
            Object a[] = new Object[2];

            a[0]=listaGr.getCod_int();
            a[1]=listaGr.getDesc_int();
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
