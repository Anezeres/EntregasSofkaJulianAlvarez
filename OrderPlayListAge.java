
package PlayList;

import java.util.Comparator;

/**
 *
 * @author jhojan hoyos
 */
public class OrderPlayListAge implements Comparator<Song>{
    /**
     * esta interfaface es el metodo para definir el orden del playlist por año de lanzamiento
     * @param s1
     * @param s2
     * @return 
     */
    @Override
       public int compare(Song s1, Song s2) {
                return s1.getDate() > s2.getDate() ? 1 : -1;
    }
}

   
