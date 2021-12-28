package core.reader;

import core.CreatureThingsTime.*;
import core.event.EventDoItInterface;
import core.exception.IllegalArgumentTypeException;
import core.exception.NullTextException;
import core.print.CustomPrint;
import core.print.CustomPrintInterface;


import java.util.Arrays;

public class Reader {
    private static String text = "Наконец move time," +
            " после которого время move по-разному." +
            " Если у who move what," +
            " то who move who и who в комнаты," +
            " чтоб who move who." +
            " Если who move what," +
            " то обязательно move с собой и who," +
            " потому что в то время move мода move по театрам своих комнатных собачонок." +
            " Всех, who move в театр или на концерт без собаки," +
            " move неимущими бедняками и move над ними." +
            " В такие вечера на попеченье who move один who," +
            " и who move вдвоём в спортивный собачий зал или плавательный бассейн," +
            " где move какое-нибудь собачье состязание," +
            " или же move в дрянингский «Тупичок» и move больного who." +
            " move, что who никогда move о своём больном друге." +
            " move what," +
            " чтоб who move к нему хотя бы на минутку." +
            " Обычно what move во время послеобеденной прогулки." +
            " Всегда," +
            " когда who move с собаками," +
            " who move свою порцию до конца," +
            " а move в карман то what," +
            " то what," +
            " то what и move всё это голодному who." +
            " В первый же день who move к who move ему жалованье хотя бы за недельку вперёд," +
            " так как ему move больному приятелю," +
            " who move в дрянингской ночлежке." +
            " who move," +
            " что теперь who move в богатом доме," +
            " в обществе приличных собак," +
            " и ему move компанию с каким-то who," +
            " who даже дома собственного move," +
            " а move в какой-то ночлежке." +
            " – Ни о каких таких who who move и move!" +
            " – move who." +
            " Если же who move при мне или при who с who какое-нибудь неприличное слово вроде «ночлежки»," +
            " who вас move." +
            " Что же касается платы," +
            " то who move её раз в неделю," +
            " но только не вперёд, а по прошествии недели.";
    private static String[] proposal;
    private static int BlockNum = 0;
    private static final CustomPrint p = new CustomPrint();
    private static final Action a = new Action();

    public Reader(){
       proposal = SplitText(text);
       CreatureThingsTime.setCustomPrint(p);
    }

    public void next(Object obj1){
        Object obj2 = null;
        if (obj1 instanceof EventDoItInterface|obj1 instanceof EventDoItInterface[]) {
            a.setAction(obj1, obj2);
        } else {
            a.setAction(obj2, obj1);
        }
    }
    public void next(Object act,Object cre){
        a.setAction(act,cre);
    }

    private static String [] SplitText(String text){
        return text.split("(?<=[.!,?])[\s-]");
    }

    public void setText(String text) {
        if (text.equals("")){
            throw new NullTextException();
        }
        else{Reader.text = text;}
    }

    @Override
    public String toString() {
        return "Reader{" +
                "text='" + text + '\'' +
                ", proposal=" + Arrays.toString(proposal) +
                '}';
    }
    private static class Action {
        private String str;
        public void setAction(Object act, Object cre){
            GoodString a = SetUp();
            if (a != null) {
                if (act instanceof EventDoItInterface[]) {
                    a.ReplaceMove((EventDoItInterface[]) act);
                } else if (act instanceof EventDoItInterface) {
                    a.ReplaceMove((EventDoItInterface) act);
                } else {
                    if (act != null) {
                        throw new IllegalArgumentTypeException();
                    }
                }
                if (cre instanceof CreatureThingsTimeInterface[]) {
                    a.ReplaceWhoTimeWhat((CreatureThingsTimeInterface[]) cre);
                } else if (cre instanceof CreatureThingsTimeInterface) {
                    a.ReplaceWhoTimeWhat((CreatureThingsTimeInterface) cre);
                } else {
                    if (cre != null) {
                        throw new IllegalArgumentTypeException();
                    }
                }
                p.println(str);
            }
            else p.println("to be continued...");
        }

        private GoodString SetUp(){
            while (true) {
                if (BlockNum==proposal.length){
                    return null;
                }
                str = proposal[BlockNum];
                if (str.matches(".*(\\w)+.*")) {
                    GoodString gs = new GoodString();
                    BlockNum = BlockNum + 1;
                    return gs;
                }
                p.println(str);
                BlockNum = BlockNum + 1;
            }
        }
        public class GoodString{
            public void ReplaceMove(EventDoItInterface[] act){
                if (str.matches(".*(move)+.*")) {
                    for (EventDoItInterface a : act) {
                        str = str.replaceFirst("move", a.getName());
                    }
                }
            }
            public void ReplaceMove(EventDoItInterface act){
                if (str.matches(".*(move)+.*")) {
                    str = str.replaceFirst("move", act.getName());
                }
            }
            public void ReplaceWhoTimeWhat(CreatureThingsTimeInterface[] cre){
                if (str.matches(".*(who|time|what)+.*")) {
                    for (CreatureThingsTimeInterface c : cre) {
                        if (c instanceof CreatureInterface) {
                            str = str.replaceFirst("who", c.getName());
                        }
                        else if (c instanceof Time){
                            str = str.replaceFirst("time", c.getName());
                        }
                        else {
                            str = str.replaceFirst("what", c.getName());
                        }
                        c.adduse(p.getNum());
                    }
                }
            }
            public void ReplaceWhoTimeWhat(CreatureThingsTimeInterface cre){
                if (str.matches(".*(who|time|what)+.*")) {
                    if (cre instanceof CreatureInterface) {
                        str = str.replaceFirst("who", cre.getName());
                    }
                    else if (cre instanceof Time){
                        str = str.replaceFirst("time", cre.getName());
                    }
                    else {
                        str = str.replaceFirst("what", cre.getName());
                    }
                    cre.adduse(p.getNum());
                }
            }
        }
    }
}
