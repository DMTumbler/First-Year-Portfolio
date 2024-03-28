package firstyearportfolio;

import java.util.*;

public class Transactions {
  public static void demonstrate() {
    double balance = 500.00;
    Scanner key = new Scanner(System.in);
    bienvenidayMenu();
    operacionBanco(balance, key);
    double tax, subtotal, total, tip;
    double taxPercent = 0.07;
    subtotal = obtainSubT(key);
    tax = calculateTax(subtotal, taxPercent);
    total = calculateTotal(tax, subtotal);
    tip = tipCalc(total, key);
    guestSplit(tip, total, subtotal, tax, key);
  }

  static void bienvenidayMenu() {
    System.out.println("Favor de elegir que desea hacer en nuestra ATM el dia de hoy.");
    System.out.println("Entre 'a' minúscula y presione enter para deposito.");
    System.out.println("Entre 'b' minúscula y presione enter para retiro.");
    System.out.println("Entre 'c' y presione enter para verificar su balance.");

    // Este método debe tener los Println para dar la bienvenida al usuario y
    // mostrar
    // el menú de operaciones que el usuario puede realizar. Añada esas
    // instrucciones.
  }

  static void operacionBanco(double bal, Scanner key) {
    char opcion;
    double newBal = bal;
    opcion = key.next().charAt(0); // leer un carácter nada más

    switch (opcion) {
      case 'a':
        newBal = hacerDeposito(bal, key);
        break;
      case 'b':
        newBal = hacerRetiro(bal, key);
        break;
      case 'c':
        newBal = bal;
    }
    System.out.println("El balance de la cuenta es: " + newBal);
  }

  static double hacerDeposito(double balan, Scanner key) {
    double cantidad, newBalan;

    System.out.print("Favor de entrar la cantidad a depositar: ");
    cantidad = key.nextDouble();
    newBalan = balan + cantidad;
    return newBalan;
  }

  static double hacerRetiro(double balan2, Scanner key) {
    double cantidad, newBalan2;
    int optionM;
    cantidad = 0;
    System.out.println("Qué cantidad desea retirar? Presione la letra y luego enter");
    System.out.println("1: $10");
    System.out.println("2: $20");
    System.out.println("3: $50");
    System.out.println("4: $100");
    System.out.println("5: otra cantidad");
    optionM = key.nextInt();
    switch (optionM) {
      case 1:
        cantidad = 10;
        break;
      case 2:
        cantidad = 20;
        break;
      case 3:
        cantidad = 50;
        break;
      case 4:
        cantidad = 100;
        break;
      case 5:
        System.out.print("Entre cantidad a retirar: ");
        cantidad = key.nextDouble();
    }
    newBalan2 = balan2 - cantidad;
    return newBalan2;
  }

  public static double obtainSubT(Scanner key) {
    double amount;
    System.out.println("¿Cual fue el subtotal de su transacción?");
    amount = key.nextDouble();
    return amount;
  }

  public static double calculateTax(double subtotal, double taxP) {
    double tax;
    tax = subtotal * taxP;
    return tax;
  }

  public static double calculateTotal(double tax, double subtotal) {
    double total;
    total = tax + subtotal;
    return total;
  }

  public static double tipCalc(double total, Scanner key) {
    double tip = 0;
    double porciento = 0;
    System.out.println("¿Qué porciento de propina desea aportar?");
    porciento = key.nextDouble();
    tip = (porciento * 0.01) * total;
    return tip;
  }

  public static void guestSplit(double tip, double total, double subtotal, double tax, Scanner key) {
    int guests;
    System.out.println("Permitan ayudarlos a dividir la cuenta.");
    System.out.println("¿Con cuantos invitados contaba su mesa?");
    guests = key.nextInt();
    System.out.println("Son " + guests + " invitados.");
    System.out.printf("Subtotal $ %.2f\n", subtotal);
    System.out.printf("Tax $%.2f\n", tax);
    System.out.printf("Total $%.2f\n", total);
    System.out.printf("Propina $%.2f\n", tip);
    System.out.printf("El total por invitado es $%.2f\n", total / guests);
    System.out.printf("La propina por invitado es $%.2f\n", tip / guests);
  }
}
