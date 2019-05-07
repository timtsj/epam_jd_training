package EPAM_Java_Developer_Training_2019.Fundamentals.OptionalTask1;

import java.util.Scanner;

public class OptionalTask1_1 {

    public static void main(String[] args) {
        sayHello();
    }

    /**
     * 1.     Приветствовать любого пользователя при вводе его имени через командную строку.
     */
    private static void sayHello() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name: ");
        System.out.printf("Hello, %s!", scanner.next());
    }
}
