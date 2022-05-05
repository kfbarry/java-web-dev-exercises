package exercises.earlyExercises;
import java.util.Scanner;
public class AreaOfRectagle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the Height of the rectangle");
        double height = input.nextInt();
        System.out.println("What is the Width of the rectangle");
        double width = input.nextInt();
        input.close();
        double area = height * width;
        System.out.println("The area of the rectangle is " + area);
    }
}
