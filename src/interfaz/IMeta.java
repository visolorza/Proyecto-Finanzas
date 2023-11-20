/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import java.util.ArrayList;
import javax.swing.JComboBox;
import modelo.Meta;

/**
 *
 * @author Calderón, Solorza, Urbina
 * @version 20/11/2023
 */
public interface IMeta {
    
    ArrayList<Meta> mostrar() throws Exception;
    boolean agregar(Meta meta) throws Exception;
    boolean eliminar(int cod_meta) throws Exception;
    boolean actualizar(Meta meta) throws Exception;
    
    int obtenerCodigoMeta(String nombreMeta) throws Exception;
    Meta obtenerMetaCodInt(Meta meta,String desc_int) throws Exception;
    int obtenerTotalMeta(String nombre_meta) throws Exception;
    
    void RellenarComboMeta(String tabla, String valor, JComboBox combo);
    
    
    
}
