package firstyearportfolio;

import java.util.Scanner;

public class MathFormula {
  public static void exe() {
    int[] array = new int[] { 1, 2, 3, 6, 8, 10, 12, 14 };
    Scanner key = new Scanner(System.in);
    chooseMath(key);
    evensAndOddsInArray(array);
    double[] arr = userFillArray(key);

    double average = calcArrayAverage(arr);
    double varianza = calcularVarianza(arr, average);
    double desviacion = calcularDesviacion(varianza);

    for (int i = 0; i < arr.length; i++) {
      System.out.println("Su valor numero " + (i + 1) + " es " + arr[i]);
    }

    System.out.println("\n El  promedio es = " + average);
    System.out.println("la varianza es = " + varianza);
    System.out.println("la desviación estándar es = " + desviacion);
  }

  public static double[] userFillArray(Scanner key) {
    System.out.println("How many values will you be using? Please enter the amount.");
    int size = 0;
    try {
      while (true)
        if (key.hasNextInt()) {
          size = key.nextInt();
          if (size < 15) {
            break;
          } else if (size >= 15) {
            System.out.println(
                "That value is too large. Please input a smaller value to remain within scope.");
            System.out.println("How many values will you be using? Please enter the amount.");
          }
        } else {
          System.out.println("That is not a number. Please enter a number.");
          key.nextLine();
        }
    } catch (Exception e) {
      System.out.println("There was an error. Restart the program.");
    }
    double[] grades = new double[size];

    System.out.println("We will be requesting " + size + " values.");
    for (int i = 0; i < grades.length; i++) {
      System.out.println("Please enter a value: ");
      try {
        while (true)
          if (key.hasNextDouble()) {
            grades[i] = key.nextDouble();
            break;
          } else {
            System.out.println("That is not a number. Please enter a number.");
            key.nextLine();
            key.nextLine();
          }
      } catch (Exception e) {
        System.out.println("There was an error. Restart the program.");
      }
    }
    return grades;
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

  public static double calcularVarianza(double[] arr, double av) {
    double varianza = 0;
    for (int i = 0; i < arr.length; i++) {
      varianza += Math.pow(arr[i] - av, 2);
    }
    return varianza;
  }

  public static double calcularDesviacion(double var) { // Calcula desviación estándar
    double desviacion = Math.sqrt(var);
    return desviacion;
  }

  public static void dispalyMultTable() {
    int fila, multiplicador;
    for (fila = 1; fila <= 12; fila++) {
      for (multiplicador = 1; multiplicador <= 12; multiplicador++) {
        System.out.printf("%4d", multiplicador * fila);
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

  public static double sumNegativePairs(double amount, Scanner key) {
    int suma = 0;
    int i = 0;

    while (i < amount) {
      System.out.print("Ingrese el número " + (i + 1) + ": ");
      int numero = key.nextInt(); // Entrada del usuario
      i++;

      if (numero < 0 && numero % 2 == 0) {
        suma += numero;
      }
    }
    System.out.println("La suma de los pares negativos es: " + suma);
    return suma;
  }

  public static double chooseMath(Scanner key) {
    double value = 0;
    int choice;
    System.out.println("Please input a value from 1 trough 3 for your exercise choice.\n");
    System.out.println("1: Display Multiplication table.");
    System.out.println("2: Sum all negative pair numbers.");
    System.out.println("3: Calculate the average of a set of values.");
    choice = key.nextInt();
    switch (choice) {
      case 1:
        dispalyMultTable();
        break;
      case 2:
        System.out.println("Please provide the amount of values you will calculate: \n");
        int n = key.nextInt();
        value = sumNegativePairs(n, key);
        break;
      case 3:
        double[] arr = userFillArray(key);
        double average = calcArrayAverage(arr);
        System.out.println("Your average is " + average);
        break;
      default:
        System.out.println("\nThat is not an acceptable value.");
        chooseMath(key);
    }
    return value;
  }

  public static int evensAndOddsInArray(int[] numArray) {
    int acumulador = 0, desacumulador = 0;
    System.out.println("Here numbers pair numbers are listed from 1 to " + numArray.length + ": ");
    for (int i = 0; i < numArray.length; i++) {
      if (numArray[i] % 2 != 0) {
        System.out.println("The index " + i + " is odd and reflects the number " + numArray[i]);
        desacumulador += 1;
      }
    }
    for (int i = 0; i < numArray.length; i++) {
      if (numArray[i] % 2 == 0) {
        System.out.println("The index " + i + " is a pair and reflects the number " + numArray[i]);
        acumulador += 1;
      }
    }
    System.out.println("There is " + acumulador + " pair numbers and " + desacumulador + " odd numbers.");
    return acumulador;
  }
}
