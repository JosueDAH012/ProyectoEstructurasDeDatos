package proyectoestructuras;

import Clientes.ClaseUsuario;
import Vistas.Login;
import Vistas.Registro;
import Listas.Lista;
import Pilas.Pila;
import Vistas.Menu;
import Vistas.NuevaFactura;
import Vistas.NuevoProducto;
import java.util.ArrayList;
import Colas.Cola;


/**
 *
 * @author Josue Hernandez, Daniel Guerrero & Cesar Jimenez
 */
public class Utils {
    // Lista de todos los usuarios
    public static ArrayList<ClaseUsuario> ListaDeUsuarios = new ArrayList<ClaseUsuario>();
    // Usuario Actual
    public static ClaseUsuario usuarioActual = null;
    
    // Alceman los productos
    public static Pila pila = new Pila();
    // Código disponible para los productos
    public static int codigoDisponible = 6;
    
    
    // Almacena las facturas activas
    public static Lista listaFacturasActivas = new Lista();
    // Número de Factura disponible
    public static int NumeroFacDisponible = 1;

    // Almacena las facturas nulas
    public static Lista listaFacturasNulas = new Lista();
    // Almacena los datos que el cliente va a comprar en la factura
    public static Cola cola = new Cola();

    // Vistas staticas y //inializacion 
    public static Login Login = new  Login();
    public static Registro registro = new Registro();
    public static NuevoProducto nuevoProducto = new NuevoProducto();
    public static Menu menu = new Menu();
    public static NuevaFactura nuevaFactura = new NuevaFactura();
    
}
