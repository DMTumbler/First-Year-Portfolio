package firstyearportfolio;

import java.util.*;

public class Rectangle {
  private double width, height, perimeter, area;

  Rectangle(int shapeID) {

  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double wth) {
    width = wth;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double hgt) {
    height = hgt;
  }

  public double getPerimeter() {
    return perimeter;
  }

  public void setPerimeter(double per) {
    perimeter = per;
  }

  public double getArea() {
    return area;
  }

  public void setArea(double are) {
    area = are;
  }

  public static void demonstrate() {
    Rectangle rect1 = new Rectangle(1);
    Circle circ1 = new Circle(1);
    circ1.calculateCircle(circ1);
    Rectangle.calculateRectangle(rect1);
    Rectangle.showShapes(circ1, rect1);
  }

  public static void calculateRectangle(Rectangle shape) {
    Scanner key = new Scanner(System.in);
    System.out.println("Favor entrar el alto del rectángulo: ");
    shape.setHeight(key.nextDouble());
    System.out.println();

    System.out.println("Favor entrar el ancho del rectángulo: ");
    shape.setWidth(key.nextDouble());
    System.out.println();

    shape.setArea(shape.getWidth() * shape.getHeight());
    shape.setPerimeter(2 * (shape.getWidth() + shape.getHeight()));

    System.out.println("Medidas de su rectángulo basado en un alto de " + shape.getHeight() + " y un ancho de "
        + shape.getWidth() + ": ");
    System.out.println("Area de rectángulo: " + shape.getArea());
    System.out.println("Perímetro de rectángulo: " + shape.getPerimeter());
    System.out.println();

  }

  public static void showShapes(Circle circle, Rectangle rect) {
    System.out.println("Medidas de su Circulo basado en un diámetro de " + circle.getDiameter() + ": ");
    System.out.println("Area de circulo: " + circle.getArea());
    System.out.println("Radio de circulo: " + circle.getRadius());
    System.out.println("Circunferencia de circulo: " + circle.getCircumference());
    System.out.println("Medidas de su rectángulo: " + "\nPerímetro - " + rect.getPerimeter() + "\nArea - "
        + rect.getArea() + "\n" + "\nMedidas de su circulo:\n" + "Area - " + circle.getArea() + "\nRadio - "
        + circle.getRadius() + "\nCircunferencia - " + circle.getCircumference());
  }
}
