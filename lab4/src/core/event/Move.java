package core.event;

public class Move implements EventDoItInterface {
    private String name;
    public Move(String name){
        this.name=name;
    }

    public Move(String name, boolean do_it){
        if(!do_it){
            this.name="не "+name;
        }
        else this.name=name;
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Move{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Move){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return this.getName() == null ? 0 : this.getName().hashCode();
    }
}
