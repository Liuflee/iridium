package controller;
import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Vendedor;

public class RegistroVendedor {

    // Método para agregar un nuevo vendedor a la base de datos
    public void agregarVendedor(Vendedor vendedor) {
        Connection cnx = null;
        try {
            Conexion myConex = new Conexion();
            cnx = myConex.getConexion();
            
            String sql = "INSERT INTO vendedor (rut, nombre_vendedor) VALUES (?, ?)";

            try (PreparedStatement statement = cnx.prepareStatement(sql)) {
                
                System.out.println("VENDEDOR: " + vendedor.getRut());
                statement.setInt(1, vendedor.getRut());
                statement.setString(2, vendedor.getNombre());
                

     
                statement.executeUpdate();
                System.out.println("Vendedor agregado correctamente.");
            } catch (SQLException e) {
                e.printStackTrace(); 
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            try {
                if (cnx != null && !cnx.isClosed()) {
                    cnx.close(); // Cierra la conexión a la base de datos
                    System.out.println("Conexión cerrada.");
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexión: " + ex.getMessage());
            }
        }
    }
}
