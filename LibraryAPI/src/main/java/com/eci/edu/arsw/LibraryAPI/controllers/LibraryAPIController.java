/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.edu.arsw.LibraryAPI.controllers;

import com.eci.edu.arsw.LibraryAPI.model.Libreria;
import com.eci.edu.arsw.LibraryAPI.model.Libro;
import com.eci.edu.arsw.LibraryAPI.services.LibraryServices;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2124203
 */


@RestController
@Service
@RequestMapping(value = "/Libraries")
public class LibraryAPIController {
    
    
    @Autowired
    LibraryServices ls;    
    
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> manejadorGetLibraries(){
        try {
            
            Map<Integer,Libreria> librerias = ls.getAllLibraries();
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(librerias,HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(LibraryAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
        } 
    }
    
    
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> manejadorGetLibreriaId(@PathVariable int id){
        try {            
            return new ResponseEntity<>(ls.getCinemaById(id), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            Logger.getLogger(LibraryAPIController.class.getName()).log(Level.SEVERE, null, e);            
            return new ResponseEntity<>("Lo sentimos no existe una libreria con esa id", HttpStatus.NOT_FOUND);
        }   
    
    }
    
    
    
    
}
