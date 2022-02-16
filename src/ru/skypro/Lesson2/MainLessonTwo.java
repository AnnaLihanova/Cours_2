package ru.skypro.Lesson2;

public class MainLessonTwo {

    public static void main(String[] args) {

        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", "Поттер", "Гриффиндор", 80, 56, 75, 80, 65),
                new Gryffindor("Гермиона", "Грейнджер", "Гриффиндор", 90, 65, 80, 64, 75),
                new Gryffindor("Рон", "Уизли", "Гриффиндор", 45, 56, 55, 68, 88),
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", "Пуффендуй", 52, 65, 85, 65, 80),
                new Hufflepuff("Седрик", "Диггори", "Пуффендуй", 65, 80, 55, 90, 75),
                new Hufflepuff("Джастин", "Финч-Флетчли", "Пуффендуй", 84, 35, 90, 25, 74),
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг", "Когтевран", 56, 85, 54, 73, 21, 49),
                new Ravenclaw("Падма", "Патил", "Когтевран", 85, 76, 41, 87, 97, 48),
                new Ravenclaw("Маркус", "Белби", "Когтевран", 72, 41, 34, 88, 33, 63),
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", "Слизерин", 53, 68, 85, 74, 98, 87, 86),
                new Slytherin("Грэхэм", "Малфой", "Монтегю", 65, 24, 38, 47, 85, 91, 46),
                new Slytherin("Грегори", "Гойл", "Слизерин", 72, 34, 25, 41, 30, 17, 66)
        };

