
package PlayList;

import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      
      Library libreria = new Library();
         libreria.lista();
          for(Song song : libreria.getSongList()){
              System.out.println(song.mostrar());
         
}
}
}
