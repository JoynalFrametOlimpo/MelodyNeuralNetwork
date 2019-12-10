

package paq_ventanas;

import java.awt.Color;
import org.jfree.data.general.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.ui.RectangleInsets;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.plot.CategoryPlot;
//import org.jfree.chart.labels.
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.function.*;
import org.jfree.chart.plot.DatasetRenderingOrder;

public class ven_CurvaNormal
{
    private IntervalXYDataset createHistograma(int muestras,double rangoInicial, double rangoFinal, double valores[]) {
      HistogramDataset dataset = new HistogramDataset();
 
      //double[] values = new double[1000];
      //java.util.Random generator = new java.util.Random(12345678L);
      //for (int i = 0; i < 1000; i++) {
       // values[i] = generator.nextGaussian() + 5;
         // System.out.println(values[i]);
     // }

      dataset.addSeries(" ", valores, muestras,rangoInicial, rangoFinal);

      return dataset;
    }



    private XYDataset crearNormal(double media, double varianza, int numeroMuestras, double rangoInicial, double rangoFinal) {
      XYSeriesCollection dataset = new XYSeriesCollection();
      String nombreSerie="Normal (Media= " +  media + " Varianza= "+ varianza + " # Muestras= "+ numeroMuestras;
      Function2D n1 = new NormalDistributionFunction2D(media, varianza);
      XYSeries s1 = DatasetUtilities.sampleFunction2DToSeries(n1, rangoInicial, rangoFinal,10000, nombreSerie);
      dataset.addSeries(s1);
      return dataset;
    }

    public void mostrar( double valores[], double media, double varianza, double rangoInicial,double rangoFinal, int numeroMuestra )
    {
      NumberAxis xAxis = new NumberAxis("eje X");
      xAxis.setAutoRangeIncludesZero(true);
      NumberAxis yAxis = new NumberAxis("eje Y");
      yAxis.setAutoRangeIncludesZero(false);

      XYItemRenderer renderer1 = new XYBarRenderer(0);

      XYPlot plot = new XYPlot(this.createHistograma( numeroMuestra,rangoInicial, rangoFinal,valores), xAxis, yAxis, renderer1);
      XYItemRenderer renderer2 = new StandardXYItemRenderer();
 
      plot.setDataset(1, crearNormal(media,varianza,numeroMuestra,rangoInicial,rangoFinal));
     plot.setRenderer(1, renderer2);

     plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);

      JFreeChart chart = new JFreeChart(" Distribucion Normal",
              JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        
        ChartFrame frame = new ChartFrame("Grafico  "  , chart);

            frame.pack();
            frame.setLocation(300, 200);
            frame.setVisible(true);

    }

   


}
