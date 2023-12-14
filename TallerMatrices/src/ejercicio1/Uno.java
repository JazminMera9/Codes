/*
 Inicializar una matriz de m filas por n columnas 
 rellenar con números aleatorios,
además lea un entero y determine si se encuentra la matriz y en que posición. Si no
se encuentra imprima el mensaje correspondiente. Solo se debe imprimir la primera
ocurrencia del número si se encuentra.
 */
package ejercicio1;
import java.util.Random;
public class Uno 
{
    public static void main(String[] args)
    {
       int m = 4; // Número de filas
        int n = 5; // Número de columnas
        int[][] matriz = new int[m][n];
        Random rand = new Random();

        //  números aleatorios
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(50); //  valores aleatorios 
            }
        }

        // Imprimir la matriz
        System.out.println("Matriz:");
        imprimirMatriz(matriz);

        // Leer un entero para buscar en la matriz
        int numeroBuscado = 25; // este es el numero que buscamos

        // Buscamos el número en la matriz
        boolean encontrado = false;
        int filaEncontrada = -1;
        int columnaEncontrada = -1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == numeroBuscado) {
                    encontrado = true;
                    filaEncontrada = i;
                    columnaEncontrada = j;
                    break; // Salir  si se encuentra 
                }
            }
            if (encontrado) {
                break; 
            }
        }

        // Imprimir resultado
        if (encontrado) {
            System.out.println("El número " + numeroBuscado + " se encuentra en la fila " + (filaEncontrada+1) + ", columna " + (columnaEncontrada+1));
        } else {
            System.out.println("El número " + numeroBuscado + " no se enconto en la matriz.");
        }
    }

    //  imprimimos una matriz
    public static void imprimirMatriz(int[][] matriz) {
        int m = matriz.length;
        int n = matriz[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
