
package dao;

import interfaz.IGasto;
import java.util.ArrayList;
import modelo.ConexionBD;
import modelo.Gasto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JComboBox;

/**
 *
 * @author Calderón, Solorza, Urbina
 * @version 20/11/2023
 */
public class DAOGasto implements IGasto{

    public DAOGasto() {
    }
    
    @Override
    public ArrayList<Gasto> mostrar(int year,int mes,int codCat) throws Exception {
        
        ArrayList<Gasto> lista = new ArrayList<>();
        
        try {
            ConexionBD con = new ConexionBD();
            //Connection cnx = con.obtenerConexion();
            Connection cnx = ConexionBD.obtenerConexion();
            String query="";
            if (mes!=0 && year==0 && codCat==0) {
                query = "SELECT * FROM gasto WHERE EXTRACT(MONTH FROM fecha_gast) = ?";
                PreparedStatement stmt = cnx.prepareStatement(query);
                stmt.setInt(1, mes);
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
            }
            if (codCat!=0 && year==0 && mes==0) {
                query = "SELECT * FROM gasto g JOIN subcategoria s ON(s.cod_subcat = g.cod_subcat) "
                    + "AND EXTRACT(MONTH FROM fecha_gast) = EXTRACT(MONTH FROM SYSDATE) WHERE s.cod_cat = ?";
                PreparedStatement stmt = cnx.prepareStatement(query);
                stmt.setInt(1, codCat);
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
            }if (year!=0 && mes!=0 && codCat!=0) {
                query = "SELECT * FROM gasto g JOIN subcategoria s ON(s.cod_subcat = g.cod_subcat) "
                    + "AND EXTRACT(YEAR FROM fecha_gast)=? AND EXTRACT(MONTH FROM fecha_gast) = ? WHERE s.cod_cat = ?";
                PreparedStatement stmt = cnx.prepareStatement(query);
                stmt.setInt(1, year);
                stmt.setInt(2, mes);
                stmt.setInt(3, codCat);
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
            }if(year==0 && mes==0 & codCat==0){
                query = "SELECT * FROM gasto ";
                PreparedStatement stmt = cnx.prepareStatement(query);
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
            }
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar gastos" + e.getMessage());
        }
        return lista;
    }
    
    @Override
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
    
    @Override
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
    
