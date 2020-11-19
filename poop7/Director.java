/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 *
 * @author Abigail y Victor
 */
public class Director extends Trabajador{
    String escuela;

    public Director() {
    }

    public Director(String escuela, int numTrabajador, int sueldo, String nombre, String apellido, int edad) {
        super(numTrabajador, sueldo, nombre, apellido, edad);
        this.escuela = escuela;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    @Override
    public String toString() {
        return super.toString()+" Director{" + "escuela=" + escuela + '}';
    }
    
}
