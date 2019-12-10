
package paq_arquitectura;
import java.util.Random;
import paq_logica.cls_variables_globales;

public abstract class Neurona
{
    private int neu_id;                                 // identificador de la neurona, el sesgo tiene el id=0
    private double neu_estado;                          //  Estado de la neruona
    private int neu_tipo_neurona;                       //1=Perceptron Simple,2= Perceptron Multicapa, 3= FeedForward
    private double neu_salida_deseada;
    private double neu_potencial_lateral;
    private double neu_potencial_adelante;
    private double neu_potencial_atras;
    private double neu_norma_cuadratica_adelante;
    private double neu_norma_cuadratica_lateral;
    private double neu_norma_cuadratica_atras;
    private double error_delta=0;
    private double peso_umbral;
    private double error_delta_umbral=0;
    private cls_variables_globales numero= new  paq_logica.cls_variables_globales();

  

    public Neurona(){};

    public Neurona(int id, double peso)
    {
        setId(id);
        setEstado(peso);
    }

    // devuelve el id de la neurona
    public int getId()
    {
        return this.neu_id;
    }

    // set el id de la neurona
    public void setId(int id)
    {
        this.neu_id=id;
    }

    public double getPesoUmbralAleatorio(double minimo, double maximo)
    {
       java.util.Random estado_aleatorio= new java.util.Random();

       return  numero.Redondear(minimo + (estado_aleatorio.nextDouble()*(maximo-minimo)));

    }


    public void setPesoUmbral(double pesoUmbral)
    {
        this.peso_umbral= numero.Redondear(pesoUmbral);
       // System.out.println("Peso Umbral de la neurona " +this.getId() + " = "  + pesoUmbral);
      
    }
    public double getPesoUmbral()
    {
        return this.peso_umbral;
    }


      // retorna el id del tipo de neurona
    public int getIdTipoNeurona()
    {
        return neu_tipo_neurona;
    }

    // setear el tipo de neurona
    public void setTipoNeurona(int id_tipo)
    {
       this.neu_tipo_neurona= id_tipo;
    }

    // devuleve el estado de activacion de la neurona
    public double getEstado()
    {
        return this.neu_estado;
    }

    // actuliza el estado de la neurona
    public void setEstado(double nuevoEstado)
    {
        
        this.neu_estado= numero.Redondear(nuevoEstado);
    }

    // devuleve el valor almacenado de la salida deseado de la neurona
    public double getSalidaDeseada()
    {
        return this.neu_salida_deseada;
    }

     // actualiza el valor de la salida deseada de la neurona
    public void setSalidaDeseada(double nuevaSalidaDeseada)
    {
        this.neu_salida_deseada= nuevaSalidaDeseada;
    }


    // actualiza el estado de la neurona a uno aleatorio comprendido
    // entre un minimo y un maximo, lo set con un double
    public void setEstadoAleatorio(double minimo, double maximo)
    {
        Random estado_aleatorio= new Random();
        this.neu_estado= minimo + (estado_aleatorio.nextDouble()*((maximo+1)-minimo));
    }

      // actualiza el estado de la neurona a uno aleatorio comprendido
    // entre un minimo y un maximo, lo set con un int
    public void setEstadoAleatorio(int minimo, int maximo)
    {
        Random estado_aleatorio= new Random();
        this.neu_estado= minimo + ((int)estado_aleatorio.nextInt()*((maximo+1)-minimo));
    }

    /************* Potenciales Neuronales **********************************/
    public void setPotencialAdelante(double potencial)
    {
        this.neu_potencial_adelante=numero.Redondear(potencial);
    }
     public void setPotencialLateral(double potencial)
    {
        this.neu_potencial_lateral=numero.Redondear(potencial);
    }
      public void setPotencialAtras(double potencial)
    {

        this.neu_potencial_atras=numero.Redondear(potencial);
    }
    public double getPotencialLateral()
    {
       return this.neu_potencial_lateral;
    }
    public double getPotencialAdelante()
    {
       return this.neu_potencial_adelante;
    }
    public double getPotencialAtras()
    {
       return this.neu_potencial_atras;
    }

    public void setErrorDelta(double error)
    {
        this.error_delta= numero.Redondear(error);
    }
    public double getErrorDelta()
    {
        return this.error_delta;
    }
      public void setErrordeltaUmbral(double error_delta_umbral)
        {
            this.error_delta_umbral=numero.Redondear(error_delta_umbral);
        }
      public double getErrorDeltaUmbral()
      {
         
        return this.error_delta_umbral;

      }
 /************* Normas Cuadraticas **********************************/

