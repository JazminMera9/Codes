//10. Leer 2 números enteros y realizar la multiplicación de los 2 números mediante sumas sucesivas.
package e10;
public class Ejercicio10
{
    public static void main(String[] args) 
    {
        java.util.Scanner digite = new java.util.Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero1 = digite.nextInt();
        System.out.print("Ingresa otro número: ");
        int numero2 = digite.nextInt();
        
        int resultado = multiplicacion(numero1, numero2);
        System.out.println("El resultado es: " + resultado);
    }

    public static int multiplicacion(int numero1, int numero2) {
        if (numero2 == 0) 
        {
            return 0;  // un número multiplicado por 0 es 0
        } else if (numero2 > 0) 
        {
            return numero1 + multiplicacion(numero1, numero2 - 1);
        } else {
            return -multiplicacion(numero1, -numero2);
        }
    }
    
}
