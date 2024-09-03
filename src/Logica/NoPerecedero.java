package Logica;

public class NoPerecedero extends Producto {  // Declara la clase NoPerecedero que extiende de la clase Producto

    private int MesDeGarantia;  // Variable privada que almacena la garantía del producto en meses

    // Constructor de la clase NoPerecedero
    public NoPerecedero(int ID, String Nombre, double Precio, int cantidadEnInventario, int garantia) {
        
        super(ID, Nombre, Precio, cantidadEnInventario);  // Llama al constructor de la clase padre (Producto) para inicializar los atributos comunes
        this.MesDeGarantia = garantia;  // Inicializa el atributo MesDeGarantia con el valor proporcionado
    }

    // Método getter para obtener la garantía del producto
    public int getGarantia() {
        return MesDeGarantia;  // Retorna el valor de MesDeGarantia
    }

    // Método setter para establecer o cambiar la garantía del producto
    public void setGarantia(int garantia) {
        this.MesDeGarantia = garantia;  // Asigna un nuevo valor a MesDeGarantia
    }
    
    // Método sobrescrito de la clase padre para mostrar la información del producto
    @Override
    public void mostrarInformacion() {
        
        super.mostrarInformacion();  // Llama al método mostrarInformacion de la clase padre para mostrar información común del producto
        System.out.println("Garantia del producto: " + MesDeGarantia + " mes");  // Muestra la garantía del producto específica de NoPerecedero
    }
}
