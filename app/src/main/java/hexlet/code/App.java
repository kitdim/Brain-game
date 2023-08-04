package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        Scanner input = new Scanner(System.in);
        byte change;
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit""");
        System.out.print("Your change: ");
        change = input.nextByte();
        System.out.println();
        switch (change) {
            case 0:
                break;
            case 1:
                System.out.print("May i have your name? ");
                String name = input.next();
                System.out.println("Hello, " + name + "!");
                break;
            case 2:
                Even.runEven();
                break;
            default:
                break;
        }
    }
}
