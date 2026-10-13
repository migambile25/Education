package move;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

// No secondary effect, so no method overrides are needed beyond the constructor.
public final class Tackle extends PhysicalMove {

    public Tackle() {
        super(Type.NORMAL, 40, 1.0);
    }

    @Override
    protected String describe() {
        return "tackles";
    }
}
