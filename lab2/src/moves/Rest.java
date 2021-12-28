package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC,0,0);
    }

    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().turns(2).condition(Status.SLEEP));
        p.setCondition(new Effect().turns(0).stat(Stat.HP, -99999));
    }

    @Override
    protected String describe() {
        return "решил отдохнуть";
    }
}
