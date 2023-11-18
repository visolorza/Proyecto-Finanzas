
package controlador;

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

            String query = "insert into meta(cod_meta, nombre_meta, monto_meta, cod_int) values(seq_meta.nextval,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, meta.getNombre_meta());
            stmt.setInt(2, meta.getMonto_meta());
            stmt.setInt(3, meta.getCod_int());

            stmt.executeUpdate();
            stmt.close();
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
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al actualizar gasto" + e.getMessage());
            return false;
        }
    }
    
    public int obtenerCodigoMeta(String seleccionMeta) throws Exception {
        
        int codigoObtenido=0;
        try {
            ConexionBD con = new ConexionBD();
            //Connection cnx = con.obtenerConexion();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "SELECT * FROM meta WHERE nombre_meta=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1,seleccionMeta);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                codigoObtenido = rs.getInt("COD_META");
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar metas" + e.getMessage());
        }
        return codigoObtenido;
    }
    
    public Meta obt_int(Meta meta,String desc_int) throws Exception {

    try {
        ConexionBD con = new ConexionBD();
        Connection cnx = ConexionBD.obtenerConexion();

        String query = "SELECT cod_int FROM integrante WHERE desc_int=?";
        PreparedStatement stmt = cnx.prepareStatement(query);
        stmt.setString(1, desc_int);
        
        ResultSet rs = stmt.executeQuery();

        rs = stmt.executeQuery();

        if (rs.next()) {
            meta.setCod_int(rs.getInt("cod_int")); 
            System.out.println("cod_int agregado"+meta.toString());
            return meta;
        } else {
            // Manejar el caso en el que no se encontraron filas
            System.out.println("No se encontraron resultados para desc_int: " + desc_int);
        }

    } catch (SQLException e) {
        System.out.println("Error SQL al obtener cod_int: " + e.getMessage());
        // Puedes lanzar una excepción más específica aquí si es necesario
    } 

        return meta;
    }
    
}
