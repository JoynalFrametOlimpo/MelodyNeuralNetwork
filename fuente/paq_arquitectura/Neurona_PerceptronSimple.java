/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package paq_arquitectura;

/**
 *
 * @author Jonathan
 */
public class Neurona_PerceptronSimple extends Neurona{

   public Neurona_PerceptronSimple(int id, double peso)
   {
        super(id,peso);
   }



    public void actualizar(int tipo)
    {
        super.setEstado( super.getFuncionActivacion(tipo, "Adelante"));
           
    }

    public void metodo_especial(){};

}
