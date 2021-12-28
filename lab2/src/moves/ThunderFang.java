package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ThunderFang extends PhysicalMove {
    public ThunderFang(){
        super(Type.ELECTRIC,65,95);
    }
    @Override
    public void applyOppEffects(Pokemon p){
        if (Math.random()<=0.1) {
            Effect.flinch(p);
        }
        if (Math.random()<=0.1){
            Effect.paralyze(p);
        }
    }
    @Override
    protected String describe() {
        return "using Thunder Fang";
    }
}
