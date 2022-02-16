package ru.skypro.Lesson2;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, String faculty, int conjure, int transgress, int nobility, int honor, int bravery) {
        super(name, surname, faculty, conjure, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return
                getName() + " " +
                        getSurname() +
                        "; Факультет: " + getFaculty() +
                        "; Сила магии: " + getConjure() +
                        "; Возможность трансгресии: " + getTransgress() +
                        "; благородство: " + nobility +
                        "; честь: " + honor +
                        "; храбрость: " + bravery;
    }


}
