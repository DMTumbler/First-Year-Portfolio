package firstyearportfolio;

import java.util.*;
import java.text.*;

public class BuscandoOcho {
    public static void main(String[] args) {

        // Ejecución de métodos en main para llevar a cabo función
        double promedio;
        explicativo();
        promedio = calcuPromedio();
        declareTruth(promedio);
    }

    // Método que explica lo que estará ocurriendo al usuario
    static void explicativo() {
        System.out.println("¡Saludos! Estamos buscando a ocho, necesitamos encontrarlo cun un promedio.");
        System.out.println("Deberá proveer 15 números y presionar enter cada vez que entre una nota.");
        System.out.println(
                "¡Luego de proveer 15 números el sistema proveerá su promedio y veremos si encuentras a ocho!.");
    }

    // Método que utiliza otro método (leerNota) y un ciclo para acumular notas y
    // luego calcular el promedio del estudiante
    static double calcuPromedio() {
        double average, notas, suma;
        int cantidad = 0;
        suma = 0;
        while (15 != cantidad) {
            ++cantidad;
            notas = leerNota();
            suma += notas;

            // Remueva diagonales de comentario para tener conteo de cantidad de notas y
            // total de suma de notas.
            // System.out.println("Cantidad de notas: " + cantidad);
            // System.out.println("Suma de Puntuación: " + suma);
        }
        return average = suma / cantidad;
    }

    // Método utilizado para pedirle la entrada de datos al usuario. Utilizado para
    // darle valor a "notas" en calcuPromedio
    static double leerNota() {
        Scanner key = new Scanner(System.in);
        System.out.println("Entre una nota y presione enter.");
        return key.nextDouble();
    }

    // Método que utiliza el valor de promedio en Main para determinar que letra va
    // asociada con el promedio. Utiliza cadena IF ELSE.
    static void declareTruth(double av) {
        DecimalFormat ft = new DecimalFormat("00.00");
        if (av == 8) {
            System.out.println("¡El promedio es ocho! ¡" + ft.format(av) + "% Es cierto!");
        } else {
            if (av > 8) {
                System.out.println("El promedio e mayor de la meta al ser " + ft.format(av) + "% Es FALSO ");
            }

            else {
                if (av < 8) {
                    System.out.println("El promedio e menor de la meta al ser " + ft.format(av) + "% Es FALSO ");
                }

            }
        }
    }
}
