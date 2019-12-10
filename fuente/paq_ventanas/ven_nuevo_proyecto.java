

/*
 * ven_nuevo_proyecto.java
 *
 * Created on 05/06/2010, 07:20:59 PM
 */

package paq_ventanas;

import paq_logica.*;
import paq_arquitectura.GestionProyecto;
import paq_arquitectura.Red_FeedForward;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Jonathan
 */
public class ven_nuevo_proyecto extends javax.swing.JInternalFrame {

 private Red_FeedForward nueva_red;
 private static JOptionPane mensajes;
 private static String titulo_mensajes= "Gestión de Proyectos";
 ResultSet resultado;
 cls_sql clase_sql= new cls_sql();
 String sql;
 GestionProyecto nuevoProyecto= new GestionProyecto();
 cls_variables_globales variables_globales= new cls_variables_globales();
 int id_funcion[] = new int[variables_globales.numFuncionActivacion];    // funciones de activacion grabadas
 int i;
 int usuario=1;                    //guarda el usuario
 javax.swing.table.DefaultTableCellRenderer tcr = new  javax.swing.table.DefaultTableCellRenderer();
 int fil;


    /** Creates new form ven_nuevo_proyecto */
    public ven_nuevo_proyecto()
    {
       initComponents();
       this.title= "Nuevo proyecto # " + String.valueOf( nuevoProyecto.getSecuencia("tab_proyecto"));
       this.txt_nombreProyecto.requestFocus();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Pan_arquitectura = new javax.swing.JPanel();
        Pan_tipo_red = new javax.swing.JPanel();
        Pan_capas = new javax.swing.JPanel();
        lbl_entrada = new javax.swing.JLabel();
        lbl_salida = new javax.swing.JLabel();
        lbl_oculta = new javax.swing.JLabel();
        txt_num_entradas = new javax.swing.JTextField();
        txt_num_salidas = new javax.swing.JTextField();
        txt_num_ocultas = new javax.swing.JTextField();
        btnAyuda = new javax.swing.JButton();
        btnAyuda1 = new javax.swing.JButton();
        btnAyuda2 = new javax.swing.JButton();
        Pan_tipos = new javax.swing.JPanel();
        rad_percetron_simple = new javax.swing.JRadioButton();
        rad_perceptron_multicapa = new javax.swing.JRadioButton();
        rad_feedForward = new javax.swing.JRadioButton();
        txt_nombreProyecto = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        Pan_seleccion_datos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_tablas = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_tablas_datos = new javax.swing.JTable();
        btnVerTabla = new javax.swing.JButton();
        Pan_dinamica = new javax.swing.JPanel();
        lbl_funcion_activacion = new javax.swing.JLabel();
        cmb_funcion_activacion = new javax.swing.JComboBox();
        lbl_pesos = new javax.swing.JLabel();
        txt_peso1 = new javax.swing.JTextField();
        txt_peso2 = new javax.swing.JTextField();
        lbl_peso_entre = new javax.swing.JLabel();
        btn_imagen_funcion = new javax.swing.JButton();
        btnAyuda3 = new javax.swing.JButton();
        btnAyuda4 = new javax.swing.JButton();
        lbl_factor_aprendizaje = new javax.swing.JPanel();
        lbl_funcion_activacion1 = new javax.swing.JLabel();
        lbl_ciclos = new javax.swing.JLabel();
        txt_factor_aprendizaje = new javax.swing.JTextField();
        txt_ciclos = new javax.swing.JTextField();
        lbl_umbral = new javax.swing.JLabel();
        txt_umbral = new javax.swing.JTextField();
        lbl_ciclos1 = new javax.swing.JLabel();
        txt_error = new javax.swing.JTextField();
        lbl_momento = new javax.swing.JLabel();
        txt_momento = new javax.swing.JTextField();
        lbl_ciclos2 = new javax.swing.JLabel();
        txt_error1 = new javax.swing.JTextField();
        btnAyuda5 = new javax.swing.JButton();
        btnAyuda6 = new javax.swing.JButton();
        btnAyuda7 = new javax.swing.JButton();
        btnAyuda8 = new javax.swing.JButton();
        btnAyuda9 = new javax.swing.JButton();
        btnAyuda10 = new javax.swing.JButton();
        Pan_control = new javax.swing.JPanel();
        btn_aceptar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        lbl_descripcion = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(102, 102, 102));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Nuevo Proyecto");
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/page_white_add.png"))); // NOI18N
        setInheritsPopupMenu(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        Pan_arquitectura.setBackground(new java.awt.Color(102, 102, 102));
        Pan_arquitectura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Arquitectura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 255, 51))); // NOI18N
        Pan_arquitectura.setForeground(new java.awt.Color(255, 255, 102));

        Pan_tipo_red.setBackground(new java.awt.Color(102, 102, 102));
        Pan_tipo_red.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Red", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 255, 51))); // NOI18N
        Pan_tipo_red.setForeground(new java.awt.Color(0, 204, 0));

        Pan_capas.setBackground(new java.awt.Color(102, 102, 102));
        Pan_capas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Neuronas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(0, 153, 153))); // NOI18N

        lbl_entrada.setBackground(java.awt.Color.white);
        lbl_entrada.setFont(new java.awt.Font("Arial", 1, 11));
        lbl_entrada.setForeground(new java.awt.Color(255, 255, 255));
        lbl_entrada.setText("# Entrada :");

        lbl_salida.setBackground(java.awt.Color.white);
        lbl_salida.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_salida.setForeground(new java.awt.Color(255, 255, 255));
        lbl_salida.setText("# Salida :");

        lbl_oculta.setBackground(java.awt.Color.white);
        lbl_oculta.setFont(new java.awt.Font("Arial", 1, 11));
        lbl_oculta.setForeground(new java.awt.Color(255, 255, 255));
        lbl_oculta.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_oculta.setText("# Ocultas :");

        txt_num_entradas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_num_entradas.setForeground(new java.awt.Color(255, 51, 51));
        txt_num_entradas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_num_entradas.setText("2");
        txt_num_entradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_num_entradasActionPerformed(evt);
            }
        });

        txt_num_salidas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_num_salidas.setForeground(new java.awt.Color(255, 51, 51));
        txt_num_salidas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_num_salidas.setText("1");
        txt_num_salidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_num_salidasActionPerformed(evt);
            }
        });

        txt_num_ocultas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_num_ocultas.setForeground(new java.awt.Color(255, 51, 51));
        txt_num_ocultas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_num_ocultas.setText("2");
        txt_num_ocultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_num_ocultasActionPerformed(evt);
            }
        });

        btnAyuda.setBackground(new java.awt.Color(102, 255, 102));
        btnAyuda.setForeground(new java.awt.Color(102, 102, 102));
        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/help.png"))); // NOI18N
        btnAyuda.setToolTipText("Indica el n umero de neuronas que tendrá la capa de entrada de la red neuronal");
        btnAyuda.setBorder(null);
        btnAyuda.setFocusable(false);
        btnAyuda.setOpaque(false);
        btnAyuda.setSelected(true);
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        btnAyuda1.setBackground(new java.awt.Color(102, 255, 102));
        btnAyuda1.setForeground(new java.awt.Color(102, 102, 102));
        btnAyuda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/help.png"))); // NOI18N
        btnAyuda1.setToolTipText("Indica el n umero de neuronas que tendrá la capa de oculta de la red neuronal");
        btnAyuda1.setBorder(null);
        btnAyuda1.setFocusable(false);
        btnAyuda1.setOpaque(false);
        btnAyuda1.setSelected(true);

        btnAyuda2.setBackground(new java.awt.Color(102, 255, 102));
        btnAyuda2.setForeground(new java.awt.Color(102, 102, 102));
        btnAyuda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/help.png"))); // NOI18N
        btnAyuda2.setToolTipText("Indica el n umero de neuronas que tendrá la capa de salida de la red neuronal");
        btnAyuda2.setBorder(null);
        btnAyuda2.setFocusable(false);
        btnAyuda2.setOpaque(false);
        btnAyuda2.setSelected(true);

        javax.swing.GroupLayout Pan_capasLayout = new javax.swing.GroupLayout(Pan_capas);
        Pan_capas.setLayout(Pan_capasLayout);
        Pan_capasLayout.setHorizontalGroup(
            Pan_capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pan_capasLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lbl_entrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_num_entradas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(lbl_oculta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_num_ocultas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAyuda1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(lbl_salida)
                .addGap(18, 18, 18)
                .addComponent(txt_num_salidas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAyuda2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        Pan_capasLayout.setVerticalGroup(
            Pan_capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pan_capasLayout.createSequentialGroup()
                .addGroup(Pan_capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_num_ocultas, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_num_entradas, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pan_capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_num_salidas)
                        .addComponent(lbl_salida))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pan_capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_entrada)
                        .addComponent(lbl_oculta))
                    .addComponent(btnAyuda2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(btnAyuda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(btnAyuda1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addContainerGap())
        );

        Pan_tipos.setBackground(new java.awt.Color(102, 102, 102));

        rad_percetron_simple.setBackground(new java.awt.Color(102, 102, 102));
        rad_percetron_simple.setFont(new java.awt.Font("Arial", 1, 11));
        rad_percetron_simple.setForeground(java.awt.Color.blue);
        rad_percetron_simple.setText("Perceptron Simple");
        rad_percetron_simple.setEnabled(false);
        rad_percetron_simple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_percetron_simpleActionPerformed(evt);
            }
        });

        rad_perceptron_multicapa.setBackground(new java.awt.Color(102, 102, 102));
        rad_perceptron_multicapa.setFont(new java.awt.Font("Arial", 1, 11));
        rad_perceptron_multicapa.setForeground(java.awt.Color.blue);
        rad_perceptron_multicapa.setText("Perceptron Multicapa");
        rad_perceptron_multicapa.setEnabled(false);

        rad_feedForward.setBackground(new java.awt.Color(102, 102, 102));
        rad_feedForward.setFont(new java.awt.Font("Arial", 1, 11));
        rad_feedForward.setForeground(new java.awt.Color(255, 255, 255));
        rad_feedForward.setSelected(true);
        rad_feedForward.setText("Red FeedForward");

        javax.swing.GroupLayout Pan_tiposLayout = new javax.swing.GroupLayout(Pan_tipos);
        Pan_tipos.setLayout(Pan_tiposLayout);
        Pan_tiposLayout.setHorizontalGroup(
            Pan_tiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
            .addGroup(Pan_tiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Pan_tiposLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(Pan_tiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rad_percetron_simple)
                        .addComponent(rad_perceptron_multicapa)
                        .addComponent(rad_feedForward))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        Pan_tiposLayout.setVerticalGroup(
            Pan_tiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
            .addGroup(Pan_tiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Pan_tiposLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(rad_percetron_simple)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(rad_perceptron_multicapa)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(rad_feedForward)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        txt_nombreProyecto.setForeground(new java.awt.Color(255, 51, 51));
        txt_nombreProyecto.setFocusCycleRoot(true);

        lbl_nombre.setBackground(java.awt.Color.white);
        lbl_nombre.setFont(new java.awt.Font("Arial", 1, 11));
        lbl_nombre.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombre.setText("Nombre del Proyecto :");

        javax.swing.GroupLayout Pan_tipo_redLayout = new javax.swing.GroupLayout(Pan_tipo_red);
        Pan_tipo_red.setLayout(Pan_tipo_redLayout);
        Pan_tipo_redLayout.setHorizontalGroup(
            Pan_tipo_redLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pan_tipo_redLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pan_tipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Pan_tipo_redLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pan_tipo_redLayout.createSequentialGroup()
                        .addComponent(lbl_nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Pan_capas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Pan_tipo_redLayout.setVerticalGroup(
            Pan_tipo_redLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pan_tipo_redLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pan_tipo_redLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pan_capas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(Pan_tipo_redLayout.createSequentialGroup()
                .addComponent(Pan_tipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Pan_seleccion_datos.setBackground(new java.awt.Color(102, 102, 102));
        Pan_seleccion_datos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccion de Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 255, 51))); // NOI18N
        Pan_seleccion_datos.setForeground(new java.awt.Color(0, 204, 0));

        lst_tablas.setFont(new java.awt.Font("Arial", 1, 11));
        lst_tablas.setForeground(new java.awt.Color(51, 153, 0));
        lst_tablas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lst_tablas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lst_tablasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lst_tablas);
        llenar_tablas();

        tbl_tablas_datos.setBackground(new java.awt.Color(102, 102, 102));
        tbl_tablas_datos.setForeground(new java.awt.Color(255, 255, 255));
        tbl_tablas_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_tablas_datos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbl_tablas_datos.setAutoscrolls(false);
        tbl_tablas_datos.setGridColor(new java.awt.Color(204, 255, 204));
        tbl_tablas_datos.setSelectionForeground(new java.awt.Color(255, 255, 204));
        jScrollPane4.setViewportView(tbl_tablas_datos);

        javax.swing.GroupLayout Pan_seleccion_datosLayout = new javax.swing.GroupLayout(Pan_seleccion_datos);
        Pan_seleccion_datos.setLayout(Pan_seleccion_datosLayout);
        Pan_seleccion_datosLayout.setHorizontalGroup(
            Pan_seleccion_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pan_seleccion_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
        );
        Pan_seleccion_datosLayout.setVerticalGroup(
            Pan_seleccion_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pan_seleccion_datosLayout.createSequentialGroup()
                .addGroup(Pan_seleccion_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnVerTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/zoom_in.png"))); // NOI18N
        btnVerTabla.setOpaque(false);
        btnVerTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pan_arquitecturaLayout = new javax.swing.GroupLayout(Pan_arquitectura);
        Pan_arquitectura.setLayout(Pan_arquitecturaLayout);
        Pan_arquitecturaLayout.setHorizontalGroup(
            Pan_arquitecturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pan_arquitecturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pan_arquitecturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pan_tipo_red, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Pan_arquitecturaLayout.createSequentialGroup()
                        .addComponent(Pan_seleccion_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Pan_arquitecturaLayout.setVerticalGroup(
            Pan_arquitecturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pan_arquitecturaLayout.createSequentialGroup()
                .addComponent(Pan_tipo_red, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pan_arquitecturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pan_seleccion_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Pan_arquitecturaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(btnVerTabla)
                        .addGap(86, 86, 86))))
        );

        Pan_dinamica.setBackground(new java.awt.Color(102, 102, 102));
        Pan_dinamica.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dinamica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 255, 51))); // NOI18N
        Pan_dinamica.setForeground(new java.awt.Color(0, 204, 0));

        lbl_funcion_activacion.setBackground(java.awt.Color.white);
        lbl_funcion_activacion.setFont(new java.awt.Font("Arial", 1, 11));
        lbl_funcion_activacion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_funcion_activacion.setText("Funciones Activacion :");

        cmb_funcion_activacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmb_funcion_activacion.setForeground(new java.awt.Color(255, 51, 51));
        cmb_funcion_activacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_funcion_activacionItemStateChanged(evt);
            }
        });
        cmb_funcion_activacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_funcion_activacionActionPerformed(evt);
            }
        });

        lbl_pesos.setBackground(java.awt.Color.white);
        lbl_pesos.setFont(new java.awt.Font("Arial", 1, 11));
        lbl_pesos.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pesos.setText("Pesos Aleatorios entre :");

        txt_peso1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txt_peso1.setForeground(new java.awt.Color(255, 51, 51));
        txt_peso1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_peso1.setText("-0.5");
        txt_peso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_peso1ActionPerformed(evt);
            }
        });

        txt_peso2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txt_peso2.setForeground(new java.awt.Color(255, 51, 51));
        txt_peso2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_peso2.setText("0.5");
        txt_peso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_peso2ActionPerformed(evt);
            }
        });

        lbl_peso_entre.setBackground(java.awt.Color.white);
        lbl_peso_entre.setFont(new java.awt.Font("Arial", 1, 11));
        lbl_peso_entre.setForeground(new java.awt.Color(255, 255, 255));
        lbl_peso_entre.setText("entre");

        btn_imagen_funcion.setBackground(new java.awt.Color(102, 102, 102));
        btn_imagen_funcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_imagenes/1.png"))); // NOI18N

        btnAyuda3.setBackground(new java.awt.Color(102, 255, 102));
        btnAyuda3.setForeground(new java.awt.Color(102, 102, 102));
        btnAyuda3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/help.png"))); // NOI18N
        btnAyuda3.setToolTipText("Función de activación que modificará los estados cada neurona de la red neuronal");
        btnAyuda3.setBorder(null);
        btnAyuda3.setFocusable(false);
        btnAyuda3.setOpaque(false);
        btnAyuda3.setSelected(true);
        btnAyuda3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyuda3ActionPerformed(evt);
            }
        });

        btnAyuda4.setBackground(new java.awt.Color(102, 255, 102));
        btnAyuda4.setForeground(new java.awt.Color(102, 102, 102));
        btnAyuda4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/help.png"))); // NOI18N
        btnAyuda4.setToolTipText("Rango de valores que se utilizarán para la asignación de los pesos sinápticos iniciales de la red");
        btnAyuda4.setBorder(null);
        btnAyuda4.setFocusable(false);
        btnAyuda4.setOpaque(false);
        btnAyuda4.setSelected(true);
        btnAyuda4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyuda4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pan_dinamicaLayout = new javax.swing.GroupLayout(Pan_dinamica);
        Pan_dinamica.setLayout(Pan_dinamicaLayout);
        Pan_dinamicaLayout.setHorizontalGroup(
            Pan_dinamicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pan_dinamicaLayout.createSequentialGroup()
                .addGroup(Pan_dinamicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pan_dinamicaLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lbl_funcion_activacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(btnAyuda3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_funcion_activacion, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pan_dinamicaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnAyuda4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_pesos)
                        .addGap(18, 18, 18)
                        .addComponent(txt_peso1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_peso_entre)
                        .addGap(18, 18, 18)
                        .addComponent(txt_peso2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pan_dinamicaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_imagen_funcion, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Pan_dinamicaLayout.setVerticalGroup(
            Pan_dinamicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pan_dinamicaLayout.createSequentialGroup()
                .addGroup(Pan_dinamicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAyuda3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_funcion_activacion)
                    .addComponent(lbl_funcion_activacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_imagen_funcion)
                .addGap(12, 12, 12)
                .addGroup(Pan_dinamicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAyuda4, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(txt_peso1)
                    .addComponent(txt_peso2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pan_dinamicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_pesos)
                        .addComponent(lbl_peso_entre)))
                .addGap(21, 21, 21))
        );

        llenar_combo_funcion();

        lbl_factor_aprendizaje.setBackground(new java.awt.Color(102, 102, 102));
        lbl_factor_aprendizaje.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valores de entrenamiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 255, 51))); // NOI18N

        lbl_funcion_activacion1.setBackground(java.awt.Color.white);
        lbl_funcion_activacion1.setFont(new java.awt.Font("Arial", 1, 11));
        lbl_funcion_activacion1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_funcion_activacion1.setText("Factor de Aprendizaje :");

        lbl_ciclos.setBackground(java.awt.Color.white);
        lbl_ciclos.setFont(new java.awt.Font("Arial", 1, 11));
        lbl_ciclos.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ciclos.setText("Ciclos / Repeticion :");

        txt_factor_aprendizaje.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txt_factor_aprendizaje.setForeground(new java.awt.Color(255, 51, 51));
        txt_factor_aprendizaje.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_factor_aprendizaje.setText("0.8");
        txt_factor_aprendizaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_factor_aprendizajeActionPerformed(evt);
            }
        });

        txt_ciclos.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txt_ciclos.setForeground(new java.awt.Color(255, 51, 51));
        txt_ciclos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_ciclos.setText("10000");
        txt_ciclos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ciclosActionPerformed(evt);
            }
        });

        lbl_umbral.setBackground(java.awt.Color.white);
        lbl_umbral.setFont(new java.awt.Font("Arial", 1, 11));
        lbl_umbral.setForeground(new java.awt.Color(255, 255, 255));
        lbl_umbral.setText("Valor Umbral :");

        txt_umbral.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txt_umbral.setForeground(new java.awt.Color(255, 51, 51));
        txt_umbral.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_umbral.setText("-1");
        txt_umbral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_umbralActionPerformed(evt);
            }
        });

        lbl_ciclos1.setBackground(java.awt.Color.white);
        lbl_ciclos1.setFont(new java.awt.Font("Arial", 1, 11));
        lbl_ciclos1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ciclos1.setText("% MSE Total :");

        txt_error.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txt_error.setForeground(new java.awt.Color(255, 51, 51));
        txt_error.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_error.setText("0.001");
        txt_error.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_errorActionPerformed(evt);
            }
        });

        lbl_momento.setBackground(java.awt.Color.white);
        lbl_momento.setFont(new java.awt.Font("Arial", 1, 11));
        lbl_momento.setForeground(new java.awt.Color(255, 255, 255));
        lbl_momento.setText("Momento :");

        txt_momento.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txt_momento.setForeground(new java.awt.Color(255, 51, 51));
        txt_momento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_momento.setText("0.7");
        txt_momento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_momentoActionPerformed(evt);
            }
        });

        lbl_ciclos2.setBackground(java.awt.Color.white);
        lbl_ciclos2.setFont(new java.awt.Font("Arial", 1, 11));
        lbl_ciclos2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ciclos2.setText("% MSE por patón :");

        txt_error1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txt_error1.setForeground(new java.awt.Color(255, 51, 51));
        txt_error1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_error1.setText("0.001");
        txt_error1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_error1ActionPerformed(evt);
            }
        });

        btnAyuda5.setBackground(new java.awt.Color(102, 255, 102));
        btnAyuda5.setForeground(new java.awt.Color(102, 102, 102));
        btnAyuda5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/help.png"))); // NOI18N
        btnAyuda5.setToolTipText("Factor multiplicador para cada interación n-1");
        btnAyuda5.setBorder(null);
        btnAyuda5.setFocusable(false);
        btnAyuda5.setOpaque(false);
        btnAyuda5.setSelected(true);
        btnAyuda5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyuda5ActionPerformed(evt);
            }
        });

        btnAyuda6.setBackground(new java.awt.Color(102, 255, 102));
        btnAyuda6.setForeground(new java.awt.Color(102, 102, 102));
        btnAyuda6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/help.png"))); // NOI18N
        btnAyuda6.setToolTipText("Factor utilizado para el aprendizaje de la red");
        btnAyuda6.setBorder(null);
        btnAyuda6.setFocusable(false);
        btnAyuda6.setOpaque(false);
        btnAyuda6.setSelected(true);
        btnAyuda6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyuda6ActionPerformed(evt);
            }
        });

        btnAyuda7.setBackground(new java.awt.Color(102, 255, 102));
        btnAyuda7.setForeground(new java.awt.Color(102, 102, 102));
        btnAyuda7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/help.png"))); // NOI18N
        btnAyuda7.setToolTipText("Valor de la entrada umbral para cada neurona");
        btnAyuda7.setBorder(null);
        btnAyuda7.setFocusable(false);
        btnAyuda7.setOpaque(false);
        btnAyuda7.setSelected(true);
        btnAyuda7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyuda7ActionPerformed(evt);
            }
        });

        btnAyuda8.setBackground(new java.awt.Color(102, 255, 102));
        btnAyuda8.setForeground(new java.awt.Color(102, 102, 102));
        btnAyuda8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/help.png"))); // NOI18N
        btnAyuda8.setToolTipText("Condición de parada basado en el número de ciclos de ejecución del proceso de aprendizaje");
        btnAyuda8.setBorder(null);
        btnAyuda8.setFocusable(false);
        btnAyuda8.setOpaque(false);
        btnAyuda8.setSelected(true);
        btnAyuda8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyuda8ActionPerformed(evt);
            }
        });

        btnAyuda9.setBackground(new java.awt.Color(102, 255, 102));
        btnAyuda9.setForeground(new java.awt.Color(102, 102, 102));
        btnAyuda9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/help.png"))); // NOI18N
        btnAyuda9.setToolTipText("Condición de parada del entrenamiento basado en el porcentaje de error total por época");
        btnAyuda9.setBorder(null);
        btnAyuda9.setFocusable(false);
        btnAyuda9.setOpaque(false);
        btnAyuda9.setSelected(true);
        btnAyuda9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyuda9ActionPerformed(evt);
            }
        });

        btnAyuda10.setBackground(new java.awt.Color(102, 255, 102));
        btnAyuda10.setForeground(new java.awt.Color(102, 102, 102));
        btnAyuda10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/help.png"))); // NOI18N
        btnAyuda10.setToolTipText("Condición de parada del entrenamiento basado en el porcentaje de error por patrón");
        btnAyuda10.setBorder(null);
        btnAyuda10.setFocusable(false);
        btnAyuda10.setOpaque(false);
        btnAyuda10.setSelected(true);
        btnAyuda10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyuda10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lbl_factor_aprendizajeLayout = new javax.swing.GroupLayout(lbl_factor_aprendizaje);
        lbl_factor_aprendizaje.setLayout(lbl_factor_aprendizajeLayout);
        lbl_factor_aprendizajeLayout.setHorizontalGroup(
            lbl_factor_aprendizajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl_factor_aprendizajeLayout.createSequentialGroup()
                .addGroup(lbl_factor_aprendizajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lbl_factor_aprendizajeLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAyuda6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_funcion_activacion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_factor_aprendizaje, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbl_factor_aprendizajeLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(lbl_factor_aprendizajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(lbl_factor_aprendizajeLayout.createSequentialGroup()
                                .addComponent(btnAyuda5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_momento))
                            .addGroup(lbl_factor_aprendizajeLayout.createSequentialGroup()
                                .addComponent(btnAyuda7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_umbral))
                            .addGroup(lbl_factor_aprendizajeLayout.createSequentialGroup()
                                .addComponent(btnAyuda8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lbl_ciclos))
                            .addGroup(lbl_factor_aprendizajeLayout.createSequentialGroup()
                                .addComponent(btnAyuda9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_ciclos1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(lbl_factor_aprendizajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_error, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(txt_ciclos, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(txt_umbral, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(txt_momento, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbl_factor_aprendizajeLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnAyuda10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_ciclos2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_error1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        lbl_factor_aprendizajeLayout.setVerticalGroup(
            lbl_factor_aprendizajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl_factor_aprendizajeLayout.createSequentialGroup()
                .addGroup(lbl_factor_aprendizajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAyuda6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_funcion_activacion1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_factor_aprendizaje, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl_factor_aprendizajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAyuda5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_momento)
                    .addComponent(lbl_momento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl_factor_aprendizajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lbl_factor_aprendizajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_umbral)
                        .addComponent(txt_umbral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAyuda7, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl_factor_aprendizajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAyuda8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_ciclos)
                    .addComponent(lbl_ciclos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl_factor_aprendizajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lbl_factor_aprendizajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_ciclos1)
                        .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAyuda9, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl_factor_aprendizajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAyuda10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_error1)
                    .addComponent(lbl_ciclos2))
                .addGap(56, 56, 56))
        );

        Pan_control.setBackground(new java.awt.Color(102, 102, 102));
        Pan_control.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Control", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(0, 204, 0))); // NOI18N
        Pan_control.setForeground(new java.awt.Color(0, 204, 0));

        btn_aceptar.setBackground(new java.awt.Color(255, 255, 255));
        btn_aceptar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_aceptar.setForeground(new java.awt.Color(255, 255, 255));
        btn_aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/accept.png"))); // NOI18N
        btn_aceptar.setMnemonic('A');
        btn_aceptar.setText("Aceptar");
        btn_aceptar.setOpaque(false);
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn_limpiar.setBackground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/page.png"))); // NOI18N
        btn_limpiar.setMnemonic('L');
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setOpaque(false);
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/door_out.png"))); // NOI18N
        btn_salir.setMnemonic('S');
        btn_salir.setText("Salir");
        btn_salir.setOpaque(false);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pan_controlLayout = new javax.swing.GroupLayout(Pan_control);
        Pan_control.setLayout(Pan_controlLayout);
        Pan_controlLayout.setHorizontalGroup(
            Pan_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pan_controlLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(btn_aceptar)
                .addGap(18, 18, 18)
                .addComponent(btn_limpiar)
                .addGap(67, 67, 67)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );
        Pan_controlLayout.setVerticalGroup(
            Pan_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pan_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_aceptar)
                .addComponent(btn_salir)
                .addComponent(btn_limpiar))
        );

        lbl_descripcion.setBackground(java.awt.Color.white);
        lbl_descripcion.setFont(new java.awt.Font("Arial", 1, 11));
        lbl_descripcion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_descripcion.setText("Descripcion :");

        txt_descripcion.setBackground(new java.awt.Color(102, 102, 102));
        txt_descripcion.setColumns(20);
        txt_descripcion.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txt_descripcion.setForeground(new java.awt.Color(255, 255, 255));
        txt_descripcion.setRows(5);
        jScrollPane3.setViewportView(txt_descripcion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pan_arquitectura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Pan_dinamica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_factor_aprendizaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_descripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Pan_control, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pan_arquitectura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_factor_aprendizaje, 0, 187, Short.MAX_VALUE)
                    .addComponent(Pan_dinamica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbl_descripcion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pan_control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        setBounds(110, 50, 824, 635);
    }// </editor-fold>//GEN-END:initComponents

private void llenar_tablas()
{
     sql= "SELECT table_name FROM `information_schema`.`TABLES` where table_schema='tablas'";
      resultado= clase_sql.ejecutarSelect(sql);
        try{
              while( resultado.next())
              {
                   modelo_lista.addElement(resultado.getString(1));
              }
                this.lst_tablas.setModel(modelo_lista);
            }
        catch(SQLException e)
        {
            mensajes.showMessageDialog(null, e.toString(), titulo_mensajes, mensajes.ERROR_MESSAGE);
        }
}

private void llenar_campos()
{   javax.swing.table.DefaultTableModel modelo= new javax.swing.table.DefaultTableModel();
     sql= " SELECT column_name FROM `information_schema`.`COLUMNS` where table_name='" +modelo_lista.getElementAt(this.lst_tablas.getSelectedIndex()) + "' order by ordinal_position asc";

      resultado= clase_sql.ejecutarSelect(sql);

        try{
                  while( resultado.next())
                  {
                      modelo.addColumn(resultado.getString(1));
                  }
                      this.tbl_tablas_datos.setModel(modelo);
          }
        catch(SQLException e)
        {
                mensajes.showMessageDialog(null, e.toString(), titulo_mensajes, mensajes.ERROR_MESSAGE);
        }

        sql= " SELECT * FROM `tablas`.`" + modelo_lista.getElementAt(this.lst_tablas.getSelectedIndex()) +"`";
   
        resultado=clase_sql.ejecutarSelect(sql);
       try{
                  while(resultado.next())
                  {

                      Object [] filas = new Object[modelo.getColumnCount()];
                      for ( i=0;i<modelo.getColumnCount();i++)
                      {
                          filas[i]=resultado.getString(i+1);
                      }
                      modelo.addRow(filas);
                  }

          }
        catch(SQLException e)
        {
               mensajes.showMessageDialog(null, e.toString(), titulo_mensajes, mensajes.ERROR_MESSAGE);
        }

       formato();
   
cls_variables_globales.tabla_analisis_datos = this.tbl_tablas_datos;
    
}
 private void formato()
    {
        tcr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        for(fil=1;fil<this.tbl_tablas_datos.getColumnCount();fil++)
        {
            this.tbl_tablas_datos.getColumnModel().getColumn(fil).setCellRenderer(tcr);
            this.tbl_tablas_datos.getColumnModel().getColumn(fil).setWidth(30);
        }
    }

    private void llenar_combo_funcion()
    {
        sql= " SELECT fun_descripcion,fun_id FROM redesneuronales.tab_funcion_activacion ";
        resultado=clase_sql.ejecutarSelect(sql);
        try
        {
            i=0;
            while(resultado.next())
            {
                this.cmb_funcion_activacion.addItem(resultado.getString("fun_descripcion"));
                 id_funcion[i]=resultado.getInt("fun_id");
                i=i+1;
            }
        }
        catch(SQLException e)
        {mensajes.showMessageDialog(null, e.toString(), titulo_mensajes, mensajes.ERROR_MESSAGE);}
}

 public void llenar_proyecto_existente(int numProyecto)
 { String tabla="";
   double peso1=0;
   double peso2=0;

     sql= clase_sql.armarQuery("traer_proyecto_existente") + numProyecto;
   
        resultado= clase_sql.ejecutarSelect(clase_sql.armarQuery("traer_proyecto_existente") + numProyecto);
     try{
            while(resultado.next())
            {
                this.txt_descripcion.setText( resultado.getString("pro_descripcion"));
                this.txt_nombreProyecto.setText(resultado.getString("pro_nombre"));
                paq_logica.cls_variables_globales.idProyecto = numProyecto;
                paq_logica.cls_variables_globales.nombreProyecto= this.txt_nombreProyecto.getText();
                peso1=resultado.getDouble("red_peso1");
                peso2=resultado.getDouble("red_peso2");
                this.txt_peso1.setText(Double.toString(peso1));
                 this.txt_peso2.setText(Double.toString(peso2));
                 this.txt_ciclos.setText (Integer.toString(resultado.getInt("red_ciclos")));
                 this.cmb_funcion_activacion.setSelectedIndex(resultado.getInt("fun_id"));
                 this.title= "Poryecto existente # " + resultado.getInt("pro_id");
                 this.txt_factor_aprendizaje.setText(Double.toString(resultado.getDouble("red_factor_aprendizaje")));
                 this.txt_momento.setText(Double.toString(resultado.getDouble("red_momento")));
                 this.txt_error.setText(Double.toString(resultado.getDouble("red_error_deseado")));
                 this.txt_error1.setText(Double.toString(resultado.getDouble("red_error_patron")));
                 switch (resultado.getInt("cap_id"))
                 {
                       case 0: this.txt_num_entradas.setText(Integer.toString(resultado.getInt("cap_num_neuronas")));
                            break;
                       case 1: this.txt_num_ocultas.setText(Integer.toString(resultado.getInt("cap_num_neuronas")));
                            break;
                       case 2: this.txt_num_salidas.setText(Integer.toString(resultado.getInt("cap_num_neuronas")));
                            break;
                 }
                 tabla=resultado.getString("pro_tabla");
                 paq_logica.cls_variables_globales.nombreTabla= tabla;

            }
              this.lst_tablas.setSelectedValue(tabla,true);
     }
    catch(SQLException e)
    {
        mensajes.showMessageDialog(null, e.toString(), titulo_mensajes, mensajes.ERROR_MESSAGE);
    }

       ven_MDI.nueva_red= new Red_FeedForward(Integer.parseInt(this.txt_num_entradas.getText()),Integer.parseInt(this.txt_num_ocultas.getText()),Integer.parseInt(this.txt_num_salidas.getText()),  Double.parseDouble(this.txt_factor_aprendizaje.getText()), Integer.parseInt(this.txt_ciclos.getText()),peso1,peso2);
       ven_MDI.nueva_red.setFuncionActivacion(this.cmb_funcion_activacion.getSelectedIndex());
       ven_MDI.nueva_red.setIdProyecto(numProyecto);
       ven_MDI.nueva_red.setId(numProyecto);
       ven_MDI.nueva_red.setEntradaUmbral(Double.parseDouble(this.txt_umbral.getText()));
       paq_logica.cls_variables_globales.constanteAmplitudActivacion=Double.parseDouble(this.txt_umbral.getText());
       ven_MDI.nueva_red.setFuncionActivacion(this.cmb_funcion_activacion.getSelectedIndex());
       ven_MDI.nueva_red.setMomento(Double.parseDouble(this.txt_momento.getText()));
       ven_MDI.nueva_red.setErrorDeseado(Double.parseDouble(this.txt_error.getText()));
       ven_MDI.nueva_red.setErrorDeseadoPatron(Double.parseDouble(this.txt_error1.getText()));
       ven_MDI.nueva_red.setTabla(modelo_lista.getElementAt(this.lst_tablas.getSelectedIndex()).toString() );

        resultado= clase_sql.ejecutarSelect(clase_sql.armarQuery("select_sinapsis") + ven_MDI.nueva_red.getIdProyecto());
        try
        {
                while(resultado.next())
                {
                    ven_MDI.nueva_red.setSinapsis(resultado.getInt("id_capa_origen"), resultado.getInt("sin_id_neurona_origen"), resultado.getInt("id_capa_destino"), resultado.getInt("sin_id_neurona_destino"), resultado.getDouble("sin_valor_peso"));
                }

        }
        catch(SQLException e)
        {
              mensajes.showMessageDialog(null, e.toString(), titulo_mensajes, mensajes.ERROR_MESSAGE);
        }

        resultado=clase_sql.ejecutarSelect(clase_sql.armarQuery("select_umbrales")+ ven_MDI.nueva_red.getIdProyecto());
        try
        {
            while(resultado.next())
            {
                ven_MDI.nueva_red.setPesosUmbrales(resultado.getInt("cap_id"), resultado.getInt( "neu_id"), resultado.getDouble( "neu_peso_umbral"));
            }
        }
        catch(SQLException e)
        {
            mensajes.showMessageDialog(null, e.toString(), titulo_mensajes, mensajes.ERROR_MESSAGE);
        }
       paq_logica.cls_variables_globales.red_actual=ven_MDI.nueva_red;

 }


    private void rad_percetron_simpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_percetron_simpleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rad_percetron_simpleActionPerformed

    private void txt_num_entradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_num_entradasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_num_entradasActionPerformed

    private void txt_num_salidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_num_salidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_num_salidasActionPerformed

    private void txt_num_ocultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_num_ocultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_num_ocultasActionPerformed

    private void txt_peso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_peso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_peso1ActionPerformed

    private void txt_peso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_peso2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_peso2ActionPerformed

    private void txt_factor_aprendizajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_factor_aprendizajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_factor_aprendizajeActionPerformed

    private void txt_ciclosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ciclosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ciclosActionPerformed

    private void txt_umbralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_umbralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_umbralActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
            dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void lst_tablasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lst_tablasValueChanged
        llenar_campos ();
    }//GEN-LAST:event_lst_tablasValueChanged

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
     try
     {
      if (this.validarCamposEntrada())
             {
                   // crear la red
                   nueva_red= new Red_FeedForward(Integer.parseInt(this.txt_num_entradas.getText()),Integer.parseInt(this.txt_num_ocultas.getText()),Integer.parseInt(this.txt_num_salidas.getText()),  Double.parseDouble(this.txt_factor_aprendizaje.getText()), Integer.parseInt(this.txt_ciclos.getText()),Double.parseDouble(this.txt_peso1.getText()), Double.parseDouble(this.txt_peso2.getText()) );
                   nueva_red.setId(nuevoProyecto.getSecuencia("tab_red"));
                   nueva_red.setMomento(Double.parseDouble(this.txt_momento.getText()));
                   nueva_red.setTabla(modelo_lista.getElementAt(this.lst_tablas.getSelectedIndex()).toString() );
                   nueva_red.setFuncionActivacion(this.cmb_funcion_activacion.getSelectedIndex());
                   nueva_red.setErrorDeseado(Double.parseDouble(this.txt_error.getText()));
                   nueva_red.setErrorDeseadoPatron(Double.parseDouble(this.txt_error1.getText()));
                   nueva_red.setEntradaUmbral(Double.parseDouble(this.txt_umbral.getText()));
                   paq_logica.cls_variables_globales.constanteAmplitudActivacion=Double.parseDouble(this.txt_umbral.getText());

                       if ( nuevoProyecto.nuevoProyecto(this.txt_nombreProyecto.getText(),this.txt_descripcion.getText(), usuario,nueva_red, modelo_lista.getElementAt(this.lst_tablas.getSelectedIndex()).toString() )  )
                             {
                                    mensajes.showMessageDialog(null , "Registro del Proyecto Correctamente", titulo_mensajes, mensajes.INFORMATION_MESSAGE, null);
                                    ven_DibujoNeuronal dibujo= new ven_DibujoNeuronal( nueva_red);
                                    ven_MDI.Panel_escritorio.add(dibujo);
                                    ven_MDI.nueva_red = nueva_red;
                                    paq_logica.cls_variables_globales.red_actual=nueva_red;

                                    dibujo.show();


                              }
                       else
                             mensajes.showMessageDialog(null , "Error al ingresar Proyecto", titulo_mensajes, mensajes.WARNING_MESSAGE);
             }
        }
      catch(Exception e)
     {
          mensajes.showMessageDialog(null, e.toString(),titulo_mensajes,mensajes.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_btn_aceptarActionPerformed

    public Red_FeedForward getRedNueva()
    {
        return this.nueva_red;
    }
   
    private boolean validarCamposEntrada()
    {
        if (this.txt_nombreProyecto.getText().equals(""))
        {
            mensajes.showMessageDialog(null , "Debe ingresar un nombre al proyecto!", titulo_mensajes,  mensajes.WARNING_MESSAGE);
            this.txt_nombreProyecto.requestFocus();
            return false;
        }
        else
        {
            if (!validarNumeroNeuronas(0)||!validarNumeroNeuronas(1)||!validarNumeroNeuronas(2))
               {
                        mensajes.showMessageDialog(null , "Numero de Neuronas por capa es invalido!", titulo_mensajes, mensajes.WARNING_MESSAGE);
                        return false;
               }
            else
            {
                if (this.lst_tablas.getSelectedIndex()==-1)
                {
                        mensajes.showMessageDialog(null , "Seleccione una tabla de datos a analizar!", titulo_mensajes, mensajes.WARNING_MESSAGE);
                        return false;
                }
                else
                {
                    if (this.cmb_funcion_activacion.getSelectedIndex()==-1)
                    {
                        mensajes.showMessageDialog(null , "Seleccione una función de activación!", titulo_mensajes, mensajes.WARNING_MESSAGE);
                        return false;
                    }
                    else
                    {
                        if(!validarNumerosCiclos())
                        {
                            mensajes.showMessageDialog(null , "Numero de ciclos es invalido!", titulo_mensajes, mensajes.WARNING_MESSAGE);
                            return false;
                        }
                        else
                        {
                            if (!validarValoresEntrenamiento())
                            {
                                mensajes.showMessageDialog(null , "Valores no válidos en párametros de entrenamiento!", titulo_mensajes, mensajes.WARNING_MESSAGE);
                                return false;
                            }
                            else
                            {
                                if (!validarPesosAleatorios())
                                {
                                    mensajes.showMessageDialog(null , "Valores no válidos en los pesos aleatorios!", titulo_mensajes, mensajes.WARNING_MESSAGE);
                                    return false;
                                }
                                else
                                    return true;
                            }
                                
                        }
                    }
                }
            }
        }

    }

    private boolean validarNumeroNeuronas(int capa)
    {
        try{
            switch (capa)
                {
                    case 0:
                            if(Integer.parseInt(this.txt_num_entradas.getText())>0)
                                    return true;
                                    break;
                     case 1:
                            if(Integer.parseInt(this.txt_num_ocultas.getText())>0)
                                    return true;
                                    break;
                     case 2:
                            if(Integer.parseInt(this.txt_num_salidas.getText())>0)
                                    return true;
                                    break;
                }
                return false;
            }
        catch(Exception ex)
        {
            mensajes.showMessageDialog(null, "Debe ingresar un número valido en las neuronas por capa!", titulo_mensajes, mensajes.ERROR_MESSAGE);
            return false;
        }
    }
    private boolean validarNumerosCiclos()
    {
        try
        {
            if(Integer.parseInt(this.txt_ciclos.getText())>0)
                return true;
            return false;
        }
        catch(Exception e)
        {
            mensajes.showMessageDialog(null, "Debe ingresar un número valido de ciclos de entrenamiento!", titulo_mensajes, mensajes.ERROR_MESSAGE);
            return false;
        }
    }
    private boolean validarValoresEntrenamiento()
    {
        try
        {
            if (Double.parseDouble(this.txt_factor_aprendizaje.getText())!=0 && Double.parseDouble(this.txt_momento.getText())!=0 && Double.parseDouble(this.txt_error.getText())!=0 && Double.parseDouble(this.txt_error1.getText())!=0 && Double.parseDouble(this.txt_umbral.getText())!=0)
                return true;
            return false;
        }
        catch(Exception e)
        {
            mensajes.showMessageDialog(null, "Valores no validos en los parámetros de entrenemiento!", titulo_mensajes, mensajes.ERROR_MESSAGE);
            return false;
        }
    }
    private boolean validarPesosAleatorios()
    {
        try
        {
            if (Double.parseDouble(this.txt_peso1.getText())!=0 && Double.parseDouble(this.txt_peso2.getText())!=0)
                return true;
            return true;
        }
        catch(Exception e)
        {
            mensajes.showMessageDialog(null, "Rango de pesos aleatorios no válidos!", titulo_mensajes, mensajes.ERROR_MESSAGE);
            return false;
        }


    }
    private void cmb_funcion_activacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_funcion_activacionItemStateChanged
       
        btn_imagen_funcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_imagenes/" + id_funcion[this.cmb_funcion_activacion.getSelectedIndex()] +".png")));
   
    }//GEN-LAST:event_cmb_funcion_activacionItemStateChanged

    private void txt_errorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_errorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_errorActionPerformed

    private void cmb_funcion_activacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_funcion_activacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_funcion_activacionActionPerformed

    private void txt_momentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_momentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_momentoActionPerformed

    private void txt_error1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_error1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_error1ActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btnVerTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTablaActionPerformed
        ven_TablaBaseDatos ventana_tabla= new ven_TablaBaseDatos();
        ven_MDI.Panel_escritorio.add(ventana_tabla);
        ventana_tabla.llenar_tabla(cls_variables_globales.tabla_analisis_datos );
        ventana_tabla.show();
    }//GEN-LAST:event_btnVerTablaActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        this.btnAyuda.setRequestFocusEnabled(true);
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnAyuda3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyuda3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAyuda3ActionPerformed

    private void btnAyuda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyuda4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAyuda4ActionPerformed

    private void btnAyuda5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyuda5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAyuda5ActionPerformed

    private void btnAyuda6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyuda6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAyuda6ActionPerformed

    private void btnAyuda7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyuda7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAyuda7ActionPerformed

    private void btnAyuda8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyuda8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAyuda8ActionPerformed

    private void btnAyuda9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyuda9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAyuda9ActionPerformed

    private void btnAyuda10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyuda10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAyuda10ActionPerformed

    private void limpiar()
    {
            this.txt_ciclos.setText("");
            this.txt_descripcion.setText("");
            this.txt_error.setText("");
            this.txt_error1.setText("");
            this.txt_factor_aprendizaje.setText("");
            this.txt_num_entradas.setText("");
            this.txt_num_ocultas.setText("");
            this.txt_num_salidas.setText("");
            this.txt_umbral.setText("");
            this.txt_momento.setText("");
            this.txt_descripcion.setText("");
            this.txt_peso1.setText("");
            this.txt_peso2.setText("");
            this.txt_nombreProyecto.setText("");
            this.txt_nombreProyecto.requestFocus();
            this.lst_tablas.setSelectedIndex(-1);
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pan_arquitectura;
    private javax.swing.JPanel Pan_capas;
    private javax.swing.JPanel Pan_control;
    private javax.swing.JPanel Pan_dinamica;
    private javax.swing.JPanel Pan_seleccion_datos;
    private javax.swing.JPanel Pan_tipo_red;
    private javax.swing.JPanel Pan_tipos;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnAyuda1;
    private javax.swing.JButton btnAyuda10;
    private javax.swing.JButton btnAyuda2;
    private javax.swing.JButton btnAyuda3;
    private javax.swing.JButton btnAyuda4;
    private javax.swing.JButton btnAyuda5;
    private javax.swing.JButton btnAyuda6;
    private javax.swing.JButton btnAyuda7;
    private javax.swing.JButton btnAyuda8;
    private javax.swing.JButton btnAyuda9;
    private javax.swing.JButton btnVerTabla;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_imagen_funcion;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox cmb_funcion_activacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_ciclos;
    private javax.swing.JLabel lbl_ciclos1;
    private javax.swing.JLabel lbl_ciclos2;
    private javax.swing.JLabel lbl_descripcion;
    private javax.swing.JLabel lbl_entrada;
    private javax.swing.JPanel lbl_factor_aprendizaje;
    private javax.swing.JLabel lbl_funcion_activacion;
    private javax.swing.JLabel lbl_funcion_activacion1;
    private javax.swing.JLabel lbl_momento;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_oculta;
    private javax.swing.JLabel lbl_peso_entre;
    private javax.swing.JLabel lbl_pesos;
    private javax.swing.JLabel lbl_salida;
    private javax.swing.JLabel lbl_umbral;
    private javax.swing.JList lst_tablas;
    private javax.swing.JRadioButton rad_feedForward;
    private javax.swing.JRadioButton rad_perceptron_multicapa;
    private javax.swing.JRadioButton rad_percetron_simple;
    private javax.swing.JTable tbl_tablas_datos;
    private javax.swing.JTextField txt_ciclos;
    private javax.swing.JTextArea txt_descripcion;
    private javax.swing.JTextField txt_error;
    private javax.swing.JTextField txt_error1;
    private javax.swing.JTextField txt_factor_aprendizaje;
    private javax.swing.JTextField txt_momento;
    private javax.swing.JTextField txt_nombreProyecto;
    private javax.swing.JTextField txt_num_entradas;
    private javax.swing.JTextField txt_num_ocultas;
    private javax.swing.JTextField txt_num_salidas;
    private javax.swing.JTextField txt_peso1;
    private javax.swing.JTextField txt_peso2;
    private javax.swing.JTextField txt_umbral;
    // End of variables declaration//GEN-END:variables
    javax.swing.DefaultListModel modelo_lista= new javax.swing.DefaultListModel();
}
