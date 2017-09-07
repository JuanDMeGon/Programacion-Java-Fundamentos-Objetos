/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanDMeGon
 */
public class AcumuladoresYContadores {
    public static void main(String[] args) {
        
        int cantidad = 10;
        int acumulador = 0;
        for(int i = 0; i < cantidad; i++)
        {
            acumulador = acumulador + 5;
        }
        
        double promedio = acumulador / cantidad;
        
        System.out.println(promedio);
        
    }
}
