/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ven_CurvaError.java
 *
 * Created on 07/08/2010, 10:20:20 PM
 */

package paq_ventanas;

import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.ui.RectangleInsets;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.plot.CategoryPlot;
//import org.jfree.chart.labels.
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author Jonathan
 */
public class ven_CurvaError extends javax.swing.JInternalFrame {

    /** Creates new form ven_CurvaError */
    public ven_CurvaError() {
        initComponents();
  
    }


    private void grafico_barra()
    {
    this.Pn_panel.setLayout(new java.awt.GridLayout(1, 1));
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    dataset.addValue(1.0, "Fila 1", "Columna 1");
    dataset.addValue(5.0, "Fila 1", "Columna 2");
    dataset.addValue(3.0, "Fila 1", "Columna 3");
    dataset.addValue(2.0, "Fila 2", "Columna 1");
    dataset.addValue(3.0, "Fila 2", "Columna 2");
    dataset.addValue(2.0, "Fila 2", "Columna 3");	//Crear el gráfico...
    JFreeChart chart = ChartFactory.createBarChart("Mi gráfico",			"Periodos",			"Unidades",			dataset,	//Dataset
    PlotOrientation.VERTICAL,			true,			true,			false);	//crear y visualizar una ventana...
    ChartFrame frame = new ChartFrame("First", chart);
    
    this.Pn_panel.add(frame);

    }
    private void grafico_curva()
    {
            this.Pn_panel.setLayout(new java.awt.GridLayout(1, 1));
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.addValue(1.0, "Fila 1", "Columna 1");
            dataset.addValue(5.0, "Fila 1", "Columna 2");
            dataset.addValue(3.0, "Fila 1", "Columna 3");
            dataset.addValue(2.0, "Fila 2", "Columna 1");
            dataset.addValue(3.0, "Fila 2", "Columna 2");
            dataset.addValue(2.0, "Fila 2", "Columna 3");	//Crear el gráfico...


            JFreeChart chart = ChartFactory.createLineChart("Mi gráfico",			"Periodos",			"Unidades",			dataset,	//Dataset
            PlotOrientation.VERTICAL,			true,			true,			false);	//crear y visualizar una ventana...
            ChartFrame frame = new ChartFrame("First", chart);
            frame.pack();
            frame.setVisible(true);
            this.Pn_panel.add(frame);

    }



    public void grafico_curva_error(double promedio[], double maximo[], double minimo[], int epocas)
    {
          
            XYSeries serie1 = new XYSeries("Error Promedio => " + promedio[epocas-1]);
            XYSeries serie2 = new XYSeries("Error Máximo => " + maximo[epocas-1]);
            XYSeries serie3 = new XYSeries("Error Mínimo => " + minimo[epocas-1]);


            for (int i=0;i<epocas;i++)
            {
                serie1.add(i,promedio[i]);
                serie2.add(i,maximo[i]);
                serie3.add(i,minimo[i]);
            }


            XYSeriesCollection xyseriescollection = new XYSeriesCollection();

            xyseriescollection.addSeries(serie1);
            xyseriescollection.addSeries(serie2);
            xyseriescollection.addSeries(serie3);






            JFreeChart chart = ChartFactory.createXYLineChart( "Curva de Error","Ciclos de Aprendizajes","Error de Entrenamiento",xyseriescollection,PlotOrientation.VERTICAL,true,true,false);
            
            chart.setBackgroundPaint(this.Pn_panel.getBackground());
            chart.setBorderPaint(Color.BLUE);
            chart.getXYPlot().getRangeAxis().setRange(0, 1);
            chart.getXYPlot().getRangeAxis().setLabelPaint(Color.white);
            chart.getXYPlot().getRangeAxis().setAxisLinePaint(Color.white);
            chart.getXYPlot().getRangeAxis().setTickLabelPaint(Color.white);
            chart.getXYPlot().getRangeAxis().setTickMarkPaint(Color.white);
           


          

           org.jfree.chart.LegendItemCollection leyenda= new org.jfree.chart.LegendItemCollection();
           org.jfree.chart.LegendItem dos= new org.jfree.chart.LegendItem ("ddddffgSerie1", "-", null, null,  chart.getPlot().DEFAULT_LEGEND_ITEM_BOX , Color.BLUE);
           leyenda.add(dos);

           chart.getXYPlot().getLegendItems().addAll(leyenda);



           

            ChartFrame frame = new ChartFrame("Grafico de la curva de error en " + epocas + " ciclos "  , chart);

            frame.pack();
            frame.setBackground(this.getBackground());
            //frame.setExtendedState(frame.MAXIMIZED_BOTH);
            frame.setLocation(300, 200);
            frame.setVisible(true);


    
    }



    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pn_panel = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/chart_curve.png"))); // NOI18N

        Pn_panel.setBackground(new java.awt.Color(102, 102, 102));
        Pn_panel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Pn_panelKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Pn_panelLayout = new javax.swing.GroupLayout(Pn_panel);
        Pn_panel.setLayout(Pn_panelLayout);
        Pn_panelLayout.setHorizontalGroup(
            Pn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );
        Pn_panelLayout.setVerticalGroup(
            Pn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pn_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pn_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Pn_panelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pn_panelKeyPressed

    }//GEN-LAST:event_Pn_panelKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pn_panel;
    // End of variables declaration//GEN-END:variables

}
