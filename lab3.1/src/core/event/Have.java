package core.event;

public class Have extends Move {
    public Have() {
        super.setName(ActionType.HAVE);
    }

    @Override
    public void Do(String act) {
        System.out.printf("%s даже дома собственного %s,\n", super.getWho().getName(), act);
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Have){
            return true;
        }
        return false;
    }
}
