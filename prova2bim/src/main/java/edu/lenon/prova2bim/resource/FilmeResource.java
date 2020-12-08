/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lenon.prova2bim.resource;

import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;

import edu.lenon.prova2bim.model.Filme;
import edu.lenon.prova2bim.service.FilmeService;

/**
 * REST Web Service
 *
 * @author LENON
 */
@Path("Filme")
public class FilmeResource {

    private FilmeService filmeService = new FilmeService();

    @Context
    private UriInfo context;

    public FilmeResource() {
    }

    @GET
    @Produces("application/text")
    public String getFilmes() {
        Gson gson = new Gson();
        return gson.toJson(filmeService.GetAll());
    }

    @GET
    @Path("{filmeId}")
    @Produces("application/json")
    public String getFilme(@PathParam("filmeId") String filmeId) {
        Gson gson = new Gson();
        return gson.toJson(filmeService.Get(filmeId));
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public String salvarFilme(String filmeJSON) {
        Gson gson = new Gson();
        Filme filme = gson.fromJson(filmeJSON, Filme.class);
        filmeService.Add(filme);
        return gson.toJson(filmeService.GetAll());

    }

    @DELETE
    @Path("/{id}")
    public String removerFilme(final @PathParam("id") int id) {
        filmeService.Delete(id);
        Gson gson = new Gson();
        return gson.toJson(filmeService.GetAll());
    }

    @PUT
    @Produces("application/json")
    @Consumes("application/json")
    public String updateFilme(String filmeJSON) {
        Gson gson = new Gson();
        Filme filme = gson.fromJson(filmeJSON, Filme.class);
        filmeService.Edit(filme);
        return gson.toJson(filmeService.Get(Integer.toString(filme.getId())));
    }
}
