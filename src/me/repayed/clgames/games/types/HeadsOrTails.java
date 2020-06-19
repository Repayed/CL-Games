package me.repayed.clgames.games.types;

import me.repayed.clgames.CLGames;
import me.repayed.clgames.games.IGame;

import java.util.Scanner;

public class HeadsOrTails implements IGame {

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to heads or tails!");
        System.out.println();
        System.out.println("Write your option between");
        System.out.println("heads or tails below: ");
        System.out.println();

        String choice = scanner.nextLine();
        CLGames.sleepThread(2);
        System.out.println("Throwing coin in the air....");
        CLGames.sleepThread(2);
        System.out.println("and the result is....");
        CLGames.sleepThread(2);

        String result = getTossedCoinResult();
        if(result.equalsIgnoreCase(choice)) {
            System.out.println("YOU WON! IT LANDED ON " + result);
        } else {
            System.out.println("YOU LOST :C IT LANDED ON " + result);
        }

    }

    private String getTossedCoinResult() {
        int numBetweenZeroToHundred = (int) (Math.random() * 100) + 1;
        System.out.println(numBetweenZeroToHundred);

        if(numBetweenZeroToHundred <= 49) {
            return "heads";
        } else {
            return "tails";
        }
    }
}
