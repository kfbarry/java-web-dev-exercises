package exercises;

import java.util.Locale;
import java.util.Scanner;

public class AliceString {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String searchTerm;
        String aliceStart;
        String lowerCaseAliceStart;
        String modifiedAliceStart;
        Boolean doesContain;

        aliceStart = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        lowerCaseAliceStart = aliceStart.toLowerCase(Locale.ROOT);
        System.out.println((aliceStart));

        System.out.println("Search for a term within the first sentence of 'Alice in Wonderland'");
        searchTerm = input.nextLine().toLowerCase(Locale.ROOT);
        doesContain = lowerCaseAliceStart.contains(searchTerm);
        System.out.println("the first sentence of Alice and Wonderland contains your search term: " + doesContain);

        if (doesContain.equals(true)){
            System.out.println("search terms index: " + lowerCaseAliceStart.indexOf(searchTerm));
            System.out.println("search terms length: " + searchTerm.length());
            modifiedAliceStart = lowerCaseAliceStart.replace(searchTerm,"");
            System.out.println(modifiedAliceStart);

        }


    }
}
