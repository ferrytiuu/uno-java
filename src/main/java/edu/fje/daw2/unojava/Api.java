package edu.fje.daw2.unojava;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

import java.util.ArrayList;

@Path("/uno-java")
public class Api {
    @Context
    private UriInfo context;
    public static ArrayList<Partida> partidas = new ArrayList<>();
    public static ArrayList<Carta> cartas = new ArrayList<>();

    public Api() {

        for (int index = 0; index <= 9; index++) {
            cartas.add( new Carta(index , "vermell"));
            cartas.add(new Carta(index ,"blau"));
            cartas.add(new Carta(index ,"groc"));
            cartas.add(new Carta(index ,"verd"));
        }

    }
    @Path("/iniciarJoc/codiPartida")
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces({MediaType.TEXT_PLAIN, MediaType.TEXT_PLAIN})
    public Response afegirAlumne(@FormParam("idPartida") int id) {


        Partida partida = new Partida(id);
        if(partidas.contains(partida.id)) return Response.status(200).entity("La partida ja existeix. Uneix-t'hi").build();
        else{
            partidas.add(partida);
            return Response.status(200).entity(partidas.toString()).build();
        }


    }


    /*
    @Path("/consultarTOTS")
    @GET
    public String consultarTotsAlumnes() {
        return alumnes.toString();
    }

     */
    @GET
    @Path("/hello-world")
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }
}