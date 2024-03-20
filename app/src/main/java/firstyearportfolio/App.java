package firstyearportfolio;

import java.util.Scanner;

public class App {
    public int getGreeting() {
        int value = 0;
        try (Scanner key = new Scanner(System.in)) {
            System.out.println("This is a collection of the different classes that I have");
            System.out.println("Developed in the first year of my college CS program.");
            System.out.println("A combination of options will be visible to try out those");
            System.out.println("Different classes.\n");
            System.out.println("Please select 1 through 3 to see the different option. Press 4 for More.");
            System.out
                    .println("1: A monolithic class that contains an assortment of programs based on math exercises.");
            System.out.println("2: Generates a random array and finds the average variance and deviation.");
            System.out.println("3: Averages a multidimensional array.");
            System.out.println("4: More.");
            if (key.hasNextLine()) {
                value = Integer.valueOf(key.nextLine());
                switch (value) {
                    case 1:
                        MathFormula.show();
                        break;
                    case 2:
                        RandomArray.show();
                        break;
                    case 3:
                        AveragedArrays.show();
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
            }
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
