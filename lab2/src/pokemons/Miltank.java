package pokemons;

import moves.Bubble;
import moves.Facade;
import moves.RockSlide;
import moves.Scald;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Miltank extends Pokemon {
    public Miltank(String name, int level){
        super(name,level);
        setStats(95,80,105, 40, 70,100);
        setType(Type.NORMAL);
        setMove(new Bubble(), new Facade(), new Scald(), new RockSlide());
    }
}
