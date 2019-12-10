
package paq_arquitectura;


public class Capa_FeedForward extends Capa
{

  public Capa_FeedForward(int num_neuronas, int nivel)
  {
    super(num_neuronas,nivel,"FeedForward");

  }

  @Override
  // Potencial atras  de neurona i  hasta neurona j
  public void setPotencial(Capa capa_referencia)
  {

       double potencial=0;
       double norma=0;

        for (int i=0;i< super.getNumNeuronas();i++)
        {
            norma=0;
            potencial=0;
            for (int j=0;j<capa_referencia.getNumNeuronas();j++)
            {
                 potencial=potencial +( capa_referencia.getNeurona(j).getEstado() * capa_referencia.getSinapsis(j, i, "").getPeso()) ;
                 norma= norma +  Math.pow( capa_referencia.getNeurona(j).getEstado() * capa_referencia.getSinapsis(j, i, "").getPeso(),2);
            }
            
            potencial=potencial - (super.getNeurona(i).getPesoUmbral()*-1);
   

            super.getNeurona(i).setPotencialAtras(potencial);
            super.getNeurona(i).setNormaCuadraticaAtras(norma);
        }
  }

}
