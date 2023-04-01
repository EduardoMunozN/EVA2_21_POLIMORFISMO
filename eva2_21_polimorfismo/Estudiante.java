/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_21_polimorfismo;

/**
 *
 * @author eduar
 */
//Estudiante is a Persona
public class Estudiante extends Persona{
    //Clase derivada extends Clase Base
    //Subclase Extends SuperClase
    //Hijo extends Padre
    private String noControl;

    public Estudiante() {
        super();//llamada al constructor de la superclase
        this.noControl = "_____";
    }

    public Estudiante(String noControl, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.noControl = noControl;
    }
    

    public Estudiante(String noControl) {
        this.noControl = noControl;
    }
    
    

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    //override REEMPLAZA EL MÉTODO CON LA MISMA FIRMA EN LA 
    // SUPERCLASE, EN ESTE CASO, REEMPLAZA A imprimirDatos () de Persona.
    @Override
    public void imprimirDatos(){
        //System.out.println("");getNombre();
        //System.out.println("");getApellido();
        //System.out.println("");getEdad();
        System.out.println("NO CONTROL: "+noControl);
        super.imprimirDatos();
    }
}
