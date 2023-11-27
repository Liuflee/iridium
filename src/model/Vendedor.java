package model;

/**
 *
 * @author Anette Villalón, Smolenks Aravena
 */
public class Vendedor {
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private String nombre;
    private String rut;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Vendedor() {
    }

    public Vendedor( String nombre, String rut) {
 
        this.nombre = nombre;
        this.rut = rut;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getter & Setter">
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
//</editor-fold> 
}
