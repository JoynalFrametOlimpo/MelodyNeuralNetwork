/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package paq_arquitectura;

/**
 *
 * @author Jonathan
 */
public class Sinapsis_FeedForward extends Sinapsis
{
    private int tipo_sinapsis=2;

      public Sinapsis_FeedForward(Neurona inicio, Neurona fin,double peso)
            {
                      super.setNeuronaInicio(inicio);
                      super.setNeuronaFin(fin);
                      super.setPeso(peso);
                      super.setTipoSinapsis(tipo_sinapsis);
            }


      // ++++++++++++++++++++ APRENDIZAJE A NIVEL DE SINAPSIS +++++++++++++++++++++


    public void aprender(double factorAprendizaje, double momento , int funcion_activacion)
        {   
            double peso_anterior= this.getPesoAnterior();
            double peso_actual= this.getPeso();
            double peso_siguiente=0;
            double error_delta_neurona_fin=this.getNeuronaFin().getErrorDelta();
           // double error_delta_umbral= this.getNeuronaFin().getErrorDeltaUmbral();
            double salida_neurona_inicio=this.getEstadoNeuronaInicio();
            double salida_neurona_fin=this.getEstadoNeuronaFin();
            double derivada_salida_neurona_fin=0;

            if (funcion_activacion==2)
            {
                derivada_salida_neurona_fin=this.getNeuronaFin().getDerivadaSigmoide(salida_neurona_fin);
            }
            if (funcion_activacion==3)
            {
                 derivada_salida_neurona_fin=this.getNeuronaFin().getDerivadaTanh(salida_neurona_fin);
            }

            
        // AQUI    
             
            int id_neurona_inicio= this.getNeuronaInicio().getId();
            int id_neurona_fin=this.getNeuronaFin().getId();

          //  System.out.println("++++++++++++++++++++APRENDIZAJE HACIA ADELANTE+++++++++++++++++++++++++++       ");
           // System.out.println("Peso Actual desde la neurona= " + id_neurona_inicio + " - hasta la neurona "+ id_neurona_fin + "="+ peso_anterior);
           // System.out.println("Error delta Neurona Fin = "+  error_delta_neurona_fin);
            //System.out.println("Derivada de la Neurona Fin = " + derivada_salida_neurona_fin);
            //System.out.println("Estado Neurona Inicio = " +this.getEstadoNeuronaInicio() );
             //System.out.println("......MODIFICACION DE PESOS DE SINAPSIS.........     "  );

            /* double peso= this.getPeso()+
                      ( factorAprendizaje* this.getNeuronaFin().getErrorDelta()
                        *this.getNeuronaFin().getDerivadaSigmoide(this.getEstadoNeuronaFin())
                        * this.getEstadoNeuronaInicio());
             *
             */
            // System.out.println("FORMULA = " + peso_actual + "+ (" + factorAprendizaje  +" * "  + error_delta_neurona_fin  + " * " + salida_neurona_inicio + " * " + derivada_salida_neurona_fin +" + momento * pesoactual - peso anterior)"+ momento +" " + peso_actual + " "+ peso_anterior  );
             peso_siguiente= peso_actual + (factorAprendizaje * error_delta_neurona_fin * salida_neurona_inicio * derivada_salida_neurona_fin) + (momento * (peso_actual-peso_anterior));

             //actualizar el peso umbral

           //  System.out.println("AQUI= " + "PESO UMBRAL: " + this.getNeuronaFin().getPesoUmbral() + " , Factor Aprendizaje: " + factorAprendizaje +"* Error Delta: "+  error_delta_neurona_fin +"*-1* Derivada salida Neurona: " + derivada_salida_neurona_fin );
             this.getNeuronaFin().setPesoUmbral(this.getNeuronaFin().getPesoUmbral() + (factorAprendizaje*error_delta_neurona_fin*-1*derivada_salida_neurona_fin) );
             

            this.setPeso(peso_siguiente);
            this.setPesoAnterior(peso_actual);
           // System.out.println("Peso Aprendido = " +peso_actual );
        }

}
