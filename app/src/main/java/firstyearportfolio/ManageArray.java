package firstyearportfolio;

import java.util.Scanner;

public class ManageArray {
  public static void demonstrate() {
    Scanner key = new Scanner(System.in);
    int size = requestValueScanner();
    double[] array = generateRandomArray(size);
    double sum = sumArrayValues(array);
    System.out.println("The sum of the array is: " + sum);
  }

  // Will request a value using scanner instead of simply pasing the value...
  // Scanner is a pain...
  public static int requestValueScanner() {
    int value = 0;
    boolean validInput = false;
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("You have chosen to provide a value with Scanner");
      System.out.println("Please provide an integer value below");
      do {
        if (scanner.hasNextInt()) {
          value = Integer.valueOf(scanner.nextLine());
          validInput = true;
        } else {
          System.out.println("That is not an integer. Please enter an integer");
          scanner.next();
        }
      } while (!validInput);
    } catch (Exception e) {
      System.out.println("There was an error. Restart the program.");
    }
    return value;
  }

  public static double[] generateRandomArray(int size) {
    double[] array = new double[size];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 200 + 1);
    }
    return array;
  }

  public static double[] fillArrayRandomly(double[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 200 + 1);
    }
    return array;
  }

  public static double[] setArraySize(int size) {
    double[] array = new double[size];
    return array;
  }

  public static void searchArray(double[] array, int value) {
    int searching = value;
    boolean found = false;
    for (int i = 0; i < array.length; i++) {
      if (searching == array[i]) {
        System.out.println(searching + " is at index " + i + ".");
        found = true;
      }
    }
    if (found == false) {
      System.out.println(searching + " was not found.");
    }
  }

  public static double sumArrayValues(double[] array) {
    double sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum;
  }

  public static double findAverage(double sum, double[] array) {
    double average;
    average = sum / array.length;
    return average;
  }

  public static double findVariance(double[] array, double average) {
    double variance = 0;
    for (int i = 0; i < array.length; i++) {
      variance += Math.pow(array[i] - average, 2);
    }
    return variance /= array.length;
  }

  public static double findDeviation(double variance) {
    double deviation = (double) Math.sqrt(variance);
    return deviation;
  }

  public static void resultsDisplay(double sum, double average, double variance, double deviation) {
    System.out.println("The sum is: " + sum); // Turn expression into its own method
    System.out.println("The average is: " + average);
    System.out.println("The variance is: " + variance);
    System.out.println("The Standard Deviation is: " + deviation);
  }

  static double[] bubbleSortArray(double[] array, int size) {
    double temp = 0;
    for (int i = 0; i < size; i++) {
      for (int j = 1; j < (size - i); j++) {
        if (array[j - 1] > array[j]) {
          temp = array[j - 1];
          array[j - 1] = array[j];
          array[j] = temp;
        }
      }
    }
    return array;
  }

}
