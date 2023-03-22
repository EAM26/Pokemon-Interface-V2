import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{

    private final List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "grass");
    }

    public void leafStorm(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks "  + enemy.getName() + " with " + this.getAttacks().get(0));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire" -> {
                attackPoints = 15;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
            case "water" -> {
                attackPoints = 10;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
            case "grass" -> {
                attackPoints = 5;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
            default -> {
                attackPoints = 25;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
        }
        System.out.println("Remaning health points of " + enemy.getName() + ": " + enemy.getHp());
    }

    public void solarBeam(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks "  + enemy.getName() + " with " + this.getAttacks().get(1));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire" -> {
                attackPoints = 17;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
            case "water" -> {
                attackPoints = 12;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
            case "grass" -> {
                attackPoints = 7;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
            default -> {
                attackPoints = 27;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
        }
        System.out.println("Remaning health points of " + enemy.getName() + ": " + enemy.getHp());
    }

    public void leechSeed(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks "  + enemy.getName() + " with " + this.getAttacks().get(2));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire" -> {
                attackPoints = 19;
                super.attackCalc(pokemon, enemy, attackPoints);
                System.out.println(pokemon.getName() + " gained " + attackPoints + " hp.");
                pokemon.setHp(pokemon.getHp() + attackPoints);
            }
            case "water" -> {
                attackPoints = 14;
                super.attackCalc(pokemon, enemy, attackPoints);
                System.out.println(pokemon.getName() + " gained " + attackPoints + " hp.");
                pokemon.setHp(pokemon.getHp() + attackPoints);
            }
            case "grass" -> {
                attackPoints = 9;
                super.attackCalc(pokemon, enemy, attackPoints);
                System.out.println(pokemon.getName() + " gained " + attackPoints + " hp.");
                pokemon.setHp(pokemon.getHp() + attackPoints);
            }
            default -> {
                attackPoints = 29;
                super.attackCalc(pokemon, enemy, attackPoints);
                System.out.println(pokemon.getName() + " gained " + attackPoints + " hp.");
                pokemon.setHp(pokemon.getHp() + attackPoints);
            }
        }
        System.out.println("Remaning health points of " + enemy.getName() + ": " + enemy.getHp());
    }

    public void leaveBlade(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks "  + enemy.getName() + " with " + this.getAttacks().get(3));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire" -> {
                attackPoints = 21;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
            case "water" -> {
                attackPoints = 16;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
            case "grass" -> {
                attackPoints = 11;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
            default -> {
                attackPoints = 31;
                super.attackCalc(pokemon, enemy, attackPoints);
            }
        }
        System.out.println("Remaning health points of " + enemy.getName() + ": " + enemy.getHp());
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
