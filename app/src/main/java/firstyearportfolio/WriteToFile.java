package firstyearportfolio;

import java.util.*;
import java.io.*;
import java.util.Random;

public class WriteToFile {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Estudiante[] stu;
		stu = generateStudents(key);
		toFile(key, stu);
		readStudent(key, stu);
	}

	public static Estudiante[] generateStudents(Scanner key) {
		int i = 0;
		Estudiante[] stu;
		stu = new Estudiante[1000];
		for (i = 0; i < 1000; i++) {
			stu[i] = new Estudiante();
		}
		return stu;
	}

	public static void toFile(Scanner key, Estudiante[] stu) {
		PrintWriter resultado;
		try {
			resultado = new PrintWriter("C:/Users/chris/OneDrive/Desktop/results.txt");
		} catch (FileNotFoundException e) {
			System.out.println("El archivo para escribir resultados no existe");
			return;
		}
		int i;
		for (i = 0; i < 1000; i++) {
			Random rd = new Random();
			System.out.println("Numero aleatorio generado " + i);
			resultado.println(stu[i].setPromedio(rd.nextInt()));
		}
		resultado.close();
	}

	public static void readStudent(Scanner key, Estudiante[] stu) {
		Scanner data;
		try {
			data = new Scanner(new File("C:/Users/chris/OneDrive/Desktop/results.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("El archivo para leer resultados no existe.");
			return;
		}

		int promedio = 0;
		for (int i = 0; i < 1000; i++) {
			System.out.println("Promedio: " + stu[i].getPromedio());
			System.out.println(" ");
			promedio += stu[i].getPromedio();
		}
		System.out.println("El promedio de todos los números de los estudiantes es: " + (promedio / stu.length));
		data.close();
	}

	static class Estudiante {
		private int promedio;

		public int setPromedio(int prom) {
			promedio = prom;
			return promedio;
		}

		public int getPromedio() {
			return promedio;
		}
	}
}
