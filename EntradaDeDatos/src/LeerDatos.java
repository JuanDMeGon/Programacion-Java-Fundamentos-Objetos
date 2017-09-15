import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanDMeGon
 */
public class LeerDatos {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese su edad");
        int edad = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Por favor, ingrese su nombre");
        String nombre = sc.nextLine();
        
        System.out.println(nombre + " en 10 años tendrá " + (edad + 10) + " años");
        
    }
}
