
package PlayList;
     /**
 *
 * @author jhojan hoyoa
 */
public class Song {

    private int identifier;
    private String author;
    private String title;
    private String gender;
    private int date;
    private String duration;
    private String description;
    private String cover;

    /**
     * @param identifier ID unico de la cancion.
     * @param author representa el autor de la cancion.
     * @param title titulo de la cancion.
     * @param gender genero de la cancion.
     * @param date es la fecha de creacion de la cancion.
     * @param duration representa la duracion total de la cancion.
     * @param description es la descripcion de la cancion.
     */
    public Song(int identifier, String author, String title, String gender, int date,
            String duration, String description) {
        this.identifier = identifier;
        this.author = author;
        this.title = title;
        this.gender = gender;
        this.date = date;
        this.duration = duration;
        this.description = description;
        this.cover = cover;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String mostrar(){
        return this.getIdentifier()+ " " + this.getTitle()+ "-" + this.getAuthor();
   }
 }

