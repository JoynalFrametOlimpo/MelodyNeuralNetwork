
/*
 * ven_MDI.java
 *
 * Created on 05/06/2010, 06:57:21 PM
 */

package paq_ventanas;

import java.awt.Color;
import paq_arquitectura.*;
import paq_logica.cls_sql;
import paq_logica.cls_variables_globales;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;


/**
 *
 * @author Jonathan
 */
public class ven_MDI extends javax.swing.JFrame {

    cls_sql sql = new cls_sql();
    private ResultSet resultado;
    private ResultSet resultado1;
    public static Red_FeedForward nueva_red;
    public static ven_DibujoNeuronal dibujo;
    private cls_variables_globales numero= new cls_variables_globales();
    private static JOptionPane mensajes;
    private static String titulo_mensajes="Prototipo de Aprendizaje";
    private final ColorUIResource colorBarraTitulo = new ColorUIResource(204, 102, 0);

  
    

    /** Creates new form ven_MDI */
    public ven_MDI() {    
        initComponents();
        this.Panel_escritorio.setBorder(new paq_logica.cls_Imagenfondo());
       
        menuEmergente();
    }
private void menuEmergente()
{
    this.mnu_ver1.setVisible(false);
        this.jPopupMenu1.add(p1);
         this.jPopupMenu1.add(p2);
          this.jPopupMenu1.add(p3);
           this.jPopupMenu1.add(p4);
            this.jPopupMenu1.add(p5);
              this.jPopupMenu1.add(p7);
               this.jPopupMenu1.add(p8);
                this.jPopupMenu1.add(p9);
                 this.jPopupMenu1.add(p10);

}

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuEmergente = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        Panel_escritorio = new javax.swing.JDesktopPane();
        bar_herramientas1 = new javax.swing.JToolBar();
        btn_nuevo_proyecto = new javax.swing.JButton();
        btn_abrir_proyecto = new javax.swing.JButton();
        btn_tabla_analisis = new javax.swing.JButton();
        btn_guardar_proyecto1 = new javax.swing.JButton();
        btn_arquitectura = new javax.swing.JButton();
        btn_curva_error = new javax.swing.JButton();
        btn_curva_aprendizaje1 = new javax.swing.JButton();
        btn_comenzar_aprendizaje = new javax.swing.JButton();
        btn_pausar_aprendizaje = new javax.swing.JButton();
        btn_resultados = new javax.swing.JButton();
        btn_configuracion = new javax.swing.JButton();
        btn_limpiar_bd = new javax.swing.JButton();
        btn_ConfigAccesoDatos = new javax.swing.JButton();
        btn_VerPruebas = new javax.swing.JButton();
        mnu_Bar = new javax.swing.JMenuBar();
        mnu_archivo = new javax.swing.JMenu();
        sub_nuevo = new javax.swing.JMenuItem();
        sub_abrir = new javax.swing.JMenuItem();
        sub_guardar = new javax.swing.JMenuItem();
        sub_guardar_como = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        sub_imprimir = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        sub_salir = new javax.swing.JMenuItem();
        mnu_ver = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem15 = new javax.swing.JMenuItem();
        rbBarraHerramienta = new javax.swing.JCheckBoxMenuItem();
        mnu_atributos = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        opAncho20 = new javax.swing.JRadioButtonMenuItem();
        opAncho40 = new javax.swing.JRadioButtonMenuItem();
        opAncho60 = new javax.swing.JRadioButtonMenuItem();
        opAncho80 = new javax.swing.JRadioButtonMenuItem();
        opAncho100 = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        opAlto20 = new javax.swing.JRadioButtonMenuItem();
        opAlto40 = new javax.swing.JRadioButtonMenuItem();
        opAlto60 = new javax.swing.JRadioButtonMenuItem();
        opAlto80 = new javax.swing.JRadioButtonMenuItem();
        opAlto100 = new javax.swing.JRadioButtonMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        rbX1 = new javax.swing.JRadioButtonMenuItem();
        rbX2 = new javax.swing.JRadioButtonMenuItem();
        jMenu4 = new javax.swing.JMenu();
        rbY1 = new javax.swing.JRadioButtonMenuItem();
        rbY2 = new javax.swing.JRadioButtonMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();
        chkEpoca = new javax.swing.JCheckBoxMenuItem();
        chkPatrones = new javax.swing.JCheckBoxMenuItem();
        jMenu6 = new javax.swing.JMenu();
        chkError = new javax.swing.JCheckBoxMenuItem();
        mnu_ejecucion = new javax.swing.JMenu();
        mnu_iniciar = new javax.swing.JMenuItem();
        mnu_parar = new javax.swing.JMenuItem();
        mnu_herramientas = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        mnu_configuracion = new javax.swing.JMenuItem();
        mnu_accesodatos = new javax.swing.JMenuItem();
        mnu_ventana = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        mnu_ayuda = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        mnu_ver1 = new javax.swing.JMenu();
        p1 = new javax.swing.JMenuItem();
        p2 = new javax.swing.JMenuItem();
        p3 = new javax.swing.JMenuItem();
        p4 = new javax.swing.JPopupMenu.Separator();
        p5 = new javax.swing.JMenuItem();
        p7 = new javax.swing.JPopupMenu.Separator();
        p8 = new javax.swing.JMenuItem();
        p9 = new javax.swing.JPopupMenu.Separator();
        p10 = new javax.swing.JMenuItem();
        p11 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Melody Neural Network V. 1.0.0");
        setBackground(new java.awt.Color(204, 204, 255));
        setIconImage(getIconImage());
        setName("ventana1"); // NOI18N
        setState(2);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_escritorio.setBackground(new java.awt.Color(102, 102, 102));
        Panel_escritorio.setAutoscrolls(true);
        Panel_escritorio.setComponentPopupMenu(jPopupMenu1);
        Panel_escritorio.setInheritsPopupMenu(true);

        bar_herramientas1.setBackground(new java.awt.Color(102, 102, 102));
        bar_herramientas1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bar_herramientas1.setRollover(true);
        bar_herramientas1.setAutoscrolls(true);
        bar_herramientas1.setBorderPainted(false);
        bar_herramientas1.setMaximumSize(new java.awt.Dimension(379, 32769));

