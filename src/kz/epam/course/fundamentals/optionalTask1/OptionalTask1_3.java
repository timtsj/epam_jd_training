package kz.epam.course.fundamentals.optionalTask1;

import java.util.Random;
import java.util.Scanner;

public class OptionalTask1_3 {

    /**
     * 3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        StringBuilder result = new StringBuilder();
        System.out.print("Введите количество рандомных чисел: ");
        int randomNumber = scanner.nextInt();

        for (int i = 0; i < randomNumber; i++) {
            result.append(random.nextInt()).append("\n");
        }

        System.out.println(result);
        System.out.print(result);
    }


}
