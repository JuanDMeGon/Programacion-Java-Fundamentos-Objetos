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
public class AeropuertoLocal extends Aeropuerto {
    
    public AeropuertoLocal(Avion[] aviones)
    {
        super(aviones);
    }
    
    public AeropuertoLocal(Avion avion)
    {
        super(avion);
    }
    
    public AeropuertoLocal(Avion avion, int cantidad)
    {
        super(avion, cantidad);
    }
    
    public AeropuertoLocal(int cantidad)
    {
        super(cantidad);
    }
}
