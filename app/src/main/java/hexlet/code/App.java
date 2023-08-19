package hexlet.code;

import hexlet.code.game.Prime;
import hexlet.code.game.Progression;
import hexlet.code.game.Calc;
import hexlet.code.game.Nod;
import hexlet.code.game.Even;

import java.util.Scanner;

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
        String numberGame = input.next();
        System.out.println();
        switch (numberGame) {
            case "1" -> Cli.hello(Cli.getUserName());
            case "2" -> Even.start();
            case "3" -> Calc.start();
            case "4" -> Nod.start();
            case "5" -> Progression.start();
            case "6" -> Prime.start();
            default -> {
            }
        }
    }
}
