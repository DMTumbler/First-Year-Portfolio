package firstyearportfolio;

import java.util.*;
import java.io.*;
import java.util.Random;

public class WriteToFile {
  public static void demonstrate() {
    Scanner key = new Scanner(System.in);
    Student[] stu;
    stu = generateStudents(key);
    toFile(key, stu);
    readStudent(key, stu);
  }

  public static Student[] generateStudents(Scanner key) {
    int i = 0;
    Student[] stu;
    stu = new Student[1000];
    for (i = 0; i < 1000; i++) {
      stu[i] = new Student();
    }
    return stu;
  }

  public static void toFile(Scanner key, Student[] stu) {
    PrintWriter result;
    try {
      result = new PrintWriter("C:/Users/chris/OneDrive/Desktop/results.txt");
    } catch (FileNotFoundException e) {
      System.out.println("El archivo para escribir resultados no existe");
      return;
    }
    int i;
    for (i = 0; i < 1000; i++) {
      Random rd = new Random();
      System.out.println("Numero aleatorio generado " + i);
      stu[i].setAverage(rd.nextInt());
      System.out.println(stu[i].getAverage());
      result.close();
    }
  }

  public static void readStudent(Scanner key, Student[] stu) {
    Scanner data;
    try {
      data = new Scanner(new File("C:/Users/chris/OneDrive/Desktop/results.txt"));
    } catch (FileNotFoundException e) {
      System.out.println("El archivo para leer resultados no existe.");
      return;
    }

    int promedio = 0;
    for (int i = 0; i < 1000; i++) {
      System.out.println("Promedio: " + stu[i].getAverage());
      System.out.println(" ");
      promedio += stu[i].getAverage();
    }
    System.out.println("El promedio de todos los nÃƒÂºmeros de los estudiantes es: " + (promedio / stu.length));
    data.close();
  }

  static class Student {
    private int average;

    public void setAverage(int avg) {
      this.average = avg;
    }

    public int getAverage() {
      return average;
    }
  }
}
