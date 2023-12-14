/*
 Inicializar una matriz de m por n y encuentre su transpuesta.
Imprima la matriz inicial
 y la transpuesta. Ingresar los valores de manera predeterminada
 */
package ejercicio4;

public class Cuatro
{   
    public static void main(String[] args)
    {
       // Colocamos el tamaño de la matriz
        int m = 4; // Número de filas
        int n = 5; // Número de columnas
        
        // Inicializar la matriz 
        int[][] matriz = {
            {14, 16, 0, 9, 8},
            {5, 2, 1, 10, 16},
            {9, 12, 3, 7, 11},
            {13, 20, 6, 4, 15 }
        };

        // Imprimimos la matriz original
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        // Encontramos la transpuesta
        int[][] transpuesta = encontrarTranspuesta(matriz);

        // Imprimir la matriz transpuesta
        System.out.println("\nMatriz transpuesta:");
        imprimirMatriz(transpuesta);
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

    // Método para encontrar la transpuesta de una matriz
    public static int[][] encontrarTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        return transpuesta;
    }
    
}
