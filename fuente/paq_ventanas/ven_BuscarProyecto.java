
/*
 * ven_BuscarProyecto.java
 *
 * Created on 27/06/2010, 08:27:17 PM
 */

package paq_ventanas;
import java.awt.Color;
import java.sql.ResultSet;
import paq_logica.cls_sql;
import paq_logica.activarBoton;
import paq_logica.dibujaBoton;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class ven_BuscarProyecto extends javax.swing.JInternalFrame {

    private ResultSet resultado;
    private cls_sql sql= new cls_sql();
    private static JOptionPane mensajes;
    private static String titulo_mensajes="Busqueda de Proyectos";
  


    /** Creates new form ven_BuscarProyecto */
    public ven_BuscarProyecto() {
        initComponents();
        this.llenar_proyectos();
        this.tbl_proyectos.getTableHeader().setBackground(Color.DARK_GRAY);
        this.tbl_proyectos.getTableHeader().setForeground(Color.white);
        
    }

    private void llenar_proyectos()
    {
        javax.swing.table.DefaultTableCellRenderer tcr = new  javax.swing.table.DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.table.DefaultTableModel modelo= new javax.swing.table.DefaultTableModel();
        resultado= sql.ejecutarSelect(String.valueOf( sql.armarQuery("select_proyecto")));
        try{
             modelo.addColumn("Id");
             modelo.addColumn("Nombre");
             modelo.addColumn("Descripcion");
             modelo.addColumn("Creado");
             modelo.addColumn("Modificado");
             modelo.addColumn("Usuario");
             modelo.addColumn("Ver");


             this.tbl_proyectos.setModel(modelo);
             this.tbl_proyectos.getColumnModel().getColumn(0).setCellRenderer(tcr);
             this.tbl_proyectos.getColumnModel().getColumn(3).setCellRenderer(tcr);
             this.tbl_proyectos.getColumnModel().getColumn(4).setCellRenderer(tcr);
             this.tbl_proyectos.getColumnModel().getColumn(5).setCellRenderer(tcr);

             this.tbl_proyectos.getColumnModel().getColumn(0).setMaxWidth(30);
             this.tbl_proyectos.getColumnModel().getColumn(1).setMaxWidth(700);
             this.tbl_proyectos.getColumnModel().getColumn(2).setMaxWidth(900);
             this.tbl_proyectos.getColumnModel().getColumn(3).setMaxWidth(200);
             this.tbl_proyectos.getColumnModel().getColumn(4).setMaxWidth(200);
             this.tbl_proyectos.getColumnModel().getColumn(5).setMaxWidth(300);
             this.tbl_proyectos.getColumnModel().getColumn(6).setMaxWidth(100);

                  while(resultado.next())
                  {
                     Object [] filas = new Object[6];
                     filas[0]=resultado.getString(1);
                     filas[1]=resultado.getString(2);
                     filas[2]=resultado.getString(3);
                     filas[3]=resultado.getDate(4);
                     filas[4]=resultado.getDate(5);
                     filas[5]=resultado.getString(6);
                     modelo.addRow(filas);

                             
                  }                 
          }
        catch(SQLException e)
        {
           mensajes.showMessageDialog(null, e.toString(), titulo_mensajes, mensajes.ERROR_MESSAGE);
        }
        
       javax.swing.table.TableColumn columnaBoton;
       columnaBoton = tbl_proyectos.getColumnModel().getColumn(6);
       columnaBoton.setCellEditor(new activarBoton(tbl_proyectos));
       columnaBoton.setCellRenderer(new dibujaBoton(true));

    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_tablas_datos = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_proyectos = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 102, 102));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Abrir Proyecto");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/folder.png"))); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        tbl_tablas_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbl_tablas_datos);

        tbl_proyectos.setAutoCreateRowSorter(true);
        tbl_proyectos.setBackground(new java.awt.Color(102, 102, 102));
        tbl_proyectos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbl_proyectos.setFont(new java.awt.Font("Arial", 1, 12));
        tbl_proyectos.setForeground(new java.awt.Color(255, 255, 255));
        tbl_proyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripción", "Creado", "Modificado", "Usuario", ""
            }
        ));
        tbl_proyectos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbl_proyectos.setAutoscrolls(false);
        tbl_proyectos.setGridColor(new java.awt.Color(204, 255, 204));
        tbl_proyectos.setOpaque(false);
        tbl_proyectos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_proyectosKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_proyectos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(395, 395, 395)
                .addComponent(jScrollPane2, 0, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_proyectosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_proyectosKeyPressed

}//GEN-LAST:event_tbl_proyectosKeyPressed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbl_proyectos;
    private javax.swing.JTable tbl_tablas_datos;
    // End of variables declaration//GEN-END:variables

}
