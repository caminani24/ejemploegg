/*
su nombre, edad y el dinero que tiene disponible.


 */
package ejer3;

public class Espectador {

    private String nombre;
    private int edad;
    private float dineroDisponible;

    public Espectador(String nombre, int edad, float dineroDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
    }

    public Espectador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(float dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

}
