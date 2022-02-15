
package EntregasSofkaJulianAlvarez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * La funcion de esta clase es generar una lista de 20 canciones, para poder realizar filtraciones con ellas.
 *
 * @version 1.0.0
 *
 * @author Julian Alvarez
 * @author jhojan hoyos
 */
public class Library {
     private ArrayList<Song> songList;
     private ArrayList<PlayList> playList;

    /**
     * constructor de la clase
     */
    public Library() {
        this.playList = new ArrayList<>();
    }


    /**
     * Getters and Setters de los atributos.
     */
    public ArrayList<Song> getSongList() {
        return songList;
    }

    public void setSongList(ArrayList<Song> songList) {
        this.songList = songList;
    }

    public ArrayList<PlayList> getPlayList() {
        return playList;
    }

    public void setPlayList(ArrayList<PlayList> playList) {
        this.playList = playList;
    }


    
    /**
     * Esta funcion me ayuda a indentificar si el valor enviado por el usuario es un entero o no.
     *
     * @param answer -> Es una respuesta tipo String.
     * @return -> Boolean, Que me indica si el String (answer) posee un valor de tipo entero.
     */
    public static boolean isNumeric(String answer) {
      boolean  result;
      try {
            Integer.parseInt(answer);
              result = true;
          } catch (NumberFormatException excepcion) {
               result = false;
        }

        return result;
    }
    /**
     * Metodo lista que guarda los datos de las canciones
     */
    public void list(){
        ArrayList<Song> list = new ArrayList<>();
        Song song1 = new Song(
                01,
                "Joe Arroyo",
                "La Rebelión",
                "Salsa",
                2007,
                "6:16",
                "La rebelión describe el esclavismo despiadado y el poblamiento"
                        + " de la calurosa Cartagena de Indias con esclavos "
                        + "traídos del continente africano y su sometimiento sangriento.",
                "src/EntregasSofkaJulianAlvarez/Images/JoeTalParaCual.jpg"
        );

        Song song2 = new Song(
                2,
                "Joe Arroyo",
                "La Noche",
                "Salsa",
                2010,
                "4:23",
                "Esta cancion hace parte del album 'Joe arroyo y la verdad'",
                "src/EntregasSofkaJulianAlvarez/Images/JoeTalParaCual.jpg"
        );

        Song song3 = new Song(
                3,
                "Joe Arroyo",
                "Tania",
                "Salsa",
                2010,
                "3:39",
                "Esta cancion hace parte del album 'fuego",
                "src/EntregasSofkaJulianAlvarez/Images/JoeTalParaCual.jpg"
        );
        Song song4 = new Song(
                4,
                "Eddie Santiago",
                "Que locura enamorarme de ti",
                "Salsa",
                2000,
                "5:03",
                "Esta cancion hace parte del album 'Atrevido y diferente",
                "src/EntregasSofkaJulianAlvarez/Images/Eddie.jpg"
        );
        Song song5 = new Song(
                5,
                "Willie colon",
                "idilio",
                "Salsa",
                2000,
                "5:09",
                "Esta cancion hace parte del album 'Echo en Puerto Rico",
                "src/EntregasSofkaJulianAlvarez/Images/willie-colon_idilio.jpg"
        );
        Song song6 = new Song(
                6,
                "Diomedez Diaz",
                "La rasquiñita",
                "vallenato",
                1984,
                "3:51",
                "Esta cancion hace parte del album 'El mundo",
                "src/EntregasSofkaJulianAlvarez/Images/Diomedez.jpg"
        );
        Song song7 = new Song(
                7,
                "Los hermanos Zuleta",
                "Tu forma de amar",
                "vallenato",
                1996,
                "4:22",
                "Esta cancion hace parte del album 'Siempre vallenato",
                "src/EntregasSofkaJulianAlvarez/Images/Hermanos.jpg"
        );
        Song song8 = new Song(
                8,
                "Silvestre Dangoond",
                "Del Ahogao, El Sombrero",
                "vallenato",
                2010,
                "4:23",
                "Esta cancion hace parte del album 'Cantinero",
                "src/EntregasSofkaJulianAlvarez/Images/Silvestre.jpg"
        );
        Song song9 = new Song(
                9,
                "Silvestre Dangoond",
                "La moza",
                "vallenato",
                2008,
                "4:01",
                "Esta cancion hace parte del album 'El original'",
                "src/EntregasSofkaJulianAlvarez/Images/Silvestre.jpg"
        );
        Song song10 = new Song(
                10,
                "Kaleth Moarles",
                "Ella es mi todo",
                "vallenato",
                2008,
                "4:01",
                "Esta cancion hace parte del album 'Unico'",
                "src/EntregasSofkaJulianAlvarez/Images/Kaleth.jpg"
        );

        Song song11 = new Song(
                11,
                "Bad Bunny",
                "Te mudaste",
                "Trap",
                2020,
                "2:10",
                "Esta cancion hace parte del album 'El ultimo tour del mundo'",
                "src/EntregasSofkaJulianAlvarez/Images/ElUltimoTourDelMundo.jpg"
        );

        Song song12 = new Song(
                12,
                "Bad Bunny",
                "El mundo es mio",
                "Trap",
                2020,
                "2:45",
                "Esta cancion hace parte del album 'El ultimo tour del mundo'",
                "src/EntregasSofkaJulianAlvarez/Images/ElUltimoTourDelMundo.jpg"
        );

        Song song13 = new Song(
                13,
                "Bad Bunny",
                "Hoy cobre",
                "Trap",
                2020,
                "2:10",
                "Esta cancion hace parte del album 'El ultimo tour del mundo'",
                "src/EntregasSofkaJulianAlvarez/Images/ElUltimoTourDelMundo.jpg"
        );

        Song song14 = new Song(
                14,
                "Bad Bunny",
                "Booker T",
                "Trap",
                2020,
                "2:36",
                "Esta cancion hace parte del album 'El ultimo tour del mundo'",
                "src/EntregasSofkaJulianAlvarez/Images/ElUltimoTourDelMundo.jpg"
        );

        Song song15 = new Song(
                15,
                "Bad Bunny",
                "Dakiti",
                "Trap",
                2020,
                "3:25",
                "Esta cancion hace parte del album 'El ultimo tour del mundo'",
                "src/EntregasSofkaJulianAlvarez/Images/ElUltimoTourDelMundo.jpg"
        );

        Song song16 = new Song(
                16,
                "Bad Bunny",
                "Ni bien ni mal",
                "Trap",
                2018,
                "3:56",
                "Esta cancion hace parte del album 'X100PRE'",
                "src/EntregasSofkaJulianAlvarez/Images/X100PRE.jpg"
        );

        Song song17 = new Song(
                17,
                "Bad Bunny",
                "200 Mph",
                "Trap",
                2018,
                "2:50",
                "Esta cancion hace parte del album 'X100PRE'",
                "src/EntregasSofkaJulianAlvarez/Images/X100PRE.jpg"
        );

        Song song18 = new Song(
                18,
                "Bad Bunny",
                "Caro",
                "Trap",
                2018,
                "3:49",
                "Esta cancion hace parte del album 'X100PRE'",
                "src/EntregasSofkaJulianAlvarez/Images/X100PRE.jpg"
        );

        Song song19 = new Song(
                19,
                "Bad Bunny",
                "Solo de Mi",
                "Trap",
                2018,
                "3:17",
                "Esta cancion hace parte del album 'X100PRE'",
                "src/EntregasSofkaJulianAlvarez/Images/X100PRE.jpg"
        );

        Song song20 = new Song(
                20,
                "Bad Bunny",
                "La Romana",
                "Trap",
                2018,
                "5:00",
                "Esta cancion hace parte del album 'X100PRE'",
                "src/EntregasSofkaJulianAlvarez/Images/X100PRE.jpg"
        );


        list.add(song1);
        list.add(song2);
        list.add(song3);
        list.add(song4);
        list.add(song5);
        list.add(song6);
        list.add(song7);
        list.add(song8);
        list.add(song9);
        list.add(song10);
        list.add(song11);
        list.add(song12);
        list.add(song13);
        list.add(song14);
        list.add(song15);
        list.add(song16);
        list.add(song17);
        list.add(song18);
        list.add(song19);
        list.add(song20);

        setSongList(list);
    }
    
