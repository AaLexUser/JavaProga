package core.CreatureThingsTime;

public class Time extends CreatureThingsTime implements CreatureThingsTimeInterface{

    @Override
    public Type getType() {
        return Type.Time;
    }
    public static class Dinner extends Time{
        public Dinner(){
            super.name ="пора ужина";
            this.describe();
        }
        private void describe(){
            p.println("Время ужина");
        }
    }
}
