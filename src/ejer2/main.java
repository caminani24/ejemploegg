/*

 */
package ejer2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class main {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        jugar();
    }

    public static void jugar() {
        //hago los services
        RevolverService rs = new RevolverService();
        JugadorService jugadoressevice = new JugadorService();
        JuegoService jss= new JuegoService();


        System.out.println("Indique la cantidad de jugadores: ");
        int cantidadJugadores = leer.nextInt();

        if (cantidadJugadores > 6 || cantidadJugadores < 0) {
             cantidadJugadores= 6;
        }

        Revolver revolver = rs.llenarRevolver();

        List<Jugador> jugadores = new ArrayList<>();
        
        
        int id=0;
        do {
            //Creamos un jugador, le seteamos el id incremental de 1 hasta la cantidad de jugadores que haya
            Jugador jugador = jugadoressevice.crearJugador();
            jugador.setId(id+1);
            jugadores.add(jugador); //Agregamos el jugador a la lista
        } while (jugadores.size()<cantidadJugadores);
        
        Juego juego = new Juego();
        
        jss.llenarJuego(jugadores, revolver, juego);
        
        jugadores.forEach(System.out::println);
        
        System.out.println("\nProbando el metodo ronda() con revolver");
        System.out.println(revolver);
        jss.ronda(juego);
    }
}
