package moves;

import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {
    public Scald(){
        super(Type.WATER,80,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3){
            Effect.burn(p);
        }
    }
    protected void applySelfEffects(Pokemon p){
        Status self_st = p.getCondition();
        if (self_st.equals(Status.FREEZE)){
            p.addEffect(new Effect().condition(Status.NORMAL));
        }
    }

    @Override
    protected String describe() {
        return "using Scald";
    }
}
