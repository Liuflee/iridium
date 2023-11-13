/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import bd.Conexion;
import controller.RegistroPropiedades;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sumir
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalVariante
     */
    public VentanaPrincipal() {
        initComponents();
        actualizar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtfBusqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePropiedades = new javax.swing.JTable();
        btnEliminarSelected = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAgregar = new javax.swing.JMenu();
        mniAgregarCasa = new javax.swing.JMenuItem();
        mniAgregarDpto = new javax.swing.JMenuItem();
        menuModificar = new javax.swing.JMenu();
        menuEliminar = new javax.swing.JMenu();
        mnuiEliminar = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();
        probarConexion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lista de propiedades:");

        btnBuscar.setText("Buscar");

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(583, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnActualizar)))
        );

        tablePropiedades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Tipo", "Habitaciones", "M2", "Precio", "Dirección", "Vendedor(a)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablePropiedades);

        btnEliminarSelected.setText("Eliminar");
        btnEliminarSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSelectedActionPerformed(evt);
            }
        });

        menuAgregar.setText("Añadir");

        mniAgregarCasa.setText("Añadir Casa");
        mniAgregarCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarCasaActionPerformed(evt);
            }
        });
        menuAgregar.add(mniAgregarCasa);

        mniAgregarDpto.setText("Añadir Departamento");
        mniAgregarDpto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarDptoActionPerformed(evt);
            }
        });
        menuAgregar.add(mniAgregarDpto);

        jMenuBar1.add(menuAgregar);

        menuModificar.setText("Modificar");
        jMenuBar1.add(menuModificar);

        menuEliminar.setText("Eliminar");
        menuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarActionPerformed(evt);
            }
        });

        mnuiEliminar.setText("Eliminar por codigo");
        mnuiEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiEliminarActionPerformed(evt);
            }
        });
        menuEliminar.add(mnuiEliminar);

        jMenuBar1.add(menuEliminar);

        menuSalir.setText("Salir");
        jMenuBar1.add(menuSalir);

        probarConexion.setText("Probar");
        probarConexion.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                probarConexionMenuSelected(evt);
            }
        });
        jMenuBar1.add(probarConexion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminarSelected)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarSelected)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void actualizar() {
                
        // Esta query es la que devuelve los datos para la tabla
        String sql = "SELECT p.cod_propiedad, p.nombre_propiedad, p.nro_habitaciones, p.metros_cuadrados, p.precio, p.direccion, v.nombre_vendedor FROM propiedades p JOIN vendedor v ON (p.rut_vendedor = v.rut);";
        try{
            Conexion miConex = new Conexion();
            Connection cnx = miConex.getConexion();
            PreparedStatement pst = cnx.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) tablePropiedades.getModel();
            model.setRowCount(0);
             
            while(rs.next()) {
                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), "", rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7)}); 
                //ACA VAN LOS DATOS EL INDICE INDICA LA POSICION EN LA QUERY 
            }
            
            miConex.cerrarConexion(cnx);
            
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
        
    }
    
    private void mniAgregarCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarCasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniAgregarCasaActionPerformed

    private void probarConexionMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_probarConexionMenuSelected
        // TODO add your handling code here:
        try{
            Conexion myConex = new Conexion();
            Connection cnx = myConex.getConexion();
        }catch(Exception ex){
            System.out.println("Error: "+ ex.getMessage());
        }
    }//GEN-LAST:event_probarConexionMenuSelected

    private void mniAgregarDptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarDptoActionPerformed
        // TODO add your handling code here:
        AgregarVentana ventanaAgregar = new AgregarVentana(this);
        int x = getX() + (getWidth() - ventanaAgregar.getWidth()) / 2;
        int y = getY() + (getHeight() - ventanaAgregar.getHeight()) / 2;

        ventanaAgregar.setLocation(x, y);
        ventanaAgregar.setVisible(true);
        ventanaAgregar.setVisible(true);
    }//GEN-LAST:event_mniAgregarDptoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();  
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void mnuiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiEliminarActionPerformed
        // TODO add your handling code here:
        Eliminar eliminar = new Eliminar();
        eliminar.setVisible(true);
    }//GEN-LAST:event_mnuiEliminarActionPerformed

    private void menuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_menuEliminarActionPerformed

    private void btnEliminarSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSelectedActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tablePropiedades.getSelectedRow();
        int codSeleccionado = (int) tablePropiedades.getValueAt(filaSeleccionada, 0);
        RegistroPropiedades registro = new RegistroPropiedades();
        registro.eliminarPropiedad(codSeleccionado);
        btnActualizarActionPerformed(evt);
        
    }//GEN-LAST:event_btnEliminarSelectedActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminarSelected;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menuAgregar;
    private javax.swing.JMenu menuEliminar;
    private javax.swing.JMenu menuModificar;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JMenuItem mniAgregarCasa;
    private javax.swing.JMenuItem mniAgregarDpto;
    private javax.swing.JMenuItem mnuiEliminar;
    private javax.swing.JMenu probarConexion;
    private javax.swing.JTable tablePropiedades;
    private javax.swing.JTextField txtfBusqueda;
    // End of variables declaration//GEN-END:variables
}