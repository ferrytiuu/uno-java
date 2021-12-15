package edu.fje.daw2.unojava;

import java.util.ArrayList;

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
}