package core.event;

public class Resides extends Move {
    public Resides() {
        super.setName(ActionType.RESIDES);
    }

    @Override
    public void Do(String act) {
        System.out.printf("а %s в какой-то ночлежке.\n", act);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Resides){
            return true;
        }
        return false;
    }
}
