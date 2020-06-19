package me.repayed.clgames;

import me.repayed.clgames.games.Game;
import me.repayed.clgames.ui.MainMessages;

public class CLGames {
    public static void main(String[] args) {
        MainMessages.printMainMenuMesage();
        sleepThread();
        MainMessages.printAvailableGames();
        sleepThread();
        MainMessages.printPickGameMessage();
        Game.pickGame();
    }

    public static void sleepThread(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleepThread() {
        sleepThread(5);
    }

}
