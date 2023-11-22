//<editor-fold defaultstate="collapsed" desc="Librerías y Paquetes">
package view;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDraculaIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatMonokaiProIJTheme;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import controller.RegistroPropiedades;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Propiedad;
import model.Vendedor;

//</editor-fold>

/**
 *
 * @author Anette Villalón, Smolenks Aravena
 */

public class VentanaPrincipal extends javax.swing.JFrame {
    
    //<editor-fold defaultstate="collapsed" desc="Constructor y Variables">
    RegistroPropiedades reg = new RegistroPropiedades();

    public VentanaPrincipal() {
        initComponents();
        actualizar();
        
        jButton1.requestFocusInWindow(); // Cambia el focus a un boton invisible para que la barra de busqueda no tenga el focus
        
        // Verifica si la barra de busqueda tiene focus y pone un "placeholder"
        
        txtfBusqueda.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            if(txtfBusqueda.getText().equals("Ingrese codigo de propiedad:")) {
                txtfBusqueda.setText("");
            }
        }

        public void focusLost(java.awt.event.FocusEvent evt) {
            if(txtfBusqueda.getText().equals("")) {
                txtfBusqueda.setText("Ingrese codigo de propiedad:");
                txtfBusqueda.setForeground(new Color(153, 153, 153));
            }
        }
    });
    
    // Placeholder inicial
    txtfBusqueda.setText("Ingrese codigo de propiedad:");
    txtfBusqueda.setForeground(new Color(153, 153, 153));
    tablePropiedades.setAutoCreateRowSorter(true);
    }
        
    @SuppressWarnings("unchecked")
    //</editor-fold>
    // Codigo generado automaticamente por Swing
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablePropiedades = new javax.swing.JTable();
        btnEliminarSelected = new javax.swing.JButton();
        txtfBusqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cboxFiltrado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAgregar = new javax.swing.JMenu();
        mniAgregarCasa = new javax.swing.JMenuItem();
        mniAgregarDpto = new javax.swing.JMenuItem();
        menuModificar = new javax.swing.JMenu();
        mnuiModificar = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenu();
        mnuiEliminar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnuiDracula = new javax.swing.JMenuItem();
        mnuiLight = new javax.swing.JMenuItem();
        mnuiMonokai = new javax.swing.JMenuItem();
        mnuiDefault = new javax.swing.JMenuItem();
        mnuiCat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tablePropiedades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Tipo", "Habitaciones", "m²", "Precio", "Dirección", "Vendedorx", "RUT Vendedorx"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePropiedades.setName(""); // NOI18N
        jScrollPane2.setViewportView(tablePropiedades);

        btnEliminarSelected.setText("Eliminar");
        btnEliminarSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSelectedActionPerformed(evt);
            }
        });

        jLabel1.setText("Lista de propiedades:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cboxFiltrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Departamento", "Casa" }));
        cboxFiltrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxFiltradoActionPerformed(evt);
            }
        });

        jLabel2.setText("Filtrar por:");

        jMenuBar1.setBorder(null);

        menuAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2891642 (1).png"))); // NOI18N
        menuAgregar.setText("Añadir");

        mniAgregarCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5988246.png"))); // NOI18N
        mniAgregarCasa.setText("Añadir Casa");
        mniAgregarCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarCasaActionPerformed(evt);
            }
        });
        menuAgregar.add(mniAgregarCasa);

        mniAgregarDpto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2651136.png"))); // NOI18N
        mniAgregarDpto.setText("Añadir Departamento");
        mniAgregarDpto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarDptoActionPerformed(evt);
            }
        });
        menuAgregar.add(mniAgregarDpto);

        jMenuBar1.add(menuAgregar);

        menuModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2824443_pen_pencil_school_stationery_icon.png"))); // NOI18N
        menuModificar.setText("Modificar");

        mnuiModificar.setText("Modificar Seleccionado");
        mnuiModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiModificarActionPerformed(evt);
            }
        });
        menuModificar.add(mnuiModificar);

        jMenuBar1.add(menuModificar);

        menuEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3859126_app_bin_delete_interface_recycle_icon.png"))); // NOI18N
        menuEliminar.setText("Eliminar");

        mnuiEliminar.setText("Eliminar por codigo");
        mnuiEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiEliminarActionPerformed(evt);
            }
        });
        menuEliminar.add(mnuiEliminar);

        jMenuBar1.add(menuEliminar);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4324289 (1).png"))); // NOI18N
        jMenu1.setText("Cambiar Tema");

        mnuiDracula.setText("Dracula");
        mnuiDracula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiDraculaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuiDracula);

        mnuiLight.setText("Light");
        mnuiLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiLightActionPerformed(evt);
            }
        });
        jMenu1.add(mnuiLight);

        mnuiMonokai.setText("Monokai");
        mnuiMonokai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiMonokaiActionPerformed(evt);
            }
        });
        jMenu1.add(mnuiMonokai);

        mnuiDefault.setText("Por Defecto");
        mnuiDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiDefaultActionPerformed(evt);
            }
        });
        jMenu1.add(mnuiDefault);

        mnuiCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Png (1).png"))); // NOI18N
        mnuiCat.setText("?");
        mnuiCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiCatActionPerformed(evt);
            }
        });
        jMenu1.add(mnuiCat);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminarSelected))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBuscar))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cboxFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnActualizar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar)
                    .addComponent(btnBuscar)
                    .addComponent(cboxFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarSelected)
                    .addComponent(btnLimpiar))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Funciones para mostrar los datos de la tabla
    //<editor-fold defaultstate="collapsed" desc="Tabla y datos">
    
    /**
     * Esta funcion muestra los datos de la tabla y posteriormente los centra con CellRenderer
     */
    public void actualizar() {
        int codPropiedad, nroHabitaciones, metrosCuadrados, precio, rutVendedor;
        String nombrePropiedad, direccion, nombreVendedor, tipo;

        DefaultTableModel modelo = (DefaultTableModel) this.tablePropiedades.getModel();

        modelo.setRowCount(0);
        ArrayList<Propiedad> listaPropiedades = reg.obtenerDatosPropiedades();

        for (Propiedad propiedad : listaPropiedades) {
            codPropiedad = propiedad.getCodigo();
            nombrePropiedad = propiedad.getNombrePropiedad();
            nroHabitaciones = propiedad.getHabitaciones();
            metrosCuadrados = propiedad.getMetrosCuadrados();
            tipo = propiedad.getTipo();
            precio = propiedad.getPrecio();
            direccion = propiedad.getDireccion();

            Vendedor vendedor = propiedad.getVendedor();
            nombreVendedor = vendedor.getNombre();
            rutVendedor = vendedor.getRut();

            modelo.addRow(new Object[]{codPropiedad, nombrePropiedad, tipo , nroHabitaciones, metrosCuadrados, precio, direccion, nombreVendedor, rutVendedor});
        
        //Centrado de los datos
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < 9; i++) {
            tablePropiedades.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        }
}
    
    /**
     * Esta función consigue los datos de la fila seleccionada
     * @return Un array con los datos de la fila seleccionada
     */
    public Object[] getDatos() {
        
        int filaSeleccionada = tablePropiedades.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tablePropiedades.getModel();
        int numColumnas = modelo.getColumnCount();
        Object[] datosFila = new Object[numColumnas];

        for (int i = 0; i < numColumnas; i++) {
            datosFila[i] = modelo.getValueAt(filaSeleccionada, i);
        }
    
        return datosFila;
    }
