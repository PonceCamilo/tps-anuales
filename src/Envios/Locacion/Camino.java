package Envios.Locacion;

import java.sql.Time;

public class Camino {
    private Time instante;
    private Lugar lugar;

    public Camino(Time instante, Lugar lugar) {
        this.instante = instante;
        this.lugar = lugar;
    }
}
