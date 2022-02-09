
package PlayList;

import java.util.ArrayList;
/**
 * 
 * @author jhojan hoyos
 */

public class Library {

    public ArrayList<Song> songList;
    /**
     * constructor de la clase
     */
    public Library() {
         
    }
    /**
    * metodo set de atributo lista musica
    * @param songList 
    */
    public Library(ArrayList<Song> songList) {
        this.songList = songList;
    }

    public ArrayList<Song> getSongList() {
        return songList;
    }

    public void setSongList(ArrayList<Song> songList) {
        this.songList = songList;
    }
       
    /**
     * Metodo lista que guarda los datos de las canciones
     */
    public void lista(){
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
                       + "traídos del continente africano y su sometimiento sangriento."
                );
  
       Song song2 = new Song(
                02,
                "Joe Arroyo",
                "La Noche",
                "Salsa",
                2010,
                "4:23",
                ""
        );
       
        Song song3 = new Song(
                03,
                "Joe Arroyo",
                "Tania",
                "Salsa",
                2010,
                "4:23",
                "dedicada a aquella persona que amas "
        );
        Song song4 = new Song(
                04,
                "Eddie Santiago",
                "Que locura enamorarme de ti",
                "Salsa",
                2000,
                "5:03",
                ""
        );
        Song song5 = new Song(
                05,
                "Willie colon",
                "idilio",
                "Salsa",
                2000,
                "5:09",
                ""
        );
        Song song6 = new Song(
                05,
                "Diomedez Diaz",
                "La rasquiñita",
                "vallenato",
                1984,
                "3:51",
                ""
        );
        Song song7 = new Song(
                05,
                "Los hermanos Zuleta",
                "Tu forma de amar",
                "vallenato",
                1996,
                "4:22",
                ""
        );
        Song song8 = new Song(
                05,
                "Silvestre Dangoond",
                "Del Ahogao, El Sombrero",
                "vallenato",
                2010,
                "4:23",
                ""
        );
         Song song9 = new Song(
                05,
                "Silvestre Dangoond",
                "La moza",
                "vallenato",
                2008,
                "4:01",
                ""
        );
         Song song10 = new Song(
                05,
                "Kaleth Moarles",
                "Ella es mi todo",
                "vallenato",
                2008,
                "4:01",
                ""
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
      setSongList(list);
}
}