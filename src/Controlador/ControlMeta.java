
package Controlador;

import java.util.ArrayList;
import modelo.ConexionBD;
import modelo.Meta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author michimisimo
 */
public class ControlMeta {
    
    public ArrayList<Meta> mostrar() throws Exception {
        
        ArrayList<Meta> lista = new ArrayList<>();
        
        try {
            ConexionBD con = new ConexionBD();
            //Connection cnx = con.obtenerConexion();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "select * from META";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Meta meta = new Meta();
                meta.setCod_meta(rs.getInt("COD_META"));
                meta.setNombre_meta(rs.getString("NOMBRE_META"));
                meta.setMonto_meta(rs.getInt("MONTO_META"));
                meta.setCod_int(rs.getInt("COD_INT"));
                lista.add(meta);
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar metas" + e.getMessage());
        }
        return lista;
    }
    
    public boolean agregar(Meta meta) throws Exception {

        try {
            ConexionBD con = new ConexionBD();
         
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "insert into meta(nombre_meta, monto_meta, cod_int) values(?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, meta.getNombre_meta());
            stmt.setInt(2, meta.getMonto_meta());
            stmt.setInt(3, meta.getCod_int());

            stmt.executeUpdate();
            cnx.commit();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al agregar gasto" + e.getMessage());
            return false;
        }
    }
     
    public boolean eliminar(int cod_meta) throws Exception {

        //trycatch+tab
        try {
            ConexionBD con = new ConexionBD();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "delete from meta where cod_meta = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, cod_meta);

            stmt.executeUpdate();
            cnx.commit();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al eliminar gasto" + e.getMessage());
            return false;
        }
    }
    
    public boolean actualizar(Meta meta) throws Exception {
        //trycatch+tab
        try {
            ConexionBD con = new ConexionBD();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "update meta set nombre_meta=?,monto_meta=?,cod_int=? where cod_meta=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1,meta.getNombre_meta());
            stmt.setInt(2,meta.getMonto_meta());
            stmt.setInt(3,meta.getCod_int());
            stmt.setInt(4, meta.getCod_meta());

            stmt.executeUpdate();
            cnx.commit();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al actualizar gasto" + e.getMessage());
            return false;
        }
    }
    
}
