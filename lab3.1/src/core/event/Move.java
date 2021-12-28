package core.event;

import core.people.HumanInterface;

public abstract class Move implements EventDoItInterface {
    private String name;
    private HumanInterface who;

    public void setWho(HumanInterface who) {
        this.who = who;
    }

    public HumanInterface getWho() {
        return who;
    }

    public void setName(ActionType act) {
        this.name = act.getValue();
    }

    public String getName() {
        return name;
    }

    public abstract void Do(String act);

    public void do_it() {
        Do(name);
    }

    public void do_not_it() {
        Do("не " + name);
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Move){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        int result = this.getName() == null ? 0 : this.getName().hashCode();
        return result;
    }
}
