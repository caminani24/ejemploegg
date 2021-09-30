/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package ejer1;


public class main {

    public static void main(String[] args) {

        PersonaService personaService = new PersonaService();
        PerroService perroService = new PerroService();


        Persona persona1 = personaService.crearPersona();

        
        persona1.setPerro(perroService.crearPerro());
        
        Persona persona2 = personaService.crearPersona();
        persona2.setPerro(perroService.crearPerro());
        
        personaService.mostrarPersona(persona1);
        personaService.mostrarPersona(persona2);        
    }
}
