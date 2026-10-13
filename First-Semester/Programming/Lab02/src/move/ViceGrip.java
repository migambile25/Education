package move;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class ViceGrip extends PhysicalMove {

    public ViceGrip() {
        super(Type.NORMAL, 55, 1.0);
    }

    @Override
    protected String describe() {
        return "grips with a Vice Grip";
    }
}
