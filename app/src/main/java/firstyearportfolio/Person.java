package firstyearportfolio;

import java.util.*;

public class Person {
  private int age, id;
  private String name, lastName;

  public Person(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setId(int id) {
    this.id = id;
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

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getlastName() {
    return lastName;
  }

  public String toString() {
    return this.name + " " + this.lastName + " age: " + this.age + ", ID: " + this.id;
  }

  public static void demonstrate() {
    ArrayList<Person> list = new ArrayList<>();
    Person[] array;
    boolean old = false;
    System.out.println("First we will create an array of people");
    array = createPersonsArray(setAmountScanner());
    list = createPersonsList();
    showPersonList(list);
    // showPersonArray(array);
    // Person person = list.get(0);
    // int age = person.getAge();
    // determineIfUnderage(age);
    // ageInsult(old);
  }

  public static int setAmountScanner() {
    int amount = 0;
    try (Scanner key = new Scanner(System.in)) {
      System.out.println("Please provide the amount of people you will add to system.");
      amount = Integer.valueOf((key.nextLine()));
    }

    return amount;
  }

  // Creates amount of people base on an amount entered by the user with scanner
  public static Person[] createPersonsArray(int amount) {
    Person[] person = new Person[amount];
    try (Scanner key = new Scanner(System.in)) {
      for (int i = 0; i < person.length; i++) {
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

  public static ArrayList<Person> createPersonsList() {
    String name = "";
    int i = 0;
    boolean validInput = false, validInput2 = false;
    ArrayList<Person> personList = new ArrayList<>();
    try (Scanner key = new Scanner(System.in)) {
      do {
        validInput = false;
        validInput2 = false;
        System.out.println("Please input a name: ");
        System.out.println("Input a blank line to exit: ");
        name = key.nextLine();
        if (name.isEmpty()) {
          validInput = true;
          break;
        }
        i++;
        Person person = new Person(name);
        System.out.println("Set last name: ");
        person.setlastName(key.nextLine());
        System.out.println("Set age: ");
        do {
          if (key.hasNextInt()) {
            person.setAge(Integer.valueOf(key.nextLine()));
            validInput2 = true;
          } else {
            System.out.println("Make sure to enter an integer, otherwise you will get an error.");
            key.nextLine();
          }
        } while (!validInput2);
        System.out.println("Id set to: " + i);
        person.setId(i);
        personList.add(person);
      } while (!validInput);
    } catch (Exception e) {
      // TODO: handle exception
    }

    return personList;

  }

  public static void showPersonList(ArrayList<Person> list) {
    for (Person person : list) {
      System.out.println(person);
    }
  }

  public static void showPersonArray(Person[] list) {
    for (Person person : list) {
      System.out.println(person);
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
