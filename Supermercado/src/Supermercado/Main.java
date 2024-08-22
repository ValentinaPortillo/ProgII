package Supermercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        Cliente Marco = new Cliente("marco");

        List<Producto> produc = new ArrayList<Producto>();

        produc.add(new Producto( "Leche", 1500, 5));
        produc.add(new Producto("Alfajor", 500, 10));
        produc.add(new Producto("Nutella", 900, 7));

        double montoTotal = 0;

        System.out.println("¿Es mayorista? si/no");
        String respuesta = sc.nextLine();
        Marco.esMayorista(respuesta,Marco);
        System.out.println(Marco.isEsMayorista());

        for(Producto pr : produc){
            System.out.println( "Nombre :" + pr.getNombre());
            System.out.println("Precio :" +  pr.getPrecio());
            System.out.println("Cantidad : " + pr.getCant());
            System.out.println(" ");

            double monto = pr.getCant() * pr.getPrecio();
            montoTotal = monto + montoTotal;

        }
        Transferencia ts  = new Transferencia();
        montoTotal = ts.aplicarDescuento(montoTotal, Marco.isEsMayorista());

        Marco.pagar(3,montoTotal);



        //perdon es mi primera vez trabajando en diferentes archivos 
    }
}
