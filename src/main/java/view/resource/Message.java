package view.resource;

public enum Message {
    REQUEST_NAMES("게임에 참여할 사람의 이름을 입력하세요.(쉽표 기준으로 분리)"),
    REQUEST_BETTING_MONEY("%s 의 배팅 금액은?");

    private String message;

    Message(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
