package Vuelo;

import java.util.ArrayList;
import java.util.List;

import Avion.Avion;
import Interesado.Pasajero;

public class Vuelo {
    Avion avion;
    String origen;
    String destino;
    List<Pasajero> pasajeros = new ArrayList<>();

    //constructor
    public Vuelo (Avion avion, String origen, String destino, List<Pasajero> pasajeros){
        this.avion = avion;
        this.origen = origen;
        this.destino = destino;
        this.pasajeros = pasajeros;
    }

    public void viajar() {
        System.out.println("Comenzo el viaje -- Vuelo -> viajar()");
    }
}
