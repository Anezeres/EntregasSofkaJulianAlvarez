
package EntregasSofkaJulianAlvarez;

import java.util.ArrayList;

/**
 * Esta clase es la encargada de generar una playlist con nombre y sus canciones.
 *
 * @version 1.0.0
 *
 * @author Julian Alvarez
 * @author jhojan hoyos
 */
public class PlayList {
    
    String nombre;
    ArrayList<Song> lista;
    
    /**
     * constructor de la clase Playlist
     * @param nombre indica el nombre de la PLayList
     * @param lista Representa la lista de canciones.
     */
    public PlayList(String nombre, ArrayList<Song> lista) {
        this.nombre = nombre;
        this.lista = lista;
    }
    
    /**
     * getters and setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Song> getLista() {
        return lista;
    }
 
    public void setLista(ArrayList<Song> lista) {
        this.lista = lista;
    }
   
}
