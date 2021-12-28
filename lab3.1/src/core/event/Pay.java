package core.event;

public class Pay extends Move {
    public Pay() {
        super.setName(ActionType.PAY);
    }

    @Override
    public void Do(String act) {
        String who_name = super.getWho().getName().substring(0, super.getWho().getName().length() - 1);
        who_name += "е";
        System.out.printf("с просьбой %s %s жалованье хотя бы за недельку вперед,\n", act, who_name);
    }
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Pay){
            return true;
        }
        return false;
    }
}
