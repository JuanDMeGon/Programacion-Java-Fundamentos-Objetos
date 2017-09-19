/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeronautica.pilotos;

/**
 *
 * @author JuanDMeGon
 */
public class PilotoComercial extends Piloto {
    
    public static void main(String[] args) {
        PilotoComercial p = new PilotoComercial();
        
        p.nombre = "Juan";
        
        System.out.println(p.saludarPasajeros());
    }
    
    String saludarPasajeros()
    {
        return super.comunicarse("Bienvenidos pasajeros");
    }
    
    String despedirPasajeros()
    {
        return this.comunicarse("gracias por usar nuestra aerolínea");
    }
}
