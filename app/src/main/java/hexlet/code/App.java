package hexlet.code;

import hexlet.code.game.Prime;
import hexlet.code.game.Progression;
import hexlet.code.game.Calc;
import hexlet.code.game.Nod;
import hexlet.code.game.Even;

import java.util.Scanner;

public class App {
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int NOD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;

    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - NOD
                5 - Progression
                6 - Prime
                0 - Exit""");
        System.out.print("Your change: ");
        Scanner input = new Scanner(System.in);
        int numberGame = input.nextInt();
        System.out.println();
        switch (numberGame) {
            case GREET -> Cli.greet();
            case EVEN -> Even.start();
            case CALC -> Calc.start();
            case NOD -> Nod.start();
            case PROGRESSION -> Progression.start();
            case PRIME -> Prime.start();
            default -> {
            }
        }
    }
}
