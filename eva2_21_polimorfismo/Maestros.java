/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_21_polimorfismo;

/**
 *
 * @author eduar
 */
//Maestros is a Persona
public class Maestros extends Persona {

    public Maestros() {
        super();//llamada al constructor de la superclase
        this.plaza = "_____";
    }

    public Maestros(String plaza, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.plaza = plaza;
    }
    
    
    
    private String plaza;
    

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    public void imprimirDatos(){
        //System.out.println("");getNombre();
        //System.out.println("");getApellido();
        //System.out.println("");getEdad();
        System.out.println("PLAZA: "+plaza);
        super.imprimirDatos();
    }
}
