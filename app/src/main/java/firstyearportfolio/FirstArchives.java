package firstyearportfolio;


/* Programado: Christian Sanchez Martinez
 * 
 * Programa:
 * Genera 20 datos que son guardados en un archivo de texto que luego convierte en los valores
 * de un arreglo. Finalmente los imprime en pantalla para observar por el usuario.
 * 
 * Variables:
 * generateNumbers()
 * cantidad - representa el numero de valores a generar
 * result - la variable utilizada para llenar el archivo con la clase PrintWriter
 * outputNumber - La variable que se convierte en el numero aleatorio a traves de la formula. Se usa con
 * result.println() para llenar el archivo.
 * 
 * sendToArray()
 * data - variable a la que se le asigna el archivo a traves de scanner
 * inputNumber - variable que recoge los valores del archivo en un loop para asignarlos al arreglo
 * generatedNumbers - representa el arreglo a ser llenado por el método
 * i - 
 * 
 * generateNumbers() - El método que genera los 20 números aleatorios y los graba en el archivo
 * sendToArray() - Método que toma los valores del archivo y los utiliza para llenar el arreglo
 */
import java.util.*;
import java.io.*;

public class FirstArchives {
    static public void main(String[] args) {
        genNumsToFile();
        sendFileToArr();
    }

    // Genera los 20 números aleatorios y los graba en el archivo data.txt
    static public void genNumsToFile() {
        int outputNumber;
        int cantidad = 20;
        PrintWriter result;
        try {
            result = new PrintWriter("C:/Users/chris/OneDrive/Documents/Code/Active Projects/data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Can't open file result.txt!");
            System.out.println("Error: " + e);
            return;
        }
        for (int i = cantidad - 1; i >= 0; i--) {
            outputNumber = (int) (Math.random() * (100 - 1 + 1) + 1);
            result.println(outputNumber);
        }
        result.close();
    }

    // Toma los valores del archivo y los utiliza para llenar el arreglo
    static public void sendFileToArr() {
        Scanner data;
        int inputNumber = 0;
        int[] generatedNumbers;
        int i;
        generatedNumbers = new int[20];
        try {
            data = new Scanner(new File("C:/Users/chris/OneDrive/Documents/Code/Active Projects/data.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Can't find file data.dat!");
            return;
        }
        for (i = 0; i < 20; i++) {
            inputNumber = data.nextInt();
            generatedNumbers[i] = inputNumber;
        }
        for (i = 0; i < 20; i++) {
            System.out.printf("%-5d", generatedNumbers[i]);
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
        data.close();
    }
}
