package move;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public final class Psychic extends SpecialMove {

    private static final double LOWER_SPDEF_CHANCE = 0.1;

    public Psychic() {
        super(Type.PSYCHIC, 90, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon opponent) {
        if (Math.random() < LOWER_SPDEF_CHANCE) {
            opponent.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "unleashes Psychic";
    }
}
