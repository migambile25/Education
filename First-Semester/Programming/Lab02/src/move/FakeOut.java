package move;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class FakeOut extends PhysicalMove {

    public FakeOut() {
        super(Type.NORMAL, 40, 1.0, 3, 1);
    }

    // In the games this only works on the target's first turn out; the base
    // engine has no such notion of "first turn", so the flinch is unconditional.
    @Override
    protected void applyOppEffects(Pokemon opponent) {
        Effect.flinch(opponent);
    }

    @Override
    protected String describe() {
        return "catches the opponent with a Fake Out";
    }
}
