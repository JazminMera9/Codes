//1.Leer un numero entero y n calcular la factorial de dicho numero.
package e1;
public class ejercicio1 
{
    public static void main(String[] args) 
    {
       java.util.Scanner digite = new java.util.Scanner(System.in);
        System.out.print("Ingresa un número entero: ");  //pedimos que ingrese un numero 
        int numero = digite.nextInt();   //lee el numero y lo almacena
        
        long factorial = calcularFactorial(numero); //se llama la funcion
        System.out.println("El factorial de " + numero + " es " + factorial);
    }

    public static long calcularFactorial(int n) //aqui se define para calcular 
    {
        if (n == 0)  //condicional 
        {
            return 1; // Caso base: el factorial de 0 es 1
        } else {
            return n * calcularFactorial(n - 1); 
        }
    }  
}
