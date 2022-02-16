package EntregasSofkaJulianAlvarez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * El objetivo de esta clase se encarga de ejecutar el programa.
 *
 * @version 1.0.0
 *
 * @author Julian Alvarez
 *
 */

public class MainVehicle {

    /**
     * Esta funcion me ayuda a indentificar si el valor enviado por el usuario es un entero o no.
     *
     * @param answer -> Es una respuesta tipo String.
     * @return -> Boolean, Que me indica si el String (answer) posee un valor de tipo entero.
     */
    public static boolean isNumeric(String answer) {

        boolean result;

        try {
            Integer.parseInt(answer);
            result = true;
        } catch (NumberFormatException excepcion) {
            result = false;
        }

        return result;
    }

    /**
     * Este metodo ejecuta el programa y le pregunta al usuario cuantos autos quiere registrar.
     */

    public static void main(String[] args) {

        ListOfVehicles newList = new ListOfVehicles();
        Scanner answer = new Scanner(System.in);
        ArrayList<Vehicle> list = new ArrayList<>();

        System.out.println("Bienvenido al programa que registra autos.");
        System.out.println("¿Cuantos autos quieres registrar?");

        String numberOfVehicles = answer.nextLine();

        if(isNumeric(numberOfVehicles)){
            newList.generateVehicleList(list,Integer.parseInt(numberOfVehicles));
        }else{
            System.out.println("Lo siento, solo puede ingresar numeros");
        }

    }
}
