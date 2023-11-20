
package dao;

import interfaz.IAhorro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ConexionBD;
import modelo.Ahorro;

/**
 *
 * @author Calderón, Solorza, Urbina
 * @version 20/11/2023
 */
public class DAOAhorro implements IAhorro {
    
    @Override
    public ArrayList<Ahorro> mostrar(int cod_meta,int year,int mes) throws Exception {
        
        ArrayList<Ahorro> lista = new ArrayList<>();
        
        try {
            ConexionBD con = new ConexionBD();
            Connection cnx = ConexionBD.obtenerConexion();
            String query="";
            if (cod_meta!=0) {
                query = "SELECT * FROM ahorro WHERE cod_meta=?";
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
            }
            if (year!=0){
                query = "SELECT a.cod_ahor cod, a.fecha_ahor fecha, m.nombre_meta meta, a.monto_ahor monto " +
                        "FROM ahorro a JOIN meta m ON (a.cod_meta = m.cod_meta) " +
                        "WHERE EXTRACT(YEAR FROM fecha_ahor)=? " +
                        "ORDER BY a.fecha_ahor DESC";
                PreparedStatement stmt = cnx.prepareStatement(query);
                stmt.setInt(1, year);
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
            }
            if (mes!=0) {
                query = "SELECT a.cod_ahor cod, a.fecha_ahor fecha, m.nombre_meta meta, a.monto_ahor monto " +
                        "FROM ahorro a JOIN meta m ON (a.cod_meta = m.cod_meta) " +
                        "WHERE EXTRACT(YEAR FROM fecha_ahor)=? AND EXTRACT(MONTH FROM fecha_ahor)=? " +
                        "ORDER BY a.fecha_ahor DESC";
                PreparedStatement stmt = cnx.prepareStatement(query);
                stmt.setInt(1, year);
                stmt.setInt(2, mes);
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
            }
            if(cod_meta==0 && year==0 && mes==0){
                query = "select * from ahorro order by fecha_ahor desc";
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
            }
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar ahorro" + e.getMessage());
        }
        return lista;
    }
    
    @Override
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
    
    @Override
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
    
    @Override
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
    
    @Override   
    public ArrayList<Ahorro> mostrarAhorroJoinMeta() throws Exception {
        
        ArrayList<Ahorro> lista = new ArrayList<>();
        
        try {
            ConexionBD con = new ConexionBD();
            //Connection cnx = con.obtenerConexion();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "SELECT a.cod_ahor cod, a.fecha_ahor fecha, m.nombre_meta meta, a.monto_ahor monto " +
                           "FROM ahorro a JOIN meta m ON (a.cod_meta = m.cod_meta) " +
                           "ORDER BY a.fecha_ahor DESC";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Ahorro ahorro = new Ahorro();
                ahorro.setCod_ahorro(rs.getInt("cod"));
                ahorro.setFecha_ahorro(rs.getDate("fecha"));
                ahorro.setDesc_meta(rs.getString("meta"));
                ahorro.setMonto_ahorro(rs.getInt("monto"));
                lista.add(ahorro);
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar ahorro " + e.getMessage());
        }
        return lista;
    }
}
