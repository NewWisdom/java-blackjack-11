package controller;

import domain.user.Player;
import view.InputView;
import view.OutputView;
import view.resource.Message;
import view.util.InputHandler;

public class GameController {
    private GameController() {
        setUpGame();
    }

    public static void run() {
        setUpGame();
    }

    private static void setUpGame() {
        setUpPlayer();
    }

    private static void setUpPlayer() {
        OutputView.printMessage(Message.REQUEST_NAMES);

        for (String playerName : InputHandler.splitNamesByComma(InputView.getInput())) {
            OutputView.printMessageWithPlayerName(Message.REQUEST_BETTING_MONEY, playerName);
            double bettingMoney = InputHandler.convertTypeToDouble(InputView.getInput());
            Player player = new Player(playerName, bettingMoney);
        }


    }

    private static void setUpDealer() {

    }
}
