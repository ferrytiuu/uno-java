package edu.fje.daw2.unojava;

import java.util.ArrayList;

public class Jugador {
    int id;
    String Nombre;
    Partida partida;
    ArrayList<Carta> cartasJugador;

    public Jugador(int id, String nombre) {
        this.id = id;
        Nombre = nombre;
        this.cartasJugador = new ArrayList<>();
    }
    public Jugador(int id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object o){
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Jugador)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Jugador c = (Jugador) o;

        // Compare the data members and return accordingly
        if(this.id == c.id){
            return true;
        }
        else{
            return false;
        }
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

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", cartasJugador=" + cartasJugador +
                '}';
    }
}
