package EntregasSofkaJulianAlvarez;

import java.util.ArrayList;

public class Phone extends Product{


    private int accessCode;
    protected ArrayList<String> applications;
    protected String IP;
    public String softwareVersion;
    private ArrayList<String> contacts;
    public double storage;

    /**
     * @param nameOfProduct  Indica el nombre del producto.
     * @param brand          Indica la marca del producto.
     * @param model          Indica el modelo del producto.
     * @param color          Indica el color del producto.
     * @param price          Especifica el precio del producto.
     * @param width          Ancho.
     * @param length         Largo.
     * @param height         Alto.
     * @param weight         peso.
     * @param discount       Indica el descuento, si tiene.
     * @param stock          Señala si está disponible el producto o no.
     * @param units          Indica cuantas unidades hay en el inventario.
     * @param description    Menciona la descripcion detalla del producto.
     * @param specifications Indica especificaciones adicionales del producto.
     */
    public Phone(String nameOfProduct, String brand, String model, String color, int price, String width, String length,
                 String height, int weight, int discount, boolean stock, int units, String description,
                 ArrayList<String> specifications) {
        super(nameOfProduct, brand, model, color, price, width, length, height, weight, discount, stock, units, description, specifications);
    }

    /**
     *
     * @param nameOfProduct
     * @param brand
     * @param model
     * @param color
     * @param price
     * @param width
     * @param length
     * @param height
     * @param weight
     * @param discount
     * @param stock
     * @param units
     * @param description
     * @param specifications
     * @param softwareVersion Indica la version de software actual.
     * @param storage Indica la capacidad de almacenamiento del celular en GB.
     */

    public Phone(String nameOfProduct, String brand, String model, String color, int price, String width, String length,
                 String height, int weight, int discount, boolean stock, int units, String description,
                 ArrayList<String> specifications, String softwareVersion, double storage) {
        super(nameOfProduct, brand, model, color, price, width, length, height, weight, discount, stock, units,
                description, specifications);

        this.softwareVersion = softwareVersion;
        this.storage = storage;
    }

    /**
     * Metodos
     */

    /**
     * este metodo se encarga de actualizar el software del celular
     *
     * @param update Esta variable indica la nueva actualizacion del software
     */

    public void updateSoftware(String update){
        setSoftwareVersion(update);
    }


    /**
     * Este metodo se encarga de añadir una aplicacion al celular y actualizar el almacenamiento del mismo.
     *
     * @param name Indica el nombre de la aplicacion
     * @param applicationWeight Señala el peso de la aplicacion
     */

    public void installApplication(String name, double applicationWeight){
        getApplications().add(name);
        setStorage(getStorage() + applicationWeight);
    }

    /**
     * Este metodo se encarga de añadir un contacto
     * @param name Indica el nombre del contacto que se quiere añadir
     */

    public void addContact(String name){
        getContacts().add(name);
    }

    /**
     * Getters de softwareVersion, storage.
     */

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public double getStorage() {
        return storage;
    }

    public void setStorage(double storage) {
        this.storage = storage;
    }

    public ArrayList<String> getApplications() {
        return applications;
    }

    public ArrayList<String> getContacts() {
        return contacts;
    }
}
