package Entregable.Carta;

public class Comprobante {
    boolean firmadoPorRemitente;
    boolean firmadoPorDestinatario;

    public Comprobante(boolean firmadoPorRemitente, boolean firmadoPorDestinatario) {
        this.firmadoPorRemitente = firmadoPorRemitente;
        this.firmadoPorDestinatario = firmadoPorDestinatario;
    }

    public void recibirPorRemitente() {
        this.firmadoPorRemitente = true;
    }

    public void recibirPorDestinatario() {
        this.firmadoPorDestinatario = true;
    }
}
