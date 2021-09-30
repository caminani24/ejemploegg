/*
•llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.
•mojar(): devuelve true si la posición del agua coincide con la posición actual
siguienteChorro(): cambia a la siguiente posición del tambor
•toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package ejer2;

/**
 *
 * @author nani
 */
public class RevolverService {

    public Revolver llenarRevolver() {
        //Mas 1 para agregar el valor 6. 
        int posActual = (int) (Math.random() * 6 + 1);
        int posAgua = (int) (Math.random() * 6 + 1);

        Revolver revolver = new Revolver(posActual, posAgua);
        return revolver;
    }

    public boolean mojar(Revolver revolver) {
        boolean mojar = false;
        if (revolver.getPosActual() == revolver.getPosAgua()) {
            mojar = true;
        }
        return mojar;
    }
    
    public void siguienteChorro(Revolver revolver){
        revolver.setPosActual(((revolver.getPosActual()+1)%6)+1);
        }
    }

