package me.repayed.clgames;

import me.repayed.clgames.games.Game;
import me.repayed.clgames.ui.Messages;

public class CLGames {
    public static void main(String[] args) {
        Messages.printMainMenuMesage();
        sleepThread();
        Messages.printAvailableGames();
        sleepThread();
        Messages.printPickGameMessage();
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
