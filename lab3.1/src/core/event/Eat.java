package core.event;

public class Eat extends Move {
    public Eat() {
        super.setName(ActionType.EAT);
    }

    @Override
    public void Do(String act) {
        System.out.printf("%s %s свою порцию до конца,\n", super.getWho().getName(), act);
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Eat){
            return true;
        }
        return false;
    }
}

