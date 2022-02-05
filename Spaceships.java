package EntregasSofkaJulianAlvarez;

import java.util.Scanner;

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

    public static int stringToNumber(String string){
        int number = Integer.parseInt(String.valueOf(string));
        return number;
    }

    public static int numericalValues(String string, int max){

        if(isNumeric(String.valueOf(string)) && stringToNumber(string) > 0 && stringToNumber(string) >= max) {
            int number = stringToNumber(string);
            return number;
        }else if(isNumeric(String.valueOf(string)) && stringToNumber(string) > 0 && stringToNumber(string) < max){
            System.out.println("Lo siento, para el correcto funcionamiento de la nave debe ser superior a " + max);
            messageNumerical("Intentelo nuevamente",max);
        }else if(isNumeric(String.valueOf(string)) && stringToNumber(string) < 0){
            System.out.println("Lo siento, solo puede ingresar numeros positivos.");
            messageNumerical("Intentelo nuevamente",max);

        }else{
            Scanner number = new Scanner(System.in);
            String numberInputKeyboard = number.nextLine();
            numericalValues(numberInputKeyboard, max);
        }


        return 0;
    }

    public static String messageString(String message){
        System.out.println(message);
        Scanner variable = new Scanner(System.in);
        String variableInputKeyboard = variable.nextLine();
        return variableInputKeyboard;
    }

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
