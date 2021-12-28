package core.CreatureThingsTime.dog;

public class Mimi extends Dog{
    public Mimi() {
        super.setName("Мими");
        super.describe(Sex.SHE);
    }


    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Mimi){
            return true;
        }
        return false;
    }
}
