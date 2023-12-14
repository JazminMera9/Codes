//6. Leer un numero llamado base y otro exponente y calcular la potencia elevando la base al exponente.
package e6;
public class Ejercicio6 
{
    public static void main(String[] args) 
    {
       java.util.Scanner digite = new java.util.Scanner(System.in);
        System.out.print("Ingresa la base: ");  //pedimos que ingrse el numero base 
        int base = digite.nextInt();    //se lee y almacena 
        System.out.print("Ingresa el exponente: "); //pedimos que ingrese el expo 
        int exponente = digite.nextInt();
        
        long resultado = calcularPotencia(base, exponente);
        System.out.println("El resultado de " + base + " elevado a la " + exponente + " es " + resultado);  //imprime el resul
    }

    public static long calcularPotencia(int base, int exponente) 
    {
        if (exponente == 0) //condicional 
        {
            return 1; // un número elevado a 0 es 1
        } else {
            return base * calcularPotencia(base, exponente - 1); 
        }
    }
    
}
