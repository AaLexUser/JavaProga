package core;

public enum Status {
    SICK("больном"), HUNGRY("голодному"), NORMAL("нормальном");
    private String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
