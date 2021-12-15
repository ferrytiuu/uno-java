package edu.fje.daw2.unojava;

import java.util.ArrayList;

public class Jugador {
    String id;
    String Nombre;
    Partida partida;
    ArrayList<Carta> cartasJugador;

    public Jugador(String id, String nombre) {
        this.id = id;
        Nombre = nombre;
        this.cartasJugador = new ArrayList<>();
    }

    public void afegirPartida(Partida partida) {
        this.partida = partida;
    }

    public void afegirCarta(Carta carta) {
        this.cartasJugador.add(carta);
    }
    public void eliminarPartida() {
        this.partida = null;
    }

    public void eliminarCarta(Carta carta) {
        this.cartasJugador.remove(carta);

    }
}
