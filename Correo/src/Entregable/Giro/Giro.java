package Entregable.Giro;

import Entregable.Entregable;

public class Giro extends Entregable {
    double importe;

    public Giro(double importe) {
        this.importe = importe;
    }

    public void enviar() {
        System.out.println("Se realizo el envio del Giro");
    }
}
