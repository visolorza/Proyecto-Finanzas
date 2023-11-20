/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import java.util.ArrayList;
import javax.swing.JComboBox;
import modelo.Gasto;

/**
 *
 * @author Calderón, Solorza, Urbina
 * @version 20/11/2023
 */
public interface IGasto {
    
    ArrayList<Gasto> mostrar(int year, int mes, int codCat) throws Exception;
    boolean agregar(Gasto gasto) throws Exception;
    boolean eliminar(int cod_gast) throws Exception;
    boolean actualizar(Gasto gasto) throws Exception;
    
    ArrayList mostrarGastJoinInt(int codCat, int codSubcat) throws Exception;
    ArrayList mostrarGastJoinSubcat(int año,int mes) throws Exception;
    
    Gasto obtenerCodSubcat(Gasto gasto,String desc_subcat) throws Exception;
    Gasto obtenerGastoCodInt(Gasto gasto,String desc_int) throws Exception;
    int obtenerCodCat(String desc_cat) throws Exception;
    
     void RellenarComboCatSubcat(String tabla, String valor, JComboBox combo,int codcat);
}
