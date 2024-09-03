package Principal;
import Logica.Producto;

import java.util.ArrayList;  // Importa la clase ArrayList para manejar listas dinámicas de objetos

public class GestorInventario {  // Declara la clase principal para gestionar el inventario

    private ArrayList<Producto> productos;  // Lista que almacena los productos en el inventario
    private Producto[] inventarioTemporal;  // Arreglo que almacena productos eliminados temporalmente
    private int indiceInventario;  // Índice para el arreglo de inventario temporal

    // Constructor que inicializa el inventario con un tamaño definido por el usuario
    public GestorInventario(int TamañoInventarioTemporal) {

        productos = new ArrayList<>();  // Inicializa la lista de productos
        inventarioTemporal = new Producto[TamañoInventarioTemporal];  // Inicializa el arreglo de inventario temporal
        indiceInventario = 0;  // Inicializa el índice del inventario temporal a 0
    }

    // Metodo 1: Agrega un producto al inventario
    public void AgregarProducto(Producto producto_tienda) {
        productos.add(producto_tienda);  // Agrega el producto a la lista de productos
    }

    // Metodo 2: Busca un producto por su ID
    public Producto BuscarProducto(int ID) {

        for (Producto producto_tienda : productos) {  // Itera a través de la lista de productos
            if (producto_tienda.getID() == ID)  // Compara el ID del producto actual con el ID buscado
                return producto_tienda;  // Retorna el producto si encuentra coincidencia
        }
        return null;  // Retorna null si no se encuentra el producto
    }

    // Metodo 3: Genera un informe detallado de todos los productos en el inventario
    public void GenerarInforme() {
        System.out.println("Informe de inventario:");  // Imprime el encabezado del informe
        for (Producto producto : productos) {  // Itera a través de la lista de productos
            producto.mostrarInformacion();  // Llama al método mostrarInformacion de cada producto
        }
    }

    // Metodo 4: Elimina un producto del inventario y lo guarda en un inventario temporal
    public void EliminarProducto(int ID) {
        Producto producto_tienda = BuscarProducto(ID);  // Busca el producto en el inventario
        // Verifica si el producto se encontró y si hay espacio en el inventario temporal
        if (producto_tienda != null && indiceInventario < inventarioTemporal.length) {
            inventarioTemporal[indiceInventario++] = producto_tienda;  // Agrega el producto al inventario temporal y aumenta el índice
            productos.remove(producto_tienda);  // Elimina el producto de la lista de productos
            System.out.println("Producto eliminado con exito!");  // Muestra un mensaje de éxito
        } else {
            System.out.println("No se pudo encontrar el producto!");  // Muestra un mensaje si el producto no se encuentra
        }
    }

    // Metodo 5: Modifica un producto en el inventario
    public void ModificarProducto(int ID, Producto nuevoProducto) {
        // Itera a través de la lista de productos
        for (int i = 0; i < productos.size(); i++) {
            // Verifica si el ID del producto coincide con el ID buscado
            if (productos.get(i).getID() == ID) {
                productos.set(i, nuevoProducto);  // Reemplaza el producto con el nuevo producto proporcionado
                System.out.println("Producto modificado correctamente.");  // Muestra un mensaje de éxito
                return;  // Sale del método después de modificar el producto
            }
        }
        System.out.println("Producto no encontrado.");  // Muestra un mensaje si no se encuentra el producto
    }
}

