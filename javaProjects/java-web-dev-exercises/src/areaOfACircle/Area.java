package areaOfACircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("What is the radius of this circle? ");
        radius = input.nextDouble();
        input.close();

       // double area = (radius * radius * 3.14);
        System.out.println("The area of the circle is " + Circle.getArea(radius) +" inches squared");
    }
}
