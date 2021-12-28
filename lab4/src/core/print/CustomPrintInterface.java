package core.print;


import core.CreatureThingsTime.CreatureThingsTimeInterface;
import core.exception.IllegalArgumentTypeException;
import core.exception.NoSuchLineException;

import java.util.HashMap;
import java.util.Map;

public interface CustomPrintInterface {
    Map<Integer,String> dict = new HashMap<>();
    public void print(String str);
    public void println(String str);
    public void println(String str, CreatureThingsTimeInterface cre);
    public int getNum();
    public static<T> String getline(T num) {
        if (num instanceof Integer) {
            try {
                return "Строчка " + num + ": " + dict.get(num);
            } catch (RuntimeException e) {
                throw new NoSuchLineException(e);
            }
        }
        else if (num instanceof Integer[]){
            String str="";
            for (int i : (Integer[])num) {
                try {
                    str+= "Строчка " + i + ": " + dict.get(i)+"\n";
                } catch (RuntimeException e) {
                    throw new NoSuchLineException(e);
                }
            }
            return str.substring(0, str.length() - 1);
        }
        else throw new IllegalArgumentTypeException();
    };
}
