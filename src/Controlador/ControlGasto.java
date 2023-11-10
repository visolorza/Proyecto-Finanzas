
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

        try {
            ConexionBD con = new ConexionBD();
         
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "insert into gasto(monto_gast, desc_gast, cod_subcat, cod_int) values(?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, gasto.getMontoGast());
            stmt.setString(2, gasto.getDescGast());
            stmt.setInt(4, gasto.getCodSubcat());
            stmt.setInt(5, gasto.getCodInt());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al agregar gasto" + e.getMessage());
            return false;
        }
    }
    
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
    
}
