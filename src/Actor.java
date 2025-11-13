import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, String gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Actor actor = (Actor) o;
        return height == actor.height;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), height);
    }

    @Override
    public String toString() {

        return getName() + " " + getSurname() + " (" + height + " см)";
    }
}
