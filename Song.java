package EntregasSofkaJulianAlvarez;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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
     * @param cover es la descripcion de la cancion.
     */
    public Song(int identifier, String author, String title, String gender, int date, String duration, String description,String cover) {
        this.identifier = identifier;
        this.author = author;
        this.title = title;
        this.gender = gender;
        this.date = date;
        this.duration = duration;
        this.description = description;
        this.cover = cover;
    }

    public void songInfo(Song info){
        File file = new File(info.getCover());
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ImageIcon imageIcon = new ImageIcon(bufferedImage);


        JFrame jFrame = new JFrame();
        jFrame.setTitle(info.getTitle()); // Colocar titulo
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(500, 750);

        JLabel author = new JLabel();
        author.setText("Autor: " + info.getAuthor());
        author.setBounds(500,500,500,80);
        author.setHorizontalAlignment(SwingConstants.CENTER);
        author.setFont(new Font("cooper black",0,45));
        jFrame.add(author);

        JLabel name = new JLabel();
        name.setText("Nombre: " + info.getTitle());
        name.setBounds(85,10,300,80);
        name.setHorizontalAlignment(SwingConstants.CENTER);
        name.setFont(new Font("cooper black",0,40));
        jFrame.add(name);

        JLabel gender = new JLabel();
        gender.setText("Género: " + info.getGender());
        gender.setBounds(85,10,300,80);
        gender.setHorizontalAlignment(SwingConstants.CENTER);
        gender.setFont(new Font("cooper black",0,55));
        jFrame.add(gender);

        JLabel year = new JLabel();
        year.setText("Año: " + info.getDate());
        year.setBounds(85,10,300,80);
        year.setHorizontalAlignment(SwingConstants.CENTER);
        year.setFont(new Font("cooper black",0,55));
        jFrame.add(year);

        JLabel duration = new JLabel();
        duration.setText("Duración: " + info.getDuration());
        duration.setBounds(85,10,300,80);
        duration.setHorizontalAlignment(SwingConstants.CENTER);
        duration.setFont(new Font("cooper black",0,55));
        jFrame.add(duration);


        JLabel jLabel = new JLabel();
        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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


}
