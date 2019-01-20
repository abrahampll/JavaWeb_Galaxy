package pe.edu.galaxy.trainigin.java.jd0.utilitario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {

    private static String driver = "oracle.jdbc.OracleDriver";
    private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private static String usuario = "jd010";
    private static String clave = "123456";

    public static boolean cargarDriver() {
        try {
            Class.forName(driver);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean cargarDriver(String driver) {
        try {
            BD.driver = driver;
            Class.forName(driver);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Connection conectar() {
        if (!cargarDriver()) {
            return null;
        }
        try {
            return DriverManager.getConnection(url, usuario, clave);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    public static Connection conectar(
            String url,
            String usuario,
            String clave) {
        if (!cargarDriver()) {
            return null;
        }
        try {
            BD.url=url;
            BD.usuario=usuario;
            BD.clave=clave;
            return DriverManager.getConnection(url, usuario, clave);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        

    }

    public static String getDriver() {
        return driver;
    }

    public static void setDriver(String driver) {
        BD.driver = driver;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        BD.url = url;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        BD.usuario = usuario;
    }

    public static String getClave() {
        return clave;
    }

    public static void setClave(String clave) {
        BD.clave = clave;
    }

}
