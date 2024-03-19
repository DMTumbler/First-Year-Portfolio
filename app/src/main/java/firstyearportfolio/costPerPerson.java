package firstyearportfolio;

import java.util.*;

public class costPerPerson{
    public static double userPrompt(){
            double cost;
            Scanner key = new Scanner(System.in);
            System.out.println("Please provide how much the meal will cost");
            cost = Integer.valueOf(key.nextLine());
            return cost;
    }

    public static void main (String [] args) {
        userPrompt(); 
    }
}
