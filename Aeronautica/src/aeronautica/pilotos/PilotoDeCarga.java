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
public class PilotoDeCarga extends Piloto {
    
    public static void main(String[] args) {
        PilotoDeCarga p = new PilotoDeCarga();
        
        System.out.println(p.nombre);
        System.out.println(p.edad);
    }
    
    String saludarTripulacion()
    {
        return this.comunicarse("Gracias por estar a bordo");
    }
}
