package EntregasSofkaJulianAlvarez;

import java.util.Scanner;

/**
 * El objetivo de esta clase es ejecutar el programa que crea lista de numeros.
 *
 * @version 1.0.0
 *
 * @author Julian Alvarez
 *
 */

public class Main {

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
     * Esta es la clase Main, encargada de ejecutar el programa, le pide al ususario los datos y los valida por medio
     * de if's
     */

    public static void main(String[] args) {
        System.out.println("¡Bienvenido al programa que ordena numeros!");
        System.out.println("Ingrese la cantidad de datos que quiere en su lista:");
        
        Scanner answer = new Scanner(System.in);
        String length = answer.nextLine();

        if (isNumeric(String.valueOf(length))){

            ListOfNumbers list = new ListOfNumbers(Integer.parseInt(length));

            System.out.println("Hasta que numero desea elegir los numeros aleatorios:");
            String range = answer.nextLine();
            if (isNumeric(String.valueOf(range))){
                System.out.println("Esta es su lista de numeros aleatorios:");
                System.out.println(list.createArray(list.getIntArray(),Integer.parseInt(range)));
                System.out.println("\n");
                System.out.println("¿Como deseas ordenarlos?");
                System.out.println("1. Automaticamente.");
                System.out.println("2. Mediante el algoritmo de burbuja.");
                String option = answer.nextLine();
                if(isNumeric(String.valueOf(option))){
                    int numericOption = Integer.parseInt(option);
                    if(numericOption == 1){
                        System.out.println("Esta es tu lista ordenada.");
                        list.orderArrayAuto(list.getIntArray());
                    }else if(numericOption == 2){
                        System.out.println("Esta es tu lista ordenada por algoritmo de burbuja.");
                        list.orderArrayBubble(list.getIntArray());
                    }else{
                        System.out.println("Lo siento, el valor ingresado no corresponde a una de nuestras opciones.");
                    }
                }else{
                    System.out.println("Lo siento, solo puede ingresar numeros.");
                }
            }else{
                System.out.println("Lo siento, solo puede ingresar numeros");
            }
        }else{
            System.out.println("Lo siento, solo puede ingresar numeros");
        }

    }
}
