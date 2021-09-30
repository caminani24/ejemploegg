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

public class PersonaService {

    static Scanner leer = new Scanner(System.in);

    public static Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el apellido de la persona");
        String apellido = leer.nextLine();

        System.out.println("Ingrese la edad de " + nombre);
        int edad = leer.nextInt();

        System.out.println("Ingrese el documento de " + nombre);
        int documento = leer.nextInt();
        leer.nextLine();

        Persona persona = new Persona(nombre, apellido, edad, documento);

        return persona;
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre de la persona: " + persona.getNombre() + " " + persona.getApellido());
        System.out.println("Edad de la persona: " + persona.getEdad());
        System.out.println("Documento de la persona: " + persona.getDocumento());
        System.out.println("Nombre del perro: " + persona.getPerro().getNombre());
        System.out.println("Raza del perro: " + persona.getPerro().getRaza());
        System.out.println("Edad del perro: " + persona.getPerro().getEdad());
        System.out.println("Tamaño del perro" + persona.getPerro().getTamano());
    }
}
