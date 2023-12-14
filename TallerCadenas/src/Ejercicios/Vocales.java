package Ejercicios;

import java.util.Scanner;


public class Vocales 
{

    
    public static int Vocales(String frase)
    {
        // Convertir la frase a minúsculas 
        frase = frase.toLowerCase();

        int contador = 0;
        for (int i = 0; i < frase.length(); i++) 
        {
            char caracter = frase.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') 
            {
                contador++;
            }
        }
        return contador;
    }
    
    public static void main(String[] args) 
    {
        Scanner digite = new Scanner(System.in);
        //digitamos una frase 
        System.out.print("Ingresa una frase: ");
        String frase = digite.nextLine();

        int contadorVocales = Vocales(frase);
        // cuenta las vocales en la frase 
        System.out.println("Numero de vocales en la frase: " + contadorVocales);
    }
    
    
}
