package controller;
import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Propiedad;
import model.Vendedor;

/**
 *
 * @author Sumir
 */
public class RegistroPropiedades {
    
    public void agregarPropiedad(Propiedad propiedad) {
        
    Connection cnx = null;
    
    try {
        Conexion myConex = new Conexion();
        cnx = myConex.getConexion();

        String sql = "INSERT INTO propiedades (nombre_propiedad, nro_habitaciones, precio, metros_cuadrados, direccion, rut_vendedor, tipo) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = cnx.prepareStatement(sql)) {

            statement.setString(1, propiedad.getNombrePropiedad());
            statement.setInt(2, propiedad.getHabitaciones());
            statement.setInt(3, propiedad.getPrecio());
            statement.setInt(4, propiedad.getMetrosCuadrados());
            statement.setString(5, propiedad.getDireccion());
            statement.setInt(6, propiedad.getVendedor().getRut()); //AQUI QUIERO CONSEGUIR EL CODIGO, pero no existe, porque es autoincremental
            statement.setString(7, propiedad.getTipo());
            statement.executeUpdate();
          
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
        
    } catch (Exception ex) {
        System.out.println("Error: " + ex.getMessage());
    } finally {
        
        try {
            if (cnx != null && !cnx.isClosed()) {
                cnx.close(); // Cierra la conexión a la base de datos
            }
            
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexión: " + ex.getMessage());
        }
    }
}


    public void eliminarPropiedad(int codPropiedad) {

    Connection cnx = null;
    
    try {
        
        Conexion myConex = new Conexion();
        cnx = myConex.getConexion();

        String sql = "DELETE FROM propiedades WHERE cod_propiedad = ?";

        try (PreparedStatement statement = cnx.prepareStatement(sql)) {
            statement.setInt(1, codPropiedad);
            statement.executeUpdate();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

    } catch(Exception ex) {
        System.out.println(ex.getMessage());
    }  finally {
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
    
    public void actualizarPropiedad(Propiedad propiedad) {
        Connection cnx = null;
        try {
            Conexion myConex = new Conexion();
            cnx = myConex.getConexion();

            String sql = "UPDATE propiedades SET nombre_propiedad = ?, nro_habitaciones = ?, precio = ?, metros_cuadrados = ?, direccion = ? WHERE cod_propiedad = ?";

            try (PreparedStatement statement = cnx.prepareStatement(sql)) {
                statement.setString(1, propiedad.getNombrePropiedad());
                statement.setInt(2, propiedad.getHabitaciones());
                statement.setInt(3, propiedad.getPrecio());
                statement.setInt(4, propiedad.getMetrosCuadrados());
                statement.setString(5, propiedad.getDireccion());
                statement.setInt(6, propiedad.getCodigo()); // Código de la propiedad a actualizar

                statement.executeUpdate();
                System.out.println("Propiedad actualizada correctamente.");
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


    public ArrayList<Propiedad> obtenerDatosPropiedades() {
    ArrayList<Propiedad> listaPropiedades = new ArrayList<>();

    // Esta query es la que devuelve los datos para la tabla
    String sql = "SELECT p.cod_propiedad, p.nombre_propiedad, p.nro_habitaciones, p.metros_cuadrados, p.precio, p.direccion, v.nombre_vendedor, v.rut, p.tipo FROM propiedades p JOIN vendedor v ON (p.rut_vendedor = v.rut);";

    try {
        Conexion miConex = new Conexion();
        Connection cnx = miConex.getConexion();
        PreparedStatement pst = cnx.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            Propiedad propiedad = new Propiedad();
            Vendedor vendedor = new Vendedor();
            
            propiedad.setCodigo(rs.getInt(1));
            propiedad.setNombrePropiedad(rs.getString(2));
            propiedad.setHabitaciones(rs.getInt(3));
            propiedad.setMetrosCuadrados(rs.getInt(4));
            propiedad.setPrecio(rs.getInt(5));
            propiedad.setDireccion(rs.getString(6));
            vendedor.setNombre(rs.getString(7));
            vendedor.setRut(rs.getInt(8));
            propiedad.setTipo(rs.getString(9));
            propiedad.setVendedor(vendedor);

            listaPropiedades.add(propiedad);
        }

        miConex.cerrarConexion(cnx);

    } catch (SQLException ex) {
        System.out.println("Error SQL: " + ex.getMessage());
    } catch (Exception ex) {
        System.out.println("Error: " + ex.getMessage());
    }

    return listaPropiedades;
}


}