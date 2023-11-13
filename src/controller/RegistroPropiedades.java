/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            
            String sql = "INSERT INTO propiedades (nombre_propiedad, nro_habitaciones, precio, metros_cuadrados, direccion, rut_vendedor) VALUES (?, ?, ?, ?, ?, ?)";

            try (PreparedStatement statement = cnx.prepareStatement(sql)) {
               
  
                statement.setString(1, propiedad.getNombrePropiedad());
                statement.setInt(2, propiedad.getHabitaciones());
                statement.setInt(3, propiedad.getPrecio());
                statement.setInt(4, propiedad.getMetrosCuadrados());
                statement.setString(5, propiedad.getDireccion());
                
                System.out.println(propiedad.getVendedor().getRut());
                
                statement.setInt(6, propiedad.getVendedor().getRut()); //AQUI QUIERO CONSEGUIR EL CODIGO, pero no existe, porque es autoincremental

     
                statement.executeUpdate();
                System.out.println("Propiedad agregada correctamente.");
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
          
            

        }}