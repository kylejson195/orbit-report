package exercises;
import java.util.Scanner;

public class mpgCalculator {
    public static void main(String[] args){
        double miles;
        double gallonsGas;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("How many miles did you drive today? ");
        miles =input.nextDouble();

        Scanner input2;
        input2 = new Scanner(System.in);
        System.out.println("How many gallons of gas did you use?");
        gallonsGas = input.nextDouble();
        input2.close();

        double mpg = (miles / gallonsGas);
        System.out.println("Your car ran at an efficiency of " + mpg +" miles per gallon today");

    }
}
