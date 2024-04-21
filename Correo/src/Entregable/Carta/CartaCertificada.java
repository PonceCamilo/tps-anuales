package Entregable.Carta;

import java.util.ArrayList;
import java.util.List;

public class CartaCertificada extends Carta {
    List<Comprobante> comprobantes = new ArrayList<>();

    public CartaCertificada(String sellado, List<Comprobante> comprobantes) {
        super(sellado);
        this.comprobantes = comprobantes;
    }

    public void enviar() {
        System.out.println("Se realizo el envio de la carta Certificada");
    }

}
