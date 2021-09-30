/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;

/**
 *
 * @author nani
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pelicula LosPitufos = new Pelicula("Los Pitufos", 300f, 15, "Pepito");
        Sala sala1 = new Sala(220, LosPitufos);
        SalaService ss = new SalaService();
        EspectadorService es = new EspectadorService();
        
        
        Espectador espectador1 = es.CrearEspectador();
        Espectador espectador2 = es.CrearEspectador();
        Espectador espectador3 = es.CrearEspectador();
        Espectador espectador4 = es.CrearEspectador();
        Espectador espectador5 = es.CrearEspectador();
        
        sala1.ubicarEspectador(espectador1);
        sala1.ubicarEspectador(espectador2);
        sala1.ubicarEspectador(espectador3);        
        sala1.ubicarEspectador(espectador4);
        sala1.ubicarEspectador(espectador5);
                
        ss.mostrarSala(sala1);
    }

}
