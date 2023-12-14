
package Ejercicios;
public class DosStrings 
{

    public static void main(String[] args)
    {
       String cadena1 = "cadena1";
        String cadena2 = "CADENA2";
        //imprimimos la dos cadenas
        System.out.println("IMPRIMIMOS LA CADENAS 1 Y LA CADENA 2");
        System.out.println(cadena1 + ", " + cadena2);

        System.out.println("NOS DARA LA POSICION 6 de la cadena 1");
        System.out.println(cadena1.charAt(6));
        System.out.println("LONGITUD DE LAS CADENAS");
        System.out.println("AQUI TENEMOS LA LONGITUD DE LA CADENA1: " + cadena1.length() + " longitud de la cadena 2: " + cadena2.length());
        System.out.println("Primer ocurrencia de e en la cadena1");
        System.out.println(cadena1.indexOf("e"));
        System.out.println("ULTIMA OCURRECNIA EN LA CADEA 2 (E)");
        System.out.println(cadena2.lastIndexOf("E"));
        //Aqui nos da en MAYUSCULA y en  minusculas
        System.out.println("CADENA 1 en MAYUSCULAS");
        System.out.println(cadena1.toUpperCase());
        System.out.println("CADENA 2 en minusculas");
        System.out.println(cadena2.toLowerCase());
        System.out.println("COMPARARA LA CADENA 1 Y LA CADENA 2");
        System.out.println(cadena1.equals(cadena2));
        System.out.println("Comparamos las cadenas con un ignorecase");
        System.out.println(cadena1.equalsIgnoreCase(cadena2));
        //Concatenamos las dos cadenas
        System.out.println("CADENA 1 Y 2, DE MANERA JUNTAS ");
        System.out.println(cadena1 + cadena2);
        //Reemplazamos
        System.out.println(cadena1.replace("a", "1"));

    }
    
}
