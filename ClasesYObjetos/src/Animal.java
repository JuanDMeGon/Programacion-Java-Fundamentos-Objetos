/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanDMeGon
 */
public class Animal {
    String nombre;
    float peso;
    String raza;
    
    Animal(String nombre, float peso, String raza)
    {
        this.nombre = nombre;
        this.peso = peso + 10;
        this.raza = raza;
    }
    
    public static void main(String[] args) {
        Animal animal1;
        
        animal1 = new Animal("Juan", 1.5f, "bulldog");
        
        Animal animal2 = new Animal("Pepe", 2, "bulldog");
        
        System.out.println(animal1.nombre);
        System.out.println(animal2.nombre);
    }
}
