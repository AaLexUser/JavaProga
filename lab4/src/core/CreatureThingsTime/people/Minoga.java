package core.CreatureThingsTime.people;

public class Minoga extends Person {
    public Minoga() {
        super.setName("Госпожа Минога");
        super.describe(Sex.SHE);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Minoga){
            return true;
        }
        return false;
    }
}
