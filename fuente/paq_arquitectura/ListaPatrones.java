    /*
 La clase actual es la agrupacion de patrones de la red a utilizar, es conveniente
 para el manejo de gran cantidad de patrones
 *
 */

package paq_arquitectura;
import paq_logica.cls_variables_globales;


public class ListaPatrones
{
    private Patron patrones[];
    private double clases[];
    private double temp[];
    private int num_clases_diferentes=0;
    private cls_variables_globales numero= new cls_variables_globales();

    ListaPatrones(int id_red,int num_patrones)
    {
        this.patrones= new Patron[num_patrones];

    }

     ListaPatrones(int num_patrones)
    {
      this.patrones= new Patron[num_patrones];
    }

    public void crear_ordenar_clases()
    {
        temp=new double[patrones.length];
        clases= new double[getNumClasesDistintas()];

        for (int d=0;d<clases.length;d++)
        {
            clases[d]=temp[d];
        }
        ordenar_clases();
    }

    private void ordenar_clases()
    {
     int longitud=clases.length;
     double tmp;
  /*for (int i=0;i<clases.length;i++)
     {
            System.out.println("Sin Orden # " + i + " =" + clases[i]);
     }
*/
        for(int i=0;i<longitud;i++)
        {
            for (int j=0;j<longitud-1;j++)
            {
               if (clases[j]>clases[j+1])
               {
                   tmp=clases[j];
                   clases[j]=clases[j+1];
                   clases[j+1]=tmp;
               }
            }
        }
/*
     for (int i=0;i<clases.length;i++)
     {
            System.out.println("Orden # " + i + " =" + clases[i]);
     }
*/
    }
    private boolean existe_clase(double valor)
    {
        for (int x=0;x<this.temp.length;x++)
        {
            if (valor== this.temp[x])
                return true;
        }
        return false;
    }

    private int getNumClasesDistintas()
    {
        num_clases_diferentes=1;
        temp[num_clases_diferentes-1]= this.patrones[0].getValorSalida(0);   //guarda el primer valor

            for (int i=1;i< this.patrones.length;i++)
            {
               if (!existe_clase(this.patrones[i].getValorSalida(0)))
               {
                    num_clases_diferentes=num_clases_diferentes+1;
                    temp[num_clases_diferentes-1]= this.patrones[i].getValorSalida(0);
               }
            }
        return num_clases_diferentes;
    }


    public void guardarListaPatronesBaseDato(int id_red)
    {
       
    }

    public void addPatrones(Patron[] p)
    {
        this.patrones=p;
    }

    public double[] getClases()
    {
        return this.clases;
    }

    public double getValorNormalizadoConsulta(double valor)
    {
         double valorD;
         valorD= (valor - this.getMINIMO())/(this.getMAXIMO()-this.getMINIMO());

         return numero.Redondear(valorD);

    }
    public void normalizarpatrones()
    {
        int tamEntradas=patrones[0].getTamañoEntrada();
        int tamSalidas= patrones[0].getTamañoSalida();
        double entrada[];
        double salida[];
        double maximo;
        double minimo;
        double valorD;



        for(int z=0; z<patrones.length;z++)
        {
            entrada = new double[tamEntradas];
            for (int x=0;x<tamEntradas;x++)
            {
                valorD= (patrones[z].getValorEntrada(x)- this.getMINIMO())/(this.getMAXIMO()-this.getMINIMO());
                entrada[x]=numero.Redondear(valorD);  //Double.valueOf(numero);
               
            }
            patrones[z].setEntradaNormalizada(entrada);

            salida = new double[tamSalidas];
            for (int x=0;x<tamSalidas;x++)
            {
                //valorD= (patrones[z].getValorSalida(x)- this.getMinSalida(x))/(this.getMaxSalida(x)-this.getMinSalida(x));
                valorD= (patrones[z].getValorSalida(x)- this.getMINIMO())/(this.getMAXIMO()-this.getMINIMO());
                //numero= n.format(valorD);
                salida[x]= numero.Redondear(valorD); //Double.valueOf(numero);
              //  System.out.println("Max salida= " + this.getMaxSalida(x) + " ; Min Salida= "+ this.getMinSalida(x) + " ; Valor Normalizado = " + salida[x]);
            }
            patrones[z].setSalidaNormalizada(salida);
        }
    }

    public double getMaxEntrada(int posicion)
        {
            double maximo=patrones[0].getValorEntrada(posicion);
            for (int i=0; i<patrones.length;i++)
            {
                if ( patrones[i].getValorEntrada(posicion)> maximo )
                    maximo=patrones[i].getValorEntrada(posicion);
            }
            return maximo;
        }

       public double getMaxSalida(int posicion)
            {
                double maximo=patrones[0].getValorSalida(posicion);
                for (int i=0; i<patrones.length;i++)
                {
                    if ( patrones[i].getValorSalida(posicion)> maximo )
                        maximo=patrones[i].getValorSalida(posicion);
                }
                return maximo;
            }

         public double getMinEntrada(int posicion)
            {
                double minimo=patrones[0].getValorEntrada(posicion);
                for (int i=0; i<patrones.length;i++)
                {
                    if ( patrones[i].getValorEntrada(posicion)< minimo )
                        minimo=patrones[i].getValorEntrada(posicion);
                }
                return minimo;
            }

         public double getMinSalida(int posicion)
            {
                double minimo=patrones[0].getValorSalida(posicion);
                for (int i=0; i<patrones.length;i++)
                {
                    if ( patrones[i].getValorSalida(posicion)< minimo )
                        minimo=patrones[i].getValorSalida(posicion);
                }
                return minimo;
            }

         public double getMAXIMO()
         {
            double maximo=0;
            double temp;
            for (int x=0;x<patrones[0].getTamañoEntrada();x++)
            {
                temp=this.getMaxEntrada(x);
                if (temp>maximo)
                    maximo=temp;
            }
            for (int x=0;x<patrones[0].getTamañoSalida();x++)
            {
                temp=this.getMaxSalida(x);
                if (temp>maximo)
                    maximo=temp;
            }
            return maximo;
         }

          public double getMINIMO()
         {
            double minimo=0;
            double temp;
            for (int x=0;x<patrones[0].getTamañoEntrada();x++)
            {
                temp=this.getMinEntrada(x);
                if (temp<minimo)
                    minimo=temp;
            }
            for (int x=0;x<patrones[0].getTamañoSalida();x++)
            {
                temp=this.getMinSalida(x);
                if (temp<minimo)
                    minimo=temp;
            }
            return minimo;
         }


    // Devuelve el patrón que esta en la posicion i
    // Debe estar en el rango 0... numPatrones()-1

    public Patron getPatron(int posicion)
    {
     
            return this.patrones[posicion];
    }

    public int getNumeroPatrones()
    {
        return this.patrones.length;
    }

    public double getClaseDefinida(double valor)
    {
       double clase=0;
       double temp1;
       double temp2=this.clases[this.clases.length-1];

        for(int i=0;i<this.clases.length;i++)
        {
            temp1=Math.abs(valor-clases[i]);
            if (temp1<temp2)
                clase= clases[i];
            temp2=temp1;
        }
        return clase;
    }
 

}
