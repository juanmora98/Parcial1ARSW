/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.edu.arsw.LibraryAPI.persistence;

import com.eci.edu.arsw.LibraryAPI.model.Libreria;
import com.eci.edu.arsw.LibraryAPI.model.Libro;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 2124203
 */
public interface LibraryPersistence {
    
    
    public void saveLibrarie(Integer id, Libreria libreria);
    
    public Map<Integer,Libreria> GetLibraries();
    
    public Libreria GetLibrarie(Integer id);
    
    public List<Libro> GetBooksbyLibrarie(Integer id);
    
}
