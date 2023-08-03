package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void hello() {
        Scanner input = new Scanner(System.in);
        System.out.print("May i have your name? ");
        String name = input.next();
        System.out.println("Hello " + name + "!");
    }
}
