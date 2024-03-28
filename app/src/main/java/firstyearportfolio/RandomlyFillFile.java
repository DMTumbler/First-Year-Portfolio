package firstyearportfolio;

import java.util.*;
import java.io.*;

public class RandomlyFillFile {
  static public void demonstrate() {
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
