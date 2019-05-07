package EPAM_Java_Developer_Training_2019.Fundamentals.OptionalTask2;

import java.util.Scanner;

public class OptionalTask2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа через пробел: ");
        String[] digits = scanner.nextLine().split("\\s+");

        findMaxAndMinDigit(digits);
    }

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
        System.out.printf("Самое короткое число: %d, его длина: %d", minDigit, minLength);
    }
}