    /**
     * metodo que filtra y guardan una lista las canciones por año de lanzamiento
     * @param date año que se quiere filtrar
     * @return 
     */
    public ArrayList<Song> filterYear(int date) {
        ArrayList<Song> listYear = new ArrayList<>();
         for(Song song: this.songList) {
            if(song.getDate() == date) {
                listYear.add(song);
            }
        }
        return listYear;
    }
    
    /**
     * metodo que filtra y guarda en una lista las canciones por genero musical
     * @param gender genero de la cancion que quiere filtrar.
     * @return 
     */
    public ArrayList<Song> filterGender(String gender) {
        ArrayList<Song> listGender = new ArrayList<>();
         for(Song song: this.songList) {
            if(song.getGender().toLowerCase().equals(gender.toLowerCase())) {
                listGender.add(song);
            }
        }
        return listGender;
    }

    /**
     * Este metodo es el encargado de generar una playList
     *
     * @param number numero de la cancion, de 1 - 20
     * @param name Nombre de la cancion.
     * @param newPlayList PlayList
     */
    
     public void createPlayList(int number, String name, ArrayList<Song> newPlayList) {
        
        if (newPlayList.size() != 20) {
           boolean encontro = false;
             for(Song song: this.songList) {
                if(song.getIdentifier() == number) {
                    encontro = true;
                    newPlayList.add(song);
                }
            }
                if(!encontro) {
                System.out.println("El valor, no se encuentra en la lista.");
            }
            
            short option = 0;
            Scanner newItem = new Scanner(System.in);
                do {
                System.out.println("1. Desea agregar otra cancion?");
                System.out.println("2. Terminar");
                System.out.println("Opcion:");
                option = newItem.nextShort();
                switch (option) {
                    case 1:
                        System.out.println("Ingrese el numero de la cancion que quiere añadir:");
                        String newSongList= newItem.next();

                        if(isNumeric(newSongList)){
                            createPlayList(Integer.parseInt(newSongList),name,newPlayList);
                            option = 2;
                        } else {
                            System.out.println("El valor ingresado no es numerico");
                        }
                        break;
                        
                    case 2:
                        this.playList.add(new PlayList(name, newPlayList));
                            System.out.println("Lista agregada");
                        break;
                    default:
                            System.out.println("Opcion no valida");
                        }
                   } while(option != 2);
                  } else{
                System.out.println("Lo siento, la lista esta llena.");
            }
        }
     
     
    /**
     * metodo que enlista de manera ascendente las canciones de la biblioteca por duracion
     * @return 
     */
     public ArrayList<Song> orderListDuration(){
        ArrayList<Song> listDuration = (ArrayList<Song>) this.songList.clone();
            Collections.sort(listDuration, new OrderPlayListDuration());
                return listDuration;
            }
    /**
     * metodo que enlista de manera ascendente las canciones de la biblioteca por año de lanzamiento
     * @return 
     */
     public ArrayList<Song> orderListYear(){
        ArrayList<Song> listYear = (ArrayList<Song>) this.songList.clone();
            Collections.sort(listYear, new OrderPlayListAge());
                return listYear;
            }
        
      }