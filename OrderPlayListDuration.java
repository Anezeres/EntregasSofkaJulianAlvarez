
package PlayList;

import java.util.Comparator;

/**
 *
 * @author tatiana
 */
public class OrderPlayListDuration implements Comparator<Song>{

    @Override
     public int compare(Song s1, Song s2) {
                return s1.getDuration().compareTo(s2.getDuration());
         }
      }
        

    
