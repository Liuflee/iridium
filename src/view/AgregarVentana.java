//<editor-fold defaultstate="collapsed" desc="Librerías y paquetes">
package view;
import controller.RegistroPropiedades;
import controller.RegistroVendedor;
import javax.swing.JOptionPane;
import model.Propiedad;
import model.Vendedor;
import validations.Validacion;
//</editor-fold>

/**
 *
 * @author Anette Villalón, Smolenks Aravena
 */

public class AgregarVentana extends javax.swing.JFrame {
    
    //<editor-fold defaultstate="collapsed" desc="Constructor y Variables">
    
    private VentanaPrincipal ventPrincipal;
    private String tipoPropiedad;

    public AgregarVentana(VentanaPrincipal ventPrincipal, String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
        this.ventPrincipal = ventPrincipal; 
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
//</editor-fold>
    // Código generado automaticamente
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtfNombrePropiedad = new javax.swing.JTextField();
        txtfDireccion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtfNombreVendedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtfHabitaciones = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtfPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtfRut = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtfMetros = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Nombre de la propiedad:");

        jLabel2.setText("Direccion:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre Vendedor:");

        jLabel6.setText("Cantidad de Habitaciones:");

        jLabel7.setText("Precio:");

        jLabel8.setText("Rut del vendedor:");

        jLabel3.setText("M2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(28, 28, 28))
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtfRut)
                                .addComponent(txtfHabitaciones)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtfNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfNombrePropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnAgregar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfNombrePropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfMetros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Verificaciones e input de datos
    //<editor-fold defaultstate="collapsed" desc="Acción de Agregar">
    /**
     * Verifica todos los campos y luego los agrega a la base de datos
     * @param evt 
     */
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombrePropiedad = txtfNombrePropiedad.getText();
        String direccion = txtfDireccion.getText();
        String habitacionesStr = txtfHabitaciones.getText();
        String precioStr = txtfPrecio.getText();
        String metrosStr = txtfMetros.getText();
        String nombreVendedor = txtfNombreVendedor.getText();
        String rutVendedorStr = txtfRut.getText();

        if (Validacion.camposVacios(nombrePropiedad, direccion, habitacionesStr, precioStr, metrosStr, nombreVendedor, rutVendedorStr)) {
            Validacion.mostrarError("Todos los campos son obligatorios");
            return;
        }

        if (!Validacion.nombreSoloLetras(nombreVendedor)) {
            Validacion.mostrarError("El nombre solo puede contener letras y espacios");
            return;
        }

        if (!Validacion.validarNumeros(habitacionesStr, precioStr, metrosStr)) {
            Validacion.mostrarError("Los campos de números deben contener valores válidos");
            return;
        }

        if (!Validacion.validarRut(rutVendedorStr)) {
            Validacion.mostrarError("El RUT ingresado no es válido");
            return;
        }

        int habitaciones = Integer.parseInt(habitacionesStr);
        int precio = Integer.parseInt(precioStr);
        int metrosCuadrados = Integer.parseInt(metrosStr);
        

        try {
            // Crea un nueva propiedad y vendedor, los añade con el registro y actualiza la tabla de la ventana principal
            Vendedor vendedor = new Vendedor();
            vendedor.setNombre(nombreVendedor);
            vendedor.setRut(rutVendedorStr);

            Propiedad propiedad = new Propiedad();
            propiedad.setNombrePropiedad(nombrePropiedad);
            propiedad.setDireccion(direccion);
            propiedad.setHabitaciones(habitaciones);
            propiedad.setMetrosCuadrados(metrosCuadrados);
            propiedad.setPrecio(precio);
            propiedad.setVendedor(vendedor);
            propiedad.setTipo(tipoPropiedad);

            RegistroVendedor registroVendedor = new RegistroVendedor();
            registroVendedor.agregarVendedor(vendedor);

            RegistroPropiedades registroPropiedad = new RegistroPropiedades();
            registroPropiedad.agregarPropiedad(propiedad);
            ventPrincipal.actualizar();
            Validacion.mostrarExito("Propiedad añadida con éxito");
            dispose();

        } catch (NumberFormatException ex) {
            Validacion.mostrarError("Los campos de números deben contener valores válidos");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

//</editor-fold>
    // Componentes de Java Swing
    //<editor-fold defaultstate="collapsed" desc="Declaración de componentes">
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtfDireccion;
    private javax.swing.JTextField txtfHabitaciones;
    private javax.swing.JTextField txtfMetros;
    private javax.swing.JTextField txtfNombrePropiedad;
    private javax.swing.JTextField txtfNombreVendedor;
    private javax.swing.JTextField txtfPrecio;
    private javax.swing.JTextField txtfRut;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
