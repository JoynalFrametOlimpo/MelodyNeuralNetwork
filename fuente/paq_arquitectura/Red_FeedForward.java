/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package paq_arquitectura;
import paq_logica.cls_sql;
import java.sql.ResultSet;



/**
 *
 * @author Jonathan
 */
public class Red_FeedForward extends Red
{
   private Capa capa_entrada;
   private Capa capa_oculta;
   private Capa capa_salida;
   private ResultSet resultado;
   private cls_sql clase_sql= new cls_sql();



    public Red_FeedForward() {};
   // +++++++++++++++++++ ARQUITECTURA DE LA RED ++++++++++++++++++++++++++++++++++
    public Red_FeedForward(int numNeuronasEntrada,int numNeuronasOculta,int numNeuronasSalida,double factorAprendizaje,int ciclos,double peso1,double peso2)
    {
        super.setRed();
        // añadir una neurona para el bias
        capa_entrada= new Capa_FeedForward(numNeuronasEntrada ,0);
        capa_oculta= new Capa_FeedForward(numNeuronasOculta,1);
        capa_salida= new Capa_FeedForward(numNeuronasSalida,2);

         super.setCapa(capa_entrada, 0);
         super.setCapa(capa_oculta, 1);
         super.setCapa(capa_salida, 2);

         super.setPesosAleatoriosNeuronasRed(peso1, peso2);
        super.unirCapas(0, 1, "Total", "Sinapsis_FeedForward",peso1,peso2);
        super.unirCapas(1, 2, "Total", "Sinapsis_FeedForward",peso1,peso2);

        super.setFactoraprendizaje(factorAprendizaje);
        super.setNumeroCiclos(ciclos);
      
        capa_oculta.setPotencial(capa_entrada);
        capa_salida.setPotencial(capa_oculta);
    }

    public void guardarRed(Red_FeedForward red, int numProyecto )
    {
        String sql;
        boolean exito;
        int num_sinapsis_adelante=0;

        // guardar en la tabla red
        sql= clase_sql.armarQuery("insert_red")+"(" + red.getId() + "," + numProyecto +
             ","+red.getNumCapas() + "," +   red.getnumNeuronas() + ","+ red.getFactorAprendizaje()+
             "," + red.getFuncionActivacion() + "," + red.getPeso1() + ","+ red.getPeso2() + "," + red.getNumCiclos()+ "," + red.getMomento() +"," + red.getErrorDeseadoPatron() +","+ red.getErrorDeseado() + ")";
               exito= clase_sql.ejecutar_sql(sql);

        for (int i=0;i < red.getNumCapas();i++)  // recorrer todas las capas (i)
        {
           
            //guardar en la tabla capa
            if (i!=red.getNumCapas()-1)
            num_sinapsis_adelante=red.getCapa(i).getNumSinapsisAdelante();
            else
            num_sinapsis_adelante=0;

                    sql=clase_sql.armarQuery("insert_capa")+ "(" + i+","+red.getCapa(i).getNumNeuronas()+",0," +
                    num_sinapsis_adelante+",0,"+ red.getId() + ")";

                     exito= clase_sql.ejecutar_sql(sql);
                 
             

            for (int j=0;j<red.getCapa(i).getNumNeuronas();j++)    // recorrer todas las neuronas (j)
            {   // guardar en la tabla Neuronas de la capa i
                    sql=clase_sql.armarQuery("insert_neurona") + "(" + red.getCapa(i).getNeurona(j).getId() +
                        ","+ red.getCapa(i).getNeurona(j).getEstado() + ",0,0,0,0,0,0,0,"+red.getCapa(i).getNeurona(j).getIdTipoNeurona() +
                        "," + i + ","+ red.getId() + "," + red.getCapa(i).getNeurona(j).getPesoUmbral() +")";

                    exito= clase_sql.ejecutar_sql(sql);

                // guardar en la tabla Sinapsis de Neurona hacia adelante
                    if (red.getCapa(i).getOrden()!= red.getNumCapas()-1)  // desde la primera capa hasta la capa n-1
                    {
                        for (int z=0; z< red.getCapa(i+1).getNumNeuronas();z++)
                        {
                           sql= clase_sql.armarQuery("insert_sinapsis")+ "("+ j+ ","+ z + "," +
                                red.getCapa(i).getSinapsis(j,z,"total").getPeso()+",0,"+ red.getCapa(i).getSinapsis(j,z,"total").getTipoSinapsis()+
                                "," + i + ","+ (i+1) +"," + red.getId()+")" ;

                             exito= clase_sql.ejecutar_sql(sql);
                        }
                    }
            }
        }
    }

// OK REVISADO, SE ACTUALIZAN LOS ERRORES HACIA ATRAS
            public void propagacionErrorAtras(Patron salidaRed, Patron salidaDeseada)
                 {
                    double error=0;
                    double error_umbral=0;
                    int num_capas_i=this.getNumCapas()-1;
                    int num_capa_z;
                    int num_neuronas_j;
                    
                        for(int c=num_capas_i ; c>= 0 ;c--)   // Recorrer capas hacia atras
                        {
                            num_neuronas_j=this.getCapa(c).getNumNeuronas();
                            for (int j=0; j<num_neuronas_j ;j++) // recorre las neuronas
                            {
                                error=0;
                                if (c==num_capas_i)  // ultima capa
                                    {
                                       // error =salidaDeseada.getSalida()[j]- salidaRed.getSalida()[j]; //   cambien a las 1:54
                                            error =salidaDeseada.getValorNormalizadoSalida(j)- salidaRed.getSalida()[j];
                                       // System.out.println("Error Delta Neurona= "+ j + " capa= "+ i + " = "+ error );
                                        this.getCapa(c).getNeurona(j).setErrorDelta(error);
                                    }
                                else
                                {
                                    error=0;
                                    error_umbral=0;
                                    num_capa_z=this.getCapa(c+1).getNumNeuronas();
                                      for (int z=0; z < num_capa_z; z++ )  // z manejas las neuronas de la capa superior
                                      {
                                            error= error + (this.getCapa(c).getSinapsis(j, z, null).getPeso())* (this.getCapa(c+1).getNeurona(z).getErrorDelta());
                                           // error_umbral= error_umbral + (this.getEntradaUmbral()* this.getCapa(c+1).getNeurona(z).getErrorDelta());
                                           
                                      }
                                    //System.out.println("Error Delta Neurona= "+ j + " capa= "+ c + " = "+ error );
                                    this.getCapa(c).getNeurona(j).setErrorDelta(error);
                                   
                                 //   this.getCapa(c+1).setErroresUmbralesDelta(error_umbral);       // enviar todos los errores umbrales


                                }
                                
                            }
        
                        }
         }

