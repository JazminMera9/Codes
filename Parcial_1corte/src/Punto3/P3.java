/*
 Pedir por teclado n cantidad de numeros almacenarlos y sacar de ellos 
   los numeros pares, los numeros impares y los numeros primos, imprimir los resultados 
 */
package Punto3;

import java.util.Scanner;


public class P3
{
    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) 
    {
        if (numero <= 1) 
        {
            return false;
        }
        for (int n = 2; n <= Math.sqrt(numero); n++) {
            if (numero % n == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Ingrese la cantidad de números que quiere digitar
        System.out.print("Ingrese la cantidad de numeros que quiere almacenar: ");
        int number = scanner.nextInt();

        //  arreglo para almacenar los números
        int[] numeros = new int[number];

        // Leer los números y almacenarlos en el arreglo
        for (int n = 0; n < number; n++) 
        {
            System.out.print("Ingrese un número: ");
            numeros[n] = scanner.nextInt();
        }

        // Muestra los números pares
        System.out.println("Numeros pares:");
        for (int digito : numeros) 
        {
            if (digito % 2 == 0) 
            {
                System.out.print(digito + " ");
            }
        }
        //Muestra los numeros impares 

        System.out.println("\nNumeros impares: ");
        for (int digito : numeros)
        {
            if (digito % 2 != 0) 
            {
                System.out.print(digito + " ");
            }
        }
        //Muestra los numeros primos 
        System.out.println("\nNumeros primos: ");
        for (int digito : numeros) 
        {
            if (esPrimo(digito)) 
            {
                System.out.print(digito + " ");
            }
        }
    }
}

        
    
    

