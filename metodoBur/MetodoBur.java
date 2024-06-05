package metodoBur;

import java.util.Scanner;
//Proposito: Elaborar un programa que obtenga 10 números aleatorios entre 1 al 100  y los almacene en un arreglo, 
//luego los ordene utilizando en método de la burbuja y los imprima de mayor a menor.

//Link del repositorio: https://github.com/AED1285-FUP-GAEJ24/GHUB.java.EJ2024.UnidadV.JoseAngel

public class MetodoBur{
    public static void metodoBur(){
        int[] numeros = new int[10];
        int n = numeros.length;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 10 números entre 1 y 100:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        System.out.println("");
        System.out.println("Números ingresados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        n = numeros.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (numeros[j] < numeros[j+1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }
            }
        }
        System.out.println("");
        System.out.println("Números ordenados de mayor a menor:");
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            System.out.print(numero + " ");
        }
        System.out.println("");
        teclado.close();
        
    }
}
    


