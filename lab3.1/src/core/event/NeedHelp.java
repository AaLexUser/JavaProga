package core.event;

import core.people.HumanInterface;

public class NeedHelp extends Move {
    private HumanInterface whom;

    public NeedHelp(HumanInterface whom) {
        super.setName(ActionType.NEEDHELP);
        this.whom = whom;
    }

    @Override
    public void Do(String act) {
        String who_name = super.getWho().getName().substring(0, super.getWho().getName().length() - 1);
        who_name += "е";

        System.out.printf("так как %s %s %s %s\n", who_name, act, whom.getStatus().getValue(), whom.getName() + "у");
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof NeedHelp){
            return true;
        }
        return false;
    }
}
