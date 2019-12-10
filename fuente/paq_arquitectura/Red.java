package paq_arquitectura;
import paq_logica.cls_variables_globales;
/*
  Es una de las clase principales del proyecto, proporciona metodos para
  la defincion de arquitectura, dinamica y aprendizaje de la red a utilizar

  Por tener metodos abstractos no definidos como el:
    + constructor
    + ejecutar
    + aprender
 */

/**
 *
 * @author Jonathan
 */
    public abstract class Red {
    private boolean entrenada=false;     // bandera que indica si la red ha sido entrenada
    private int id_proyecto;
    private int id_red;                 // clave primaria de la red
    private String tabla;               // nombre de la tabla de b/d a entrenar
    private int numCapas ;
    private int numCapasEntrada;
    private int numCapasSalidas;
    private int numCapasOcultas;
    private int numNeuronas;
    private int numNeuronasEntrada;
    private int numNeuronasSalida;
    private int numNeuronasOculta;
    private String tipo_Neurona_Entrada;
    private String tipo_Neurona_Salida;
    private String tipo_Neurona_Oculta;
    private double[][] capaOrden;
    private GestionProyecto secuencia = new GestionProyecto() ;
    private double factorAprendizaje;
    private double momento;
    private double error_deseado_total;
    private double error_deseado_patron;
    private int numCiclos;
    private int funcionActivacion;
    private double peso1;       // rango inferior de pesos iniciales
    private double peso2;       // rango superior de pesos iniciales
    private double entradaUmbral;
    public boolean parar=false;
    public boolean patronesSeteados=false;   // controla si se asociado los datos de analisis con patrones de datos

    private Capa capas[];
    private ListaPatrones listaPatrones;
    private cls_variables_globales numero= new cls_variables_globales();


 // el construnctor que se debe definir para las redes a utilizar
    public Red()
    {
    };

    public void setParar(boolean valor)
    {
        this.parar=valor;
    }
    public boolean getParar()
    {
        return this.parar;
    }
    public void setEntradaUmbral(double umbral)
    {
        this.entradaUmbral= umbral;
    }
    public double getEntradaUmbral()
    {
        return this.entradaUmbral;
    }

    public void setErrorDeseado(double errorDeseado)
    {
        this.error_deseado_total=errorDeseado;
    }
    public double getErrorDeseado()
    {
        return this.error_deseado_total;
    }

    public void setErrorDeseadoPatron(double errorPatron)
    {
        this.error_deseado_patron=errorPatron;
    }
    public double getErrorDeseadoPatron()
    {
           return this.error_deseado_patron;
    }
    public void setIdProyecto(int id_proyecto)
    {
        this.id_proyecto=id_proyecto;
    }

    public int getIdProyecto()
    {
        return this.id_proyecto;
    }

    public void setTabla(String tabla)
    {
        this.tabla=tabla;
    }

    public String getTabla()
    {
        return this.tabla;
    }
    // crea la capa de entrada con numNeuronas de acuedo a su tipo de Neurona
    public void crearCapaEntrada(int numNeuronas, String tipoNeurona)
    {
           this.numNeuronasEntrada= numNeuronas;
           this.tipo_Neurona_Entrada=tipoNeurona;
           this.numCapasEntrada= this.numCapasEntrada + 1;   // solo habra una capa de entrada

    }

     // crea la capa de salida con numNeuronas de acuedo a su tipo de Neurona
    // el numero maximo de capa es la cota el número máximo de capas que habrá
    // en la red .p.e. un perceptron unicapa => 2 capas, capas entonces NumMaximodeCapas = 3
    public void crearCapaSalida(int numNeuronas, String tipoNeurona, int numMaxCapas)
    {
           this.numNeuronasSalida= numNeuronas;
           this.tipo_Neurona_Salida=tipoNeurona;
           this.numCapasSalidas=this.numCapasSalidas+1;

    }

    // crea una nueva capa oculta con numNeuronas
    public void crearCapaOculta(int numNeurona, String tipoNeurona)
    {
            this.numNeuronasOculta= numNeuronas;
            this.tipo_Neurona_Oculta=tipoNeurona;
            this.numCapasSalidas= this.numCapasSalidas+1;
    }


    public void setCapa(Capa capa, int nivel)
    {
        this.capas[nivel]= capa;
    }

   
    // añade una neurona del tipoNeurona a una capa determinada ( Orden=0 entrada....)
    public void addNeurona(int OrdenCapa, String tipoNeurona )
    {

    }

    // añade una neurona del tipo neurona y la inicializa con un estado y una salida deseada
    public void addNeurona(int OrdenCapa, String tipoNeurona, double estado, double salidaDeseada)
    {
        
    }
    
    public void unir_neurona()
    {

    }

    public Capa getCapa(int nivel)
    {
        return capas[nivel];
    }
    public int getId()
    {
        return this.id_red;
    }
    public void setId(int id_red)
    {
        this.id_red=id_red;
        
    }

     public void setRed()
        {
            this.numCapas=0;
            this.numCapasEntrada=0;
            this.numCapasSalidas=0;
            this.numCapasOcultas=0;
            this.numNeuronas=0;
            this.numNeuronasEntrada=0;
            this.numNeuronasSalida=0;
            this.numNeuronasOculta=0;
            this.tipo_Neurona_Entrada="";
            this.tipo_Neurona_Salida="";
            this.tipo_Neurona_Oculta="";
            this.capas= new Capa[3];

        }

     public void setSinapsis(int capaOrigen, int neuronaOrigen, int capaDestino, int neuronaDestino, double peso)
     {
       this.getCapa(capaOrigen).setSinapsis(neuronaOrigen, neuronaDestino, peso);
     }

     public void setPesosUmbrales(int capa, int neurona, double peso)
     {
        this.getCapa(capa).getNeurona(neurona).setPesoUmbral(peso);
     }
     public void unirCapas(int CapaOrigen, int CapaDestino,String tipo_union,String nombreClaseSinapsis, double peso1, double peso2)
     {
            capas[CapaOrigen].unirCapas(capas[CapaDestino], tipo_union, "FeedForward", peso1,peso2);
     }
     
     public int getNumCapas()
     {
     return this.capas.length;
     }
     public int getnumNeuronas()
     {
         int Neuronas=0;
            for (int i=0; i< this.getNumCapas();i++)
            {
                Neuronas=Neuronas+ this.getCapa(i).getNumNeuronas();
            }
         return Neuronas;
     }

     public void setFactoraprendizaje(double factor)
     {
            this.factorAprendizaje=factor;
     }

     public double getFactorAprendizaje()
     {
            return this.factorAprendizaje;
     }

     public void setMomento(double momento)
     {
        this.momento=momento;
     }

     public double getMomento()
     {
        return this.momento;
     }

     public void setNumeroCiclos(int ciclos)
     {
            this.numCiclos=ciclos;
     }
     public int getNumCiclos()
     {
            return this.numCiclos;
     }
     public void setFuncionActivacion(int funcion)
     {
            this.funcionActivacion=funcion;
     }
     public int getFuncionActivacion()
     {
            return this.funcionActivacion;
     }
     public void setPesosAleatoriosNeuronasRed(double minimo, double maximo)
     {
         this.setPeso1(minimo);
         this.setPeso2(maximo);
       
     }

     private void setPeso1(double peso1)
     {
        this.peso1=peso1;
     }

     private void setPeso2(double peso2)
     {
        this.peso2=peso2;
     }
     public double getPeso1()
     {
          return this.peso1;
     }
     public double getPeso2()
     {
        return this.peso2;
     }

       public void setPotencialAtras(int id_capa)
         {
            double potencial;
            int num_capas_i=capas[id_capa].getNumNeuronas();
            int num_capas_j= capas[id_capa-1].getNumNeuronas();


            if (id_capa != 0 )   // menos la capa 1
            {
                for(int i=0; i< num_capas_i ;i++)   // POR TODAS LAS NEURONAS DE LA CAPA I
                {
                    potencial=0;
                    for (int j=0; j<num_capas_j;j++)
                    {
                        potencial= potencial +  (capas[id_capa-1].getNeurona(j).getEstado() * capas[id_capa-1].getSinapsis(j, i, "").getPeso() ) ;
                    }
                    potencial=potencial + (this.entradaUmbral * capas[id_capa].getNeurona(i).getPesoUmbral()) ;   // sumar el valor umbral
                    capas[id_capa].getNeurona(i).setPotencialAtras(potencial);
                    
                }
            }
       }



     public void setListaPatrones(Patron[] patrones)
     {
      
        this.listaPatrones= new ListaPatrones(patrones.length);
        this.listaPatrones.addPatrones(patrones);
        this.listaPatrones.normalizarpatrones();
        patronesSeteados=true; 
     }
     public boolean getPatronesSeteados()
     {
        return patronesSeteados;
     }

     public ListaPatrones getListaPatrones()
     {
        return this.listaPatrones;
     }

     public double error_medio_cuadratico(double salidaDeseada, double salidaRed)
     {
         //System.out.println("Deseada= " + salidaDeseada + " Red= " + salidaRed);
          return numero.Redondear(Math.pow((salidaDeseada-salidaRed), 2)/2);
         //return numero.Redondear(Math.abs( salidaDeseada-salidaRed));
     }
   

     public void calculaErrorDelta(Capa capa)
     {
         for (int i=0; i<capa.getNumNeuronas();i++)
         {
            capa.getNeurona(i).setErrorDelta(capa.getNeurona(i).getErrorDelta());

         }
     //this.getCapa(this.getNumCapas()-1).getNeurona(i).setErrorDelta(this.getErrorRed(null, null));

     }

     // si numVeces=0, se ejecutará una vez las sinapsis, se ejecutara nveces, aleatoriamente la sinapsis
     public void aprenderSinapsis(int CapaOrigen,int CapaDestino,double[] parametros,int numVeces)
     {

     };

     public Patron ejecutarRed(Patron p, boolean aprender)
     {
        return null;
     };

     public void aprender( ListaPatrones patrones){};

}

    