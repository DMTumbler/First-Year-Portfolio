package firstyearportfolio;

import java.util.Scanner;

public class App {
  public void getGreeting() {
    System.out.println("This is a collection of the different classes that I have");
    System.out.println("developed in the first year of my college CS program.");
    System.out.println("A combination of options will be visible to try out those");
    System.out.println("Different classes.\n");
    System.out.println("Please select 1 through 3 to see the different option. Press 4 for More.");
    System.out
        .println("1: A class that contains an assortment of programs based on math exercises.");
    System.out.println("2: Generates a random array and finds the average, variance and deviation.");
    System.out.println("3: Demonstrates the Fibonnaci sequence requesting the max number from the user.");
    System.out.println("4: See more options relating to object manipulation.");
  }

  public int selectExcercise() {
    int value = 0;
    boolean validInput = false;
    try (Scanner scanner = new Scanner(System.in)) {
      do {
        if (scanner.hasNextInt()) {
          value = Integer.valueOf(scanner.nextLine());
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
              System.out.println("1: Adds people to an ArrayList or regular Array.");
              System.out.println("2: To be added.");
              System.out.println("3: To be added.");
              System.out.println("4: More.");
              value = Integer.valueOf(scanner.nextLine());
              switch (value) {
                case 1:
                  System.out.println("Select 1 to build your array of people.");
                  value = Integer.valueOf(scanner.nextLine());
                  switch (value) {
                    case 1:
                      Person.demoArrayCreation();
                      break;
                    case 2:
                      System.out.println(" is a placeholder. More apps are to be added.");
                      Person.demoPersonArray();
                      break;
                    case 3:
                      System.out.println("This is a placeholder. More apps are to be added.");
                      break;
                    case 4:
                      System.out.println("This is a place holder. More apps are to be added.");
                    default:
                      break;
                  }
                default:
                  System.out.println("This is a placeholder. More apps are to be added.");
                  break;
              }
          }
        } else {
          System.out.println("That is not a number. Please enter a number.");
          scanner.nextLine();
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
