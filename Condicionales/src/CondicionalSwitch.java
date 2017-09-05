/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanDMeGon
 */
public class CondicionalSwitch {
    public static void main(String[] args) {
        int opcion = 2;
        
        switch(opcion)
        {
            case 1:
                System.out.println("Elegiste la Opción 1");
            break;
            
            case 2:
                System.out.println("Elegiste la Opción 2");
            break;
            
            default:
                System.out.println("Opción Incorrecta");
            break;
        }
    }
}
