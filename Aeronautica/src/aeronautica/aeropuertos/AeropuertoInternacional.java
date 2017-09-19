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
public class AeropuertoInternacional extends Aeropuerto {
    
    public AeropuertoInternacional(Avion[] aviones)
    {
        super(aviones);
    }
    
    public AeropuertoInternacional(Avion avion)
    {
        super(avion);
    }
    
    public AeropuertoInternacional(Avion avion, int cantidad)
    {
        super(avion, cantidad);
    }
    
    public AeropuertoInternacional(int cantidad)
    {
        super(cantidad);
    }
}
