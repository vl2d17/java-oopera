import java.util.List;

public class Ballet extends MusicalShow {
    private String choreographer;

    public Ballet(String title, int duration, Director director,
            String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
                this.choreographer = choreographer;
    }
    public Ballet(String title, int duration, Director director,
                  String musicAuthor, String librettoText, String choreographer,
                  List<Actor> listOfActors) {
        super(title, duration, director, musicAuthor, librettoText, listOfActors);
        this.choreographer = choreographer;
}

    public String getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(String choreographer) {
        this.choreographer = choreographer;
    }

    @Override
public  String toString() {
    return "Ballet: " + getTitle() + "\n" +
            "Duration: " + getDuration() + " min\n" +
            "Director: " + getDirector().getFullName() + "\n" +
            "Music Author: " + getMusicAuthor() + "\n" +
            "Libretto: " + getLibrettoText() + "\n" +
            "Choreographer: " + choreographer + "\n" +
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
