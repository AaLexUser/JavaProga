package core.people;

public class Minoga extends Person {
    public Minoga() {
        super.setName("Госпожа Минога");
        this.describe();
    }

    public void describe() {
        System.out.println("На сцене появилась госпожа Минога");
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Minoga){
            return true;
        }
        return false;
    }
}
