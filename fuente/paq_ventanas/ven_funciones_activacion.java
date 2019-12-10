
/*
 * ven_funciones_activacion.java
 *
 * Created on 29/10/2010, 08:39:12 PM
 */

package paq_ventanas;

import org.jfree.chart.ChartPanel;
import paq_logica.cls_dibujarGraficas;
import java.sql.SQLException;
import java.sql.ResultSet;
import paq_logica.cls_sql;
import javax.swing.JOptionPane;


/**
 *
 * @author Jonathan
 */
public class ven_funciones_activacion extends javax.swing.JInternalFrame
{
    private String sql;
    private ChartPanel panel;
    private ResultSet resultado;
    private JOptionPane mensajes;
    private String titulo_mensajes="Grafica de funciones de activación neuronal";
    private int id_funcion[] = new int[paq_logica.cls_variables_globales.numFuncionActivacion];
    private cls_sql clase_sql = new cls_sql();
    private cls_dibujarGraficas graficos= new cls_dibujarGraficas();


    /** Creates new form ven_funciones_activacion */
    public ven_funciones_activacion() {
        initComponents();
        inicio();
        llenar_combo_funcion();
    }

    private void inicio()
    {
        this.txt_constante.setText(String.valueOf(paq_logica.cls_variables_globales.constanteAmplitudActivacion));
        this.txt_minimo.setText(String.valueOf(paq_logica.cls_variables_globales.rangoMinimoFActivacion));
        this.txt_maximo.setText(String.valueOf(paq_logica.cls_variables_globales.rangoMaximoFActivacion));
        this.panel= new ChartPanel(graficos.dibujarFunciones(this.cmb_funcion_activacion.getSelectedIndex()));

        javax.swing.GroupLayout Pn_grafico1Layout = new javax.swing.GroupLayout(Pn_grafico1);
        Pn_grafico1.setLayout(Pn_grafico1Layout);
        Pn_grafico1Layout.setHorizontalGroup(
            Pn_grafico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_grafico1Layout.createSequentialGroup()
                .addComponent(panel)
                .addContainerGap( 0, 0))
        );
        Pn_grafico1Layout.setVerticalGroup(
            Pn_grafico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_grafico1Layout.createSequentialGroup()
                .addComponent(panel)
                .addContainerGap(0 ,0))
        );


    }
  
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pan_control = new javax.swing.JPanel();
        btn_aceptar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        lbl_pesos = new javax.swing.JLabel();
        txt_minimo = new javax.swing.JTextField();
        lbl_pesos1 = new javax.swing.JLabel();
        lbl_pesos2 = new javax.swing.JLabel();
        txt_maximo = new javax.swing.JTextField();
        txt_constante = new javax.swing.JTextField();
        lbl_pesos3 = new javax.swing.JLabel();
        cmb_funcion_activacion = new javax.swing.JComboBox();
        btn_imagen_funcion = new javax.swing.JButton();
        Pn_grafico1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(102, 102, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/page_white_actionscript.png"))); // NOI18N

        Pan_control.setBackground(new java.awt.Color(102, 102, 102));
        Pan_control.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Control", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(0, 204, 0))); // NOI18N

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

        lbl_pesos.setBackground(java.awt.Color.white);
        lbl_pesos.setFont(new java.awt.Font("Arial", 1, 11));
        lbl_pesos.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pesos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_pesos.setText("Extremo Menor :");

        txt_minimo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_minimo.setForeground(new java.awt.Color(255, 51, 51));
        txt_minimo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_minimo.setText("                  ");

        lbl_pesos1.setBackground(java.awt.Color.white);
        lbl_pesos1.setFont(new java.awt.Font("Arial", 1, 11));
        lbl_pesos1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pesos1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_pesos1.setText("Extremo Mayor :");

        lbl_pesos2.setBackground(java.awt.Color.white);
        lbl_pesos2.setFont(new java.awt.Font("Arial", 1, 11));
        lbl_pesos2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pesos2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_pesos2.setText("Constante (K) Amplitud :");

        txt_maximo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_maximo.setForeground(new java.awt.Color(255, 51, 51));
        txt_maximo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_maximo.setText("                  ");
        txt_maximo.setAutoscrolls(false);

        txt_constante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_constante.setForeground(new java.awt.Color(255, 51, 51));
        txt_constante.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_constante.setText("                  ");
        txt_constante.setAutoscrolls(false);
        txt_constante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_constanteActionPerformed(evt);
            }
        });

        lbl_pesos3.setBackground(java.awt.Color.white);
        lbl_pesos3.setFont(new java.awt.Font("Arial", 1, 11));
        lbl_pesos3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pesos3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_pesos3.setText("Función de Activación :");

        cmb_funcion_activacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmb_funcion_activacion.setForeground(new java.awt.Color(255, 51, 51));
        cmb_funcion_activacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_funcion_activacionItemStateChanged(evt);
            }
        });

        btn_imagen_funcion.setBackground(new java.awt.Color(102, 102, 102));
        btn_imagen_funcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_imagenes/1.png"))); // NOI18N

        javax.swing.GroupLayout Pan_controlLayout = new javax.swing.GroupLayout(Pan_control);
        Pan_control.setLayout(Pan_controlLayout);
        Pan_controlLayout.setHorizontalGroup(
            Pan_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pan_controlLayout.createSequentialGroup()
                .addGroup(Pan_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pan_controlLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(Pan_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_pesos)
                            .addComponent(lbl_pesos1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Pan_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_minimo, 0, 0, Short.MAX_VALUE)
                            .addComponent(txt_maximo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Pan_controlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_pesos2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_constante, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(Pan_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Pan_controlLayout.createSequentialGroup()
                        .addComponent(btn_aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_pesos3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pan_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmb_funcion_activacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_imagen_funcion, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        Pan_controlLayout.setVerticalGroup(
            Pan_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pan_controlLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(Pan_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pan_controlLayout.createSequentialGroup()
                        .addGroup(Pan_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Pan_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmb_funcion_activacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_pesos3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Pan_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_pesos)
                                .addComponent(txt_minimo, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Pan_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(Pan_controlLayout.createSequentialGroup()
                                .addGroup(Pan_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_pesos2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_constante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(Pan_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_maximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_pesos1))
                                .addGap(31, 31, 31))
                            .addComponent(btn_imagen_funcion)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pan_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_aceptar)
                        .addComponent(btn_salir)))
                .addContainerGap())
        );

        Pn_grafico1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout Pn_grafico1Layout = new javax.swing.GroupLayout(Pn_grafico1);
        Pn_grafico1.setLayout(Pn_grafico1Layout);
        Pn_grafico1Layout.setHorizontalGroup(
            Pn_grafico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        Pn_grafico1Layout.setVerticalGroup(
            Pn_grafico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pn_grafico1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Pan_control, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pan_control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pn_grafico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
    try{
        paq_logica.cls_variables_globales.rangoMinimoFActivacion= Integer.parseInt(this.txt_minimo.getText());
        paq_logica.cls_variables_globales.rangoMaximoFActivacion= Integer.parseInt(this.txt_maximo.getText());
        paq_logica.cls_variables_globales.constanteAmplitudActivacion= Double.parseDouble(this.txt_constante.getText());
        this.panel.setChart(graficos.dibujarFunciones(this.cmb_funcion_activacion.getSelectedIndex()));
        }
    catch(Exception e)
    {
        mensajes.showMessageDialog(null, "Valores no válidos !", titulo_mensajes, mensajes.ERROR_MESSAGE);
    }
}//GEN-LAST:event_btn_aceptarActionPerformed

 
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
}//GEN-LAST:event_btn_salirActionPerformed

    private void txt_constanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_constanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_constanteActionPerformed

    private void cmb_funcion_activacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_funcion_activacionItemStateChanged
     btn_imagen_funcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_imagenes/" + id_funcion[this.cmb_funcion_activacion.getSelectedIndex()] +".png")));
     btn_aceptarActionPerformed(null);
    }//GEN-LAST:event_cmb_funcion_activacionItemStateChanged

     private void llenar_combo_funcion()
    {
         int i=0;

            sql= " SELECT fun_descripcion,fun_id FROM redesneuronales.tab_funcion_activacion ";
            resultado=clase_sql.ejecutarSelect(sql);
        try
        {
            while(resultado.next())
            {
                this.cmb_funcion_activacion.addItem(resultado.getString("fun_descripcion"));
                 id_funcion[i]=resultado.getInt("fun_id");
                 i++;
            }
        }
        catch(SQLException e)
        {mensajes.showMessageDialog(null, e.toString(), titulo_mensajes, mensajes.ERROR_MESSAGE);}
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pan_control;
    private javax.swing.JPanel Pn_grafico1;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_imagen_funcion;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox cmb_funcion_activacion;
    private javax.swing.JLabel lbl_pesos;
    private javax.swing.JLabel lbl_pesos1;
    private javax.swing.JLabel lbl_pesos2;
    private javax.swing.JLabel lbl_pesos3;
    private javax.swing.JTextField txt_constante;
    private javax.swing.JTextField txt_maximo;
    private javax.swing.JTextField txt_minimo;
    // End of variables declaration//GEN-END:variables

}
