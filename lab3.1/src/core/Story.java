package core;

import core.event.*;
import core.people.HumanInterface;
import core.people.Kozlik;
import core.people.Minoga;
import core.people.Neznayka;

public class Story {

    public static void main(String[] args) {
        HumanInterface nez = new Neznayka();
        HumanInterface koz = new Kozlik();
        koz.setStatus(Status.SICK);
        nez.run(new ForgetAbout(koz), false);
        nez.run(new Visit(koz), false);
        nez.run(new BeAbleToDo(), true);
        nez.run(new HaveLunchWith(), true);
        nez.run(new Eat(), false);
        nez.run(new Hide(koz), true);
        koz.setStatus(Status.HUNGRY);
        nez.run(new Bring(koz), true);
        HumanInterface mi = new Minoga();
        nez.run(new Requested(mi), true);
        nez.run(new Pay(), true);
        nez.run(new NeedHelp(koz), true);
        koz.run(new Stay(), true);
        mi.run(new Say(), true);
        nez.run(new Living(), true);
        nez.run(new NeedToBeFriendWith(koz), false);
        koz.run(new Have(), false);
        koz.run(new Resides(), true);


    }
}
