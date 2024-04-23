package Viaje;

import java.util.ArrayList;
import java.util.List;

import Vuelo.Vuelo;

public class Viaje {
    List<Vuelo> lista_vuelo = new ArrayList<>();
    Double precio;
    String origen;
    String destino_final;
    
     //constructor
     public Viaje (List<Vuelo> lista_vuelo, Double precio, String origen, String destino_final){
        this.lista_vuelo = lista_vuelo;
        this.precio = precio;
        this.origen = origen;
        this.destino_final = destino_final;
    }

    public Double getPrecio() {
        return precio;
    }

}
