package firstyearportfolio;

import java.util.*;

public class Circle {
    private double circumference, radius, carea, diameter;

    Circle(int shapeID) {

    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double dia) {
        diameter = dia;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double rad) {
        radius = rad;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double cir) {
        circumference = cir;
    }

    public double getArea() {
        return carea;
    }

    public void setArea(double are) {
        carea = are;
    }

    public static void main(String[] args) {
        double radius;

        radius = requestRadius();
        volumeFormula(radius);

    }

    // Calculates volume based on user passed radius
    static double volumeFormula(double userRadius) {
        double volume;
        volume = (4.0 / 3.0) * Math.PI * Math.pow(userRadius, 3);
        System.out.println("The volume of your sphere is " + volume);
        return volume;
    }

    // Requests radius from use
    static double requestRadius() {
        double radius;
        Scanner key = new Scanner(System.in);
        System.out.println("Please provide the radius of your circle and press enter ");
        radius = key.nextDouble();
        System.out.println("radio: " + radius + " pi: " + Math.PI);
        return radius;
    }

    public Circle calculateCircle(Circle shape) {
        Scanner key = new Scanner(System.in);
        System.out.println("Favor entrar el diámetro de su circulo: ");
        shape.setDiameter(key.nextDouble());
        System.out.println();

        shape.setRadius(shape.getDiameter() / 2);
        shape.setCircumference(2 * Math.PI * shape.getRadius());
        shape.setArea(Math.PI * shape.getRadius() * shape.getRadius());

        return shape;

    }
}