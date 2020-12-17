package view.util;

import java.util.Arrays;
import java.util.regex.Pattern;

public class InputValidator {
    private static final int MIN_NAME_LENGTH = 1;
    private static final String REG_LETTER = "^[a-zA-Z가-힣]*$";
    private static final int ZERO = 0;

    private InputValidator() {
    }

    public static void checkValidName(String[] playerNames) {
        if (isLessThanMinLength(playerNames)) {
            throw new IllegalArgumentException(ErrorCode.LESS_THAN_MIN_NAME_LENGTH.toString());
        }
        if (isNotValidLetter(playerNames)) {
            throw new IllegalArgumentException(ErrorCode.NOT_VALID_LETTER.toString());
        }
    }

    public static void checkValidBettingMoney(String bettingMoney) {
        if (isNotDouble(bettingMoney)){
            throw new IllegalArgumentException(ErrorCode.NOT_DOUBLE.toString());
        }
        if(isLessThanBaseMoney(bettingMoney)){
            throw new IllegalArgumentException(ErrorCode.LESS_THAN_ZERO.toString());
        }
    }

    private static boolean isLessThanMinLength(String[] playerNames) {
        return Arrays.stream(playerNames).anyMatch(name -> name.length() < MIN_NAME_LENGTH);
    }

    private static boolean isNotValidLetter(String[] playerNames) {
        return !Arrays.stream(playerNames).anyMatch(name -> Pattern.matches(REG_LETTER, name));
    }

    private static boolean isNotDouble(String bettingNumber) {
        try {
            Double.parseDouble(bettingNumber);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isLessThanBaseMoney(String bettingNumber) {
        if (Double.parseDouble(bettingNumber) <= ZERO) {
            return true;
        }
        return false;
    }

}
