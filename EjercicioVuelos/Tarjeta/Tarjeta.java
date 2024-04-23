package Tarjeta;

import java.util.Date;

public class Tarjeta {
    String nombre;
    Double nroTarjeta;
    Date fechaVencimiento;

     //constructor
     public Tarjeta (String nombre, Double nroTarjeta, Date fechaVencimiento){
        this.nombre = nombre;
        this.nroTarjeta = nroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
    }

    public void pagar(){
        System.out.println("Pago realizado -- Tarjeta -> pagar()");
    }
}

