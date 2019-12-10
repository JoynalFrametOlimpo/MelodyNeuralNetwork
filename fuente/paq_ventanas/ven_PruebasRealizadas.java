

/*
 * ven_PruebasRealizadas.java
 *
 * Created on 13/03/2011, 10:50:18 AM
 */

package paq_ventanas;

import paq_logica.cls_sql;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class ven_PruebasRealizadas extends javax.swing.JInternalFrame {

    private cls_sql sql=new cls_sql();
    private ResultSet resultado;
    private DefaultTableModel modelo;
    private DefaultTableCellRenderer formatoCentro;
    private DefaultTableCellRenderer formatoDerecha;
    private Object filas[];
    private JOptionPane mensajes;
 
    public ven_PruebasRealizadas() {
        initComponents();
        cargarPruebasExistentes();
    }

    private void cargarPruebasExistentes()
    {
        formatoCentro = new DefaultTableCellRenderer();
        formatoDerecha = new DefaultTableCellRenderer();
        formatoCentro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formatoDerecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        modelo= new DefaultTableModel();
        resultado= sql.ejecutarSelect(sql.armarQuery("select_pruebas"));
        try{
             modelo.addColumn("# Prueba");
             modelo.addColumn("Entradas");
             modelo.addColumn("Ocultas");
             modelo.addColumn("Salidas");
             modelo.addColumn("F.Aprendizaje");
             modelo.addColumn("F.Momento");
             modelo.addColumn("Error x Patron");
             modelo.addColumn("Error x Epoca");
             modelo.addColumn("Ciclos");
             modelo.addColumn("Activacion");
             modelo.addColumn("Correctos");
             modelo.addColumn("Incorrectos");
             modelo.addColumn("Total");
             modelo.addColumn("% Error");
             modelo.addColumn("Tiempo Ejecución");
             modelo.addColumn("Epocas");
             modelo.addColumn("Observacion");

             this.tbl_resumen.setModel(modelo);
             this.tbl_resumen.getColumnModel().getColumn(0).setCellRenderer(formatoCentro);
             this.tbl_resumen.getColumnModel().getColumn(1).setCellRenderer(formatoCentro);
             this.tbl_resumen.getColumnModel().getColumn(2).setCellRenderer(formatoCentro);
             this.tbl_resumen.getColumnModel().getColumn(3).setCellRenderer(formatoCentro);

             this.tbl_resumen.getColumnModel().getColumn(4).setCellRenderer(formatoDerecha);
             this.tbl_resumen.getColumnModel().getColumn(5).setCellRenderer(formatoDerecha);
             this.tbl_resumen.getColumnModel().getColumn(6).setCellRenderer(formatoDerecha);
             this.tbl_resumen.getColumnModel().getColumn(7).setCellRenderer(formatoDerecha);

             this.tbl_resumen.getColumnModel().getColumn(8).setCellRenderer(formatoCentro);
             this.tbl_resumen.getColumnModel().getColumn(9).setCellRenderer(formatoCentro);

             this.tbl_resumen.getColumnModel().getColumn(10).setCellRenderer(formatoDerecha);
             this.tbl_resumen.getColumnModel().getColumn(11).setCellRenderer(formatoDerecha);
             this.tbl_resumen.getColumnModel().getColumn(12).setCellRenderer(formatoDerecha);
             this.tbl_resumen.getColumnModel().getColumn(13).setCellRenderer(formatoDerecha);

             this.tbl_resumen.getColumnModel().getColumn(14).setCellRenderer(formatoCentro);
             this.tbl_resumen.getColumnModel().getColumn(15).setCellRenderer(formatoCentro);

             this.tbl_resumen.getColumnModel().getColumn(0).setMaxWidth(55);
             this.tbl_resumen.getColumnModel().getColumn(1).setMaxWidth(60);
             this.tbl_resumen.getColumnModel().getColumn(2).setMaxWidth(60);
             this.tbl_resumen.getColumnModel().getColumn(3).setMaxWidth(60);
             this.tbl_resumen.getColumnModel().getColumn(4).setMaxWidth(180);
             this.tbl_resumen.getColumnModel().getColumn(5).setMaxWidth(150);
             this.tbl_resumen.getColumnModel().getColumn(6).setMaxWidth(180);
             this.tbl_resumen.getColumnModel().getColumn(7).setMaxWidth(190);
             this.tbl_resumen.getColumnModel().getColumn(8).setMaxWidth(60);
             this.tbl_resumen.getColumnModel().getColumn(9).setMaxWidth(60);
             this.tbl_resumen.getColumnModel().getColumn(10).setMaxWidth(60);
             this.tbl_resumen.getColumnModel().getColumn(11).setMaxWidth(60);
             this.tbl_resumen.getColumnModel().getColumn(12).setMaxWidth(60);
             this.tbl_resumen.getColumnModel().getColumn(13).setMaxWidth(60);
             this.tbl_resumen.getColumnModel().getColumn(14).setMaxWidth(150);
             this.tbl_resumen.getColumnModel().getColumn(15).setMaxWidth(60);
                  while(resultado.next())
                  {
                     Object [] filas = new Object[17];
                     filas[0]=resultado.getInt(1);
                     filas[1]=resultado.getInt(2);
                     filas[2]=resultado.getInt(3);
                     filas[3]=resultado.getInt(4);
                     filas[4]=resultado.getDouble(5);
                     filas[5]=resultado.getDouble(6);
                     filas[6]=resultado.getDouble(7);
                     filas[7]=resultado.getDouble(8);
                     filas[8]=resultado.getInt(9);
                     filas[9]=resultado.getInt(10);
                     filas[10]=resultado.getInt(11);
                     filas[11]=resultado.getInt(12);
                     filas[12]=resultado.getInt(13);
                     filas[13]=resultado.getDouble(14);
                     filas[14]=resultado.getString(15);
                     filas[15]=resultado.getInt(16);
                     filas[16]=resultado.getString(17);
                     modelo.addRow(filas);
                  }
          }
        catch(SQLException e)
        {
           mensajes.showMessageDialog(null, e.toString(), "Consultas de Pruebas Existentes", mensajes.ERROR_MESSAGE);
        }



    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_resumen = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consultas de Pruebas o Evaluaciones Realizadas");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/text_signature.png"))); // NOI18N

        tbl_resumen.setBackground(new java.awt.Color(102, 102, 102));
        tbl_resumen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbl_resumen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tbl_resumen.setForeground(new java.awt.Color(255, 255, 255));
        tbl_resumen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "# Prueba", "Entradas", "Ocultas", "Salidas", "Aprendizaje", "Momento", "Error/Patron", "Error/Epoca", "# Ciclos/Epocas", "Func. Activación", "Correctamente", "Incorrectamente", "# Patrones/Datos ", "% Error ", "Tiempo ", "Epocas utilizadas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_resumen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1247, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1263, 630);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_resumen;
    // End of variables declaration//GEN-END:variables

}
