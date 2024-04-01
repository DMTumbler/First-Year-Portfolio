package firstyearportfolio;

import java.util.*;
import java.text.*;

public class blockbusterClient {
  private int rewardsP, balance, surchargeT, dayslate, movies;
  String name;

  public blockbusterClient(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }

  public int getRewardsP() {
    return rewardsP;
  }

  public int getSurchargeT() {
    return surchargeT;
  }

  public int getDayslate() {
    return dayslate;
  }

  public int getMovies() {
    return movies;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public void setRewardsP(int rewardsP) {
    this.rewardsP = rewardsP;
  }

  public void setSurchargeT(int surchargeT) {
    this.surchargeT = surchargeT;
  }

  public void setDayslate(int dayslate) {
    this.dayslate = dayslate;
  }

  public void setMovies(int movies) {
    this.movies = movies;
  }

  public static void demonstrate() {

    Scanner key = new Scanner(System.in);
    double costo;
    costo = setRentCost(key);
    explicativo(costo);
    blockbusterClient client = identify(key, costo);
    costo = askClient(client, costo, key);
    showCost(costo);
  }

  static double askClient(blockbusterClient client, double costo, Scanner key) {
    Locale locale = Locale.US;
    int dias = 0, tardanza;
    boolean answer;
    double recargo = 0;
    System.out.println("\nDevolverá la película el dia hoy?\n");
    answer = answerEntry(key);

    while (dias < 2) {
      if (answer == true) {
        System.out.println("\nGracias, lindo dia!\n");
        break;
      } else if (answer == false) {
        System.out.println("\nSe le cobrara " + NumberFormat.getCurrencyInstance(locale).format(recargo)
            + " de recargo adicional, recuerde entregar a tiempo");
        ++dias;
        System.out.println("¿Devolverá la película el dia hoy?\n");
        answer = answerEntry(key);
      }
    }

    while (dias >= 2) {
      System.out.println("Devolverá la película el dia hoy?");
      if (answer == true) {
        System.out.println("Gracias, lindo dia!");
        break;
      } else if (answer == false) {
        tardanza = dias - 1;
        System.out.println("\nSu entrega está " + tardanza + " dias tarde. Se le cobrara "
            + NumberFormat.getCurrencyInstance(locale).format(recargo)
            + " de recargo adicional por cada dia y película.");
        ++dias;
        recargo += costo / 2;
        System.out.println("¿Devolverá la película el dia hoy?");
        answer = answerEntry(key);
      }
    }
    System.out.println("Recargo: " + recargo);
    System.out.println("Costo regular: " + costo);
    return (client.getMovies() * recargo) + (client.getMovies() * costo);

  }

  static void explicativo(double rentCost) {
    Locale locale = Locale.US;
    System.out.println(
        "¡Saludos! Te ayudaremos a calcular el recargo de tu alquiler. Asegure contestar las preguntas.");
    System.out.println(
        "Se le cobrar $1 por cada dia luego del 2do dia. Puede entregar su pelicular antes, si desea.");
    System.out.println("Recuerde que el costo regular de su película sin recargo es "
        + NumberFormat.getCurrencyInstance(locale).format(rentCost));
  }

  static boolean answerEntry(Scanner key) {
    boolean decision = false;

    try {
      System.out.println("Entre su respuesta.");
      while (true) {
        String answer = key.nextLine();
        if (answer.equals("Si") || answer.equals("Sí") || answer.equals("si") || answer.equals("sí")
            || answer.equals("s") || answer.equals("S")) {
          decision = true;
          break;
        } else if (answer.equals("No") || answer.equals("no") || answer.equals("n") || answer.equals("N")) {
          decision = false;
          break;
        } else {
          System.out.println("No es una respuesta valida. Entre una respuesta valida");
        }
      }
    } catch (Exception e) {
      System.out.println("There was an error. You will have to restart the program");
    }
    return decision;
  }

  static void showCost(double cost) {
    DecimalFormat ft = new DecimalFormat("$00.00");
    System.out.println("El costo de su alquiler es de " + ft.format(cost));
  }

  public static blockbusterClient identify(Scanner key, Double cost) {
    Locale locale = Locale.US;
    System.out.println("\nPlease identify yourself");
    blockbusterClient client = null;
    try {
      while (true) {
        client = new blockbusterClient(key.nextLine());
        break;
      }
    } catch (Exception e) {
      System.out.println("That is not a valid entry. Try again.");
    }
    System.out.println("\nHow many movies will you be renting today?");
    try {
      while (true)
        if (key.hasNextInt()) {
          client.setMovies(key.nextInt());
          key.nextLine();
          break;
        } else {
          System.out.println("That is not a number. Please enter a number.");
          key.nextLine();
        }
    } catch (Exception e) {
      System.out.println("That is not a correct value. Please enter how many movies you will rent");
    }
    System.out.println("Hello " + client.getName() + "!");
    System.out.println("\nYour taking " + client.getMovies() + " movies with you today.");
    System.out.println(
        "Your total will be " + NumberFormat.getCurrencyInstance(locale).format(client.getMovies() * cost)
            + " Make sure to return on times to avoid a surcharge.");
    return client;
  }

  public static double setRentCost(Scanner key) {
    System.out.println("What is the regular cost of a movie rental?");
    double rentCost = key.nextDouble();
    key.nextLine();
    return rentCost;
  }
}
