package Logica;

public class NoPerecedero extends Producto {
    
    private int MesDeGarantia;
    
    public NoPerecedero(int ID, String Nombre, double Precio, int cantidadEnInventario, int garantia){
        
        super(ID, Nombre, Precio, cantidadEnInventario);
        this.MesDeGarantia = garantia; 
    }

    public int getGarantia() {
        return MesDeGarantia;
    }

    public void setGarantia(int garantia) {
        this.MesDeGarantia = garantia;
    }
    
    @Override
    public void mostrarInformacion(){
        
        super.mostrarInformacion();
        System.out.println("Garantia del producto: " + MesDeGarantia + "mes");
    }
}
