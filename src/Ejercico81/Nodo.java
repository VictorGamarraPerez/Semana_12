
package Ejercico81;

/* VICTOR GAMARRA PEREZ */

public class Nodo {
    int dato;
    Nodo enlace;
    Nodo adelante;
    Nodo atras;
    Nodo actual;
    Nodo entrada;

    public Nodo(int x) {
        dato = x;
        enlace = null;
    }

    public int getDato() {
        return dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}
