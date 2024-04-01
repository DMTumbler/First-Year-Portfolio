package firstyearportfolio;

import java.util.*;

public class Person {
  private int age;
  private String id, name, lastName;

  public Person(String id) {
    this.id = id;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setlastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getlastName() {
    return lastName;
  }

  public static void main(String[] args) {
    createPerson(clientSetAmount());
    // boolean age = determineIfUnderage();
    // ageInsult(age);
  }

  public static int clientSetAmount() {
    int amount = 0;
    try (Scanner key = new Scanner(System.in)) {
      System.out.println("Please provide the amount of people you will add to system.");
      amount = Integer.valueOf((key.nextLine()));
    }

    return amount;
  }

  // Creates amount of people base on an amount entered by the user with scanner
  public static Person[] createPerson(int amount) {
    Person[] person = new Person[amount];
    try (Scanner key = new Scanner(System.in)) {
      for (int i = 0; i < amount; i++) {
        person[i] = new Person(String.valueOf(i));
        System.out.println("ID set to: " + i);
        System.out.println("Set age: ");
        person[i].setAge(Integer.valueOf(key.nextLine()));
        System.out.println("Set Last Name: ");
        person[i].setlastName((key.nextLine()));
        System.out.println("Set Name: ");
        person[i].setName((key.nextLine()));
        for (i = 0; i < amount; i++) {
          System.out.println("Age:" + person[i].getAge() + " ID:" + person[i].getId() + " Name:" + person[i].getName()
              + " Last Name:" + person[i].getlastName());
          if (person[i].getAge() < 21)
            ;
          System.out.println("\nWhoa! You're younger than 21?! Out I say!\n");
          System.out.println("Can we talk a moment?");
          String answer = key.nextLine();
          if (answer.equals("yes")) {
            System.out.println("Ok, just testing");
          } else {
            System.out.println("We have a problem");
          }
        }
      }

      return person;
    }
  }

  public static boolean determineIfUnderage(int value) {
    if (value >= 18) {
      System.out.println("Este individuo es mayor de edad");
      return true;
    }
    System.out.println("Este individuo no es mayor de edad");
    return false;
  }

  public static void ageInsult(boolean age) {
    if (age == true)
      System.out.println("Fucking 'ell. Ya a geezer, mate.");
    else
      System.out.println("Pipsqueak. Beat it.");
  }
}
