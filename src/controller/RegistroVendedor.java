//<editor-fold defaultstate="collapsed" desc="Librerías y Paquetes">
package controller;
import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.Vendedor;
//</editor-fold>
/**
 *
 * @author Anette Villalón, Smolenks Aravena
 */
public class RegistroVendedor {
    //<editor-fold defaultstate="collapsed" desc="Agregar">

    /**
     * Recibe un vendedor, si no existe en la base de datos lo agrega.
     * @param vendedor
     */
    public void agregarVendedor(Vendedor vendedor) {
    Connection cnx = null;
    try {
        Conexion myConex = new Conexion();
        cnx = myConex.getConexion();

        cnx.setAutoCommit(false);

        String sqlVerificar = "SELECT COUNT(*) FROM vendedor WHERE rut = ?";
        try (PreparedStatement statementVerificar = cnx.prepareStatement(sqlVerificar)) {
            statementVerificar.setString(1, vendedor.getRut());
            ResultSet resultSet = statementVerificar.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);

            if (count > 0) {
                System.out.println("El vendedor ya existe en la base de datos.");
            } else {
            
                String sqlAgregar = "INSERT INTO vendedor (nombre_vendedor, rut) VALUES (?, ?)";
                try (PreparedStatement statementAgregar = cnx.prepareStatement(sqlAgregar)) {
                    statementAgregar.setString(1, vendedor.getNombre());
                    statementAgregar.setString(2, vendedor.getRut());
                    statementAgregar.executeUpdate();
                    System.out.println("Vendedor agregado correctamente.");
                }
            }
        }

        cnx.commit();
    } catch (SQLException e) {
        e.printStackTrace();
        try {
            if (cnx != null) {
                cnx.rollback();
            }
        } catch (SQLException ex) {
            System.out.println("Error al hacer rollback: " + ex.getMessage());
        }
    } finally {
       
        try {
            if (cnx != null && !cnx.isClosed()) {
                cnx.setAutoCommit(true); 
                cnx.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexión: " + ex.getMessage());
        }
    }
}

      
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Modificar">

    /**
     * Modifica los datos del vendedor según su rut
     * @param vendedor 
     */
    public void actualizarVendedor(Vendedor vendedor) {
    Connection cnx = null;
    try {
        Conexion myConex = new Conexion();
        cnx = myConex.getConexion();
        
        String sql = "UPDATE vendedor SET nombre_vendedor = ? WHERE rut = ?";
                     
        try (PreparedStatement statement = cnx.prepareStatement(sql)) {
            statement.setString(1, vendedor.getNombre());
            statement.setString(2, vendedor.getRut());

            statement.executeUpdate();
            System.out.println("Vendedor actualizado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
    } catch (Exception ex) {
        System.out.println("Error: " + ex.getMessage());
    } finally {
        // Cerrar la conexión
        try {
            if (cnx != null && !cnx.isClosed()) {
                cnx.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexión: " + ex.getMessage());
        }
    }
}
    
//</editor-fold>
}
