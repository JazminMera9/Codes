package Ejercicios;

import java.util.Scanner;


public class PalabraInvertida {

    
    public static String palabraInvertida(String texto) 
    {
              
        StringBuilder textoInvertido = new StringBuilder();
        // Usamos un bucle para invertir el texto
        for (int i = texto.length() - 1; i >= 0; i--) 
        {
            textoInvertido.append(texto.charAt(i));
        }
        return textoInvertido.toString();
    }
     
    //Metodo Main
        public static void main(String[] args) 
    {
     
        Scanner digite = new Scanner(System.in);

        System.out.print("Digite una palabra: ");
        String palabra = digite.nextLine();

        String textoinvertido = palabraInvertida(palabra);

        System.out.println("\nPalabra digitada : " + palabra);
        System.out.println("Palabra invertida : " + textoinvertido);     
    }
}
    

