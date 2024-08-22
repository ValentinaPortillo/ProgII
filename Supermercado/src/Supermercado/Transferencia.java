package Supermercado;

public class Transferencia {

    public double aplicarDescuento (double montoTotal, boolean esMayorista){
        double total = montoTotal;
        if(esMayorista ) {
            total = montoTotal * 0.80;
        }
        return  total;

    }
}
