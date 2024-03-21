package firstyearportfolio;

/* Programador: Christian Sanchez Martinez   
 * 
 * Programa:
 * Toma un arreglo de datos del usuario obtiene los promedios basado en fila en columna, o el promedio en conjunto
 * del arreglo completo.
 * 
 * Algoritmo:
 * 1. Comenzar
 * 2. Obtener arreglo del usuario
 * 3. Calcular promedio de filas
 * 4. Calcular promedio de columnas
 * 5. Calcular promedio de arreglo completo
 * 6. Demostrar resultados
 * 7. Finalizar
 * 
 * Variables:
 * average - Representa el promedio del arreglo
 * arreglo - Representa el arreglo rellenado por el usuario
 * rowArray - El arreglo rellenado por las filas de arreglo en el método findRowAverage()
 * columnArray - El arreglo rellenado por las columnas en el método findColumnAverage()
 * 
 */
import java.util.*;

public class AvgMultArray {
    public static void show() {
        Scanner key = new Scanner(System.in);
        int average;
        int[][] array;
        int[] rowArray, columnArray;
        array = new int[3][5];
        rowArray = new int[3];
        columnArray = new int[5];
        array = buildTwoDimArray(key);
        rowArray = findRowAverage(array);
        columnArray = findColumnAverage(array);
        average = findAverage(array);
        System.out.println("El promedio de su arreglo es " + average);
        for (int i = 0; i < rowArray.length; i++) {
            System.out.println("The average of your first row is " + rowArray[0]);
            System.out.println("The average of your second row is " + rowArray[1]);
            System.out.println("The average of your third row is " + rowArray[2]);
        }

        System.out.println("The average of your first column is " + columnArray[0]);
        System.out.println("The average of your second column is " + columnArray[1]);
        System.out.println("The average of your third column is " + columnArray[2]);
    }

    // Método para construir el arreglo pidiéndole los dato al usuario
    static public int[][] buildTwoDimArray(Scanner key) {
        int userNums = 0;
        int[][] array;
        array = new int[3][5];
        System.out.println("Please provide 15 values to fill your table ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
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
        }
        return rowAverage;
    }

    // Método para calcular el promedio de las columnas del arreglo
    static public int[] findColumnAverage(int[][] array) {
        int i = 0;
        int j = 0;
        int total;
        int[] columnAverage;
        columnAverage = new int[5];
        for (i = 0; i < 5; i++) {
            total = 0;
            for (j = 0; j < 3; j++) {
                total += array[j][i];
            }
            columnAverage[i] = total / 3;
        }
        return columnAverage;
    }

    // Método para calcular el promedio del arreglo completo
    static public int findAverage(int[][] array) {
        int i = 0;
        int j = 0;
        int sum = 0;
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 4; j++) {
                sum = +array[i][j];
            }
        }
        return sum;
    }
}
