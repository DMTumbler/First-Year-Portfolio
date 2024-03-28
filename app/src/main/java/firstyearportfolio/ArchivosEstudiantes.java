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

public class ArchivosEstudiantes {
  public static void demonstrate() {
    Scanner key = new Scanner(System.in);
    Estudiante stu = new Estudiante();
    int studentAmount = 5;
    // studentAmount = amountOfStudents(key);
    toFile(key, stu, studentAmount);
    readStudent(key, stu, studentAmount);
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

  public static void toFile(Scanner key, Estudiante stu, int amount) {
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
      stu.setNombre(key.nextLine());
      resultado.println(stu.getNombre());
      System.out.println("Favor de entra el Numero de Estudiante del estudiante #" + i);
      stu.setNumeroEstudiante(key.nextLine());
      resultado.println(stu.getNumeroEstudiante());
      System.out.println("Favor de entra la dirección del estudiante #" + i);
      stu.setDireccion(key.nextLine());
      resultado.println(stu.getDireccion());
      System.out.println("Favor de entra el telefono del estudiante #" + i);
      stu.setTelefono(key.nextLine());
      resultado.println(stu.getTelefono());
      System.out.println("Favor de entra los creditos aprobados del estudiante #" + i);
      stu.setCreditos(key.nextInt());
      resultado.println(stu.getCreditos());
      key.nextLine();
      System.out.println("Favor de entra el promedio del estudiante #" + i);
      stu.setPromedio(key.nextInt());
      resultado.println(stu.getPromedio());
      key.nextLine();
    }
    resultado.close();
  }

  public static void readStudent(Scanner key, Estudiante stu, int amount) {
    Scanner data;
    try {
      data = new Scanner(new File("C:/Users/chris/OneDrive/Desktop/results.txt"));
    } catch (FileNotFoundException e) {
      System.out.println("El archivo para leer resultados no existe.");
      return;
    }

    for (int i = 1; i - 1 < amount; i++) {
      stu.setNombre(data.nextLine());
      System.out.println("Nombre: " + stu.getNombre());
      stu.setNombre(data.nextLine());
      System.out.println("Numero de Estudiante: " + stu.getNumeroEstudiante());
      stu.setNombre(data.nextLine());
      System.out.println("Direccion: " + stu.getDireccion());
      stu.setNombre(data.nextLine());
      System.out.println("Telefono: " + stu.getTelefono());
      stu.setNombre(data.nextLine());
      System.out.println("Creditos: " + stu.getCreditos());
      stu.setNombre(data.nextLine());
      System.out.println("Promedio: " + stu.getPromedio());
      System.out.println(" ");
    }
    data.close();
  }
}

final class Estudiante {
  private String nombre, numest, direccion, telefono;
  private int creditos, promedio;

  public String getNombre() {
    return nombre;
  }

  public String setNombre(String nom) {
    return nombre = nom;
  }

  public String getNumeroEstudiante() {
    return numest;
  }

  public String setNumeroEstudiante(String num) {
    return numest = num;
  }

  public String getDireccion() {
    return direccion;
  }

  public String setDireccion(String dir) {
    return direccion = dir;
  }

  public String getTelefono() {
    return telefono;
  }

  public String setTelefono(String tel) {
    return telefono = tel;
  }

  public int setCreditos(int creds) {
    return creditos = creds;
  }

  public int getCreditos() {
    return creditos;
  }

  public int setPromedio(int prom) {
    promedio = prom;
    return promedio;
  }

  public int getPromedio() {
    return promedio;
  }
}
