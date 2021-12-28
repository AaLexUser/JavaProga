package core.CreatureThingsTime.people;

public class Neznayka extends Person {
    public Neznayka() {
        super("Незнайка");
        super.describe(Sex.HE);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Neznayka){
            return true;
        }
        return false;
    }
}
