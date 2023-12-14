// 11. Leer n valores enteros, almacenarlos en un arreglo 
// y realizar la suma de los elementos del vector.
package e11;
import java.util.Scanner;
public class Ejercicio11 
{
    public static void main(String[] args)
    {
        Scanner digite = new Scanner(System.in);
        System.out.print("Escribe el tamaño del arreglo: ");  //pedimos el tamano
        int tamano = digite.nextInt();   // lo lee
        int vector[] = new int[tamano]; //crea un arreglo llamado vector 
        
        LlenarVector(vector, 0);   // llena el arreglo y empieza desde 0 
        System.out.println("Sumatoria: "+sumatoria(vector, 0));
    }
    
    public static void LlenarVector(int[] vector, int n)
    { 
        Scanner digite = new Scanner (System.in);
        if (n < (vector.length)){
            System.out.print("Digita el numero: ");
            
            vector[n] = digite .nextInt();
            LlenarVector(vector, n+1); // llena el vector
        } 
    }
    
    public static int sumatoria(int[] vector, int n){
        int suma=0;
        if (n>=vector.length) 
        {
            return suma;
        }else
        {         
            suma = vector[n];
            return suma + sumatoria(vector, n+1);
        }

    }
    
}
