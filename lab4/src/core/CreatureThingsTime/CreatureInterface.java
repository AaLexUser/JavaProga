package core.CreatureThingsTime;

public interface CreatureInterface extends CreatureThingsTimeInterface {
    public void describe(Creature.Sex s);
    @Override
    default Type getType() {
        return Type.Creature;
    }
    public CreatureType getCreatureType();
    public enum CreatureType{
        People("Человек"),
        Dog("Собака");
        private final String value;

        CreatureType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
