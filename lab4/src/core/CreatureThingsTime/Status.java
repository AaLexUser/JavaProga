package core.CreatureThingsTime;

public enum Status{
    SICK("болен"), HUNGRY("голоден"), NORMAL("нормальном");
    private final String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