        btn_nuevo_proyecto.setBackground(new java.awt.Color(102, 102, 102));
        btn_nuevo_proyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/page_white_add.png"))); // NOI18N
        btn_nuevo_proyecto.setToolTipText("Nuevo Proyecto");
        btn_nuevo_proyecto.setBorderPainted(false);
        btn_nuevo_proyecto.setFocusable(false);
        btn_nuevo_proyecto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_nuevo_proyecto.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_nuevo_proyecto.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_nuevo_proyecto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_nuevo_proyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_proyectoActionPerformed(evt);
            }
        });
        bar_herramientas1.add(btn_nuevo_proyecto);

        btn_abrir_proyecto.setBackground(new java.awt.Color(102, 102, 102));
        btn_abrir_proyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/folder.png"))); // NOI18N
        btn_abrir_proyecto.setToolTipText("Abrir Proyecto");
        btn_abrir_proyecto.setBorderPainted(false);
        btn_abrir_proyecto.setFocusable(false);
        btn_abrir_proyecto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_abrir_proyecto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_abrir_proyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrir_proyectoActionPerformed(evt);
            }
        });
        bar_herramientas1.add(btn_abrir_proyecto);

        btn_tabla_analisis.setBackground(new java.awt.Color(102, 102, 102));
        btn_tabla_analisis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/map_magnify.png"))); // NOI18N
        btn_tabla_analisis.setToolTipText("Tabla Análisis de Datos");
        btn_tabla_analisis.setBorderPainted(false);
        btn_tabla_analisis.setFocusable(false);
        btn_tabla_analisis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_tabla_analisis.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_tabla_analisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tabla_analisisActionPerformed(evt);
            }
        });
        bar_herramientas1.add(btn_tabla_analisis);

        btn_guardar_proyecto1.setBackground(new java.awt.Color(102, 102, 102));
        btn_guardar_proyecto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/table.png"))); // NOI18N
        btn_guardar_proyecto1.setToolTipText("Asignación de patrones de datos ");
        btn_guardar_proyecto1.setBorderPainted(false);
        btn_guardar_proyecto1.setFocusable(false);
        btn_guardar_proyecto1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_guardar_proyecto1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_guardar_proyecto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_proyecto1ActionPerformed(evt);
            }
        });
        bar_herramientas1.add(btn_guardar_proyecto1);

        btn_arquitectura.setBackground(new java.awt.Color(102, 102, 102));
        btn_arquitectura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/chart_line.png"))); // NOI18N
        btn_arquitectura.setToolTipText("Mostrar Red Neuronal");
        btn_arquitectura.setBorderPainted(false);
        btn_arquitectura.setFocusable(false);
        btn_arquitectura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_arquitectura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_arquitectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_arquitecturaActionPerformed(evt);
            }
        });
        bar_herramientas1.add(btn_arquitectura);

        btn_curva_error.setBackground(new java.awt.Color(102, 102, 102));
        btn_curva_error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/chart_curve.png"))); // NOI18N
        btn_curva_error.setToolTipText("Mostrar Curva de Error");
        btn_curva_error.setBorderPainted(false);
        btn_curva_error.setFocusable(false);
        btn_curva_error.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_curva_error.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_curva_error.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_curva_errorActionPerformed(evt);
            }
        });
        bar_herramientas1.add(btn_curva_error);

        btn_curva_aprendizaje1.setBackground(new java.awt.Color(102, 102, 102));
        btn_curva_aprendizaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/page_white_actionscript.png"))); // NOI18N
        btn_curva_aprendizaje1.setToolTipText("Mostrar Funciones de Activación");
        btn_curva_aprendizaje1.setBorderPainted(false);
        btn_curva_aprendizaje1.setFocusable(false);
        btn_curva_aprendizaje1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_curva_aprendizaje1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_curva_aprendizaje1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_curva_aprendizaje1ActionPerformed(evt);
            }
        });
        bar_herramientas1.add(btn_curva_aprendizaje1);

        btn_comenzar_aprendizaje.setBackground(new java.awt.Color(102, 102, 102));
        btn_comenzar_aprendizaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/control_play_blue.png"))); // NOI18N
        btn_comenzar_aprendizaje.setToolTipText("Iniciar Entrenamiento");
        btn_comenzar_aprendizaje.setBorderPainted(false);
        btn_comenzar_aprendizaje.setFocusable(false);
        btn_comenzar_aprendizaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_comenzar_aprendizaje.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_comenzar_aprendizaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comenzar_aprendizajeActionPerformed(evt);
            }
        });
        bar_herramientas1.add(btn_comenzar_aprendizaje);

        btn_pausar_aprendizaje.setBackground(new java.awt.Color(102, 102, 102));
        btn_pausar_aprendizaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/control_stop_blue.png"))); // NOI18N
        btn_pausar_aprendizaje.setToolTipText("Parar entrenamiento");
        btn_pausar_aprendizaje.setBorderPainted(false);
        btn_pausar_aprendizaje.setFocusable(false);
        btn_pausar_aprendizaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_pausar_aprendizaje.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_pausar_aprendizaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pausar_aprendizajeActionPerformed(evt);
            }
        });
        bar_herramientas1.add(btn_pausar_aprendizaje);

        btn_resultados.setBackground(new java.awt.Color(102, 102, 102));
        btn_resultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/table_edit.png"))); // NOI18N
        btn_resultados.setToolTipText("Evaluación de Aprendizaje");
        btn_resultados.setBorderPainted(false);
        btn_resultados.setFocusable(false);
        btn_resultados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_resultados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_resultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resultadosActionPerformed(evt);
            }
        });
        bar_herramientas1.add(btn_resultados);

        btn_configuracion.setBackground(new java.awt.Color(102, 102, 102));
        btn_configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/cog.png"))); // NOI18N
        btn_configuracion.setToolTipText("Configuracion General");
        btn_configuracion.setBorderPainted(false);
        btn_configuracion.setFocusable(false);
        btn_configuracion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_configuracion.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_configuracion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_configuracionActionPerformed(evt);
            }
        });
        bar_herramientas1.add(btn_configuracion);

        btn_limpiar_bd.setBackground(new java.awt.Color(102, 102, 102));
        btn_limpiar_bd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/application_osx_terminal.png"))); // NOI18N
        btn_limpiar_bd.setToolTipText("Limpiar base de Datos RNA");
        btn_limpiar_bd.setBorderPainted(false);
        btn_limpiar_bd.setFocusable(false);
        btn_limpiar_bd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_limpiar_bd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_limpiar_bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiar_bdActionPerformed(evt);
            }
        });
        bar_herramientas1.add(btn_limpiar_bd);

        btn_ConfigAccesoDatos.setBackground(new java.awt.Color(102, 102, 102));
        btn_ConfigAccesoDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/database_connect.png"))); // NOI18N
        btn_ConfigAccesoDatos.setToolTipText("Configurar Acceso a Datos");
        btn_ConfigAccesoDatos.setBorderPainted(false);
        btn_ConfigAccesoDatos.setFocusable(false);
        btn_ConfigAccesoDatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ConfigAccesoDatos.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_ConfigAccesoDatos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_ConfigAccesoDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfigAccesoDatosActionPerformed(evt);
            }
        });
        bar_herramientas1.add(btn_ConfigAccesoDatos);

        btn_VerPruebas.setBackground(new java.awt.Color(102, 102, 102));
        btn_VerPruebas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/text_signature.png"))); // NOI18N
        btn_VerPruebas.setToolTipText("ver pruebas realizadas");
        btn_VerPruebas.setBorderPainted(false);
        btn_VerPruebas.setFocusable(false);
        btn_VerPruebas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_VerPruebas.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_VerPruebas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_VerPruebas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerPruebasActionPerformed(evt);
            }
        });
        bar_herramientas1.add(btn_VerPruebas);

        bar_herramientas1.setBounds(0, 0, 2000, 40);
        Panel_escritorio.add(bar_herramientas1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(Panel_escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2000, 710));

        mnu_Bar.setBackground(new java.awt.Color(102, 102, 102));
        mnu_Bar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mnu_Bar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnu_Bar.setPreferredSize(new java.awt.Dimension(160, 23));

        mnu_archivo.setBackground(new java.awt.Color(102, 102, 102));
        mnu_archivo.setForeground(java.awt.Color.white);
        mnu_archivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/page_white_stack.png"))); // NOI18N
        mnu_archivo.setMnemonic('A');
        mnu_archivo.setText("Archivo");

        sub_nuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        sub_nuevo.setBackground(new java.awt.Color(102, 102, 102));
        sub_nuevo.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        sub_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/page.png"))); // NOI18N
        sub_nuevo.setText("Nuevo Proyecto");
        sub_nuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sub_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_nuevoActionPerformed(evt);
            }
        });
        mnu_archivo.add(sub_nuevo);

        sub_abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        sub_abrir.setBackground(new java.awt.Color(102, 102, 102));
        sub_abrir.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        sub_abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/folder_database.png"))); // NOI18N
        sub_abrir.setText("Abrir Proyecto ");
        sub_abrir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sub_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_abrirActionPerformed(evt);
            }
        });
        mnu_archivo.add(sub_abrir);

        sub_guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        sub_guardar.setBackground(new java.awt.Color(102, 102, 102));
        sub_guardar.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        sub_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/disk.png"))); // NOI18N
        sub_guardar.setText("Guardar");
        sub_guardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnu_archivo.add(sub_guardar);

        sub_guardar_como.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        sub_guardar_como.setBackground(new java.awt.Color(102, 102, 102));
        sub_guardar_como.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        sub_guardar_como.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/disk_multiple.png"))); // NOI18N
        sub_guardar_como.setText("Guardar como...");
        sub_guardar_como.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnu_archivo.add(sub_guardar_como);

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setOpaque(true);
        mnu_archivo.add(jSeparator1);

        sub_imprimir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        sub_imprimir.setBackground(new java.awt.Color(102, 102, 102));
        sub_imprimir.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        sub_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/printer.png"))); // NOI18N
        sub_imprimir.setText("Imprimir");
        sub_imprimir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnu_archivo.add(sub_imprimir);

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setOpaque(true);
        mnu_archivo.add(jSeparator2);

        sub_salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        sub_salir.setBackground(new java.awt.Color(102, 102, 102));
        sub_salir.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        sub_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/door_out.png"))); // NOI18N
        sub_salir.setText("Salir");
        sub_salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sub_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_salirActionPerformed(evt);
            }
        });
        mnu_archivo.add(sub_salir);

        mnu_Bar.add(mnu_archivo);

        mnu_ver.setBackground(new java.awt.Color(102, 102, 102));
        mnu_ver.setForeground(java.awt.Color.white);
        mnu_ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/eye.png"))); // NOI18N
        mnu_ver.setMnemonic('V');
        mnu_ver.setText("Ver");

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem14.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/map_magnify.png"))); // NOI18N
        jMenuItem14.setText("Tabla de Análisis de Datos");
        jMenuItem14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        mnu_ver.add(jMenuItem14);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/table.png"))); // NOI18N
        jMenuItem1.setText("Tabla de Patrones");
        jMenuItem1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnu_ver.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem2.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/chart_line.png"))); // NOI18N
        jMenuItem2.setText("Arquitectura Neuronal");
        jMenuItem2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnu_ver.add(jMenuItem2);

        jSeparator5.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator5.setOpaque(true);
        mnu_ver.add(jSeparator5);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem3.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/chart_curve.png"))); // NOI18N
        jMenuItem3.setText("Curva de Error");
        jMenuItem3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnu_ver.add(jMenuItem3);

        jSeparator6.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator6.setOpaque(true);
        mnu_ver.add(jSeparator6);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem4.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/tab_edit.png"))); // NOI18N
        jMenuItem4.setText("Resultados Aprendizaje");
        jMenuItem4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnu_ver.add(jMenuItem4);

        jSeparator8.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator8.setOpaque(true);
        mnu_ver.add(jSeparator8);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem15.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/page_white_actionscript.png"))); // NOI18N
        jMenuItem15.setText("Funciones Activación");
        jMenuItem15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        mnu_ver.add(jMenuItem15);

        rbBarraHerramienta.setBackground(new java.awt.Color(102, 102, 102));
        rbBarraHerramienta.setForeground(new java.awt.Color(255, 255, 255));
        rbBarraHerramienta.setSelected(true);
        rbBarraHerramienta.setText("Barra de Herramientas");
        rbBarraHerramienta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbBarraHerramientaItemStateChanged(evt);
            }
        });
        mnu_ver.add(rbBarraHerramienta);

        mnu_Bar.add(mnu_ver);

        mnu_atributos.setBackground(new java.awt.Color(102, 102, 102));
        mnu_atributos.setForeground(java.awt.Color.white);
        mnu_atributos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/wand.png"))); // NOI18N
        mnu_atributos.setMnemonic('T');
        mnu_atributos.setText("Atributos");

        jMenu1.setBackground(new java.awt.Color(102, 102, 102));
        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/shape_align_left.png"))); // NOI18N
        jMenu1.setText("Ancho Neuronas");
        jMenu1.setRolloverEnabled(false);
        jMenu1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu1ItemStateChanged(evt);
            }
        });

        opAncho20.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup3.add(opAncho20);
        opAncho20.setForeground(new java.awt.Color(255, 255, 255));
        opAncho20.setText("20 pxl");
        opAncho20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opAncho20.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opAncho20ItemStateChanged(evt);
            }
        });
        jMenu1.add(opAncho20);

        opAncho40.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup3.add(opAncho40);
        opAncho40.setForeground(new java.awt.Color(255, 255, 255));
        opAncho40.setText("40 pxl");
        opAncho40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opAncho40.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opAncho40ItemStateChanged(evt);
            }
        });
        jMenu1.add(opAncho40);

        opAncho60.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup3.add(opAncho60);
        opAncho60.setForeground(new java.awt.Color(255, 255, 255));
        opAncho60.setSelected(true);
        opAncho60.setText("60 pxl");
        opAncho60.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opAncho60.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opAncho60ItemStateChanged(evt);
            }
        });
        jMenu1.add(opAncho60);

        opAncho80.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup3.add(opAncho80);
        opAncho80.setForeground(new java.awt.Color(255, 255, 255));
        opAncho80.setText("80 pxl");
        opAncho80.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opAncho80.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opAncho80ItemStateChanged(evt);
            }
        });
        jMenu1.add(opAncho80);

        opAncho100.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup3.add(opAncho100);
        opAncho100.setForeground(new java.awt.Color(255, 255, 255));
        opAncho100.setText("100 pxl");
        opAncho100.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opAncho100.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opAncho100ItemStateChanged(evt);
            }
        });
        jMenu1.add(opAncho100);

        mnu_atributos.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(102, 102, 102));
        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/shape_align_bottom.png"))); // NOI18N
        jMenu2.setText("Alto Neuronas");
        jMenu2.setRolloverEnabled(false);

        opAlto20.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup4.add(opAlto20);
        opAlto20.setForeground(new java.awt.Color(255, 255, 255));
        opAlto20.setText("20 pxl");
        opAlto20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opAlto20.setBorderPainted(true);
        opAlto20.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opAlto20ItemStateChanged(evt);
            }
        });
        jMenu2.add(opAlto20);

        opAlto40.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup4.add(opAlto40);
        opAlto40.setForeground(new java.awt.Color(255, 255, 255));
        opAlto40.setText("40 pxl");
        opAlto40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opAlto40.setBorderPainted(true);
        opAlto40.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opAlto40ItemStateChanged(evt);
            }
        });
        jMenu2.add(opAlto40);

        opAlto60.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup4.add(opAlto60);
        opAlto60.setForeground(new java.awt.Color(255, 255, 255));
        opAlto60.setSelected(true);
        opAlto60.setText("60 pxl");
        opAlto60.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opAlto60.setBorderPainted(true);
        opAlto60.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opAlto60ItemStateChanged(evt);
            }
        });
        jMenu2.add(opAlto60);

        opAlto80.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup4.add(opAlto80);
        opAlto80.setForeground(new java.awt.Color(255, 255, 255));
        opAlto80.setText("80 pxl");
        opAlto80.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opAlto80.setBorderPainted(true);
        opAlto80.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opAlto80ItemStateChanged(evt);
            }
        });
        jMenu2.add(opAlto80);

        opAlto100.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup4.add(opAlto100);
        opAlto100.setForeground(new java.awt.Color(255, 255, 255));
        opAlto100.setText("100 pxl");
        opAlto100.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opAlto100.setBorderPainted(true);
        opAlto100.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opAlto100ItemStateChanged(evt);
            }
        });
        jMenu2.add(opAlto100);

        mnu_atributos.add(jMenu2);

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator3.setOpaque(true);
        mnu_atributos.add(jSeparator3);

        jMenu3.setBackground(new java.awt.Color(102, 102, 102));
        jMenu3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/arrow_inout.png"))); // NOI18N
        jMenu3.setText("Espaciado X Neuronas");
        jMenu3.setRolloverEnabled(false);
        jMenu3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jMenu3StateChanged(evt);
            }
        });

        rbX1.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(rbX1);
        rbX1.setForeground(new java.awt.Color(255, 255, 255));
        rbX1.setSelected(true);
        rbX1.setText("200 pxl");
        rbX1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rbX1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbX1ItemStateChanged(evt);
            }
        });
        jMenu3.add(rbX1);

        rbX2.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(rbX2);
        rbX2.setForeground(new java.awt.Color(255, 255, 255));
        rbX2.setText("400 pxl");
        rbX2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.add(rbX2);

        mnu_atributos.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(102, 102, 102));
        jMenu4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/arrow_out.png"))); // NOI18N
        jMenu4.setText("Espaciado Y Neuronas");
        jMenu4.setRolloverEnabled(false);
        jMenu4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jMenu4StateChanged(evt);
            }
        });

        rbY1.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup2.add(rbY1);
        rbY1.setForeground(java.awt.Color.white);
        rbY1.setText("200 pxl");
        rbY1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rbY1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbY1ItemStateChanged(evt);
            }
        });
        jMenu4.add(rbY1);

        rbY2.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup2.add(rbY2);
        rbY2.setForeground(java.awt.Color.white);
        rbY2.setText("400 pxl");
        rbY2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu4.add(rbY2);

        mnu_atributos.add(jMenu4);

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setOpaque(true);
        mnu_atributos.add(jSeparator4);

        jMenu5.setBackground(new java.awt.Color(102, 102, 102));
        jMenu5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu5.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/style_edit.png"))); // NOI18N
        jMenu5.setText("Mostrar aprendizaje");
        jMenu5.setRolloverEnabled(false);

        chkEpoca.setBackground(new java.awt.Color(102, 102, 102));
        chkEpoca.setForeground(new java.awt.Color(255, 255, 255));
        chkEpoca.setSelected(true);
        chkEpoca.setText("Por Epoca");
        chkEpoca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chkEpoca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkEpocaItemStateChanged(evt);
            }
        });
        jMenu5.add(chkEpoca);

        chkPatrones.setBackground(new java.awt.Color(102, 102, 102));
        chkPatrones.setForeground(new java.awt.Color(255, 255, 255));
        chkPatrones.setSelected(true);
        chkPatrones.setText("Por Patrones");
        chkPatrones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chkPatrones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkPatronesItemStateChanged(evt);
            }
        });
        jMenu5.add(chkPatrones);

        mnu_atributos.add(jMenu5);

        jMenu6.setBackground(new java.awt.Color(102, 102, 102));
        jMenu6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu6.setForeground(new java.awt.Color(255, 255, 255));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/chart_curve_edit.png"))); // NOI18N
        jMenu6.setText("Curvas de Entrenamiento");
        jMenu6.setRolloverEnabled(false);

        chkError.setBackground(new java.awt.Color(102, 102, 102));
        chkError.setForeground(new java.awt.Color(255, 255, 255));
        chkError.setSelected(true);
        chkError.setText("Curva de Error");
        chkError.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chkError.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chkError.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkErrorItemStateChanged(evt);
            }
        });
        jMenu6.add(chkError);

        mnu_atributos.add(jMenu6);

        mnu_Bar.add(mnu_atributos);

        mnu_ejecucion.setBackground(new java.awt.Color(102, 102, 102));
        mnu_ejecucion.setForeground(java.awt.Color.white);
        mnu_ejecucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/hourglass.png"))); // NOI18N
        mnu_ejecucion.setMnemonic('E');
        mnu_ejecucion.setText("Ejecución");
        mnu_ejecucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_ejecucionActionPerformed(evt);
            }
        });

        mnu_iniciar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        mnu_iniciar.setBackground(new java.awt.Color(102, 102, 102));
        mnu_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        mnu_iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/control_play_blue.png"))); // NOI18N
        mnu_iniciar.setText("Iniciar Aprendizaje");
        mnu_iniciar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnu_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_iniciarActionPerformed(evt);
            }
        });
        mnu_ejecucion.add(mnu_iniciar);

        mnu_parar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        mnu_parar.setBackground(new java.awt.Color(102, 102, 102));
        mnu_parar.setForeground(new java.awt.Color(255, 255, 255));
        mnu_parar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/control_stop_blue.png"))); // NOI18N
        mnu_parar.setText("Parar Aprendizaje");
        mnu_parar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnu_parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_pararActionPerformed(evt);
            }
        });
        mnu_ejecucion.add(mnu_parar);

        mnu_Bar.add(mnu_ejecucion);

        mnu_herramientas.setBackground(new java.awt.Color(102, 102, 102));
        mnu_herramientas.setForeground(java.awt.Color.white);
        mnu_herramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/wrench.png"))); // NOI18N
        mnu_herramientas.setMnemonic('H');
        mnu_herramientas.setText("Herramientas");
        mnu_herramientas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_herramientasActionPerformed(evt);
            }
        });

        jMenuItem5.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem5.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/application_osx_terminal.png"))); // NOI18N
        jMenuItem5.setText("Set Base Datos RNA");
        jMenuItem5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseClicked(evt);
            }
        });
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        mnu_herramientas.add(jMenuItem5);

        mnu_configuracion.setBackground(new java.awt.Color(102, 102, 102));
        mnu_configuracion.setForeground(new java.awt.Color(255, 255, 255));
        mnu_configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/cog.png"))); // NOI18N
        mnu_configuracion.setText("Configuración General");
        mnu_configuracion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnu_configuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnu_configuracionMouseClicked(evt);
            }
        });
        mnu_configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_configuracionActionPerformed(evt);
            }
        });
        mnu_herramientas.add(mnu_configuracion);

        mnu_accesodatos.setBackground(new java.awt.Color(102, 102, 102));
        mnu_accesodatos.setForeground(new java.awt.Color(255, 255, 255));
        mnu_accesodatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/database_connect.png"))); // NOI18N
        mnu_accesodatos.setText("Accesos a Base Datos");
        mnu_accesodatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnu_accesodatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnu_accesodatosMouseClicked(evt);
            }
        });
        mnu_accesodatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_accesodatosActionPerformed(evt);
            }
        });
        mnu_herramientas.add(mnu_accesodatos);

        mnu_Bar.add(mnu_herramientas);

        mnu_ventana.setBackground(new java.awt.Color(102, 102, 102));
        mnu_ventana.setForeground(java.awt.Color.white);
        mnu_ventana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/application.png"))); // NOI18N
        mnu_ventana.setMnemonic('N');
        mnu_ventana.setText("Ventana");
        mnu_ventana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_ventanaActionPerformed(evt);
            }
        });

        jMenuItem8.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem8.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/application_cascade.png"))); // NOI18N
        jMenuItem8.setText("Cascada");
        jMenuItem8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        mnu_ventana.add(jMenuItem8);

        jSeparator7.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator7.setOpaque(true);
        mnu_ventana.add(jSeparator7);

        jMenuItem10.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem10.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/application_delete.png"))); // NOI18N
        jMenuItem10.setText("Cerrar todos");
        jMenuItem10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        mnu_ventana.add(jMenuItem10);

        jMenuItem9.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem9.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/application_add.png"))); // NOI18N
        jMenuItem9.setText("Cerrar todos menos el actual");
        jMenuItem9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        mnu_ventana.add(jMenuItem9);

        jMenuItem11.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem11.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/application_put.png"))); // NOI18N
        jMenuItem11.setText("Minimizar todos");
        jMenuItem11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        mnu_ventana.add(jMenuItem11);

        jMenuItem12.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem12.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/application_put.png"))); // NOI18N
        jMenuItem12.setText("Minimizar todos menos el actual");
        jMenuItem12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        mnu_ventana.add(jMenuItem12);

        mnu_Bar.add(mnu_ventana);

        mnu_ayuda.setBackground(new java.awt.Color(102, 102, 102));
        mnu_ayuda.setForeground(java.awt.Color.white);
        mnu_ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/help.png"))); // NOI18N
        mnu_ayuda.setMnemonic('Y');
        mnu_ayuda.setText("Ayuda");

        jMenuItem7.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem7.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/tux.png"))); // NOI18N
        jMenuItem7.setText("Acerca de...");
        jMenuItem7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        mnu_ayuda.add(jMenuItem7);

        mnu_Bar.add(mnu_ayuda);

        mnu_ver1.setBackground(new java.awt.Color(102, 102, 102));
        mnu_ver1.setForeground(java.awt.Color.white);
        mnu_ver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/eye.png"))); // NOI18N
        mnu_ver1.setText("Ver");
        mnu_ver1.setFocusable(false);

        p1.setBackground(new java.awt.Color(102, 102, 102));
        p1.setForeground(new java.awt.Color(255, 255, 255));
        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/map_magnify.png"))); // NOI18N
        p1.setText("Tabla de Análisis de Datos");
        p1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        mnu_ver1.add(p1);

        p2.setBackground(new java.awt.Color(102, 102, 102));
        p2.setForeground(new java.awt.Color(255, 255, 255));
        p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/table.png"))); // NOI18N
        p2.setText("Tabla de Patrones");
        p2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });
        mnu_ver1.add(p2);

        p3.setBackground(new java.awt.Color(102, 102, 102));
        p3.setForeground(new java.awt.Color(255, 255, 255));
        p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/chart_line.png"))); // NOI18N
        p3.setText("Arquitectura Neuronal");
        p3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });
        mnu_ver1.add(p3);

        p4.setBackground(new java.awt.Color(102, 102, 102));
        p4.setOpaque(true);
        mnu_ver1.add(p4);

        p5.setBackground(new java.awt.Color(102, 102, 102));
        p5.setForeground(new java.awt.Color(255, 255, 255));
        p5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/chart_curve.png"))); // NOI18N
        p5.setText("Curva de Error");
        p5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5ActionPerformed(evt);
            }
        });
        mnu_ver1.add(p5);

        p7.setBackground(new java.awt.Color(102, 102, 102));
        p7.setOpaque(true);
        mnu_ver1.add(p7);

        p8.setBackground(new java.awt.Color(102, 102, 102));
        p8.setForeground(new java.awt.Color(255, 255, 255));
        p8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/tab_edit.png"))); // NOI18N
        p8.setText("Resultados Aprendizaje");
        p8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p8ActionPerformed(evt);
            }
        });
        mnu_ver1.add(p8);

        p9.setBackground(new java.awt.Color(102, 102, 102));
        p9.setOpaque(true);
        mnu_ver1.add(p9);

        p10.setBackground(new java.awt.Color(102, 102, 102));
        p10.setForeground(new java.awt.Color(255, 255, 255));
        p10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/page_white_actionscript.png"))); // NOI18N
        p10.setText("Funciones Activación");
        p10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p10ActionPerformed(evt);
            }
        });
        mnu_ver1.add(p10);

        p11.setBackground(new java.awt.Color(102, 102, 102));
        p11.setForeground(new java.awt.Color(255, 255, 255));
        p11.setSelected(true);
        p11.setText("Barra de Herramientas");
        p11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                p11ItemStateChanged(evt);
            }
        });
        mnu_ver1.add(p11);

        mnu_Bar.add(mnu_ver1);

        setJMenuBar(mnu_Bar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sub_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_nuevoActionPerformed
              ven_nuevo_proyecto nuevo= new ven_nuevo_proyecto();
              Panel_escritorio.add(nuevo);
               nuevo.show();
               nuevo.toFront();
            
    }//GEN-LAST:event_sub_nuevoActionPerformed

    private void btn_nuevo_proyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_proyectoActionPerformed
       sub_nuevoActionPerformed( evt);
    }//GEN-LAST:event_btn_nuevo_proyectoActionPerformed

    private void btn_arquitecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_arquitecturaActionPerformed
      try{
        dibujo = new ven_DibujoNeuronal( nueva_red);
        Panel_escritorio.add(dibujo);
        dibujo.show();
        dibujo.toFront();
        }
       catch(Exception e)
       {
           mensajes.showMessageDialog(null, "No hay proyecto cargado, crear un nuevo proyecto o abrir un proyecto existente!", titulo_mensajes, mensajes.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btn_arquitecturaActionPerformed

    private void btn_abrir_proyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrir_proyectoActionPerformed
       ven_BuscarProyecto buscar= new ven_BuscarProyecto();
       Panel_escritorio.add(buscar);
       buscar.show();
       buscar.toFront();
        
    }//GEN-LAST:event_btn_abrir_proyectoActionPerformed

    private void btn_guardar_proyecto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_proyecto1ActionPerformed
            try{
                ven_TablaPatrones patrones= new ven_TablaPatrones();
                Panel_escritorio.add(patrones);
                patrones.show();
                patrones.toFront();
                }
            catch(Exception e)
            {
                mensajes.showMessageDialog(null, "No hay proyecto cargado, crear un nuevo proyecto o abrir un proyecto existente!", titulo_mensajes, mensajes.ERROR_MESSAGE);
            }

    }//GEN-LAST:event_btn_guardar_proyecto1ActionPerformed

    private void btn_limpiar_bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiar_bdActionPerformed
        if (javax.swing.JOptionPane.showConfirmDialog(null, "¿Seguro desea limpiar la base de Datos?")==0 )
             limpiar_base_datos();
    }//GEN-LAST:event_btn_limpiar_bdActionPerformed

    private void btn_configuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_configuracionActionPerformed
               try{
                   ven_ConfiguracionGeneral configurar= new ven_ConfiguracionGeneral();
                   Panel_escritorio.add(configurar);
                   configurar.show();
                   configurar.toFront();
                  }
               catch(Exception e)
               {
                   mensajes.showMessageDialog(null, "No hay proyecto cargado, crear un nuevo proyecto o abrir un proyecto existente!", titulo_mensajes, mensajes.ERROR_MESSAGE);
               }
    }//GEN-LAST:event_btn_configuracionActionPerformed

    private void btn_comenzar_aprendizajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comenzar_aprendizajeActionPerformed
           try{
              
               if (nueva_red.getPatronesSeteados())
               {
                   ven_MDI.nueva_red.setParar(false);
                   dibujo.cargar();
                   dibujo.cronometro();
               }
                else
                     mensajes.showMessageDialog(null, "Falta  asignar patrones de datos al proyecto actual, en la ventana de asignación de patrones podrá realizar esta acción!", titulo_mensajes, mensajes.ERROR_MESSAGE);
              }
           catch(Exception e)
           {
                mensajes.showMessageDialog(null, "No hay proyecto cargado, crear un nuevo proyecto o abrir un proyecto existente!", titulo_mensajes, mensajes.ERROR_MESSAGE);
           }

    }//GEN-LAST:event_btn_comenzar_aprendizajeActionPerformed

    private void btn_resultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resultadosActionPerformed
    try{
                 ven_resultados resultado= new ven_resultados();
                 Panel_escritorio.add(resultado);
                 resultado.show();
                 resultado.toFront();
       }
      catch(Exception e)
    {
             mensajes.showMessageDialog(null, "No hay proyecto cargado, crear un nuevo proyecto o abrir un proyecto existente!", titulo_mensajes, mensajes.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btn_resultadosActionPerformed

    private void btn_curva_errorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_curva_errorActionPerformed
          try{
                ven_CurvaError curvaError= new ven_CurvaError();
                curvaError.grafico_curva_error(paq_logica.cls_variables_globales.erroresPromedio, paq_logica.cls_variables_globales.erroresMaximo,paq_logica.cls_variables_globales.erroresMinimo, paq_logica.cls_variables_globales.epoca);
             }
          catch(Exception e)
          {
              mensajes.showMessageDialog(null, "No hay proyecto cargado, crear un nuevo proyecto o abrir un proyecto existente!", titulo_mensajes, mensajes.ERROR_MESSAGE);
          }
    }//GEN-LAST:event_btn_curva_errorActionPerformed

    private void btn_pausar_aprendizajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pausar_aprendizajeActionPerformed
        try{
            ven_MDI.nueva_red.setParar(true);
           }
        catch(Exception e)
        {
            mensajes.showMessageDialog(null, "No hay proyecto cargado, crear un nuevo proyecto o abrir un proyecto existente!", titulo_mensajes, mensajes.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_pausar_aprendizajeActionPerformed

    private void btn_curva_aprendizaje1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_curva_aprendizaje1ActionPerformed
        ven_funciones_activacion ventana= new ven_funciones_activacion();
        this.Panel_escritorio.add(ventana);
        ventana.show();
        ventana.toFront();
}//GEN-LAST:event_btn_curva_aprendizaje1ActionPerformed

    private void jMenu3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jMenu3StateChanged
     
    }//GEN-LAST:event_jMenu3StateChanged

    private void jMenu4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jMenu4StateChanged
        
    }//GEN-LAST:event_jMenu4StateChanged

    private void rbX1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbX1ItemStateChanged
        if (this.rbX1.isSelected()==true)
              cls_variables_globales.espacio_x_neuronas=200;
      else
              cls_variables_globales.espacio_x_neuronas=400;
    }//GEN-LAST:event_rbX1ItemStateChanged

    private void rbY1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbY1ItemStateChanged
       if (this.rbY1.isSelected()==true)
              cls_variables_globales.espacio_y_neuronas=200;
        else
              cls_variables_globales.espacio_y_neuronas=400;
    }//GEN-LAST:event_rbY1ItemStateChanged

    private void jMenu1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu1ItemStateChanged

    }//GEN-LAST:event_jMenu1ItemStateChanged

    private void opAncho20ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opAncho20ItemStateChanged
     cambiar_ancho();
    }//GEN-LAST:event_opAncho20ItemStateChanged

    private void cambiar_ancho()
    {
     if (this.opAncho20.isSelected())
          cls_variables_globales.ancho_radio_neurona=20;
      if (this.opAncho40.isSelected())
          cls_variables_globales.ancho_radio_neurona=40;
      if (this.opAncho60.isSelected())
          cls_variables_globales.ancho_radio_neurona=60;
      if (this.opAncho80.isSelected())
          cls_variables_globales.ancho_radio_neurona=80;
      if (this.opAncho100.isSelected())
          cls_variables_globales.ancho_radio_neurona=100;
    }
    private void cambiar_alto()
    {
        if(this.opAlto20.isSelected())
            cls_variables_globales.alto_radio_neurona=20;
        if(this.opAlto40.isSelected())
            cls_variables_globales.alto_radio_neurona=40;
        if(this.opAlto60.isSelected())
            cls_variables_globales.alto_radio_neurona=60;
        if(this.opAlto80.isSelected())
            cls_variables_globales.alto_radio_neurona=80;
        if(this.opAlto100.isSelected())
            cls_variables_globales.alto_radio_neurona=100;
    }
    private void opAlto20ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opAlto20ItemStateChanged
        cambiar_alto();
    }//GEN-LAST:event_opAlto20ItemStateChanged

    private void opAncho40ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opAncho40ItemStateChanged
      cambiar_ancho();
    }//GEN-LAST:event_opAncho40ItemStateChanged

    private void opAncho60ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opAncho60ItemStateChanged
      cambiar_ancho();
    }//GEN-LAST:event_opAncho60ItemStateChanged

    private void opAncho80ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opAncho80ItemStateChanged
       cambiar_ancho();
    }//GEN-LAST:event_opAncho80ItemStateChanged

    private void opAncho100ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opAncho100ItemStateChanged
      cambiar_ancho();
    }//GEN-LAST:event_opAncho100ItemStateChanged

    private void opAlto40ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opAlto40ItemStateChanged
       cambiar_alto();
    }//GEN-LAST:event_opAlto40ItemStateChanged

    private void opAlto60ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opAlto60ItemStateChanged
     cambiar_alto();
    }//GEN-LAST:event_opAlto60ItemStateChanged

    private void opAlto80ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opAlto80ItemStateChanged
        cambiar_alto();
    }//GEN-LAST:event_opAlto80ItemStateChanged

    private void opAlto100ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opAlto100ItemStateChanged
        cambiar_alto();
    }//GEN-LAST:event_opAlto100ItemStateChanged

    private void chkEpocaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkEpocaItemStateChanged

        cls_variables_globales.aprendizajeEpoca=this.chkEpoca.isSelected();
    }//GEN-LAST:event_chkEpocaItemStateChanged

    private void chkPatronesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkPatronesItemStateChanged
        cls_variables_globales.aprendizajePatron =this.chkPatrones.isSelected();
    }//GEN-LAST:event_chkPatronesItemStateChanged

    private void chkErrorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkErrorItemStateChanged
       cls_variables_globales.curvaError = this.chkError.isSelected();
    }//GEN-LAST:event_chkErrorItemStateChanged

    private void jMenuItem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseClicked
       
    }//GEN-LAST:event_jMenuItem5MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
     btn_limpiar_bdActionPerformed( evt);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        btn_guardar_proyecto1ActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        btn_arquitecturaActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        btn_curva_errorActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        btn_resultadosActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       ven_acercaDe acerca= new ven_acercaDe(this,true);
        acerca.setLocation(450, 318);
        acerca.setTitle("Acerca de...");
        acerca.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void btn_tabla_analisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tabla_analisisActionPerformed
         try{
             ven_TablaBaseDatos ventana_tabla= new ven_TablaBaseDatos();
             ven_MDI.Panel_escritorio.add(ventana_tabla);
             ventana_tabla.llenar_tabla(cls_variables_globales.tabla_analisis_datos );
             ventana_tabla.show();
             ventana_tabla.toFront();
            }
         catch(Exception e)
             {
               mensajes.showMessageDialog(null, "No hay proyecto cargado, crear un nuevo proyecto o abrir un proyecto existente!", titulo_mensajes, mensajes.ERROR_MESSAGE);
             }
    }//GEN-LAST:event_btn_tabla_analisisActionPerformed

    private void mnu_ventanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_ventanaActionPerformed
  
    }//GEN-LAST:event_mnu_ventanaActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        ordenCascada();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
       CerrarTodos(false);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        CerrarTodos(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        minimizarVentanas(false);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
         minimizarVentanas(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void btn_ConfigAccesoDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfigAccesoDatosActionPerformed
        ven_configBase ventana= new ven_configBase();
        Panel_escritorio.add(ventana);
        ventana.show();
        ventana.toFront();

    }//GEN-LAST:event_btn_ConfigAccesoDatosActionPerformed

    private void btn_VerPruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerPruebasActionPerformed
       ven_PruebasRealizadas ventana= new ven_PruebasRealizadas();
       this.Panel_escritorio.add(ventana);
       ventana.show();
       ventana.toFront();
    }//GEN-LAST:event_btn_VerPruebasActionPerformed

    private void sub_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_salirActionPerformed
       dispose();
    }//GEN-LAST:event_sub_salirActionPerformed

    private void sub_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_abrirActionPerformed
       btn_abrir_proyectoActionPerformed(evt);
    }//GEN-LAST:event_sub_abrirActionPerformed

    private void rbBarraHerramientaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbBarraHerramientaItemStateChanged
        this.bar_herramientas1.setVisible(this.rbBarraHerramienta.isSelected());
    }//GEN-LAST:event_rbBarraHerramientaItemStateChanged

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
       btn_tabla_analisisActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void mnu_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_iniciarActionPerformed
        btn_comenzar_aprendizajeActionPerformed(evt);
    }//GEN-LAST:event_mnu_iniciarActionPerformed

    private void mnu_pararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_pararActionPerformed
      btn_pausar_aprendizajeActionPerformed(evt);
    }//GEN-LAST:event_mnu_pararActionPerformed

    private void mnu_ejecucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_ejecucionActionPerformed
      btn_pausar_aprendizajeActionPerformed(evt);
    }//GEN-LAST:event_mnu_ejecucionActionPerformed

    private void mnu_configuracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnu_configuracionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mnu_configuracionMouseClicked

    private void mnu_configuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_configuracionActionPerformed
       btn_configuracionActionPerformed(evt);
    }//GEN-LAST:event_mnu_configuracionActionPerformed

    private void mnu_accesodatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnu_accesodatosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mnu_accesodatosMouseClicked

    private void mnu_accesodatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_accesodatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnu_accesodatosActionPerformed

    private void mnu_herramientasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_herramientasActionPerformed
       btn_ConfigAccesoDatosActionPerformed(evt);
    }//GEN-LAST:event_mnu_herramientasActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
       btn_curva_aprendizaje1ActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
       jMenuItem14ActionPerformed(evt);
    }//GEN-LAST:event_p1ActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
        btn_guardar_proyecto1ActionPerformed(evt);
    }//GEN-LAST:event_p2ActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed
        btn_arquitecturaActionPerformed(evt);
    }//GEN-LAST:event_p3ActionPerformed

    private void p5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5ActionPerformed
        btn_curva_errorActionPerformed(evt);
    }//GEN-LAST:event_p5ActionPerformed

    private void p8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p8ActionPerformed
       btn_resultadosActionPerformed(evt);
    }//GEN-LAST:event_p8ActionPerformed

    private void p10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p10ActionPerformed
          btn_curva_aprendizaje1ActionPerformed(evt);
    }//GEN-LAST:event_p10ActionPerformed

    private void p11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_p11ItemStateChanged
       rbBarraHerramientaItemStateChanged(evt);
    }//GEN-LAST:event_p11ItemStateChanged

  private void minimizarVentanas (boolean actual) {

     javax.swing.JInternalFrame frames [] =  ven_MDI.Panel_escritorio.getAllFrames();
   try{
     for ( int i = frames.length - 1 ; i >= 0 ; i-- )
       if (actual)
                { if (!frames[i].isSelected())
                        frames[i].setIcon(false);
                }
            else
         frames [ i ] .setIcon(false);                                                  // false= restaurar,     true=minimizar
     }
   catch(Exception e)
   {
            e.printStackTrace();
   }
   }

    private void ordenCascada () {

     int x = 0 ;
     int y = 50 ;
     javax.swing.JInternalFrame frames [] =  ven_MDI.Panel_escritorio.getAllFrames();

     for ( int i = frames.length - 1 ; i >= 0 ; i-- ) {
       frames [ i ] .setLocation ( x, y ) ;
       x = x +  cls_variables_globales.desplazamiento_frames;
       y = y + cls_variables_globales.desplazamiento_frames;
     }
   }
    private void CerrarTodos(boolean actual)
    {
        javax.swing.JInternalFrame frames [] =  ven_MDI.Panel_escritorio.getAllFrames();
        for (int i=0;i<frames.length;i++)
        {
            if (actual)
                { if (!frames[i].isSelected())
                        frames[i].dispose();
                }
            else
                  frames[i].dispose();

        }
    }


    private void limpiar_base_datos()
 {
       if (sql.ejecutar_sql(sql.armarQuery("limpiar_base_datos")))
       {
           javax.swing.JOptionPane.showMessageDialog( null, "Base de Datos Limpia","Set Base de Datos",javax.swing.JOptionPane.INFORMATION_MESSAGE);
       }
       else
       {
       javax.swing.JOptionPane.showMessageDialog(null, "Error al limpiar base de datos ","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
       }

 }
    @Override
    public java.awt.Image getIconImage() {
         java.awt.Image retValue = java.awt.Toolkit.getDefaultToolkit().
         getImage(ClassLoader.getSystemResource("paq_iconos/tux.png"));
       return retValue;
   }

    
   

   



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Panel_escritorio;
    private javax.swing.JToolBar bar_herramientas1;
    private javax.swing.JButton btn_ConfigAccesoDatos;
    private javax.swing.JButton btn_VerPruebas;
    private javax.swing.JButton btn_abrir_proyecto;
    private javax.swing.JButton btn_arquitectura;
    private javax.swing.JButton btn_comenzar_aprendizaje;
    private javax.swing.JButton btn_configuracion;
    private javax.swing.JButton btn_curva_aprendizaje1;
    private javax.swing.JButton btn_curva_error;
    private javax.swing.JButton btn_guardar_proyecto1;
    private javax.swing.JButton btn_limpiar_bd;
    private javax.swing.JButton btn_nuevo_proyecto;
    private javax.swing.JButton btn_pausar_aprendizaje;
    private javax.swing.JButton btn_resultados;
    private javax.swing.JButton btn_tabla_analisis;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JCheckBoxMenuItem chkEpoca;
    private javax.swing.JCheckBoxMenuItem chkError;
    private javax.swing.JCheckBoxMenuItem chkPatrones;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu menuEmergente;
    private javax.swing.JMenuBar mnu_Bar;
    private javax.swing.JMenuItem mnu_accesodatos;
    private javax.swing.JMenu mnu_archivo;
    private javax.swing.JMenu mnu_atributos;
    private javax.swing.JMenu mnu_ayuda;
    private javax.swing.JMenuItem mnu_configuracion;
    private javax.swing.JMenu mnu_ejecucion;
    private javax.swing.JMenu mnu_herramientas;
    private javax.swing.JMenuItem mnu_iniciar;
    private javax.swing.JMenuItem mnu_parar;
    private javax.swing.JMenu mnu_ventana;
    private javax.swing.JMenu mnu_ver;
    private javax.swing.JMenu mnu_ver1;
    private javax.swing.JRadioButtonMenuItem opAlto100;
    private javax.swing.JRadioButtonMenuItem opAlto20;
    private javax.swing.JRadioButtonMenuItem opAlto40;
    private javax.swing.JRadioButtonMenuItem opAlto60;
    private javax.swing.JRadioButtonMenuItem opAlto80;
    private javax.swing.JRadioButtonMenuItem opAncho100;
    private javax.swing.JRadioButtonMenuItem opAncho20;
    private javax.swing.JRadioButtonMenuItem opAncho40;
    private javax.swing.JRadioButtonMenuItem opAncho60;
    private javax.swing.JRadioButtonMenuItem opAncho80;
    private javax.swing.JMenuItem p1;
    private javax.swing.JMenuItem p10;
    private javax.swing.JCheckBoxMenuItem p11;
    private javax.swing.JMenuItem p2;
    private javax.swing.JMenuItem p3;
    private javax.swing.JPopupMenu.Separator p4;
    private javax.swing.JMenuItem p5;
    private javax.swing.JPopupMenu.Separator p7;
    private javax.swing.JMenuItem p8;
    private javax.swing.JPopupMenu.Separator p9;
    private javax.swing.JCheckBoxMenuItem rbBarraHerramienta;
    private javax.swing.JRadioButtonMenuItem rbX1;
    private javax.swing.JRadioButtonMenuItem rbX2;
    private javax.swing.JRadioButtonMenuItem rbY1;
    private javax.swing.JRadioButtonMenuItem rbY2;
    private javax.swing.JMenuItem sub_abrir;
    private javax.swing.JMenuItem sub_guardar;
    private javax.swing.JMenuItem sub_guardar_como;
    private javax.swing.JMenuItem sub_imprimir;
    private javax.swing.JMenuItem sub_nuevo;
    private javax.swing.JMenuItem sub_salir;
    // End of variables declaration//GEN-END:variables

}
