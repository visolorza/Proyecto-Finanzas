package modelo;


import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author María José/ michimisimo
 */
public class ConexionBD {
 

    private static final String WALLET_PATH = "C:\\Users\\felip\\Downloads\\Wallet_HVTBZKZNLTAGAD9H";

    //en WALLET_PHAT se copia la ruta en la cual se encuentra la wallet (la wllet no debe estar en formato zip)
    private static final String WALLET_PASSWORD = "Basededatos123";
    private static final String JDBC_URL = "jdbc:oracle:thin:@hvtbzkznltagad9h_high";
    //aqui va el @"nombre base de datos"_high

    public static Connection obtenerConexion() throws Exception {
        // Configuración del wallet
        String trustStorePath = Paths.get(WALLET_PATH, "truststore.jks").toString();
        String keyStorePath = Paths.get(WALLET_PATH, "keystore.jks").toString();

        System.setProperty("oracle.net.tns_admin", WALLET_PATH);
        System.setProperty("javax.net.ssl.trustStore", trustStorePath);
        System.setProperty("javax.net.ssl.trustStorePassword", WALLET_PASSWORD);
        System.setProperty("javax.net.ssl.keyStore", keyStorePath);
        System.setProperty("javax.net.ssl.keyStorePassword", WALLET_PASSWORD);

        Properties properties = new Properties();
        properties.put("user", "ADMIN");
        properties.put("password", WALLET_PASSWORD);

        return DriverManager.getConnection(JDBC_URL, properties);
    }
    
}
