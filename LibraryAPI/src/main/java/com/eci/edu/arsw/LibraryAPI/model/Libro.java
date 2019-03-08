/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.edu.arsw.LibraryAPI.model;

/**
 *
 * @author 2124203
 */
public class Libro {
    
    //Atributos
    private String nombre;
    private int id;
    private String autor;
    private String sinopsis;
    
    
    
    public Libro(){
        
    }
    
    public Libro(String nombre, int id, String autor, String sinopsis){
        this.nombre = nombre;
        this.id = id;
        this.autor = autor;
        this.sinopsis = sinopsis;
        
        
        
    }
    
    
    public void SetNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String GetNombre(){
        return nombre;
    }
    
    public void SetId(int id){
        this.id = id;
    }
    
    public int GetId(){
        return id;
    }
    
    
    public void SetAutor(String autor){
        this.autor = autor;
    }
    
    public String GetAutor(){
        return autor;
    }
    
    
    public void SetSinopsis(String sinopsis){
        this.sinopsis = sinopsis;
    }
    
    public String GetSinopis(){
        return sinopsis;
    }
    
    
    
    
}
