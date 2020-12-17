package view.util;

public class InputHandler {
    private InputHandler() {
    }

    public static String[] splitNamesByComma(String playerNames) {
        InputValidator.checkValidName(playerNames.split(","));
        return playerNames.split(",");
    }

    public static double convertTypeToDouble(String bettingMoney){

        return Double.parseDouble(bettingMoney);
    }
}
