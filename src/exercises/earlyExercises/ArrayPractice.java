package exercises.earlyExercises;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args){
        Integer[] arrayTest = {1,1,2,3,5,8};

        for (Integer item : arrayTest) {
            if (item%2 == 1) {
                System.out.println(item);
            }
        }

        String rhyme = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] rhymeParts = rhyme.split("\\.");
        System.out.println(Arrays.toString(rhymeParts));
    }
}
