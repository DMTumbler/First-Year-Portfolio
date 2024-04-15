package firstyearportfolio;

/* Programador: Christian Sánchez Martínez
* Inf 125 Sec.1
* Tarea: Lab 9 Archivos
* Fecha de Entrega: 10/9/2023
* Programa: Permite al usuario guardar los datos de tres estudiantes 
*
* Algoritmo: 
* 1. Comenzar
* 2. Pedir datos de usuario para llenar datos de estudiantes
*  - Nombre (String nombre)
*  - Numero de Estudiante (String numest)
*  - Año de Estudio (int anest)
*  - Cantidad de Creditos Aprobados (int creds)
*  - Dirección (String direccion)
*  - Teléfono (String teléfono)
*  - Promedio (int promedio)
* 3. Utilizar datos para llenar archivo con cinco estudiantes
* 4. Leer el archivo y mostrar los datos en pantalla
* 5. Terminar
*
* Métodos:
* toFile() - Escribe los datos de los estudiantes al archivo results.txt
* readStudents() - Lee los datos del archivo results.txt y los lee en pantalla
*/
import java.util.*;
import java.io.*;

public class Student {
  private String name, studnum, address, phone;
  private int creds, avg;

  public Student(String nom) {
    this.name = nom;
  }

  public String getName() {
    return name;
  }

  public String getNumeroEstudiante() {
    return studnum;
  }

  public String setNumeroEstudiante(String num) {
    return this.studnum = num;
  }

  public String getAddress() {
    return address;
  }

  public String setAddress(String dir) {
    return this.address = dir;
  }

  public String getPhone() {
    return phone;
  }

  public String setPhone(String tel) {
    return this.phone = tel;
  }

  public int setCreds(int creds) {
    return this.creds = creds;
  }

  public int getCreds() {
    return creds;
  }

  public int setAvg(int prom) {
    this.avg = prom;
    return avg;
  }

  public int getAvg() {
    return avg;
  }

  public static void demonstrate() {
    Scanner scanner = new Scanner(System.in);
    Student stu = new Student("Fabian");
    int studentAmount = 5;
    // studentAmount = amountOfStudents(key);
    toFile(scanner, stu, studentAmount);
    readStudent(scanner, stu, studentAmount);
  }

  /*
   * public static int amountOfStudents(Scanner key){
   * int cantidad;
   * System.out.
   * println("Favor de proveer la cantidad de estudiantes a entrar en sistema");
   * cantidad = key.nextInt();
   * key.nextLine();
   * return cantidad;
   */

  public static void toFile(Scanner key, Student stu, int amount) {
    PrintWriter resultado;
    int i = 0;
    try {
      resultado = new PrintWriter("C:/Users/chris/OneDrive/Desktop/results.txt");
    } catch (FileNotFoundException e) {
      System.out.println("El archivo para escribir resultados no existe");
      return;
    }
    resultado.close();

    for (i = 1; i - 1 < amount; i++) {
      System.out.println("Favor de entra el nombre del estudiante #" + i);
      resultado.println(stu.getName());
      System.out.println("Favor de entra el Numero de Estudiante del estudiante #" + i);
      stu.setNumeroEstudiante(key.nextLine());
      resultado.println(stu.getNumeroEstudiante());
      System.out.println("Favor de entra la direcciÃ³n del estudiante #" + i);
      stu.setAddress(key.nextLine());
      resultado.println(stu.getAddress());
      System.out.println("Favor de entra el telefono del estudiante #" + i);
      stu.setPhone(key.nextLine());
      resultado.println(stu.getPhone());
      System.out.println("Favor de entra los creditos aprobados del estudiante #" + i);
      stu.setCreds(key.nextInt());
      resultado.println(stu.getCreds());
      key.nextLine();
      System.out.println("Favor de entra el promedio del estudiante #" + i);
      stu.setAvg(key.nextInt());
      resultado.println(stu.getAvg());
      key.nextLine();
    }
    resultado.close();
  }

  public static void readStudent(Scanner key, Student stu, int amount) {
    Scanner data;
    try {
      data = new Scanner(new File("C:/Users/chris/OneDrive/Desktop/results.txt"));
    } catch (FileNotFoundException e) {
      System.out.println("El archivo para leer resultados no existe.");
      return;
    }

    for (int i = 1; i - 1 < amount; i++) {
      System.out.println("Nombre: " + stu.getName());
      System.out.println("Numero de Estudiante: " + stu.getNumeroEstudiante());
      System.out.println("Direccion: " + stu.getAddress());
      System.out.println("Telefono: " + stu.getPhone());
      System.out.println("Creditos: " + stu.getCreds());
      System.out.println("Promedio: " + stu.getAvg());
      System.out.println(" ");
    }
    data.close();
  }
}
