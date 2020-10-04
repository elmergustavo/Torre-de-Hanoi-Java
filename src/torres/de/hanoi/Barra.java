
package torres.de.hanoi;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Barra {
    private JLabel barra = new JLabel();

    public JLabel getBarra() {
        return barra;
    }
    public void setBarra(int tamx,int tamy,int posx, int posy) {
        barra.setSize(tamx, tamy);
        barra.setLocation(posx,posy);
        barra.setIcon(new ImageIcon ("Imagenes/BARRA.JPG") );
        barra.setVisible(true);
    }
}
