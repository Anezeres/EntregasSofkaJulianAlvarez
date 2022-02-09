package EntregasSofkaJulianAlvarez;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("src/EntregasSofkaJulianAlvarez/Images/JoeTalParaCual.jpg");
        BufferedImage bufferedImage = ImageIO.read(file);
        ImageIcon imageIcon = new ImageIcon(bufferedImage);

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


        //song1.songInfo(song1);
        song8.songInfo(song8);
    }
}
