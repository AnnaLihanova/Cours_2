package ru.skypro.LessonTwo;

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

        Hogwarts[] students = {
                new Gryffindor("Гарри", "Поттер", "Гриффиндор", 80, 56, 75, 80, 65),
                new Gryffindor("Гермиона", "Грейнджер", "Гриффиндор", 90, 65, 80, 64, 75),
                new Gryffindor("Рон", "Уизли", "Гриффиндор", 45, 56, 55, 68, 88),
                new Hufflepuff("Захария", "Смит", "Пуффендуй", 52, 65, 85, 65, 80),
                new Hufflepuff("Седрик", "Диггори", "Пуффендуй", 65, 80, 55, 90, 75),
                new Hufflepuff("Джастин", "Финч-Флетчли", "Пуффендуй", 84, 35, 90, 25, 74),
                new Ravenclaw("Чжоу", "Чанг", "Когтевран", 56, 85, 54, 73, 21, 49),
                new Ravenclaw("Падма", "Патил", "Когтевран", 85, 76, 41, 87, 97, 48),
                new Ravenclaw("Маркус", "Белби", "Когтевран", 72, 41, 34, 88, 33, 63),
                new Slytherin("Драко", "Малфой", "Слизерин", 53, 68, 85, 74, 98, 87, 86),
                new Slytherin("Грэхэм", "Малфой", "Монтегю", 65, 24, 38, 47, 85, 91, 46),
                new Slytherin("Грегори", "Гойл", "Слизерин", 72, 34, 25, 41, 30, 17, 66)

        };
        printAboutStudent(students[1]);
        compareFacultyStudents(gryffindors);
        compareFacultyStudents(hufflepuffs);
        compareFacultyStudents(ravenclaws);
        compareFacultyStudents(slytherins);
        compareStudents(students);
    }

    public static void printAboutStudent(Hogwarts student) {
        System.out.println(student);
    }

    public static void compareFacultyStudents(Gryffindor[] gryffindors) {
        for (int i = 0; i < gryffindors.length; i++) {
            for (int j = gryffindors.length - 1; j >= 0; j--) {
                if (gryffindors[i] != null && gryffindors[i].getNobility() > gryffindors[j].getNobility()) {
                    System.out.println("У " + gryffindors[i].getName() + " больше благородства, чем у " + gryffindors[j].getName());
                }
                if (gryffindors[i] != null && gryffindors[i].getHonor() < gryffindors[j].getHonor()) {
                    System.out.println("У " + gryffindors[j].getName() + " больше чести, чем у " + gryffindors[i].getName());
                }
                if (gryffindors[i] != null && gryffindors[i].getBravery() < gryffindors[j].getBravery()) {
                    System.out.println(gryffindors[j].getName() + " храбрее " + gryffindors[i].getName());
                }
            }
        }
        System.out.println("=================");
    }

    public static void compareFacultyStudents(Hufflepuff[] hufflepuffs) {
        for (int i = 0; i < hufflepuffs.length; i++) {
            for (int j = hufflepuffs.length - 1; j >= 0; j--) {
                if (hufflepuffs[i] != null && hufflepuffs[i].getHardworking() > hufflepuffs[j].getHardworking()) {
                    System.out.println(hufflepuffs[i].getName() + " трудолюбивее " + hufflepuffs[j].getName());
                }
                if (hufflepuffs[i] != null && hufflepuffs[i].getLoyal() < hufflepuffs[j].getLoyal()) {
                    System.out.println(hufflepuffs[j].getName() + " более верный, чем " + hufflepuffs[i].getName());
                }
                if (hufflepuffs[i] != null && hufflepuffs[i].getHonest() < hufflepuffs[j].getHonest()) {
                    System.out.println(hufflepuffs[j].getName() + " честнее " + hufflepuffs[i].getName());
                }
            }
        }
        System.out.println("=================");
    }

    public static void compareFacultyStudents(Ravenclaw[] ravenclaws) {
        for (int i = 0; i < ravenclaws.length; i++) {
            for (int j = ravenclaws.length - 1; j >= 0; j--) {
                if (ravenclaws[i] != null && ravenclaws[i].getSmart() > ravenclaws[j].getSmart()) {
                    System.out.println(ravenclaws[i].getName() + " умнее " + ravenclaws[j].getName());
                }
                if (ravenclaws[i] != null && ravenclaws[i].getWise() < ravenclaws[j].getWise()) {
                    System.out.println(ravenclaws[j].getName() + " мудрее " + ravenclaws[i].getName());
                }
                if (ravenclaws[i] != null && ravenclaws[i].getWitty() < ravenclaws[j].getWitty()) {
                    System.out.println(ravenclaws[j].getName() + " остроумнее " + ravenclaws[i].getName());
                }
                if (ravenclaws[i] != null && ravenclaws[i].getCreativity() < ravenclaws[j].getCreativity()) {
                    System.out.println(ravenclaws[j].getName() + " больше полон творчества, чем " + ravenclaws[i].getName());
                }
            }
        }
        System.out.println("=================");
    }

    public static void compareFacultyStudents(Slytherin[] slytherins) {
        for (int i = 0; i < slytherins.length; i++) {
            for (int j = slytherins.length - 1; j >= 0; j--) {
                if (slytherins[i] != null && slytherins[i].getCunning() > slytherins[j].getCunning()) {
                    System.out.println(slytherins[i].getName() + " хитрее " + slytherins[j].getName());
                }
                if (slytherins[i] != null && slytherins[i].getDetermination() < slytherins[j].getDetermination()) {
                    System.out.println(slytherins[j].getName() + " решительнее " + slytherins[i].getName());
                }
                if (slytherins[i] != null && slytherins[i].getAmbition() < slytherins[j].getAmbition()) {
                    System.out.println(slytherins[j].getName() + " амбициознее " + slytherins[i].getName());
                }
                if (slytherins[i] != null && slytherins[i].getResourcefulness() < slytherins[j].getResourcefulness()) {
                    System.out.println(slytherins[j].getName() + " находчивее " + slytherins[i].getName());
                }
                if (slytherins[i] != null && slytherins[i].getThirstForPower() < slytherins[j].getThirstForPower()) {
                    System.out.println(slytherins[j].getName() + " больше жаждит власти, чем " + slytherins[i].getName());
                }
            }
        }
        System.out.println("=================");
    }

    public static void compareStudents(Hogwarts[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = students.length - 1; j >= 0; j--) {
                if (students[i] != null && students[i].getConjure() > students[j].getConjure()) {
                    System.out.println(students[i].getName() + " обладает большей мощьностью магии, чем " + students[j].getName());
                }
                if (students[i] != null && students[i].getTransgress() > students[j].getTransgress()) {
                    System.out.println(students[i].getName() + " имеет большую способность трансгрессировать, чем " + students[j].getName());
                }
            }
        }
        System.out.println("=================");
    }
}




