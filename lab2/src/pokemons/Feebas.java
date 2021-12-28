package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Feebas extends Pokemon {
    public Feebas(String name, int level){
        super(name,level);
        setStats(20,15,20, 10, 55,80);
        setType(Type.WATER);
        setMove(new ThunderFang(), new Confide(), new Tackle());
    }
}
