package ru.skypro.Lesson7;

import java.util.*;

public class lesson7 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> fruit = new ArrayList<>(List.of("Яблоко", "Груша", "Яблоко", "Дыня", "Яблоко", "Апельсин", "Апельсин"));
        printOddNumbers(nums);
        printEvenSortNumbers(nums);
        printUniqueWords(fruit);
        printNumberOfDuplicates(fruit);

    }

    private static void printOddNumbers(List<Integer> nums) {
        System.out.println("Нечетные числа");
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + " ");
            }
        }
        System.out.println();
    }

    private static void printEvenSortNumbers(List<Integer> nums) {
        System.out.println("Четные чила в порядке возрастания");
        List<Integer> uniqueNums = new ArrayList<>(Set.copyOf(nums));
        Collections.sort(nums);
        for (int i = 0; i < uniqueNums.size(); i++) {
            if (uniqueNums.get(i) % 2 == 0) {
                System.out.print(uniqueNums.get(i) + " ");
            }
        }
        System.out.println();
    }

    private static void printUniqueWords(List<String> fruit) {
        System.out.println("Уникальные слова");
        Set<String> uniqueFruit = new HashSet<>(fruit);
        System.out.println(uniqueFruit.toString());
    }

    private static void printNumberOfDuplicates(List<String> fruit) {
        System.out.println("Количество дублей");
        Set<String> uniqueFruit = new HashSet<>(fruit);
        List<String> duplicatesFruit = new ArrayList<>(fruit);
        List<String> numberDuplicatesFruit = new ArrayList<>(fruit);
        for (String uniqueFruits : uniqueFruit) {
            duplicatesFruit.remove(uniqueFruits);
        }
        fruit.removeAll(duplicatesFruit);
        numberDuplicatesFruit.removeAll(fruit);
        System.out.println(numberDuplicatesFruit.size());
    }
}

