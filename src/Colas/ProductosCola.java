/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;


/**
 *
 * @author Josue Hernandez, Daniel Guerrero & Cesar Jmenez
 */
public class ProductosCola {//clase ProductosCola

    private String descripion;//variable descripcion privabas
    private int precio;//variable precio privabas
    private int codigo;//variable codigo privabas
    private int cantidad;//variable cantidad privabas

    public ProductosCola(String descripion, int precio, int codigo) {//constructor de la clase ProductosCola
        this.descripion = descripion;
        this.precio = precio;
        this.codigo = codigo;
    }
//Getters an setter y toString
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    

}
