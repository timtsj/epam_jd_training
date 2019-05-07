package EPAM_Java_Developer_Training_2019.Fundamentals.OptionalTask2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OptionalTask2 {

    /**
     * Задание. Ввести n чисел с консоли.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа через пробел: ");
        String[] digits = scanner.nextLine().split("\\s+");

        findMaxAndMinDigit(digits);
        sort(digits);
        averageDigits(digits);
    }

    /**
     * 1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
     *
     * @param digits array
     */
    private static void findMaxAndMinDigit(String[] digits) {
        int maxLength = 0;
        int maxDigit = 0;
        int minLength = 0;
        int minDigit = 0;

        for (String digit : digits) {
            int i = Integer.parseInt(digit);

            if (i > maxDigit) {
                maxDigit = i;
                maxLength = digit.length();
            }

            if (minDigit == 0) {
                minDigit = i;
                minLength = digit.length();
                //minLength = digit.contains("-") || digit.contains("+") ? digit.length() - 1 : digit.length();
            }

            if (i < minDigit) {
                minDigit = i;
                minLength = digit.length();
                //minLength = digit.contains("-") || digit.contains("+") ? digit.length() - 1 : digit.length();
            }
        }

        System.out.printf("Самое длинное число: %d, его длина: %d%n", maxDigit, maxLength);
        System.out.printf("Самое короткое число: %d, его длина: %d%n", minDigit, minLength);
    }

    /**
     * 2.     Вывести числа в порядке возрастания (убывания) значений их длины.
     *
     * @param digits array
     */
    private static void sort(String[] digits) {
        int[] mas = StringToIntegerArray(digits);
        //mas = bubbleSort(mas);
        Arrays.sort(mas);
        System.out.println("В порядке возрастания: " + Arrays.toString(mas));

        int[] mis = new int[mas.length];
        for (int i = mas.length, j = 0; i > 0 && j < mas.length; i--, j++) {
            mis[j] = mas[i - 1];
        }
        System.out.println("В порядке убывания: " + Arrays.toString(mis));
    }

    /**
     * Helper method for convert string array to int array
     *
     * @param str array
     * @return int[]
     */
    private static int[] StringToIntegerArray(String[] str) {
        int size = str.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }

    /**
     * Simpel bubbleSort
     *
     * @param mas int[]
     * @return int[]
     */
    private static int[] bubbleSort(int[] mas) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }

        return mas;
    }

    /**
     * 3.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
     *
     * @param digits String[]
     */
    private static void averageDigits(String[] digits) {
        int[] mas = StringToIntegerArray(digits);
        int sum = 0;
        Arrays.sort(mas);
        List<Integer> moreMid = new ArrayList<>();
        List<Integer> lessMid = new ArrayList<>();

        for (int i : mas) {
            sum += i;
        }

        for (int i : mas) {
            if (i >= sum / mas.length) {
                moreMid.add(i);
            } else {
                lessMid.add(i);
            }
        }

        System.out.println("Больше средний: " + Arrays.toString(moreMid.toArray()));
        System.out.println("Меньше средний: " + Arrays.toString(lessMid.toArray()));
    }
}
