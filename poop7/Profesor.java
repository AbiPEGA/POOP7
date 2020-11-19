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
public class Profesor extends Trabajador{
    String materia;
    int grupo;

    public Profesor() {
    }

    public Profesor(String materia, int grupo, int numTrabajador, int sueldo, String nombre, String apellido, int edad) {
        super(numTrabajador, sueldo, nombre, apellido, edad);
        this.materia = materia;
        this.grupo = grupo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return super.toString()+" Profesor{" + "materia=" + materia + ", grupo=" + grupo + '}';
    }
    
}
