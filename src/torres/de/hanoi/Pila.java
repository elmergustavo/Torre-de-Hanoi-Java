/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torres.de.hanoi;

/**
 *
 * @author YADI
 */
public class Pila {
    private Nodo i;
    private int c;
    private int posy=280;
    
    private void crear(int num,int tamx, int tamy,int posx, int posy){
        //Creacion del objeto 
        Disco nuevo = new Disco();
        nuevo.setNum(num);
        nuevo.setDisco(tamx, tamy, posx, posy);
        //Insercion de la nueva venta a la pila
        Nodo nuevo1 = new Nodo();
        nuevo1.setDato(nuevo);
        nuevo1.setAnt(null);
        i = nuevo1;
        c++;
    }
    public void posicionY(int y)
    {
        posy = posy + y;
    }
    public int GetPosicionY()
    {
        return posy;
    }
    private void Apilar(int num,int tamx, int tamy,int posx, int posy)
    {
        //Creacion de Venta dia,total y la cola de productos;
        Disco nuevo = new Disco();
        nuevo.setNum(num);
        nuevo.setDisco(tamx, tamy, posx, posy);   
        //Insercion de la nueva venta a la pila
        Nodo nuevo1 = new Nodo();
        nuevo1.setDato(nuevo);
        nuevo1.setAnt(i);
        i = nuevo1;
        c++;
    }
    public void insertar(int num,int tamx, int tamy,int posx, int posy)
    {
        if(vacia())
            crear(num,tamx, tamy,posx, posy);
        else
            Apilar(num,tamx, tamy,posx, posy);
    }
    public void desapilar()
    {
        if(vacia())
            System.out.println("Pila Vacia");
        else
        {
            Nodo nuevo = new Nodo();
            nuevo = i;
            i = i.getAnt();
            nuevo = null;
            c--;
        }
    }
    public Nodo cima()
    {
        return i;
    }
    public boolean vacia()
    {
        boolean x=true;
        if(c==0)
            x=true;
        else
            x=false;
        return x;
    }
    public int tamanio()
    {
        return c;
    }
}
