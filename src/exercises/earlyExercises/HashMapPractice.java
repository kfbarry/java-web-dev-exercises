package exercises.earlyExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args){

        HashMap<Integer,String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer studentId;
        String name;

        do {
            System.out.println("Enter Student Name: ");
            name = input.nextLine();

            if (!name.equals("")) {
                System.out.println("Students ID: ");
                studentId = input.nextInt();
                students.put(studentId,name);

                input.nextLine();
            }

        } while (!name.equals(""));

        System.out.println("\nClass Roster:");

        for (Map.Entry<Integer,String> student : students.entrySet()){
           System.out.println(student.getValue() + ":" + student.getKey());
        }

    }
}
