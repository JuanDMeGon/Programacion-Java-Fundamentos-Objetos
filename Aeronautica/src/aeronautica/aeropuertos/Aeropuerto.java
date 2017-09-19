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
    static int cantAviones;
    
    Aeropuerto(Avion[] aviones)
    {
        this.aviones = aviones;
        cantAviones = aviones.length;
    }
    
    Aeropuerto(Avion avion)
    {
        this.aviones = new Avion[50];
        
        this.aviones[0] = avion;
        cantAviones = 1;
    }
    
    Aeropuerto(Avion avion, int cantidad)
    {
        this.aviones = new Avion[cantidad];
        
        this.aviones[0] = avion;
        cantAviones = 1;
    }
    
    Aeropuerto(int cantidad)
    {
        this.aviones = new Avion[cantidad];
        cantAviones = 0;
    }
    
    final Avion[] agregarAvion(Avion avion)
    {
        return this.aviones;
    }
    
    public static void main(String[] args) {
        Avion avion1 = new Avion(35000, 50000, 0, "i15f52gr");
        Aeropuerto b = new Aeropuerto(avion1, 10);
        
        Aeropuerto a = new Aeropuerto(10);
        
        System.out.println(cantAviones);
        
        
    }
}
