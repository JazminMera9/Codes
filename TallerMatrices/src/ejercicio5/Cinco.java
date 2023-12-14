/*
   Inicializar una matriz de m filas * n columnas 
   (cargar n y m por teclado y rellenar con aleatorios) 
   Intercambiar la primera fila con la segunda. Imprimir luego la matriz.
 */
package ejercicio5;

import java.util.Random;
import java.util.Scanner;

public class Cinco 
{

    public static void main(String[] args) 
    {
      
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Dgitamos el número de filas (m) y columnas (n)
        System.out.print("Digite el número de filas (m): ");
        int m = scanner.nextInt();

        System.out.print("Digite el número de columnas (n): ");
        int n = scanner.nextInt();

        // La matriz se inicializa y rellena con numeros aleatorios
        int[][] matriz = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(100); // Rellenar con numeros aleatorios del 0 al 99
            }
        }

        // Imprimimos la matriz original o matriz base
        System.out.println("Matriz base:");
        imprimirMatriz(matriz);

        // Intercambiamos la primera fila con la segunda fila
        if (m >= 2) {
            int[] temp = matriz[0];
            matriz[0] = matriz[1];
            matriz[1] = temp;
        }

        // Imprimimos la matriz después del intercambio
        System.out.println("\nNueva matriz :");
        imprimirMatriz(matriz);
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
