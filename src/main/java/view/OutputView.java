package view;

import view.util.ErrorCode;
import view.resource.Message;

public class OutputView {
    public static void printMessage(Message message){
        System.out.println(message);
    }

    public static void printMessageWithPlayerName(Message message, String playerName){
        System.out.println(String.format(message.toString(),playerName));
    }

    public static void printErrorCode(ErrorCode errorCode) {
        System.out.println(errorCode);
    }

}
