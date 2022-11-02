package org.rodrigodiaz.vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.rodrigodiaz.controlador.ControlDeCategoria;
import org.rodrigodiaz.controlador.ControlDeCliente;
import org.rodrigodiaz.controlador.ControlDeMarca;
import org.rodrigodiaz.controlador.ControlDeProducto;
import org.rodrigodiaz.modelo.Categoria;
import org.rodrigodiaz.modelo.Cliente;
import org.rodrigodiaz.modelo.Marca;
import org.rodrigodiaz.modelo.Producto;

/**
 *
 * @author rodro
 */
public class VentanaVistaAdmin extends javax.swing.JFrame {
    ControlDeCategoria controlador = ControlDeCategoria.getInstancia();
    ControlDeMarca controladormarca = ControlDeMarca.getInstancia();
    ControlDeCliente controladorcliente = ControlDeCliente.getInstancia();
    ControlDeProducto controladorProducto = ControlDeProducto.getInstancia();

    /**
     * Creates new form VentanaVistaAdmin
     */
    public VentanaVistaAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarMarcas();
        mostrarCategorias();
        mostrarProducto();
        mostrarCliente();
        

    }
    
        private void mostrarCategorias(){
        int cantidadDeElementos = controlador.cantidadDeCategorias();
        String [] encabezado = {"Id", "Categoria", "Estado"};
        DefaultTableModel cabecera = new DefaultTableModel(encabezado, cantidadDeElementos);
        tablaDeCategorias.setModel(cabecera);
        TableModel tablaDeCategoriasVista = tablaDeCategorias.getModel();
        for (int i = 0; i < cantidadDeElementos; i++) {
            Categoria cate = controlador.listaDeCategorias().get(i);
            tablaDeCategorias.setValueAt(cate.getIdCategoria(), i, 0);
            tablaDeCategorias.setValueAt(cate.getCategoria(), i, 1);
            tablaDeCategorias.setValueAt(cate.getEstadoActivo(), i, 2);
        }
    }
        
        private void mostrarMarcas(){
        int cantidadDeElementos = controladormarca.cantidadDeMarcas();
        String [] encabezado = {"Id", "Marca"};
        DefaultTableModel cabecera = new DefaultTableModel(encabezado, cantidadDeElementos);
        tablaDeMarcas.setModel(cabecera);
        TableModel tablaDeMarcasVista = tablaDeMarcas.getModel();
        for (int i = 0; i < cantidadDeElementos; i++) {
            Marca marca = controladormarca.listaDeMarcas().get(i);
            tablaDeMarcas.setValueAt(marca.getIdMarca(), i, 0);
            tablaDeMarcas.setValueAt(marca.getMarca(), i, 1);
        }
    }
        
        private void mostrarProducto(){
        int cantidadDeElementos = controladorProducto.cantidadDeProducto();
        String [] encabezado = {"Id", "Nombre", "Id proveedor", "id categoria", "modelo", "id marca", "precio"};
        DefaultTableModel cabecera = new DefaultTableModel(encabezado, cantidadDeElementos);
        tablaDeProductos.setModel(cabecera);
        TableModel tablaDeProductosVista = tablaDeProductos.getModel();
        for (int i = 0; i < cantidadDeElementos; i++) {
            Producto producto = controladorProducto.listaDeProductos().get(i);
            tablaDeProductos.setValueAt(producto.getIdProducto(), i, 0);
            tablaDeProductos.setValueAt(producto.getNombreProducto(), i, 1);
            tablaDeProductos.setValueAt(producto.getIdProveedorProducto(), i, 2);
            tablaDeProductos.setValueAt(producto.getIdCategoriaProducto(), i, 3);
            tablaDeProductos.setValueAt(producto.getModelo(), i, 4);
            tablaDeProductos.setValueAt(producto.getIdMarcaProducto(), i, 5);
            tablaDeProductos.setValueAt(producto.getPrecioProducto(), i, 6);
    }
        }
        
        private void mostrarCliente(){
        int cantidadDeElementos = controladorcliente.cantidadDeClientes();
        String [] encabezado = {"Id", "Nombre", "Apellido", "Telefono", "Email", "direccion", "id direccion", "DPi", "estado", "usuario", "contraseña", "rol"};
        DefaultTableModel cabecera = new DefaultTableModel(encabezado, cantidadDeElementos);
        tablaDeClientes.setModel(cabecera);
        TableModel tablaDeProductosVista = tablaDeClientes.getModel();
        for (int i = 0; i < cantidadDeElementos; i++) {
            Cliente cliente = controladorcliente.listaDeClientes().get(i);
            tablaDeClientes.setValueAt(cliente.getIdCliente(), i, 0);
            tablaDeClientes.setValueAt(cliente.getNombreCliente(), i, 1);
            tablaDeClientes.setValueAt(cliente.getApellidoCliente(), i, 2);
            tablaDeClientes.setValueAt(cliente.getTelefonoCLietne(), i, 3);
            tablaDeClientes.setValueAt(cliente.getEmailCliente(), i, 4);
            tablaDeClientes.setValueAt(cliente.getDireccionCLiente(), i, 5);
            tablaDeClientes.setValueAt(cliente.getIdDepartamentoCliente(), i, 6);
            tablaDeClientes.setValueAt(cliente.getDpiCLiente(), i, 7);
            tablaDeClientes.setValueAt(cliente.getEstadoActivo(), i, 8);
            tablaDeClientes.setValueAt(cliente.getUsuario(), i, 9);
            tablaDeClientes.setValueAt(cliente.getContraseña(), i, 10);
            tablaDeClientes.setValueAt(cliente.getRol(), i, 11);
            
    }
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnProducto = new javax.swing.JButton();
        btnCategoria = new javax.swing.JButton();
        btnMarcas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblEncabezado = new javax.swing.JLabel();
        escritoriosAdmin = new javax.swing.JTabbedPane();
        escritorioCategoria = new javax.swing.JDesktopPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaDeProductos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        boxProveedor = new javax.swing.JComboBox<>();
        boxCategoria = new javax.swing.JComboBox<>();
        BoxMarca = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        escritorioMarcas = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDeCategorias = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        ckcEstadoCate = new javax.swing.JCheckBox();
        btnEliminarCa = new javax.swing.JButton();
        btnGuardarCA = new javax.swing.JButton();
        btnActualizarCA = new javax.swing.JButton();
        btnBuscarCa = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        txtBuscarCa = new javax.swing.JTextField();
        escritorioUsuarios = new javax.swing.JDesktopPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaDeClientes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbDepartamentoCLiente = new javax.swing.JComboBox<>();
        txtNombreC = new javax.swing.JTextField();
        txtApellidoC = new javax.swing.JTextField();
        txtTelefonoC = new javax.swing.JTextField();
        txtEmailC = new javax.swing.JTextField();
        txtDireccionC = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtDpiC = new javax.swing.JTextField();
        txtUsuarioC = new javax.swing.JTextField();
        txtContraseñaC = new javax.swing.JTextField();
        ckcEstadoC = new javax.swing.JCheckBox();
        ckRolC = new javax.swing.JCheckBox();
        btnEliminarC = new javax.swing.JButton();
        btnGuardarC = new javax.swing.JButton();
        btnActualizarC = new javax.swing.JButton();
        escritorioClientes = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDeMarcas = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtBuscarM = new javax.swing.JTextField();
        btnBuscarM = new javax.swing.JButton();
        btnGuardarM = new javax.swing.JButton();
        btnEliminarM = new javax.swing.JButton();
        btnActualizarM = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrador");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(136, 212, 234));

        btnProducto.setBackground(new java.awt.Color(0, 102, 102));
        btnProducto.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnProducto.setText("PRODUCTOS");
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        btnCategoria.setBackground(new java.awt.Color(0, 102, 102));
        btnCategoria.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnCategoria.setText("CATEGORIAS");
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });

        btnMarcas.setBackground(new java.awt.Color(0, 102, 102));
        btnMarcas.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnMarcas.setForeground(new java.awt.Color(255, 255, 255));
        btnMarcas.setText("CLIENTES");
        btnMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcasActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(0, 102, 102));
        btnClientes.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("MARCAS");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnProducto)
                .addGap(52, 52, 52)
                .addComponent(btnCategoria)
                .addGap(69, 69, 69)
                .addComponent(btnMarcas)
                .addGap(61, 61, 61)
                .addComponent(btnClientes)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 290, 520));

        jPanel3.setBackground(new java.awt.Color(78, 184, 222));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/recursos/iconoAdmin3.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 150));

        jPanel4.setBackground(new java.awt.Color(132, 212, 234));

        lblEncabezado.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lblEncabezado.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(324, Short.MAX_VALUE)
                .addComponent(lblEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEncabezado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 810, 40));

        escritoriosAdmin.setBackground(new java.awt.Color(255, 255, 255));

        escritorioCategoria.setBackground(new java.awt.Color(255, 255, 255));

        tablaDeProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Id Proveedor", "Id Categoria", "Modelo", "Id Marca", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaDeProductos);

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Proveedor");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Categoria");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Modelo");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Marca");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Precio");

        boxProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toyota", "ChineseLogic", "Cemaco", "RSR", "JAVAZ", "TectoTools", "Autel", "LTH", "Excel", "Daiway" }));

        boxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OBD0", "OBD1", "OBD2", "OBD3" }));

        BoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Launch", "Ancel", "Foxwell", "Bluedriver", "Autel", "Thinkcar", "Thinkdiag", "Injetech", "Motopower", "Ediag" }));

        btnGuardar.setBackground(new java.awt.Color(0, 102, 102));
        btnGuardar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(0, 102, 102));
        btnActualizar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(0, 102, 102));
        btnNuevo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 102, 102));
        btnEliminar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 102, 102));
        btnBuscar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Id a Buscar");

        escritorioCategoria.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(txtNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(txtModelo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(txtPrecio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(boxProveedor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(boxCategoria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(BoxMarca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(btnGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(btnActualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(btnNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(btnEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(btnBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(btnCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(txtBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioCategoria.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioCategoriaLayout = new javax.swing.GroupLayout(escritorioCategoria);
        escritorioCategoria.setLayout(escritorioCategoriaLayout);
        escritorioCategoriaLayout.setHorizontalGroup(
            escritorioCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioCategoriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(escritorioCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioCategoriaLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioCategoriaLayout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
            .addGroup(escritorioCategoriaLayout.createSequentialGroup()
                .addGroup(escritorioCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(escritorioCategoriaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(escritorioCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(332, 332, 332)
                        .addGroup(escritorioCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(escritorioCategoriaLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(escritorioCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioCategoriaLayout.createSequentialGroup()
                                .addGroup(escritorioCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(escritorioCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(escritorioCategoriaLayout.createSequentialGroup()
                                        .addGroup(escritorioCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNombre)
                                            .addComponent(boxProveedor, 0, 168, Short.MAX_VALUE)
                                            .addComponent(boxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(escritorioCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(escritorioCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                            .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                            .addComponent(BoxMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(escritorioCategoriaLayout.createSequentialGroup()
                                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(escritorioCategoriaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioCategoriaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(314, 314, 314))
        );
        escritorioCategoriaLayout.setVerticalGroup(
            escritorioCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioCategoriaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(escritorioCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel9)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(escritorioCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioCategoriaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(escritorioCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(escritorioCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(boxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(escritorioCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(escritorioCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnActualizar))
                        .addGap(9, 9, 9)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(escritorioCategoriaLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addGroup(escritorioCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnEliminar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        escritoriosAdmin.addTab("tab2", escritorioCategoria);

        escritorioMarcas.setBackground(new java.awt.Color(255, 255, 255));

        tablaDeCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Categoria", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaDeCategorias);

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Categoria");

        jLabel23.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Estado");

        ckcEstadoCate.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ckcEstadoCate.setForeground(new java.awt.Color(0, 0, 0));
        ckcEstadoCate.setText("Activo");

        btnEliminarCa.setBackground(new java.awt.Color(0, 102, 102));
        btnEliminarCa.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnEliminarCa.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCa.setText("ELIMINAR");
        btnEliminarCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCaActionPerformed(evt);
            }
        });

        btnGuardarCA.setBackground(new java.awt.Color(0, 102, 102));
        btnGuardarCA.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnGuardarCA.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCA.setText("GUARDAR");
        btnGuardarCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCAActionPerformed(evt);
            }
        });

        btnActualizarCA.setBackground(new java.awt.Color(0, 102, 102));
        btnActualizarCA.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnActualizarCA.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarCA.setText("ACTUALIZAR");
        btnActualizarCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCAActionPerformed(evt);
            }
        });

        btnBuscarCa.setBackground(new java.awt.Color(0, 102, 102));
        btnBuscarCa.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnBuscarCa.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCa.setText("BUSCAR");
        btnBuscarCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCaActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Id a Buscar");

        escritorioMarcas.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioMarcas.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioMarcas.setLayer(txtCategoria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioMarcas.setLayer(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioMarcas.setLayer(ckcEstadoCate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioMarcas.setLayer(btnEliminarCa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioMarcas.setLayer(btnGuardarCA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioMarcas.setLayer(btnActualizarCA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioMarcas.setLayer(btnBuscarCa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioMarcas.setLayer(jSeparator4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioMarcas.setLayer(jSeparator5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioMarcas.setLayer(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioMarcas.setLayer(txtBuscarCa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioMarcasLayout = new javax.swing.GroupLayout(escritorioMarcas);
        escritorioMarcas.setLayout(escritorioMarcasLayout);
        escritorioMarcasLayout.setHorizontalGroup(
            escritorioMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioMarcasLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(escritorioMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(escritorioMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckcEstadoCate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioMarcasLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(escritorioMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(escritorioMarcasLayout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(96, 96, 96))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioMarcasLayout.createSequentialGroup()
                            .addGroup(escritorioMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator4)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, escritorioMarcasLayout.createSequentialGroup()
                                    .addComponent(btnEliminarCa, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 408, Short.MAX_VALUE)
                                    .addComponent(btnActualizarCA, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator5))
                            .addGap(43, 43, 43)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioMarcasLayout.createSequentialGroup()
                        .addComponent(btnGuardarCA, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(305, 305, 305))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioMarcasLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarCa, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarCa, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        escritorioMarcasLayout.setVerticalGroup(
            escritorioMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioMarcasLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(escritorioMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarCa)
                    .addGroup(escritorioMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(txtBuscarCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(escritorioMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(escritorioMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(ckcEstadoCate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btnGuardarCA)
                .addGap(34, 34, 34)
                .addGroup(escritorioMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarCA)
                    .addComponent(btnEliminarCa))
                .addGap(38, 38, 38)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        escritoriosAdmin.addTab("tab3", escritorioMarcas);

        escritorioUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        tablaDeClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "Telefono", "Email", "Direccion", "Id DIreccion", "DPI", "Estado", "Usuario", "Contraseña", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaDeClientes);

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Apellido");

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Telefono");

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Email");

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Direccion");

        cbDepartamentoCLiente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta Verapaz", "Baja Verapaz", "Chimaltenango", "Chiquimula", "El Progreso", "Escuintla", "Guatemala", "Huehuetenango", "Izabal", "Jalapa", "Jutiapa", "Peten", "Quetzaltenango", "Quiche", "Retalhuleu", "Sacatepequez", "San Marcos", "Santa Rosa", "Solola", "Suchitepequez", "Totonicapan", "Zacapa" }));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Departamento");

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("DPI");

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Estado");

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Usuario");

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Contraseña");

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Cargo");

        ckcEstadoC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ckcEstadoC.setForeground(new java.awt.Color(0, 0, 0));
        ckcEstadoC.setText("Activo");

        ckRolC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ckRolC.setForeground(new java.awt.Color(0, 0, 0));
        ckRolC.setText("Empleado");

        btnEliminarC.setBackground(new java.awt.Color(0, 102, 102));
        btnEliminarC.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnEliminarC.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarC.setText("ELIMINAR");
        btnEliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCActionPerformed(evt);
            }
        });

        btnGuardarC.setBackground(new java.awt.Color(0, 102, 102));
        btnGuardarC.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnGuardarC.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarC.setText("GUARDAR");
        btnGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCActionPerformed(evt);
            }
        });

        btnActualizarC.setBackground(new java.awt.Color(0, 102, 102));
        btnActualizarC.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnActualizarC.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarC.setText("ACTUALIZAR");
        btnActualizarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCActionPerformed(evt);
            }
        });

        escritorioUsuarios.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(cbDepartamentoCLiente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(txtNombreC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(txtApellidoC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(txtTelefonoC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(txtEmailC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(txtDireccionC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(txtDpiC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(txtUsuarioC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(txtContraseñaC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(ckcEstadoC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(ckRolC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(btnEliminarC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(btnGuardarC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioUsuarios.setLayer(btnActualizarC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioUsuariosLayout = new javax.swing.GroupLayout(escritorioUsuarios);
        escritorioUsuarios.setLayout(escritorioUsuariosLayout);
        escritorioUsuariosLayout.setHorizontalGroup(
            escritorioUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioUsuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(escritorioUsuariosLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(escritorioUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioUsuariosLayout.createSequentialGroup()
                        .addComponent(btnEliminarC, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(escritorioUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioUsuariosLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(55, 55, 55)
                                .addComponent(ckRolC, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                            .addGroup(escritorioUsuariosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnGuardarC, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(108, 108, 108)
                        .addComponent(btnActualizarC, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(escritorioUsuariosLayout.createSequentialGroup()
                        .addGroup(escritorioUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioUsuariosLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(escritorioUsuariosLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtApellidoC, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(escritorioUsuariosLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(escritorioUsuariosLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmailC, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(escritorioUsuariosLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDireccionC, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(96, 96, 96)
                        .addGroup(escritorioUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(escritorioUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbDepartamentoCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDpiC, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUsuarioC, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtContraseñaC, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ckcEstadoC, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        escritorioUsuariosLayout.setVerticalGroup(
            escritorioUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioUsuariosLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(escritorioUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cbDepartamentoCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(escritorioUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtApellidoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtDpiC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(escritorioUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(ckcEstadoC))
                .addGap(33, 33, 33)
                .addGroup(escritorioUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtEmailC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtUsuarioC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(escritorioUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtDireccionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtContraseñaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(escritorioUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(ckRolC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(escritorioUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarC)
                    .addComponent(btnEliminarC)
                    .addComponent(btnActualizarC))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        escritoriosAdmin.addTab("tab5", escritorioUsuarios);

        escritorioClientes.setBackground(new java.awt.Color(255, 255, 255));

        tablaDeMarcas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaDeMarcas);

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Nombre Marca");

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Id a Buscar");

        btnBuscarM.setBackground(new java.awt.Color(0, 102, 102));
        btnBuscarM.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnBuscarM.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarM.setText("BUSCAR");
        btnBuscarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMActionPerformed(evt);
            }
        });

        btnGuardarM.setBackground(new java.awt.Color(0, 102, 102));
        btnGuardarM.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnGuardarM.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarM.setText("GUARDAR");
        btnGuardarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMActionPerformed(evt);
            }
        });

        btnEliminarM.setBackground(new java.awt.Color(0, 102, 102));
        btnEliminarM.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnEliminarM.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarM.setText("ELIMINAR");
        btnEliminarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMActionPerformed(evt);
            }
        });

        btnActualizarM.setBackground(new java.awt.Color(0, 102, 102));
        btnActualizarM.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnActualizarM.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarM.setText("ACTUALIZAR");
        btnActualizarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarMActionPerformed(evt);
            }
        });

        escritorioClientes.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioClientes.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioClientes.setLayer(txtMarca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioClientes.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioClientes.setLayer(txtBuscarM, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioClientes.setLayer(btnBuscarM, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioClientes.setLayer(btnGuardarM, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioClientes.setLayer(btnEliminarM, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioClientes.setLayer(btnActualizarM, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioClientes.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioClientes.setLayer(jSeparator3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioClientesLayout = new javax.swing.GroupLayout(escritorioClientes);
        escritorioClientes.setLayout(escritorioClientesLayout);
        escritorioClientesLayout.setHorizontalGroup(
            escritorioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(escritorioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioClientesLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioClientesLayout.createSequentialGroup()
                        .addComponent(btnGuardarM, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(306, 306, 306))))
            .addGroup(escritorioClientesLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(escritorioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioClientesLayout.createSequentialGroup()
                        .addGroup(escritorioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, escritorioClientesLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnEliminarM, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizarM, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70))
                    .addGroup(escritorioClientesLayout.createSequentialGroup()
                        .addGroup(escritorioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)
                            .addGroup(escritorioClientesLayout.createSequentialGroup()
                                .addGroup(escritorioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(escritorioClientesLayout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtBuscarM, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(escritorioClientesLayout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                .addComponent(btnBuscarM, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59))))
        );
        escritorioClientesLayout.setVerticalGroup(
            escritorioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioClientesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(escritorioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtBuscarM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarM))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(escritorioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(50, 50, 50)
                .addComponent(btnGuardarM)
                .addGap(18, 18, 18)
                .addGroup(escritorioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarM)
                    .addComponent(btnActualizarM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        escritoriosAdmin.addTab("tab4", escritorioClientes);

        jPanel1.add(escritoriosAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 810, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        escritoriosAdmin.setSelectedIndex(0);
        lblEncabezado.setText(btnProducto.getText());
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        escritoriosAdmin.setSelectedIndex(1);
        lblEncabezado.setText(btnCategoria.getText());
    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void btnMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcasActionPerformed
        escritoriosAdmin.setSelectedIndex(2);
        lblEncabezado.setText(btnMarcas.getText());
    }//GEN-LAST:event_btnMarcasActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        escritoriosAdmin.setSelectedIndex(3);
        lblEncabezado.setText(btnClientes.getText());
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Producto producto = new Producto();
        producto.setNombreProducto(txtNombre.getText());
        
        if (boxProveedor.getSelectedItem().equals("Toyota")) {
            producto.setIdProveedorProducto(1);
        }else if(boxProveedor.getSelectedItem().equals("ChineseLogic")){
            producto.setIdProveedorProducto(2);
        }else if(boxProveedor.getSelectedItem().equals("Cemaco")){
            producto.setIdProveedorProducto(3);
        }else if(boxProveedor.getSelectedItem().equals("RSR")){
            producto.setIdProveedorProducto(4);
        }else if(boxProveedor.getSelectedItem().equals("JAVAZ")){
            producto.setIdProveedorProducto(5);
        }else if(boxProveedor.getSelectedItem().equals("TectoTools")){
            producto.setIdProveedorProducto(6);
        }else if(boxProveedor.getSelectedItem().equals("Autel")){
            producto.setIdProveedorProducto(7);
        }else if(boxProveedor.getSelectedItem().equals("LTH")){
            producto.setIdProveedorProducto(8);
        }else if(boxProveedor.getSelectedItem().equals("Excel")){
            producto.setIdProveedorProducto(9);
        }else if(boxProveedor.getSelectedItem().equals("Daiway")){
            producto.setIdProveedorProducto(10);
        }
        
        if (boxCategoria.getSelectedItem().equals("OBD0")) {
            producto.setIdCategoriaProducto(1);
        }else if(boxCategoria.getSelectedItem().equals("OBD1")){
            producto.setIdCategoriaProducto(2);
        }else if(boxCategoria.getSelectedItem().equals("OBD2")){
            producto.setIdCategoriaProducto(3);
        }else if(boxCategoria.getSelectedItem().equals("OBD3")){
            producto.setIdCategoriaProducto(4);
        }
        
        producto.setModelo(txtModelo.getText());
        
        if (BoxMarca.getSelectedItem().equals("Launch")) {
            producto.setIdMarcaProducto(1);
        }else if(BoxMarca.getSelectedItem().equals("Ancel")){
            producto.setIdMarcaProducto(2);
        }else if(BoxMarca.getSelectedItem().equals("Foxwell")){
            producto.setIdMarcaProducto(3);
        }else if(BoxMarca.getSelectedItem().equals("Bluedriver")){
            producto.setIdMarcaProducto(4);
        }else if(BoxMarca.getSelectedItem().equals("Autel")){
            producto.setIdMarcaProducto(5);
        }else if(BoxMarca.getSelectedItem().equals("Thinkcar")){
            producto.setIdProveedorProducto(6);
        }else if(BoxMarca.getSelectedItem().equals("Thinkdiag")){
            producto.setIdMarcaProducto(7);
        }else if(BoxMarca.getSelectedItem().equals("Injetech")){
            producto.setIdMarcaProducto(8);
        }else if(BoxMarca.getSelectedItem().equals("Motopower")){
            producto.setIdMarcaProducto(9);
        }else if(BoxMarca.getSelectedItem().equals("Ediag")){
            producto.setIdMarcaProducto(10);
        }
        
        producto.setPrecioProducto(Double.parseDouble(txtPrecio.getText()));
        controladorProducto.agregarProducto(producto);
        txtModelo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        
                txtNombre.setEnabled(false);
        txtModelo.setEnabled(false);
        txtPrecio.setEnabled(false);
        BoxMarca.setEnabled(false);
        boxCategoria.setEnabled(false);
        boxProveedor.setEnabled(false);
        txtBuscar.setText("");
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Producto producto = new Producto();
       producto.setNombreProducto(txtNombre.getText());
        
        if (boxProveedor.getSelectedItem().equals("Toyota")) {
            producto.setIdProveedorProducto(1);
        }else if(boxProveedor.getSelectedItem().equals("ChineseLogic")){
            producto.setIdProveedorProducto(2);
        }else if(boxProveedor.getSelectedItem().equals("Cemaco")){
            producto.setIdProveedorProducto(3);
        }else if(boxProveedor.getSelectedItem().equals("RSR")){
            producto.setIdProveedorProducto(4);
        }else if(boxProveedor.getSelectedItem().equals("JAVAZ")){
            producto.setIdProveedorProducto(5);
        }else if(boxProveedor.getSelectedItem().equals("TectoTools")){
            producto.setIdProveedorProducto(6);
        }else if(boxProveedor.getSelectedItem().equals("Autel")){
            producto.setIdProveedorProducto(7);
        }else if(boxProveedor.getSelectedItem().equals("LTH")){
            producto.setIdProveedorProducto(8);
        }else if(boxProveedor.getSelectedItem().equals("Excel")){
            producto.setIdProveedorProducto(9);
        }else if(boxProveedor.getSelectedItem().equals("Daiway")){
            producto.setIdProveedorProducto(10);
        }
        
        if (boxCategoria.getSelectedItem().equals("OBD0")) {
            producto.setIdCategoriaProducto(1);
        }else if(boxCategoria.getSelectedItem().equals("OBD1")){
            producto.setIdCategoriaProducto(2);
        }else if(boxCategoria.getSelectedItem().equals("OBD2")){
            producto.setIdCategoriaProducto(3);
        }else if(boxCategoria.getSelectedItem().equals("OBD3")){
            producto.setIdCategoriaProducto(4);
        }
        
        producto.setModelo(txtModelo.getText());
        
        if (BoxMarca.getSelectedItem().equals("Launch")) {
            producto.setIdMarcaProducto(1);
        }else if(BoxMarca.getSelectedItem().equals("Ancel")){
            producto.setIdMarcaProducto(2);
        }else if(BoxMarca.getSelectedItem().equals("Foxwell")){
            producto.setIdMarcaProducto(3);
        }else if(BoxMarca.getSelectedItem().equals("Bluedriver")){
            producto.setIdMarcaProducto(4);
        }else if(BoxMarca.getSelectedItem().equals("Autel")){
            producto.setIdMarcaProducto(5);
        }else if(BoxMarca.getSelectedItem().equals("Thinkcar")){
            producto.setIdProveedorProducto(6);
        }else if(BoxMarca.getSelectedItem().equals("Thinkdiag")){
            producto.setIdMarcaProducto(7);
        }else if(BoxMarca.getSelectedItem().equals("Injetech")){
            producto.setIdMarcaProducto(8);
        }else if(BoxMarca.getSelectedItem().equals("Motopower")){
            producto.setIdMarcaProducto(9);
        }else if(BoxMarca.getSelectedItem().equals("Ediag")){
            producto.setIdMarcaProducto(10);
        }
        
        controladorProducto.actualizarProducto(producto);
        txtModelo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtNombre.setEnabled(true);
        txtModelo.setEnabled(true);
        txtPrecio.setEnabled(true);
        BoxMarca.setEnabled(true);
        boxCategoria.setEnabled(true);
        boxProveedor.setEnabled(true);        
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Producto producto = new Producto();
        producto.setIdProducto(Integer.parseInt(txtBuscar.getText()));
        controladorProducto.eliminarProducto(producto);
                txtBuscar.setText("");
                        txtModelo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        txtNombre.setEnabled(true);
        txtModelo.setEnabled(true);
        txtPrecio.setEnabled(true);
        BoxMarca.setEnabled(true);
        boxCategoria.setEnabled(true);
        boxProveedor.setEnabled(true);  
        
        Producto producto = new Producto();
        producto.setIdProducto(Integer.parseInt(txtBuscar.getText()));
        producto = controladorProducto.buscarProducto(producto);
        if (producto != null) {
            txtNombre.setText(producto.getNombreProducto());
            txtModelo.setText(producto.getModelo());
            txtPrecio.setText(String.valueOf(producto.getPrecioProducto()));
        }else{
            JOptionPane.showMessageDialog(null, "El dato que buscar no se encuentra en la base de datos");
        }
        
        btnGuardar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
            txtModelo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        
                txtNombre.setEnabled(false);
        txtModelo.setEnabled(false);
        txtPrecio.setEnabled(false);
        BoxMarca.setEnabled(false);
        boxCategoria.setEnabled(false);
        boxProveedor.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarCActionPerformed

    private void btnGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCActionPerformed
        Cliente cliente = new Cliente();
        cliente.setNombreCliente(txtNombreC.getText());
        cliente.setApellidoCliente(txtApellidoC.getText());
        cliente.setTelefonoCLietne(txtTelefonoC.getText());
        cliente.setEmailCliente(txtEmailC.getText());
        cliente.setDireccionCLiente(txtDireccionC.getText());
       if (cbDepartamentoCLiente.getSelectedItem().equals("Alta Verapaz")) {
            cliente.setIdDepartamentoCliente(1);
        }else if(cbDepartamentoCLiente.getSelectedItem().equals("Baja Verapaz")){
            cliente.setIdDepartamentoCliente(2);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Chimaltenango")) {
            cliente.setIdDepartamentoCliente(3);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Chiquimula")) {
            cliente.setIdDepartamentoCliente(4);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("El Progreso")) {
            cliente.setIdDepartamentoCliente(5);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Escuintla")) {
            cliente.setIdDepartamentoCliente(6);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Guatemala")) {
            cliente.setIdDepartamentoCliente(7);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Huehuetenango")) {
            cliente.setIdDepartamentoCliente(8);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Izabal")) {
            cliente.setIdDepartamentoCliente(9);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Jalapa")) {
            cliente.setIdDepartamentoCliente(10);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Jutiapa")) {
            cliente.setIdDepartamentoCliente(11);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Peten")) {
            cliente.setIdDepartamentoCliente(12);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Quetzaltenango")) {
            cliente.setIdDepartamentoCliente(13);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Quiche")) {
            cliente.setIdDepartamentoCliente(14);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Retalhuleu")) {
            cliente.setIdDepartamentoCliente(15);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Sacatepequez")) {
            cliente.setIdDepartamentoCliente(16);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("San Marcos")) {
            cliente.setIdDepartamentoCliente(17);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Santa Rosa")) {
            cliente.setIdDepartamentoCliente(18);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Solola")) {
            cliente.setIdDepartamentoCliente(19);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Suchitepequez")) {
            cliente.setIdDepartamentoCliente(20);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Totonicapan")) {
            cliente.setIdDepartamentoCliente(21);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Zacapa")) {
            cliente.setIdDepartamentoCliente(22);
        }
       cliente.setDpiCLiente(txtDpiC.getText());
       
        if (ckcEstadoC.isSelected()) {
            cliente.setEstadoActivo(true);
        }else{
            cliente.setEstadoActivo(false);
        }
        
        cliente.setUsuario(txtUsuarioC.getText());
        cliente.setContraseña(txtContraseñaC.getText());
        
        if (ckRolC.isSelected()) {
            cliente.setRol(true);
        }else{
            cliente.setRol(false);
        }
        controladorcliente.agregarCliente(cliente);
        txtNombreC.setText("");
        txtApellidoC.setText("");
        txtTelefonoC.setText("");
        txtEmailC.setText("");
        txtDireccionC.setText("");
        txtDpiC.setText("");
        txtUsuarioC.setText("");
        txtContraseñaC.setText("");
        
    }//GEN-LAST:event_btnGuardarCActionPerformed

    private void btnActualizarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarCActionPerformed

    private void btnBuscarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMActionPerformed
        Marca marca = new Marca();
        marca.setIdMarca(Integer.parseInt(txtBuscarM.getText()));
        marca = controladormarca.buscarMarca(marca);
        if (marca != null) {
            txtMarca.setText(marca.getMarca());

        }else{
            JOptionPane.showMessageDialog(null, "El dato que buscar no se encuentra en la base de datos");
        }        
    }//GEN-LAST:event_btnBuscarMActionPerformed

    private void btnGuardarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMActionPerformed
        Marca marca = new Marca();
        marca.setMarca(txtMarca.getText());
        controladormarca.agregarMarca(marca);
        txtMarca.setText("");
        txtBuscarM.setText("");
    }//GEN-LAST:event_btnGuardarMActionPerformed

    private void btnEliminarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMActionPerformed
        Marca marca = new Marca();
        marca.setIdMarca(Integer.parseInt(txtBuscarM.getText()));
        controladormarca.eliminarMarca(marca);
        
        txtMarca.setText("");
        txtBuscarM.setText("");
    }//GEN-LAST:event_btnEliminarMActionPerformed

    private void btnActualizarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarMActionPerformed
        Marca marca = new Marca();
        marca.setIdMarca(Integer.parseInt(txtBuscarM.getText()));
        marca.setMarca(txtMarca.getText());
        controladormarca.actualizarMarca(marca);
        txtMarca.setText("");
        txtBuscarM.setText("");
        
    }//GEN-LAST:event_btnActualizarMActionPerformed

    private void btnEliminarCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCaActionPerformed
        Categoria cate = new Categoria();
        cate.setIdCategoria(Integer.parseInt(txtBuscarCa.getText()));
        controlador.eliminarCategoria(cate);
        txtBuscarCa.setText("");
        txtCategoria.setText("");
    }//GEN-LAST:event_btnEliminarCaActionPerformed

    private void btnGuardarCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCAActionPerformed
        Categoria cate = new Categoria();
        cate.setCategoria(txtCategoria.getText());
        if (ckcEstadoCate.isSelected()) {
            cate.setEstadoActivo(true);
        }else{
            cate.setEstadoActivo(false);
        }
        controlador.agregarCategoria(cate);
        txtCategoria.setText("");
        txtBuscarCa.setText("");
    }//GEN-LAST:event_btnGuardarCAActionPerformed

    private void btnActualizarCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCAActionPerformed
        Categoria cate = new Categoria();
        cate.setIdCategoria(Integer.parseInt(txtBuscarCa.getText()));
        cate.setCategoria(txtCategoria.getText());
        if (ckcEstadoCate.isSelected()) {
            cate.setEstadoActivo(true);
        }else{
            cate.setEstadoActivo(false);
        }
        controlador.actualizarCategoria(cate);
        txtBuscarCa.setText("");
        txtCategoria.setText("");
    }//GEN-LAST:event_btnActualizarCAActionPerformed

    private void btnBuscarCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCaActionPerformed
        Categoria cate = new Categoria();cate.setIdCategoria(Integer.parseInt(txtBuscarCa.getText()));
        cate = controlador.buscarMarca(cate);
        if (cate != null) {
            txtCategoria.setText(cate.getCategoria());
                
            
        }else{
            JOptionPane.showMessageDialog(null, "El dato que buscar no se encuentra en la base de datos");
        }
        
      
    }//GEN-LAST:event_btnBuscarCaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxMarca;
    private javax.swing.JComboBox<String> boxCategoria;
    private javax.swing.JComboBox<String> boxProveedor;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizarC;
    private javax.swing.JButton btnActualizarCA;
    private javax.swing.JButton btnActualizarM;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarCa;
    private javax.swing.JButton btnBuscarM;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarC;
    private javax.swing.JButton btnEliminarCa;
    private javax.swing.JButton btnEliminarM;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarC;
    private javax.swing.JButton btnGuardarCA;
    private javax.swing.JButton btnGuardarM;
    private javax.swing.JButton btnMarcas;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnProducto;
    private javax.swing.JComboBox<String> cbDepartamentoCLiente;
    private javax.swing.JCheckBox ckRolC;
    private javax.swing.JCheckBox ckcEstadoC;
    private javax.swing.JCheckBox ckcEstadoCate;
    private javax.swing.JDesktopPane escritorioCategoria;
    private javax.swing.JDesktopPane escritorioClientes;
    private javax.swing.JDesktopPane escritorioMarcas;
    private javax.swing.JDesktopPane escritorioUsuarios;
    private javax.swing.JTabbedPane escritoriosAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JTable tablaDeCategorias;
    private javax.swing.JTable tablaDeClientes;
    private javax.swing.JTable tablaDeMarcas;
    private javax.swing.JTable tablaDeProductos;
    private javax.swing.JTextField txtApellidoC;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarCa;
    private javax.swing.JTextField txtBuscarM;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtContraseñaC;
    private javax.swing.JTextField txtDireccionC;
    private javax.swing.JTextField txtDpiC;
    private javax.swing.JTextField txtEmailC;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTelefonoC;
    private javax.swing.JTextField txtUsuarioC;
    // End of variables declaration//GEN-END:variables
}