        printAboutStudent(gryffindors[1]);
        compareFacultyStudents(gryffindors[0], gryffindors[2]);
        compareFacultyStudents(hufflepuffs[0], hufflepuffs[1]);
        compareFacultyStudents(ravenclaws[1], ravenclaws[2]);
        compareFacultyStudents(slytherins[1], slytherins[0]);
        compareStudents(ravenclaws[1], gryffindors[2]);
    }

    public static void printAboutStudent(Hogwarts student) {
        System.out.println(student);
    }

    public static void compareFacultyStudents(Gryffindor gryffindor1, Gryffindor gryffindor2) {
        if (gryffindor1 == null || gryffindor2 == null) {
            System.out.println("Сравнение невозможно");
            return;
        }
        if (gryffindor1.getNobility() > gryffindor2.getNobility()) {
            System.out.println("У " + gryffindor1.getName() + " больше благородства, чем у " + gryffindor2.getName());
        } else {
            System.out.println("У " + gryffindor2.getName() + " больше благородства, чем у " + gryffindor1.getName());
        }
        if (gryffindor1.getHonor() > gryffindor2.getHonor()) {
            System.out.println("У " + gryffindor1.getName() + " больше чести, чем у " + gryffindor2.getName());
        } else {
            System.out.println("У " + gryffindor2.getName() + " больше чести, чем у " + gryffindor1.getName());
        }
        if (gryffindor1.getBravery() > gryffindor2.getBravery()) {
            System.out.println(gryffindor1.getName() + " храбрее " + gryffindor2.getName());
        } else {
            System.out.println(gryffindor2.getName() + " храбрее " + gryffindor1.getName());
        }
        System.out.println("=================");
    }

    public static void compareFacultyStudents(Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
        if (hufflepuff1 == null || hufflepuff2 == null) {
            System.out.println("Сравнение невозможно");
            return;
        }
        if (hufflepuff1.getHardworking() > hufflepuff2.getHardworking()) {
            System.out.println(hufflepuff1.getName() + " трудолюбивее " + hufflepuff2.getName());
        } else {
            System.out.println(hufflepuff2.getName() + " трудолюбивее " + hufflepuff1.getName());
        }
        if (hufflepuff1.getLoyal() > hufflepuff2.getLoyal()) {
            System.out.println(hufflepuff1.getName() + " более верный, чем " + hufflepuff2.getName());
        } else {
            System.out.println(hufflepuff2.getName() + " более верный, чем " + hufflepuff1.getName());
        }
        if (hufflepuff1.getHonest() > hufflepuff2.getHonest()) {
            System.out.println(hufflepuff1.getName() + " честнее " + hufflepuff2.getName());
        } else {
            System.out.println(hufflepuff2.getName() + " честнее " + hufflepuff1.getName());
        }
        System.out.println("=================");
    }

    public static void compareFacultyStudents(Ravenclaw ravenclaw1, Ravenclaw ravenclaw2) {
        if (ravenclaw1 == null || ravenclaw2 == null) {
            System.out.println("Сравнение невозможно");
            return;
        }
        if (ravenclaw1.getSmart() > ravenclaw2.getSmart()) {
            System.out.println(ravenclaw1.getName() + " умнее " + ravenclaw2.getName());
        } else {
            System.out.println(ravenclaw2.getName() + " умнее " + ravenclaw1.getName());
        }
        if (ravenclaw1.getWise() > ravenclaw2.getWise()) {
            System.out.println(ravenclaw1.getName() + " мудрее " + ravenclaw2.getName());
        } else {
            System.out.println(ravenclaw2.getName() + " мудрее " + ravenclaw1.getName());
        }
        if (ravenclaw1.getWitty() > ravenclaw2.getWitty()) {
            System.out.println(ravenclaw1.getName() + " остроумнее " + ravenclaw2.getName());
        } else {
            System.out.println(ravenclaw2.getName() + " остроумнее " + ravenclaw1.getName());
        }
        if (ravenclaw1.getCreativity() > ravenclaw2.getCreativity()) {
            System.out.println(ravenclaw1.getName() + " больше полон творчества, чем " + ravenclaw2.getName());
        } else {
            System.out.println(ravenclaw2.getName() + " больше полон творчества, чем " + ravenclaw1.getName());
        }
        System.out.println("=================");
    }

    public static void compareFacultyStudents(Slytherin slytherin1, Slytherin slytherin2) {
        if (slytherin1 == null || slytherin2 == null) {
            System.out.println("Сравнение невозможно");
            return;
        }
        if (slytherin1.getCunning() > slytherin2.getCunning()) {
            System.out.println(slytherin1.getName() + " хитрее " + slytherin2.getName());
        } else {
            System.out.println(slytherin2.getName() + " хитрее " + slytherin1.getName());
        }
        if (slytherin1.getDetermination() > slytherin2.getDetermination()) {
            System.out.println(slytherin1.getName() + " решительнее " + slytherin2.getName());
        } else {
            System.out.println(slytherin2.getName() + " решительнее " + slytherin1.getName());
        }
        if (slytherin1.getAmbition() < slytherin2.getAmbition()) {
            System.out.println(slytherin1.getName() + " амбициознее " + slytherin2.getName());
        } else {
            System.out.println(slytherin2.getName() + " амбициознее " + slytherin1.getName());
        }
        if (slytherin1.getResourcefulness() > slytherin2.getResourcefulness()) {
            System.out.println(slytherin1.getName() + " находчивее " + slytherin2.getName());
        } else {
            System.out.println(slytherin2.getName() + " находчивее " + slytherin1.getName());
        }
        if (slytherin1.getThirstForPower() > slytherin2.getThirstForPower()) {
            System.out.println(slytherin1.getName() + " больше жаждит власти, чем " + slytherin2.getName());
        } else {
            System.out.println(slytherin2.getName() + " больше жаждит власти, чем " + slytherin1.getName());
        }
        System.out.println("=================");
    }

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        if (student1 == null || student2 == null) {
            System.out.println("Сравнение невозможно");
            return;
        }
        if (student1.getConjure() > student2.getConjure()) {
            System.out.println(student1.getName() + " обладает большей мощьностью магии, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " обладает большей мощьностью магии, чем " + student1.getName());
        }
        if (student1.getTransgress() > student2.getTransgress()) {
            System.out.println(student1.getName() + " имеет большую способность трансгрессировать, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " имеет большую способность трансгрессировать, чем " + student1.getName());
        }
        System.out.println("=================");
    }
}




