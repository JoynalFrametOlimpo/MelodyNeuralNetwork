/* Las rna funcionan con patrones, es decir la lista de valores de entrada
   o de salida que corresponde a los estados de las neuronas

 */
package paq_arquitectura;
import paq_logica.cls_sql;


public class Patron
{
    private int tamaño_entrada;   //Tamaño del array de Estados que tendra el patron.
    private int tamaño_salida;     // tamaño de array salidas deseadas q tendra patron
    private double salida[];
    private double entrada[];
    private double entrada_normalizada[];
    private double salida_normalizada[];
    private int posicion;         // posicion del patron  0,1,2.....N
    private cls_sql sql= new cls_sql();


     // Crea un patron con un array de tamños de entrada y salida, inicializando
    // los valores correspondiente del array
      public Patron(int tamSalida, int tamEntrada, double salida[],double entrada[], int posicion)
    {
        this.tamaño_entrada=tamEntrada;
        this.tamaño_salida=tamSalida;

        this.entrada= new double[tamEntrada];
        this.entrada_normalizada= new double[tamEntrada];
        this.entrada= entrada;
       

        this.salida = new double[tamSalida];
        this.salida_normalizada= new double[tamSalida];
        this.salida=salida;

        
        this.posicion=posicion;

    }

     public Patron(){};


     // Crea un patron con un array de tamños de entrada y salida, pero sin
    // inicializar valores (vacio)

    public Patron(int tamSalida, int tamEntrada)
    {
        this.tamaño_entrada=tamEntrada;
        this.tamaño_salida=tamSalida;
        this.entrada= new double[tamEntrada];
        this.salida = new double[tamSalida];


    }
    public Patron(double entradas[],double salidas[])
    {
            this.tamaño_entrada= entradas.length;
            this.tamaño_salida= salidas.length;
            this.entrada=entradas;
            this.salida=salidas;
    }


    public int getPosicion()
    {
        return this.posicion;
    }


    public void setEntradaNormalizada(double[] datos)
        {
                this.entrada_normalizada=datos;
        }
     public void setSalidaNormalizada(double[] datos)
        {
                this.salida_normalizada =datos;
        }
    // actualiza o cambia Posición a que se refiere.tiene que tener
    //  valores entre 0... tamañoEntrada-1

    public void cambiarSalida(double valor, int posicion)
    {
        this.salida[posicion]=valor;
    }

    public void cambiarentrada(double valor, int posicion)
    {
        this.entrada[posicion]=valor;
    }

 // devuleve el valor de entrada de array de acuerdo a su posicion
    public double getValorEntrada(int posicion)
    {
            return this.entrada[posicion];
    }
    public double getValorNormalizadoEntrada(int posicion)
    {
            return this.entrada_normalizada[posicion];
    }
    public double getValorNormalizadoSalida(int posicion)
    {
            return this.salida_normalizada[posicion];
    }

    public double getValorSalida(int posicion)
        {
                return this.salida[posicion];
        }

    public int getTamañoEntrada(Patron p)
    {
        return p.tamaño_entrada;
    }
    public int getTamañoEntrada()
    {
        return this.tamaño_entrada;
    }
    public int getTamañoSalida()
    {
        return this.tamaño_salida;
    }

    public int getTamañoSalida(Patron p)
    {
            return p.tamaño_salida;
    }

    // comprar el patron actual con otro patron en sus entradas y salidas
    public boolean compararPatrones(Patron p)
    {
     if (compararEntradas(p) && compararSalidas(p) )
     {
            return true;
     }
     else
     {
            return false;
     }

    }

    public boolean compararEntradas(Patron p)
    {
         for (int i=0; i< this.tamaño_entrada-1; i++)
         {
            if (this.entrada[i] != p.getValorEntrada(i))
            {
                    return false;
            }
         }
        return true;
    }
     public boolean compararSalidas(Patron p)
    {
         for (int i=0; i< this.tamaño_salida-1; i++)
         {
            if (this.salida[i] != p.getValorSalida(i))
            {
                    return false;
            }
         }
        return true;
    }

     public double[] getSalida()
     {
        return this.salida;
     }

     public double[] getEntrada()
     {
        return this.entrada;
     }

       public double getDiferenciaRealDeseada(Patron salidaDeseada,int posicion )
     {
        return salidaDeseada.getSalida()[posicion] - this.salida[posicion] ;
      
     }

     // Compara el estado del patron actual con la salida deseada del patron p
     // Se utilizara cuando se desea revisar que un patron q ha salido de una
     // computacion de una red  es igual a otro que tenemos como objetivo.

     public boolean compararEntradasSalidas(Patron p)
    {
         for (int i=0; i< this.tamaño_entrada-1; i++)
         {
            if (this.entrada[i] != p.getValorSalida(i))
            {
                    return false;
            }
         }
        return true;
    }

     // cargar el patron de la base de datos de acuerdo al id_red o caso a
     // plantear  (No implementado)

     public Patron cargarPatron(int id_red)
     {
            return null;
     }

     // guarda en la base de datos el patron actual
     
    public void guardarPatron(int id_red)
     {
         int x;
         int columna=0;
         int tam_ent=this.tamaño_entrada;
         int tam_sal=this.tamaño_salida;
         String sentencia;
 
           
           
         for (x=0; x< tam_ent;x++)
         {
             System.out.println(" valoe entrad " + this.getValorEntrada(x));
             // sentencia=  sql.armarQuery("insert_patrones") ;//+ "( " + this.pat_id + ",'"+ "IN" +"'," + id_red + "," + this.pat_numero + "," +  columna + "," + this.getValorEntrada(x)+ ")" ;
                        //    columna=columna+1;
                        //    System.out.println(sentencia);
         }

         System.out.println("ssssssss");
         for (x=0;x<tam_sal;x++)
         {
              System.out.println(" valoe salida " + this.getValorSalida(x));
           //  columna=0;
                 //sentencia=  sql.armarQuery("insert_patrones") + "( " + this.pat_id + ",'"+ "O" +"'," + id_red + "," + this.pat_numero + "," +  columna + "," + this.getValorSalida(x)+ ")" ;
                         //   columna=columna+1;
                         //   System.out.println(sentencia);

         }

     }


    public Patron ejecutar(Patron p)
    {
            return p;
    }

    // este metodo envia un patron a la capa que llamemos
    public void enviarPatron(Patron p)
    {

    }



}
