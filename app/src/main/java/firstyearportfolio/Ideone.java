package firstyearportfolio;

public class Ideone {
    public static void main(String[] args) throws java.lang.Exception {
        int random;
        int[] randomNumbers;
        randomNumbers = new int[50]; // arreglo de 50 celdas de tipo int
        int suma = 0;

        // 1. Llenar el arreglo con números random
        for (int i = 0; i < 50; i++) {
            random = (int) (Math.random() * 50 + 1);
            randomNumbers[i] = random;
            suma += random; // Agregar el valor al total
        }

        // 2. Get the values
        for (int i = 0; i < 50; i++) {
            System.out.println(randomNumbers[i]);
        }

        // 3. Calcular el promedio
        double promedio = suma / 50;
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("El promedio es: " + promedio);
    } // end main
} // end class
