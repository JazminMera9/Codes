/*
   14.La función de Ackerman se define como:
Ackerman (m, n) = n + 1 si m = 0
Ackerman (m, n) = Ackerman (m - 1, 1) si m &gt; 0 y n = 0
Ackerman (m, n) = Ackerman (m - 1, Ackerman (m, n - 1)) si m &gt; 0 y n &gt; 0
Ej. Si se tiene Ackermann (1, 2) = 4; Ackermann (3, 2) = 29
Realice un programa para encontrar el valor de la función de Ackerman, para dos valores enteros m, n.
 */
package e14;

import java.util.Scanner;

public class Ejercicio14 
{
    public static void main(String[] args)
    {
        Scanner digite = new Scanner(System.in);
        System.out.print("Introduzca un numero (m): ");
        int m = digite.nextInt();
        System.out.print("Introduzca un numero (n): ");
        int n = digite.nextInt();
        
        System.out.println("Ackerman ("+m+","+n+"): "+ackerman(m, n));
    }
    public static int ackerman (int m, int n)
    {
        if (m==0)   //condicional 
        {
            return n+1;
        }
        if (n==0){
            return ackerman(m-1, 1);
        }
        return ackerman(m-1, ackerman(m, n-1));
    }
    
}
