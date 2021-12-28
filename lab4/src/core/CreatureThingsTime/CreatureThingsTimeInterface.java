package core.CreatureThingsTime;

import core.print.CustomPrintInterface;

import java.util.ArrayList;
import java.util.List;

public interface CreatureThingsTimeInterface {
    public void setName(String name);
    public String getName();
    public Type getType();
    public void adduse(int numuse);
    public  List<Integer> Whereuse();
    public String getWhereuse();
    public enum Type{
        Creature("Существо"),
        Thing("Вещь"),
        Time("Время");
        private final String value;

        Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
