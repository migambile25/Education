package move;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public final class WillOWisp extends StatusMove {

    public WillOWisp() {
        super(Type.FIRE, 0, 0.85);
    }

    @Override
    protected void applyOppEffects(Pokemon opponent) {
        Effect.burn(opponent);
    }

    @Override
    protected String describe() {
        return "casts Will-O-Wisp";
    }
}
