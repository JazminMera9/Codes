
import java.util.Scanner;

public class AdivinaNumero 
{
    public static void main(String[] args) {
        //generamos el numero aleatoriamente 
        int randomNumber = (int) (Math.random() * 100) + 1;
        int adivina;
        Scanner input = new Scanner(System.in);
        // el limite del numero que debemos adivinar 
        int menor = 1;
        int mayor = 100;
        int mitad = (menor + mayor) / 2;
        // son los intentos en que podemos adivinar el numero 
        for (int i = 1; i <= 7; i++) {
            System.out.print("Adivina un número entre " + menor + " y " + mayor + ": ");
            adivina = input.nextInt();

            if (adivina < mitad) {
                System.out.println("El número es mayor.");
                menor = mitad + 1;
            } else if (adivina > mitad) {
                System.out.println("El número es menor.");
                mayor = mitad - 1;
            } else {
                System.out.println("¡Correcto! Adivinaste el número en el intento " + i + ".");
                return;
            }
            // calcula la nueva mitad del rango 
            mitad = (menor + mayor) / 2;
        }

        System.out.println("Lo siento, no adivinaste el número. Era " + randomNumber + ".");
    }
}

    
    

