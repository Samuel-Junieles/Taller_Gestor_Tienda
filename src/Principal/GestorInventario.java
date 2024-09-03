package Principal;
import Logica.Producto;
import java.util.ArrayList;

    public class GestorInventario {

    private ArrayList<Producto> productos;
    private Producto[] inventarioTemporal;
    private int indiceInventario;

    public GestorInventario(int TamañoInventarioTemporal){

        productos = new ArrayList<>();
        inventarioTemporal = new Producto[TamañoInventarioTemporal];
        indiceInventario = 0; 
    }

    //Metodo 1
    public void AgregarProducto(Producto producto_tienda){
        productos.add(producto_tienda);
    }

    //Metodo 2
    public Producto BuscarProducto(int ID){

        for (Producto producto_tienda : productos) {
            if (producto_tienda.getID() == ID)
                return producto_tienda;
        }
        return null;
    }

    //Metodo 3
    public void GenerarInforme() {
        System.out.println("Informe de inventario:");
        for (Producto producto : productos) {
            producto.mostrarInformacion();
        }
    }

    //Metodo 4
    public void EliminarProducto(int ID) {
    Producto producto_tienda = BuscarProducto(ID);
    if (producto_tienda != null && indiceInventario < inventarioTemporal.length) {
        inventarioTemporal[indiceInventario++] = producto_tienda;
        productos.remove(producto_tienda);
        System.out.println("Producto eliminado con exito!");
    } else {
        System.out.println("No se pudo encontrar el producto!");
    }

    }
    //Metodo 5
    public void ModificarProducto(int ID, Producto nuevoProducto) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getID() == ID) {
                productos.set(i, nuevoProducto);
                System.out.println("Producto modificado correctamente.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }
}
