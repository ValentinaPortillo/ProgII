package Supermercado;

public class Producto {
    private String nombre;
    private float precio;
    private int cant;
    private float montoCompra;

    public Producto( String nombre, float precio , int cant, float montoCompra){
        this.montoCompra = montoCompra;
        this.nombre = nombre;
        this.precio = precio;
        this.cant= cant;
    }

    public Producto( String nombre, float precio , int cant){
        this.nombre = nombre;
        this.precio = precio;
        this.cant= cant;
    }

    public String getNombre() {
        return nombre ;
    }
    public int getCant(){
        return cant;
    }

    public float getPrecio(){
        return precio;
    }




}
