/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanDMeGon
 */
public class Avion {
    double peso;
    int cantCombustible;
    double alturaDeVuelo;
    String identificador;      

    public Avion(double peso, int cantCombustible, double alturaDeVuelo, String identificador) {
        this.peso = peso;
        this.cantCombustible = cantCombustible;
        this.alturaDeVuelo = alturaDeVuelo;
        this.identificador = identificador;
    }
    
    boolean despegar()
    {
        this.cantCombustible = this.cantCombustible - 10;
        this.alturaDeVuelo = this.alturaDeVuelo + 10000;
        
        return this.cantCombustible > 0;
    }
    
    public static void main(String[] args) {
        Avion avion1 = new Avion(35000, 50000, 0, "i15f52gr");
    }
    
    
    
    
}
