import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import Camino.Camino;
import Camino.Lugar;
import Empleado.Cartero;
import Entregable.Carta.CartaCertificada;
import Entregable.Carta.Comprobante;
import Entregable.Encomienda.Encomienda;
import Entregable.Encomienda.EncomiendaPackets;
import Entregable.Encomienda.Packet;
import Entregable.Giro.Giro;
import Persona.Destinatario;
import Persona.Remitente;

public class Main {
    public static void main(String[] args) {
        // Crear un Remitente y un Destinatario
        Remitente remitente = new Remitente("Juan", "12345", "Ciudad A");
        Destinatario destinatario = new Destinatario("Pedro", "54321", "Ciudad B");

        // Crear un Cartero
        Cartero cartero = new Cartero("Martin", "Gutierrez", "+54 11 6242-6642", "motocicleta");

        // Crear una Lista de Caminos
        List<Camino> caminos = new ArrayList<>();
        caminos.add(new Camino(LocalTime.now(), new Lugar("Avenida X", "Ciudad X")));

        // Crear un Envío de Carta Certificada
        List<Comprobante> comprobantes = new ArrayList<>();
        comprobantes.add(new Comprobante(false, false));

        CartaCertificada cartaCertificada = new CartaCertificada("Sellado", comprobantes);
        Envio envioCartaCertificada = new Envio(remitente, destinatario, 10.0, LocalDate.now(), 123456, cartero,
                caminos, cartaCertificada);

        // Crear un Envío de Encomienda
        Packet packet1 = new Packet(10.0, 20.0, "Plástico");
        Packet packet2 = new Packet(15.0, 25.0, "Papel");
        List<Packet> packets = new ArrayList<>();
        packets.add(packet1);
        packets.add(packet2);
        Encomienda encomienda = new EncomiendaPackets(packets);
        Envio envioEncomienda = new Envio(remitente, destinatario, 20.0, LocalDate.now(), 654321, cartero, caminos,
                encomienda);

        // Crear un Envío de Giro
        Giro giro = new Giro(50.0);
        Envio envioGiro = new Envio(remitente, destinatario, 5.0, LocalDate.now(), 987654, cartero, caminos, giro);

        // Realizar los envíos
        envioCartaCertificada.realizar();
        envioCartaCertificada.rastrear();
        envioEncomienda.realizar();
        destinatario.recibirEnvio();
        envioEncomienda.noitificarRemitente();
        envioGiro.realizar();
    }
}