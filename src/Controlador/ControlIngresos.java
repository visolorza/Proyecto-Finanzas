
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ConexionBD;
import modelo.Ingresos;

/**
 *
 * @author michimisimo
 */
public class ControlIngresos {
    
    public ArrayList<Ingresos> mostrar() throws Exception {
        
        ArrayList<Ingresos> lista = new ArrayList<>();
        
        try {
            ConexionBD con = new ConexionBD();
            //Connection cnx = con.obtenerConexion();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "select * from Ingresos";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Ingresos ingresos = new Ingresos();
                ingresos.setCod_ing(rs.getInt("COD_ING"));
                ingresos.setFecha_ing(rs.getDate("FECHA_ING"));
                ingresos.setDesc_ing(rs.getString("DESC_ING"));
                ingresos.setMonto_ing(rs.getInt("MONTO_ING"));
                ingresos.setCod_int(rs.getInt("COD_INT"));
                lista.add(ingresos);
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar ingresos" + e.getMessage());
        }
        return lista;
    }
    
    public boolean agregar(Ingresos ingresos) throws Exception {

        try {
            ConexionBD con = new ConexionBD();
         
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "insert into ingreso(desc_ing, monto_ing, cod_int) values(?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, ingresos.getDesc_ing());
            stmt.setInt(2, ingresos.getMonto_ing());
            stmt.setInt(3, ingresos.getCod_int());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al agregar ingreso" + e.getMessage());
            return false;
        }
    }
    
    public boolean eliminar(int cod_ing) throws Exception {

        //trycatch+tab
        try {
            ConexionBD con = new ConexionBD();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "delete from ingreso where cod_ing = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, cod_ing);

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al eliminar ingreso" + e.getMessage());
            return false;
        }
    }
    
    public boolean actualizar(Ingresos ingresos) throws Exception {
        //trycatch+tab
        try {
            ConexionBD con = new ConexionBD();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "update gasto set desc_ing=?,monto_ing=?,cod_subcat=?,cod_int=? where cod_ing=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1,ingresos.getDesc_ing());
            stmt.setInt(2,ingresos.getMonto_ing());
            stmt.setInt(3, ingresos.getCod_int());
            stmt.setInt(4, ingresos.getCod_ing());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al actualizar ingreso" + e.getMessage());
            return false;
        }
    }
    
}
