
package PlayList;

import java.util.ArrayList;

/**
 *
 * @author jhojan hoyos
 */
public class PlayList {
    
    String nombre;
    ArrayList<Song> lista;
    
    /**
     * constructor de la clase Playlist
     * @param nombre
     * @param lista 
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
