package pokemon;

import move.DoubleTeam;
import move.FakeOut;
import move.Psychic;
import move.ViceGrip;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Spinda extends Pokemon {

    public Spinda(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(60, 60, 60, 60, 60, 60);
        setMove(new DoubleTeam(), new FakeOut(), new Psychic(), new ViceGrip());
    }
}
