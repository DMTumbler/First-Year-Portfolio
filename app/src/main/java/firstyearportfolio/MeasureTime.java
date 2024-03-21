package firstyearportfolio;

import java.util.Scanner;

public class MeasureTime {
    public static void main(String[] args) {
        int start = 1, end = 15095, result = 0;
        boolean inputValue = false;
        try (Scanner key = new Scanner(System.in)) {
            System.out.println("We will mesure the effectivenes of different method to do sum.");
            System.out.println("Please provide the starting integer.");
            start = Integer.valueOf(key.nextLine());
            System.out.println("Please provide the ending integer.");
            do {
                if (key.hasNextInt()) {
                    end = Integer.valueOf(key.nextLine());
                    if (end < 15095) {
                        inputValue = true;
                    } else {
                        System.out.println("That number is to large and the program will likeley crash.");
                        System.out.println("Input a smaller number.");
                    }
                } else {
                    System.out.println("That is not a number. Please input a number.");
                }
            } while (!inputValue);
            long itStartTime = System.currentTimeMillis();
            result = iterativeSum(start, end);
            long itEndTime = System.currentTimeMillis();
            long itTotalTime = itEndTime - itStartTime;
            System.out.println("El resultado de la suma del rango del " + start + " al " + end + " es " + result);
            System.out.println("Tiempo de ejecución para método iterativo: " + itTotalTime + "\n");

            long gStartTime = System.currentTimeMillis();
            result = gaussFormula(start, end);
            long gEndTime = System.currentTimeMillis();
            long gTotalTime = gEndTime - gStartTime;
            System.out.println("El resultado de la suma del rango del " + start + " al " + end + " es " + result);
            System.out.println("Tiempo de ejecución para uso de formula gauss: " + gTotalTime + "\n");

            long recStartTime = System.currentTimeMillis();
            result = sum(start, end);
            long recEndTime = System.currentTimeMillis();
            long recTotalTime = recEndTime - recStartTime;
            System.out.println("El resultado de la suma del rango del " + start + " al " + end + " es " + result);
            System.out.println("Tiempo de ejecución pra método recursivo: " + recTotalTime + "\n");
        }
    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else
            return end;
    }

    public static int gaussFormula(int start, int end) {
        int i;
        int result = 0;
        for (i = start; i != end; i++) {
            result = (start + end) * (end - start + 1) / 2;
        }
        return result;
    }

    public static int iterativeSum(int start, int end) {
        int i;
        for (i = start + 1; i <= end; i++) {
            start = +(start + i);
        }
        return start;
    }
}
