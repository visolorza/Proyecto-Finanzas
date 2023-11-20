/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOGrupoFamiliar;
import interfaz.IGrupoFamiliar;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Integrante;

/**
 *
 * @author María José
 */
public class ControlGrupoFamiliar {
    
    
    public JTable refrescarGrupoFamiliar(JTable tabla) throws Exception{

        ArrayList<Integrante> listaGrupo = new ArrayList<>();

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("CODIGO");
        modelo.addColumn("INTEGRANTE");
        IGrupoFamiliar IGrupoFamiliar = new DAOGrupoFamiliar();

        listaGrupo = IGrupoFamiliar.mostrar();

        while (modelo.getRowCount()>0) {
            modelo.removeRow(0);
        }

        tabla.setModel(modelo);

        for (Integrante listaGr : listaGrupo) {
            Object a[] = new Object[2];

            a[0]=listaGr.getCod_int();
            a[1]=listaGr.getDesc_int();
            modelo.addRow(a);
        }

        return tabla;
    }
}
