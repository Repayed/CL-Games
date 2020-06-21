package me.repayed.clgames.games;

import me.repayed.clgames.games.types.coinflip.CoinFlip;
import me.repayed.clgames.games.types.TicTacToe;

import java.util.Scanner;

public class Game {

    /**
     * Available Games ->
     * - Heads Or Tails (Num. 1)
     * - Tic Tac Toe (Num. 2)
     * - Coinflip (Num. 3)
     */

    public static void pickGame() {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        switch(input) {
            case 1:
                new CoinFlip().execute();
                break;
            case 2:
                new TicTacToe().execute();
                break;
            default:
                System.out.println("The game which ou picked is not on the available games list.");
                break;
        }
    }
}
