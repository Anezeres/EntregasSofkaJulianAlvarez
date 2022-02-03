package EntregasSofkaJulianAlvarez;

import java.util.ArrayList;

/**
 *
 * Esta clase representa un producto en una tienda.
 *
 * @autor Julian Alexander Alvarez Payares
 */

public class Product {

    public String nameOfProduct;
    public String brand;
    public String model;
    public String color;
    public int price;
    public String width, length, height;
    public int weight;
    public int discount;
    public boolean stock;
    public int units;
    private int units_Sold;
    private int salesProfit;
    public String description;
    public String questionsOfProduct;
    public String answers;
    public ArrayList<String> paymentMethods;
    public ArrayList<String> specifications;

    /**
     *
     * @param nameOfProduct Indica el nombre del producto.
     * @param brand Indica la marca del producto.
     * @param model Indica el modelo del producto.
     * @param color Indica el color del producto.
     * @param price Especifica el precio del producto.
     * @param width Ancho.
     * @param length Largo.
     * @param height Alto.
     * @param weight peso.
     * @param discount Indica el descuento, si tiene.
     * @param stock Señala si está disponible el producto o no.
     * @param units Indica cuantas unidades hay en el inventario.
     * @param description Menciona la descripcion detalla del producto.
     * @param specifications Indica especificaciones adicionales del producto.
     */

    public Product(String nameOfProduct, String brand, String model,String color, int price, String width,
                   String length,String height, int weight, int discount, boolean stock, int units, String description,
                   ArrayList<String> specifications) {
        this.nameOfProduct = nameOfProduct;
        this.model = model;
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.width = width;
        this.length = length;
        this.height = height;
        this.weight = weight;
        this.discount = discount;
        this.stock = stock;
        this.units = units;
        this.description = description;
        this.specifications = specifications;

    }

    /**
     * Metodos
     */


    /**
     *
     * En este metodo se busca disminuir las unidades del producto,
     * si la cantidad de productos es 0, la disponibilidad del producto será falsa.
     *
     * @param quantity Indica la cantidad de unidades vendidas
     */

    public void sellProduct(int quantity){
        int difference = getUnits() - quantity;

        if (difference == 0) {
            setStock(false);

        }else {
            setUnits(getUnits() - quantity);
        }

    }

    /**
     *
     * En este metodo se busca aumentar las unidades del producto
     * si la disponibilidad del producto es falsa, cambiará a true
     *
     * @param quantity Indica la cantidad de unidades ingresadas
     */

    public void enterProduct(int quantity){

        int increase = getUnits() + quantity;

        if ((increase > 0) && (isStock() == false)) {
            setStock(true);
            setUnits(getUnits() + increase);

        }else {
            setUnits(getUnits() + increase);
        }

        setUnits(getUnits() + quantity);


    }

    /**
     * Este metodo se encarga de aplicar un descuento al producto si lo tiene.
     */

    public void applyDiscount(){
        setPrice((int) (getPrice() - (getPrice() * getDiscount() * 0.01)));
    }



    /**
     * Getters y Setters de NameOfProduct, brand, model, color, Price,
     * width, length, height, weight, Discount, Stock, Units, PaymentMethods, Specifications.
     */

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public ArrayList<String> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(ArrayList<String> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public ArrayList<String> getSpecifications() {
        return specifications;
    }

    public void setSpecifications(ArrayList<String> specifications) {
        this.specifications = specifications;
    }
}
