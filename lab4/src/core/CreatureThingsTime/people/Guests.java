package core.CreatureThingsTime.people;

public class Guests extends Person{
    public Guests() {
        super.setName("гости");
        super.describe(Sex.THEY);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Guests){
            return true;
        }
        return false;
    }
}
