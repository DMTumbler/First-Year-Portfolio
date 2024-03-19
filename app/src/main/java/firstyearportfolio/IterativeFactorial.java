package firstyearportfolio;

import java.util.Scanner;

public class IterativeFactorial {
    public static void main(String[] arg) {
        int numero, factorial;
        try (Scanner key = new Scanner(System.in)) {
            System.out.println("Favor de entrar el numero al cual desea obtener el factorial");
            numero = key.nextInt();
            factorial = miFactorial(numero);
            if (numero > 0) {
                System.out.println("El factorial de " + numero + " es " + factorial);
            } else {
                System.out.println(" ");
            }
        } catch (Exception e) {
            System.out.println("The input was incorrect");
        }
    }

    public static int miFactorial(int n) {
        int acumulador = 1;
        int i;
        if (n > 0) {
            for (i = 1; i <= n; i++) {
                acumulador *= i;
                System.out.println("El indice es " + i + " El numero es " + n + " La acumulación es " + acumulador);
            }
        } else {
            System.out.println("Solo podemos calcular números positivos para esta función");
        }
        return acumulador;
    }
}
