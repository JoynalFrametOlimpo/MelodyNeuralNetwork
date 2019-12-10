/*
    OK
 Se almacenan los pesos de las conexiones entre neuronas de cada capa
 La funcion principal de la sinapsis es la de unir 2 neuronas y pomderar su
 * conexxion con un peso

 */

package paq_arquitectura;

import paq_logica.cls_variables_globales;

public abstract class Sinapsis
{
    private double peso;
    private double peso_anterior;
    private int tipo_sinapsis;
    private Neurona neurona_inicio;
    private Neurona neurona_fin;
    private cls_variables_globales numero= new  paq_logica.cls_variables_globales();

   public Neurona getNeuronaInicio()
   {
       return this.neurona_inicio;
   }
    public Neurona getNeuronaFin()
   {
       return this.neurona_fin;
   }
   public void setNeuronaInicio(Neurona inicio)
   {
    this.neurona_inicio=inicio;
   }

   public void setNeuronaFin(Neurona fin)
   {
    this.neurona_fin=fin;
   }

   public void setTipoSinapsis(int tipo)
   {
        this.tipo_sinapsis=tipo;
   }
   public int getTipoSinapsis()
   {
        return this.tipo_sinapsis;
   }

    // deculeve el peso actual de la sinapsis
    public double getPeso()
    {
        return  this.peso;
    }

    // actualizar el peso de la sinapsis
     public void setPeso(double nuevo_peso)
     {
        this.peso= numero.Redondear(nuevo_peso);
     }
     public void setPesoAnterior(double peso_anterior)
     {
        this.peso_anterior=numero.Redondear(peso_anterior);
     }

      public double getPesoAnterior()
      {
        return this.peso_anterior;
      }
    // retorna el potencial Sinaptico:
    // Peso actual de la sinapsis * el estado neurona entrante

   public double getPotencialsinaptico()
   {
           return this.peso * this.neurona_inicio.getEstado();
   }
  
   // devuelve el estado de la neurona que entra a la sinapsis
   public double getEstadoNeuronaInicio()
   {
        return this.neurona_inicio.getEstado();
   }

   // devuelve el estado de la neurona que sale a la sinapsis
   public double getEstadoNeuronaFin()
   {
        return this.neurona_fin.getEstado();
   }

   // devuleve la salida deseada de la neurona que entra a la sinapsis
   public double getSalidaDeseadaNeuronaInicio()
   {
            return this.neurona_inicio.getSalidaDeseada();
   }

   // devuleve la salida deseada de la neurona que sale a la sinapsis
   public double getSalidaDeseadaNeuronaFin()
   {
            return this.neurona_fin.getSalidaDeseada();
   }

   public void setPesoAleatorio(double minimo, double maximo)
   {double f=0;

       java.util.Random estado_aleatorio= new java.util.Random();

       f=minimo + (estado_aleatorio.nextDouble()*(maximo-minimo));

       setPeso( numero.Redondear(f));
       setPesoAnterior(0);
   
   }

  

   public abstract void aprender(double factorAprendizaje, double momento,int funcion_activacion );
       /* Se debe definir para el tipo especifico a usar de sinapsis
            ya que determina el comportamiento en cuanto al aprendizaje
        Lo que debe hacer es actualizar el peso de la sinapsis siguiendo
        la regla de APRENDIZAJE del tipo de red a utilizar

        * 
        */
}











