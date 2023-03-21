import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    private final List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");
    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "electric");
    }

    public void thunderPunch(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks "  + enemy.getName() + " with " + this.getAttacks().get(0));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire":
                attackPoints = 10;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "water":
                attackPoints = 25;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "grass":
                attackPoints = 15;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "electric":
                attackPoints = 5;
                super.attack(pokemon, enemy, attackPoints);
                break;
        }
    }

    public void electroBall(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks "  + enemy.getName() + " with " + this.getAttacks().get(1));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire":
                attackPoints = 12;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "water":
                attackPoints = 27;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "grass":
                attackPoints = 17;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "electric":
                attackPoints = 7;
                super.attack(pokemon, enemy, attackPoints);
                break;
        }
    }

    public void thunder(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks "  + enemy.getName() + " with " + this.getAttacks().get(2));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire":
                attackPoints = 14;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "water":
                attackPoints = 29;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "grass":
                attackPoints = 19;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "electric":
                attackPoints = 9;
                System.out.println("Thunder gives " + attackPoints + " boost to Electric-types");
                super.attack(pokemon, enemy, -(attackPoints));
                break;
        }
    }

    public void voltTackle(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks "  + enemy.getName() + " with " + this.getAttacks().get(3));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire":
                attackPoints = 16;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "water":
                attackPoints = 31;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "grass":
                attackPoints = 21;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "electric":
                attackPoints = 11;
                super.attack(pokemon, enemy, attackPoints);
                break;
        }
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
