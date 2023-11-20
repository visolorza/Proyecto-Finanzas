/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import java.util.ArrayList;
import modelo.Ahorro;

/**
 *
 * @author Calderón, Solorza, Urbina
 * @version 20/11/2023
 */
public interface IAhorro {
    
    ArrayList<Ahorro> mostrar(int cod_meta,int year,int mes) throws Exception;
    boolean agregar(Ahorro ahorro) throws Exception;
    boolean eliminar(int cod_ahorro) throws Exception;
    boolean actualizar(Ahorro ahorro) throws Exception;
    
    ArrayList<Ahorro> mostrarAhorroJoinMeta() throws Exception;
}