    /*
      Retorna la diferencia cuadratica entre los pesos asociados,
      esto es que llegan a la neurona desde delante, y el patrón que hay
      almacenado en la neurona a la que une esta sinapsis.

     Sirve para para hallar lo que se difierencian los pesos de las neuronas de
     los patrones de entrada las neuronas en las redes competitivas .
     Dependiendo si estamos considerando las conexiones de las neuronas
     que vienen desde atrás o desde adelante o de nuestra misma capa usaremos
     uno u otro metodo

     Devueleve la norma cuadratica entre la sinapsis y los estados de las
     neuronas. Son muy usadas en redes competitivas y no supervisadas

     Norma = raiz_2( suma( PesoSinapsis (i) - estado_neurona (i))^2)
     norma raiz_2(suma(potencial)^2)
     */
    public void setNormaCuadraticaAdelante(double norma_cuadratica)
    {
        this.neu_norma_cuadratica_adelante=norma_cuadratica;
    }

     public void setNormaCuadraticaLateral(double norma_cuadratica)
    {
        this.neu_norma_cuadratica_lateral=norma_cuadratica;
    }

      public void setNormaCuadraticaAtras(double norma_cuadratica)
    {
        this.neu_norma_cuadratica_atras=norma_cuadratica;
    }

    public double getNormaCuadraticaAdelante()
    {
      return  this.neu_norma_cuadratica_adelante;
    }
    public double getNormaCuadraticaAtras()
    {
       return  this.neu_norma_cuadratica_atras;
    }
    public double getNormaCuadraticaLateral()
    {
       return  this.neu_norma_cuadratica_lateral;
    }

   
    // muestra por pantalla los datos de la neurona
    public void pintar()
    {
        //System.out.println("Neurona #" + this.neu_id + ", tiene de " +
          //       " estado = "+ this.neu_estado);
    }

    public double getFuncionActivacion(int tipo, String direccionPotencial)
    {
        switch  (tipo) // funcion Signo
        {
            case 0:
                     if (direccionPotencial.equals("Atras"))
                        return getFuncionSigno(this.getPotencialAtras());
                     if (direccionPotencial.equals("Adelante"))
                        return getFuncionSigno(this.getPotencialAdelante());
                     if (direccionPotencial.equals("Lateral"))
                        return getFuncionSigno(this.getPotencialLateral());
                     break;
            case 1: // funcion Escalon
                     if (direccionPotencial.equals("Atras"))
                        return getFuncionEscalon(this.getPotencialAtras());
                     if (direccionPotencial.equals("Adelante"))
                        return getFuncionEscalon(this.getPotencialAdelante());
                     if (direccionPotencial.equals("Lateral"))
                        return getFuncionEscalon(this.getPotencialLateral());
                     break;
            case 2: // funcion Sigmoide
                     if (direccionPotencial.equals("Atras"))
                        return getFuncionSigmoide(this.getPotencialAtras());
                     if (direccionPotencial.equals("Adelante"))
                        return getFuncionSigmoide(this.getPotencialAdelante());
                     if (direccionPotencial.equals("Lateral"))
                        return getFuncionSigmoide(this.getPotencialLateral());
                     break;
            case 3: // funcion Tanh
                     if (direccionPotencial.equals("Atras"))
                        return getFuncionTahn(this.getPotencialAtras());
                     if (direccionPotencial.equals("Adelante"))
                        return getFuncionTahn(this.getPotencialAdelante());
                     if (direccionPotencial.equals("Lateral"))
                        return getFuncionTahn(this.getPotencialLateral());
                     break;

      }
            return 0;
    }

    public double getFuncionSigno(double potencial)
    {
            if (potencial>=0 )
                return 1;
            else
                return -1;
    }
       public double getFuncionEscalon(double potencial)
    {
            if (potencial>=0 )
                return 1;
            else
                return 0;
    }
          public double getFuncionSigmoide(double potencial)
            {
                return 1/(1+Math.exp(-potencial));
            }

          public double getFuncionTahn(double potencial)
            {
                return Math.tanh(potencial);
            }

       public double getDerivadaSigmoide(double potencial)
             {
            return potencial*(1-potencial);

            }

       public double getDerivadaTanh(double potencial)
       {
           return Math.pow((1/ Math.cosh(potencial)),2);
       }
        // Debemos pasar de un estado a otro a la neurona
    public abstract void actualizar(int tipo);
    // METODO DE LA DINAMICA DE LA NEURONA
    public abstract void metodo_especial();




}
