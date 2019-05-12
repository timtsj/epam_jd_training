package EPAM_Java_Developer_Training_2019.Fundamentals.OptionalTask4;

import java.util.Scanner;

public class OptionalTask4 {

    /**
     * Задание.
     * Ввести с консоли n - размерность матрицы a [n] [n].
     * Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k;
        int[][] matrix, matrix1;

        System.out.print("Matrix's dimension - ");
        n = scanner.nextInt();
        matrix = fillSquareMatrixRnd(n);
        printMatrix(matrix);

        System.out.println();

        System.out.print("Sort by column - ");
        k = scanner.nextInt();
        matrix1 = orderMatrixRows(matrix, k);
        printMatrix(matrix1);

        System.out.println();

        System.out.print("Shift for - ");
        k = scanner.nextInt();
        matrix1 = cyclicMatrixShift(matrix, k);
        printMatrix(matrix1);

        System.out.println();

        System.out.print("Sum between first and second positive elements of each row: ");
        System.out.println(sumBetweenPositiveOfMatrix(matrix));
    }

    /**
     * 1.     Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
     * @param matrix matrix over which work will be done
     * @param col column number for getPizzaAttribute
     * @return ordered matrix
     */
    private static int[][] orderMatrixRows(int[][] matrix, int col) {

        if (isNull(matrix) || col < 1 || col > matrix.length) {
            throw new IllegalArgumentException();
        }

        int[][] m = matrix.clone();

        for (int i = 0, matrixLength = matrix.length; i < matrixLength - 1; i++) {
            for (int j = i + 1; j < matrixLength; j++) {
                if (m[i][col - 1] > m[j][col - 1]) {
                    m = shiftRows(m, i, j);
                }
            }
        }

        return m;
    }

    private static int[][] cyclicMatrixShift(int[][] matrix, int k) {

        if (isNull(matrix)) {
            throw new IllegalArgumentException();
        }

        int m[][] = matrix.clone();

        for (int i = 0, matrixLength = matrix.length; i < matrixLength; i++) {
            m[i] = cyclicRowShift(m[i], k);
        }

        return m;
    }

    private static int sumBetweenPositiveOfMatrix(int[][] matrix) {

        if (isNull(matrix)) {
            throw new IllegalArgumentException();
        }

        int sum = 0;

        for (int i = 0, matrixLength = matrix.length; i < matrixLength; i++) {
            sum += sumBetweenPositiveOfRow(matrix[i]);
        }

        return sum;
    }

    private static int sumBetweenPositiveOfRow(int[] row) {

        if (isNull(row)) {
            throw new IllegalArgumentException();
        }

        int sum = 0;
        int a = -1;
        int b = -1;
        int i = 0;
        int rowLength = row.length;

        while ((a == -1 || b == -1) & i < rowLength) {
            if (row[i] > 0) {
                if (a == -1) {
                    a = i;
                } else {
                    b = i;
                }
            }
            i++;
        }

        return sumBetweenTwoElements(row, a, b);
    }

    private static int sumBetweenTwoElements(int[] row, int a, int b) {

        if (isNull(row) || a < -1 || a > row.length || b < -1 || b > row.length || (a > b && b != -1)) {
            throw new IllegalArgumentException();
        }

        if (a == -1 || b == -1) {
            return 0;
        } else {
            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum += row[i];
            }
            return sum;
        }
    }

    private static int[] cyclicRowShift(int[] row, int k) {

        int rowLength = row.length;

        if (isNull(row) || rowLength == 0) {
            throw new IllegalArgumentException();
        }

        int r[] = new int[rowLength];
        int n = (k % rowLength) + rowLength;

        for (int i = 0; i < rowLength; i++) {
            r[(i + n) % rowLength] = row[i];
        }

        return r;
    }

    private static int[][] fillSquareMatrixRnd(int n) {

        if (n < 0) {
            throw new IllegalArgumentException();
        }

        int[][] m = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = (int) (Math.random() * (n * 2 + 2) - (n + 1));
            }
        }

        return m;
    }

    private static void printMatrix(int[][] matrix) {

        if (isNull(matrix)) {
            throw new IllegalArgumentException();
        }

        for (int i = 0, n = matrix.length; i < n; i++) {
            for (int j = 0, m = matrix[i].length; j < m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] shiftRows(int[][] matrix, int row1, int row2) {

        if (isNull(matrix) || row1 > matrix.length - 1 || row2 > matrix.length - 1) {
            throw new IllegalArgumentException();
        }

        int m[][] = matrix.clone();

        int t[] = m[row1];
        m[row1] = m[row2];
        m[row2] = t;

        return m;
    }

    private static boolean isNull(int[][] a) {
        return (a == null);
    }

    private static boolean isNull(int[] a) {
        return (a == null);
    }
}
