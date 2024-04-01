package firstyearportfolio;

import java.util.Scanner;

public class App {
  public void getGreeting() {
    System.out.println("This is a collection of the different classes that I have");
    System.out.println("Developed in the first year of my college CS program.");
    System.out.println("A combination of options will be visible to try out those");
    System.out.println("Different classes.\n");
    System.out.println("Please select 1 through 3 to see the different option. Press 4 for More.");
    System.out
        .println("1: A class that contains an assortment of programs based on math exercises.");
    System.out.println("2: Generates a random array and finds the average, variance and deviation.");
    System.out.println("3: Demonstrates the Fibonnaci sequence.");
    System.out.println("4: See more options relating to object manipulation.");
  }

  public int selectExcercise() {
    int value = 0;
    boolean validInput = false;
    try (Scanner key = new Scanner(System.in)) {
      do {
        if (key.hasNextInt()) {
          value = Integer.valueOf(key.nextLine());
          validInput = true;
          switch (value) {
            case 1:
              MathFormulas.demonstrate();
              break;
            case 2:
              ManageArray.demonstrate();
              break;
            case 3:
              Fibonacci.demonstrate();
              break;
            case 4:
              System.out.println("Please select 1 through 3 to see the different option. Press 4 for More.");
              System.out.println("1: To be added.");
              System.out.println("2: To be added.");
              System.out.println("3: To be added.");
              System.out.println("4: More.");
              value = Integer.valueOf(key.nextLine());
              switch (value) {
                case 1:
                  System.out.println("This is a placeholder. More apps are to be added.");
                  break;

                default:
                  System.out.println("This is a placeholder. More apps are to be added.");
                  break;
              }
          }
        } else {
          System.out.println("That is not a number. Please enter a number.");
          key.nextLine();
        }

      } while (!validInput);
    } catch (Exception e) {
      System.out.println("The program has encountered an error. Please restart.");
    }

    return value;
  }

  public static void main(String[] args) {
    App myApp = new App();
    myApp.getGreeting();
    myApp.selectExcercise();
  }

}
