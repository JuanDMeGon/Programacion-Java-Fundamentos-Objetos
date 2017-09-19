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
public class Piloto {
    String nombre;
    int edad;
    String identificacion;
    
    final String comunicarse(String mensaje)
    {
        System.out.println("padre" + mensaje);
        
        return mensaje;
    }
}
