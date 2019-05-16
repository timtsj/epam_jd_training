package kz.epam.course.fundamentals.optionalTask1;

public class OptionalTask1_2 {

    /**
     * 2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.
     *
     * @param args аргументы комаднйо строки
     */
    public static void main(String[] args) {

        for (int i = args.length; 0 < i; i--) {
            System.out.println(args[i - 1]);
        }
    }

}
