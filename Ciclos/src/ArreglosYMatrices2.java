/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanDMeGon
 */
public class ArreglosYMatrices2 {
    public static void main(String args[]) {
        int[] arreglo = {10, 15, 30, 45, 90};
        int arreglo2[] = {1,2,3,4,5,6};
        int[][] matriz = {{500,1000,4545,44},{454,454,22},{30,31},{4},{5},{6}};
        int matriz2[][] = {{10,11,12,13},{20,21,22},{30,31},{4},{5},{6}};
        
        for (int k = 0; k < arreglo.length ; k++)
        {
            System.out.println(arreglo[k]);
            System.out.println(arreglo2[k]);
        } 
        
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length ; j++)
            {
                System.out.println(matriz[i][j]);
                System.out.println(matriz2[i][j]);
            }            
        }
        
        
    }
}
