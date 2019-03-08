/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.edu.arsw.LibraryAPI.model;

import java.util.List;

/**
 *
 * @author 2124203
 */
public class Libreria {
    
    //Atributos
    private String nombre;
    private int id;
    private String direccion;
    private String telefono;
    private List<Libro> libros;
    
    
    
    public Libreria(String nombre, int id, String direccion, String telefono, List<Libro> libros){
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.libros = libros;
    }
    
    
    
    
//    
//    public void SetNombre(String nombre){
//        
//        this.nombre = nombre;
//    
//    }
//    
//    public String GetNombre(){
//        return nombre;
//    }
//    
//    public void SetId(int id){
//        this.id = id;
//    }
//    
//    public int GetId(){
//        return id;
//    }
//    
//    
//    public void SetDireccion(String direccion){
//        this.direccion = direccion;
//    }
//    
//    public String GetDireccion(){
//        return direccion;
//    }
//    
//    
//    public void SetTelefono(String telefono){
//        this.telefono = telefono;
//    }
//    
//    public String GetTelefono(){
//        return telefono;
//    }
//    
//    
//    public void SetLibros(List<Libro> libros){
//        this.libros = libros;
//    }
//    
//    public List<Libro> GetLibros(){
//        return libros;
//    }
//    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
    
}
