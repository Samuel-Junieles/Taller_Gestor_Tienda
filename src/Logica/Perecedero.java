package Logica;

public class Perecedero extends Producto {  // Declara la clase Perecedero que extiende de la clase Producto

    private String fechaDeCaducidad;  // Variable privada que almacena la fecha de caducidad del producto
    private double temperaturaDeAlmacenamiento;  // Variable privada que almacena la temperatura de almacenamiento del producto

    // Constructor de la clase Perecedero
    public Perecedero(int ID, String Nombre, double Precio, int cantidadEnInventario, String fechaDeCaducidad, double temperaturaDeAlmacenamiento) {
        
        super(ID, Nombre, Precio, cantidadEnInventario);  // Llama al constructor de la clase padre (Producto) para inicializar los atributos comunes
        this.fechaDeCaducidad = fechaDeCaducidad;  // Inicializa el atributo fechaDeCaducidad con el valor proporcionado
        this.temperaturaDeAlmacenamiento = temperaturaDeAlmacenamiento;  // Inicializa el atributo temperaturaDeAlmacenamiento con el valor proporcionado
    }

    // Método getter para obtener la fecha de caducidad del producto
    public String getFechaDeCaducidad() {
        return fechaDeCaducidad;  // Retorna el valor de fechaDeCaducidad
    }

    // Método getter para obtener la temperatura de almacenamiento del producto
    public double getTemperaturaDeAlmacenamiento() {
        return temperaturaDeAlmacenamiento;  // Retorna el valor de temperaturaDeAlmacenamiento
    }

    // Método setter para establecer o cambiar la fecha de caducidad del producto
    public void setFechaDeCaducidad(String fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;  // Asigna un nuevo valor a fechaDeCaducidad
    }

    // Método setter para establecer o cambiar la temperatura de almacenamiento del producto
    public void setTemperaturaDeAlmacenamiento(double temperaturaDeAlmacenamiento) {
        this.temperaturaDeAlmacenamiento = temperaturaDeAlmacenamiento;  // Asigna un nuevo valor a temperaturaDeAlmacenamiento
    }
    
    // Método sobrescrito de la clase padre para mostrar la información del producto
    @Override
    public void mostrarInformacion() {
        
        super.mostrarInformacion();  // Llama al método mostrarInformacion de la clase padre para mostrar información común del producto
        System.out.println("Fecha de vencimiento: " + fechaDeCaducidad);  // Muestra la fecha de caducidad específica del producto perecedero
        System.out.println("Temperatura del producto: " + temperaturaDeAlmacenamiento);  // Muestra la temperatura de almacenamiento específica del producto perecedero
    }
}

