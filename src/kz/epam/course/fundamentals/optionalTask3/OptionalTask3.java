package kz.epam.course.fundamentals.optionalTask3;

import java.util.Scanner;

public class OptionalTask3 {

    /**
     * Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the month: ");
        int month = scanner.nextInt();
        System.out.println(getMonthName(month));
    }

    /**
     * Helper method to get month name equals number.
     * @param month number of month
     * @return month name
     */
    private static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Enter number between 1 - 12";
        }
    }
}
