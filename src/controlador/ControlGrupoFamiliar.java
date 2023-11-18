
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ConexionBD;
import modelo.Integrante;

/**
 *
 * @author michimisimo
 */
public class ControlGrupoFamiliar {
    
    public ArrayList<Integrante> mostrar() throws Exception {
        
        ArrayList<Integrante> lista = new ArrayList<>();
        
        try {
            ConexionBD con = new ConexionBD();
            //Connection cnx = con.obtenerConexion();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "select * from INTEGRANTE";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Integrante integrante = new Integrante();
                integrante.setCod_int(rs.getInt("COD_INT"));
                integrante.setDesc_int(rs.getString("DESC_INT"));
                lista.add(integrante);
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar Integrante" + e.getMessage());
        }
        return lista;
    }
    
    public boolean agregar(Integrante integrante) throws Exception {

        try {
            ConexionBD con = new ConexionBD();
         
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "insert into INTEGRANTE(cod_int, desc_int) values(seq_int.nextval, ?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, integrante.getDesc_int());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al agregar integrante" + e.getMessage());
            return false;
        }
    }
    
    public boolean eliminar(int cod_int) throws Exception {

        //trycatch+tab
        try {
            ConexionBD con = new ConexionBD();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "delete from integrante where cod_int = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, cod_int);

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al eliminar integrante" + e.getMessage());
            return false;
        }
    }
    
    public boolean actualizar(Integrante integrante) throws Exception {
        //trycatch+tab
        try {
            ConexionBD con = new ConexionBD();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "update integrante set desc_int = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1,integrante.getDesc_int());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al actualizar integrante" + e.getMessage());
            return false;
        }
    }
    
//    public Integrante obtenerCodigoInt(Integrante integrante) throws Exception {
//
//    try {
//        ConexionBD con = new ConexionBD();
//        Connection cnx = ConexionBD.obtenerConexion();
//
//        String query = "SELECT cod_int FROM integrante";
//        PreparedStatement stmt = cnx.prepareStatement(query);
//        
//        ResultSet rs = stmt.executeQuery();
//
//        rs = stmt.executeQuery();
//
//        if (rs.next()) {
//            gasto.setCodInt(rs.getInt("cod_int")); 
//            System.out.println("cod_int agregado"+gasto.toString());
//            return gasto;
//        } else {
//            // Manejar el caso en el que no se encontraron filas
//            System.out.println("No se encontraron resultados para desc_int: " + desc_int);
//        }
//
//    } catch (SQLException e) {
//        System.out.println("Error SQL al obtener cod_int: " + e.getMessage());
//        // Puedes lanzar una excepción más específica aquí si es necesario
//    } 
//
//        return gasto;
//    }
    
}
