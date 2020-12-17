package controller;

import domain.card.CardFactory;
import domain.card.Deck;
import domain.user.Player;
import domain.user.PlayerRepository;
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
        setUpCard();
    }

    private static void setUpPlayer() {
        OutputView.printMessage(Message.REQUEST_NAMES);
        for (String playerName : InputHandler.splitNamesByComma(InputView.getInput())) {
            OutputView.printMessageWithPlayerName(Message.REQUEST_BETTING_MONEY, playerName);
            double bettingMoney = InputHandler.convertTypeToDouble(InputView.getInput());
            Player player = new Player(playerName, bettingMoney);
            PlayerRepository.addPlayer(player);
        }
    }

    private static void setUpDealer() {

    }

    private static void setUpCard() {
        Deck.makeDeck(CardFactory.create());
        Deck.shuffleDeck();
    }
}
