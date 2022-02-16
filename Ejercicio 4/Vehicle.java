package EntregasSofkaJulianAlvarez;

/**
 * El objetivo de esta clase es generar vehiculos.
 *
 * @version 1.0.0
 *
 * @author Julian Alvarez
 *
 */

public class Vehicle {
    private int numberOfPassengers;
    private int currentPassengers;
    private int numberOfWheels;
    private String vehiclePlate;
    private String cityOfPlate;
    private String brand;
    private String model;
    private int yearOfManufacture;
    private String color;
    private int kilometersTraveled;
    private int numberOfDoors;

    /**
     * Este es el constructor de la clase vehiculo, encargada de generar los vehiculos.
     *
     * @param numberOfPassengers Numero de pasajeros
     * @param currentPassengers Pasajeros actuales.
     * @param numberOfWheels Numero de ruedas.
     * @param vehiclePlate Placa del vehiculo.
     * @param cityOfPlate Ciudad de expedicion.
     * @param brand Marca.
     * @param model Modelo de la marca.
     * @param yearOfManufacture Año de lanzamiento.
     * @param color Color del vehiculo.
     * @param kilometersTraveled Kilometros recorridos.
     * @param numberOfDoors Numero de puertas.
     */

    public Vehicle(int numberOfPassengers, int currentPassengers, int numberOfWheels, String vehiclePlate,
                   String cityOfPlate, String brand, String model, int yearOfManufacture, String color,
                   int kilometersTraveled, int numberOfDoors) {
        this.numberOfPassengers = numberOfPassengers;
        this.currentPassengers = currentPassengers;
        this.numberOfWheels = numberOfWheels;
        this.vehiclePlate = vehiclePlate;
        this.cityOfPlate = cityOfPlate;
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.kilometersTraveled = kilometersTraveled;
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Getters and Setters de la clase
     */

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public void setCurrentPassengers(int currentPassengers) {
        this.currentPassengers = currentPassengers;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public String getCityOfPlate() {
        return cityOfPlate;
    }

    public void setCityOfPlate(String cityOfPlate) {
        this.cityOfPlate = cityOfPlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKilometersTraveled() {
        return kilometersTraveled;
    }

    public void setKilometersTraveled(int kilometersTraveled) {
        this.kilometersTraveled = kilometersTraveled;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Este metodo se encarga de imprimir en pantalla toda la informacion ingresada por el usuario.
     * @return Toda la informacion de cada auto.
     */

    @Override
    public String toString() {
        return "Vehicle{" + "\n" +
                "Numero de pasajeros= " + numberOfPassengers + " Pasajeros" + "\n" +
                "Pasajeros Actuales= " + currentPassengers + " Pasajeros" + "\n" +
                "Numero de ruedas= " + numberOfWheels + " Ruedas" + "\n" +
                "Placa= " + vehiclePlate + "\n" +
                "Ciudad de Expedición= " + cityOfPlate  + "\n" +
                "Marca= " + brand + "\n" +
                "Modelo= " + model  + "\n" +
                "Año de Expedición= " + yearOfManufacture + "\n" +
                "Color= " + color  + "\n" +
                "Kilometros Recorridos= " + kilometersTraveled + " km"  + "\n" +
                "Numero de Puertas= " + numberOfDoors + " Puertas" + "\n" +
                '}';
    }
}
