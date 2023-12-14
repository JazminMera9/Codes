
package Punto1;

import java.util.ArrayList;

public class Banco 
{
        private String nombre;
    private ArrayList<Cliente> cuentas = new ArrayList<>();

    public Banco(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCliente(Cliente cliente) {
        cuentas.add(cliente);
    }

    public void imprimirResumen() {
        System.out.println("Nombre del Banco: " + nombre);
        System.out.println("Número de Clientes: " + cuentas.size());

        double capitalTotal = 0;
        for (Cliente cliente : cuentas) {
            capitalTotal += cliente.getSaldo();
        }

        System.out.println("Capital Total: $" + capitalTotal);
    }

}
