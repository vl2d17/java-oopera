public class Director extends Person {

    private int numberOfShows;

    public Director(String name, String surname, String gender,
                    int numberOfShows) {
        super(name, surname, gender);
        setNumberOfShows(numberOfShows);
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {

        return getName() + " " + getSurname() + " (постановок: " +
                numberOfShows + ")";
    }
}
