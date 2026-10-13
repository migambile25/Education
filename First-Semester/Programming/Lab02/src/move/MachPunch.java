package move;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

// Priority +1 makes it go before most other moves regardless of speed.
public final class MachPunch extends PhysicalMove {

    public MachPunch() {
        super(Type.FIGHTING, 40, 1.0, 1, 1);
    }

    @Override
    protected String describe() {
        return "throws a Mach Punch";
    }
}
