package core.event;

import core.people.HumanInterface;

public class Bring extends Move {
    private HumanInterface whom;

    public Bring(HumanInterface whom) {
        super.setName(ActionType.BRING);
        this.whom = whom;
    }

    @Override
    public void Do(String act) {
        System.out.printf("и %s все это %s %s.\n", act, whom.getStatus().getValue(), whom.getName() + "у");
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Bring){
            return true;
        }
        return false;
    }
}
