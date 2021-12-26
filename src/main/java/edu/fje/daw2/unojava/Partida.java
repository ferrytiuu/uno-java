package edu.fje.daw2.unojava;

import java.util.ArrayList;

public class Partida {
    int id;
    ArrayList<Carta> cartas;
    ArrayList<Carta> pila;
    ArrayList<Jugador> jugadores;
    int NumJugadores;

    public Partida(int id) {
        this.id = id;
        this.cartas = new ArrayList<>();
        this.pila = new ArrayList<>();
        this.jugadores = new ArrayList<>();
    }

    public void  afegirCarta(Carta carta){
        this.cartas.add(carta);
    }
    public void  afegirPila(Carta carta){
        this.pila.add(carta);
    }
    public void  afegirJugador(Jugador jugador){
        this.jugadores.add(jugador);
        this.NumJugadores= this.jugadores.size();
    }
    public void  eliminarCarta(Carta carta){
        this.cartas.remove(carta);
    }
    public void  eliminarPila(Carta carta){
        this.pila.remove(carta);
    }
    public void  eliminarJugador(Jugador jugador){
        this.jugadores.remove(jugador);
        this.NumJugadores= this.jugadores.size();
    }

    public int getNumJugadores() {
        this.NumJugadores = jugadores.size();
        return NumJugadores;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o){
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Partida)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Partida c = (Partida) o;

        // Compare the data members and return accordingly
        if(this.id == c.id){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Partida{" +
                "id=" + id +
                ", cartas=" + cartas +
                ", pila=" + pila +
                ", jugadores=" + jugadores +
                ", NumJugadores=" + NumJugadores +
                '}';
    }
}
