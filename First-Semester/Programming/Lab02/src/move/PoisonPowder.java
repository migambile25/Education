package move;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public final class PoisonPowder extends StatusMove {

    public PoisonPowder() {
        super(Type.POISON, 0, 0.75);
    }

    @Override
    protected void applyOppEffects(Pokemon opponent) {
        Effect.poison(opponent);
    }

    @Override
    protected String describe() {
        return "scatters Poison Powder";
    }
}
