package torres.de.hanoi;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Juego {

    private JFrame ventana = new JFrame("Torre de Hanoi");
    private Container panel = new Container();
    private JPanel panelBarra1 = new JPanel();
    private JPanel panelBarra2 = new JPanel();
    private JPanel panelBarra3 = new JPanel();
    private JPanel panelButton = new JPanel();
    private JPanel panelInicio = new JPanel();
    private Barra bar1 = new Barra();
    private Barra bar2 = new Barra();
    private Barra bar3 = new Barra();
    private JComboBox opciones = new JComboBox();
    private JLabel texto = new JLabel();
    private JLabel texto2 = new JLabel();
    private JLabel texto3 = new JLabel();
    private JLabel texto4 = new JLabel();
    private JButton salir = new JButton();
    private JButton A_B = new JButton();
    private JButton A_C = new JButton();
    private JButton B_A = new JButton();
    private JButton B_C = new JButton();
    private JButton C_A = new JButton();
    private JButton C_B = new JButton();
    private JButton Resolver = new JButton();
    private JButton inicio = new JButton();
    private JTextField TextField1 = new JTextField();
    private JTextField TextField2 = new JTextField();
    private int intentos, cont, posyA = 280, posyB = 280, posyC = 280;
    private Pila b1 = new Pila();
    private Pila b2 = new Pila();
    private Pila b3 = new Pila();
    private Timer tiempo;
    int r = 100;

    public Juego() {
        //Agregar Ventana
        ventana.setSize(830, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);

        //Agregar Container
        panel.setSize(ventana.getSize());
        panel.setLocation(0, 0);
        panel.setLayout(null);
        panel.setVisible(true);

        //Inicializar Componentes 
        //Paneles
        panelBarra1.setSize(300, 300);
        panelBarra1.setLocation(0, 100);
        panelBarra1.setLayout(null);
        panelBarra1.setVisible(true);
        panelBarra2.setSize(300, 300);
        panelBarra2.setLocation(250, 100);
        panelBarra2.setLayout(null);
        panelBarra2.setVisible(true);
        panelBarra3.setSize(300, 300);
        panelBarra3.setLocation(500, 100);
        panelBarra3.setLayout(null);
        panelBarra3.setVisible(true);
        panelButton.setSize(830, 200);
        panelButton.setLocation(50, 390);
        panelButton.setLayout(null);
        panelButton.setVisible(true);
        panelInicio.setSize(830, 100);
        panelInicio.setLocation(0, 0);
        panelInicio.setLayout(null);
        panelInicio.setVisible(true);

        //Combobox
        opciones.setSize(100, 20);
        opciones.setLocation(250, 95);
        opciones.setVisible(true);
        opciones.addItem("1");
        opciones.addItem("2");
        opciones.addItem("3");
        opciones.addItem("4");
        opciones.addItem("5");
        opciones.addItem("6");
        opciones.addItem("7");
        opciones.addItem("8");
        opciones.addItem("9");
        opciones.addItem("10");
        opciones.addItem("11");
        opciones.addItem("12");
        opciones.addItem("13");
        opciones.addItem("14");
        opciones.addItem("15");
        panelButton.add(opciones);

        //Buttons y label
        texto.setSize(200, 50);
        texto.setText("SELECCIONE NUMERO DE DISCOS: ");
        texto.setVisible(true);
        texto.setLocation(29, 80);
        texto2.setSize(200, 50);
        texto2.setText("INTENTOS DISPONIBLES: ");
        texto2.setVisible(true);
        texto2.setLocation(450, 40);
        texto3.setSize(400, 50);
        texto3.setIcon(new ImageIcon("Imagenes/torre.png"));
        texto3.setVisible(true);
        texto3.setLocation(300, 0);
        texto4.setSize(200, 50);
        texto4.setText("INTENTOS TOTALES: ");
        texto4.setVisible(true);
        texto4.setLocation(200, 40);
        TextField1.setSize(40, 20);
        TextField1.setText(" ");
        TextField1.setVisible(true);
        TextField1.setLocation(330, 55);
        TextField1.setEnabled(false);
        TextField2.setSize(40, 20);
        TextField2.setText(" ");
        TextField2.setVisible(true);
        TextField2.setLocation(610, 55);
        TextField2.setEnabled(false);

        A_B.setSize(42, 38);
        A_B.setIcon(new ImageIcon("Imagenes/B.png"));
        A_B.setLocation(50, 20);
        A_B.setVisible(true);
        A_C.setSize(40, 38);
        A_C.setIcon(new ImageIcon("Imagenes/C.png"));
        A_C.setLocation(120, 20);
        A_C.setVisible(true);
        B_A.setSize(42, 38);
        B_A.setIcon(new ImageIcon("Imagenes/A.png"));
        B_A.setLocation(300, 20);
        B_A.setVisible(true);
        B_C.setSize(40, 38);
        B_C.setIcon(new ImageIcon("Imagenes/C.png"));
        B_C.setLocation(380, 20);
        B_C.setVisible(true);
        C_A.setSize(42, 38);
        C_A.setIcon(new ImageIcon("Imagenes/A.png"));
        C_A.setLocation(550, 20);
        C_A.setVisible(true);
        C_B.setSize(42, 38);
        C_B.setIcon(new ImageIcon("Imagenes/B.png"));
        C_B.setLocation(630, 20);
        C_B.setVisible(true);

        inicio.setSize(100, 30);
        inicio.setIcon(new ImageIcon("Imagenes/Start.png"));
        inicio.setLocation(380, 88);
        inicio.setVisible(true);
        salir.setSize(100, 30);
        salir.setIcon(new ImageIcon("Imagenes/Salir.png"));
        salir.setLocation(620, 88);
        salir.setVisible(true);
        Resolver.setLocation(500, 88);
        Resolver.setIcon(new ImageIcon("Imagenes/resolver.png"));
        Resolver.setSize(100, 30);
        Resolver.setVisible(true);

        //Crear Barras y agregarlas a cada panel
        panelButton.add(Resolver);
        panelButton.add(A_C);
        panelButton.add(A_B);
        panelButton.add(B_C);
        panelButton.add(B_A);
        panelButton.add(C_A);
        panelButton.add(C_B);
        panelButton.add(inicio);
        panelButton.add(salir);
        panelButton.add(texto);
        bar1.setBarra(20, 300, 150, 0);
        bar2.setBarra(20, 300, 150, 0);
        bar3.setBarra(20, 300, 150, 0);
        panelBarra1.add(bar1.getBarra());
        panelBarra2.add(bar2.getBarra());
        panelBarra3.add(bar3.getBarra());
        panelInicio.add(texto2);
        panelInicio.add(texto3);
        panelInicio.add(texto4);
        panelInicio.add(TextField1);
        panelInicio.add(TextField2);

        ActionListener start = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int opc = Integer.parseInt(opciones.getSelectedItem().toString());
                 posyA = 280;
                 posyB = 280;
                 posyC = 280;
                intentos = (int) (Math.pow(2, opc)) - 1;
                cont = intentos;
                cont = intentos;
                int tamx = 200, posx = 55, posy = 280;
                int x = 0;
                x = b1.tamanio();
                for (int i = 1; i <= x; i++) {
                    panelBarra1.remove(b1.cima().getDato().getDisco());
                    b1.desapilar();
                }
                x = b2.tamanio();
                for (int i = 1; i <= x; i++) {
                    panelBarra2.remove(b2.cima().getDato().getDisco());
                    b2.desapilar();
                }
                x = b3.tamanio();
                for (int i = 1; i <= x; i++) {
                    panelBarra3.remove(b3.cima().getDato().getDisco());
                    b3.desapilar();
                }
                for (int i = opc; i >= 1; i--) {
                    b1.insertar(i, tamx, 20, posx, posy);
                    tamx = tamx - 12;
                    posx = posx + 6;
                    posy = posy - 20;
                    panelBarra1.add(b1.cima().getDato().getDisco());
                }
                b1.posicionY(posy);
                posyA = posy;
                TextField1.setText(Integer.toString(intentos));
                TextField2.setText(Integer.toString(cont));
                panelBarra1.add(bar1.getBarra());
                ventana.repaint();
            }
        };
        ActionListener a_b = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (cont > 0) {
                    if (b2.vacia()) {
                        moverA_B();
                    } else if (b1.cima().getDato().getNum() < b2.cima().getDato().getNum()) {
                        moverA_B();
                    } else {
                        JOptionPane.showMessageDialog(ventana, "MOVIMIENTO NO PERMITIDO ", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    if (cont == 0) {
                        if (b1.tamanio() == 0 && b2.tamanio() == 0) {
                            JOptionPane.showMessageDialog(ventana, "HA GANADO", "GANO", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(ventana, "NUMERO DE INTENTOS TERMINADOS", "FIN DEL JUEGO ", JOptionPane.ERROR_MESSAGE);
                }
            }
        };
        A_B.addActionListener(a_b);
        ActionListener a_c = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                if (cont > 0) {
                    if (b3.vacia()) {
                        moverA_C();
                    } else if (b1.cima().getDato().getNum() < b3.cima().getDato().getNum()) {
                        moverA_C();
                    } else {
                        JOptionPane.showMessageDialog(ventana, "MOVIMIENTO NO PERMITIDO", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    if (cont == 0) {
                        if (b1.tamanio() == 0 && b2.tamanio() == 0) {
                            JOptionPane.showMessageDialog(ventana, "HA GANADO", "GANO", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(ventana, "NUMERO DE INTENTOS TERMINADOS", "FIN DEL JUEGO ", JOptionPane.ERROR_MESSAGE);
                }
            }
        };

        A_C.addActionListener(a_c);
        ActionListener b_a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                if (cont > 0) {
                    if (b1.vacia()) {
                        moverB_A();
                    } else if (b2.cima().getDato().getNum() < b1.cima().getDato().getNum()) {
                        moverB_A();
                    } else {
                        JOptionPane.showMessageDialog(ventana, "INTENTO NO PERMITIDO", "ERROR ", JOptionPane.ERROR_MESSAGE);
                    }
                    if (cont == 0) {
                        if (b1.tamanio() == 0 && b2.tamanio() == 0) {
                            JOptionPane.showMessageDialog(ventana, "HA GANADO", "GANO", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(ventana, "NUMERO DE INTENTOS TERMINADOS", "FIN DEL JUEGO ", JOptionPane.ERROR_MESSAGE);
                }
            }
        };

        B_A.addActionListener(b_a);
        ActionListener b_c = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                if (cont > 0) {
                    if (b3.vacia()) {
                        moverB_C();
                    } else if (b2.cima().getDato().getNum() < b3.cima().getDato().getNum()) {
                        moverB_C();
                    } else {
                        JOptionPane.showMessageDialog(ventana, "INTENTO NO PERMITIDO", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    if (cont == 0) {
                        if (b1.tamanio() == 0 && b2.tamanio() == 0) {
                            JOptionPane.showMessageDialog(ventana, "HA GANADO", "GANO", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } 
                else {
                    JOptionPane.showMessageDialog(ventana, "NUMERO DE INTENTOS TERMINADOS", "FIN DEL JUEGO ", JOptionPane.ERROR_MESSAGE);
                }
            }
        };

        B_C.addActionListener(b_c);
        ActionListener c_a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                if (cont > 0) {
                    if (b1.vacia()) {
                        moverC_A();
                    } else if (b3.cima().getDato().getNum() < b1.cima().getDato().getNum()) {
                        moverC_A();
                    } else {
                        JOptionPane.showMessageDialog(ventana, "NO PERIMITIDO", "ERROR ", JOptionPane.ERROR_MESSAGE);
                    }
                    if (cont == 0) {
                        if (b1.tamanio() == 0 && b2.tamanio() == 0) {
                            JOptionPane.showMessageDialog(ventana, "HA GANADO", "GANO", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } 
                else {
                    JOptionPane.showMessageDialog(ventana, "NUMERO DE INTENTOS TERMINADOS", "FIN DEL JUEGO ", JOptionPane.ERROR_MESSAGE);
                }
            }
        };

        C_A.addActionListener(c_a);
        ActionListener c_b = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                if (cont > 0) {
                    if (b2.vacia()) {
                        moverC_B();
                    } else if (b3.cima().getDato().getNum() < b2.cima().getDato().getNum()) {
                        moverC_B();
                    } else {
                        JOptionPane.showMessageDialog(ventana, "NO PERIMITIDO", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    if (cont == 0) {
                        if (b1.tamanio() == 0 && b2.tamanio() == 0) {
                            JOptionPane.showMessageDialog(ventana, "HA GANADO", "GANO", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(ventana, "NUMERO DE INTENTOS TERMINADOS", "FIN DEL JUEGO ", JOptionPane.ERROR_MESSAGE);
                }
            }
        };

        C_B.addActionListener(c_b);

        inicio.addActionListener(start);
        ActionListener Salir = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ventana.dispose();
            }
        };
        ActionListener resolucion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int opc = Integer.parseInt(opciones.getSelectedItem().toString());
                intentos = (int) (Math.pow(2, opc)) - 1;
                cont = intentos;
                cont = intentos;
                int tamx = 200, posx = 55, posy = 280;
                int x = 0;
                x = b1.tamanio();
                for (int i = 1; i <= x; i++) {
                    panelBarra1.remove(b1.cima().getDato().getDisco());
                    b1.desapilar();
                }
                x = b2.tamanio();
                for (int i = 1; i <= x; i++) {
                    panelBarra2.remove(b2.cima().getDato().getDisco());
                    b2.desapilar();
                }
                x = b3.tamanio();
                for (int i = 1; i <= x; i++) {
                    panelBarra3.remove(b3.cima().getDato().getDisco());
                    b3.desapilar();
                }
                for (int i = opc; i >= 1; i--) {
                    b1.insertar(i, tamx, 20, posx, posy);
                    tamx = tamx - 12;
                    posx = posx + 6;
                    posy = posy - 20;
                    panelBarra1.add(b1.cima().getDato().getDisco());
                }
                b1.posicionY(posy);
                posyA = posy;
                TextField1.setText(Integer.toString(intentos));
                TextField2.setText(Integer.toString(cont));
                panelBarra1.add(bar1.getBarra());
                ventana.repaint();
                System.out.println(opc);
                Hanoi(opc, b1, b2, b3);
                repintarPila3(b3);
                ventana.repaint();
            }
        };

        Resolver.addActionListener(resolucion);

        salir.addActionListener(Salir);

        //Agregar Paneles a container
        panel.add(panelBarra1);

        panel.add(panelBarra2);

        panel.add(panelBarra3);

        panel.add(panelButton);

        panel.add(panelInicio);

        ventana.add(panel);

        ventana.setVisible(
                true);
    }

    private void moverA_B() {
        panelBarra1.remove(b1.cima().getDato().getDisco());
        b2.insertar(b1.cima().getDato().getNum(), b1.cima().getDato().getDisco().getWidth(), 20, b1.cima().getDato().getDisco().getX(), posyB);
        b1.desapilar();
        panelBarra2.add(b2.cima().getDato().getDisco());
        panelBarra2.add(bar2.getBarra());
        ventana.repaint();
        posyB = posyB - 20;
        posyA = posyA + 20;
        cont--;
        TextField2.setText(Integer.toString(cont));
    }

    private void moverA_C() {
        panelBarra1.remove(b1.cima().getDato().getDisco());
        b3.insertar(b1.cima().getDato().getNum(), b1.cima().getDato().getDisco().getWidth(), 20, b1.cima().getDato().getDisco().getX(), posyC);
        b1.desapilar();
        panelBarra3.add(b3.cima().getDato().getDisco());
        panelBarra3.add(bar3.getBarra());
        ventana.repaint();
        posyC = posyC - 20;
        posyA = posyA + 20;
        cont--;
        TextField2.setText(Integer.toString(cont));
    }

    private void moverB_A() {
        panelBarra2.remove(b2.cima().getDato().getDisco());
        b1.insertar(b2.cima().getDato().getNum(), b2.cima().getDato().getDisco().getWidth(), 20, b2.cima().getDato().getDisco().getX(), posyA);
        b2.desapilar();
        panelBarra1.add(b1.cima().getDato().getDisco());
        panelBarra1.add(bar1.getBarra());
        ventana.repaint();
        posyA = posyA - 20;
        posyB = posyB + 20;
        cont--;
        TextField2.setText(Integer.toString(cont));
    }

    private void moverB_C() {
        panelBarra2.remove(b2.cima().getDato().getDisco());
        b3.insertar(b2.cima().getDato().getNum(), b2.cima().getDato().getDisco().getWidth(), 20, b2.cima().getDato().getDisco().getX(), posyC);
        b2.desapilar();
        panelBarra3.add(b3.cima().getDato().getDisco());
        panelBarra3.add(bar3.getBarra());
        ventana.repaint();
        posyC = posyC - 20;
        posyB = posyB + 20;
        cont--;
        TextField2.setText(Integer.toString(cont));
    }

    private void moverC_A() {
        panelBarra3.remove(b3.cima().getDato().getDisco());
        b1.insertar(b3.cima().getDato().getNum(), b3.cima().getDato().getDisco().getWidth(), 20, b3.cima().getDato().getDisco().getX(), posyA);
        b3.desapilar();
        panelBarra1.add(b1.cima().getDato().getDisco());
        panelBarra1.add(bar1.getBarra());
        ventana.repaint();
        posyA = posyA - 20;
        posyC = posyC + 20;
        cont--;
        TextField2.setText(Integer.toString(cont));

    }

    private void moverC_B() {
        panelBarra3.remove(b3.cima().getDato().getDisco());
        b2.insertar(b3.cima().getDato().getNum(), b3.cima().getDato().getDisco().getWidth(), 20, b3.cima().getDato().getDisco().getX(), posyB);
        b3.desapilar();
        panelBarra2.add(b2.cima().getDato().getDisco());
        panelBarra2.add(bar2.getBarra());
        ventana.repaint();
        posyB = posyB - 20;
        posyC = posyC + 20;
        cont--;
        TextField2.setText(Integer.toString(cont));
    }

    private void Hanoi(int c, Pila t1, Pila t2, Pila t3) {
        if (c == 1) {
            panelBarra1.remove(t1.cima().getDato().getDisco());
            t3.insertar(t1.cima().getDato().getNum(), t1.cima().getDato().getDisco().getWidth(), 20, t1.cima().getDato().getDisco().getX(), t3.GetPosicionY());
            t1.desapilar();
            t3.posicionY(-20);
            t1.posicionY(20);
            cont--;
            ventana.repaint();
        } else {
            Hanoi(c - 1, t1, t3, t2);
            Hanoi(1, t1, t2, t3);
            Hanoi(c - 1, t2, t1, t3);
        }
    }

    private void repintarPila3(Pila t3) {
        int tam = t3.tamanio();
        for (int x = 0; x < tam; x++) {
            panelBarra3.add(t3.cima().getDato().getDisco());
            t3.desapilar();
        }
        panelBarra3.add(bar3.getBarra());
    }

}
