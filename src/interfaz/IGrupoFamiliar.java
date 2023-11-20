/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import java.util.ArrayList;
import javax.swing.JComboBox;
import modelo.Integrante;

/**
 *
 * @author María José
 */
public interface IGrupoFamiliar {
    
    ArrayList<Integrante> mostrar() throws Exception;
    boolean agregar(Integrante integrante) throws Exception;
    boolean eliminar(int cod_int) throws Exception;
    boolean actualizar(Integrante integrante) throws Exception;
    
    int obtenerCodInt(Integrante integrante, String desc_int) throws Exception;
    
    void RellenarComboInt(String tabla, String valor, JComboBox combo);
}
