/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class Persona 
{
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private String tipoDocumento;
    private List<Persona> amigos;

    public Persona(String nombre, String apellido, String numeroDocumento, String tipoDocumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.tipoDocumento = tipoDocumento;
        this.amigos = new ArrayList<Persona>();
    }
    
    public void agregarAmigo(Persona amigo)
    {
        amigos.add(amigo);
    }
    
    public Persona obtenerAmigoPorIndice(int i)
    {
        return amigos.get(i); //;
    }
    
    public void verAmigos()
    {
        for (Persona p :amigos) 
        {
            System.out.println(p.toString());
            p.verAmigos();            
        }
    }
    
    @Override
    public String toString()
    {
        String cadena = "Nombre: " + nombre + " Apellido " + apellido + " Tipo de documento: " + tipoDocumento + " numero del documento: " + numeroDocumento;
        return cadena;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
    
    
}
