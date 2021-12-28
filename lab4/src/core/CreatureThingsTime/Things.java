package core.CreatureThingsTime;

public class Things extends CreatureThingsTime{
    public Things(String name){
        super.name=name;
    }
    @Override
    public Type getType() {
        return Type.Thing;
    }
}
