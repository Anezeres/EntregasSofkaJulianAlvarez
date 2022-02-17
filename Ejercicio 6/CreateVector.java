package EntregasSofkaJulianAlvarez;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 * El objetivo de esta clase es crear un vector para ejecutar los metodos.
 *
 * @version 1.0.0
 *
 * @author Julian Alvarez
 *
 */

public class CreateVector {
    private Vector vector;

    /**
     * Este es el contructor de la clase
     * @param vector es un vector vacio.
     */

    public CreateVector(Vector vector) {
        this.vector = vector;
    }

    /**
     * Este metodo es el encargado de añadir un numero al vector, si el numero que se envia ya está en el vector
     * finalizará el programa.
     *
     * @param number representa el numero que se quiere añadir, es de tipo String, pero se le hará una validacion.
     * @param vector Es el vector, se usará para realizar una recursion.
     * @return devuelve el vector.
     */

    public Vector addNumberToVector(String number, Vector vector){

        if (isNumeric(number)){

            int elementNumeric = Integer.parseInt(number);
            if(vector.contains(elementNumeric)){
                System.out.println("El programa ha finalizado");
                System.out.println(vector.toString());
            }else{
                vector.addElement(elementNumeric);
                orderNumber(vector);
            }
        }else{
            System.out.println("Lo siento, solo se pueden ingresar numeros");
        }
        return vector;
    }

    /**
     * Este metodo es el encargado de pedir elementos por la consola y ejecutará el metodo addNumberToVector()
     * @param vector Este representa el vector, inicialmente vacio y posteiormente irán aumentando sus datos.
     */

    public void orderNumber(Vector vector){

        System.out.println("Ingrese un numero:");

        Scanner answer = new Scanner(System.in);
        String newNumber = answer.nextLine();

        addNumberToVector(newNumber,vector);
    }


    /**
     * Getters and Setters
     */

    public Vector getVector() {
        return vector;
    }

    public void setVector(Vector vector) {
        this.vector = vector;
    }


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
}
