// 9. Leer 2 números enteros y calcular el cociente de la división entera. 
//   (sugerencia: use restas sucesivas)
package e9;
public class Ejercicio9
{
    public static void main(String[] args)
    {
       java.util.Scanner digite = new java.util.Scanner(System.in);
        System.out.print("Ingresa el dividendo: ");   // pedimos que ingrese el numero a dividir 
        int dividendo = digite.nextInt();
        System.out.print("Ingresa el divisor: ");
        int divisor = digite.nextInt();

        if (divisor == 0)  //condicional 
        {
            System.out.println(" No se puede dividir por cero");
        } else {
            int cociente = calcularCocienteDivision(dividendo, divisor); //se llama la funcion 
            System.out.println("El cociente de la división es: " + cociente);
        }
    }
    public static int calcularCocienteDivision(int dividendo, int divisor) 
    {
        if (divisor == 0) {
            System.out.println(" No se puede dividir por cero.");
            System.exit(1); // Se sale del programa 
        }

        boolean esNegativo = (dividendo < 0) ^ (divisor < 0);
        dividendo = Math.abs(dividendo);
        divisor = Math.abs(divisor);

        return calcularCocienteRecursivo(dividendo, divisor, esNegativo);
    }
    public static int calcularCocienteRecursivo(int dividendo, int divisor, boolean Negativo)
    {
        if (dividendo < divisor) {
            return 0;
        }
        int cociente = 1 + calcularCocienteRecursivo(dividendo - divisor, divisor, Negativo);
        return Negativo ? -cociente : cociente;
    } 
}
