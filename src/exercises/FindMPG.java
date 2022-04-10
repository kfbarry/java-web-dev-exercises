package exercises;
import java.util.Scanner;
public class FindMPG {

    public static void main(String[] args){
        double milesDriven;
        double gallonsUsed;
        double milesPerGallon;

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven");
        milesDriven = input.nextDouble();
        System.out.println("How many gallons of gas have you used");
        gallonsUsed = input.nextDouble();
        input.close();
        milesPerGallon = milesDriven / gallonsUsed;
        System.out.println("You're getting " + milesPerGallon + "mpg");


    }
}
