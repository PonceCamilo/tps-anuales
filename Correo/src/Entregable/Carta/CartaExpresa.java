package Entregable.Carta;

public class CartaExpresa extends Carta {

    public CartaExpresa(String sellado) {
        super(sellado);
    }

    public void enviar() {
        System.out.println("Se realizo el envio de la carta Expresa");
    }

}
