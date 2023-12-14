package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejemplo 
{

    
    public static void main(String[] args) 
    {
        

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> name = new ArrayList();
        System.out.println("Ingresa nombresss ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre en la pos[" + i + "]");
            name.add(scanner.nextLine());
        }
        //Imprimimos la primer lista normal 
        System.out.println("Lista primerita");
        System.out.println(name);

        System.out.println("Nuevo nombre en la pos 1");
        name.add(1, scanner.nextLine());
        name.remove(0);
        System.out.println("pos 0 elimina'a " + name);
        System.out.println("Nuevo nombre en la pos 0");
        name.add(0, scanner.nextLine());
        System.out.println("MODIFICA'A: ");
        System.out.println("" + name);
        System.out.println("Nombre de la pos 1: " + name.get(1));
        int ulti = name.size() - 1;
        System.out.println("Ultimo nombre de la lis: " + name.get(ulti));

    

    }
    
}
