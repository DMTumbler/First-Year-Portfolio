package firstyearportfolio;

import java.util.*;

public class ozToCups {
  public static double provideOz() {
    double cups, gallons, mesure;
    try (Scanner key = new Scanner(System.in)) {
      System.out.println("How many ounces would you like to convert to cups?");
      mesure = Double.valueOf(key.nextLine());
      if (mesure < 128) {
        cups = mesure / 8;
        System.out.println("You have " + String.format("%.2f", cups) + " cups.");
        mesure = cups;
      } else if (mesure >= 128) {
        System.out.println("you may be better of measuring things in gallons.");
        gallons = mesure / 128;
        System.out.println("You have " + String.format("%.2f", gallons) + " gallon(s).");
        mesure = gallons;
      }
    }
    return mesure;
  }

  public static void partyCalc(double mesure) {
    double amount;
    amount = mesure / 8;
    System.out.println("You have enough drink for " + amount);
    System.out.println("this is added to test the build");
  }

  public static void demonstrate() {
    double mesure = 0;
    if (mesure <= 128) {
      mesure = provideOz();
      partyCalc(mesure);
    }

  }
}
// This is a random comment to test lazygit
