/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import controlador.ControlAhorro;
import controlador.ControlGasto;
import controlador.ControlIngreso;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author María José
 */
public class Grafico {
    
    ControlGasto controlGasto = new ControlGasto();
    Utils utils = new Utils();
    ControlIngreso controlIngreso = new ControlIngreso();
    ControlAhorro controlAhorro = new ControlAhorro();
        
    public ChartPanel crearGraficoInicio() throws Exception {
        
        //Datos
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Transporte", controlGasto.obtenerTotalCat(1));
        dataset.setValue("Salud",controlGasto.obtenerTotalCat(2));
        dataset.setValue("Educacion", controlGasto.obtenerTotalCat(3));
        dataset.setValue("Compras", controlGasto.obtenerTotalCat(4));
        dataset.setValue("Vivienda", controlGasto.obtenerTotalCat(5));
        dataset.setValue("Cuentas", controlGasto.obtenerTotalCat(6));
        dataset.setValue("Deudas", controlGasto.obtenerTotalCat(7));
        dataset.setValue("Otros", controlGasto.obtenerTotalCat(8));
        //Crear grafico
        JFreeChart chart = ChartFactory.createPieChart(
        "Gastos del Mes",  
        dataset,        
        true,          
        true,
        false);                
        //Ver porcentajes
        PiePlot plot = (PiePlot) chart.getPlot();
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator(
        "{0} ({2})",  // "{0}" categoría, "{2}" porcentaje
        new java.text.DecimalFormat("0.00"),  // Formato porcentajes num
        new java.text.DecimalFormat("0.00%")); // Formato porcentajes "%" 
        plot.setLabelGenerator(labelGenerator);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(526, 291));
        return chartPanel;
    }   
    
    public ChartPanel crearGraficoGasDetHis(int year,int mes) throws Exception {
        //Datos
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Transporte", controlGasto.obtenerTotalGastoDH(year, mes, 1));
        dataset.setValue("Salud",controlGasto.obtenerTotalGastoDH(year, mes, 2));
        dataset.setValue("Educacion", controlGasto.obtenerTotalGastoDH(year, mes, 3));
        dataset.setValue("Compras", controlGasto.obtenerTotalGastoDH(year, mes, 4));
        dataset.setValue("Vivienda", controlGasto.obtenerTotalGastoDH(year, mes, 5));
        dataset.setValue("Cuentas", controlGasto.obtenerTotalGastoDH(year, mes, 6));
        dataset.setValue("Deudas", controlGasto.obtenerTotalGastoDH(year, mes, 7));
        dataset.setValue("Otros", controlGasto.obtenerTotalGastoDH(year, mes, 8));
        //Crear grafico
        JFreeChart chart = ChartFactory.createPieChart(
        " ",  
        dataset,        
        true,          
        true,
        false);                
        //Ver porcentajes
        PiePlot plot = (PiePlot) chart.getPlot();
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator(
        "{2}",  // "{0}" categorÃ­a, "{2}" porcentaje
        new java.text.DecimalFormat("0.00"),  // Formato porcentajes num
        new java.text.DecimalFormat("0.00%")); // Formato porcentajes "%" 
        plot.setLabelGenerator(labelGenerator);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(280, 235));
        return chartPanel;
    }
    
    public ChartPanel crearGraficoIngDetHis(int year,int mes)throws Exception{
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if(controlIngreso.obtenerTotalIngresoMesDH(year, (mes-1))!=0){
            dataset.addValue(controlIngreso.obtenerTotalIngresoMesDH(year, (mes-1)), "Ingresos", (mes-1)+"/"+year);
        }
        dataset.addValue(controlIngreso.obtenerTotalIngresoMesDH(year, mes), "Ingresos", mes+"/"+year);
        if (controlIngreso.obtenerTotalIngresoMesDH(year, (mes+1))!=0) {
            dataset.addValue(controlIngreso.obtenerTotalIngresoMesDH(year, (mes+1)), "Ingresos", (mes+1)+"/"+year);
        }
        JFreeChart chart = ChartFactory.createBarChart(
                " ",
                "Mes",
                "Ingresos",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(280, 235));

        return chartPanel;
    }
    
    public ChartPanel crearGraficoAhorroDetHis(int year,int mes)throws Exception{
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if(controlAhorro.obtenerTotalAhorroMesDH(year, (mes-1))!=0){
            dataset.addValue(controlAhorro.obtenerTotalAhorroMesDH(year, (mes-1)), "Ahorros", (mes-1)+"/"+year);
        }
        dataset.addValue(controlAhorro.obtenerTotalAhorroMesDH(year, mes), "Ahorros", mes+"/"+year);
        if (controlAhorro.obtenerTotalAhorroMesDH(year, (mes+1))!=0) {
            dataset.addValue(controlAhorro.obtenerTotalAhorroMesDH(year, (mes+1)), "Ahorros", (mes+1)+"/"+year);
        }
        JFreeChart chart = ChartFactory.createBarChart(
                " ",
                "Mes",
                "Ahorros",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(280, 235));

        return chartPanel;
    }


    
}