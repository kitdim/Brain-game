package hexlet.code;

import hexlet.code.game.Prime;
import hexlet.code.game.Progression;
import hexlet.code.game.Calc;
import hexlet.code.game.Nod;
import hexlet.code.game.Even;

import java.util.Scanner;

public class App {
    public static final Integer GREET = 1;
    public static final Integer EVEN = 2;
    public static final Integer CALC = 3;
    public static final Integer NOD = 4;
    public static final Integer PROGRESSION = 5;
    public static final Integer PRIME = 6;

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
        int numberGame = Integer.parseInt(input.next());
        System.out.println();
        if (numberGame == GREET) {
            Cli.greet();
        } else if (numberGame == EVEN) {
            Even.start();
        } else if (numberGame == CALC) {
            Calc.start();
        } else if (numberGame == NOD) {
            Nod.start();
        } else if (numberGame == PROGRESSION) {
            Progression.start();
        } else if (numberGame == PRIME) {
            Prime.start();
        }
    }
}
