package Reserva;

import Asiento.Asiento;
import Viaje.Viaje;


public class Reserva {
    Viaje viaje;
    Double precio;
    Asiento asiento;

    //constructor
    public Reserva (Viaje viaje, Double precio, Asiento asiento){
        this.viaje = viaje;
        this.precio = precio;
        this.asiento = asiento;
    }

    public Asiento getAsiento() {
        return asiento;
    }
}
