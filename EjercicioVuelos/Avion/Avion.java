package Avion;

import java.util.ArrayList;
import java.util.List;
import Asiento.Asiento;

public class Avion {
    List<Asiento> lista_asiento = new ArrayList<>();
    String aerolinea;
    String piloto;
    int codigo_unico;

    //constructor
    public Avion (List<Asiento> lista_asiento, String aerolinea, String piloto, int codigo_unico){
        this.lista_asiento = lista_asiento;
        this.aerolinea = aerolinea;
        this.piloto = piloto;
        this.codigo_unico = codigo_unico;
    }
}
