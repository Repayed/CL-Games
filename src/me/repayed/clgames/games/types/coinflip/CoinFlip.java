package me.repayed.clgames.games.types.coinflip;

import me.repayed.clgames.CLGames;
import me.repayed.clgames.games.IGame;

import java.util.Scanner;

public class CoinFlip implements IGame {

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

    /**
     * A method which returns a random value from the CoinSides enum array,
     * it is done by using the enum's .values() method, and due to it returning
     * an array, you're able to get a value using [num]. Since I was
     * attempting to get a random value, I used the Math.random method
     * with the length of the enum's array, and then returned the value.
     *
     */
    
    private String getTossedCoinResult() {
        return CoinSides.values()[(int) (Math.random() * CoinSides.values().length)].toString();
    }
}
