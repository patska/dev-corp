/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lenon.prova2bim.service;

import java.util.ArrayList;
import edu.lenon.prova2bim.model.Filme;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author LENON
 */

public class FilmeService {
    
    private final static HashMap<Integer, Filme> filmes = new HashMap<>();
    
    
    public FilmeService(){
        System.out.println("FilmeService Instanciada! 🍕🍕");
    }
    
    public List<Filme> GetAll(){
        return new ArrayList<Filme>(filmes.values());
    }

    public Filme Get(final String id) {
        
        for (Filme filme : filmes.values()){
            if (Integer.toString(filme.getId()).equals(id)){
               System.out.println("Filme: " + filme.getId());
               return filme;
            }
            System.out.println(filme.getFilme());
        }
        return null;
    }

    public void Add(final Filme filme) {
        if(filme.getId() == 0 )
            filme.setId(generateId(filmes.size() + 1));
        filmes.put(filme.getId(), filme);
    }

    public void Edit(final Filme filme) {
        filmes.remove(filme.getId());
        filmes.put(filme.getId(), filme);
    }

    public void Delete(final int id) {
        filmes.remove(id);
    }

    private int generateId(final int possible)
    {
        if(filmes.containsKey(possible))
            return generateId(possible + 1);
        return possible;
    }


    
    
   
}
