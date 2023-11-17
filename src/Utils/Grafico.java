/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

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
    
}