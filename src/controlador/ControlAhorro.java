
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ConexionBD;
import modelo.Ahorro;

/**
 *
 * @author michimisimo
 */
public class ControlAhorro {
    
    public ArrayList<Ahorro> mostrar() throws Exception {
        
        ArrayList<Ahorro> lista = new ArrayList<>();
        
        try {
            ConexionBD con = new ConexionBD();
            //Connection cnx = con.obtenerConexion();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "select * from ahorro";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Ahorro ahorro = new Ahorro();
                ahorro.setCod_ahorro(rs.getInt("COD_AHOR"));
                ahorro.setFecha_ahorro(rs.getDate("FECHA_AHOR"));
                ahorro.setMonto_ahorro(rs.getInt("MONTO_AHOR"));
                ahorro.setCod_meta(rs.getInt("COD_META"));
                lista.add(ahorro);
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar ahorro" + e.getMessage());
        }
        return lista;
    }
    
    public boolean agregar(Ahorro ahorro) throws Exception {

        try {
            ConexionBD con = new ConexionBD();
         
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "insert into ahorro(cod_ahor, fecha_ahor, monto_ahor, cod_meta) values(seq_ahor.nextval,SYSDATE,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, ahorro.getMonto_ahorro());
            stmt.setInt(2, ahorro.getCod_meta());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al agregar ahorro" + e.getMessage());
            return false;
        }
    }
    
    public boolean eliminar(int cod_ahorro) throws Exception {

        //trycatch+tab
        try {
            ConexionBD con = new ConexionBD();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "delete from ahorro where cod_ahor = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, cod_ahorro);

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al eliminar ahorro" + e.getMessage());
            return false;
        }
    }
    
    public boolean actualizar(Ahorro ahorro) throws Exception {
        //trycatch+tab
        try {
            ConexionBD con = new ConexionBD();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "update ahorro set monto_ahor=?, cod_meta=? where cod_ahor=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1,ahorro.getMonto_ahorro());
            stmt.setInt(2,ahorro.getCod_meta());
            stmt.setInt(3, ahorro.getCod_ahorro());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al actualizar ahorro" + e.getMessage());
            return false;
        }
    }
    
    public ArrayList<Ahorro> mostrarAhorroPorMeta(int cod_meta) throws Exception {
        
        ArrayList<Ahorro> lista = new ArrayList<>();
        
        try {
            ConexionBD con = new ConexionBD();
            //Connection cnx = con.obtenerConexion();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "SELECT * FROM ahorro WHERE cod_meta=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, cod_meta);
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Ahorro ahorro = new Ahorro();
                ahorro.setCod_ahorro(rs.getInt("COD_AHOR"));
                ahorro.setFecha_ahorro(rs.getDate("FECHA_AHOR"));
                ahorro.setMonto_ahorro(rs.getInt("MONTO_AHOR"));
                ahorro.setCod_meta(rs.getInt("COD_META"));
                lista.add(ahorro);
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar ahorro" + e.getMessage());
        }
        return lista;
    }
    
    public Ahorro obt_meta(Ahorro ahorro,String nombre_meta) throws Exception {
    
    try {
        ConexionBD con = new ConexionBD();
        Connection cnx = ConexionBD.obtenerConexion();

        String query = "SELECT cod_meta FROM meta WHERE nombre_meta=?";
        PreparedStatement stmt = cnx.prepareStatement(query);
        stmt.setString(1, nombre_meta);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            ahorro.setCod_meta(rs.getInt("cod_meta"));
            System.out.println("cod_meta agregado "+ahorro.toString());
            return  ahorro;
        } else {
            // Manejar el caso en el que no se encontraron filas
            System.out.println("No se encontraron resultados para nombre_meta: " + nombre_meta);
        }

    } catch (SQLException e) {
        System.out.println("Error SQL al obtener cod_meta: " + e.getMessage());
        // Puedes lanzar una excepción más específica aquí si es necesario
    } 
        return ahorro;
    
    }
    
}
