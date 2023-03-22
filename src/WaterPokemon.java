import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private final List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "water");
    }

    public void surf(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with " + this.getAttacks().get(0));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire" -> {
                attackPoints = 25;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
            case "water" -> {
                attackPoints = 5;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
            case "grass" -> {
                attackPoints = 10;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
            default -> {
                attackPoints = 15;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
        }
        System.out.println("Remaning health points of " + enemy.getName() + ": " + enemy.getHp());
    }

    public void hydroPump(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with " + this.getAttacks().get(1));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire" -> {
                attackPoints = 27;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
            case "water" -> {
                attackPoints = 7;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
            case "grass" -> {
                attackPoints = 12;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
            default -> {
                attackPoints = 17;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
        }
        System.out.println("Remaning health points of " + enemy.getName() + ": " + enemy.getHp());
    }

    public void hydroCanon(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with " + this.getAttacks().get(2));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire" -> {
                attackPoints = 29;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
            case "water" -> {
                attackPoints = 9;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
            case "grass" -> {
                attackPoints = 14;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
            default -> {
                attackPoints = 19;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
        }
        System.out.println("Remaning health points of " + enemy.getName() + ": " + enemy.getHp());
    }

    public void rainDance(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with " + this.getAttacks().get(3));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire" -> {
                attackPoints = 31;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
            case "water" -> {
                attackPoints = 11;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
            case "grass" -> {
                attackPoints = 16;
                enemy.setHp(enemy.getHp() + attackPoints);
                System.out.println("Raindance gives " + attackPoints + " boost to Grass-types");
            }
            default -> System.out.println("Raindance has no effect on this enemy.");
        }
        System.out.println("Remaning health points of " + enemy.getName() + ": " + enemy.getHp());
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
