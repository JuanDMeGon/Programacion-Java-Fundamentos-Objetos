/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanDMeGon
 */

/*
 * ! Negación
 * == Comparación de igualdad
 * ¡= Comparación de diferencia (No igual)
 * > Mayor estricto
 * < Menor estricto
 * >= Mayor o igual
 * <= Menor o igual
 * && Operación lógica Y
 * || Operación lógica O
*/

public class OperacionesLogicas {
    public static void main(String args[]) {
        int primerNumero = 1;
        int segundoNumero = 2;
        int tercerNumero = 3;
        
        String primerTexto = "hola";
        String segundoTexto = "hola";
        
        boolean operacion;
        
        operacion = primerTexto == segundoTexto;
        
        System.out.println(operacion);
    }
}
