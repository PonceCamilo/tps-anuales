package Entregable.Carta;

import Entregable.Entregable;

public class Carta extends Entregable {
    String sellado;

    public Carta(String sellado) {
        this.sellado = sellado;
    }

    public void enviar() {
        System.out.println("Se realizo el envio de la carta simple");
    }
}
