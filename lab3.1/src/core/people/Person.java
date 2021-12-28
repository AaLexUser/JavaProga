package core.people;


import core.Status;
import core.event.ActionType;
import core.event.EventDoItInterface;
import core.event.Move;


public abstract class Person implements HumanInterface {
    private String name;
    private Status status = Status.NORMAL;
    protected Person(){}
    public Person(String name){
        this.name = name;
    }

    public void setName(String name){
        if (!(name.equals(""))) {
            this.name = name;
        }
        else{
            System.out.println("Error! Name can't be empty");
        }
    }

    public String getName(){
        return name;
    }

    public abstract void describe();//Здесь должно быть описание

    public void setStatus(Status status){
        this.status = status;
        System.out.println("Статус персонажа " + this.getName() + " изменён на " + status);
    }

    public Status getStatus(){
        return this.status;
    }


    public void run(EventDoItInterface act, boolean i){
        act.setWho(this);
        if(i){act.do_it();}
        else{act.do_not_it();}
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
