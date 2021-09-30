/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nani
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        

        Baraja miBaraja = new Baraja();
        BarajaService bb = new BarajaService();

        List<Carta> cartasRepartidas = new ArrayList<Carta>();

        /*cartasRepartidas.add(miBaraja.siguienteCarta());
        cartasRepartidas.add(miBaraja.siguienteCarta());
        cartasRepartidas.add(miBaraja.siguienteCarta());
        cartasRepartidas.add(miBaraja.siguienteCarta());
        cartasRepartidas.add(miBaraja.siguienteCarta());*/
        miBaraja.barajar();

        System.out.println("Indique la cantidad de cartas que quiere pedir: ");
        int cantidadCartas = leer.nextInt();
        System.out.println(miBaraja.darCartas(cantidadCartas));

        System.out.println("Carta devuelta: " + miBaraja.siguienteCarta());
        System.out.println("Carta devuelta: " + miBaraja.siguienteCarta());
        System.out.println("Carta devuelta: " + miBaraja.siguienteCarta());
        System.out.println("Carta devuelta: " + miBaraja.siguienteCarta());

        System.out.println("La cantidad de cartas disonibles es " + miBaraja.cartasDisponibles());
        miBaraja.cartasMonton();
        
       bb.mostrarCartas(miBaraja.getCartas());

    }

    

    
}
