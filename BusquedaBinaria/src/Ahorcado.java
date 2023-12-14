import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {
        // Arreglo de colores  
        String[] colores = {"rojo", "azul", "verde", "amarillo", "blanco", "negro"};

        // Selecciona un color de maneera aleatoria del arreglo.
        Random aleatorio = new Random();
        String colorAdivinar = colores[aleatorio.nextInt(colores.length)];

        // Arreglo para rastrear las letras adivinadas y ocultas.
        char[] colorOculto = new char[colorAdivinar.length()];
        for (int i = 0; i < colorOculto.length; i++) {
            colorOculto[i] = '_';
        }

        // cantidad de intentos 
        int intentosMaximos = 5;
        int intentos = 0;

        // Inicializacion de variables.
        boolean colorAdivinado = false;
        Scanner digite = new Scanner(System.in);

        System.out.println("BIENVENIDO AL JUEGO DEL AHORCADO");
        System.out.println("Tienes 5 intentos para adivinar un color.");

        while (intentos < intentosMaximos && !colorAdivinado) {
            System.out.println("Color: " + String.valueOf(colorOculto));

            System.out.print("Digite una letra: ");
            char letra = digite.next().charAt(0);

            boolean letraAdivinada = false;

            for (int i = 0; i < colorAdivinar.length(); i++) {
                if (colorAdivinar.charAt(i) == letra) {
                    colorOculto[i] = letra;
                    letraAdivinada = true;
                }
            }

            if (!letraAdivinada)   {
                intentos++;
                System.out.println("Letra incorrecta. Intentos restantes: " + (intentosMaximos - intentos));
            }

            colorAdivinado = String.valueOf(colorOculto).equals(colorAdivinar);
        }

        if (colorAdivinado) 
        {
            System.out.println("GANASTE, Has adivinado el color: " + colorAdivinar);
        } else {
            System.out.println("PERDISTE, El color era: " + colorAdivinar);
        }
    }
}
