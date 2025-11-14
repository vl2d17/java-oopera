package TZ4;

import java.util.Objects;

enum Gender {
    MALE,
    FEMALE,
    OTHER
}

public class Person {
    private String name;
    private String surname;
    private Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public Gender getGender() {

        return gender;
    }

    public void setGender(Gender gender) {

        this.gender = gender;
    }

    public String getFullName() {

        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name != null ? name.toLowerCase() : null,
                person.name != null ? person.name.toLowerCase() : null) &&
                Objects.equals(surname != null ? surname.toLowerCase() : null,
                        person.surname != null ? person.surname.toLowerCase() :
                        null) && gender == person.gender;

    }

    @Override
    public int hashCode() {
        return  Objects.hash(
        name != null ? name.toLowerCase() : null,
        surname != null ? surname.toLowerCase() : null,
        gender);
    }
}
