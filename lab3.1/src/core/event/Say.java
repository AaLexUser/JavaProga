package core.event;

public class Say extends Move {
    public Say() {
        super.setName(ActionType.SAY);
    }

    @Override
    public void Do(String act) {
        System.out.printf("%s %s,\n", super.getWho().getName(), act);
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Say){
            return true;
        }
        return false;
    }
}
