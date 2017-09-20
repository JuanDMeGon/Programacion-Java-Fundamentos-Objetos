/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeronautica.aviones;

/**
 *
 * @author JuanDMeGon
 */
public class AvionDeCarga extends Avion {
    
    private double capacidadDeCarga;
    
    public AvionDeCarga(double peso, int cantCombustible, double alturaDeVuelo, String identificador)
    {
        super(peso, cantCombustible, alturaDeVuelo, identificador);   
    }
}