//</editor-fold>
    // Creación de las ventanas con sus respectivos eventos
    //<editor-fold defaultstate="collapsed" desc="Ventanas">
    
    /**
     * Posiciona la ventana en el centro y la hace visible
     * @param ventana 
     */
    private void abrirVentana(JFrame ventana) { 
        int x = getX() + (getWidth() - ventana.getWidth()) / 2;
        int y = getY() + (getHeight() - ventana.getHeight()) / 2;
        ventana.setLocation(x, y);
        ventana.setVisible(true);
    }
    /**
     * Recibe un string con el tipo de propiedad para hacer la diferenciacion de tipos 
     * en la base de datos
     * @param tipoPropiedad 
     */
    private void crearAgregar(String tipoPropiedad) {
        AgregarVentana ventanaAgregar = new AgregarVentana(this, tipoPropiedad);
        abrirVentana(ventanaAgregar);
    }
    
    private void mniAgregarCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarCasaActionPerformed
        crearAgregar("Casa");
    }//GEN-LAST:event_mniAgregarCasaActionPerformed
  
    private void mniAgregarDptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarDptoActionPerformed
        crearAgregar("Departamento");
    }//GEN-LAST:event_mniAgregarDptoActionPerformed

    private void mnuiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiEliminarActionPerformed
    Eliminar eliminar = new Eliminar(this);
    abrirVentana(eliminar);
    }//GEN-LAST:event_mnuiEliminarActionPerformed
    
    /**
     * Este evento verifica que haya un fila seleccionada, luego elimina esos datos en la base de datos
     * @param evt 
     */
    private void btnEliminarSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSelectedActionPerformed

        int filaSeleccionada = tablePropiedades.getSelectedRow();
        if (filaSeleccionada != -1) { 

            UIManager.put("OptionPane.yesButtonText", "Sí");
            UIManager.put("OptionPane.noButtonText", "No");
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres eliminar esta fila?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                int codSeleccionado = (int) tablePropiedades.getValueAt(filaSeleccionada, 0);
                RegistroPropiedades registro = new RegistroPropiedades();
                registro.eliminarPropiedad(codSeleccionado);
                actualizar();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila para eliminar.", "Ninguna fila seleccionada", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarSelectedActionPerformed

    private void mnuiModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiModificarActionPerformed

        int filaSeleccionada = tablePropiedades.getSelectedRow();
        if (filaSeleccionada != -1) { // Verifica si hay una fila seleccionada
            Object[] datos = this.getDatos();
            ModificarVentana ventanaMod = new ModificarVentana(datos, this);
            abrirVentana(ventanaMod);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila para modificar.", "Ninguna fila seleccionada", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_mnuiModificarActionPerformed
    
        
//</editor-fold>
    // Temas que utiliza el sistema y los eventos asociados
    //<editor-fold defaultstate="collapsed" desc="Cambios de tema">
    
        /**
     * Cambia el tema principal del programa, y actualiza la ventana
     * @param tema Recibe el LookAndFeel del sistema
     */
    private void cambiarTema(LookAndFeel tema) {
        try {
            UIManager.setLookAndFeel(tema);
            SwingUtilities.updateComponentTreeUI(this);
            this.actualizarTemas(tema);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void actualizarTemas(LookAndFeel tema) {
    Frame[] ventanas = Frame.getFrames();
    for (Frame ventana : ventanas) {
        if (ventana != null && ventana.isDisplayable()) {
            SwingUtilities.updateComponentTreeUI(ventana);
        }
    }
}

    private void mnuiDraculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiDraculaActionPerformed
        cambiarTema(new FlatDraculaIJTheme());  
    }//GEN-LAST:event_mnuiDraculaActionPerformed

    private void mnuiLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiLightActionPerformed
        cambiarTema(new FlatMacLightLaf());
    }//GEN-LAST:event_mnuiLightActionPerformed

    private void mnuiMonokaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiMonokaiActionPerformed
        cambiarTema(new FlatMonokaiProIJTheme());
    }//GEN-LAST:event_mnuiMonokaiActionPerformed

    private void mnuiDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiDefaultActionPerformed
        cambiarTema(new FlatDarkPurpleIJTheme());
    }//GEN-LAST:event_mnuiDefaultActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed
    
     
    //</editor-fold>
    // Barra de busqueda y filtrado
    //<editor-fold defaultstate="collapsed" desc="Filtrado">
    
    /**
     * Consigue el texto del txtfield de busqueda y crea un sorter de la tabla, luego verifica si el campo
     * está vacio o tiene el texto del placeholder, y filtra la tabla según el codigo ingresado por el usuario
     * @param evt 
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        String codigoBuscado = txtfBusqueda.getText();

        DefaultTableModel modelo = (DefaultTableModel) tablePropiedades.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
        tablePropiedades.setRowSorter(sorter);


        if (!codigoBuscado.equals("Ingrese codigo de propiedad:")) {
            if (!codigoBuscado.isEmpty()) {
                try {
                    int codigo = Integer.parseInt(codigoBuscado); 
                    RowFilter<DefaultTableModel, Object> filter = RowFilter.regexFilter("^" + codigo + "$", 0);

                    sorter.setRowFilter(filter); 
                } catch (NumberFormatException e) {
                    
                    JOptionPane.showMessageDialog(this, "Ingrese un código válido", "Error", JOptionPane.ERROR_MESSAGE);
                    sorter.setRowFilter(null); 
                }
            } else {
                sorter.setRowFilter(null); 
            }
        } else {
            sorter.setRowFilter(null);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tablePropiedades.getModel();
        modelo.setRowCount(0); // Elimina todas las filas de la tabla
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void mnuiCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiCatActionPerformed

        Random random = new Random();
        int maxX = this.getWidth() - 200; 
        int maxY = this.getHeight() - 200; 

        // Mueve los botones y el campo de texto a posiciones aleatorias
        btnEliminarSelected.setLocation(random.nextInt(maxX), random.nextInt(maxY));
        btnLimpiar.setLocation(random.nextInt(maxX), random.nextInt(maxY));
        btnActualizar.setLocation(random.nextInt(maxX), random.nextInt(maxY));
        btnBuscar.setLocation(random.nextInt(maxX), random.nextInt(maxY));
        txtfBusqueda.setLocation(random.nextInt(maxX), random.nextInt(maxY));
        jLabel1.setLocation(random.nextInt(maxX), random.nextInt(maxY));
        cboxFiltrado.setLocation(random.nextInt(maxX), random.nextInt(maxY));
        jLabel2.setLocation(random.nextInt(maxX), random.nextInt(maxY));

    }//GEN-LAST:event_mnuiCatActionPerformed
    /**
     * Recibe el criterio del item seleccionado del combobox,
     * crea un Sorter de la tabla y luego filtra según elcriterio seleccionado
     * @param evt 
     */
    private void cboxFiltradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxFiltradoActionPerformed
        // TODO add your handling code here:
        String criterio = (String) cboxFiltrado.getSelectedItem(); // Consigue el criterio seleccionado
        DefaultTableModel modelo = (DefaultTableModel) tablePropiedades.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
        tablePropiedades.setRowSorter(sorter);

        if (!criterio.isEmpty()) {
            RowFilter<DefaultTableModel, Object> filter = null;
            switch (criterio) {
                case "Codigo":
                    filter = RowFilter.regexFilter("\\d+", 0); // Filtra por codigo de propiedad
                    break;
                case "Departamento":
                case "Casa":
                    filter = RowFilter.regexFilter(criterio, 2); // Filtra según el Departamento o Casa
                    break;
                default:
                    break;
            }

            sorter.setRowFilter(filter);
        } else {
            sorter.setRowFilter(null); // Elimina el filtro si no hay criterio
        }
    }//GEN-LAST:event_cboxFiltradoActionPerformed

    //</editor-fold>
    // Inicio de la venta principal
    //<editor-fold defaultstate="collapsed" desc="Main">

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc="Look and Feel por defecto">

        try {
            UIManager.setLookAndFeel(new FlatDarkPurpleIJTheme());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                // La ruta relativa al directorio de fuentes
                String rutaFuente = "fonts/CascadiaCode.ttf";

                try {
                    // Cargar la fuente
                    Font nuevaFuente = Font.createFont(Font.TRUETYPE_FONT, new File(rutaFuente)).deriveFont(Font.PLAIN, 12);
                    Font cascadia = Font.createFont(Font.TRUETYPE_FONT, new File(rutaFuente)).deriveFont(Font.PLAIN, 11);
                    // Asociación de las fuentes con sus respectivos componentes
                    UIManager.put("OptionPane.messageFont", nuevaFuente);
                    UIManager.put("OptionPane.buttonFont", nuevaFuente);
                    UIManager.put("TextField.font", nuevaFuente);
                    UIManager.put("ComboBox.font", nuevaFuente);
                    UIManager.put("Label.font", nuevaFuente);
                    UIManager.put("Button.font", nuevaFuente);
                    UIManager.put("Menu.font", nuevaFuente);
                    UIManager.put("MenuBar.font", nuevaFuente);
                    UIManager.put("MenuItem.font", cascadia);
                    UIManager.put("Table.font", cascadia);
                    UIManager.put("TableHeader.font", nuevaFuente);
                
                } catch (FontFormatException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

                VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
                ventanaPrincipal.setLocationRelativeTo(null); // Pone la ventana en centro de la pantalla
                ventanaPrincipal.setVisible(true);
            }
        });
    }
//</editor-fold>
    // Componentes de Java Swing
    //<editor-fold defaultstate="collapsed" desc="Declaración de componentes">
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminarSelected;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cboxFiltrado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menuAgregar;
    private javax.swing.JMenu menuEliminar;
    private javax.swing.JMenu menuModificar;
    private javax.swing.JMenuItem mniAgregarCasa;
    private javax.swing.JMenuItem mniAgregarDpto;
    private javax.swing.JMenuItem mnuiCat;
    private javax.swing.JMenuItem mnuiDefault;
    private javax.swing.JMenuItem mnuiDracula;
    private javax.swing.JMenuItem mnuiEliminar;
    private javax.swing.JMenuItem mnuiLight;
    private javax.swing.JMenuItem mnuiModificar;
    private javax.swing.JMenuItem mnuiMonokai;
    private javax.swing.JTable tablePropiedades;
    private javax.swing.JTextField txtfBusqueda;
    // End of variables declaration//GEN-END:variables
//</editor-fold>    
    
}