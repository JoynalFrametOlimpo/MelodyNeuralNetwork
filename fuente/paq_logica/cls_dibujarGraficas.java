
package paq_logica;


import java.awt.Color;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.plot.PlotOrientation;

public class cls_dibujarGraficas
{
    private int numValoresFActivacion;
    private int funcionSeleccionada;
 
 public JFreeChart dibujarCurvaError()
    {
      XYSeries serie1 = new XYSeries("Error Promedio => " + cls_variables_globales.erroresPromedio[ paq_logica.cls_variables_globales.epoca-1]);
      XYSeries serie2 = new XYSeries("Error Máximo => " + paq_logica.cls_variables_globales.erroresMaximo[ paq_logica.cls_variables_globales.epoca-1]);
      XYSeries serie3 = new XYSeries("Error Mínimo => " + paq_logica.cls_variables_globales.erroresMinimo[ paq_logica.cls_variables_globales.epoca-1]);

            for (int i=0;i<paq_logica.cls_variables_globales.epoca;i++)
            {
                serie1.add(i,cls_variables_globales.erroresPromedio[i]);
                serie2.add(i,cls_variables_globales.erroresMaximo[i]);
                serie3.add(i,cls_variables_globales.erroresMinimo[i]);
            }

            XYSeriesCollection xyseriescollection = new XYSeriesCollection();

            xyseriescollection.addSeries(serie1);
            xyseriescollection.addSeries(serie2);
            xyseriescollection.addSeries(serie3);

            JFreeChart chart1 = ChartFactory.createXYLineChart( "Curva de Error","Ciclos de Aprendizajes","Error de Entrenamiento",xyseriescollection,PlotOrientation.VERTICAL,true,true,false);

            chart1.setBackgroundPaint(Color.gray);
            chart1.setBorderPaint(Color.BLUE);
            chart1.getXYPlot().getRangeAxis().setRange(0, 1);
            chart1.getXYPlot().getRangeAxis().setLabelPaint(Color.white);
            chart1.getXYPlot().getRangeAxis().setAxisLinePaint(Color.white);
            chart1.getXYPlot().getRangeAxis().setTickLabelPaint(Color.white);
            chart1.getXYPlot().getRangeAxis().setTickMarkPaint(Color.white);

            org.jfree.chart.LegendItemCollection leyenda= new org.jfree.chart.LegendItemCollection();
            org.jfree.chart.LegendItem dos= new org.jfree.chart.LegendItem ("ddddffgSerie1", "-", null, null,  chart1.getPlot().DEFAULT_LEGEND_ITEM_BOX , Color.BLUE);
            leyenda.add(dos);

            chart1.getXYPlot().getLegendItems().addAll(leyenda);
            return chart1;

    }

  public JFreeChart dibujarFunciones(int funcion)
    {
        JFreeChart grafico;
        XYSeries FuncionActivacion = new XYSeries("Funcion de Activación ");
        int contador=0;
        funcionSeleccionada=funcion;

        for(int j=paq_logica.cls_variables_globales.rangoMinimoFActivacion;j<=paq_logica.cls_variables_globales.rangoMaximoFActivacion;j++)
            {

                FuncionActivacion.add(j, getValoresSigmodide(paq_logica.cls_variables_globales.constanteAmplitudActivacion)[contador]);
                contador++;
            }

        XYSeriesCollection xyseriescollection = new XYSeriesCollection();
        xyseriescollection.addSeries(FuncionActivacion);

            grafico = ChartFactory.createXYLineChart( "Función de Activación con amplitud " + paq_logica.cls_variables_globales.constanteAmplitudActivacion ,"Entradas","Salidas",xyseriescollection,PlotOrientation.VERTICAL,true,true,false);
            grafico.setBackgroundPaint(Color.gray);
            grafico.setBorderPaint(Color.BLUE);
            grafico.getXYPlot().getRangeAxis().setRange(-1.2, 1.2);
            grafico.getXYPlot().getRangeAxis().setLabelPaint(Color.white);
            grafico.getXYPlot().getRangeAxis().setAxisLinePaint(Color.white);
            grafico.getXYPlot().getRangeAxis().setTickLabelPaint(Color.white);
            grafico.getXYPlot().getRangeAxis().setTickMarkPaint(Color.white);

            return grafico;
    }

     private double[] getValoresSigmodide(double constanteK)
    {
        numValoresFActivacion= Math.abs(paq_logica.cls_variables_globales.rangoMinimoFActivacion)+Math.abs(paq_logica.cls_variables_globales.rangoMaximoFActivacion);
        double[] valores= new double[numValoresFActivacion+1];
        int entrada=paq_logica.cls_variables_globales.rangoMinimoFActivacion;
        for (int i=0;i<=numValoresFActivacion;i++)
        {
            //valores[i]=1/(1+ Math.exp(-1*constanteK*c));
              valores[i]=valorFuncion(funcionSeleccionada,constanteK,entrada);
            entrada++;
        }
        return valores;

    }

     private double valorFuncion(int funcion, double constanteK,double in)
     {
        switch (funcion)
        {
            case 0:
                if (in>=0)
                    return 1;
                            return -1;
            case 1:
                if (in>=0)
                    return 1;
                            return 0;
            case 2: //Sigmoide
                return 1/(1+ Math.exp(-1*constanteK*in));
            case 3: // TangHiperbolica
                return (Math.exp(constanteK*in)-Math.exp(-constanteK*in))/(Math.exp(constanteK*in)+Math.exp(-constanteK*in));
        }
        return 0;

     }

}
