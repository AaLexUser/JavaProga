package moves;

import ru.ifmo.se.pokemon.*;

public class BulkUp extends StatusMove {
    public BulkUp(){
        super(Type.FIGHTING, 0 ,0);
    }
    @Override
    public void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().turns(0).stat(Stat.ATTACK, +1).stat(Stat.DEFENSE,+1));
    }
    @Override
    protected String describe() {
        return "using Bulk Up";
    }
}
