/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lenon.prova2bim.model;

import java.util.ArrayList;

/**
 *
 * @author LENON
 */
public class Filme {
    
    private int id;
    private String filme; 
    private String sinopse; 
    private String genero;
    private int duracao; 
    private String trailer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    @Override
    public String toString() {
        return "Filme{" + "id=" + id + ", filme=" + filme + ", sinopse=" + sinopse + ", genero=" + genero + ", duracao=" + duracao + ", trailer=" + trailer + '}';
    }
    
    
    
}
