import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{

    private final List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "grass");
    }

    public void leafStorm(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks "  + enemy.getName() + " with " + this.getAttacks().get(0));
    }

    public void solarBeam(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks "  + enemy.getName() + " with " + this.getAttacks().get(1));
    }

    public void leechSeed(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks "  + enemy.getName() + " with " + this.getAttacks().get(2));
    }

    public void leaveBlade(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks "  + enemy.getName() + " with " + this.getAttacks().get(3));
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
