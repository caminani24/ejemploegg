/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;

public class Baraja {

    Scanner leer = new Scanner(System.in);

    private List<Carta> cartas;
    private List<Carta> cartasRepartidas;

    public List<Carta> getCartas() {
        return cartas;
    }
    

    public Baraja() {
        crearCartas();
        this.cartasRepartidas = new ArrayList<>();
    }

    private void crearCartas() {
        this.cartas = new ArrayList<>();
        String[] palos = {"Espada", "Basto", "Oro", "Copa"};
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};

        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                {
                    cartas.add(new Carta(numeros[j], palos[i]));
                }

            }
        }
    }

    public void barajar() {
        for (int i = 0; i < cartas.size(); i++) {
            int indiceRandom = (int) (Math.random() * 39 + 1);
            Carta aux = this.cartas.get(i);
            this.cartas.set(i, this.cartas.get(indiceRandom));
            this.cartas.set(indiceRandom, aux);
        }
        System.out.println("Las cartas se estan mezclando");
    }

    public Carta siguienteCarta() {
        if (this.cartas.isEmpty()) {
            System.out.println("No hay mas cartas en el mazo");
            return null;
        }
        // borra el elemento 0 y lo devuelve
        Carta c = this.cartas.get(0);
        this.cartasRepartidas.add(c);
        return this.cartas.remove(0);
    }

    public int cartasDisponibles() {
        return this.cartas.size();
    }

    public List<Carta> darCartas(int cantidadCartas) {
        if (cartasDisponibles() < cantidadCartas) {
            System.out.println("No hay cartas suficientes para devolver");
            return null;
        }
        List<Carta> nCartasPedidas = new ArrayList<Carta>();
        for (int i = 0; i < cantidadCartas; i++) {
            Carta c = this.cartas.get(0);
            nCartasPedidas.add(c);
            this.cartas.remove(0);
            this.cartasRepartidas.add(c);
        }
        return nCartasPedidas;

    }


    public void cartasMonton() {
        if (this.cartasRepartidas.isEmpty()) {
            System.out.println("Todavia no ha salido ninguna carta");
        }
        else {
            System.out.println("Las cartas salidas con las siguientes " + this.cartasRepartidas);
    }

}
}
