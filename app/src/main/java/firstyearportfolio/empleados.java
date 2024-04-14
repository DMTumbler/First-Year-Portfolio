package firstyearportfolio;

import java.util.Scanner;

public class Empleados {
  private String name, surname;
  private int edad;

  public Empleados(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int age) {
    this.edad = age;
  }

  public static void demonstrate() {
    try (Scanner scanner = new Scanner(System.in)) {
      String name = "", surname = "";
      int age = 0;
      int[][][] employees = new int[5][5][5];
      name = scanner.nextLine();
      surname = scanner.nextLine();
      age = Integer.valueOf(scanner.nextLine());
      Empleados emp1 = new Empleados(name);
      System.out.println("How old are you?");
      emp1.setEdad(age);
      System.out.println("What is your last name?");
      emp1.setSurname(surname);
      employeeNames(employees);
    } catch (Exception e) {
      // TODO: handle exception
    }
  }

  public static int employeeNames(int[][][] array) {
    int i;
    int j = 0;
    int k = 0;
    int value = 0;
    for (i = 21; i < 26; i++) {
      value = array[i][j][k] = i;
    }
    return value;

  }

}
