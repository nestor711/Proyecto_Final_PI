
package Services;

import java.sql.*;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author Eider
 */
public class Fachada {

    private static Connection con = null;

    public static Connection getConnection() {
        try {
            if (con == null) {
                //Determina cuando se termina el programa
                Runtime.getRuntime().addShutdownHook(new MiShDwnHook());
                //Recupera los parámetros de conexión del archivo 
                //jdbc.properties
                ResourceBundle rb = ResourceBundle.getBundle("services.jdbc");
                String driver = rb.getString("driver");
                String url = rb.getString("url");
                String pwd = rb.getString("pwd");
                String usr = rb.getString("usr");

                Class.forName(driver);
                con = DriverManager.getConnection(url, usr, pwd);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error : "
                    + ex.getMessage());
        }
        return con;
    }

    static class MiShDwnHook extends Thread {

        //Justo antes de finaliza el programa la JVM invocará
        //este método donde podemos cerra la conexión
        @Override
        public void run() {
            try {
                Connection con = Fachada.getConnection();
                con.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error : "
                        + ex.getMessage());
            }
        }
    }
}
