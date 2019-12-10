

package paq_logica;
import paq_ventanas.*;
import java.awt.Dimension;
import java.awt.Toolkit;


public class cls_principal {


    public static void main(String[] args)
    {
       Dimension tamanioPantalla=Toolkit.getDefaultToolkit().getScreenSize();
        ven_MDI mdi= new ven_MDI();
        ven_login login = new ven_login(mdi,true );

        mdi.setLocation(0, 0);
        mdi.setVisible(true);
      //  mdi.setSize(tamanioPantalla);
        login.setLocation(450, 240);
        login.setTitle("Identificacion");
        login.setVisible(true);
        login.setResizable(false);
       
      
    }

}
