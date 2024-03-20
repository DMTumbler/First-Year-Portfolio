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

public class AveragedArrays {
    public static void show() {
        Scanner key = new Scanner(System.in);
        int average;
        int[][] arreglo;
        int[] rowArray, columnArray;
        arreglo = new int[3][5];
        rowArray = new int[3];
        columnArray = new int[5];
        arreglo = buildArray(key);
        rowArray = findRowAverage(arreglo);
        columnArray = findColumnAverage(arreglo);
        average = findAverage(arreglo);
        System.out.println("El promedio de su arreglo es " + average);
        System.out.println("El promedio de su primera fila es " + rowArray[0]);
        System.out.println("El promedio de su segunda fila es " + rowArray[1]);
        System.out.println("El promedio de su tercera fila es " + rowArray[2]);
        System.out.println("El promedio de su primera columna es " + columnArray[0]);
        System.out.println("El promedio de su segunda columna es " + columnArray[1]);
        System.out.println("El promedio de su tercera columna es " + columnArray[2]);
    }

    // Método para construir el arreglo pidiéndole los dato al usuario
    static public int[][] buildArray(Scanner key) {
        int i, generatedNumbers;
        int j = 0;
        int[][] array;
        array = new int[3][5];
        System.out.println("Please provide 15 values to fill your table");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 4; j++) {
                generatedNumbers = key.nextInt();
                array[i][j] = generatedNumbers;
            }
        }
        return array;
    }

    // Método para calcular los promedios de las filas del arreglo
    static public int[] findRowAverage(int[][] arreglo) {
        int i = 0;
        int j = 0;
        int total;
        int[] rowAverage;
        rowAverage = new int[3];
        for (i = 0; i < 3; i++) {
            total = 0;
            for (j = 0; j < 5; j++) {
                total += arreglo[i][j];
            }
            rowAverage[i] = total / 5;
        }
        return rowAverage;
    }

    // Método para calcular el promedio de las columnas del arreglo
    static public int[] findColumnAverage(int[][] arreglo) {
        int i = 0;
        int j = 0;
        int total;
        int[] columnAverage;
        columnAverage = new int[5];
        for (i = 0; i < 5; i++) {
            total = 0;
            for (j = 0; j < 3; j++) {
                total += arreglo[j][i];
            }
            columnAverage[i] = total / 3;
        }
        return columnAverage;
    }

    // Método para calcular el promedio del arreglo completo
    static public int findAverage(int[][] array) {
        int i = 0;
        int j = 0;
        int suma = 0;
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 4; j++) {
                suma = +array[i][j];
            }
        }
        return suma;
    }
}
