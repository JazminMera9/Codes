/*
 Crea un arraylist con los siguientes números: 
{1, 3, 5, 7, 8, 9, 0, -8, 1, 5, 11, 3, 1, -8, 12, 15, -1}, 
elimina los elementos repetidos e imprimir el arraylist original 
y el resultante ordenado de forma descendente, el número mayor, menor y el valor de la mitad. 
 */
package Punto4;
import java.util.ArrayList;
import java.util.List;

public class P4 
{
    // Función para ordenar un ArrayList de forma descendente
    public static void ordenarDescendente(ArrayList<Integer> lista) 
    {
        for (int num = 0; num < lista.size() - 1; num++) {
            for (int number = num + 1; number < lista.size(); number++) {
                if (lista.get(num) < lista.get(number)) {
                    int temp = lista.get(num);
                    lista.set(num, lista.get(number));
                    lista.set(number, temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        // Crear un ArrayList con los números dados
        List<Integer> numeros = List.of(1, 3, 5, 7, 8, 9, 0, -8, 
                                1, 5, 11, 3, 1, -8, 12, 15, -1);

        // Eliminar elementos duplicados
        ArrayList<Integer> numerosBase = new ArrayList<>();
        for (Integer numero : numeros) {
            if (!numerosBase.contains(numero)) {
                numerosBase.add(numero);
            }
        }

        // Ordenar de forma descendente utilizando la función personalizada
        ordenarDescendente(numerosBase);

        // Imprimir el ArrayList original
        System.out.println("ArrayList original: " + numeros);

        // Imprimir el ArrayList resultante ordenado de forma descendente
        System.out.println("ArrayList ordenado de manera descendente: " + numerosBase);

        // Encontrar el número mayor, menor y el valor de la mitad
        int numeroMayor = numerosBase.get(0);
        int numeroMenor = numerosBase.get(numerosBase.size() - 1);
        int mitad = numerosBase.get(numerosBase.size() / 2);

        // Imprimir el número mayor, menor y el valor de la mitad
        System.out.println("Número mayor: " + numeroMayor);
        System.out.println("Número menor: " + numeroMenor);
        System.out.println("Valor de la mitad: " + mitad);
    }
}

       
    
    
