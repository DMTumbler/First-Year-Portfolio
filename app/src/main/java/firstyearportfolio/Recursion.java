package firstyearportfolio;

import java.util.*;

public class Recursion {
  public static void demonstrate() {
    double factResult1, factResult2, multResult, sumResult, valor1, valor2;
    try (Scanner key = new Scanner(System.in)) {
      System.out.println(
          "En la siguientes pantallas se le pedirá dos valores para ejecutar las funciones de multiplicación,");
      System.out.println("suma y el factorial de cada valor. Solo utilize números positivos de lo contrario");
      System.out.println("obtendrá -1 como resultado.");

      System.out.println("Por favor provea el primer valor de las funciones a ejecutar y presione enter: ");
      valor1 = key.nextDouble();
      System.out.println("Por favor provea el segundo valor de las funciones a ejecutar: ");
      valor2 = key.nextDouble();

      multResult = recursionMultiplicacion(valor1, valor2);
      sumResult = recursionSuma(valor1, valor2);
      factResult1 = recursionFactorial(valor1);
      factResult2 = recursionFactorial(valor2);

      System.out.println("El resultado de su multiplicación: " + valor1 + " * " + valor2 + " es " + multResult);
      System.out.println("El resultado de su suma: " + valor1 + " + " + valor2 + " es " + sumResult);
      System.out.println("El factorial de " + valor1 + " es " + factResult1);
      System.out.println("El factorial de " + valor2 + " es " + factResult2);
    }
  }

  static double recursionFactorial(double n) {
    if (n == 0) {
      return 1;
    } else if (n > 0) {
      return n * recursionFactorial(n - 1);
    } else
      return -1;

  }

  static double recursionMultiplicacion(double n, double m) {
    if (m == 0) {
      return 0;
    } else if (m > 0) {
      return n + (recursionMultiplicacion(n, m - 1));
    } else
      return -1;
  }

  static double recursionSuma(double n, double m) {
    if (m == 0) {
      return n;
    } else if (m > 0) {
      return (recursionSuma(n, m - 1) + 1);
    } else
      return -1;
  }
}
