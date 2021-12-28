package core.CreatureThingsTime;

import core.print.CustomPrintInterface;

public abstract class Creature extends CreatureThingsTime implements CreatureInterface{

    public void describe(Creature.Sex s){
        class Describe{
            private final CustomPrintInterface p;
            private final Sex s;
            private final CreatureThingsTimeInterface cre;

            public Describe(CustomPrintInterface p,Creature.Sex s,CreatureThingsTimeInterface cre){
                this.p = p;
                this.s = s;
                this.cre = cre;
            }
            public void sexDescribe(){
                switch (s){
                    case HE -> {
                        p.println("На сцене появился " + name,cre);
                    }
                    case SHE -> {
                        p.println("На сцене появилась " + name,cre);
                    }
                    case IT -> {
                        p.println("На сцене появилось " + name,cre);
                    }
                    case THEY -> {
                        p.println("На сцене появились " + name,cre);
                    }
                }
            }
        }
        Describe d = new Describe(p,s,this);
        d.sexDescribe();
    }

    protected enum Sex{
        HE,
        SHE,
        IT,
        THEY
    }
}
