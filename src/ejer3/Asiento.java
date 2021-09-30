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
public class Asiento {

    private Espectador espectador;
    private String identificador;
    private boolean ocupado;

    public Asiento(String identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return this.identificador + (this.ocupado ? "X" : " ");
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public String getIdentificador() {
        return identificador;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
        this.ocupado = true;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

}
