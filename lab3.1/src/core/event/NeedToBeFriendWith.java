package core.event;

import core.people.HumanInterface;

public class NeedToBeFriendWith extends Move {
    private HumanInterface whom;

    public NeedToBeFriendWith(HumanInterface whom) {
        super.setName(ActionType.NEEDTOBEFRIENDWITH);
        this.whom = whom;
    }

    @Override
    public void Do(String act) {
        String who_name = super.getWho().getName().substring(0, super.getWho().getName().length() - 1);
        who_name += "е";
        System.out.printf("и %s %s с каким-то %s,\n", who_name, act, whom.getName() + "ом");
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof NeedToBeFriendWith){
            return true;
        }
        return false;
    }
}
