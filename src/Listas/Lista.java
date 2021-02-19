/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author Josue Hernandez, Daniel Guerrero & Cesar Jmenez
 */
public class Lista {//clase Lista

    public static Nodo primero;

    public Lista() {
        primero = null;
    }

    public Lista insertarCabezaLista(Factura entrada) { //Metodo de insertar Nodo a la factura
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }

    public Lista insertarLista(String testigo, Factura entrada) {//metodo de Insetar elemento anterior a la lista
        Nodo nuevo, anterior;
        anterior = buscarLista(testigo);
        if (anterior != null) {
            nuevo = new Nodo(entrada);
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
        }
        return this;
    }

    public void insertarUltimo(Factura entrada) {
        if (primero == null) {
            primero = new Nodo(entrada);
        } else {
            Nodo t = primero;
            Nodo current_last = t;
            while (t != null) {
                current_last = t;
                t = t.getEnlace();
            }
            Nodo nuevo = new Nodo(entrada);
            current_last.setEnlace(nuevo);
        }
    }

    public void visualizar() {
        Nodo n;
        n = primero;
        while (n != null) {
            System.out.println(" " + n.dato.MostarData());
            n = n.enlace;
        }
    }

    public String visualizarIDMonto() {
        Nodo n;
        String aux = "";
        n = primero;
        while (n != null) {
            aux += "Número de Factura: " + n.dato.getnFac() + ", monto: " + n.dato.getMontTotal() + "\n";
            n = n.enlace;
        }
        if (aux.equals("")) {
            return "No hay facturas en el sistema";
        }
        return aux;
    }

    public Nodo visualizarFacturaUnica(String fac) {//Metodo de visualizarFacturaUnica
        Nodo n;
        n = primero;
        while (n != null) {
            if (n.getDato().getnFac().equals(fac)) {
                return n;
            }
            n = n.enlace;
        }
        return null;
    }

    public int MontoTotal() {//metodo MontoTotal
        Nodo n;
        int aux = 0;
        n = primero;
        while (n != null) {
            aux += n.dato.getMontTotal();
            n = n.enlace;
        }
        return aux;
    }

    public Nodo buscarLista(String destino) {//metodo de buscar destino 
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (destino.equals(indice.dato.MostrarNumerador())) {
                return indice;
            }
        }
        return null;
    }

    public boolean estaenLista(String destino) {//metodo de ver si esta en la lista 
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {

            if (destino.equals(indice.dato.MostrarNumerador())) {
                indice.dato.MostarData();
                return true;
            }
        }
        return false;
    }

    public void eliminar(String entrada) {//metodo de eliminar
        Nodo actual, anterior;
        boolean encontrado;

        actual = primero;
        anterior = null;
        encontrado = false;

        while ((actual != null) && (!encontrado)) {
            if (entrada.equals(actual.dato.MostrarNumerador())) {
                encontrado = true;
            }

            if (!encontrado) {
                anterior = actual;
                actual = actual.enlace;
            }
        }

        if (actual != null) {

            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
            actual = null;
        }
    }
}
