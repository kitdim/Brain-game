package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        Scanner input = new Scanner(System.in);
        byte numberOfGame;
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - NOD
                0 - Exit""");
        System.out.print("Your change: ");
        numberOfGame = input.nextByte();
        System.out.println();
        Engine.game(numberOfGame);
    }
}
