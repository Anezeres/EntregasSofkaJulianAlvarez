package EntregasSofkaJulianAlvarez;

import java.util.Arrays;

public class ListOfNumbers {
    private int length;
    private int[] intArray;

    public ListOfNumbers(int length) {
        this.intArray = new int[length];
    }

    public String createArray(int[] list, int range){

        for (int x=0;x<list.length;x++)
            list[x] = (int) (Math.random()*range)+1;

        setIntArray(list);

        return Arrays.toString(list);
    }

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
