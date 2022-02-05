package EntregasSofkaJulianAlvarez;

public interface SpacecraftStructure {

    /**
     * Funcion encargada de indicar que la nave espacial despega.
     * @param name nombre de la nave espacial
     */

    public void spacecraftLiftoff(String name);

    /**
     * Funcion encargada de indicar que la nave espacial aterriza.
     * @param name nombre de la nave espacial
     */

    public void landSpacecraft(String name);

    /**
     * Funcion encargada de felicitar al creador de la nave espacial.
     * @param nationality nombre de las naciones involucradas en la mision.
     */
    public void congratulate(String nationality);
}
