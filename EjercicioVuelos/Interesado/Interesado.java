package Interesado;

import java.util.ArrayList;
import java.util.List;

import Reserva.Reserva;
import Tarjeta.Tarjeta;
import Interesado.DatosInteresado;

public class Interesado {
    List<Reserva> lista_reserva = new ArrayList<>();
    DatosInteresado dato;
    Tarjeta tarjeta;

    //constructor
    public Interesado (List<Reserva> lista_reserva, DatosInteresado dato, Tarjeta tarjeta){
        this.lista_reserva = lista_reserva;
        this.dato = dato;
        this.tarjeta = tarjeta;
    }

    
    public void reservar(Reserva reserva){
       lista_reserva.add(reserva);
       System.out.println("Se agrego una reserva a la lista de reservas -- Interesado -> reservar()"); 
    }

    public List<Reserva> getLista_reserva() {
        return lista_reserva;
    }

    public Tarjeta getTarjeta() {
        return this.tarjeta;
    }
}
