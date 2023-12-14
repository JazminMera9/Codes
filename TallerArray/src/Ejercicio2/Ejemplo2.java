package Ejercicio2;
                                        //interator 
import java.util.ArrayList;
import java.util.Scanner;


public class Ejemplo2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        //Lista creada de tipo entero 
        ArrayList<Integer> numeros = new ArrayList(); //tipo integer 
        int s; //
        double sum = 0;
        System.out.println("ingrese numeros diferentes, por fa");
        do {
 
            s = scanner.nextInt();
            if (s != 0) {
                numeros.add(s);
                sum = sum + s;
            }
        } while (s != 0); //Finaliza el ciclooo 

        System.out.println("La sum de los num es " + sum);

        //Calcula el promedio en base a la sumatoria total 
        double prom = sum / numeros.size();
        System.out.println("El prom es " + prom);

    }
    
}
