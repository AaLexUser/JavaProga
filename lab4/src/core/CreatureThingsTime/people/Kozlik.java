package core.CreatureThingsTime.people;

public class Kozlik extends Person {
    public Kozlik() {
        super.setName("Козлик");
        super.describe(Sex.HE);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Kozlik){
            return true;
        }
        return false;
    }
}
