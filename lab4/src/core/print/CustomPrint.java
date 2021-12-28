package core.print;

import core.CreatureThingsTime.CreatureThingsTimeInterface;

public class CustomPrint implements CustomPrintInterface{
    private static Integer num = 0;
    public void print(String str){
        System.out.print(num+". "+str);
        dict.put(num, str);
        num+=1;
    }
    public void println(String str){
        System.out.print(num+". "+str+"\n");
        dict.put(num, str);
        num+=1;
    }
    public void println(String str, CreatureThingsTimeInterface cre){
        cre.adduse(num);
        System.out.print(num+". "+str+"\n");
        dict.put(num, str);
        num+=1;
    }

    @Override
    public int getNum() {
        return num;
    }
}
