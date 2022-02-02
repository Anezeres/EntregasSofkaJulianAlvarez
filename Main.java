import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * Esta es la clase principal, encargada de ejecutar el codigo.
 *
 * @autor Julian Alexander Alvarez Payares
 */

public class Main {

    public static void main(String[] args) {

        Date dateBirthJulian;
        dateBirthJulian = new Date(102, Calendar.MAY,25);
        Person julian = new Person("Julian","Alvarez",dateBirthJulian,1.70f,56.3f,156489732,"A+","masculine");

        System.out.println("Julian's date of birth is: " + julian.getDateBirth());

        ArrayList<String> colorsGrape = new ArrayList<>();
        colorsGrape.add("Green");
        colorsGrape.add("Purple");
        Fruit grape = new Fruit("Grape",200f,true, colorsGrape);

        System.out.println("The grape colors are: " + grape.getColors());

        BankAccount julianAccount = new BankAccount(123456,true,100000,"Bancolombia","Julian Alvarez",1111);

        System.out.println("¿Julian's account is activated? " + julianAccount.isActivated());

    }
}
