package EPAM_Java_Developer_Training_2019.Fundamentals.OptionalTask1;

public class OptionalTask1_3 {

    public static void main(String[] args) {
        /**
         * 3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
         */
        int[] digits = {1, 2, 3, 4, 5};
        for (int i : digits) {
            System.out.println(i);
            System.out.print(i);
        }
    }


}
