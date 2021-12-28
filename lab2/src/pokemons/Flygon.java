package pokemons;

import moves.QuickAttack;
import ru.ifmo.se.pokemon.Type;

public class Flygon extends Vibrava{
    public Flygon(String name, int level){
        super(name,level);
        setStats(80,100,80, 80, 80,100);
        setType(Type.GROUND, Type.DRAGON);
        addMove(new QuickAttack());
    }
}
