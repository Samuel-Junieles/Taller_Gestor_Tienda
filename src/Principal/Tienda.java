package Principal;
import Logica.Producto;  
import java.util.Scanner;

public class Tienda {

    public static void main(String[] args) {

        GestorInventario gestor = new GestorInventario(5);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu de la tienda:");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Modificar Producto");
            System.out.println("3. Eliminar un Producto");
            System.out.println("4. Buscar Producto por ID");
            System.out.println("5. Generar lista detallada del producto");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            
            int opcion;
            
            // Manejo de excepciones para entrada de usuario
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.print("Ingrese ID del Producto: ");
                    try {
                        int idProducto = scanner.nextInt();
                        scanner.nextLine();  // Consumir el salto de línea

                        System.out.print("Ingrese Nombre del Producto: ");
                        String nombreProducto = scanner.nextLine();

                        System.out.print("Ingrese el Precio del Producto: ");
                        double precioProducto = scanner.nextDouble();  // Usar tipo double para precios
                        scanner.nextLine();  // Consumir el salto de línea

                        System.out.print("Ingrese la Cantidad del Producto en Inventario: ");
                        int cantidadInventarioProducto = scanner.nextInt();
                        scanner.nextLine();  // Consumir el salto de línea

                        // Asegúrate de que el método y la clase Producto están definidos correctamente
                        gestor.AgregarProducto(new Producto(idProducto, nombreProducto, precioProducto, cantidadInventarioProducto));
                        System.out.println("Producto Agregado Exitosamente.");
                        
                    } catch (Exception e) {
                        System.out.println("Error en la entrada de datos. Intente nuevamente.");
                        scanner.nextLine();  // Limpiar el buffer
                    }
                    break;

                case 2:
                    System.out.println("");
                    System.out.print("Ingrese ID del Producto que desea modificar: ");
                    try {
                        int idModificar = scanner.nextInt();
                        scanner.nextLine();  // Consumir el salto de línea

                        System.out.print("Ingrese el nuevo Nombre del Producto: ");
                        String nuevoNombre = scanner.nextLine();

                        System.out.print("Ingrese el nuevo Precio del Producto: ");
                        double nuevoPrecio = scanner.nextDouble();
                        scanner.nextLine();  // Consumir el salto de línea

                        System.out.print("Ingrese la nueva Cantidad del Producto en Inventario: ");
                        int nuevaCantidad = scanner.nextInt();
                        scanner.nextLine();  // Consumir el salto de línea

                        // Crear el nuevo producto con la información proporcionada
                        Producto nuevoProducto = new Producto(idModificar, nuevoNombre, nuevoPrecio, nuevaCantidad);

                        // Modificar el producto en el inventario
                        gestor.ModificarProducto(idModificar, nuevoProducto);

                    } catch (Exception e) {
                        System.out.println("Error en la entrada de datos. Intente nuevamente.");
                        scanner.nextLine();  // Limpiar el buffer
                    }
                    break;

                case 3:
                    System.out.println("");
                    System.out.println("Ingrese ID del producto que desea eliminar del inventario: ");
                    try {
                        int idEliminar = scanner.nextInt();
                        scanner.nextLine();  // Consumir el salto de línea
                        gestor.EliminarProducto(idEliminar);
                    } catch (Exception e) {
                        System.out.println("Error Humano. Intente nuevamente.");
                        scanner.nextLine(); 
                    }
                    break;

                case 4:
                    System.out.println("");
                    System.out.print("Ingrese ID del producto que desea buscar: ");
                    
                    try {
                        int idBusqueda = scanner.nextInt();
                        scanner.nextLine();

                        Producto producto_tienda = gestor.BuscarProducto(idBusqueda);
                        if (producto_tienda != null) {
                            producto_tienda.mostrarInformacion();
                        } else {
                            System.out.println("Producto no encontrado!");
                        }
                    } catch (Exception e) {
                        System.out.println("Error Humano. Intente nuevamente.");
                        scanner.nextLine();
                    }
                    break;

                case 5:
                    System.out.println("");
                    gestor.GenerarInforme();
                    break;

                case 6:
                    System.out.println("Has salido del menu exitosamente");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no valida. Intente de nuevo.");
            }
        }
    }
}



