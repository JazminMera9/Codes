/*
 13. La serie de Fibonacci puede definirse en términos recursivos así:
(1) Fib(1) = 1 ; Fib(0) = 0
(2) Fib(n) = Fib(n-1) + Fib(n-2) si n &gt;= 2.
Lea un valor entero que representa el límite de la serie e imprima hasta el valor limite.
 */
package e13;

import java.util.Scanner;
public class Ejercicio13 
{
    public static void main(String[] args)
    {
         Scanner digite = new Scanner(System.in);
        System.out.print("escriba el limite: ");
        int limite= digite.nextInt();
        
        fibonacci(limite, 0, 0, 1);
        
    }
    public static void fibonacci(int lim, int aux, int a, int b)
    {
        if (a+b>lim) 
        { 
            System.out.println("_____[Fin]_____");
        }else{ 
            aux = a;
            a = b;
            b = aux + a;
            System.out.println(b);
            fibonacci(lim, aux, a, b);
        }

    }
    
}
