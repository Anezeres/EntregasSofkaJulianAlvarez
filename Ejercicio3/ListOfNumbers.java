package EntregasSofkaJulianAlvarez;

import java.util.Arrays;

/**
 * El objetivo de esta clase es crear una lista de numeros, con una longitud determinada
 *
 * @version 1.0.0
 *
 * @author Julian Alvarez
 *
 */

public class ListOfNumbers {
    private int length;
    private int[] intArray;

    /**
     * Este es el constructor de la clase ListOfNumbers, crea un array de numeros con una longitud determinada.
     * @param length Indica la longitud de la lista.
     */

    public ListOfNumbers(int length) {
        this.intArray = new int[length];
    }

    public String createArray(int[] list, int range){

        for (int x=0;x<list.length;x++)
            list[x] = (int) (Math.random()*range)+1;

        setIntArray(list);

        return Arrays.toString(list);
    }

    /**
     * Este metodo se encarga de ordenar la lista de numeros automaticamente.
     * @param list Lista que se busca ordenar.
     * @return
     */

    public String orderArrayAuto(int[] list){
        for (int x = 0; x < list.length; x++) {
            for (int i = 0; i < list.length-x-1; i++) {
                if(list[i] > list[i+1]){
                    int temporal = list[i+1];
                    list[i+1] = list[i];
                    list[i] = temporal;
                }
            }
        }
        System.out.println(Arrays.toString(list));

        return Arrays.toString(list);
    }

    /**
     * Este metodo se encarga de ordenar paso a paso la lista.
     * @param list lista a la cual se le va a realizar el ordenamiento.
     * @return devuelve la lista ordenada.
     */

    public String orderArrayBubble(int[] list){
        for (int x = 0; x < list.length; x++) {
            for (int i = 0; i < list.length-x-1; i++) {
                if(list[i] > list[i+1]){
                    int tmp = list[i+1];
                    list[i+1] = list[i];
                    list[i] = tmp;
                    System.out.println(Arrays.toString(list));
                }
            }
        }
        return Arrays.toString(list);

    }

    /**
     * Getters and Setters
     */

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int[] getIntArray() {
        return intArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }
}
