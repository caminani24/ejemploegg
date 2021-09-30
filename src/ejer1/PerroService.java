/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package ejer1;

import java.util.Scanner;

public class PerroService {

    static Scanner leer = new Scanner(System.in);

    public static Perro crearPerro() {
        System.out.println("Ingrese el nombre del perro");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la raza del perro");
        String raza = leer.nextLine();

        System.out.println("Ingrese la edad de " + nombre);
        int edad = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese el tamaño de " + nombre);
        String tamano = leer.nextLine();

        Perro perro = new Perro(nombre, raza, edad, tamano);

        return perro;
    }
}
