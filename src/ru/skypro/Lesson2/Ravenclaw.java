package ru.skypro.Lesson2;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, String surname, String faculty, int conjure, int transgress, int smart, int wise, int witty, int creativity) {
        super(name, surname, faculty, conjure, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return
                getName() + " " +
                        getSurname() +
                        "; Факультет: " + getFaculty() +
                        "; Сила магии: " + getConjure() +
                        "; Возможность трансгресии: " + getTransgress() +
                        "; ум: " + smart +
                        "; мудрость: " + wise +
                        "; остроумие: " + witty +
                        "; творчество: " + creativity;
    }
}
