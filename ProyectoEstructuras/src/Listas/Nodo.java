/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author Josue Hernandez,  Daniel Guerrero & Cesar Jmenez
 */
public class Nodo {//clase Nodo de factura

    Factura dato;
    Nodo enlace;

    public Nodo(Factura x) {//constructor de Nodo
        dato = x;
        enlace = null;
    }
    //Getters y setters

    public Factura getDato() {
        return dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

}
