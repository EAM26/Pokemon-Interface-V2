import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private final List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");

    public FirePokemon(String name, int level, int hp, String food, String sound) {

        super(name, level, hp, food, sound, "fire");
    }

    public void inferno(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with " + this.getAttacks().get(0));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire":
                attackPoints = 5;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "water":
                attackPoints = 15;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "grass":
                attackPoints = 25;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "electric":
                attackPoints = 10;
                super.attack(pokemon, enemy, attackPoints);
                break;
        }
    }

    public void pyroBall(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with " + this.getAttacks().get(1));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire":
                attackPoints = 7;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "water":
                attackPoints = 17;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "grass":
                attackPoints = 27;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "electric":
                attackPoints = 12;
                super.attack(pokemon, enemy, attackPoints);
                break;
        }
    }

    public void fireLash(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with " + this.getAttacks().get(2));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire":
                attackPoints = 9;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "water":
                attackPoints = 19;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "grass":
                attackPoints = 29;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "electric":
                attackPoints = 14;
                super.attack(pokemon, enemy, attackPoints);
                break;
        }
    }

    public void flameThrower(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with " + this.getAttacks().get(3));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire":
                attackPoints = 11;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "water":
                attackPoints = 21;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "grass":
                attackPoints = 31;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "electric":
                attackPoints = 16;
                super.attack(pokemon, enemy, attackPoints);
                break;
        }
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
