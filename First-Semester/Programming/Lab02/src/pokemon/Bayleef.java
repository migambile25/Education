package pokemon;

import move.Flamethrower;
import move.FakeOut;
import move.PoisonPowder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Bayleef extends Pokemon {

    public Bayleef(String name, int level) {
        super(name, level);
        setType(Type.GRASS);
        setStats(60, 62, 80, 63, 80, 60);
        setMove(new PoisonPowder(), new FakeOut(), new Flamethrower());
    }
}
