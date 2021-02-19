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
public class Productos {//clase productos

    private String descripion;//variable descripcion
    private int precio;//variable precio
    private int codigo;//variable codigo

    public Productos(String descripion, int precio, int codigo) {//constructor de productos
        this.descripion = descripion;
        this.precio = precio;
        this.codigo = codigo;
    }
//getters & Setters
    @Override
    public String toString() {
        return "Nombre del producto: " + descripion + ", precio: " + precio + ", codigo: " + codigo;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
