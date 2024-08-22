package Supermercado;

public class Caja {
    int numCaja;
    Empleado emple;
    float montoCompra;

    public Caja (Empleado emple, float montoCompra, int numCaja) {
        this.emple = emple;
        this.montoCompra = montoCompra;
        this.numCaja = numCaja;
    }

}
