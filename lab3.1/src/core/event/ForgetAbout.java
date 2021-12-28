package core.event;

import core.people.HumanInterface;

public class ForgetAbout extends Move {
    private HumanInterface whom;

    public ForgetAbout(HumanInterface whom) {
        super.setName(ActionType.FORGETABOUT);
        this.whom = whom;
    }

    @Override
    public void Do(String act) {
        System.out.printf("%s никогда %s о своем %s друге %s.\n", super.getWho().getName(), act, whom.getStatus().getValue(), whom.getName() + "е");
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof ForgetAbout){
            return true;
        }
        return false;
    }
}
