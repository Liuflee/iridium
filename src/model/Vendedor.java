package model;

/**
 *
 * @author Anette Villalón, Smolenks Aravena
 */
public class Vendedor {
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private String nombre;
    private int rut;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Vendedor() {
    }

    public Vendedor( String nombre, int rut) {
 
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

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }
//</editor-fold> 
}
