package Entidades;

public class CuentaBancaria {
    private static int contador = 0;
    private int id;
    private String nombre;
    private double balance;

    //Constructor
    public CuentaBancaria(String nombre, double balance) {
        this.id = contador;
        contador++;
        this.nombre = nombre;
        this.balance = balance;
    }

    public CuentaBancaria() {
        this.id = contador;
        contador++;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Methods
    public double Credito(double ingreso) {
        this.balance += ingreso;
        return balance;
    }

    public double Debito(double gasto) {
        this.balance -= gasto;
        return balance;
    }
}
