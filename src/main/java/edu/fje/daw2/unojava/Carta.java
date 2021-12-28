package edu.fje.daw2.unojava;

import java.util.ArrayList;
import java.util.Objects;

public class Carta {
    String color;
    int numero;

    ArrayList<Jugador> jugadores;
    ArrayList<Partida> partidas;
    ArrayList<Partida> pilas;

    public Carta(int numero, String color) {
        this.color = color;
        this.numero = numero;
        this.jugadores = new ArrayList<>();
        this.partidas = new ArrayList<>();
        this.pilas = new ArrayList<>();
    }
    public void afegirJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }
    public void afegirPartida(Partida partida){
        this.partidas.add(partida);
    }
    public void afegirPila(Partida partida){
        this.pilas.add(partida);
    }
    public void eliminarJugador(Jugador jugador){
        this.jugadores.remove(jugador);
    }
    public void eliminarPartida(Partida partida){
        this.partidas.remove(partida);
    }
    public void eliminarPila(Partida partida){
        this.pilas.remove(partida);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return numero == carta.numero && Objects.equals(color, carta.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, numero);
    }

    @Override
    public String toString() {
        return "Carta{" +
                "color='" + color + '\''+
                ", numero=" + numero +
                '}'+"\n";
    }
}
