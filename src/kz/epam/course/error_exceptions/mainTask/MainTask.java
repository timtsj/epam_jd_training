package kz.epam.course.error_exceptions.mainTask;

import kz.epam.course.error_exceptions.exception.ResourceException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTask {

    /**
     * В символьном файле находится информация об N числах с плавающей запятой.
     * Прочитать информацию из файла.
     * Проверить на корректность, то есть являются ли данные числами.
     * Преобразовать к числовым значениям и вычислить сумму и среднее значение прочитанных чисел.
     * Создать собственный класс исключения.
     * Предусмотреть обработку исключений, возникающих при нехватке памяти, отсутствии самого файла по заданному адресу, отсутствии или некорректности требуемой записи в файле, недопустимом значении поля (выходящим за пределы максимально допустимых значений) и т. д.
     */

    public static void main(String[] args) {
        readFile();
    }

    private static void readFile() {
        String path = "E:\\all\\DevProjects\\IntelliJProjects\\epam_jd_training\\src\\kz\\epam\\course\\error_exceptions\\res\\input";
        File file = new File(path);
        List<Float> numbers = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                try {
                    float number = Float.parseFloat(scanner.nextLine());
                    numbers.add(number);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException | OutOfMemoryError e) {
            e.printStackTrace();
        }

        try {
            sumAndAverageValue(numbers);
        } catch (ResourceException e) {
            e.printStackTrace();
        }
    }

    private static void sumAndAverageValue(List<Float> numbers) throws ResourceException {
        if (numbers == null) {
            throw new ResourceException("Empty list");
        }

        float sum = 0;

        for (float number : numbers) {
            sum += number;
        }

        int avg = (int) sum / numbers.size();

        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Avg: %d%n", avg);
    }
}
