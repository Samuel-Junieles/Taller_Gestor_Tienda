package Logica;

public class Producto {  // Declara la clase Producto, que es una clase base para diferentes tipos de productos.

    private int ID;  // Atributo privado que almacena el ID único del producto.
    private String Nombre;  // Atributo privado que almacena el nombre del producto.
    private double Precio;  // Atributo privado que almacena el precio del producto.
    private int cantidadEnInventario;  // Atributo privado que almacena la cantidad de productos disponibles en el inventario.

    // Constructor de la clase Producto
    public Producto(int ID, String Nombre, double Precio, int cantidadEnInventario) {
        
        this.ID = ID;  // Inicializa el atributo ID con el valor proporcionado.
        this.Nombre = Nombre;  // Inicializa el atributo Nombre con el valor proporcionado.
        this.Precio = Precio;  // Inicializa el atributo Precio con el valor proporcionado.
        this.cantidadEnInventario = cantidadEnInventario;  // Inicializa el atributo cantidadEnInventario con el valor proporcionado.
    }

    // Método getter para obtener el ID del producto
    public int getID() {
        return ID;  // Retorna el valor del atributo ID.
    }

    // Método getter para obtener el nombre del producto
    public String getNombre() {
        return Nombre;  // Retorna el valor del atributo Nombre.
    }

    // Método getter para obtener el precio del producto
    public double getPrecio() {
        return Precio;  // Retorna el valor del atributo Precio.
    }

    // Método getter para obtener la cantidad en inventario del producto
    public int getCantidadEnInventario() {
        return cantidadEnInventario;  // Retorna el valor del atributo cantidadEnInventario.
    }

    // Método setter para establecer o cambiar el ID del producto
    public void setID(int ID) {
        this.ID = ID;  // Asigna un nuevo valor al atributo ID.
    }

    // Método setter para establecer o cambiar el nombre del producto
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;  // Asigna un nuevo valor al atributo Nombre.
    }

    // Método setter para establecer o cambiar el precio del producto
    public void setPrecio(double Precio) {
        this.Precio = Precio;  // Asigna un nuevo valor al atributo Precio.
    }

    // Método setter para establecer o cambiar la cantidad en inventario del producto
    public void setCantidadEnInventario(int cantidadEnInventario) {
        this.cantidadEnInventario = cantidadEnInventario;  // Asigna un nuevo valor al atributo cantidadEnInventario.
    }
    
    // Método para mostrar la información del producto
    public void mostrarInformacion() {
        System.out.println("");  // Imprime una línea en blanco para separar visualmente la información.
        System.out.println("ID: " + ID);  // Muestra el ID del producto.
        System.out.println("Nombre: " + Nombre);  // Muestra el nombre del producto.
        System.out.println("Precio: " + Precio);  // Muestra el precio del producto.
        System.out.println("Cantidad En Inventario: " + cantidadEnInventario);  // Muestra la cantidad del producto en el inventario.
    }
}

