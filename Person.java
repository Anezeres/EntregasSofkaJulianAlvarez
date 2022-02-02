import java.util.Date;

/**
 *
 * Esta clase representa una persona con su informacion personal.
 *
 * @autor Julian Alexander Alvarez Payares
 */

public class Person {
    public String name;
    public String lasName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    public float weight;
    protected int ID;
    public String bloodType;
    public String gender;

    /**
     * Crea una instancia de la clase persona
     *
     * @param name Nombre de la persona
     * @param lasName1 primer apellido
     * @param lastName2 Segundo apellido, si tiene.
     * @param dateBirth Fecha de nacimiento.
     * @param height Altura de la persona.
     * @param weight Peso de la persona.
     * @param ID Identificacion personal.
     * @param bloodType Tipo de sangre.
     * @param gender Genero de la persona.
     */

    public Person(String name, String lasName1, String lastName2, Date dateBirth, float height, float weight, int ID, String bloodType, String gender) {
        this.name = name;
        this.lasName1 = lasName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
        this.weight = weight;
        this.ID = ID;
        this.bloodType = bloodType;
        this.gender = gender;
    }

    public Person(String name, String lasName1, Date dateBirth, float height, float weight, int ID, String bloodType, String gender) {
        this.name = name;
        this.lasName1 = lasName1;
        this.dateBirth = dateBirth;
        this.height = height;
        this.weight = weight;
        this.ID = ID;
        this.bloodType = bloodType;
        this.gender = gender;
    }

    /**
     * Getters y Setters de Name e ID.
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getDateBirth() {
        return dateBirth;
    }
}
