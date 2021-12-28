package core.CreatureThingsTime;

import core.exception.NullNameException;
import core.print.CustomPrintInterface;

import java.util.ArrayList;
import java.util.List;

public abstract class CreatureThingsTime implements CreatureThingsTimeInterface {
    protected String name;
    protected List<Integer> whereuse = new ArrayList<Integer>();
    protected static CustomPrintInterface p;
    public void setName(String name){
        try{
            if (!(name.equals(""))) {
                this.name = name;
            }
            else{
                throw new NullNameException();
            }
        }
        catch (NullNameException nne){
            System.err.println(nne.getMessage());
            nne.printStackTrace();
        }
    }


    public String getName(){
        return name;
    }
    public static void setCustomPrint(CustomPrintInterface p){
        CreatureThingsTime.p = p;
    }
    public void adduse(int numuse) {
        whereuse.add(numuse);
    }

    public List<Integer> Whereuse() {
        return whereuse;
    }
    public String getWhereuse(){
        StringBuilder str = new StringBuilder(name + " встречается в строчках ");
        str.append(Whereuse());
        return str.toString();
    }
}
