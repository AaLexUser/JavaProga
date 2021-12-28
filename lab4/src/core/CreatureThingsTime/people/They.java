package core.CreatureThingsTime.people;

public class They extends Person{
    public They() {
        super.setName("они");
        super.describe(Sex.THEY);
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
