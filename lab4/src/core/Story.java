package core;

import core.CreatureThingsTime.*;
import core.CreatureThingsTime.dog.Dog;
import core.CreatureThingsTime.dog.Mimi;
import core.CreatureThingsTime.dog.Roland;
import core.CreatureThingsTime.people.*;
import core.event.*;
import core.print.CustomPrintInterface;
import core.reader.Reader;

import java.util.Random;

public class Story {
    public static void main(String[] args) {
        Reader r = new Reader();
        CreatureThingsTimeInterface din = new Time.Dinner();
        r.next(new Move("приходила"),din);
        r.next(new Move("проводили"));
        HumanInterface mi = new Minoga();
        r.next(new Move("был"), new CreatureThingsTimeInterface[]{mi,new Things("званый вечер")});
        HumanInterface nez = new Neznayka();
        CreatureInterface mimi = new Mimi();
        CreatureInterface rol = new Roland();
        r.next(new Move("приводил"), new CreatureThingsTimeInterface[]{nez, mimi,rol});
        HumanInterface guests = new Guests();
        CreatureThingsTime dogs=new Dog(){
            {
                super.name = "собаками";
                super.describe(Sex.THEY);
            }
        };
        r.next(new Move("могли полюбоваться"), new CreatureThingsTimeInterface[]{guests,dogs});
        r.next(new Move("уходила"),new CreatureThingsTimeInterface[]{mi, new Things("в театр")});
        r.next(new Move("брала"), mimi);
        r.next(new Move[]{new Move("была"),new Move("таскать")});
        HumanInterface who = new Someone();
        r.next(new Move("являлся"),who);
        r.next(new Move[]{new Move ("считали"), new Move("смеялись")});
        r.next(new Move("оставался"),new CreatureThingsTimeInterface[]{nez,rol});
        HumanInterface they = new They();
        r.next(new Move("отправлялись"), they);
        r.next(new Move(" смотрели"));
        HumanInterface koz = new Kozlik();
        koz.setStatus(Status.SICK);
        r.next(new Move[]{new Move("отправлялись"), new Move("навещали")},koz);
        r.next(new Move("Нужно сказать"));
        r.next(new Move("забывал",false),nez);
        r.next(new Move("проходило",false),new Things("дня"));
        HumanInterface he = new Person() {
            {
                super.setName("он");
                super.describe(Sex.HE);
            }
        };
        r.next(new Move("забежал",false),he);
        r.next(new Move("удавалось сделать"),new Things("это"));
        r.next(new Move("обедал"),nez);
        r.next(new Move("съедал",false),he);
        r.next(new Move("припрятывал"),new Things("пирожок"));
        r.next(new Things("котлетку"));
        koz.setStatus(Status.HUNGRY);
        r.next(new Move("относил"),new CreatureThingsTimeInterface[]{new Things("хлебца краюшку"),koz});
        r.next(new Move[]{new Move("обратился"), new Move("с просьбой заплатить")},
                new CreatureThingsTimeInterface[]{nez,mi});
        r.next(new Move("нужно помочь"));
        HumanInterface which = new Person() {
            {
                super.setName("который");
                super.describe(Sex.HE);
            }
        };
        r.next(new Move("находился"), which);
        r.next(new Move("сказала"),mi);
        r.next(new Move("живёт"),he);
        r.next(new Move("пристало",false),koz);
        r.next(new Move("не имеет"),which);
        r.next(new Move("обитает"));
        HumanInterface I = new Person() {
            {
                super.setName("я");
                super.describe(Sex.HE);
            }
        };
        r.next(new Move[]{new Move("желаю",false),new Move("слышать")},
                new CreatureThingsTimeInterface[]{koz,I});
        HumanInterface she = new Person() {
            {
                super.setName("она");
                super.describe(Sex.SHE);
            }
        };
        r.next(new Move("сказала"),she);
        HumanInterface you = new Person() {
            {
                super.setName("вы");
                super.describe(Sex.SHE);
            }
        };
        r.next(new Move("произнесёте"),new CreatureThingsTimeInterface[]{you,mimi,rol});
        r.next(new Move("уволю"),I);
        r.next(new Move("будете получать"),you);
        r.next(null,null);

        System.out.println(mi.getWhereuse());
        System.out.println(nez.getWhereuse());
        System.out.println(koz.getWhereuse());
        Integer[] ar = new Integer[3];
        for (int i = 0;i < ar.length;i++){
            ar[i] = new Random().nextInt(61);
        }
        System.out.println(CustomPrintInterface.getline(ar));

    }
}
