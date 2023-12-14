/* 7.Leer dos números enteros y calcular el máximo común divisor (M.C.D.),
de dos números enteros (M, N)n utilizando el algoritmo de Euclides.
Si M &gt;= N una función recursiva para MCD es
MCD = M si N =0
MCD = MCD (N, M % N) si N &lt;&gt; 0
 */
package e7;

import java.util.Scanner;

public class Ejercicio7
{   
    public static void main(String[] args) 
    {
        Scanner digite = new Scanner(System.in);// entrada de una cadena
        System.out.print("teclee el numero1: ");
        int M = digite.nextInt();
        System.out.print("teclee el numero2: ");
        int N = digite.nextInt();
        
        System.out.println("MCD: "+mcd(M, N)); //mcd de los numeros digitados
    }
    public static int mcd(int M, int N){
        if(N==0){
            return M;
        }else{
            return mcd(N, M%N);
        }
    }
    
}
