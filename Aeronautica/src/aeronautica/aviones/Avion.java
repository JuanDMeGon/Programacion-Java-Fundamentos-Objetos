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
public class Avion {
    double peso;
    int cantCombustible;
    double alturaDeVuelo;
    String identificador;      

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
    
    void setIdentificador(String identificador)
    {
        this.identificador = identificador;        
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
    
    void atterizar(double pesoABordo)
    {
        this.alturaDeVuelo = 0;
        this.peso = this.peso - pesoABordo;        
    }
    
    public static void main(String[] args) {
        Avion avion1 = new Avion(35000, 50000, 0, "i15f52gr");
        
        boolean despegue = avion1.despegar(50000, 15000);
        System.out.println(despegue);
        
        if(despegue)
        {
            avion1.atterizar(10000);
        }
    }
}
