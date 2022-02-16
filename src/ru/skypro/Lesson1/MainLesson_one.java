package ru.skypro.Lesson1;

import java.util.Arrays;

public class MainLesson_one {

    public static void main(String[] args) {
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }

    private static void task5() {
        System.out.println("Задание 5");
        int value = 33;
        System.out.println(value);
        changeValue5(value);
        System.out.println(value);
        System.out.println("================");
    }

    private static void task6() {
        System.out.println("Задание 6");
        Integer value = 33;
        System.out.println(value);
        changeValue6(value);
        System.out.println(value);
        System.out.println("================");
    }

    private static void task7() {
        System.out.println("Задание 7");
        Integer[] value = {3, 4};
        System.out.println(Arrays.toString(value));
        changeValue7(value);
        System.out.println(Arrays.toString(value));
        System.out.println("================");
    }

    private static void task8() {
        System.out.println("Задание 8");
        Integer[] value = {3, 4};
        System.out.println(Arrays.toString(value));
        changeValue8(value);
        System.out.println(Arrays.toString(value));
        System.out.println("================");
    }

    private static void task9() {
        System.out.println("Задание 9");
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println("person.toString() = " + person.toString());
        changePerson9(person);
        System.out.println("person.toString() = " + person.toString());
        System.out.println("================");
    }

    private static void task10() {
        System.out.println("Задание 10");
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println("person.toString() = " + person.toString());
        changePerson10(person);
        System.out.println("person.toString() = " + person.toString());
        System.out.println("================");
    }

    public static void changeValue5(int value) {
        value = 22;
        System.out.println("Значение метода: " + value);
    }

    public static void changeValue6(Integer value) {
        value = 22;
        System.out.println("Значение метода: " + value);
    }

    public static void changeValue7(Integer[] value) {
        value = new Integer[]{1, 2};
        System.out.println("Значение метода: " + Arrays.toString(value));
    }

    public static void changeValue8(Integer[] value) {
        value[0] = 99;
        System.out.println("Значение метода: " + Arrays.toString(value));
    }

    public static void changePerson9(Person person) {
        person = new Person("Ilya", "Lagutenko");
        System.out.println("Значение метода: " + person.toString());
    }

    public static void changePerson10(Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";
        System.out.println("Значение метода: " + person.toString());
    }
}
