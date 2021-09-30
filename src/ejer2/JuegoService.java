/*
•llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
•ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
 */
package ejer2;

import java.util.List;


public class JuegoService {
    
    
    public void llenarJuego(List<Jugador>jugadores, Revolver r, Juego juego){
        
        juego.setJugadores(jugadores);
        juego.setRevolver(r);
    }
    
    public void ronda(Juego juego){
    JugadorService jugadorService = new JugadorService();
    Jugador jugador1 = null; 
    
    do{
     for (Jugador jugador : juego.getJugadores())
         if (jugadorService.disparo(juego.getRevolver(),jugador)){
             jugador1 = jugador;
             break;       
         }
    }
     while(jugador1 == null);
    
        System.out.println("El jugador que se disparo fue: " + jugador1);

    
    }
    
}
