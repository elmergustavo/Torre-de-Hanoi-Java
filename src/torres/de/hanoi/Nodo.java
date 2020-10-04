/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torres.de.hanoi;



public class Nodo {
    private Nodo Ant;
    private Disco dato = new Disco();

    public Nodo getAnt() {
        return Ant;
    }

    public void setAnt(Nodo Ant) {
        this.Ant = Ant;
    }

    public Disco getDato() {
        return dato;
    }

    public void setDato(Disco dato) {
        this.dato = dato;
    }
    
}
