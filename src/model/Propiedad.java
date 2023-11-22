package model;

/**
 *
 * @author Anette Villalón, Smolenks Aravena
 */
public class Propiedad {
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private int codigo;
    private String nombrePropiedad;
    private int habitaciones, precio, metrosCuadrados;
    private String direccion, tipo;
    private Vendedor vendedor;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    

    public Propiedad(int codigo, String nombrePropiedad, int habitaciones, int precio, int metrosCuadrados, String direccion, String tipo, Vendedor vendedor) {
        this.codigo = codigo;
        this.nombrePropiedad = nombrePropiedad;
        this.habitaciones = habitaciones;
        this.precio = precio;
        this.metrosCuadrados = metrosCuadrados;
        this.direccion = direccion;
        this.tipo = tipo;
        this.vendedor = vendedor;
    }

    public Propiedad() {
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getter & Setter">
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
   //</editor-fold>  
}
