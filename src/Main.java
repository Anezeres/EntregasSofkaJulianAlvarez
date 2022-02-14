package PlayList;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author jhojan hoyos
 */
public class Main {


    public static void main(String[] args) {

        System.out.println("***¡Bienvenido a nuestro programa de musica!***");
        Library libreria = new Library();
        libreria.list();
        menu(libreria);
    }
    
   
     public static boolean isNumeric(String answer) {

        boolean result;

        try {
            Integer.parseInt(answer);
            result = true;
        } catch (NumberFormatException excepcion) {
            result = false;
        }

        return result;
    }

    public static void menu(Library library) {

        System.out.println("#### ¿Que acción quieres realizar? ###");

        System.out.println("1. Mostrar todas la canciones.");
        System.out.println("2. Filtrar lista de canciones por año:");
        System.out.println("3. Filtrar lista de canciones por genero:");
        System.out.println("4. Crear PlayList:");
        System.out.println("5. Ordenar lista por duración:");
        System.out.println("6. Ordenar lista por año:");
        System.out.println("7. Mostrar todas las playlist creadas");
        System.out.println("Ingrese 8 u otro valor para finalizar.");
        System.out.println("Introduzca su respuesta: ");
        Scanner answer = new Scanner(System.in);
        String inputKeyboard = answer.nextLine();


     
        if (isNumeric(String.valueOf(inputKeyboard))) {

            int ship = Integer.parseInt(String.valueOf(inputKeyboard));

                 if (ship == 1) {

                    for(Song song : library.getSongList()){
                    System.out.println(song.show());
                }
                System.out.println("\n");
                menu(library);

            } else if (ship == 2) {

                System.out.println("Digite el año : ");
                String year = answer.nextLine();

                if(isNumeric(year)){
                    ArrayList<Song> listForYear = library.filterYear(Integer.parseInt(year));
                    if(listForYear.size() == 0) {
                        System.out.println("No hay cancion de ese año");
                    } else {
                        for(Song song :  listForYear) {
                            System.out.println(song.show());
                        }
                    }
                    System.out.println("\n");
                    menu(library);

                    }else{
                    System.out.println("Lo siento, no puede ingresar texto");
                    System.out.println("\n");
                    menu(library);
                }

            } else if (ship == 3) {

                System.out.println("Tenemos los siguientes géneros:");
                System.out.println("Trap");
                System.out.println("Vallenato");
                System.out.println("Salsa");
                System.out.println("\n");


                System.out.println("Digite el genero de musica que quiere escuchar ");
                String gender = answer.nextLine();

                if(! isNumeric(gender)){
                    ArrayList<Song> listForGender = library.filterGender(gender);
                     if(listForGender.size() == 0) {
                        System.out.println("No existe cancion de este genero en la biblioteca");
                    } else {
                        for(Song song :  listForGender) {
                            System.out.println(song.show());
                        }
                    }
                    System.out.println("\n");
                    menu(library);

                }else{
                    System.out.println("Lo siento, no pueden ingresar numeros");
                    System.out.println("\n");
                    menu(library);
                }

            } else if (ship == 4){
                System.out.println("Usted ha escogido crear una PlayList:");
                System.out.println("Ingrese el nombre de la PLayList");
                Scanner answer2 = new Scanner(System.in);
                String nameList = answer2.nextLine();

                System.out.println("Ingrese el numero de la cancion que quiere añadir:");
                String number = answer.nextLine();

                if(isNumeric(number)){

                    ArrayList<Song> PlayList = new ArrayList<>();

                    library.createPlayList(Integer.parseInt(number),nameList,PlayList);

                    System.out.println("\n");
                    menu(library);

                  }else{
                    System.out.println("Lo siento, no puede ingresar texto");
                    System.out.println("\n");
                    menu(library);
                }

            }else if (ship == 5) {
                ArrayList<Song> listDuration = library.orderListDuration();
                   for(Song song : listDuration){
                    System.out.println(song.showDuration());
                }
                System.out.println("\n");
                menu(library);

            }else if (ship == 6) {
                ArrayList<Song> listYear = library.orderListYear();
                   for(Song song : listYear){
                    System.out.println(song.showYear());
                }
                System.out.println("\n");
                menu(library);

            } else if (ship == 7) {
                ArrayList<PlayList> playList = library.getPlayList();
                   for(PlayList list : playList){
                        System.out.println("Lista: " + list.getNombre());
                   for (Song song: list.getLista()) {
                        System.out.println(song.show());
                    }
                        System.out.println("============================\n");
                }
                System.out.println("\n");
                menu(library);
            } else {
                System.out.println("El programa ha finalizado, Valor ingresado -> " + ship);
                System.out.println("\n");
            }


            } else {
            System.out.println("Lo siento, el valor ingresado no es correcto");
            System.out.println("\n");
            menu(library);
        }
     }
  }
