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

  public static void demoPersonList() {
    ArrayList<Person> list = new ArrayList<>();
    boolean old = false;
    System.out.println("First we will create an array of people");
    list = createPersonsList();
    showPersonList(list);
    old = determineIfListUnderage(list);
    ageInsult(old);
  }

  public static void demoPersonArray() {
    Person[] array;
    // boolean old = false;
    System.out.println("First we will create an array of people");
    int amount = setAmountScanner();
    array = createPersonsArray(amount);
    showPersonArray(array);
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
    String answer = "";
    Person[] personArray = new Person[amount];
    try (Scanner key = new Scanner(System.in)) {
      for (int i = 0; i < personArray.length; i++) {
        personArray[i] = new Person(String.valueOf(i));
        System.out.println("ID set to: " + personArray[i].getId());
        System.out.println("Set age: ");
        personArray[i].setAge(Integer.valueOf(key.nextLine()));
        System.out.println("Age set to " + personArray[i].getAge());
        System.out.println("Set Last Name: ");
        personArray[i].setlastName((key.nextLine()));
        System.out.println("Set Name: ");
        personArray[i].setName((key.nextLine()));
      }
      for (int i = 0; i < personArray.length; i++) {
        System.out.println(
            "Age:" + personArray[i].getAge() + " ID:" + personArray[i].getId() + " Name:" + personArray[i].getName()
                + " Last Name:" + personArray[i].getlastName());
        if (personArray[i].getAge() < 21) {
          System.out.println("\nWhoa! You're younger than 21?! Out I say!\n");
          System.out.println("Can we talk a moment?");
          answer = key.nextLine();
        }
        if (answer.equals("yes")) {
          System.out.println("Ok, just testing");
        } else {
          System.out.println("We have a problem");
        }
      }
    } catch (Exception e) {
      System.out.println("There has been an error.");
    }

    return personArray;
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

  public static boolean determineIfListUnderage(ArrayList<Person> list) {
    int over = 0, under = 0, count = 0;
    boolean isUnderage = false;
    for (Person person : list) {
      System.out.println(person.getName() + " is " + person.getAge());
      if (person.getAge() >= 18) {
        System.out.println("They are over 18.");
        over++;
        count++;
      } else {
        System.out.println("They are under 18.");
        under++;
        count++;
      }
    }
    if (under > over) {
      System.out.println("Out of " + count + " the mayority of your members are underage.");
      isUnderage = true;
    } else {

      System.out.println("Out of " + count + " the mayority of your members ore over 18.");
    }
    return isUnderage;
  }

  public static void ageInsult(boolean age) {
    if (age == false)
      System.out.println("Fucking 'ell. Ya a geezer, mate.");
    else
      System.out.println("Pipsqueak. Beat it.");
  }
}
