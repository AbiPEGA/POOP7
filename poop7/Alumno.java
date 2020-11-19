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
public class Alumno extends Persona{
    int numCuenta;

    public Alumno() {
    }

    public Alumno(int numCuenta, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.numCuenta = numCuenta;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return super.toString()+" Alumno{" + "numCuenta=" + numCuenta + '}';
    }
    
}
