/*
 Inicializar una matriz de n por n, 
rellenar con números aleatorios y determinar si es simétrica o no, imprima los números de las esquinas.
 */
package ejercicio3;
import java.util.Random;
public class Tres 
{
      public static void main(String[] args)
    {
        int n = 5; // n es el tamaño deseado de la matriz cuadrada

        // matriz con números aleatorios la inicializamos y rellenamos
        int[][] matriz = new int[n][n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(50); //  valores aleatorios hasta al 49
            }
        }
        // Imprimimos la matriz
        System.out.println("Matriz:");
        imprimirMatriz(matriz);

        // Verificamos si la matriz es simétrica
        boolean esSimetrica = esMatrizSimetrica(matriz);

        if (esSimetrica) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz no es simétrica.");
        }

        // Imprimir los números de las esquinas
        System.out.println("Esquinas:");
        System.out.println("Esquina superior izquierda: " + matriz[0][0]);
        System.out.println("Esquina superior derecha: " + matriz[0][n - 1]);
        System.out.println("Esquina inferior izquierda: " + matriz[n - 1][0]);
        System.out.println("Esquina inferior derecha: " + matriz[n - 1][n - 1]);
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Método para verificar si una matriz es simétrica
    public static boolean esMatrizSimetrica(int[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }
    
    
}
