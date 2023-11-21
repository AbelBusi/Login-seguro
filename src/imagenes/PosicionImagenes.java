package imagenes;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author cesar
 */
public class PosicionImagenes {
    
    
    public void escaralarLabel(JLabel label, String ruta_imagen ){
        
        label.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ruta_imagen)).getImage()
        .getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_DEFAULT)));
    
    }
    
}
