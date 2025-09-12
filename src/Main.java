import Entidades.Empleado;

import java.util.Scanner;


public class Main {
    //Ejercicio 1
    public static void puntoUno(){
        Empleado carlos= new Empleado("38639353","Carlos","Gutierrez", 25000);
        Empleado ana= new Empleado("38656654", "Ana", "Sanchez", 27500);
        System.out.println("Empleado 1:");
        System.out.println(carlos.toString());
        System.out.println("Empleado 2:");
        System.out.println(ana.toString());
        System.out.println(STR."El salario de Carlos es: \{carlos.getSalario()}");
        System.out.println("Aumentando salario de Carlos");
        carlos.aumentarSalario(15);
        System.out.println(STR."El nuevo salario de Carlos despues del aumento es de: \{carlos.getSalario()}");
    }


    public static void main(String[] args) {
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);

        while (seguir) {
            System.out.println("Bienvenido a la guia 3 de Programacion 2");
            System.out.println("1.- Ejercicio 1 (Empleado).");
            System.out.println("0.- Salir.");
            System.out.println("Ingrese una opcion: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:{
                    System.out.println("Uno");
                    puntoUno();
                    break;
                }
                case 0:{
                    System.out.println("Salir");
                    seguir = false;
                }
                default:{
                    System.out.println("Ingrese una opcion valida");
                }
            }
        }
    }
}