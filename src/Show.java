package TZ4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director, List<Actor> listOfActors) {
        this.title = Objects.requireNonNull(title, "Title cannot be null");
        setDuration(duration);
        this.director = Objects.requireNonNull(director, "TZ4.Director cannot be null");
        this.listOfActors = listOfActors != null ?
                new ArrayList<>(listOfActors) : new ArrayList<>();
    }

    // Геттеры и сеттеры
    public String getTitle() {
        return title; }
    public void setTitle(String title) {

        this.title = Objects.requireNonNull(title, "Title cannot be null");
    }

    public int getDuration() { return duration; }
    public void setDuration(int duration) {
        if (duration <= 0) {
            throw new IllegalArgumentException("Duration must be positive: " + duration);
        }
        this.duration = duration;
    }

    public Director getDirector() { return director; }
    public void setDirector(Director director) {
        this.director = Objects.requireNonNull(director, "TZ4.Director cannot be null");
    }

    public List<Actor> getListOfActors() {
        return new ArrayList<>(listOfActors);
    }

    public void setListOfActors(List<Actor> listOfActors) {
        this.listOfActors = listOfActors != null ?
                new ArrayList<>(listOfActors) : new ArrayList<>();
    }


    public void printAllActors() {
        System.out.println("### Актеры спектакля '" + title + "' ###");
        if (listOfActors.isEmpty()) {
            System.out.println("В спектакле пока нет актеров.");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println("- " + actor.toString());
            }
        }
        System.out.println();
    }


    public void addActor(Actor newActor) {
        if (newActor == null) {
            System.out.println("Ошибка: передан null объект актёра.");
            return;
        }
        if (newActor.getName() == null || newActor.getSurname() == null) {
            System.out.println("Ошибка: у актера не указано имя или фамилия.");
            return;
        }


        if (listOfActors.contains(newActor)) {
            System.out.println("Предупреждение: актер " + newActor.getName() + " " +
                    newActor.getSurname() + " уже участвует в спектакле!");
                return;
            }

        listOfActors.add(newActor);
        System.out.println("Актёр " + newActor.getName() + " " + newActor.getSurname() +
                " добавлен в спектакль.");
    }


    public void replaceActor(String surnameToReplace, Actor newActor) {
        if (surnameToReplace == null || surnameToReplace.trim().isEmpty()) {
            System.out.println("Ошибка: фамилия для замены не указана.");
            return;
        }
        if (newActor == null) {
            System.out.println("Ошибка: передан null объекта нового актера.");
            return;
        }
        if (newActor.getName() == null || newActor.getSurname() == null) {
            System.out.println("Ошибка: у актера не указано имя или фамилия");
            return;
        }

        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.getSurname().equalsIgnoreCase(surnameToReplace)) {
                // Проверяем, не пытаемся ли заменить на того же актёра
                if (currentActor.equals(newActor)) {
                    System.out.println("Предупреждение: новый актёр совпадает с заменяемым!");
                    return;
                }
                listOfActors.set(i, newActor);
                System.out.println("Актёр " + currentActor.getName() + " " + currentActor.getSurname() +
                        " заменён на " + newActor.getName() + " " + newActor.getSurname());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Предупреждение: актёр с фамилией '" + surnameToReplace +
                    "' не найден в спектакле.");
        }
    }


    public void printDirectorInfo() {
        if (director == null) {
            System.out.println("Режиссер спектакля '" + title + "': Не назначен");
            return;
        }
        System.out.println("Режиссер спектакля '" + title + "': " +
                director.toString());
    }

    @Override
    public String toString() {
        String actors = "";
        for (Actor actor : listOfActors) {
            actors += "  " + actor.toString() + "\n";
        }

        return "Play: " + title + "\n" +
                "Duration: " + duration + " min\n" +
                "TZ4.Director: " + getDirector().getFullName() + "\n" +
                "Actors:\n" + actors;
    }
}


