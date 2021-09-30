/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;


public class SalaService {
    
    public void mostrarSala(Sala cine){  
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(cine.getAsientos()[i][j].toString() + " ");
            }
            System.out.println("");
        }
    }
   
}
