package core.event;

public enum ActionType {
    VISIT("забежал"),
    BEABLETODO("удавалось сделать"),
    HIDE("припрятывал"),
    FORGETABOUT("забывал"),
    HAVELUNCHWITH("обедал"),
    BRING("относил"),
    NEEDHELP("нужно помочь"),
    NEEDTOBEFRIENDWITH("пристало водить компанию"),
    PAY("заплатить"),
    EAT("съедал"),
    REQUESTED("обратился"),
    STAY("находился"),
    SAY("сказала"),
    LIVING("живёт"),
    HAVE("имеет"),
    RESIDES("обитает");
    private String value;

    ActionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
