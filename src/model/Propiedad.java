package model;

/**
 *
 * @author Sumir
 */
public class Propiedad {

    private String nombrePropiedad;
    private int habitaciones, precio, metrosCuadrados;
    private String direccion;
    private Vendedor vendedor;

    public Propiedad() {
    }

    public Propiedad(String nombrePropiedad, int habitaciones, int precio, int metrosCuadrados, String direccion, Vendedor vendedor) {

        this.nombrePropiedad = nombrePropiedad;
        this.habitaciones = habitaciones;
        this.precio = precio;
        this.metrosCuadrados = metrosCuadrados;
        this.direccion = direccion;
        this.vendedor = vendedor;
    }


    public String getNombrePropiedad() {
        return nombrePropiedad;
    }

    public void setNombrePropiedad(String nombrePropiedad) {
        this.nombrePropiedad = nombrePropiedad;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    
    
}
