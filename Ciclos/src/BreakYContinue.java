/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanDMeGon
 */
public class BreakYContinue {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            System.out.println(i + ":\tAntes");
            
            if(i%3 == 0) {
                // break;
                // continue;
            }
            
            System.out.println(i + ":\tDespués");
        }
        
        System.out.println("Al final");
    }
}
