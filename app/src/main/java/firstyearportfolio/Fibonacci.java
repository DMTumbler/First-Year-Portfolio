package firstyearportfolio;

import java.util.*;

public class Fibonacci {
  public static int demonstrate() {
    int count;
    count = inputAmount();
    System.out.print("Series of " + count + " numbers: ");
    for (int i = 0; i < count; i++) {
      System.out.print(Fib(i) + " ");
    }
    return count;
  }

  public static int inputAmount() {
    int cantidad = 0;
    try (Scanner key = new Scanner(System.in)) {
      System.out.println("Favor de proveer la cantidad de números que desea encontrar en la secuencia Fibonacci");
      cantidad = key.nextInt();
    } catch (Exception e) {
      // TODO: handle exception
    }
    return cantidad;
  }

  public static int Fib(int n) {
    if (n == 0)
      return 0;
    else if (n == 1)
      return 1;
    else
      return Fib(n - 1) + Fib(n - 2);
  }
}
