// La clase capa la encargada de agrupar y organizar a las neuronas por
// nivel de procesamiento

package paq_arquitectura;

public abstract class  Capa
{
    private int orden;   // indica el nivel de capa 0= capa de entrada   y   n=capa_salida
    private int num_neuronas;
    private String tipo;
    private Neurona[] neuronas;
    private Sinapsis[][] sinapsis;
    private Patron patron;


    public Capa(){};

    public Capa(int num_neuronas, int nivel_id, String tipo_neurona)
    {
        this.num_neuronas= num_neuronas;
        this.tipo=tipo_neurona;
        this.orden= nivel_id;


        if (tipo_neurona.equals("Perceptron_Simple") )
            {
                 neuronas= new Neurona_PerceptronSimple[num_neuronas];
                for(int i=0; i<num_neuronas; i++)
                    crearNeurona("Perceptron_Simple",i);
               
            }

        if (tipo_neurona.equals("FeedForward") )
            {
                 neuronas= new Neurona_FeedForward[num_neuronas];

                for(int i=0; i<num_neuronas; i++)
                     crearNeurona("FeedForward",i);
            }

    }

    // une la capa actual a la capa_a_unir con el uso de la clase sinapsis
    public void unirCapas(Capa capa_superior,String tipo_union, String tipo_sinapsis,double peso1, double peso2)
    {
       if (this.getOrden()!=capa_superior.getOrden())   // si es la misma capa
       {
           if (tipo_union.equals( "Total"))
               {
                    sinapsis = new Sinapsis[this.num_neuronas][capa_superior.getNumNeuronas()];

                   for(int i=0; i<this.getNumNeuronas();i++)  // capa Inicio
                    {
                        for (int j=0; j< capa_superior.getNumNeuronas();j++)   // capa destino
                        {
                                        sinapsis[i][j]= new Sinapsis_FeedForward(this.getNeurona(i),capa_superior.getNeurona(j),0);
                                        sinapsis[i][j].setPesoAleatorio(peso1, peso2);
                                        capa_superior.getNeurona(j).setPesoUmbral(capa_superior.getNeurona(j).getPesoUmbralAleatorio(peso1, peso2));
                          }
                        }
                    }
               }

       }


  

    public void crearNeurona(String tipo_neurona, int id )
    {
       if (tipo_neurona.equals("FeedForward") )
            {
              neuronas[id]=new Neurona_FeedForward(id,0);
            }
       if (tipo_neurona.equals("Perceptron_Simple") )
            {
              neuronas[id]=new Neurona_PerceptronSimple(id,0);
            }
    }

    // Devuelve el identificador(Orden) de la capa; para la capa de entrada =0
    public int getOrden()
    {
        return this.orden;
    }

    public int getNumNeuronas()
    {
        return this.num_neuronas;
    }

    public int getNumSinapsisAdelante()
    {
           return sinapsis.length;
    }

    // devuleve el una neurona de la capa con identificador id_neurona
    public Neurona getNeurona(int id_neurona)
    {
        return this.neuronas[id_neurona];
    }


    /* devuelve la sinapsis que une
     * la neurona Origen y destino de acuerdo
     *  a su identificador de neurona
     */

    public Sinapsis getSinapsis(int NeuronaOrigen, int NeuronaDestino,String tipo_union)
    {
       return sinapsis[NeuronaOrigen][NeuronaDestino];
    }

    public void setSinapsis(int neuronaOrigen, int neuronaDestino,double peso)
    {
        this.sinapsis[neuronaOrigen][neuronaDestino].setPeso(peso);
    }


    //Este método llama al método ‘Metodo’ de todas las neuronas de la capa que
    // deben ser de la la clase ‘Tipo’.
    public void ejecutarNeurona(String tipo, String metodo)
    {

        if (tipo.equals("Neurona_FeedForward"))
        {
            if(metodo.equals("metodo_especial"))
            {
                for (int i=0;i<this.num_neuronas;i++)
                {
                        this.neuronas[i].metodo_especial();
                }

            }
        }

    }

     public void setErroresUmbralesDelta(double errorDeltaUmbral)
        {
            for (int x=0; x<this.getNumNeuronas();x++)
            {
                 this.getNeurona(x).setErrordeltaUmbral(errorDeltaUmbral);
            }
        }


    /* Este método llama al método ‘Metodo’ de una neurona aleatoria de la capa
      ‘NumVeces’ Veces . La neuronas deben ser de la la clase ‘Tipo’.
      Tiene la limitacion de que no se pueden pasar parametros a las neuronas.
      Este método esta pensado para simular las redes asincronas que en las
      que no se actualizan todas las neuronas a la vez..
     */
    public void ejecutarNeuronaAleatoria(String tipo, String metodo, int numVeces)
    {

    }


    // este metodo actualiza todas las neuronas de la capa segun se lo define el
    // metodo actualizar de la neurona hija (Sincronismo)
    public void actualizarNeuronas(int tipo)
    {
          int num_neurona=this.num_neuronas;
             for (int s=0; s<num_neurona;s++)
             {
                this.neuronas[s].actualizar(tipo);
             }
    }

    // actualiza a numVeces neuonas escogidas aleatoriamente entres las neuronas
    // de las capas
    public void actualizarNeuronasAleatorias(int numVeces)
    {

    }

    /* Usando estos métodos se le dice a todas las sinapsis que llegan a la
       capa actual desde una capa de delante y que quedan enmarcadas dentro de
        la capa de sinapsis ‘Sinspsis_adelante’ que aprendan. Esto es, que
       actualicen sus pesos usando el método aprender que sera distinto para
       cada tipo de sinapsis.

       */

    public void aprenderAdelante(double parametros[])
    {

    }

    //Este metodo hace que todas las neuronas tengan por estado los valores 
    // del patron. Se asigna por orden, es decir la primera neurona recibe el primer
    // valor y asi susecivamente
    public void enviarPatron(Patron p , boolean aprender )
    {
        int tamañoEntrada= p.getTamañoEntrada();

        
         for (int i=0;i< tamañoEntrada;i++)
         {
            if (aprender)
                  this.neuronas[i].setEstado(p.getValorNormalizadoEntrada(i));    // enviar datos normalizados
            else
                 this.neuronas[i].setEstado(p.getValorEntrada(i));
         }
    }



    // Hece que todas las neuronas de la capa tengan por salida deseada los valores
    // de salida que tiene el patron
    public void enviarSalida(Patron p)
    {
      for (int i=0;i<this.num_neuronas;i++ )
        {
           // this.neuronas[i].setSalidaDeseada(p.);
        }

    }

  
    public Patron getEstado()
    {
       double entradas[]=new double[0];
       double salidas[]= new double[this.num_neuronas];
            for (int i=0;i<this.num_neuronas;i++)
            {
                 salidas[i]= this.neuronas[i].getEstado();
            }
            this.patron= new Patron(entradas,salidas);
            return patron;
    }

    public void setPotencial(Capa capa_referencia){};
}
