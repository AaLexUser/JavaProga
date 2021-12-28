import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Feebas("Дирихле",1));
        b.addAlly(new Flygon("Коши",1));
        b.addAlly(new Milotic("Лагранж",1));
        b.addFoe(new Miltank("Вейерштрасс",1));
        b.addFoe(new Trapinch("Кантор",1));
        b.addFoe(new Vibrava("Гаусс",1));
        b.go();
    }
}
