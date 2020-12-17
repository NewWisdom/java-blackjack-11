package view.util;

public enum ErrorCode {
    LESS_THAN_MIN_NAME_LENGTH("이름이 1글자 이상이 아닙니다."),
    NOT_VALID_LETTER("이름이 문자가 아닙니다."),
    NOT_DOUBLE("베팅 금액은 정수여야 합니다."),
    LESS_THAN_ZERO("베팅 금액은 양수여야 합니다.");

    ErrorCode(String message){
        this.message = message;
    }
    private String message;

    @Override
    public String toString(){
        return message;
    }
}
