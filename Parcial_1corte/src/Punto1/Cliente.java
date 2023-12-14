
package Punto1;

public class Cliente 
{
    private String nombre;
    private int numeroCuenta;
    private String tipoCuenta;
    private double saldo;

    public Cliente(String nombre, int numeroCuenta, String tipoCuenta, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void transferir(Cliente destinatario, double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            destinatario.saldo += cantidad;
            System.out.println("Transferencia exitosa de " + cantidad + " a " + destinatario.getNombre());
        } else {
            System.out.println("Fondos insuficientes para realizar la transferencia.");
        }
    }
}

    

