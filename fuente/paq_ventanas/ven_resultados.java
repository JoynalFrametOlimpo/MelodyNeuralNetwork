/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ven_resultados.java
 *
 * Created on 07/08/2010, 04:16:19 PM
 */

package paq_ventanas;
import paq_arquitectura.*;
import paq_logica.cls_variables_globales;
import paq_logica.cls_sql;
import javax.swing.JOptionPane;
/**
 *
 * @author Jonathan
 */
public class ven_resultados extends javax.swing.JInternalFrame {
    javax.swing.table.DefaultTableModel modelo= new javax.swing.table.DefaultTableModel();
    Red_FeedForward consulta= ven_MDI.nueva_red;
    cls_variables_globales numero = new cls_variables_globales ();
    javax.swing.table.DefaultTableCellRenderer tcr = new  javax.swing.table.DefaultTableCellRenderer();
    private int incorrectos=0;
    private  cls_sql sql= new cls_sql();
    private JOptionPane mensajes;
    private String titulo_mensajes="Verificaciones de Pruebas";
    int fil;
    double val;



    /** Creates new form ven_resultados */
    public ven_resultados() {
        initComponents();
        cargar();

    }

    private void cargar()
    { int i;
      int h;
      int z;
      int columna=1;


        ven_MDI.nueva_red.getListaPatrones().getNumeroPatrones();
        modelo.addColumn("Referencia ");
       
           for (i=1;i<ven_MDI.nueva_red.getListaPatrones().getPatron(0).getTamañoEntrada()+1;i++)
                {
                    modelo.addColumn("Entrada " + i );
                }
           for (i=1;i<ven_MDI.nueva_red.getListaPatrones().getPatron(0).getTamañoSalida()+1;i++)
                {
                    modelo.addColumn("Salida Esperada" + i );
                }
        modelo.addColumn("Salida de Red");
        modelo.addColumn("Valor Normalizado");
        modelo.addColumn("Clase Definida");
        this.tbl_tabla.setModel(modelo);


         Object fila[]= new Object[ven_MDI.nueva_red.getListaPatrones().getPatron(0).getTamañoEntrada()+ ven_MDI.nueva_red.getListaPatrones().getPatron(0).getTamañoSalida()+1];


         for (z=0;z<ven_MDI.nueva_red.getListaPatrones().getNumeroPatrones();z++)
         {
               fila[0]= "Patron # " + z;
               
             // Añadir las entradas de entrenamiento
             for (h=0;h<ven_MDI.nueva_red.getListaPatrones().getPatron(0).getTamañoEntrada();h++)
                {
                    fila[columna]= ven_MDI.nueva_red.getListaPatrones().getPatron(z).getValorEntrada(h);
                    columna=columna+1;
                }
               // Añadir valores de salida de Entrenamiento
             for (h=0;h<ven_MDI.nueva_red.getListaPatrones().getPatron(0).getTamañoSalida();h++)
                {
                    fila[columna]= ven_MDI.nueva_red.getListaPatrones().getPatron(z).getValorSalida(h);
                    columna=columna+1;
                }
                modelo.addRow(fila);
                columna=1;
         }
         
    formato();
    }

    private void formato()
    {
        tcr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
      
        for(fil=1;fil<this.tbl_tabla.getColumnCount();fil++)
        {
            this.tbl_tabla.getColumnModel().getColumn(fil).setCellRenderer(tcr);
            this.tbl_tabla.getColumnModel().getColumn(fil).setWidth(60);
        }
         for(fil=1;fil<this.tbl_resumen.getColumnCount();fil++)
        {
            this.tbl_resumen.getColumnModel().getColumn(fil).setCellRenderer(tcr);

        }

    }

