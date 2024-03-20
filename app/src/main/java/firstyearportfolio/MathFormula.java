package firstyearportfolio;

import java.util.Scanner;

public class MathFormula {
  public static void show() {
    Scanner key = new Scanner(System.in);
    chooseMath(key);
    double[] arr = fillArrayUser(key);
    //
    // double average = calcArrayAverage(arr);
    // double variance = calculateVariance(arr, average);
    // double deviation = calculateDesviacion(variance);
    //
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println("Su valor numero " + (i + 1) + " es " + arr[i]);
    // }
    //
    // System.out.println("\n The average is = " + average);
    // System.out.println("The variance is = " + variance);
    // System.out.println("The standard deviation is = " + deviation);
  }

  // Function to fill array
  public static double[] fillArrayUser(Scanner key) {
    System.out.println("How many values will you be using? Please enter the amount.");
    int size = 0;
    boolean validInput = false;
    try {
      do {
        if (key.hasNextInt()) {
          size = Integer.valueOf(key.nextLine());
          if (size < 15) {
            validInput = true;
          } else if (size >= 15) {
            System.out.println("That value is too large. Please input a smaller value to remain within scope.");
            System.out.println("How many values will you be using? Please enter the amount.");
          }
        } else {
          System.out.println("That is not a number. Please enter a number.");
          key.nextLine();
        }
      } while (!validInput);

    } catch (Exception e) {
      System.out.println("There was an error. Restart the program.");
    }

    double[] array = new double[size];

    System.out.println("We will be requesting " + size + " values.");
    for (int i = 0; i < array.length; i++) {
      System.out.println("Please enter a value: ");
      try {
        while (true)
          if (key.hasNextDouble()) {
            array[i] = Double.valueOf(key.nextLine());
            break;
          } else {
            System.out.println("That is not a number. Please enter a number.");
            key.nextLine();
          }
      } catch (Exception e) {
        System.out.println("There was an error. Restart the program.");
      }
    }
    return array;
  }

  public static double calcArrayAverage(double[] arr) {
    double average = 0;
    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    average = sum / arr.length;
    return average;
  }

  public static double calculateVariance(double[] arr, double av) {
    double variance = 0;
    for (int i = 0; i < arr.length; i++) {
      variance += Math.pow(arr[i] - av, 2);
    }
    return variance;
  }

  public static double calculateDesviacion(double var) { // Calcula desviación estándar
    double deviation = Math.sqrt(var);
    return deviation;
  }

  public static void dispalyMultTable() {
    int row, multiplier;
    for (row = 1; row <= 12; row++) {
      for (multiplier = 1; multiplier <= 12; multiplier++) {
        System.out.printf("%4d", multiplier * row);
      }
      System.out.println();
    }
  }

  public static double findDivisorAmount(double n) {
    double divisorCount = 0;
    for (int testDivisor = 1; testDivisor <= n; testDivisor++) {
      if (n % testDivisor == 0)
        divisorCount++;
    }

    System.out.println();
    System.out.println("The number of divisors of " + n + " is " + divisorCount);
    return divisorCount;

  }

  public static double sumNegativePairs(Scanner key) {
    int sum = 0;
    int i = 0;
    System.out.println("Please provide the amount of values you will calculate: \n");
    int amount = Integer.valueOf(key.nextLine());
    while (i < amount) {
      System.out.print("Ingrese el número " + (i + 1) + ": ");
      int number = key.nextInt(); // Entrada del usuario
      i++;

      if (number < 0 && number % 2 == 0) {
        sum += number;
      }
    }
    System.out.println("La suma de los pares negativos es: " + sum);
    return sum;
  }

  public static double chooseMath(Scanner key) {
    double value = 0;
    int choice;
    System.out.println("Please input a value from 1 trough 3 for your exercise choice.\n");
    System.out.println("1: Display Multiplication table.");
    System.out.println("2: Sum all negative even numbers.");
    System.out.println("3: Calculate the average of a set of values.");
    System.out.println("4: We will find the even and odd number in an array.");
    choice = Integer.valueOf(key.nextLine());
    switch (choice) {
      case 1:
        dispalyMultTable();
        break;
      case 2:
        value = sumNegativePairs(key);
        break;
      case 3:
        double[] arr = fillArrayUser(key);
        double average = calcArrayAverage(arr);
        System.out.println("Your average is " + average);
        break;
      case 4:
        findEvenOddsInArray(key);
      default:
        System.out.println("\nThat is not an acceptable value.");
        chooseMath(key);
    }
    return value;
  }

  public static int findEvenOddsInArray(Scanner key) {
    int[] array = new int[8];
    int input = 0;

    input = Integer.valueOf(key.nextLine());
    System.out.println("First lets fill our array.");
    for (int i = 0; i < array.length; i++) {
      input = Integer.valueOf(key.nextLine());
      array[i] = input;
    }
    int acum = 0, deacum = 0;
    System.out.println("Here even numbers are listed from 1 to " + array.length + ": ");
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        System.out.println("The index " + i + " is odd and reflects the number " + array[i]);
        deacum += 1;
      }
    }
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        System.out.println("The index " + i + " is even and reflects the number " + array[i]);
        acum += 1;
      }
    }
    System.out.println("There is " + acum + " even numbers and " + deacum + " odd numbers.");
    return acum;
  }
}
