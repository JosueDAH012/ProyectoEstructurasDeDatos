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
public class Dato {//clase Dato
    Productos productos;
    Dato abajo; 

    public Dato(Productos productos) {//Constructor de dato
        this.productos = productos;
    }
//Getters & Setters
    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public Dato getAbajo() {
        return abajo;
    }

    public void setAbajo(Dato abajo) {
        this.abajo = abajo;
    }

    @Override
    public String toString() {
        return productos.toString();
    }
    
    
    
}
