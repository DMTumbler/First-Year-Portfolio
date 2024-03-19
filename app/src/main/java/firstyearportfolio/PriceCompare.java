package firstyearportfolio;

import java.util.Scanner;

public class PriceCompare {
  public static class article {
    private String name;
    private double price;

    public article(String name, double price) {
      this.name = name;
      this.price = price;
    }

    public String getName() {
      return name;
    }

    public double getPrice() {
      return price;
    }
  }

  public static void main(String[] args) {

    inputPrices();
  }

  public static void inputPrices() {
    System.out.println("This is a program to compare the prices between two items. \n Please input two items.");
    try (Scanner key = new Scanner(System.in)) {
      article article1 = new article("green", (Double.valueOf(key.nextLine())));
      article article2 = new article("red", (Double.valueOf(key.nextLine())));
      comparePrices(article1, article2);
    }
  }

  public static void comparePrices(article article1, article article2) {
    if (article1.getPrice() < article2.getPrice()) {
      System.out.println("The first item is cheaper.");
    } else if (article1.getPrice() > article2.getPrice()) {
      System.out.println("The second item is cheaper.");
    } else {
      System.out.println("The items cost the same.");
    }
  }
}
