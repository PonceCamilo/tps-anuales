package Entregable.Encomienda;
import java.util.ArrayList;
import java.util.List;

public class EncomiendaPackets extends Encomienda {
    List<Packet> packets = new ArrayList<>();

    public EncomiendaPackets(List<Packet> packets) {
        this.packets = packets;
    }

    public void enviar() {
        System.out.println("Se realizo el envio del la Encomienda con sus packets");
    }

}
