package TZ4;

import java.util.ArrayList;
import java.util.List;

public class MusicalShow extends Show {
    private String musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       String musicAuthor, String librettoText) {
        super(title, duration, director, new ArrayList<>());
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public MusicalShow(String title, int duration, Director director,
                       String musicAuthor, String librettoText, List<Actor> listOfActors) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }


    public String getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(String musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }


    public void printLibretto() {
        System.out.println("### Либретто спектакля '" + getTitle() + "'###");
        if (librettoText != null) {
            System.out.println(librettoText);
        } else {
            System.out.println("Либретто отсутствует");
        }
        System.out.println("### Конец либретто ###\n");
    }

    @Override
    public String toString() {
        String actorsStr = "";
        List<Actor> actors = getListOfActors();
        if (actors.isEmpty()) {
            actorsStr = "  No actors";
        } else {
            for (Actor actor : actors) {
                actorsStr += "  " + actor + "\n";
            }
        }

        return "Musical TZ4.Show: " + getTitle() + "\n" +
                "Duration: " + getDuration() + " min\n" +
                "TZ4.Director: " + getDirector().getName() + " " + getDirector().getSurname() + "\n" +
                "Music Author: " + (musicAuthor != null ? musicAuthor : "Unknown") + "\n" +
                "Libretto: " + (librettoText != null ? librettoText : "No libretto") + "\n" +
                "Actors:\n" + actorsStr;
    }
}