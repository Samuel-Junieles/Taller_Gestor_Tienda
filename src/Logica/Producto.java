package Logica;

public class Producto {
    
    private int ID;
    private String Nombre;
    private double Precio;
    private int cantidadEnInventario;
    
    public Producto(int ID, String Nombre, double Precio, int cantidadEnInventario){
        
        this.ID = ID;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.cantidadEnInventario = cantidadEnInventario;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public int getCantidadEnInventario() {
        return cantidadEnInventario;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void setCantidadEnInventario(int cantidadEnInventario) {
        this.cantidadEnInventario = cantidadEnInventario;
    }
    
    public void  mostrarInformacion(){
        System.out.println("");
        System.out.println("ID: " + ID);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Precio: " + Precio);
        System.out.println("Cantidad En Inventario: " + cantidadEnInventario);
    }
}
