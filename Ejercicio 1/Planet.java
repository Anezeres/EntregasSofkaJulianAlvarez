package EntregasSofkaJulianAlvarez;

/**
 * El objetivo de esta clase abtracta es generar planetas
 *
 * @version 1.0.0
 *
 * @author Julian Alvarez
 *
 */

public abstract class Planet {

    private final String name;
    private final String id;
    private double mass;
    private double density;
    private double diameter;
    private double distanceToSun;

    /**
     *
     * @param name Nombre del planeta.
     * @param id Identificador del planeta.
     * @param mass Masa del planeta.
     * @param density Densidad del planeta.
     * @param diameter Diametro del planeta.
     * @param distanceToSun Distancia del planeta hasta el sol.
     */

    public Planet(String name, String id, double mass, double density, double diameter, double distanceToSun) {
        this.name = name;
        this.id = id;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceToSun = distanceToSun;
    }

    /**
     * Metodos
     */

    /**
     * Este metodo se encarga de hallar la atraccion entre 2 cuerpos.
     *
     * @param mass1 Masa del primer cuerpo.
     * @param mass2 Masa del segundo cuerpo.
     * @param distanceBetweenBodies Distancia entre los 2 cuerpos.
     * @return Devuelve la fuerza gravitacional entre ambos cuerpos.
     */

    public double attractionBetweenBodies(double mass1, double mass2, double distanceBetweenBodies){
        double gravitationalConstant = 6.67 * Math.pow(10,-11);

        double gravitationalForce = (gravitationalConstant * mass1 * mass2)/Math.pow(distanceBetweenBodies,2);
        return  gravitationalForce;
    }

    /**
     * Getters and Setters
     */

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDistanceToSun() {
        return distanceToSun;
    }

    public void setDistanceToSun(double distanceToSun) {
        this.distanceToSun = distanceToSun;
    }
}
