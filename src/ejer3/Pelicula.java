/*
el título, duración, edad mínima y director.
 */
package ejer3;


public class Pelicula {
    
    private String titulo;
    private float duracion;
    private int edadMinima;
    private String director; 

    public Pelicula(String titulo, float duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getDuracion() {
        return duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public String getDirector() {
        return director;
    }
    
}
