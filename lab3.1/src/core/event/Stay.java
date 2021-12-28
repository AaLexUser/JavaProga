package core.event;

public class Stay extends Move {
    public Stay() {
        super.setName(ActionType.STAY);
    }

    @Override
    public void Do(String act) {
        System.out.printf("%s %s в дрянингской ночлежке.\n", super.getWho().getName(), act);
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Stay){
            return true;
        }
        return false;
    }
}
