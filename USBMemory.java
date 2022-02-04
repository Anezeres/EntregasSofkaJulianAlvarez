package EntregasSofkaJulianAlvarez;

import java.util.ArrayList;

public class USBMemory extends Product{

    public double storage;
    private ArrayList<String> folders;
    private ArrayList<String> files;
    private ArrayList<String> images;
    private ArrayList<String> music;
    private ArrayList<String> documents;


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
    public USBMemory(String nameOfProduct, String brand, String model, String color, int price, String width,
                     String length, String height, int weight, int discount, boolean stock, int units,
                     String description, ArrayList<String> specifications) {
        super(nameOfProduct, brand, model, color, price, width, length, height, weight, discount, stock,
                units, description, specifications);
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
     * @param storage Indica la capacidad de almacenamiento del celular en GB.
     */

    public USBMemory(String nameOfProduct, String brand, String model, String color, int price, String width,
                     String length, String height, int weight, int discount, boolean stock, int units,
                     String description, ArrayList<String> specifications, double storage) {
        super(nameOfProduct, brand, model, color, price, width, length, height, weight, discount, stock, units, description, specifications);
        this.storage = storage;
    }


    /**
     * Metodos
     */

    public void addFolder(String name, double folderWeight){
        getFolders().add(name);
        setStorage(getStorage() + folderWeight);
    }

    public void addFile(String name, double fileWeight){
        getFiles().add(name);
        setStorage(getStorage() + fileWeight);
    }

    public void addImage(String name, double imageWeight){
        getImages().add(name);
        setStorage(getStorage() + imageWeight);
    }

    public void addSong(String name, double songWeight){
        getMusic().add(name);
        setStorage(getStorage() + songWeight);
    }

    public void addDocument(String name, double documentWeight){
        getDocuments().add(name);
        setStorage(getStorage() + documentWeight);
    }

    /**
     * Getters de storage.
     */

    public double getStorage() {
        return storage;
    }

    public void setStorage(double storage) {
        this.storage = storage;
    }

    public ArrayList<String> getFolders() {
        return folders;
    }

    public void setFolders(ArrayList<String> folders) {
        this.folders = folders;
    }

    public ArrayList<String> getFiles() {
        return files;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public ArrayList<String> getMusic() {
        return music;
    }

    public ArrayList<String> getDocuments() {
        return documents;
    }

    /**
     * Setters de files, images, music, documents.
     */

    public void setFiles(ArrayList<String> files) {
        this.files = files;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public void setMusic(ArrayList<String> music) {
        this.music = music;
    }

    public void setDocuments(ArrayList<String> documents) {
        this.documents = documents;
    }
}
