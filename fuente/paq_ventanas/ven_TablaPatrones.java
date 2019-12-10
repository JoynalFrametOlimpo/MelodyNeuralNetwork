/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ven_TablaPatrones.java
 *
 * Created on 29/06/2010, 11:53:32 PM
 */

package paq_ventanas;
import paq_logica.cls_sql;
import paq_logica.cls_variables_globales;
import paq_arquitectura.GestionProyecto;
import paq_arquitectura.Patron;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class ven_TablaPatrones extends javax.swing.JInternalFrame {

    cls_sql sql= new cls_sql();
    ResultSet resultado;
    ResultSet r1;
    GestionProyecto secuencia= new GestionProyecto();
    javax.swing.table.DefaultTableModel modelo= new javax.swing.table.DefaultTableModel();
    javax.swing.table.DefaultTableModel modelo1= new javax.swing.table.DefaultTableModel();
    String tabla = ven_MDI.nueva_red.getTabla();
    private cls_variables_globales numero= new cls_variables_globales();
    private String sentencia;
    private int i;
    private int tamañoEntradas=0;
    private int tamañoSalidas=0;
    private int numeroPatrones;
    private double[] valoresEntradas;
    private double[] valoresSalidas;
    private String[] columnaEntradas;
    private String[] columnaSalidas ;
    public Patron patron[];             // arreglo de tipo patron
    private JOptionPane mensajes;
    private String titulo_mensajes="Asignación de Patrones de Datos";
    javax.swing.table.DefaultTableCellRenderer tcr = new  javax.swing.table.DefaultTableCellRenderer();
    int fil;



    /** Creates new form ven_TablaPatrones */
    public ven_TablaPatrones() {
        initComponents();
        setTabla2();
        llenar_campos();
        llenar_IN_OUT();
        this.patron= new Patron[this.tbl_tabla.getRowCount()];
        formato();
        this.lbl_entradas.setText(String.valueOf(ven_MDI.nueva_red.getCapa(0).getNumNeuronas()));
        this.lbl_salida.setText(String.valueOf(ven_MDI.nueva_red.getCapa(2).getNumNeuronas()));
       // this.lbl_patrones.setText(String.valueOf(ven_MDI.nueva_red.getListaPatrones().getNumeroPatrones()));
                
    }

    private void setTabla2()
    {
      modelo1.addColumn("Columna");
      modelo1.addColumn("Tipo Datos");
      modelo1.addColumn("Tipo Columna");
      this.tbl_set_patron.setModel(modelo1);

      
    }
 private void formato()
    {
        tcr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        for(fil=1;fil<this.tbl_tabla.getColumnCount();fil++)
        {
            this.tbl_tabla.getColumnModel().getColumn(fil).setCellRenderer(tcr);
            this.tbl_tabla.getColumnModel().getColumn(fil).setWidth(40);
        }
        for(fil=1;fil<this.tbl_set_patron.getColumnCount();fil++)
        {
            this.tbl_set_patron.getColumnModel().getColumn(fil).setCellRenderer(tcr);
            this.tbl_set_patron.getColumnModel().getColumn(fil).setWidth(40);
        }
    }
    private void llenar_IN_OUT()
    {
    r1= sql.ejecutarSelect(sql.armarQuery("select_detalle_patron") + ven_MDI.nueva_red.getId() );
      try{
              while (r1.next())
              {
                  
                  if (this.Isfila(r1.getString("nombre_columna"))== true)
                  {
                    this.tbl_set_patron.setValueAt(r1.getString("tipo"), this.getNumFila(r1.getString("nombre_columna")), 2);
                  }

              }
          }
       catch(SQLException e)
       {
            e.printStackTrace();
       }

    }

    private void llenar_campos()
{
        Object campo[]= new Object[2];
        if  (ven_MDI.nueva_red.getId()==-1 )
                   {
                            javax.swing.JOptionPane.showMessageDialog(null , "No existe proyecto cargado","Tabla de Patrones ", WIDTH, null);
                   }
                   else
                   {
                      sentencia=sql.armarQuery("consultar_campos_tablas") +tabla + "' order by ordinal_position asc";

                      resultado= sql.ejecutarSelect( sentencia);
                        try{
                                  while( resultado.next())
                                  {
                                      modelo.addColumn(resultado.getString("COLUMN_NAME"));
                                        if (resultado.getString("DATA_TYPE").equals("decimal") || resultado.getString("DATA_TYPE").equals("double") || resultado.getString("DATA_TYPE").equals("int") || resultado.getString("DATA_TYPE").equals("float"))
                                        {
                                              campo[0]= resultado.getString("COLUMN_NAME");
                                              campo[1]= resultado.getString("DATA_TYPE");
                                              modelo1.addRow(campo);
                                        }

                                  }

                               this.tbl_tabla.setModel(modelo);

                          }
                        catch(SQLException e)
                        {
                                e.printStackTrace();
                        }

                     traerTablaPatrones();
                   }
}

    private void traerTablaPatrones()
    {
          sentencia= sql.armarQuery("consultar_tabla") + tabla + "`";
          resultado= sql.ejecutarSelect(sentencia);
          this.numeroPatrones=0;
             try{
                  while(resultado.next())
                  {
                      Object [] filas = new Object[modelo.getColumnCount()];
                      
                      for ( i=0;i<modelo.getColumnCount();i++)
                      {
                          filas[i]=resultado.getString(i+1);
                      }
                      modelo.addRow(filas);

                      this.numeroPatrones=this.numeroPatrones+1;
                  }

          }
        catch(SQLException e)
        {
                e.printStackTrace();
        }
           }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_tabla = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_set_patron = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_guardar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_patrones = new javax.swing.JLabel();
        lbl_salida = new javax.swing.JLabel();
        lbl_entradas = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        btn_guardar1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Tabla de Patrones de Datos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/table.png"))); // NOI18N

        tbl_tabla.setBackground(new java.awt.Color(102, 102, 102));
        tbl_tabla.setFont(new java.awt.Font("Arial", 1, 11));
        tbl_tabla.setForeground(new java.awt.Color(255, 255, 255));
        tbl_tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbl_tabla.setEnabled(false);
        tbl_tabla.setGridColor(new java.awt.Color(255, 255, 204));
        tbl_tabla.setSelectionForeground(new java.awt.Color(255, 255, 204));
        jScrollPane1.setViewportView(tbl_tabla);

        tbl_set_patron.setBackground(new java.awt.Color(102, 102, 102));
        tbl_set_patron.setFont(new java.awt.Font("Arial", 1, 11));
        tbl_set_patron.setForeground(new java.awt.Color(255, 255, 255));
        tbl_set_patron.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_set_patron.setGridColor(new java.awt.Color(255, 204, 204));
        tbl_set_patron.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tbl_set_patronInputMethodTextChanged(evt);
            }
        });
        tbl_set_patron.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_set_patronKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_set_patronKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbl_set_patronKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_set_patron);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Control", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        btn_guardar.setBackground(java.awt.Color.white);
        btn_guardar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/script_save.png"))); // NOI18N
        btn_guardar.setMnemonic('G');
        btn_guardar.setText("Guardar");
        btn_guardar.setOpaque(false);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_salir.setBackground(java.awt.Color.white);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(btn_guardar)
                .addGap(51, 51, 51)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salir)
                    .addComponent(btn_guardar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 11));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("# Neuronas Entradas :");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("# Neuronas Salidas :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Patrones :");

        lbl_patrones.setFont(new java.awt.Font("Arial", 0, 14));
        lbl_patrones.setForeground(new java.awt.Color(255, 255, 255));
        lbl_patrones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_patrones.setText("  ");

        lbl_salida.setFont(new java.awt.Font("Arial", 0, 14));
        lbl_salida.setForeground(new java.awt.Color(255, 255, 255));
        lbl_salida.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_salida.setText("  ");

        lbl_entradas.setFont(new java.awt.Font("Arial", 0, 14));
        lbl_entradas.setForeground(new java.awt.Color(255, 255, 255));
        lbl_entradas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_entradas.setText("   ");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Entradas (IN)  Salidas(OUT)");

        btn_guardar1.setBackground(java.awt.Color.white);
        btn_guardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/help.png"))); // NOI18N
        btn_guardar1.setToolTipText("Definir los campos de entradas y salidas de acuerdo a la configuración elegida");
        btn_guardar1.setBorder(null);
        btn_guardar1.setOpaque(false);
        btn_guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_entradas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbl_patrones, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btn_guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_entradas)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbl_salida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbl_patrones))))
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-684)/2, (screenSize.height-503)/2, 684, 503);
    }// </editor-fold>//GEN-END:initComponents

