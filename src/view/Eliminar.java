//<editor-fold defaultstate="collapsed" desc="Librerías y Paquetes">


package view;
import controller.RegistroPropiedades;
import javax.swing.JOptionPane;
//</editor-fold>
/**
 *
 * @author Anette Villalón, Smolenks Aravena
 */
public class Eliminar extends javax.swing.JFrame {
    //<editor-fold defaultstate="collapsed" desc="Constructor y variables">
    

    private VentanaPrincipal ventPrincipal; // Recibe la ventana principal, para actualizar la tabla
    
    public Eliminar(VentanaPrincipal ventPrincipal) {
        this.ventPrincipal = ventPrincipal;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    //</editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfCodigo = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese codigo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //<editor-fold defaultstate="collapsed" desc="Acción de eliminar">
    

    /**
     * Recibe un codigo, manda un JPane para confirmar, y si confirma 
     * elimina la propiedad con el registro y actualiza la tabla principal
     * @param evt 
     */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        String codStr = txtfCodigo.getText();
        
        int codigoPropiedad = Integer.parseInt(codStr);
        int opcion = JOptionPane.showConfirmDialog(this, "¿Estás segurx de que quieres eliminar?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            RegistroPropiedades registro = new RegistroPropiedades();
            registro.eliminarPropiedad(codigoPropiedad);
        }
        
        ventPrincipal.actualizar();
        dispose();
    }//GEN-LAST:event_btnEliminarActionPerformed
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Componentes de Swing">
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtfCodigo;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
