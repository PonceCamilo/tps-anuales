package Entregable.Telegrama;
public class Telegrama {
    String texto;
    String clase; // cartaDocumento, evento, invitacion, etc

    public Telegrama(String texto, String clase) {
        this.texto = texto;
        this.clase = clase;
    }

    public void enviar() {
        System.out.println("Se realizo el envio del Telegrama");
    }
}
