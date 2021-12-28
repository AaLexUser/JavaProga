package core.event;

import core.people.HumanInterface;

public class Requested extends Move {
    private HumanInterface whom;

    public Requested(HumanInterface whom) {
        super.setName(ActionType.REQUESTED);
        this.whom = whom;
    }

    @Override
    public void Do(String act) {
        System.out.printf("В первый же день %s %s к %s\n", super.getWho().getName(), act, whom.getName());
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Requested){
            return true;
        }
        return false;
    }
}
