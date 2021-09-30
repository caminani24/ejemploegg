/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;

import java.util.Scanner;

public class EspectadorService {

    static Scanner leer = new Scanner(System.in);

    public Espectador CrearEspectador() {
        System.out.println("Nombre del espectador:");
        String nombre = leer.nextLine();
        System.out.println("Edad del espectador: ");
        int edad = leer.nextInt();
        leer.nextLine();
        System.out.println("Dinero Disponible del espectador:");
        float dineroDisponible = leer.nextFloat();
        leer.nextLine();
        
        
        Espectador espectador = new Espectador(nombre, edad, dineroDisponible);
        
       return espectador;

    }

}
