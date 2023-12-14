// 2) Leer un número entero e invertirlo. Ejemplo: Entrada: 123 Salida: 321
package e2;
public class Ejercicio2
{
    public static void main(String[] args) 
    {
         java.util.Scanner digite = new java.util.Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = digite.nextInt();  //lee el numero
        
        int numeroInvertido = invertirNumero(numero); //se llama la funcion que es para invertir el numero 
        System.out.println("Número invertido: " + numeroInvertido); //imprime el numero invertido 
    } 
    public static int invertirNumero(int n) 
    {
        if (n < 10) {
            return n; //  el número invertido es el mismo cuando hay solo un digito 
        } else {
            int ultimoDigito = n % 10;
            int digitosRestantes = n / 10;
            int numeroInvertido = invertirNumero(digitosRestantes);
            return ultimoDigito * (int) Math.pow(10, (int) Math.log10(digitosRestantes) + 1) + numeroInvertido;
        }
    }
    
}
