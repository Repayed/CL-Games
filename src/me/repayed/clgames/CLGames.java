package me.repayed.clgames;

import me.repayed.clgames.games.Game;
import me.repayed.clgames.ui.main_messages.MainMessages;

public class CLGames {
    public static void main(String[] args) {
        MainMessages.printMainMenuMesage();
        waitMessage();
        MainMessages.printAvailableGames();
        waitMessage();
        MainMessages.printPickGameMessage();
        Game.pickGame();
    }

    private static void waitMessage(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void waitMessage() {
        waitMessage(5);
    }

}
