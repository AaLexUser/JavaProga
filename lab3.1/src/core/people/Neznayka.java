package core.people;

public class Neznayka extends Person {
    public Neznayka() {
        super("Незнайка");
        this.describe();
    }

    public void describe() {
        System.out.println("На сцене появился Незнайка");
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Neznayka){
            return true;
        }
        return false;
    }
}
