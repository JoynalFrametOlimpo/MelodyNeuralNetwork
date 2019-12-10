
package paq_logica;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.border.Border;


public class cls_Imagenfondo implements Border {
    BufferedImage fondo;
    public cls_Imagenfondo(){
        try {
            //se obtiene la imagen
            //URL url = new URL(getClass().getResource("/paq_imagenes/Red neuronal.jpg").toString());
            //URL url = new URL(getClass().getResource("/paq_imagenes/neuronas.jpeg").toString());
            URL url = new URL(getClass().getResource("/paq_imagenes/Red neuronal 2.jpg").toString());
            fondo = ImageIO.read(url);

        } catch (IOException ex) {
            Logger.getLogger(cls_Imagenfondo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    // se sobreescriben metodos propios de Border
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height){
        //se dibuja la imagen de fondo en el centro del contenedor
        //cada que se redimensione el contenedor, la imagen automaticamente se posiciona en el centro
        g.drawImage(fondo, 0,0, null);
    }

    public Insets getBorderInsets(Component c){
	return new Insets(0,0,0,0);
    }

    public boolean isBorderOpaque(){
	return true;
    }

}
