package exercises.earlyExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) throws FileNotFoundException {

        //File file = new File("C:\\Users\\kiera\\Desktop\\LC101\\hiddenFiguresQuote.txt");
        File file = new File("C:\\Users\\kiera\\Desktop\\LC101\\Java\\chapter1\\java-web-dev-exercises\\src\\exercises\\hiddenFiguresQuote.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
