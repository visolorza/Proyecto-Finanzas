
package dao;

import interfaz.IIngreso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ConexionBD;
import modelo.Ingreso;

/**
 *
 * @author Calderón, Solorza, Urbina
 * @version 20/11/2023
 */
public class DAOIngreso implements IIngreso {
    
    @Override
    public ArrayList<Ingreso> mostrar(int year,int mes) throws Exception {
        
        ArrayList<Ingreso> lista = new ArrayList<>();
        
        try {
            ConexionBD con = new ConexionBD();
            Connection cnx = ConexionBD.obtenerConexion();
            String query="";
            if (year!=0 && mes==0) {
                query = "SELECT * FROM ingreso WHERE EXTRACT(YEAR FROM fecha_ing)=?";
                PreparedStatement stmt = cnx.prepareStatement(query);
                stmt.setInt(1, year);
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    Ingreso ingresos = new Ingreso();
                    ingresos.setCod_ing(rs.getInt("COD_ING"));
                    ingresos.setFecha_ing(rs.getDate("FECHA_ING"));
                    ingresos.setDesc_ing(rs.getString("DESC_ING"));
                    ingresos.setMonto_ing(rs.getInt("MONTO_ING"));
                    ingresos.setCod_int(rs.getInt("COD_INT"));
                    lista.add(ingresos);
                }
                rs.close();
                stmt.close();
            }
            if (mes!=0 && year!=0) {
                query = "SELECT * FROM ingreso WHERE EXTRACT(MONTH FROM fecha_ing)= ? AND "
                        + "EXTRACT(YEAR FROM fecha_ing)= ?";
                PreparedStatement stmt = cnx.prepareStatement(query);
                stmt.setInt(1, mes);
                stmt.setInt(2, year);
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    Ingreso ingresos = new Ingreso();
                    ingresos.setCod_ing(rs.getInt("COD_ING"));
                    ingresos.setFecha_ing(rs.getDate("FECHA_ING"));
                    ingresos.setDesc_ing(rs.getString("DESC_ING"));
                    ingresos.setMonto_ing(rs.getInt("MONTO_ING"));
                    ingresos.setCod_int(rs.getInt("COD_INT"));
                    lista.add(ingresos);
                }
                rs.close();
                stmt.close();
               
            }
            if(year==0 && mes==0){
                query = "select * from Ingreso order by fecha_ing desc";
                PreparedStatement stmt = cnx.prepareStatement(query);
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    Ingreso ingresos = new Ingreso();
                    ingresos.setCod_ing(rs.getInt("COD_ING"));
                    ingresos.setFecha_ing(rs.getDate("FECHA_ING"));
                    ingresos.setDesc_ing(rs.getString("DESC_ING"));
                    ingresos.setMonto_ing(rs.getInt("MONTO_ING"));
                    ingresos.setCod_int(rs.getInt("COD_INT"));
                    lista.add(ingresos);
                }
                rs.close();
                stmt.close();
            }
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar ingresos" + e.getMessage());
        }
        return lista;
    }
    
    @Override
    public boolean agregar(Ingreso ingresos) throws Exception {

        try {
            ConexionBD con = new ConexionBD();
         
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "insert into ingreso(cod_ing, fecha_ing, desc_ing, monto_ing, cod_int) values(seq_ing.nextval, SYSDATE, ?, ?, ?)";
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
    
    @Override
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
    
    @Override
    public boolean actualizar(Ingreso ingresos) throws Exception {
        //trycatch+tab
        try {
            ConexionBD con = new ConexionBD();
            Connection cnx = ConexionBD.obtenerConexion();

            String query = "update ingreso set desc_ing=?, monto_ing=?, cod_int=? where cod_ing=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1,ingresos.getDesc_ing());
            stmt.setInt(2, ingresos.getMonto_ing());
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
    
    @Override
    public Ingreso obtenerIngresoCodInt(Ingreso ingreso,String desc_int) throws Exception {

    try {
        ConexionBD con = new ConexionBD();
        Connection cnx = ConexionBD.obtenerConexion();

        String query = "SELECT cod_int FROM integrante WHERE desc_int=?";
        PreparedStatement stmt = cnx.prepareStatement(query);
        stmt.setString(1, desc_int);
        
        ResultSet rs = stmt.executeQuery();

        rs = stmt.executeQuery();

        if (rs.next()) {
            ingreso.setCod_int(rs.getInt("cod_int")); 
            System.out.println("cod_int agregado"+ingreso.toString());
            return ingreso;
        } else {
            // Manejar el caso en el que no se encontraron filas
            System.out.println("No se encontraron resultados para desc_int: " + desc_int);
        }
    } catch (SQLException e) {
        System.out.println("Error SQL al obtener cod_int: " + e.getMessage());
        // Puedes lanzar una excepción más específica aquí si es necesario
    } 
        return ingreso;
    }
}
