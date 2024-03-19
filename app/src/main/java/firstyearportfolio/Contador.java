package firstyearportfolio;

import java.util.*;

// :
public class Contador {
  public static void contar(Scanner key) {
    int i, numero, contador;
    contador = 0;
    i = 1;
    while (i <= 20) {
      numero = leerNumero(key);
      if (numero > 10) {
        ++contador;
      }
      ++i;
    }
    System.out.println("Hay " + contador + " números mayores que 10 ");
  }

  public static int leerNumero(Scanner key) {
    System.out.println("Entre un numero: ");
    return key.nextInt();
  }
}
