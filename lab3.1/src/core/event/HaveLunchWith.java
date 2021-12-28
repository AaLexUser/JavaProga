package core.event;

public class HaveLunchWith extends Move {
    public HaveLunchWith() {
        super.setName(ActionType.HAVELUNCHWITH);
    }

    @Override
    public void Do(String act) {
        System.out.printf("Всегда, когда %s %s с собаками,\n", super.getWho().getName(), act);
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof HaveLunchWith){
            return true;
        }
        return false;
    }
}
