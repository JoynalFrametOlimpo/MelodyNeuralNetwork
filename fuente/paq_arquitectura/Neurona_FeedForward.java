

package paq_arquitectura;

/**
 *
 * @author Jonathan
 */
public class Neurona_FeedForward extends Neurona
{
private int tipo_neurona_id=3;    // id de la Neurona FeedForward

public Neurona_FeedForward(){};

public Neurona_FeedForward(int id, double peso)
{
        super(id,peso);
        super.setTipoNeurona(tipo_neurona_id);
}


// redefinir el metodo actualizar
    // +++++++++++++++ DINAMICA A NIVEL DE NEURONA
    public void actualizar(int tipo)
    {
        
        super.setEstado( super.getFuncionActivacion(tipo, "Atras"));
       
    }

    
    // si la neurona deben hacer un metodo especial, que no sea el de
    // actualizarce 
    public void metodo_especial()
    {

    }


}
