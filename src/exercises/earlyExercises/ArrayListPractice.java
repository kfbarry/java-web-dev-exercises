package exercises.earlyExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("enter word length: ");
        Integer lngth = input.nextInt();
        input.close();

        ArrayList<String> someNums = new ArrayList<>();
        someNums.add("Hello");
        someNums.add("shimmer");
        someNums.add("ashen");
        someNums.add("quarter");
        someNums.add("stout");
        someNums.add("blood");
        someNums.add("crunch");
        someNums.add("spleen");
        someNums.add("date");
        someNums.add("bid");

        for (String str : someNums){
            if (str.length() == lngth){
                System.out.println(str);
            }
        }
    }

}
