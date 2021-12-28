package core.CreatureThingsTime.dog;
public class Roland extends Dog {
    public Roland() {
        super.setName("Роланд");
        super.describe(Sex.HE);
    }


    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Roland){
            return true;
        }
        return false;
    }
}
