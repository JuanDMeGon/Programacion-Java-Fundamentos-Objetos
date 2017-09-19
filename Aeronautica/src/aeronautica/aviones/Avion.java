/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aeronautica.aviones;

import aeronautica.pilotos.Piloto;

/**
 *
 * @author JuanDMeGon
 */
public class Avion {
    double peso;
    int cantCombustible;
    double alturaDeVuelo;
    final String identificador;   
    Piloto piloto;

    public Avion(double peso, int cantCombustible, double alturaDeVuelo, String identificador)
    {
        this.peso = peso;
        this.cantCombustible = cantCombustible;
        this.alturaDeVuelo = alturaDeVuelo;
        this.identificador = identificador;
    }
    
    double getPeso()
    {
        return peso;
    }
    
    String getIdentificador()
    {
        return identificador;
    }

    public int getCantCombustible()
    {
        return cantCombustible;
    }

    public double getAlturaDeVuelo()
    {
        return alturaDeVuelo;
    }
    
    void setPeso(double peso)
    {
        this.peso = peso;        
    }

    public void setCantCombustible(int cantCombustible)
    {
        this.cantCombustible = cantCombustible;
    }

    public void setAlturaDeVuelo(double alturaDeVuelo)
    {
        this.alturaDeVuelo = alturaDeVuelo;
    }
    
    boolean despegar(int costoCombustible, double alturaMinima)
    {
        this.cantCombustible = this.cantCombustible - costoCombustible;
        this.alturaDeVuelo = this.alturaDeVuelo + alturaMinima;
        
        return this.cantCombustible > 0;
    }
    
    void aterrizar(double pesoABordo)
    {
        this.alturaDeVuelo = 0;
        this.peso = this.peso - pesoABordo;        
    }
    
    void aterrizar(double pesoEquipaje, double pesoPasajeros)
    {
        this.alturaDeVuelo = 0;
        this.peso = this.peso - pesoEquipaje - pesoPasajeros; 
    }
    
    public static void main(String[] args) {
        
        final int ALTURA_MAXIMA = 10000;        
        
        final Avion avion1 = new Avion(35000, 50000, 0, "i15f52gr");
        
        System.out.println(avion1.toString());
        
        boolean despegue = avion1.despegar(50000, ALTURA_MAXIMA);
        System.out.println(despegue);
        
        if(despegue)
        {
            avion1.aterrizar(10000);
        }
    }
}
