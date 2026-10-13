package move;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class Flamethrower extends SpecialMove {

    private static final double BURN_CHANCE = 0.1;

    public Flamethrower() {
        super(Type.FIRE, 90, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon opponent) {
        if (Math.random() < BURN_CHANCE) {
            Effect.burn(opponent);
        }
    }

    @Override
    protected String describe() {
        return "breathes a Flamethrower";
    }
}
