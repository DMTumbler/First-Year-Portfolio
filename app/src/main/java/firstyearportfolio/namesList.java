package firstyearportfolio;

/* Nombre: Christian Sánchez Martinez
 * Numero de Estudiante: 201-10-5048
 * 13 de noviembre 2023
 * Inf. 125
 * 
 * Programa:
 * Genera una lista de nombres, ordena dicha lista y buscar un nombre dentro de ella. 
 * Algoritmo:
 * 1. Comenzar
 * 2. Crear Lista
 * 3. Buscar nombre con algoritmo secuencial
 * 4. Buscar nombre con algoritmo binario
 * 5. Ordenar Lista
 * 6. Imprimir lista ordenada
 * 7. Buscar nombre con algoritmo secuencial
 * 8. Buscar nombre con algoritmo binario
 * 9. Terminar
 * 
 * Diccionario de Variables:
 * nameList - Arreglo tipo String que contiene los nombres.
 * indice - Representa el valor de el indice en donde esta localizado el nombre en el arreglo.
 * size - Representa el tamaño del arreglo.
 * nombre - Variable la que se le asigna el nombre que buscamos.
 * 
 * Métodos:
 * createArray - Donde se genera el arreglo llenando lo con nombres.
 * sortStringArray - Ordena el arreglo.
 * printOrderedList - Imprime el arreglo ordenado (bubble sort) en pantalla.
 * busquedaSecuencial - Busca a nombre con un algoritmo secuencial
 * busquedaBinaria - Busca a nombre con un algoritmo binario
 */
public class namesList {

  public static void demonstrate() {
    String[] namesList = new String[20];
    int size = namesList.length;
    int indice;
    String nombre = "Lucia"; // El nombre que buscamos

    namesList = fillArray();

    indice = busquedaSecuencial(namesList, size, nombre);
    mostrarIndice(indice, nombre);

    indice = busquedaBinaria(namesList, size, nombre);
    mostrarIndice(indice, nombre);

    namesList = sortStringArray(namesList, size);
    printOrderedList(namesList, size);

    indice = busquedaSecuencial(namesList, size, nombre);
    mostrarIndice(indice, nombre);

    indice = busquedaBinaria(namesList, size, nombre);
    mostrarIndice(indice, nombre);
  }

  static String[] fillArray() {
    String[] nombres = {
        "Christian",
        "Celeste",
        "Maria",
        "Alba",
        "Aitor",
        "John",
        "Candela",
        "Alan Alí",
        "Martina",
        "Paula",
        "Maria",
        "Sofia",
        "Saúl",
        "Felipe",
        "Lucia",
        "Maria",
        "Mortella",
        "Nadayne",
        "Carol",
        "Linnea"
    };
    return nombres;
  }

  static String[] sortStringArray(String[] array, int size) {
    String temp;
    System.out.println("\nOrdenemos nuestro arreglo.\n");
    for (int j = 0; j < size - 1; j++) {
      for (int i = j + 1; i < size; i++) {
        if (array[j].compareTo(array[i]) > 0) {
          temp = array[j];
          array[j] = array[i];
          array[i] = temp;
        }
      }
    }
    return array;
  }

  public static int busquedaSecuencial(String arreglo[], int size, String nombre) {
    int n = arreglo.length;
    System.out.println("\nEstamos buscando a " + nombre + " de manera secuencial: \n");
    for (int i = 0; i < n; i++) {
      System.out.println(i);
      if (arreglo[i] == nombre)
        return i;
    }
    return -1;
  }

  public static int busquedaBinaria(String arreglo[], int size, String nombre) {
    int izquierdo = 0;
    int derecho = size - 1;
    System.out.println("\nEstamos buscando a " + nombre + " de manera binaria: \n");

    while (derecho >= izquierdo) {
      int mid = izquierdo + (derecho - izquierdo) / 2;
      // Representa la diferencia lexicográfica, en otras palabras la distancia entre
      // las palabra en un diccionario.
      int lex = nombre.compareTo(arreglo[mid]);
      System.out.println("El centro es: " + mid + ". La diferencia lexicográfica es: " + lex);
      // Si lex es 0 no existe diferencia. Encontramos la palabra.
      if (lex == 0)
        return mid;
      if (lex > 0)
        izquierdo = mid + 1;
      else
        derecho = mid - 1;
    }
    return -1;
  }

  static void printOrderedList(String[] lista, int arraySize) {
    System.out.println("String ordenado es: ");
    for (int i = 0; i < arraySize; i++) {
      System.out.println((i + 1) + ": " + lista[i]);
    }
  }

  static void mostrarIndice(int index, String name) {
    if (index == -1) {
      System.out.println("\nLa person que buscaba no se encontró");
    } else if (index > -1) {
      System.out.println("\nEncontramos a " + name + "!");
      System.out.println("\nSu indice con búsqueda secuencial es " + (index + 1));
    }
  }
}
