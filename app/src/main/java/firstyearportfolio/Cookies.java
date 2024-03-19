package firstyearportfolio;

import java.util.*;

public class Cookies {
    private String type;
    private double size, amount, cost, costPerInch;

    public String getType() {
        return type;
    }

    public String setType(String type) {
        return this.type = type;
    }

    public double getSize() {
        return size;
    }

    public double setSize(double size) {
        return this.size = size;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setCostPerInch(double costPerInch) {
        this.costPerInch = costPerInch;
    }

    public double getCostPerInch() {
        return costPerInch;
    }

    static double requestCookieAmount(Scanner key) {
        Cookies cookie = new Cookies();
        double cookieAmount = 0;

        try {
            while (true) {
                System.out.println("Please provide the amount of cookies you will be selling:");
                if (key.hasNextDouble()) {
                    cookie.setAmount(key.nextDouble());
                    key.nextLine();
                    break; // Exit the loop if valid input
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    key.nextLine(); // Consume the invalid input
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred. Please try again.");
        }

        cookieAmount = cookie.getAmount();
        System.out.println("You entered: " + cookieAmount);

        return cookieAmount;
    }

    static double requestCookieSize(Scanner key) {
        Cookies cookie = new Cookies();
        double cookieSize = 0;

        try {
            while (true) {
                System.out.println("Please provide the size of the cookies in inches:");
                if (key.hasNextDouble()) {
                    cookie.setSize(key.nextDouble());
                    key.nextLine();
                    break; // Exit the loop if valid input
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    key.nextLine(); // Consume the invalid input
                }
            }

            cookieSize = cookie.getSize();
            System.out.println("You entered: " + cookieSize);

        } catch (Exception e) {
            System.out.println("An error occurred. Please try again.");
        }

        return cookieSize;
    }

    static String requestCookieType(Scanner key) {
        Cookies cookie = new Cookies();
        String cookieType = "String";

        try {
            System.out.println("Please provide the type of cookie you will be selling:");
            cookie.setType(key.nextLine());
            cookieType = cookie.getType();
            System.out.println("You entered: " + cookieType);
        } catch (Exception e) {
            System.out.println("An error occurred. Please try again.");
        }

        return cookieType;
    }

    // There are twelve inches in a foot
    static double calcCostPerInch(double size, double cost) {
        double costPerInch;
        costPerInch = cost / size;
        return costPerInch;
    }

    static double requestCost(Scanner key) {
        double cost;
        System.out.println("Please provide the cost of your cookie.");
        cost = Double.valueOf(key.nextLine());
        return cost;
    }

    public static void main(String[] args) {
        Cookies graham = new Cookies();
        Scanner key = new Scanner(System.in);
        graham.setAmount(requestCookieAmount(key));
        graham.setSize(requestCookieSize(key));
        graham.setType(requestCookieType(key));
        graham.setCost(requestCost(key));
        graham.setCostPerInch(calcCostPerInch(graham.getSize(), graham.getCost()));
        System.out.println("Here are the details of your cookie: ");
        System.out.println("Amount of cookies: " + graham.getAmount());
        System.out.println("Size: " + String.format("$" + "%.0f", graham.getSize()));
        System.out.println("Type: " + (graham.getType()));
        System.out.println("Cost: " + String.format("$" + "%.2f", graham.getCost()));
        System.out.println("Cost per Inch: " + String.format("$" + "%.2f", graham.getCostPerInch()));
        System.out.println(
                "Total cost of Transaction: " + String.format("$" + "%.2f", graham.getCost() * graham.getAmount()));
    }

}
