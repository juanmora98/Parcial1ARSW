/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.edu.arsw.LibraryAPI.services;

import com.eci.edu.arsw.LibraryAPI.model.Libreria;
import com.eci.edu.arsw.LibraryAPI.model.Libro;
import com.eci.edu.arsw.LibraryAPI.persistence.LibraryPersistence;
import com.eci.edu.arsw.LibraryAPI.persistence.impl.LibraryServiceException;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2124203
 */


@Service
public class LibraryServices {
    
    @Autowired
    LibraryPersistence lp;
    
    
    
    
    public void addNewLibrary(Integer id, Libreria libreria){
        lp.saveLibrarie(id,libreria);
    }
    
    
    
    public Map<Integer,Libreria> getAllLibraries(){
        return lp.GetLibraries();
    }
    
    
    
    public Libreria getCinemaById(int id) {
        
        return lp.GetLibrarie(id);
        
    }
    
    
    
    public List<Libro> GetBooksbyLibrarie(int id) {
            return lp.GetBooksbyLibrarie(id);
    }
 
    public void DeleteLibrary(int id) throws LibraryServiceException{
        lp.DeleteLibrary(id);
    }
    
//    public void CreateFuncionInCinema(String Cinema, CinemaFunction funcion) throws CinemaPersistenceException{
//        cps.CreateFunctionInCinema(Cinema, funcion);
//    }
//
//    
//    public void UpdateFuncionInCinema(String Cinema, CinemaFunction funcion) throws CinemaPersistenceException{
//        cps.UpdateFunctionInCinema(Cinema, funcion);
//    }
    
    
    
}
