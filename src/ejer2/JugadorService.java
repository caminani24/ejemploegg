/*
disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.

 */
package ejer2;
import java.util.Scanner;

public class JugadorService {
     static Scanner leer = new Scanner(System.in);
    
    public boolean disparo(Revolver rev, Jugador jug){
        RevolverService revolverService = new RevolverService();
        
        jug.setMojado(revolverService.mojar(rev));
        revolverService.siguienteChorro(rev);
        
    return jug.isMojado();
    } 
    
    public Jugador crearJugador(){
        Jugador jugador= new Jugador();
        
        jugador.setMojado(false);
        return jugador;
    }
    
}
