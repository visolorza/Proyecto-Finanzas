/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author María José
 */
public class Grafico {
        
    public ChartPanel crearGraficoInicio() throws Exception {
        Utils utils = new Utils();
        //Datos
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Transporte", utils.obtenerTotalCat(1));
        dataset.setValue("Salud",utils.obtenerTotalCat(2));
        dataset.setValue("Educacion", utils.obtenerTotalCat(3));
        dataset.setValue("Compras", utils.obtenerTotalCat(4));
        dataset.setValue("Vivienda", utils.obtenerTotalCat(5));
        dataset.setValue("Cuentas", utils.obtenerTotalCat(6));
        dataset.setValue("Deudas", utils.obtenerTotalCat(7));
        dataset.setValue("Otros", utils.obtenerTotalCat(8));
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
        Utils utils = new Utils();
        //Datos
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Transporte", utils.obtenerTotalGastoDH(year, mes, 1));
        dataset.setValue("Salud",utils.obtenerTotalGastoDH(year, mes, 2));
        dataset.setValue("Educacion", utils.obtenerTotalGastoDH(year, mes, 3));
        dataset.setValue("Compras", utils.obtenerTotalGastoDH(year, mes, 4));
        dataset.setValue("Vivienda", utils.obtenerTotalGastoDH(year, mes, 5));
        dataset.setValue("Cuentas", utils.obtenerTotalGastoDH(year, mes, 6));
        dataset.setValue("Deudas", utils.obtenerTotalGastoDH(year, mes, 7));
        dataset.setValue("Otros", utils.obtenerTotalGastoDH(year, mes, 8));
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
        Utils utils = new Utils();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if(utils.obtenerTotalIngresoMesDH(year, (mes-1))!=0){
            dataset.addValue(utils.obtenerTotalIngresoMesDH(year, (mes-1)), "Ingresos", (mes-1)+"/"+year);
        }
        dataset.addValue(utils.obtenerTotalIngresoMesDH(year, mes), "Ingresos", mes+"/"+year);
        if (utils.obtenerTotalIngresoMesDH(year, (mes+1))!=0) {
            dataset.addValue(utils.obtenerTotalIngresoMesDH(year, (mes+1)), "Ingresos", (mes+1)+"/"+year);
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
        Utils utils = new Utils();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if(utils.obtenerTotalAhorroMesDH(year, (mes-1))!=0){
            dataset.addValue(utils.obtenerTotalAhorroMesDH(year, (mes-1)), "Ahorros", (mes-1)+"/"+year);
        }
        dataset.addValue(utils.obtenerTotalAhorroMesDH(year, mes), "Ahorros", mes+"/"+year);
        if (utils.obtenerTotalAhorroMesDH(year, (mes+1))!=0) {
            dataset.addValue(utils.obtenerTotalAhorroMesDH(year, (mes+1)), "Ahorros", (mes+1)+"/"+year);
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