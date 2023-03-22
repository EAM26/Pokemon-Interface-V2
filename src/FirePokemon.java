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
                super.attackCalc(pokemon, enemy, attackPoints);
                break;
            case "water":
                attackPoints = 15;
                super.attackCalc(pokemon, enemy, attackPoints);
                break;
            case "grass":
                attackPoints = 25;
                super.attackCalc(pokemon, enemy, attackPoints);
                break;
            case "electric":
                attackPoints = 10;
                super.attackCalc(pokemon, enemy, attackPoints);
                break;
        }
        System.out.println("Remaning health points of " + enemy.getName() + ": " + enemy.getHp());
    }

    public void pyroBall(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with " + this.getAttacks().get(1));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire":
                attackPoints = 7;
                super.attackCalc(pokemon, enemy, attackPoints);
                break;
            case "water":
                attackPoints = 17;
                super.attackCalc(pokemon, enemy, attackPoints);
                break;
            case "grass":
                attackPoints = 27;
                super.attackCalc(pokemon, enemy, attackPoints);
                break;
            case "electric":
                attackPoints = 12;
                super.attackCalc(pokemon, enemy, attackPoints);
                break;
        }
        System.out.println("Remaning health points of " + enemy.getName() + ": " + enemy.getHp());
    }

    public void fireLash(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with " + this.getAttacks().get(2));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire":
                attackPoints = 9;
                super.attackCalc(pokemon, enemy, attackPoints);
                break;
            case "water":
                attackPoints = 19;
                super.attackCalc(pokemon, enemy, attackPoints);
                break;
            case "grass":
                attackPoints = 29;
                super.attackCalc(pokemon, enemy, attackPoints);
                break;
            case "electric":
                attackPoints = 14;
                super.attackCalc(pokemon, enemy, attackPoints);
                break;
        }
        System.out.println("Remaning health points of " + enemy.getName() + ": " + enemy.getHp());
    }

    public void flameThrower(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with " + this.getAttacks().get(3));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire":
                attackPoints = 11;
                super.attackCalc(pokemon, enemy, attackPoints);
                break;
            case "water":
                attackPoints = 21;
                super.attackCalc(pokemon, enemy, attackPoints);
                break;
            case "grass":
                attackPoints = 31;
                super.attackCalc(pokemon, enemy, attackPoints);
                break;
            case "electric":
                attackPoints = 16;
                super.attackCalc(pokemon, enemy, attackPoints);
                break;
        }
        System.out.println("Remaning health points of " + enemy.getName() + ": " + enemy.getHp());
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
