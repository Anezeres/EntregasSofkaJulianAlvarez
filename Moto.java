package EntregasSofkaJulianAlvarez;

public class Moto extends Vehicle{
    /**
     * Este es el constructor de la clase vehiculo, encargada de generar los vehiculos.
     *
     * @param numberOfPassengers Numero de pasajeros
     * @param currentPassengers  Pasajeros actuales.
     * @param numberOfWheels     Numero de ruedas.
     * @param vehiclePlate       Placa del vehiculo.
     * @param cityOfPlate        Ciudad de expedicion.
     * @param brand              Marca.
     * @param model              Modelo de la marca.
     * @param yearOfManufacture  Año de lanzamiento.
     * @param color              Color del vehiculo.
     * @param kilometersTraveled Kilometros recorridos.
     * @param numberOfDoors      Numero de puertas.
     */
    public Moto(int numberOfPassengers, int currentPassengers, int numberOfWheels, String vehiclePlate,
                String cityOfPlate, String brand, String model, int yearOfManufacture, String color,
                int kilometersTraveled, int numberOfDoors) {
        super(numberOfPassengers, currentPassengers, numberOfWheels, vehiclePlate, cityOfPlate,
                brand, model, yearOfManufacture, color, kilometersTraveled, numberOfDoors);
    }

    @Override
    public String toString() {
        return "Moto{" + "\n" +
                "Numero de pasajeros= " + getNumberOfPassengers() + " Pasajeros" + "\n" +
                "Pasajeros Actuales= " + getCurrentPassengers() + " Pasajeros" + "\n" +
                "Numero de ruedas= " + getNumberOfWheels() + " Ruedas" + "\n" +
                "Placa= " + getVehiclePlate() + "\n" +
                "Ciudad de Expedición= " + getCityOfPlate()  + "\n" +
                "Marca= " + getBrand() + "\n" +
                "Modelo= " + getModel()  + "\n" +
                "Año de Expedición= " + getYearOfManufacture() + "\n" +
                "Color= " + getColor()  + "\n" +
                "Kilometros Recorridos= " + getKilometersTraveled()+ " km"  + "\n" +
                "Numero de Puertas= " + getNumberOfDoors() + " Puertas" + "\n" +
                '}';
    }


}
