package pokemon;

import move.MachPunch;
import move.MagnetRise;
import move.Overheat;
import move.Tackle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Solrock extends Pokemon {

    public Solrock(String name, int level) {
        super(name, level);
        setType(Type.ROCK, Type.PSYCHIC);
        setStats(70, 95, 85, 55, 65, 70);
        setMove(new Tackle(), new MagnetRise(), new Overheat(), new MachPunch());
    }
}
