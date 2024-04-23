package Interesado;

//import java.util.ArrayList;
import java.util.List;

import Reserva.Reserva;
import Tarjeta.Tarjeta;
//import Interesado.DatosInteresado;

public class Pasajero extends Interesado {
    int nro_billete;

    //constructor
    public Pasajero (List<Reserva> lista_reserva, DatosInteresado dato, Tarjeta tarjeta, int nro_billete){
        super(lista_reserva, dato, tarjeta);
        this.nro_billete = nro_billete;
    }
}
