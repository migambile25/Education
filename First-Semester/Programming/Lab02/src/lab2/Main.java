package lab2;

import pokemon.Arcanine;
import pokemon.Bayleef;
import pokemon.Seaking;
import pokemon.Sneasel;
import pokemon.Solrock;
import pokemon.Spinda;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {

    public static void main(String[] args) {
        Battle battle = new Battle();

        // Levels are the minimum at which each Pokemon can know all of its assigned moves
        Pokemon solrock = new Solrock("Sunny", 1);
        Pokemon bayleef = new Bayleef("Leafy", 16);
        Pokemon sneasel = new Sneasel("Claw", 1);
        Pokemon seaking = new Seaking("Finn", 33);
        Pokemon arcanine = new Arcanine("Blaze", 1);
        Pokemon spinda = new Spinda("Dizzy", 1);

        battle.addAlly(solrock);
        battle.addAlly(bayleef);
        battle.addAlly(sneasel);
        battle.addFoe(seaking);
        battle.addFoe(arcanine);
        battle.addFoe(spinda);

        battle.go();
    }
}
