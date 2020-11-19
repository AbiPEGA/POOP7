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
public class Trabajador extends Persona{
    int numTrabajador;
    int sueldo;

    public Trabajador() {
    }

    public Trabajador(int numTrabajador, int sueldo, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.numTrabajador = numTrabajador;
        this.sueldo = sueldo;
    }

    public int getNumTrabajador() {
        return numTrabajador;
    }

    public void setNumTrabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+" Trabajador{" + "numTrabajador=" + numTrabajador + ", sueldo=" + sueldo + '}';
    }
    
}
