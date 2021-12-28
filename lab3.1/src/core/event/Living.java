package core.event;

public class Living extends Move {
    public Living() {
        super.setName(ActionType.LIVING);
    }

    @Override
    public void Do(String act) {
        System.out.printf("что теперь %s %s в богатом доме, в обществе приличных собак,\n", super.getWho().getName(), act);
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Living){
            return true;
        }
        return false;
    }
}
