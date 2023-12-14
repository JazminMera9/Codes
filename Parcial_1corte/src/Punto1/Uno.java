/*
   Realizar un programa que simule un banco. el banco tiene cuentas de cliente, con nombres del cliente,
    numero de cuentas, tipo de cuenta y saldo, tiene un metodo de tranferencia que permite pasar el dinero de una cuenta 
    a otra siempre que en la cuenta de origen haya dinero suficiente para poder hacerla. 
    el banco tiene un nombre y una lista de cuentas, tiene un metodo que permite imprimir el nombre del banco, 
    el numero de clientes y el capital suma de todas las cuentas.
 */
package Punto1;

public class Uno
{

    public static void main(String[] args) {
        Banco banco = new Banco("Mi Banco");

        Cliente cliente1 = new Cliente("Cliente 1", 12345, "Cuenta Corriente", 1000);
        Cliente cliente2 = new Cliente("Cliente 2", 54321, "Cuenta de Ahorro", 2000);

        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);

        System.out.println("Estado Inicial: ");
        banco.imprimirResumen();

        cliente1.transferir(cliente2, 500);

        System.out.println("\nDespués de la transferencia:");
        banco.imprimirResumen();
    }
}


    

