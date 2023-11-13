package controller;
import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.Vendedor;


public class RegistroVendedor {
    // Método para agregar un nuevo vendedor a la base de datos si no existe
    public boolean agregarVendedor(Vendedor vendedor) {
        Connection cnx = null;
        try {
            Conexion myConex = new Conexion();
            cnx = myConex.getConexion();
            
            // Verificar si el vendedor ya existe en la base de datos
            String sqlVerificar = "SELECT COUNT(*) FROM vendedor WHERE rut = ?";
            try (PreparedStatement statementVerificar = cnx.prepareStatement(sqlVerificar)) {
                statementVerificar.setInt(1, vendedor.getRut());
                ResultSet resultSet = statementVerificar.executeQuery();
                resultSet.next();
                int count = resultSet.getInt(1);
                
                // Si el vendedor ya existe, no lo agregamos nuevamente
                if (count > 0) {
                    System.out.println("El vendedor ya existe en la base de datos.");
                    return false;
                }
            }

            // Si el vendedor no existe, lo agregamos a la base de datos
            String sqlAgregar = "INSERT INTO vendedor (nombre_vendedor, rut) VALUES (?, ?)";
            try (PreparedStatement statementAgregar = cnx.prepareStatement(sqlAgregar)) {
                statementAgregar.setString(1, vendedor.getNombre());
                statementAgregar.setInt(2, vendedor.getRut());
                statementAgregar.executeUpdate();
                System.out.println("Vendedor agregado correctamente.");
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
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
}