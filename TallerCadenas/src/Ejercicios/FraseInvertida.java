
package Ejercicios;

import java.util.Scanner;


public class FraseInvertida 
{

  
    public static String invertirTexto(String texto)
    {
       // Bucle para invertir el texto
        StringBuilder textoInvertido = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) 
        {
            textoInvertido.append(texto.charAt(i));
        }
        return textoInvertido.toString();
    }
    
    public static void main(String[] args) 
    {
        Scanner digite = new Scanner(System.in);

        System.out.print("Digita una frase : ");
        String frase = digite.nextLine();

        // Elimina los espacios en blanco de la frase
        String fraseSinEspacios = frase.replaceAll(" ", "");

        // Realizar inversión de letras en la frase
        String fraseInvertida = invertirTexto(fraseSinEspacios);

        System.out.println("\nFrase digitada:    " + frase);
        System.out.println("Frase sin espacios: " + fraseSinEspacios);
        System.out.println("Frase invertida:    " + fraseInvertida);

       
    }
    
    
}
