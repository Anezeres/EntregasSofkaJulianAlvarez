package EntregasSofkaJulianAlvarez;

import java.util.Scanner;

public class Main {


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

    public static String createSpacecraft(){

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
        }

        return "a";


    }

    public static void main(String[] args) {
        System.out.println("#### Bienvenido al programa para crear naves espaciales ###");

        createSpacecraft();


    }
}

