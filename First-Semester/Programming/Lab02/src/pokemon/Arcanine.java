package pokemon;

import move.DoubleTeam;
import move.FakeOut;
import move.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Arcanine extends Pokemon {

    public Arcanine(String name, int level) {
        super(name, level);
        setType(Type.FIRE);
        setStats(90, 110, 80, 100, 80, 95);
        setMove(new DoubleTeam(), new FakeOut(), new Psychic());
    }
}
