package EntregasSofkaJulianAlvarez;

import java.util.Vector;

/**
 * El objetivo de esta clase es ejecutar el programa.
 *
 * @version 1.0.0
 *
 * @author Julian Alvarez
 *
 */

public class Main {



    public static void main(String[] args) {

        System.out.println("Bienvenido al programa que prueba la clase vector");
        System.out.println("Ingrese todos los numeros que quiera, pero cuando se repita un elemento se acabará el programa.");

        Vector vector = new Vector<>();
        CreateVector newVector = new CreateVector(vector);

        newVector.orderNumber(vector);

    }
}
