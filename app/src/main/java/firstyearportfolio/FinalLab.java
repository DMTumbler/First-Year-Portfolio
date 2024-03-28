package firstyearportfolio;

/* Programado: Christian Sánchez Martínez
 * Inf. 125
 * 12/3/2023
 * 
 * Programa:
 * Genera una lista de estudiantes con los datos de que cada estudiante. Esta lista existe de forma no ordenada
 * pero el programa luego ordena los estudiantes según su numero de estudiante.
 * 
 * Algoritmo:
 * 1. Comenzar
 * 2. Generar lista de estudiantes
 * 3. Mostrar lista no ordenada
 * 4. Ordenar lista
 * 5. Mostrar lista ordenada
 * 6. Terminar
 * 
 * Diccionario de Variables:
 * - NumEst = Representa el numero de estudiante a ser buscado en sistema.
 * - index = Variable a la que se le asigna el indice en donde se encuentra al estudiante.
 * - arregloEstudiantes = Arreglo donde que se llena de objetos representativos de los estudiantes.
 * Métodos:
 * - createStudentArray(): Genera el arreglo de estudiantes según la información entrada por el estudiante.
 * - showStudentArray(): Enseña el arreglo generado.
 * - studentSearch(): Busca a un estudiante en particular basado en su numero de estudiante.
 * - mostrarIndice(): Muestra el indice en el que se encuentra el estudiante en el arreglo.
 * - orderStudentArray(): Ordena los estudiantes dentro del arreglo.
 * - mostrarEstudiante(): Muestra los estudiantes irrelevante de si están ordenados o no.
 * 
 * 
 */
import java.util.*;

public class FinalLab {
  public static void demonstrate() {
    int numEst = 201;
    int index;
    Scanner key = new Scanner(System.in);
    Estudiante[] arregloEstudiantes;
    arregloEstudiantes = createStudentArray(key);

    System.out.println("Sus estudiantes sin ordenar son:\n");
    showStudentArray(arregloEstudiantes);
    index = studentSearch(arregloEstudiantes, numEst);
    mostrarIndice(index);
    mostrarEstudiante(arregloEstudiantes, index);

    arregloEstudiantes = orderStudentArray(arregloEstudiantes);

    System.out.println("Sus estudiantes ordenados son:\n");
    showStudentArray(arregloEstudiantes);
    index = studentSearch(arregloEstudiantes, numEst);
    mostrarIndice(index);
    mostrarEstudiante(arregloEstudiantes, index);
  }

  public static class Estudiante {
    private String name, phoneNumber, address, concentration;
    private int credits, studentNumber;

    // Setter methods
    public void setName(String name) {
      this.name = name;
    }

    public void setAddress(String address) {
      this.address = address;
    }

    public void setStudNumber(int studentNumber) {
      this.studentNumber = studentNumber;
    }

    public void setCredits(int credits) {
      this.credits = credits;
    }

    public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
    }

    public void setConcentration(String concentration) {
      this.concentration = concentration;
    }

    public String getName() {
      return name;
    }

    public String getAddress() {
      return address;
    }

    public String getPhoneNumber() {
      return phoneNumber;
    }

    public String getConcentration() {
      return concentration;
    }

    public int getStudentNumber() {
      return studentNumber;
    }

    public int getCredits() {
      return credits;
    }
  }

  public static void mostrarIndice(int n) {
    if (n == -1) {

    } else
      System.out.println("El estudiante se encuentra en el indice " + n);
  }

  public static Estudiante[] createStudentArray(Scanner key) {
    int size;
    System.out.println("How many students will we be adding to the the system?");
    size = key.nextInt();
    key.nextLine();
    Estudiante[] studArray = new Estudiante[size];
    System.out.println("Entremos los datos de cada estudiante.");
    for (int i = 0; i < size; i++) {
      studArray[i] = new Estudiante();
      System.out.println("Favor de entrar el nombre del estudiante " + (i + 1));
      studArray[i].setName(key.nextLine());
      System.out.println("Favor entrar el numero de estudiante.");
      studArray[i].setStudNumber(key.nextInt());
      key.nextLine();
      System.out.println("Favor entrar el numero de teléfono del estudiante.");
      studArray[i].setPhoneNumber(key.nextLine());
      System.out.println("Favor de entrar la dirección del estudiante.");
      studArray[i].setAddress(key.nextLine());
      System.out.print("Favor de entrar la concentración del estudiante.\n");
      studArray[i].setConcentration(key.nextLine());
      System.out.println("Favor de entrar los créditos aprobados del estudiante.");
      studArray[i].setCredits(key.nextInt());
      key.nextLine();
    }
    return studArray;
  }

  public static void showStudentArray(Estudiante[] studArray) {
    for (int i = 0; i < studArray.length; i++) {
      System.out.println("\nNombre: " + studArray[i].getName());
      System.out.println("Numero de Estudiante: " + studArray[i].getStudentNumber());
      System.out.println("Numero de teléfono: " + studArray[i].getPhoneNumber());
      System.out.println("Dirección: " + studArray[i].getAddress());
      System.out.println("Concentración: " + studArray[i].getConcentration());
      System.out.println("Credits:" + studArray[i].getCredits() + "\n");
    }
  }

  public static void mostrarEstudiante(Estudiante[] studArray, int stud) {
    if (stud == -1) {
      System.out.println("");
    } else {
      System.out.println("El estudiante en el indice " + stud + " es ");
      System.out.println("\nNombre: " + studArray[stud].getName());
      System.out.println("Numero de Estudiante: " + studArray[stud].getStudentNumber());
      System.out.println("Numero de teléfono: " + studArray[stud].getPhoneNumber());
      System.out.println("Dirección: " + studArray[stud].getAddress());
      System.out.println("Concentración: " + studArray[stud].getConcentration());
      System.out.println("Credits:" + studArray[stud].getCredits() + "\n");
    }
  }

  public static Estudiante[] orderStudentArray(Estudiante[] studArray) {
    for (int i = 0; i < studArray.length - 1; i++) {
      for (int j = 0; j < studArray.length - i - 1; j++) {
        if (studArray[j].getStudentNumber() > studArray[j + 1].getStudentNumber()) {
          Estudiante temp = studArray[j];
          studArray[j] = studArray[j + 1];
          studArray[j + 1] = temp;
        }
      }
    }
    return studArray;
  }

  public static int studentSearch(Estudiante[] studArray, int numEst) {
    int izq = 0, der = studArray.length - 1;
    while (izq <= der) {
      int m = izq + (der - izq) / 2;
      if (studArray[m].getStudentNumber() == numEst)
        return m;
      if (studArray[m].getStudentNumber() < numEst)
        izq = m + 1;
      else
        der = m - 2;
    }
    return -1;
  }
}
