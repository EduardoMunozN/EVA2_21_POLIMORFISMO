/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_21_polimorfismo;

/**
 *
 * @author eduar
 */
public class EVA2_21_POLIMORFISMO {

    public static void main(String[] args) {
        Estudiante estu = new Estudiante("22550341", "Eduardo", "Muñoz", 18);
        
        
        
        Maestros maestro = new Maestros ("90313", "Martina", "Chávez", 22);
        //puedo tratar a los objetos de las subclases como objetos de la superclase
        //al revés de no se puede
        
        //estoy asignando un objeto de tipo estudiante a una variable de tipo persona
        Persona perso = estu;
        //estoy generalizando (simplificando).
        //perso
        
        Persona perso2 = maestro;
        
        Persona perso1 = new Persona ();
        //Es imposible convertir una persona en un estudiante
        //Podemos convertir un hijo en un padre, pero no al revés
        //no podemos agregar cosas, simplemente ocultamos propiedades
        //Estudiante estudiante = perso1;
        
    }
}
