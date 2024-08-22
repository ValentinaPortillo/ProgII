package Supermercado;

public class Cliente extends Humano {

    private boolean esMayorista;

    public Cliente(String nombre ) {
        super(nombre);
    }

    public boolean isEsMayorista() {
        return esMayorista;
    }

    public void setEsMayorista(boolean esMayorista) {
        this.esMayorista = esMayorista;
    }

    // Funcion para saber sí es mayorista
    public void esMayorista(String respuesta, Cliente CapitanPantuflas){
        if(respuesta.equalsIgnoreCase("si")){
             CapitanPantuflas.setEsMayorista(true);

        }
    }


    // Función para comprar

    public void pagar(int numCaja, double montoTotal){
        System.out.println(this.getNombre() + " pago " + montoTotal + " en la caja N" + numCaja);

    }

}
