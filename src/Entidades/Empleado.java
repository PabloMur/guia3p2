package Entidades;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private double salario;

    //constructor
    public Empleado(String dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public Empleado() {}

    //setters and gertters
    public String getDni() {
        return this.dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalarioAnual() {
        return this.salario * 12;
    }

    public void aumentarSalario(int porcentaje) {
        this.salario = this.salario + (this.salario * porcentaje)/100;
    }


    //a terminar
    @Override
    public String toString() {
        return "Empleado" +
                "[dni= " + this.getDni() +
                ",nombre= " + this.getNombre() +
                ",apellido= " + this.getApellido() +
                ",salario= " + this.getSalario();
    }

}