    private void nueva_fila()
    {
        Object fila[]= new Object[this.tbl_tabla.getColumnCount()];   
         fila[0]="Nueva Consulta :";
       
       for (int i=1;i< this.tbl_tabla.getColumnCount();i++)
               fila[i]="0.00";
       modelo.addRow(fila);
       this.tbl_tabla.setRowSelectionInterval(this.tbl_tabla.getRowCount()-1, this.tbl_tabla.getRowCount()-1);
    
      
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_nueva_consulta = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_calcular = new javax.swing.JButton();
        btn_verificar = new javax.swing.JButton();
        btn_guardarResultados = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_resumen = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_observacion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Resultados");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/table_edit.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Control", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 255, 51))); // NOI18N

        btn_nueva_consulta.setBackground(java.awt.Color.white);
        btn_nueva_consulta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_nueva_consulta.setForeground(new java.awt.Color(255, 255, 255));
        btn_nueva_consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/database_table.png"))); // NOI18N
        btn_nueva_consulta.setMnemonic('N');
        btn_nueva_consulta.setText("Nueva Consulta");
        btn_nueva_consulta.setOpaque(false);
        btn_nueva_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nueva_consultaActionPerformed(evt);
            }
        });

        btn_salir.setBackground(java.awt.Color.white);
        btn_salir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        btn_calcular.setBackground(java.awt.Color.white);
        btn_calcular.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_calcular.setForeground(new java.awt.Color(255, 255, 255));
        btn_calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/transmit_edit.png"))); // NOI18N
        btn_calcular.setMnemonic('C');
        btn_calcular.setText("Calcular");
        btn_calcular.setOpaque(false);
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        btn_verificar.setBackground(java.awt.Color.white);
        btn_verificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_verificar.setForeground(new java.awt.Color(255, 255, 255));
        btn_verificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/shape_square_edit.png"))); // NOI18N
        btn_verificar.setMnemonic('V');
        btn_verificar.setText("Verificar");
        btn_verificar.setEnabled(false);
        btn_verificar.setOpaque(false);
        btn_verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verificarActionPerformed(evt);
            }
        });

        btn_guardarResultados.setBackground(java.awt.Color.white);
        btn_guardarResultados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_guardarResultados.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardarResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/report_edit.png"))); // NOI18N
        btn_guardarResultados.setMnemonic('G');
        btn_guardarResultados.setText("Guardar Resultado");
        btn_guardarResultados.setEnabled(false);
        btn_guardarResultados.setOpaque(false);
        btn_guardarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarResultadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btn_guardarResultados)
                .addGap(32, 32, 32)
                .addComponent(btn_nueva_consulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salir)
                    .addComponent(btn_calcular)
                    .addComponent(btn_nueva_consulta)
                    .addComponent(btn_verificar)
                    .addComponent(btn_guardarResultados))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tbl_tabla.setBackground(new java.awt.Color(102, 102, 102));
        tbl_tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbl_tabla.setFont(new java.awt.Font("Arial", 1, 12));
        tbl_tabla.setForeground(new java.awt.Color(255, 255, 255));
        tbl_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbl_tabla.setAutoscrolls(false);
        tbl_tabla.setGridColor(new java.awt.Color(255, 204, 204));
        tbl_tabla.setSelectionForeground(new java.awt.Color(255, 255, 204));
        tbl_tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_tablaKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_tabla);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resumen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 255, 51))); // NOI18N

        tbl_resumen.setBackground(new java.awt.Color(102, 102, 102));
        tbl_resumen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbl_resumen.setFont(new java.awt.Font("Arial", 1, 12));
        tbl_resumen.setForeground(new java.awt.Color(255, 255, 255));
        tbl_resumen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Prueba", "Entradas", "Ocultas", "Salidas", "Aprendizaje", "Momento", "Error/Patron", "Error/Epoca", "# Ciclos/Epocas", "Func. Activación", "Correctamente", "Incorrectamente", "# Patrones/Datos ", "% Error ", "Tiempo ", "Epocas utilizadas"
            }
        ));
        jScrollPane1.setViewportView(tbl_resumen);
        tbl_resumen.getColumnModel().getColumn(1).setMinWidth(30);
        tbl_resumen.getColumnModel().getColumn(1).setPreferredWidth(40);
        tbl_resumen.getColumnModel().getColumn(2).setPreferredWidth(40);
        tbl_resumen.getColumnModel().getColumn(3).setPreferredWidth(40);
        tbl_resumen.getColumnModel().getColumn(4).setPreferredWidth(55);
        tbl_resumen.getColumnModel().getColumn(5).setPreferredWidth(55);
        tbl_resumen.getColumnModel().getColumn(6).setMinWidth(60);
        tbl_resumen.getColumnModel().getColumn(6).setPreferredWidth(60);
        tbl_resumen.getColumnModel().getColumn(7).setPreferredWidth(60);
        tbl_resumen.getColumnModel().getColumn(8).setPreferredWidth(70);
        tbl_resumen.getColumnModel().getColumn(12).setPreferredWidth(120);
        tbl_resumen.getColumnModel().getColumn(13).setPreferredWidth(35);
        tbl_resumen.getColumnModel().getColumn(14).setPreferredWidth(35);

        jLabel1.setFont(new java.awt.Font("Arial", 2, 11));
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setText("Números de Neuronas x Capas");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial", 2, 11));
        jLabel2.setForeground(new java.awt.Color(153, 255, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Factores Utilizados");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial", 2, 11));
        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("% límite Error utilizados");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 2, 11));
        jLabel4.setForeground(new java.awt.Color(153, 255, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Patrones Procesados");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Arial", 2, 11));
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Recursos Generados");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_observacion.setColumns(20);
        txt_observacion.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txt_observacion.setForeground(new java.awt.Color(255, 51, 51));
        txt_observacion.setRows(5);
        jScrollPane2.setViewportView(txt_observacion);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Observaciones :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1227, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nueva_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nueva_consultaActionPerformed
       nueva_fila();
       this.btn_verificar.setEnabled(true);
    }//GEN-LAST:event_btn_nueva_consultaActionPerformed

    private void calcular_consultas()
    {
       for(int vali=ven_MDI.nueva_red.getListaPatrones().getNumeroPatrones();vali< this.tbl_tabla.getRowCount();vali++)
        {
             calcular(vali,1,false);
        }
    }
    private void calcular_todo()
    {double por_error;
     double aux;
     double numPatrones;

        for(int vali=0;vali< this.tbl_tabla.getRowCount();vali++)
        {
             calcular(vali,tbl_tabla.getSelectedColumn(),true);
        }
        this.tbl_resumen.setValueAt(ven_MDI.nueva_red.getId(), 0, 0);
        this.tbl_resumen.setValueAt(ven_MDI.nueva_red.getCapa(0).getNumNeuronas(), 0, 1);
        this.tbl_resumen.setValueAt(ven_MDI.nueva_red.getCapa(1).getNumNeuronas(), 0, 2);
        this.tbl_resumen.setValueAt(ven_MDI.nueva_red.getCapa(2).getNumNeuronas(), 0, 3);
        this.tbl_resumen.setValueAt(ven_MDI.nueva_red.getFactorAprendizaje(), 0, 4);
        this.tbl_resumen.setValueAt(ven_MDI.nueva_red.getMomento(), 0, 5);
        this.tbl_resumen.setValueAt(ven_MDI.nueva_red.getErrorDeseadoPatron(),0, 6);
        this.tbl_resumen.setValueAt(ven_MDI.nueva_red.getErrorDeseado(), 0, 7);
        this.tbl_resumen.setValueAt(ven_MDI.nueva_red.getNumCiclos(), 0, 8);
        this.tbl_resumen.setValueAt(ven_MDI.nueva_red.getFuncionActivacion(), 0, 9);
        this.tbl_resumen.setValueAt(ven_MDI.nueva_red.getListaPatrones().getNumeroPatrones()-incorrectos,0, 10);
        this.tbl_resumen.setValueAt(incorrectos, 0, 11);
        this.tbl_resumen.setValueAt(ven_MDI.nueva_red.getListaPatrones().getNumeroPatrones(), 0, 12);
        aux=incorrectos*100;
        numPatrones=ven_MDI.nueva_red.getListaPatrones().getNumeroPatrones();
        por_error=aux/numPatrones;
        cls_variables_globales.numero_decimales=2;
        this.tbl_resumen.setValueAt(numero.Redondear(por_error), 0, 13);
        cls_variables_globales.numero_decimales=6;
        this.tbl_resumen.setValueAt(cls_variables_globales.tiempo_utilizado, 0, 14);
        this.tbl_resumen.setValueAt(cls_variables_globales.epoca, 0, 15);

    }

    private void calcular(int fila, int columna, boolean aprender)
{
          double entrada[];
          double entradaNormalizada[];
          double salida[];
          double valor;

          entrada= new double[ven_MDI.nueva_red.getListaPatrones().getPatron(0).getTamañoEntrada()];
          entradaNormalizada = new double[ven_MDI.nueva_red.getListaPatrones().getPatron(0).getTamañoEntrada()];

          salida = new double[ven_MDI.nueva_red.getListaPatrones().getPatron(0).getTamañoSalida()];
          salida[0]=0;


          for (int i=0;i<ven_MDI.nueva_red.getListaPatrones().getPatron(0).getTamañoEntrada();i++)
                {
                    valor= Double.parseDouble(modelo.getValueAt(fila, i+1).toString());
                    entrada[i]=valor;

                    if (aprender)
                        entradaNormalizada[i]=ven_MDI.nueva_red.getListaPatrones().getPatron(fila).getValorNormalizadoEntrada(i);
                    else
                        entradaNormalizada[i]= ven_MDI.nueva_red.getListaPatrones().getValorNormalizadoConsulta(Double.parseDouble(modelo.getValueAt(fila, i+1).toString()));
                        

               
                }

        
            Patron patron= new Patron( ven_MDI.nueva_red.getListaPatrones().getPatron(0).getTamañoSalida(),ven_MDI.nueva_red.getListaPatrones().getPatron(0).getTamañoEntrada(),salida,entrada,0);
            patron.setEntradaNormalizada(entradaNormalizada);

             //patron= consulta.ejecutarRed(patron,true);
                patron= consulta.ejecutarRed(patron,true);


           double respuesta= patron.getSalida()[0] * ( ven_MDI.nueva_red.getListaPatrones().getMaxSalida(0) - ven_MDI.nueva_red.getListaPatrones().getMinSalida(0))+ ven_MDI.nueva_red.getListaPatrones().getMinSalida(0);
           val= Math.rint(Math.round(respuesta)*100)/100;
           modelo.setValueAt( Math.round(respuesta), fila,  ven_MDI.nueva_red.getListaPatrones().getPatron(0).getTamañoEntrada() +2);
           val= Math.rint(Math.round(patron.getSalida()[0])*100)/100;
           modelo.setValueAt(Math.round(patron.getSalida()[0]), fila,  ven_MDI.nueva_red.getListaPatrones().getPatron(0).getTamañoEntrada() +3);
           val= Math.rint(Math.round(ven_MDI.nueva_red.getListaPatrones().getClaseDefinida(respuesta))*100)/100;
           modelo.setValueAt(Math.round(ven_MDI.nueva_red.getListaPatrones().getClaseDefinida(respuesta)),  fila,  ven_MDI.nueva_red.getListaPatrones().getPatron(0).getTamañoEntrada() +4);

           double clase_salida = Math.round(ven_MDI.nueva_red.getListaPatrones().getClaseDefinida(respuesta));
           double clase_esperada=Double.parseDouble(this.tbl_tabla.getValueAt(fila, this.tbl_tabla.getColumnCount()-4).toString());

           if (clase_salida!=clase_esperada)
               incorrectos++;

}

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
          dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void tbl_tablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_tablaKeyPressed
       calcular (this.tbl_tabla.getSelectedRow(),this.tbl_tabla.getSelectedColumn(),true);
    }//GEN-LAST:event_tbl_tablaKeyPressed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
     calcular_todo();
     this.btn_guardarResultados.setEnabled(true);
    }//GEN-LAST:event_btn_calcularActionPerformed

    private void btn_verificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verificarActionPerformed
       calcular_consultas();
    }//GEN-LAST:event_btn_verificarActionPerformed

    private void btn_guardarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarResultadosActionPerformed
      guardarPruebas();
    }//GEN-LAST:event_btn_guardarResultadosActionPerformed

    private void guardarPruebas()
    {
     String cadena;
     try{
            cadena=sql.armarQuery("insert_pruebas")+ "(" + this.tbl_resumen.getValueAt(0, 0) + "," + this.tbl_resumen.getValueAt(0,1) + "," +
                            this.tbl_resumen.getValueAt(0, 2) + "," + this.tbl_resumen.getValueAt(0, 3) + "," +
                            this.tbl_resumen.getValueAt(0, 4) + "," + this.tbl_resumen.getValueAt(0, 5) + "," +
                            this.tbl_resumen.getValueAt(0, 6) + "," + this.tbl_resumen.getValueAt(0, 7) + "," +
                            this.tbl_resumen.getValueAt(0, 8) + "," + this.tbl_resumen.getValueAt(0, 9) + "," +
                            this.tbl_resumen.getValueAt(0, 10) + "," + this.tbl_resumen.getValueAt(0,11) + "," +
                            this.tbl_resumen.getValueAt(0, 12) + "," + this.tbl_resumen.getValueAt(0,13) + ",'" +
                            this.tbl_resumen.getValueAt(0, 14).toString() + "'," + this.tbl_resumen.getValueAt(0,15) + ",'" +
                            this.txt_observacion.getText()+"')";
            if(mensajes.showConfirmDialog(null, "¿Seguro desea guardar la siguiente prueba?",titulo_mensajes,mensajes.YES_NO_OPTION )==0)
            {
                sql.ejecutar_sql(cadena);
                mensajes.showMessageDialog(null, "Prueba guardada correctamente", titulo_mensajes,mensajes.INFORMATION_MESSAGE);
            }
        }
     catch(Exception e)
     {
       mensajes.showMessageDialog(null, "Aún no se a ejecutado ninguna prueba, pruebe ejecutando una!", titulo_mensajes,mensajes.ERROR_MESSAGE);
     }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_guardarResultados;
    private javax.swing.JButton btn_nueva_consulta;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_verificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbl_resumen;
    private javax.swing.JTable tbl_tabla;
    private javax.swing.JTextArea txt_observacion;
    // End of variables declaration//GEN-END:variables

}
