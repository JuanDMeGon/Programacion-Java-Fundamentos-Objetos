/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanDMeGon
 */
public class CicloWhile {
    public static void main(String[] args) {
        
        int control = 100;
        while(control > 0)
        {
            System.out.println("Dentro del ciclo: " + control);
            control = (control + 1) - (control * 5) + (control / 2);
        }
        
        System.out.println("Finalizó el ciclo");
    }
}
