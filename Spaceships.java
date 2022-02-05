package EntregasSofkaJulianAlvarez;

import java.util.Scanner;

/**
 * Clase abstracta de las naves espaciales.
 */

public abstract class Spaceships {

    protected String name;
    protected String type;
    protected String nationality;
    protected double power;
    protected int capacity;
    protected double thrust;
    protected double height;
    protected int numberOfMotors;
    protected double speed;
    protected String mission;
    protected String destination;
    protected String fuel;

    /**
     *
     * @param name Nombre de la nave espacial.
     * @param type Tipo de nave espacial.
     * @param nationality Nacionalidades involucradas en la mision.
     * @param power Poder de la nave.
     * @param capacity Capacidad de pasajeros en la mision.
     * @param thrust Empuje de la nave.
     * @param height Altura de la nave.
     * @param numberOfMotors Numero de motores que posee la nave,
     * @param speed Velocidad de la nave.
     * @param mission Descripcion de la mision.
     * @param destination Destino de la mision.
     * @param fuel Combustible que usará la nave.
     */

    public Spaceships(String name, String type, String nationality, double power, int capacity, double thrust,
                      double height, int numberOfMotors, double speed, String mission, String destination, String fuel) {
        this.name = name;
        this.type = type;
        this.nationality = nationality;
        this.power = power;
        this.capacity = capacity;
        this.thrust = thrust;
        this.height = height;
        this.numberOfMotors = numberOfMotors;
        this.speed = speed;
        this.mission = mission;
        this.destination = destination;
        this.fuel = fuel;
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

    /**
     * Funcion encargada de convertir un String a Int para ahorrar codigo.
     * @param string Cadena que se convertirá en valor de tipo entero.
     * @return Devuelve un entero.
     */

    public static int stringToNumber(String string){
        int number = Integer.parseInt(String.valueOf(string));
        return number;
    }

    /**
     * Esta funcion imprime un mensaje y verifica si los datos numericos son correctos.
     *
     * @param string Mensaje que se imprimirá en la pantalla del usuario, con la informacion solicitada.
     * @param min Ya que se trata de un entero, le indicamos el numero minimo para que funcione la nave.
     * @return Devuelve 0, puesto que dentro de los if, se hará la verificacion de los datos.
     */

    public static int numericalValues(String string, int min){

        if(isNumeric(String.valueOf(string)) && stringToNumber(string) > 0 && stringToNumber(string) >= min) {
            int number = stringToNumber(string);
            return number;
        }else if(isNumeric(String.valueOf(string)) && stringToNumber(string) > 0 && stringToNumber(string) < min){
            System.out.println("Lo siento, para el correcto funcionamiento de la nave debe ser superior a " + min);
            messageNumerical("Intentelo nuevamente",min);
        }else if(isNumeric(String.valueOf(string)) && stringToNumber(string) < 0){
            System.out.println("Lo siento, solo puede ingresar numeros positivos.");
            messageNumerical("Intentelo nuevamente",min);

        }else{
            Scanner number = new Scanner(System.in);
            String numberInputKeyboard = number.nextLine();
            numericalValues(numberInputKeyboard, min);
        }


        return 0;
    }

    /**
     * Esta funcion imprime un mensaje al ususario y le pide que ingrese informacion.
     * @param message String que se imprimirá al usuario para pedirle la informacion.
     * @return devuelve el valor ingresado por el usuario.
     */

    public static String messageString(String message){
        System.out.println(message);
        Scanner variable = new Scanner(System.in);
        String variableInputKeyboard = variable.nextLine();
        return variableInputKeyboard;
    }

    /**
     * Esta funcion ejecuta la pedida de informacion al ususario, la informacion ingresada ejecutará la funcion
     * numericalValues(String string, int min) para verificar si los datos son correctos.
     *
     * @param message String que se imprimirá al usuario para pedirle la informacion.
     * @param max Ya que se trata de un entero, le indicamos el numero minimo para que funcione la nave.
     * @return Devuelve la informacion ingresada por el ususario.
     */

    public static int messageNumerical(String message, int max){
        System.out.println(message);
        Scanner variable = new Scanner(System.in);
        String variableInputKeyboard = variable.nextLine();
        int numericalVariable = numericalValues(variableInputKeyboard, max);
        return numericalVariable;
    }

    /**
     * Metodos abstractos
     */

    /**
     * Esta funcion imprime la informacion ingresada sobre la nave
     */

    public abstract void printFeatures();







    /**
     * Getters and Setters de cada una de las variables de la clase
     */


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getThrust() {
        return thrust;
    }

    public void setThrust(double thrust) {
        this.thrust = thrust;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNumberOfMotors() {
        return numberOfMotors;
    }

    public void setNumberOfMotors(int numberOfMotors) {
        this.numberOfMotors = numberOfMotors;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
