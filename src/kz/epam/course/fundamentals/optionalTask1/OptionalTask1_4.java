package kz.epam.course.fundamentals.optionalTask1;

import java.util.Scanner;

public class OptionalTask1_4 {

    /**
     * 4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
     *
     */
    public static void main(String[] args) {
        calculate();
    }

    /**
     * Сумма и произведение всех введенных чисел.
     */
    private static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целые цисла: ");
        int value = scanner.nextInt();
        int sum = 0;
        int composition = 1;

        while (value != 0) {
            sum += value % 10;
            composition *= value % 10;
            value /= 10;
        }
        System.out.println("Сумма введённых чисел: " + sum);
        System.out.println("Произведение введённых чисел: " + composition);
    }

}
