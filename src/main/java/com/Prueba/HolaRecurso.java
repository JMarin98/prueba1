package com.Prueba;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/mundo")
public class HolaRecurso {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String convertir() {
        return "mundo";
    }
}