public synchronized void guardar()
{
int ocupado=0;
       try{
            if (validar())
                {
                    while(ocupado==1)
                    {
                         System.out.println("Espera");
                         System.out.println(Thread.currentThread().getName());
                         wait();

                    }
                    this.columnaEntradas= new String [contar("IN")];    // guarda el nombre de la columna de in
                    this.columnaSalidas= new String [contar("OUT")];    // guarda el nombre de la columna de out
                    if (guardarPatrones())
                    {
                        ven_MDI.nueva_red.setListaPatrones(this.patron);
                        ven_MDI.nueva_red.getListaPatrones().crear_ordenar_clases();
                        mensajes.showMessageDialog(null , "Patrones de Red asignado correctamente",titulo_mensajes, mensajes.INFORMATION_MESSAGE, null);
                    }
                    
                    ocupado=1;
                    notify();
                    
               }
            else
                mensajes.showMessageDialog(null , "Error al actualizar Patron de red", titulo_mensajes, mensajes.WARNING_MESSAGE, null);
            }
       catch(Exception e)
       {

       }


}


    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
     guardar();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private boolean validar()
    {
        if(contar("IN")!= Integer.parseInt(this.lbl_entradas.getText()) ||contar("OUT")!= Integer.parseInt(this.lbl_salida.getText()) )
        {
            mensajes.showMessageDialog(null, "Numero de entradas/salidas asociadas no corresponde al numero de entradas/salidas definidas para la red!", titulo_mensajes, mensajes.ERROR_MESSAGE);
            return false;
        }
        else
            return true;

    }
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
       dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardar1ActionPerformed

    private void tbl_set_patronKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_set_patronKeyPressed
   
                   

    }//GEN-LAST:event_tbl_set_patronKeyPressed

    private void tbl_set_patronInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tbl_set_patronInputMethodTextChanged
     
    }//GEN-LAST:event_tbl_set_patronInputMethodTextChanged

    private void tbl_set_patronKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_set_patronKeyReleased
    
    }//GEN-LAST:event_tbl_set_patronKeyReleased

    private void tbl_set_patronKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_set_patronKeyTyped

         evt.setKeyChar(String.valueOf(evt.getKeyChar()).toUpperCase().toCharArray()[0]);
    }//GEN-LAST:event_tbl_set_patronKeyTyped


    private int getNumColumna(String nombreColumna)
    {
        for (int v=0; v< this.tbl_tabla.getColumnCount();v++)
        {
                if (this.tbl_tabla.getColumnName(v).equals(nombreColumna))
                {
                    return v;
                }
        }
        return 0;
    }
    private boolean Isfila(String nombreFila)
    {
       
        for (int v=0; v< this.tbl_set_patron.getRowCount();v++)
        {
                if (this.tbl_set_patron.getValueAt(v, 0).equals(nombreFila))
                {
                   // System.out.println(v);
                    return true;
                }
        }
        return false;

    }

     private int getNumFila(String nombreFila)
    {
        for (int v=0; v< this.tbl_set_patron.getRowCount();v++)
        {
                if (this.tbl_set_patron.getValueAt(v, 0).equals(nombreFila))
                {
                    return v;
                }
        }
        return 0;
    }


    //  recorre LISTA DE PATRONES PARA EL ENTRENAMIENTO
    private void guardarDatos()
    {
      double valor=0;
      int j=0;
      int z=0;



      for (z=0;z< this.tbl_tabla.getRowCount() ;z++)    // por el numero total de patrones a guardar
      {

          this.valoresEntradas= new double [contar("IN")];    //
          this.valoresSalidas= new double [contar("OUT")];
         for (j=0 ; j< columnaEntradas.length ;j++)     // el numero total del
             {
                    valor= Double.parseDouble( this.tbl_tabla.getValueAt(z, getNumColumna(columnaEntradas[j])).toString());
                    //System.out.println("entrada= " + j + " : " + valor);
                    this.valoresEntradas[j]=numero.Redondear(valor);

             }

          for (j=0 ; j< columnaSalidas.length ;j++)
             {
                  valor= Double.parseDouble( this.tbl_tabla.getValueAt(z, getNumColumna(columnaSalidas[j])).toString());
                  this.valoresSalidas[j]=numero.Redondear(valor);

             }

         // System.out.println("ffff" + this.valoresEntradas[0]);
         this.patron[z]= new Patron(this.tamañoSalidas,this.tamañoEntradas,this.valoresSalidas,this.valoresEntradas,  z);
         // System.out.println("aqui" + this.patron[z].getValorEntrada(0));
      }
       
    }

    public int contar(String tipo)
    { int contador=0;
       for (i=0; i<this.tbl_set_patron.getRowCount();i++)
       {
                if (String.valueOf(this.tbl_set_patron.getValueAt(i, 2)).equals(tipo))
                {
                    contador=contador+1;
                }
       }
      return contador;
    }




    // guarda los patrones de a utilizar en el entrenamiento
    public boolean guardarPatrones()
    {

        // toma la informacion de
         for (i=0; i<this.tbl_set_patron.getRowCount();i++)
         {
            if (String.valueOf(this.tbl_set_patron.getValueAt(i, 2)).equals("IN"))
            {
                columnaEntradas[this.tamañoEntradas]= String.valueOf(this.tbl_set_patron.getValueAt(i, 0));
                this.tamañoEntradas=this.tamañoEntradas+1;
                sql.ejecutar_sql(sql.armarQuery("insert_detalle_patron") + "(" + ven_MDI.nueva_red.getId() +",'"+ String.valueOf(this.tbl_set_patron.getValueAt(i, 0)) + "','IN')");
            }
            if (String.valueOf(this.tbl_set_patron.getValueAt(i, 2)).equals("OUT"))
            {
                columnaSalidas[this.tamañoSalidas]= String.valueOf(this.tbl_set_patron.getValueAt(i, 0));
                this.tamañoSalidas=this.tamañoSalidas+1;
                 sql.ejecutar_sql(sql.armarQuery("insert_detalle_patron") + "(" + ven_MDI.nueva_red.getId() +",'"+ String.valueOf(this.tbl_set_patron.getValueAt(i, 0)) + "','OUT')");
            }
         }
         
      
        if (sql.ejecutar_sql(sql.armarQuery("insert_patron") + "( " + ven_MDI.nueva_red.getId() + "," + this.tamañoEntradas + "," + this.tamañoSalidas + ")"))
        {
            guardarDatos();
            return true;
        }
        else
        {
              return false;
        }
             


    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_guardar1;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_entradas;
    private javax.swing.JLabel lbl_patrones;
    private javax.swing.JLabel lbl_salida;
    private javax.swing.JTable tbl_set_patron;
    private javax.swing.JTable tbl_tabla;
    // End of variables declaration//GEN-END:variables

}
