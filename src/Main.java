package PlayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jhojan hoyos
 */
public class Main {


    public static void main(String[] args) {


        Library libreria = new Library();
        libreria.list();
        menu(libreria);
    }
    
   
    public static void menu( Library libreria) {
        short opcion = 0;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println(" BIBLIOTECA DE MUSICA");
            System.out.println("1. Mostrar las canciones en biblioteca de musica:");
            System.out.println("2. Filtrar canciones por año:");
            System.out.println("3. Filtrar canciones por genero:");
            System.out.println("4. Salir");
            
            System.out.println("Escoja un opcion: ");
            
            opcion = teclado.nextShort();

            switch(opcion) {
                case 1:
                    for(Song song : libreria.getSongList()){
                        System.out.println(song.show());
                    }
                    System.out.println("\n");
                    break;
                    
                case 2:
                    System.out.println("Digite el año : ");
                    int year = teclado.nextInt();
                    ArrayList<Song> listForYear = libreria.filterYear(year);
                    
                    if(listForYear.size() == 0) {
                        System.out.println("No hay cancion de ese año");
                     } else {
                        for(Song song :  listForYear) {
                            System.out.println(song.show());
                        }
                    }
                    System.out.println("\n");
                    break;
                    
                case 3:
                    System.out.println("Digite el genero de musica que quiere escuchar ");
                    String gender = teclado.next();
                    ArrayList<Song> listForGender = libreria.filterGender(gender);
                    
                    if(listForGender.size() == 0) {
                        System.out.println("No existe cancion de este genero en la biblioteca");
                     } else {
                        for(Song song :  listForGender) {
                            System.out.println(song.show());
                        }
                    }
                    System.out.println("\n");
                    break;
                    
                case 4:
                    break;
                    
                default:
                    System.out.println("Opcion no valida.... \n\n");    
            }
        }while(opcion != 4);
    }
}