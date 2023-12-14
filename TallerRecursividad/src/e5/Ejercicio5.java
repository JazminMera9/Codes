//5. Leer  un número entero y  calcular la sumatoria hasta el  numero leído.
package e5;
public class Ejercicio5
{
    public static void main(String[] args)
    {
       java.util.Scanner digite = new java.util.Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = digite.nextInt(); //lee el numero 
        
        int sumatoria = calcularSumatoria(numero);
        System.out.println("La sumatoria hasta " + numero + " es " + sumatoria);
    }

    public static int calcularSumatoria(int n) // un entero n, es el número hasta el cual deseamos calcular la sumatoria 
    {
        if (n == 1)
        {
            return 1; // Caso base: la sumatoria de 1 es 1
        } else {
            return n + calcularSumatoria(n - 1); 
        }
    }
    
}
