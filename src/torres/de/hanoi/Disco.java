package torres.de.hanoi;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Disco {

    private JLabel disco = new JLabel();
    private int num;

    public JLabel getDisco() {
        return disco;
    }

    public void setDisco(int tamx, int tamy, int posx, int posy) {
        disco.setSize(tamx, tamy);
        disco.setLocation(posx, posy);
        switch (num) {
            case 1:
            case 6:
            case 11:
                disco.setIcon(new ImageIcon ("Imagenes/DISCO1.png"));
                break;
            case 2:
            case 7:
            case 12:
                disco.setIcon(new ImageIcon ("Imagenes/DISCO2.png"));
                break;
            case 3:
            case 8:
            case 13:
                disco.setIcon(new ImageIcon ("Imagenes/DISCO3.png"));
                break;
            case 4:
            case 9:
            case 14:
                disco.setIcon(new ImageIcon ("Imagenes/DISCO4.png"));
                break;
            case 5:
            case 10:
            case 15:
                disco.setIcon(new ImageIcon ("Imagenes/DISCO5.png"));
                break;
        }
        disco.setVisible(true);
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
}
