package moves;

import ru.ifmo.se.pokemon.*;

public class FakeTears extends StatusMove {
    public FakeTears(){
        super(Type.DARK,0,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().turns(0).stat(Stat.SPECIAL_DEFENSE, -2));
    }
    @Override
    protected String describe() {
        return "using Fake Tears";
    }
}
