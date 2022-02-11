package ru.skypro.LessonOne;

public class Person {
    public String name;
    public String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

//    public String getName() {
//        return name;
//    }
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setSurname(String surname) {
//       this.surname = surname;
//    }

}
