/*
  Inicializar una matriz de tamaño n por n rellenar con números aleatorios entre 1 y 50
  y calcular la sumatoria de los elementos de la diagonal opuesta a la principal.
 */
package ejercicio2;

import java.util.Random;

public class Dos
{
    public static void main(String[] args) 
    {
        
        int n = 3; // n es el tamaño
        int[][] matriz = new int[n][n];
        Random rand = new Random();

        //  números aleatorios entre 1 y 50
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(50) + 1; //  valores aleatorios entre 1 y 50
            }
        }
        // Imprimir la matriz
        System.out.println("Matriz:");
        imprimirMatriz(matriz);

        // sumatoria de la diagonal opuesta a la principal
        int sumatoriaDiagonalOpuesta = calcularSumatoriaDiagonalOpuesta(matriz);

        System.out.println("Sumatoria de la diagonal opuesta: " + sumatoriaDiagonalOpuesta);
    }

    // imprimimos la matriz
    public static void imprimirMatriz(int[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //  calcular la sumatoria de la diagonal opuesta a la principal
    public static int calcularSumatoriaDiagonalOpuesta(int[][] matriz) {
        int n = matriz.length;
        int sumatoria = 0;

        for (int i = 0; i < n; i++)
        {
            sumatoria += matriz[i][n - 1 - i]; // Sumar los elementos de la diagonal opuesta
        }

        return sumatoria;
    }
}
