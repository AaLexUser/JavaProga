package core.event;

import core.people.HumanInterface;

public class Visit extends Move {
    private HumanInterface whom;

    public Visit(HumanInterface whom) {
        this.whom = whom;
        super.setName(ActionType.VISIT);
    }

    @Override
    public void Do(String act) {
        System.out.printf("Не проходило дня, чтоб %s %s к %s хотя бы на минутку.\n", super.getWho().getName(), act, whom.getName() + "у");
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Visit){
            return true;
        }
        return false;
    }
}
