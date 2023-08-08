package hexlet.code;

import java.util.Scanner;
import hexlet.code.game.Prime;
import hexlet.code.game.Progression;
import hexlet.code.game.Calc;
import hexlet.code.game.Nod;
import hexlet.code.game.Even;

public class App {
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
        byte numberOfGame = input.nextByte();
        System.out.println();
        switch (numberOfGame) {
            case 1 -> Cli.hello(Cli.getUserName());
            case 2 -> Even.start();
            case 3 -> Calc.start();
            default -> {
            }
        }
    }
}