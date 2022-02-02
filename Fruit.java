import java.util.ArrayList;

/**
 *
 * Esta clase representa una fruta.
 *
 * @autor Julian Alexander Alvarez Payares
 */

public class Fruit {
    public String name;
    private float averageWeight;
    public boolean seeds;
    public ArrayList<String> colors;

    /**
     *
     * @param name nombre de la fruta.
     * @param averageWeight peso promedio de la fruta.
     * @param seeds Si tiene semillas o no.
     * @param colors Lista de colores que posee la fruta.
     */

    public Fruit(String name, float averageWeight, boolean seeds, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.seeds = seeds;
        this.colors = colors;
    }

    /**
     * Getters y Setters de Colors.
     */

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }


}
