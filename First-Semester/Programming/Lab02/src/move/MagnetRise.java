package move;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

// In the games Magnet Rise grants 5 turns of immunity to Ground-type moves.
// the move is implemented as a no-op status move.
public final class MagnetRise extends StatusMove {

    public MagnetRise() {
        super(Type.ELECTRIC, 0, 1.0);
    }

    @Override
    protected String describe() {
        return "levitates with Magnet Rise";
    }
}
