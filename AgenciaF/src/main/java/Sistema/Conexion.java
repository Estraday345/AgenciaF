
package Sistema;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion 
{
    

    Connection conexion = null;
    String user = "root";
    //Base de datos 
    String password="Yamaha18";
    String database="agencia_autos";

    String ip = "localhost";
    String puerto = "3306";

    String dir = "jdbc:mysql://" + ip + ":" + puerto + "/" + database;

    public Connection establecerConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(dir, user, password);

            System.out.println("Conexion Exitosa");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Conexion Fallida");

        }
        return conexion;
    }

    public void closeConnection() {
        try {
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {

        }
    }

}
