/*

 */
package ejer3;

public class Sala {

    private float precioEntrada;
    private Asiento[][] asientos;
    private boolean ocupado;
    private Pelicula pelicula;

    public Sala(float precio, Pelicula pelicula) {
        this.precioEntrada = precio;
        this.pelicula = pelicula;
        this.numerarAsientos();
    }
    
    public boolean ubicarEspectador(Espectador espectador) {
        if(espectador.getDineroDisponible() < this.precioEntrada) {
            return false;
        }
        if(espectador.getEdad() < this.pelicula.getEdadMinima()) {
            return false;
        }
        int fila = (int)Math.round(Math.random() * 8);
        int col = (int)Math.round(Math.random() * 6);
        
        if(this.asientos[fila][col].isOcupado()) {
            return ubicarEspectador(espectador);
        }
        //setEspectador pone true en ocupado
        this.asientos[fila][col].setEspectador(espectador);
                        
                
        return true;
    }

    private void numerarAsientos() {
        String letras = "ABCDEF";
        this.asientos = new Asiento[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                //como parametro va identificador que es el numero con la letra, lo convierto en string 
                this.asientos[i][j] = new Asiento(String.valueOf(8 - i) + letras.charAt(j));
            }
        }
    }

    public Asiento[][] getAsientos() {
        return this.asientos;
    }

}
