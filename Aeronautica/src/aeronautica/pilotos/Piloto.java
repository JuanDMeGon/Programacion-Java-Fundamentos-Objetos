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
    private String nombre;
    private int edad;
    private String identificacion;
    
    public final String comunicarse(String mensaje)
    {
        System.out.println("padre" + mensaje);
        
        return mensaje;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public int getEdad()
    {
        return this.edad;
    }
}
