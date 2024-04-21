package Camino;
import java.time.LocalTime;

public class Camino {
    LocalTime instante;
    public Lugar lugar;

    public Camino(LocalTime instante, Lugar lugar) {
        this.instante = instante;
        this.lugar = lugar;
    }
}
