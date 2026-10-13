package pokemon;

import move.FakeOut;
import move.Flamethrower;
import move.PoisonPowder;
import move.WillOWisp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Sneasel extends Pokemon {

    public Sneasel(String name, int level) {
        super(name, level);
        setType(Type.DARK, Type.ICE);
        setStats(55, 95, 55, 35, 75, 115);
        setMove(new PoisonPowder(), new FakeOut(), new Flamethrower(), new WillOWisp());
    }
}
