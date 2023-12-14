// 8. Realizar un programa que permita copiar una cadena en otra.
package e8;

public class Ejercicio8 
{
    public static void main(String[] args)
    {
        java.util.Scanner digite  = new java.util.Scanner(System.in);
        System.out.print("Ingresa una cadena: "); //solicitamos que ingrese una cadena
        String cadenaBase = digite.nextLine();  //se lee y se almacena 
        
        String cadenaCopiada = copiarCadena(cadenaBase);
        System.out.println("Cadena copiada: " + cadenaCopiada); //imprime la cadena copia
    }

    public static String copiarCadena(String original) 
    {
        String copia = original.substring(0); // el substring que es para copiar la cadena
        return copia;
    }
}

    
    

