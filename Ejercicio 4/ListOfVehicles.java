package EntregasSofkaJulianAlvarez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * El objetivo de esta clase es generar una lista de vehiculos.
 *
 * @version 1.0.0
 *
 * @author Julian Alvarez
 *
 */

public class ListOfVehicles {

    /**
     * Constructor de la clase ListOfVehicles
     */
    public ListOfVehicles() {
    }

    /**
     * Esta funcion es la encargada de recibir la informacion del usuario y validad si los valores numericos pedidos
     * son correctamente ingresados
     */

    public Vehicle generateVehicle() {
        System.out.println("#####Estas generando un nuevo auto####");

        Scanner answer = new Scanner(System.in);

        System.out.println("Ingrese el numero de posibles pasajeros:");
        String numberOfPassengers = answer.nextLine();

        Vehicle vehicle = null;

        if (isNumeric(numberOfPassengers)) {
            System.out.println("Ingrese el numero de pasajeros actuales:");
            String currentPassengers = answer.nextLine();

            if (isNumeric(currentPassengers)) {
                System.out.println("Ingrese el numero ruedas que posee el vehiculo:");
                String numberOfWheels = answer.nextLine();

                if (isNumeric(numberOfWheels)) {
                    System.out.println("Ingrese la placa del vehiculo:");
                    String vehiclePlate = answer.nextLine();
                    System.out.println("Ingrese la ciudad de expedición del vehiculo:");
                    String cityOfPlate = answer.nextLine();
                    System.out.println("Ingrese la marca del vehiculo:");
                    String brand = answer.nextLine();
                    System.out.println("Ingrese el modelo del vehiculo:");
                    String model = answer.nextLine();

                    System.out.println("Ingrese el año del vehiculo:");
                    String yearOfManufacture = answer.nextLine();

                    if (isNumeric(yearOfManufacture)) {
                        System.out.println("Ingrese el color del vehiculo:");
                        String color = answer.nextLine();
                        System.out.println("Ingrese los kilometros recorridos del vehiculo (Sin decimales):");
                        String kilometersTraveled = answer.nextLine();

                        if (isNumeric(kilometersTraveled) && Integer.parseInt(kilometersTraveled) >= 0) {
                            System.out.println("Ingrese el numero de puertas que posee el vehiculo:");
                            String numberOfDoors = answer.nextLine();

                            if (isNumeric(numberOfDoors)) {

                                vehicle = new Vehicle(
                                        Integer.parseInt(numberOfPassengers),
                                        Integer.parseInt(currentPassengers),
                                        Integer.parseInt(numberOfWheels),
                                        vehiclePlate,
                                        cityOfPlate,
                                        brand,
                                        model,
                                        Integer.parseInt(yearOfManufacture),
                                        color,
                                        Integer.parseInt(kilometersTraveled),
                                        Integer.parseInt(numberOfDoors)
                                );

                                System.out.println("\n");

                            } else {

                                System.out.println("El valor ingresado no es correcto.");
                                System.out.println("Intentelo nuevamente.");
                                System.out.println("\n");
                                generateVehicle();
                            }
                        } else {
                            System.out.println("El valor ingresado no es correcto.");
                            System.out.println("Intentelo nuevamente.");
                            System.out.println("\n");
                            generateVehicle();
                        }
                    } else {
                        System.out.println("El valor ingresado no es correcto.");
                        System.out.println("Intentelo nuevamente.");
                        System.out.println("\n");
                        generateVehicle();
                    }
                } else {
                    System.out.println("El valor ingresado no es correcto.");
                    System.out.println("Intentelo nuevamente.");
                    System.out.println("\n");
                    generateVehicle();
                }
            } else {
                System.out.println("El valor ingresado no es correcto.");
                System.out.println("Intentelo nuevamente.");
                System.out.println("\n");
                generateVehicle();
            }
        } else {
            System.out.println("El valor ingresado no es correcto.");
            System.out.println("Intentelo nuevamente.");
            System.out.println("\n");
            generateVehicle();
        }

        return vehicle;
    }

    /**
     * Este metodo se encarga de generar una lista de autos y ejecuta el metodo generateVehicle()
     * @param list lista de autos, inicia en 0, y se le van añadiendo los valores
     * @param numberOfVehicles es el numero de autos que quiere registrar el usuario
     */

    public void generateVehicleList(ArrayList<Vehicle> list,int numberOfVehicles){

        if(list.size() == numberOfVehicles ){
            System.out.println("Perfecto, has creado los autos.");
            System.out.println("\n");
            System.out.println("Aquí está la información ingresada=");
            System.out.println("\n");
            for(Vehicle vehicle1: list) {
                String info = vehicle1.toString();
                System.out.println(info);
                System.out.println("\n");
            }

        }else{
            ListOfVehicles newList = new ListOfVehicles();
            Vehicle vehicle = newList.generateVehicle();
            list.add(vehicle);
            newList.generateVehicleList(list,numberOfVehicles);
        }

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
