package firstyearportfolio;

import java.text.DecimalFormat;
import java.util.*;

public class Student {
    private String name, lastName, studentNumber, phoneNumber, email;
    double[] grades;
    private double age;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public double[] getGrades() {
        return grades;
    }

    public double getAge() {
        return age;
    }

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Student stud1 = new Student();
        stud1.addStudent(key);
        printStudentInfo(stud1);

    }

    public static double[] fillGradesArray(Scanner key) {
        System.out.println("How many grades will you be averaging? Please enter the amount.");
        int size = 0;
        try {
            while (true)
                if (key.hasNextInt()) {
                    size = key.nextInt();
                    break;
                } else {
                    System.out.println("That is not a number. Please enter a number.");
                    key.nextLine();
                }
        } catch (Exception e) {
            System.out.println("There was an error. Restart the program.");
        }
        double[] grades = new double[size];

        System.out.println("We will be requesting " + size + " grades.");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Please enter a grade: ");
            try {
                while (true)
                    if (key.hasNextDouble()) {
                        grades[i] = key.nextDouble();
                        break;
                    } else {
                        System.out.println("That is not a number. Please enter a number.");
                        key.nextLine();
                        key.nextLine();
                    }
            } catch (Exception e) {
                System.out.println("There was an error. Restart the program.");
            }
        }
        return grades;
    }

    public static double averageGrades(double[] grades) {
        double average = 0;
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        average = sum / grades.length;
        return average;
    }

    public static void printGrades(double[] grades, double average) {
        DecimalFormat ft = new DecimalFormat("00.00");
        System.out.println("\nYour student's grades are as follow: ");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(ft.format(grades[i]) + "%   ");
        }
        System.out.println("\n\nYour student's average is: " + ft.format(average) + "%");
    }

    public static void printStudentInfo(Student stud) {
        System.out.println("\nHere are the details of your student: \n");
        System.out.println("Age: " + stud.getAge());
        System.out.println("Email: " + stud.getEmail());
        System.out.println("Last Name: " + stud.getLastName());
        System.out.println("First Name: " + stud.getName());
        System.out.println("Phone Number: " + stud.getPhoneNumber());
        System.out.println("Student Number: " + stud.getStudentNumber());
        printGrades(stud.getGrades(), averageGrades(stud.getGrades()));
        obtainLetter(averageGrades(stud.getGrades()));
    }

    public Student addStudent(Scanner key) {
        Student stud = new Student();
        System.out.print("Enter student's age: ");
        stud.setAge(key.nextDouble());
        key.nextLine();

        System.out.print("Enter student's email: ");
        stud.setEmail(key.nextLine());

        System.out.print("Enter student's last name: ");
        stud.setLastName(key.nextLine());

        System.out.print("Enter student's first name: ");
        stud.setName(key.nextLine());

        System.out.print("Enter student's phone number: ");
        stud.setPhoneNumber(key.nextLine());

        System.out.print("Enter student's student number: ");
        stud.setStudentNumber(key.nextLine());

        stud.setGrades(fillGradesArray(key));
        return stud;
    }

    public static void obtainLetter(double av) {
        if (av >= 90) {
            System.out.println("El estudiante tiene A en el curso");
        } else if (av >= 80) {
            System.out.println("El estudiante tiene B en el curso");
        } else if (av >= 70) {
            System.out.println("El estudiante tiene C en el curso");
        } else if (av >= 60) {
            System.out.println("El estudiante tiene D en el curso");
        } else {
            System.out.println("El estudiante está mega colgau");
        }
    }
}
