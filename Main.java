package EntregasSofkaJulianAlvarez;

import java.util.Scanner;

/**
 * Esta es la clase principal que se encarga de ejecutar el programa.
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
     * Esta funcion es la encargada de crear las naves espaciales.
     * Primero le muestra al usuario una serie de opciones y si el valor enviado no coincide con las opciones
     * se termina el programa
     *
     * Pide un valor, si no es de tipo numerico, envia un mensaje y vuelve a ejecutarce a si misma.
     *
     * si el valor es de tipo entero, evaluará si coincide con una de las 3 opciones, si no lo hace, envia un mensaje
     * y vuelve a ejecutarse a si misma.
     *
     * si el valor coincide con una de las 3 opciones, creará un objeto de la opcion selecionada y ejecutará la funcion
     * shuttle.printFeatures(); , encargada de pedirle los datos al ususario y mostrarlos.
     */

    public static void createSpacecraft(){

        System.out.println("#### Tenemos los siguientes tipos de naves espaciales ###");

        System.out.println("#### 1. vehículos lanzadera. ###");
        System.out.println("#### 2. Naves no tripuladas o robóticas. ###");
        System.out.println("#### 3. Naves espaciales tripuladas. ###");
        System.out.println("#### Ingrese otro valor para finalizar ###");
        System.out.println("Introduzca su respuesta: ");

        Scanner answer = new Scanner(System.in);
        String inputKeyboard = answer.nextLine();


        if (isNumeric(String.valueOf(inputKeyboard))){

            int ship = Integer.parseInt(String.valueOf(inputKeyboard));


            if(ship == 1){
                ShuttleVehicles shuttle = new ShuttleVehicles("a",
                        "a",
                        "a",
                        1.0,
                        1,1.0,
                        1.0,
                        1,
                        1.0,
                        "a",
                        "a",
                        "a");

                shuttle.printFeatures();
                createSpacecraft();


            }else if(ship == 2){
                UnmannedSpacecraft shuttle = new UnmannedSpacecraft("a",
                        "a",
                        "a",
                        1.0,
                        1,1.0,
                        1.0,
                        1,
                        1.0,
                        "a",
                        "a",
                        "a");

                shuttle.printFeatures();
                createSpacecraft();


            }else if(ship == 3){
                MannedSpacecraft shuttle = new MannedSpacecraft("a",
                        "a",
                        "a",
                        1.0,
                        1,1.0,
                        1.0,
                        1,
                        1.0,
                        "a",
                        "a",
                        "a");

                shuttle.printFeatures();
                createSpacecraft();

            }else{
                System.out.println("El programa ha finalizado, Valor ingresado -> " + ship);
            }


        }else{
            System.out.println("Lo siento, el valor ingresado no es correcto");
            createSpacecraft();
        }

    }

    /**
     * Esta es la funcion principal que va a saludar al ususario y ejecutará la funcion que crea naves espaciales.
     * @param args
     */

    public static void main(String[] args) {
        System.out.println("#### Bienvenido al programa para crear naves espaciales ###");

        createSpacecraft();


    }
}

