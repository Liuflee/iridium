//<editor-fold defaultstate="collapsed" desc="Librerías y Paquetes">
package bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//</editor-fold>
/**
 *
 * @author Anette Villalón, Smolenks Aravena
 */
public class Conexion {
    //<editor-fold defaultstate="collapsed" desc="Conectar">
    /**
     * Método para conectarse a la base de datos
     * @return 
     */
    public Connection getConexion() {
        Connection conex = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/iridium", "root", "root");
            System.out.println("Conexión exitosa");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return conex;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Desconectar">

    /**
     * Método para cerrar la conexión
     */
    public void cerrarConexion(Connection conexion) {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada");
            }
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexión: " + ex.getMessage());
        }
    }
        
//</editor-fold>
    
}
