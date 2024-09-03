package Principal;

import Logica.NoPerecedero;
import Logica.Perecedero;
import Logica.Producto;
import java.util.Scanner;

public class Tienda {

    public static void main(String[] args) {

        GestorInventario gestor = new GestorInventario(5);
        Scanner scanner = new Scanner(System.in);

        while (true) {  // Bucle infinito para mostrar el menu hasta que el usuario decida salir

            System.out.println("\nMenu de la tienda:");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Modificar Producto");
            System.out.println("3. Eliminar un Producto");
            System.out.println("4. Buscar Producto por ID");
            System.out.println("5. Generar lista detallada del producto");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            try {  // Bloque unico try-catch que engloba todas las posibles excepciones de entrada del usuario

                int opcion = Integer.parseInt(scanner.nextLine());  // Lee la opcion seleccionada por el usuario

                switch (opcion) {  // Estructura de control switch para manejar las diferentes opciones del menu

                    case 1:  // Caso 1: Agregar un nuevo producto
                        System.out.println("");
                        System.out.println("Ingrese ID del Producto: ");
                        int idProducto = Integer.parseInt(scanner.nextLine());

                        System.out.print("Ingrese Nombre del Producto: ");
                        String nombreProducto = scanner.nextLine();

                        System.out.print("Ingrese el Precio del Producto: ");
                        double precioProducto = Double.parseDouble(scanner.nextLine());
                        if (precioProducto < 0) {  // Validacion del precio
                            System.out.println("El precio no puede ser negativo.");
                            break;
                        }

                        System.out.print("Ingrese la Cantidad del Producto en Inventario: ");
                        int cantidadInventarioProducto = Integer.parseInt(scanner.nextLine());
                        if (cantidadInventarioProducto < 0) {  // Validacion de la cantidad en inventario
                            System.out.println("La cantidad en inventario no puede ser negativa.");
                            break;
                        }

                        System.out.print("Ingrese la Fecha de Caducidad del Producto (dd/mm/yyyy): ");
                        String fechaCaducidad = scanner.nextLine();

                        System.out.print("Ingrese la Temperatura de Almacenamiento del Producto: ");
                        int tempAlmacenamiento = Integer.parseInt(scanner.nextLine());

                        gestor.AgregarProducto(new Perecedero(idProducto, nombreProducto, precioProducto, cantidadInventarioProducto, fechaCaducidad, tempAlmacenamiento));
                        System.out.println("Producto Agregado Exitosamente.");
                        break;

                    case 2:  // Caso 2: Modificar un producto existente
                        System.out.println("");
                        System.out.println("Ingrese ID del Producto que desea modificar: ");
                        int idModificar = Integer.parseInt(scanner.nextLine());

                        System.out.print("Ingrese el nuevo Nombre del Producto: ");
                        String nuevoNombre = scanner.nextLine();

                        System.out.print("Ingrese el nuevo Precio del Producto: ");
                        double nuevoPrecio = Double.parseDouble(scanner.nextLine());
                        if (nuevoPrecio < 0) {  // Validacion del precio
                            System.out.println("El precio no puede ser negativo.");
                            break;
                        }

                        System.out.print("Ingrese la nueva Cantidad del Producto en Inventario: ");
                        int nuevaCantidad = Integer.parseInt(scanner.nextLine());
                        if (nuevaCantidad < 0) {  // Validacion de la cantidad en inventario
                            System.out.println("La cantidad en inventario no puede ser negativa.");
                            break;
                        }

                        System.out.print("Ingrese la nueva Garantia del Producto: ");
                        int nuevaGarantia = Integer.parseInt(scanner.nextLine());

                        Producto nuevoProducto = new NoPerecedero(idModificar, nuevoNombre, nuevoPrecio, nuevaCantidad, nuevaGarantia);
                        gestor.ModificarProducto(idModificar, nuevoProducto);
                        break;

                    case 3:  // Caso 3: Eliminar un producto
                        System.out.println("");
                        System.out.println("Ingrese ID del producto que desea eliminar del inventario: ");
                        int idEliminar = Integer.parseInt(scanner.nextLine());
                        gestor.EliminarProducto(idEliminar);
                        System.out.println("Producto eliminado exitosamente.");
                        break;

                    case 4:  // Caso 4: Buscar un producto por su ID
                        System.out.println("");
                        System.out.println("Ingrese ID del producto que desea buscar: ");
                        int idBusqueda = Integer.parseInt(scanner.nextLine());

                        Producto producto_tienda = gestor.BuscarProducto(idBusqueda);
                        if (producto_tienda != null) {
                            producto_tienda.mostrarInformacion();
                        } else {
                            System.out.println("Producto no encontrado!");
                        }
                        break;

                    case 5:  // Caso 5: Generar un informe detallado de los productos
                        System.out.println("");
                        gestor.GenerarInforme();
                        break;

                    case 6:  // Caso 6: Salir del menu
                        System.out.println("Has salido del menu exitosamente");
                        scanner.close();
                        return;  // Sale del metodo main

                    default:  // Opcion predeterminada si la entrada del usuario no coincide con ninguna opcion
                        System.out.println("Opcion no valida. Intente de nuevo.");
                }

            } catch (NumberFormatException e) {  // Captura excepciones relacionadas con el formato incorrecto de entrada
                System.out.println("Error en la entrada de datos. Por favor, ingrese valores validos.");
            } catch (Exception e) {  // Captura cualquier
                
            }
        }
    }
}
