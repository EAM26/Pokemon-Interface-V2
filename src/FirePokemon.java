import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{

    private final List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");
    public FirePokemon(String name, int level, int hp, String food, String sound) {

        super(name, level, hp, food, sound, "fire");
    }

    public void inferno(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks "  + enemy.getName() + " with " + this.getAttacks().get(0));

    }

    public void pyroBall(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks "  + enemy.getName() + " with " + this.getAttacks().get(1));
    }

    public void fireLash(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks "  + enemy.getName() + " with " + this.getAttacks().get(2));
    }

    public void flameThrower(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks "  + enemy.getName() + " with " + this.getAttacks().get(3));
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
