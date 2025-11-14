package TZ4;

import java.util.List;

public class Opera extends MusicalShow {
    private int choirSize;

      public Opera(String title, int duration, Director director,
                 String musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public Opera(String title, int duration, Director director,
                 String musicAuthor, String librettoText, int choirSize, List<Actor>
                 listOfActors) {
        super(title, duration, director, musicAuthor, librettoText, listOfActors);
        this.choirSize = choirSize;
    }
    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }
@Override
public String toString() {
    return "TZ4.Opera: " + getTitle() + "\n" +
            "Duration: " + getDuration() + " min\n" +
            "TZ4.Director: " + getDirector().getFullName() + "\n" +
            "Music Author: " + getMusicAuthor() + "\n" +
            "Libretto: " + getLibrettoText() + "\n" +
            "Choir Size: " + choirSize + " people\n" +
            "Actors:\n" + getActorsString();
}
    private String getActorsString() {
        String actors = "";
        for (Actor actor : getListOfActors()) {
            actors += "  " + actor.toString() + "\n";
        }
        return actors;
    }
}
