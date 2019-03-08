/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.edu.arsw.LibraryAPI.persistence.impl;

import com.eci.edu.arsw.LibraryAPI.model.Libreria;
import com.eci.edu.arsw.LibraryAPI.model.Libro;
import com.eci.edu.arsw.LibraryAPI.persistence.LibraryPersistence;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2124203
 */
@Service
public class InMemoryLibraryPersistence implements LibraryPersistence{

    //Atributos
     private final Map<Integer,Libreria> librerias=new HashMap<>();
    
     
    public InMemoryLibraryPersistence(){
        List<Libro> libros = new ArrayList<>();
        Libro libro1 = new Libro("moramon", 1, "mora", "mora es dios");
        //CinemaFunction funct2 = new CinemaFunction(new Movie("The Night","Horror"),functionDate);
        libros.add(libro1);
        //functions.add(funct2);
        Libreria l =new Libreria("santoto", 1, "ananana", "43432424", libros);
        librerias.put(1, l);

    } 
    
    
    
    @Override
    public void saveLibrarie(Integer id, Libreria libreria) {
        librerias.put(id, libreria);
    }

    @Override
    public Map<Integer, Libreria> GetLibraries() {
        return librerias;
    }

    @Override
    public Libreria GetLibrarie(Integer id) {
        return librerias.get(id);
    }

    @Override
    public List<Libro> GetBooksbyLibrarie(Integer id) {
        Libreria libreria = librerias.get(id);
        return libreria.getLibros();
    }

    @Override
    public void DeleteLibrary(Integer id) throws LibraryServiceException{
        Libreria libreria = librerias.get(id);
        if (!libreria.getLibros().isEmpty()){
            librerias.remove(id);
        }
        else{
            throw new LibraryServiceException("La libreria tiene libros, no se puede eliminar");
        }
             

    }
    
    
    
}
