// 12. Cree una matriz de tamaño mXn y sume los elementos de la matriz.
package e12;
import java.util.Scanner;
public class Ejercicio12 
{
    public static void main(String[] args)
    {
        Scanner digite = new Scanner(System.in);
        System.out.print("Numero de filas de la matriz: ");
        int fila = digite.nextInt();
        System.out.print("Numero de columnas de la matriz: ");
        int columna = digite.nextInt();
        int matriz[][]= new int[fila][columna];
        
        LlenarMatriz(matriz, fila-1, columna-1, 0, 0);
        imprimirMatriz(matriz, 0, 0);
        System.out.println("Sumatoria: "+sumatoriaMatriz(matriz, fila-1, columna-1));
    }
    
    public static void LlenarMatriz(int[][] matriz, int fila, int columna, int i, int j) //llena la matriz con valores ingresado
    { 
        Scanner digite = new Scanner (System.in);
        System.out.print("Digita el numero ["+i+","+j+"]: ");
        matriz[i][j] = digite.nextInt();
        if (j<columna) {
            LlenarMatriz(matriz, fila, columna, i, j+1);
        }else if (j>columna){
            LlenarMatriz(matriz, fila, columna, i+1, 0);
        }else{
            if (i==fila) {
                
            }else{
                LlenarMatriz(matriz, fila, columna, i+1, 0);
            }
        }
    }
    public static int sumatoriaMatriz(int[][] matriz, int fila, int columna) // calcula la suma de los elementos de la matriz
    {
        if ((fila == 0) && (columna == 0)) {
            return matriz [fila][columna];
        }else{
            if (fila>-1) {
                columna--;
                if (columna>=-1) {
                    return matriz[fila][columna+1]+sumatoriaMatriz(matriz, fila, columna);
                }else{
                    return sumatoriaMatriz(matriz, fila-1, 2);
                }
            }else{
                return 0;
            }
        }
    }
    public static void imprimirMatriz(int matriz[][], int i,int j)  //imprime la matriz 
    {
        if(i<matriz.length){
            System.out.print("| "+matriz[i][j]+" ");
            j++;
            if(j>=matriz[0].length){
                System.out.println("|");
                i=i+1;
                j=0;
            }
            imprimirMatriz(matriz, i,j);
        }

    }
}    
