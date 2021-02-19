
package Colas;

import Pilas.Productos;

/**
 *
 * @author Josue Hernandez, Daniel Guerrero & Cesar Jmenez
 */
public class Nodo {//clase Nodo
    
    private ProductosCola dato;
    private Nodo atras;

    public Nodo(ProductosCola dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "" + dato;
    }

    public ProductosCola getDato() {
        return dato;
    }

    public void setDato(ProductosCola dato) {
        this.dato = dato;
    }

    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }
    
    
    
}
