package core.CreatureThingsTime.people;


import core.CreatureThingsTime.Creature;
import core.CreatureThingsTime.CreatureThingsTimeInterface;
import core.CreatureThingsTime.Status;
import core.print.CustomPrintInterface;


public abstract class Person extends Creature implements HumanInterface {
    private Status status = Status.NORMAL;
    protected Person(){}
    public Person(String name){
        super.name = name;
    }

    public void setStatus(Status status){
        this.status = status;
        p.println("Статус персонажа " + this.getName() + " изменён на " + status.getValue());
    }

    public Status getStatus(){
        return this.status;
    }

    @Override
    public CreatureType getCreatureType() {
        return CreatureType.People;
    }

    @Override
    public String toString(){
        return name+" "+status;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Person){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        int result = name == null ? 0 : name.hashCode();
        result+=status.hashCode();
        return result;
    }
}
