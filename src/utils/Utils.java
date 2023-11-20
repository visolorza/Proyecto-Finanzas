/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


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
        
}
