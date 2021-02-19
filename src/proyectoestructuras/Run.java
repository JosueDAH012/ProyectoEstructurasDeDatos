/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoestructuras;

import Clientes.ClaseUsuario;
import Vistas.Login;
import Pilas.Dato;
import Pilas.Productos;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import static proyectoestructuras.Utils.ListaDeUsuarios;
import static proyectoestructuras.Utils.pila;
import static proyectoestructuras.Utils.Login;

/**
 *
 * @author Josue Hernandez, Daniel Guerrero & Cesar JImenez
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Para darle un mejor aspecto a la interfaz gráfica
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ignored) {
        }

        //Se muestra el Login
        Login.setVisible(true);
        ListaDeUsuarios.add(new ClaseUsuario("Josue", "admin", "admin", 19, 117670265));
        pila.push(new Dato(new Productos("Arroz", 1050, 1)));
        pila.push(new Dato(new Productos("Frijoles", 800, 2)));
        pila.push(new Dato(new Productos("Leche", 950, 3)));
        pila.push(new Dato(new Productos("Huevos", 1100, 4)));
        pila.push(new Dato(new Productos("Azucar", 1250, 5)));
        
        //
        // Productos pp = new Productos("Caja de Leche", 1000, 2006);
        //        Dato d = new Dato(pp);
        //        pila.push(d);
        //        pila.push(new Dato(new Productos("Arroz", 1050, 2000)));
    }
}