    // +++++++++++++++++  DINAMICA A NIVEL DE RED +++++++++++++++++++++++++++++++
    /*
     Toma como parametro un patron de entrada y devuelve otro patron procesado
     */
     @Override

    public Patron ejecutarRed(Patron patron, boolean aprender)
    {
       int num_capas=this.getNumCapas();
         // 1.-Enviar el Patron de Entrenamiento n a la capa de Entrada
                super.getCapa(0).enviarPatron(patron,aprender);

                // 2.- Propagacion FeedForward hacia adelante
                for (int xi=1 ;xi < num_capas; xi++)
                {
                    super.setPotencialAtras(xi);
                    super.getCapa(xi).actualizarNeuronas(super.getFuncionActivacion());          // Las Neuronas de la capa siguiente consultan a las de la capa anterior y se actualizan


                    if (!aprender && xi==2)
                    {
                     //   System.out.println("Estado :" + super.getCapa(2).getNeurona(0).getEstado());
                      //  System.out.println("Entrada1 = " + super.getCapa(0).getNeurona(0).getEstado() + " Entrada 2 = " + super.getCapa(0).getNeurona(1).getEstado()  );
                    }
                }
                // 3.- devuelve el patron procesado
               return super.getCapa(this.getNumCapas()-1 ).getEstado();

    };

    // ++++++++++++++++++ APRENDIZAJE A NIVEL DE RED +++++++++++++++++++++++++++
    /*
        Define como aprende la red de la lista de patrones
     */

    public void aprenderSinapsis()
    {
        int num_capas_a=this.getNumCapas()-1;
        int num_neuronas_b;
        int num_neuronas_c;

        for (int a=0; a<num_capas_a;a++)  // por todas las capas
        {
            num_neuronas_b=this.getCapa(a).getNumNeuronas();
                for (int b=0; b<num_neuronas_b;b++)  //´por las neuronas de la capa i
                {
                    num_neuronas_c=this.getCapa(a+1).getNumNeuronas();
                    for (int c=0; c< num_neuronas_c;c++)
                    {
                        this.getCapa(a).getSinapsis(b, c, null).aprender(this.getFactorAprendizaje(),this.getMomento(),this.getFuncionActivacion() );
                       
                    }
                }

        }
    }

    @Override
    public void aprender(ListaPatrones listaPatrones)
    {            
        for (int i=0; i< listaPatrones.getNumeroPatrones();i++)
        {
             double error_red=0;
             Patron salidaReal= new Patron ();
             Patron salidaDeseada= new Patron();

             salidaReal= this.ejecutarRed(listaPatrones.getPatron(i),true);
             salidaDeseada= listaPatrones.getPatron(i);

             for (int j=this.getNumCapas()-1;j>0;j--)
             {
                 for(int z=0; z< this.getCapa(j).getNumNeuronas();z++)
                 {
                        error_red=error_red + salidaReal.getDiferenciaRealDeseada(salidaDeseada, z);

                        this.getCapa(j).getNeurona(z).setErrorDelta(salidaReal.getDiferenciaRealDeseada(salidaDeseada, z));

                        if ((this.getCapa(j).getNeurona(z).getErrorDelta()!=0) && j!=0 )   //menos la capa 0
                        {

                            this.setSinapsis(j-1, i, i, i, error_red);
                        }

                 }

             }


        
        }

    }



}
