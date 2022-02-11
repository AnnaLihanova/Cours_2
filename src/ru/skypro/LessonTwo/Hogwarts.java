package ru.skypro.LessonTwo;

public abstract class Hogwarts {
    private final String name;
    private final String surname;
    private final String faculty;
    private int conjure;
    private int transgress;

    public Hogwarts(String name, String surname, String faculty, int conjure, int transgress) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.conjure = conjure;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getConjure() {
        return conjure;
    }

    public void setConjure(int conjure) {
        this.conjure = conjure;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }


}

