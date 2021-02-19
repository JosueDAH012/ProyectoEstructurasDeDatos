/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import static proyectoestructuras.Utils.ListaDeUsuarios;

/**
 *
 * @author Josue Hernandez, Daniel Guerrero & Cesar Jmenez
 */
public class ClaseUsuario {//clase de usuario

    String Nombre;//atributo Nombre
    String Usuario;//atributo usuario
    String Password;//atributo contrasena
    int edad;//atributo edad
    int cedula;//atributo cedula

    public ClaseUsuario() {
    }

    public ClaseUsuario(String Nombre, String Usuario, String Password, int edad, int cedula) {//constructor de usuario
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.Password = Password;
        this.edad = edad;
        this.cedula = cedula;
    }

    public static ClaseUsuario buscar(String usuario, String clave) {//metodo de busqueda que hara buscar si esta en la lista y compararlos 
        for (int i = 0; i < ListaDeUsuarios.size(); i++) {
            if (ListaDeUsuarios.get(i).getUsuario().equals(usuario)
                    && ListaDeUsuarios.get(i).getPassword().equals(clave)) {
                return ListaDeUsuarios.get(i);
            }
        }
        return null;
    }
//getter y setter 
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

}
