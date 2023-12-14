// 4)  Leer un numero y  sumar los dígitos de un número. Ejemplo: Entrada: 123 Resultado:6
package e4;
public class Ejercicio4
{
    public static void main(String[] args) 
    {
       java.util.Scanner digite = new java.util.Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = digite.nextInt(); //se lee y almacena 
        
        int suma = sumaDigitos(numero);  //se llama la funcion 
        System.out.println("La suma de los dígitos es: " + suma); //imprime 
    }
    
    public static int sumaDigitos(int n) {
        if (n < 10)  //condicional 
        {
            return n; 
        } else {
            int ultimoDigito = n % 10; //  el último dígito
            int digitosRestantes = n / 10; //  dígitos restantes
            int sumaRestante = sumaDigitos(digitosRestantes); //  suma de los dígitos restantes
            return ultimoDigito + sumaRestante; // Sumamos el último dígito y la suma de los dígitos restantes
        }
    }
    
}
