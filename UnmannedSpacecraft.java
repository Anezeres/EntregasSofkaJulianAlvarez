package EntregasSofkaJulianAlvarez;

public class UnmannedSpacecraft extends Spaceships implements SpacecraftStructure{


    public UnmannedSpacecraft(String name, String type, String nationality, double power, int capacity,
                              double thrust, double height, int numberOfMotors, double speed, String mission,
                              String destination, String fuel) {
        super(name, type, nationality, power, capacity, thrust, height, numberOfMotors, speed, mission, destination, fuel);
    }

    @Override
    public void printFeatures() {

        UnmannedSpacecraft shuttle = generateSpacecraft();

        System.out.println("Nombre: " + shuttle.name);
        System.out.println("Tipo: " + shuttle.type);
        System.out.println("Nacionalidad: " + shuttle.nationality);
        System.out.println("Poder: " + shuttle.power + " Caballos");
        System.out.println("Capadidad: " + shuttle.capacity + " Personas");
        System.out.println("Empuje: " + shuttle.thrust + " t");
        System.out.println("Altura: " + shuttle.height + " m");
        System.out.println("Cantidad de Motores: " + shuttle.numberOfMotors);
        System.out.println("Velocidad: " + shuttle.speed + " km/h");
        System.out.println("Mision: " + shuttle.mission);
        System.out.println("Destino: " + shuttle.destination);
        System.out.println("Combustible: " + shuttle.fuel);

        spacecraftLiftoff(shuttle.getName());
        landSpacecraft(shuttle.getName());
        congratulate(shuttle.getNationality());

    }

    public UnmannedSpacecraft generateSpacecraft() {

        System.out.println("Ha seleccionado crear una Nave no tripulada");

        String name = messageString("Ingrese el nombre que desea tener su nave: ");
        String nationality = messageString("Ingrese los paises involucrados en la creacion del vehiculo separados por comas: ");
        int power = messageNumerical("Ingrese una potencia superior o igual a 32000 Caballos: ",32000);
        int thrust = messageNumerical("Ingrese un empuje superior o igual a 3500 Toneladas: ",3500);
        int height = messageNumerical("Ingrese una altura superior o igual a 100 Metros: ",100);
        int numberOfMotors = messageNumerical("¿Cuantos motores desea en su nave? debe elegir almenos 1: ",1);
        String mission = messageString("Describa detalladamente el objetivo de esta nave espacial: ");
        String destination = messageString("¿Cual será nuestro destino?: ");
        String fuel = messageString("¿Que combustible usaremos?: ");

        double doubleThrust = thrust;
        double doubleHeight = height;


        UnmannedSpacecraft newShuttleVehicle = new UnmannedSpacecraft(
                name,
                "Naves no tripuladas",
                nationality,
                power,
                0,
                doubleThrust,
                doubleHeight,
                numberOfMotors,
                12000.0,
                mission,
                destination,
                fuel);

        return  newShuttleVehicle;
    }

    @Override
    public void spacecraftLiftoff(String name) {
        System.out.println("La nave espacial no tripulada llamada: " + name + " Ha despegado.");
    }

    @Override
    public void landSpacecraft(String name) {
        System.out.println("La nave espacial no tripulada llamada: " + name + " Ha aterrizado.");
    }

    @Override
    public void congratulate(String nationality) {
        System.out.println(nationality + " Se sienten orgullosos de esta misión, todo fue un exito, la nave llegó en buenas condiciones.");
    }

}
