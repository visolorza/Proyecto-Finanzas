/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import javax.swing.JComboBox;

/**
 *
 * @author Calderón, Solorza, Urbina
 * @version 20/11/2023
 */
public interface IDetalleHistorico {
    
    void RellenarComboAño(String tabla, String fecha, JComboBox combo);
    void RellenarComboMes(int year,String tabla, String fecha, JComboBox combo);
}
