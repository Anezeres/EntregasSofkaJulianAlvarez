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
                "",
                "src/EntregasSofkaJulianAlvarez/Images/JoeTalParaCual.jpg"
        );

        Song song3 = new Song(
                3,
                "Joe Arroyo",
                "Tania",
                "Salsa",
                2010,
                "3:39",
                "dedicada a aquella persona que amas ",
                "src/EntregasSofkaJulianAlvarez/Images/JoeTalParaCual.jpg"
        );
        Song song4 = new Song(
                4,
                "Eddie Santiago",
                "Que locura enamorarme de ti",
                "Salsa",
                2000,
                "5:03",
                "",
                "src/EntregasSofkaJulianAlvarez/Images/Eddie.jpg"
        );
        Song song5 = new Song(
                5,
                "Willie colon",
                "idilio",
                "Salsa",
                2000,
                "5:09",
                "",
                "src/EntregasSofkaJulianAlvarez/Images/willie-colon_idilio.jpg"
        );
        Song song6 = new Song(
                6,
                "Diomedez Diaz",
                "La rasquiñita",
                "vallenato",
                1984,
                "3:51",
                "",
                "src/EntregasSofkaJulianAlvarez/Images/Diomedez.jpg"
        );
        Song song7 = new Song(
                7,
                "Los hermanos Zuleta",
                "Tu forma de amar",
                "vallenato",
                1996,
                "4:22",
                "",
                "src/EntregasSofkaJulianAlvarez/Images/Hermanos.jpg"
        );
        Song song8 = new Song(
                8,
                "Silvestre Dangoond",
                "Del Ahogao, El Sombrero",
                "vallenato",
                2010,
                "4:23",
                "",
                "src/EntregasSofkaJulianAlvarez/Images/Silvestre.jpg"
        );
        Song song9 = new Song(
                9,
                "Silvestre Dangoond",
                "La moza",
                "vallenato",
                2008,
                "4:01",
                "",
                "src/EntregasSofkaJulianAlvarez/Images/Silvestre.jpg"
        );
        Song song10 = new Song(
                10,
                "Kaleth Moarles",
                "Ella es mi todo",
                "vallenato",
                2008,
                "4:01",
                "",
                "src/EntregasSofkaJulianAlvarez/Images/Kaleth.jpg"
        );

        Song song11 = new Song(
                11,
                "Bad Bunny",
                "TE MUDASTE",
                "Trap",
                2020,
                "2:10",
                "Esta cancion hace parte del album 'El ultimo tour del mundo'",
                "src/EntregasSofkaJulianAlvarez/Images/ElUltimoTourDelMundo.jpg"
        );

        Song song12 = new Song(
                12,
                "Bad Bunny",
                "EL MUNDO ES MÍO",
                "Trap",
                2020,
                "2:45",
                "Esta cancion hace parte del album 'El ultimo tour del mundo'",
                "src/EntregasSofkaJulianAlvarez/Images/ElUltimoTourDelMundo.jpg"
        );

        Song song13 = new Song(
                13,
                "Bad Bunny",
                "HOY COBRÉ",
                "Trap",
                2020,
                "2:10",
                "Esta cancion hace parte del album 'El ultimo tour del mundo'",
                "src/EntregasSofkaJulianAlvarez/Images/ElUltimoTourDelMundo.jpg"
        );

        Song song14 = new Song(
                14,
                "Bad Bunny",
                "BOOKET T",
                "Trap",
                2020,
                "2:36",
                "Esta cancion hace parte del album 'El ultimo tour del mundo'",
                "src/EntregasSofkaJulianAlvarez/Images/ElUltimoTourDelMundo.jpg"
        );

        Song song15 = new Song(
                15,
                "Bad Bunny",
                "DÁKITI",
                "Trap",
                2020,
                "3:25",
                "Esta cancion hace parte del album 'El ultimo tour del mundo'",
                "src/EntregasSofkaJulianAlvarez/Images/ElUltimoTourDelMundo.jpg"
        );

        Song song16 = new Song(
                16,
                "Bad Bunny",
                "NI BIEN NI MAL",
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
      //song1.songInfo(song1);
        song8.songInfo(song8);
}
}