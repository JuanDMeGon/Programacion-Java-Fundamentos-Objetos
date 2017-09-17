/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeronautica.aeropuertos;

import aeronautica.aviones.Avion;

/**
 *
 * @author JuanDMeGon
 */
public class Aeropuerto {
    Avion[] aviones;
    
    Aeropuerto(Avion[] aviones)
    {
        this.aviones = aviones;
    }
    
    Aeropuerto(Avion avion)
    {
        this.aviones = new Avion[50];
        
        this.aviones[0] = avion;
    }
    
    Aeropuerto(Avion avion, int cantidad)
    {
        this.aviones = new Avion[cantidad];
        
        this.aviones[0] = avion;
    }
    
    Aeropuerto(int cantidad)
    {
        this.aviones = new Avion[cantidad];
    }
}
