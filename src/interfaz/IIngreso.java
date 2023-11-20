/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import java.util.ArrayList;
import modelo.Ingreso;

/**
 *
 * @author Calderón, Solorza, Urbina
 * @version 20/11/2023
 */
public interface IIngreso {
    
    ArrayList<Ingreso> mostrar(int year,int mes) throws Exception;
    boolean agregar(Ingreso ingresos) throws Exception; 
    boolean eliminar(int cod_ing) throws Exception;
    public boolean actualizar(Ingreso ingresos) throws Exception;
    
    Ingreso obtenerIngresoCodInt(Ingreso ingreso,String desc_int) throws Exception;
}
