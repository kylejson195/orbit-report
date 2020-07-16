package exercises;
import java.util.Scanner;

public class rectangleArea {
public static void main(String[] args){
    double length;
    double width;
    Scanner input;

    input =  new Scanner(System.in);
    System.out.println("Please enter the length of the rectangle");
    length = input.nextDouble();


    Scanner input2;
    input2 = new Scanner(System.in);
    System.out.println("Please enter the width of the rectangle");
    width = input2.nextDouble();
    input.close();

    double area = (width * length);
    System.out.println("The area of the rectangle is " + area + " inches squared" );


}
}
