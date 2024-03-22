package firstyearportfolio;

/* Program: Asks user to generate the values of a multidimensional array. It takes said values and finds the average of 
 * the rows, columns and the whole array. It's main function is to demonstrate how multidimensional arrays function.
 */
import java.util.*;

public class AvgMultArray {
    public static void show() {
        Scanner key = new Scanner(System.in);
        int average;
        int[][] array = new int[3][5];
        int[] rowArray = new int[3];
        int[] columnArray = new int[5];
        array = buildTwoDimArray(key);
        rowArray = findRowAverage(array);
        columnArray = findColumnAverage(array);
        average = findAverage(array);
        System.out.println("The average of the whole array is " + average);
        for (int i = 0; i < rowArray.length; i++) {
            System.out.println("The average of row " + i + " is " + rowArray[i]);
        }
        for (int i = 0; i < columnArray.length; i++) {
            System.out.println("The average of column " + i + " is " + columnArray[i]);
        }
    }

    // Método para construir el arreglo pidiéndole los dato al usuario
    static public int[][] buildTwoDimArray(Scanner key) {
        int userNums = 0;
        int[][] array;
        array = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Please enter the value for row " + i + " column " + j);
                userNums = Integer.valueOf(key.nextLine());
                array[i][j] = userNums;
            }
        }
        return array;
    }

    // Método para calcular los promedios de las filas del arreglo
    static public int[] findRowAverage(int[][] array) {
        int total = 0;
        int[] rowAverage;
        rowAverage = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                total += array[i][j];
            }
            rowAverage[i] = total / 5;
            total = 0;
        }
        return rowAverage;
    }

    // Método para calcular el promedio de las columnas del arreglo
    static public int[] findColumnAverage(int[][] array) {
        int i = 0;
        int j = 0;
        int total = 0;
        int[] columnAverage;
        columnAverage = new int[5];
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 3; j++) {
                total += array[j][i];
            }
            columnAverage[i] = total / 3;
            total = 0;
        }
        return columnAverage;
    }

    // Método para calcular el promedio del arreglo completo
    static public int findAverage(int[][] array) {
        int i = 0;
        int j = 0;
        int sum = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                sum = +array[i][j];
            }
        }
        return sum;
    }
}
