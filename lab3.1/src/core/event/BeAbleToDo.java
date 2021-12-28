package core.event;

public class BeAbleToDo extends Move {
    public BeAbleToDo() {
        super.setName(ActionType.BEABLETODO);
    }

    @Override
    public void Do(String act) {
        System.out.printf("Обычно это %s во время послеобеденной прогулки.\n", act);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof BeAbleToDo){
            return true;
        }
        return false;
    }
}