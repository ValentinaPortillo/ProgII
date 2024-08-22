package Supermercado;

public class Empleado extends Humano {
    public float sueldo;


    public Empleado(String nombre, float sueldo) {
        super(nombre);
        this.sueldo = sueldo;
    }
}
