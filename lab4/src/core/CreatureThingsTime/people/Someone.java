package core.CreatureThingsTime.people;

public class Someone extends Person{
    public Someone() {
        super("кто");
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
