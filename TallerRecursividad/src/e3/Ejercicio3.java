//3.Leer un valor entero y calcular la sumatoria  1 + ½ +1/3+  … 1/n.
package e3;
import java.util.Scanner;
public class Ejercicio3
{
    public static void main(String[] args) 
    {
        Scanner digite = new Scanner(System.in);// entrada de una cadena
        System.out.print("Escribe un numero: ");
        int num = digite.nextInt();

        System.out.println("La Sumatoria es: " + Sumatoria(num)); //imprimimos el resultado
    }
public static double Sumatoria(int num) {
        double sum;
        if (num == 0) //condicional 
        {
            return 0; //Aqui nos retorna cero
        } else {
            sum = (double) 1 / num + Sumatoria(num - 1);
        }
        return sum;

    }
    
}
