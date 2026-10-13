package pokemon;

import move.DoubleTeam;
import move.FakeOut;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Seaking extends Pokemon {

    public Seaking(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(80, 92, 65, 65, 80, 68);
        setMove(new DoubleTeam(), new FakeOut());
    }
}
