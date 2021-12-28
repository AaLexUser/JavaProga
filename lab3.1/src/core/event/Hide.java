package core.event;

import core.people.HumanInterface;

public class Hide extends Move {
    private HumanInterface whom;

    public Hide(HumanInterface whom) {
        super.setName(ActionType.HIDE);
        this.whom = whom;
    }

    @Override
    public void Do(String act) {
        System.out.printf("а %s в карман то пирожок," +
                " то котлетку, то хлебца краюшку\n", act);
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Hide){
            return true;
        }
        return false;
    }
}
