package core.people;

public class Kozlik extends Person {
    public Kozlik() {
        super.setName("Козлик");
        this.describe();
    }

    public void describe() {
        System.out.println("На сцене появился Козлик");
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Kozlik){
            return true;
        }
        return false;
    }
}
