/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanDMeGon
 */
public class CondicionalIfElse {
    public static void main(String args[]) {
        int edad = 40;
        
        if (edad >= 18 && edad < 35) {
            System.out.println("Eres mayor de edad y eres joven");          
        }
        else {
            System.out.println("Eres menor de edad o no eres joven");          
        } 
    }
}
