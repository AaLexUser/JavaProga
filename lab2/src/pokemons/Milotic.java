package pokemons;

import moves.BulkUp;
import moves.Confide;
import moves.Tackle;
import moves.ThunderFang;
import ru.ifmo.se.pokemon.Type;

public class Milotic extends Feebas {
    public Milotic(String name, int level){
        super(name,level);
        setStats(95,60,79, 100, 125,81);
        addMove(new BulkUp());
    }
}
