/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author Josue Hernandez, Daniel Guerrero & Cesar Jmenez
 */
public class Pila {//clase Pila

    private Dato top;
    int size;

    public void setTop(Dato top) {
        this.top = top;
    }

    public Dato getTop() {
        return top;
    }

    public void push(Dato d) {//metodo de colocar dato
        if (top == null) {
            top = d;
        } else {
            d.setAbajo(top);
            top = d;
        }
    }

    public Dato pushR(Dato d1, Dato d2) {//metodo de colocar elemento
        if (d1.getAbajo() != null) {
            d1.setAbajo(pushR(d1.getAbajo(), d2));
        } else {
            d1.setAbajo(d2);
        }
        return d1;
    }

    public Dato pop() {//metodo de retirar elemento
        Dato aux = null;
        if (top != null) {
            aux = top;
            top = aux.getAbajo();
        }
        return aux;
    }

    @Override
    public String toString() {
        String s = "";
        Dato aux = top;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getAbajo();
        }
        return s;
    }

    public boolean existe(int codigo) {//metodo existe que hara de autentificar que este codigo
        Dato aux = top;
        while (aux != null) {
            if (aux.getProductos().getCodigo() == codigo) {
                return true;
            }
            aux = aux.getAbajo();
        }
        return false;
    }
    public Dato extrae(int codigo) {//metodo de extraer dato
        Dato aux = top;
        while (aux != null) {
            if (aux.getProductos().getCodigo() == codigo) {
                return aux;
            }
            aux = aux.getAbajo();
        }
        return null;
    }

    public boolean Encuentra() {//metodo encontrar
        return (size == 0);
    }

    public int size() {
        return size;
    }
}
