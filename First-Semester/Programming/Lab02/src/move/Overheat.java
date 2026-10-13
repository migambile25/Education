package move;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public final class Overheat extends SpecialMove {

    public Overheat() {
        super(Type.FIRE, 130, 0.9);
    }

    // The harsh recoil is unconditional: using Overheat always drops the user's own Sp. Attack.
    @Override
    protected void applySelfEffects(Pokemon self) {
        self.setMod(Stat.SPECIAL_ATTACK, -2);
    }

    @Override
    protected String describe() {
        return "unleashes an Overheat";
    }
}
