/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import javax.swing.JComboBox;

/**
 *
 * @author María José
 */
public interface IDetalleHistorico {
    
    void RellenarComboAño(String tabla, String fecha, JComboBox combo);
    void RellenarComboMes(int year,String tabla, String fecha, JComboBox combo);
}
