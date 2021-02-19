package Colas;

/**
 *
 * @author Josue Hernandez, Daniel Guerrero & Cesar Jmenez
 */
public class Cola {

    private Nodo frente, ultimo;

    // Metodo para agregar un Nodo a la cola
    public void encola(ProductosCola f) {
        if (frente == null) { // Si frente es nulo
            frente = new Nodo(f); // Se añade en nuevo nodo
            ultimo = frente; // Último es el mismo que el frente
        } else { // Si ya existían datos se agregan a la cola
            Nodo aux = new Nodo(f);
            ultimo.setAtras(aux);
            ultimo = aux;
        }
    }

    // Metodo para eliminar un dato que esta al frente
    public Nodo atiende() {
        Nodo aux = frente;  // Se crea una copia de frente
        if (aux != null) {  // Si el frente no es nulo
            frente = frente.getAtras(); // Se agarra el siguiente nodo
            aux.setAtras(null); // Se declara el anterior como nulo
            if (frente == null); // Si frente es nulo
            ultimo = null;  // Atras será nulo
        }
        return aux;
    }

    @Override
    public String toString() {  // Método para imprimir la cola
        String s = "";  // Aquí se guardará cada cola
        Nodo aux = frente;  // Se crea una copia
        while (aux != null) { // Se repite hasta que la copia sea nula
            s += aux + "\n";  // Se concatena cada cola
            aux = aux.getAtras();  // Siguiente nodo
        }
        return s;  // Se devuelve el string
    }

    public int CantidadArticulos() {  
        int cantidad = 0; 
        Nodo aux = frente;  // Se crea una copia
        while (aux != null) { // Se repite hasta que la copia sea nula
            cantidad++;  
            aux = aux.getAtras();  // Siguiente nodo
        }
        return cantidad;  // Se devuelve el int
    }

    public String toStringConCantidad() {  // Método para imprimir la cola
        String s = "";  // Aquí se guardará cada cola
        Nodo aux = frente;  // Se crea una copia
        while (aux != null) { // Se repite hasta que la copia sea nula
            // Se concatena cada cola
            s += "Nombre del producto: " + aux.getDato().getDescripion()
                    + ", precio: " + aux.getDato().getPrecio()
                    + ", codigo: " + aux.getDato().getCodigo()
                    + ", cantidad: " + aux.getDato().getCantidad() + "\n";
            aux = aux.getAtras();  // Siguiente nodo
        }
        return s;  // Se devuelve el string
    }

    public boolean existe(int codigo) {  // Método para imprimir la cola
        String s = "";  // Aquí se guardará cada cola
        Nodo aux = frente;  // Se crea una copia
        while (aux != null) { // Se repite hasta que la copia sea nula
            if (aux.getDato().getCodigo() == codigo) {
                return true;
            }
            aux = aux.getAtras();  // Siguiente nodo
        }
        return false;  // Se devuelve el string
    }

   
    public int muestraPrecio() { // Muestra el total de todo
        int total = 0; // Variable donde concatenará los nodos
        Nodo aux = frente; // Se crea una copia
        while (aux != null) { // Se recorre la copia y guarda los datos con un precio menor
            total += (aux.getDato().getPrecio() * aux.getDato().getCantidad());
            aux = aux.getAtras();
        }
        return total;
    }

    public Nodo extraeProducto(int fac) {
        Nodo aux = null;  // Se crea una cola temporal
        Nodo dato = null; // Aquí se guardará el dato extraído
        Nodo aux_ult = null; // Este nodo será el último temporal
        while (frente != null) { // Mientras frente no sea nulo
            if (fac == frente.getDato().getCodigo()) { // Si coíncide con el número de codigo
                dato = atiende(); // Se elimina de la original y se guarda en el nodo dato
            } else { // Si no se guardarán en una cola temporal
                if (aux == null) {
                    aux = new Nodo(frente.getDato());
                    aux_ult = aux;
                    if (frente != null) {
                        frente = frente.getAtras();
                    }
                } else {
                    Nodo aux2 = new Nodo(frente.getDato());
                    aux_ult.setAtras(aux2);
                    aux_ult = aux2;
                    if (frente != null) {
                        frente = frente.getAtras();
                    }
                }
            }
        }
        // Se devuelven los datos a la cola original
        while (aux != null) {
            encola(aux.getDato());
            Nodo aux3 = aux;
            aux = aux.getAtras();
            aux3.setAtras(null);
        }
        return dato; // Se devuelve el dato con la cola extraída
    }

    
    public void ordene() { // Método para ordenar la cola
        Nodo aux = null; // Se crea una cola temporal
        Nodo ult = null; // Este nodo será el ultimo de la cola temporal
        while (frente != null) {  // Mientras frente sea diferente a nulo
            Nodo aux2 = frente;  // Se crea una copia de la original
            int menor_producto = 1000000000;// Se busca un número de factura menor
            int menor = 0; // En esta variable se guardará la factura con menor número 
            while (aux2 != null) { // Este ciclo busca el número de factura menor
                if (aux2.getDato().getCodigo() < menor_producto) {
                    menor = aux2.getDato().getCodigo();
                    menor_producto = aux2.getDato().getCodigo();
                }
                aux2 = aux2.getAtras();
            } // Se guarda la factura con el número menor en la cola temporal
            if (aux == null) { // Si la cola temporal esta vacía
                // Se ejecuta el método que extrae por número de factura y lo elimina
                // Se ejecuta el método que extrae por número de factura y lo elimina
                aux = new Nodo(extraeProducto(menor).getDato());
                ult = aux;
            } else {  // Si la cola temporal ya contiene algún dato
                // Se ejecuta el método que extrae por número de factura y lo elimina
                // Para luego guardarlo en la temporal
                Nodo aux5 = new Nodo(extraeProducto(menor).getDato());
                ult.setAtras(aux5);
                ult = aux5;
            }
        }
        // Se devuelven los datos a la cola original
        while (aux != null) {
            encola(aux.getDato());
            Nodo aux3 = aux;
            aux = aux.getAtras();
            aux3.setAtras(null);
        }
    }

}