    @Override
    public boolean actualizar(Gasto gasto) throws Exception {
        boolean flag=false;
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
            return flag=true;

        } catch (SQLException e) {
            System.out.println("Error SQL al actualizar gasto" + e.getMessage());
            return flag;
        }
    }
    
    @Override
    public ArrayList mostrarGastJoinSubcat(int year,int mes) throws Exception {
        
        ArrayList<Gasto> lista = new ArrayList<>();
        
        try {
            ConexionBD con = new ConexionBD();
            Connection cnx = ConexionBD.obtenerConexion();
            String query="";
            if (year!=0 && mes==0) {
                query = "SELECT g.cod_gast cod, g.fecha_gast fecha, s.desc_subcat subcat, g.desc_gast descri, g.monto_gast monto " +
                           "FROM gasto g JOIN subcategoria s ON (g.cod_subcat = s.cod_subcat) " +
                           " WHERE EXTRACT(YEAR FROM fecha_gast)=? " +
                           "ORDER BY g.fecha_gast DESC ";
                PreparedStatement stmt = cnx.prepareStatement(query);
                stmt.setInt(1, year);
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    Gasto ahorro = new Gasto();
                    ahorro.setCodGast(rs.getInt("cod"));
                    ahorro.setFechaGast(rs.getDate("fecha"));
                    ahorro.setDescSubcat(rs.getString("subcat"));
                    ahorro.setDescGast(rs.getString("descri"));
                    ahorro.setMontoGast(rs.getInt("monto"));
                    lista.add(ahorro);
                }
                rs.close();
                stmt.close();
                cnx.close();
            }
            if (mes!=0 && year!=0) {
                query = "SELECT g.cod_gast cod, g.fecha_gast fecha, s.desc_subcat subcat, g.desc_gast descri, g.monto_gast monto " +
                      "FROM gasto g JOIN subcategoria s ON (g.cod_subcat = s.cod_subcat) " +
                      "WHERE EXTRACT(YEAR FROM fecha_gast)=? AND EXTRACT(MONTH FROM fecha_gast)=? " +
                      "ORDER BY g.fecha_gast DESC";
                PreparedStatement stmt = cnx.prepareStatement(query);
                stmt.setInt(1, year);
                stmt.setInt(2, mes);
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    Gasto ahorro = new Gasto();
                    ahorro.setCodGast(rs.getInt("cod"));
                    ahorro.setFechaGast(rs.getDate("fecha"));
                    ahorro.setDescSubcat(rs.getString("subcat"));
                    ahorro.setDescGast(rs.getString("descri"));
                    ahorro.setMontoGast(rs.getInt("monto"));
                    lista.add(ahorro);
                }
                rs.close();
                stmt.close();
                cnx.close();
            }if(year==0 && mes==0){
                query = "SELECT g.cod_gast cod, g.fecha_gast fecha, s.desc_subcat subcat, g.desc_gast descri, g.monto_gast monto " +
                           "FROM gasto g JOIN subcategoria s ON (g.cod_subcat = s.cod_subcat) " +
                           "ORDER BY g.fecha_gast DESC";
                PreparedStatement stmt = cnx.prepareStatement(query);
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    Gasto ahorro = new Gasto();
                    ahorro.setCodGast(rs.getInt("cod"));
                    ahorro.setFechaGast(rs.getDate("fecha"));
                    ahorro.setDescSubcat(rs.getString("subcat"));
                    ahorro.setDescGast(rs.getString("descri"));
                    ahorro.setMontoGast(rs.getInt("monto"));
                    lista.add(ahorro);
                }
                rs.close();
                stmt.close();
                cnx.close();
            }
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar gastos" + e.getMessage());
        }
        
        return lista;
    }
    
    
    @Override
    public ArrayList mostrarGastJoinInt(int codCat,int codSubcat) throws Exception {
        
        ArrayList<Gasto> lista = new ArrayList<>();
        
        try {
            ConexionBD con = new ConexionBD();
            Connection cnx = ConexionBD.obtenerConexion();
            String query="";
            if (codSubcat!=0 && codCat!=0) {
                query =  "SELECT g.cod_gast cod, g.fecha_gast fecha, g.desc_gast descri, i.desc_int integrante, g.monto_gast monto " +
                            "FROM gasto g JOIN subcategoria s ON (s.cod_subcat = g.cod_subcat) " +
                            "JOIN integrante i ON (i.cod_int = g.cod_int) " +
                            "WHERE s.cod_cat = ? AND s.cod_subcat = ? " +
                            "AND EXTRACT(YEAR FROM SYSDATE)=EXTRACT(YEAR FROM g.fecha_gast)" +
                            "AND EXTRACT(MONTH FROM SYSDATE)=EXTRACT(MONTH FROM g.fecha_gast)" +
                            "ORDER BY g.fecha_gast DESC";
                PreparedStatement stmt = cnx.prepareStatement(query);
                stmt.setInt(1, codCat);
                stmt.setInt(2, codSubcat);
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    Gasto gasto = new Gasto();
                    gasto.setCodGast(rs.getInt("cod")); 
                    gasto.setFechaGast(rs.getDate("fecha"));
                    gasto.setDescGast(rs.getString("descri"));
                    gasto.setDesc_int(rs.getString("integrante"));
                    gasto.setMontoGast(rs.getInt("monto"));
                    lista.add(gasto);
                }
                rs.close();
                stmt.close();
            } if(codSubcat==0 && codCat!=0){
                query = "SELECT g.cod_gast cod, g.fecha_gast fecha, g.desc_gast descri, i.desc_int integrante, g.monto_gast monto " +
                            "FROM gasto g JOIN subcategoria s ON (s.cod_subcat = g.cod_subcat) " +
                            "JOIN integrante i ON (i.cod_int = g.cod_int) " +
                            "WHERE s.cod_cat = ? " +
                            "AND EXTRACT(YEAR FROM SYSDATE)=EXTRACT(YEAR FROM g.fecha_gast)" +
                            "AND EXTRACT(MONTH FROM SYSDATE)=EXTRACT(MONTH FROM g.fecha_gast)" +
                            "ORDER BY g.fecha_gast DESC";
                PreparedStatement stmt = cnx.prepareStatement(query);
                stmt.setInt(1, codCat);
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    Gasto gasto = new Gasto();
                    gasto.setCodGast(rs.getInt("cod")); 
                    gasto.setFechaGast(rs.getDate("fecha"));
                    gasto.setDescGast(rs.getString("descri"));
                    gasto.setDesc_int(rs.getString("integrante"));
                    gasto.setMontoGast(rs.getInt("monto"));
                    lista.add(gasto);
                }
                rs.close();
                stmt.close();
            }
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar gastos" + e.getMessage());
        }
        
        return lista;
    }
    
    @Override
    public Gasto obtenerCodSubcat(Gasto gasto,String desc_subcat) throws Exception {
    
        try {
            ConexionBD con = new ConexionBD();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "SELECT cod_subcat FROM subcategoria WHERE desc_subcat=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, desc_subcat);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                gasto.setCodSubcat(rs.getInt("cod_subcat"));
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
    
    
    @Override
    public Gasto obtenerGastoCodInt(Gasto gasto,String desc_int) throws Exception {

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
    
    @Override
    public int obtenerCodCat(String desc_cat) throws Exception {
        
    ConexionBD con = new ConexionBD();
    Connection cnx = ConexionBD.obtenerConexion();

    String query = "SELECT cod_cat FROM categoria WHERE desc_cat=?";
    PreparedStatement stmt = cnx.prepareStatement(query);
    stmt.setString(1, desc_cat);

    ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            return rs.getInt("cod_cat");
        } else {
            throw new Exception("No se encontró ninguna categoría con la descripción proporcionada");
        }
    }
    
    @Override
    public void RellenarComboCatSubcat(String tabla, String valor, JComboBox combo,int codcat){
        
        try {
        
        ConexionBD con = new ConexionBD();
        Connection cnx = ConexionBD.obtenerConexion();
        
        if(codcat==0){
            String query = "SELECT * FROM "+tabla;
            PreparedStatement stmt = cnx.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                combo.addItem(rs.getString(valor));
            }
        }if(codcat!=0){
            String query = "SELECT * FROM "+tabla+" where cod_cat = "+codcat;
            PreparedStatement stmt = cnx.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                combo.addItem(rs.getString(valor));
            }
        }
        } catch (Exception e) {
        }
       
    }
    
}
       
