/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package paq_logica;
import paq_arquitectura.Red_FeedForward;

/**
 *
 * @author Jonathan
 */
public class cls_variables_globales
{
    public static String urlBase="localhost";

    public static String nombreBD="redesneuronales";

    public static String puertoBD="3306";

    public static String usuarioBD="root";

    public static String contraseñaBD="olimpo";

    public static Red_FeedForward red_actual;

    public static int espacio_x_neuronas= 550;

    public static int espacio_y_neuronas= 80;

    public static int ancho_radio_neurona= 60;

    public static int alto_radio_neurona=60;

    public static int numero_decimales=6;

    public static boolean parar=false;

    public static boolean aprendizajeEpoca=true;

    public static boolean aprendizajePatron=true;

    public static String nombreProyecto;

    public static int idProyecto;

    public static String nombreTabla;

    public static int tamañoMuestraHistograma= 100;

    public static int tamañoMuestraNormal=100;

    public static boolean curvaNormalHistograma=true;

    public static boolean curvaError=true;

    public static double erroresPromedio[];

    public static double erroresMinimo[];

    public static double erroresMaximo[];

    public static int epoca;

    public static javax.swing.JTable tabla_analisis_datos;

    /*Hilo que controla el tiempo de ejecución del entrenamiento*/
    public static Thread crono;

    public static String tiempo_utilizado;

    public static int epo;

    public static double error_total_procesando;

    public static double error_actual_procesando;

    public static int patron_actual_procesando;

    public static int desplazamiento_frames= 50;

    public static int numBasesDatosMYSQL=6;

    /* Controla el numero de funciones de activación que manejará el prototipo*/
    public static int numFuncionActivacion=4;

    /* Segun la funcion de activacion elegida controla la constante K*/
    public static double constanteAmplitudActivacion =1;

    /* Para la gráfica de la funcion de Activación controla el extremo inferior de la ascisa*/
    public static int rangoMinimoFActivacion=-10;

    /* Para la gráfica de la funcion de Activación controla el extremo superior de la ascisa*/
    public static int rangoMaximoFActivacion=10;

    public static final double roundDecimal(double number, int decimals)
    {
        java.math.BigDecimal bd = new java.math.BigDecimal(number);
        bd = bd.setScale(decimals,java.math.RoundingMode.HALF_EVEN);
        return bd.doubleValue();
    }

     public double Redondear(double numero)
    {
       switch (numero_decimales)
       {
           case 0: return Math.rint(numero*1)/1;
           case 1: return Math.rint(numero*10)/10;
           case 2: return Math.rint(numero*100)/100;
           case 3: return Math.rint(numero*1000)/1000;
           case 4: return Math.rint(numero*10000)/10000;
           case 5: return Math.rint(numero*100000)/100000;
           case 6: return Math.rint(numero*1000000)/1000000;
           case 7: return Math.rint(numero*10000000)/10000000;
         default : return numero;
       }

   }

     public double getPorMargenError(double salidaEsperada,double salidaRed)
     {
         //if (salidaEsperada<salidaRed)
           //return Math.abs(Redondear(salidaRed-salidaEsperada));
           return Math.abs(Redondear(salidaRed-salidaEsperada)/100);
         
     }

     public double getMediaMuestral(double valores[])
     {
         double media=0;
        for(int i=0; i< valores.length;i++)
        {
            media=media + valores[i];
        }
         return media/valores.length;
     }
     public double getDesviacionTipica(double valores[], double media)
     {
        double desviacion=0;
        for(int i=0; i<valores.length;i++)
        {
           desviacion=desviacion + Math.pow(valores[i],2);
        }
        return (desviacion/valores.length)-Math.pow(media, 2);
     }

     public double getMaximoArreglo(double arreglo[])
     {
        double maximo=0;
            for (int i =0;i<arreglo.length;i++)
            {
                if (arreglo[i]>maximo)
                    maximo=arreglo[i];
            }
        return maximo;
     }

     public double getMinimoArreglo(double arreglo[])
     {
        double minimo=1;
            for(int i=0;i<arreglo.length;i++)
            {
                if (arreglo[i]<minimo)
                    minimo=arreglo[i];
            }
        return minimo;
     }
        public String getTituloMensaje(int ventana)
    {
            String titulo;
        switch (ventana)
        {
            case 0:
                titulo= "Identificacion de Acceso";
            break;
            case 1:
                   titulo= "Creacion de Nuevo Proyecto";
            break;
            default:
                titulo="";
        }
        return titulo;
    }

}
