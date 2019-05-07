package EPAM_Java_Developer_Training_2019.Fundamentals.OptionalTask2;

import java.util.Arrays;
import java.util.Scanner;

public class OptionalTask2_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа через пробел: ");
        String[] digits = scanner.nextLine().split("\\s+");

        sort(digits);
    }

    private static void sort(String[] digits) {
        int[] mas = StringToIntegerArray(digits);
        mas = bubbleSort(mas);

        System.out.println("В порядке возрастания: " + Arrays.toString(mas));

        int[] mis = new int[mas.length];
        for (int i = mas.length, j = 0; i > 0 && j < mas.length; i--, j++) {
            mis[j] = mas[i - 1];
        }
        System.out.println("В порядке убывания: " + Arrays.toString(mis));
    }

    private static int[] StringToIntegerArray(String[] str) {
        int size = str.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }

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

}
