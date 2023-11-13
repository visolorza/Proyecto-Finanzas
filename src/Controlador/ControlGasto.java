
package Controlador;

import java.util.ArrayList;
import modelo.ConexionBD;
import modelo.Gasto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author michimisimo
 */
public class ControlGasto {

    public ControlGasto() {
    }
     
    public ArrayList<Gasto> mostrar(int cod_cat) throws Exception {
        
        ArrayList<Gasto> lista = new ArrayList<>();
        
        try {
            ConexionBD con = new ConexionBD();
            //Connection cnx = con.obtenerConexion();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "SELECT * FROM gasto g JOIN subcategoria s ON(s.cod_subcat = g.cod_subcat) WHERE s.cod_cat = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, cod_cat);
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Gasto gasto = new Gasto();
                gasto.setCodGast(rs.getInt("COD_GAST"));
                gasto.setFechaGast(rs.getDate("FECHA_GAST"));
                gasto.setDescGast(rs.getString("DESC_GAST"));
                gasto.setMontoGast(rs.getInt("MONTO_GAST"));
                gasto.setCodSubcat(rs.getInt("COD_SUBCAT"));
                gasto.setCodInt(rs.getInt("COD_INT"));
                lista.add(gasto);
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar gastos" + e.getMessage());
        }
        return lista;
    }
    
    public boolean agregar(Gasto gasto) throws Exception {
        
        gasto.toString();
        
        try {
            ConexionBD con = new ConexionBD();
         
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "insert into gasto(cod_gast, fecha_gast, monto_gast, desc_gast, cod_subcat, cod_int) values(seq_cost.nextval, SYSDATE, ?, ?, ?, ?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, gasto.getMontoGast());
            stmt.setString(2, gasto.getDescGast());
            stmt.setInt(3, gasto.getCodSubcat());
            stmt.setInt(4, gasto.getCodInt());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al agregar gasto" + e.getMessage());
            return false;
        }
    }
    
    //public static void main(String[] args) throws Exception {
    //    Gasto gasto = new Gasto();
    //    gasto.setCodInt(1);
    //    gasto.setCodSubcat(1);
    //    gasto.setDescGast("prueba");
    //    gasto.setMontoGast(50000);
    //    ControlGasto cgasto = new ControlGasto();
    //    System.out.println(cgasto.agregar(gasto));
    //}
    
    public boolean eliminar(int cod_gast) throws Exception {

        //trycatch+tab
        try {
            ConexionBD con = new ConexionBD();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "delete from gasto where cod_gast = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, cod_gast);

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al eliminar gasto" + e.getMessage());
            return false;
        }
    }
    
    public boolean actualizar(Gasto gasto) throws Exception {
        //trycatch+tab
        try {
            ConexionBD con = new ConexionBD();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "update gasto set desc_gast=?,monto_gast=?,cod_subcat=?,cod_int=? where cod_gast=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1,gasto.getDescGast());
            stmt.setInt(2,gasto.getMontoGast());
            stmt.setInt(3,gasto.getCodSubcat());
            stmt.setInt(4, gasto.getCodInt());
            stmt.setInt(5, gasto.getCodGast());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al actualizar gasto" + e.getMessage());
            return false;
        }
    }
    
    public Gasto obt_subcat(Gasto gasto,String desc_subcat) throws Exception {
    
    try {
        ConexionBD con = new ConexionBD();
        Connection cnx = ConexionBD.obtenerConexion();

        String query = "SELECT cod_subcat FROM subcategoria WHERE desc_subcat=?";
        PreparedStatement stmt = cnx.prepareStatement(query);
        stmt.setString(1, desc_subcat);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            gasto.setCodSubcat(rs.getInt("cod_subcat"));
            System.out.println("cod_subcat agregado"+gasto.toString());
            return  gasto;
        } else {
            // Manejar el caso en el que no se encontraron filas
            System.out.println("No se encontraron resultados para desc_subcat: " + desc_subcat);
        }

    } catch (SQLException e) {
        System.out.println("Error SQL al obtener cod_subcat: " + e.getMessage());
        // Puedes lanzar una excepción más específica aquí si es necesario
    } 
        return gasto;
    
    }
    
    
    public Gasto obt_int(Gasto gasto,String desc_int) throws Exception {

    try {
        ConexionBD con = new ConexionBD();
        Connection cnx = ConexionBD.obtenerConexion();

        String query = "SELECT cod_int FROM integrante WHERE desc_int=?";
        PreparedStatement stmt = cnx.prepareStatement(query);
        stmt.setString(1, desc_int);
        
        ResultSet rs = stmt.executeQuery();

        rs = stmt.executeQuery();

        if (rs.next()) {
            gasto.setCodInt(rs.getInt("cod_int")); 
            System.out.println("cod_int agregado"+gasto.toString());
            return gasto;
        } else {
            // Manejar el caso en el que no se encontraron filas
            System.out.println("No se encontraron resultados para desc_int: " + desc_int);
        }

    } catch (SQLException e) {
        System.out.println("Error SQL al obtener cod_int: " + e.getMessage());
        // Puedes lanzar una excepción más específica aquí si es necesario
    } 
        return gasto;
    
    }
    
    
}
      
    
