package firstyearportfolio;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner key;
        key = new Scanner(System.in);
        int conteo;
        conteo = generarCantidad(key);
        System.out.print("Serie de " + conteo + " números: ");
        for (int i = 0; i < conteo; i++) {
            System.out.print(Fib(i) + " ");
        }
    }

    public static int generarCantidad(Scanner key) {
        int cantidad;
        System.out.println("Favor de proveer la cantidad de números que desea encontrar en la secuencia Fibonacci");
        cantidad = key.nextInt();
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
