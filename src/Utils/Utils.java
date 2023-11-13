/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Utils {
    
    //Escribir aquí lo que está en métodos.
    
    public Date obtenerFecha() {
        Date fechaActual = new Date();
        return fechaActual;
    }
    
    public String obtenerMes(Date fecha){
        SimpleDateFormat fechaFormato = new SimpleDateFormat("MMMM");
        String nombreMes = fechaFormato.format(fecha);
        return nombreMes;
    }
    
}
