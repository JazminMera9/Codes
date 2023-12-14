/*
  Lea 15 numeros enteros por teclado , almacenelos en un arrelgo y encuentre: 
el numero menor del arreglo, el numero mayor del arreglo, la factorial de cada uno 
de los elementos que se debe imprimir en un nuevo arreglo 
 */
package Punto2;

import java.util.Scanner;

public class P2 {

        // Función para calcular el factorial de un número
        public static long factorial(int number)
        {
            if (number == 0 || number == 1) {
                return 1;
            } else {
                return number * factorial(number - 1);
            }
        }

        public static void main(String[] args) 
        {
            Scanner scanner = new Scanner(System.in);

            // Declarar un arreglo para almacenar los números
            int[] numeros = new int[15];

            // Leer 15 números enteros
            for (int numeroEntero = 0; numeroEntero < 15; numeroEntero++) 
            {
                System.out.print("Ingrese un número entero: ");
                numeros[numeroEntero] = scanner.nextInt();
            }

                // Encontrar el número menor y el número mayor
                int numeroMenor = numeros[0];
                int numeroMayor = numeros[0];

                for (int numeroEntero = 1; numeroEntero < 15; numeroEntero++) {
                    if (numeros[numeroEntero] < numeroMenor)
                    {
                        numeroMenor = numeros[numeroEntero];
                    }
                    if (numeros[numeroEntero] > numeroMayor)
                    {
                        numeroMayor = numeros[numeroEntero];
                    }
            }

            // Calcular los factoriales y almacenarlos en un nuevo arreglo
            long[] factoriales = new long[15];

            for (int numeroEntero = 0; numeroEntero < 15; numeroEntero++) 
            {
                factoriales[numeroEntero] = factorial(numeros[numeroEntero]);
            }

                // Imprime el numero mayor, menor y los facotriales 
                
                System.out.println("El número menor es: " + numeroMenor);
                System.out.println("El número mayor es: " + numeroMayor);
                System.out.println("Factoriales de los números: ");
               
                for (int numeroEntero = 0; numeroEntero < 15; numeroEntero++) {
                    System.out.println(numeros[numeroEntero] + "! = " + factoriales[numeroEntero]);
            }
        }
}

        
    
    

