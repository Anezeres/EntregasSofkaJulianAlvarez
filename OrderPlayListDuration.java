
package EntregasSofkaJulianAlvarez;

import java.util.Comparator;

/**
 * Este apartado se encarga de ordenar la lista de 20 canciones por duración de menor a mayor.
 *
 * @version 1.0.0
 *
 * @author Julian Alvarez
 * @author jhojan hoyos
 */
public class OrderPlayListDuration implements Comparator<Song>{

    @Override
     public int compare(Song s1, Song s2) {
                return s1.getDuration().compareTo(s2.getDuration());
         }
      }
        

    
