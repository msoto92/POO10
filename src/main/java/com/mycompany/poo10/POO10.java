/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo10;

/**
 *
 * @author Miguel
 */
public class POO10 {

    public static void main(String[] args) 
    {       
       Persona p = new Persona("Carlos", "Soto", "115465132", "TI");
       Persona p1 = new Persona("Melanny", "Contreras", "1154322", "CC");
       Persona p2 = new Persona("Luis", "Torres", "1140512", "CC");
       Persona p3 = new Persona("Juan", "Varela", "1224561", "CC");
       p.agregarAmigo(p1);
       p.agregarAmigo(p2);
       p2.agregarAmigo(p3);       
       p.verAmigos();
       
    }
}
