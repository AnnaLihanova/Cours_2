package ru.skypro.LessonTwo;

public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, String surname, String faculty, int conjure, int transgress, int hardworking, int loyal, int honest) {
        super(name, surname, faculty, conjure, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return
                getName() + " " +
                        getSurname() +
                        "; Факультет: " + getFaculty() +
                        "; Сила магии: " + getConjure() +
                        "; Возможность трансгресии: " + getTransgress() +
                        "; трудолюбие: " + hardworking +
                        "; верность: " + loyal +
                        "; честность: " + honest;
    }
}
