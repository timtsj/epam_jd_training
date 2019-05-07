package EPAM_Java_Developer_Training_2019.Fundamentals;

import java.util.Scanner;

public class MainTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name: ");
        System.out.printf("Hello, %s!", scanner.next());
    }
}
