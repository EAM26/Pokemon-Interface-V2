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
            case "fire":
                attackPoints = 15;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "water":
                attackPoints = 10;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "grass":
                attackPoints = 5;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "electric":
                attackPoints = 25;
                super.attack(pokemon, enemy, attackPoints);
                break;
        }
        System.out.println("Remaning health points of " + enemy.getName() + ": " + enemy.getHp());
    }

    public void solarBeam(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks "  + enemy.getName() + " with " + this.getAttacks().get(1));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire":
                attackPoints = 17;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "water":
                attackPoints = 12;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "grass":
                attackPoints = 7;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "electric":
                attackPoints = 27;
                super.attack(pokemon, enemy, attackPoints);
                break;
        }
        System.out.println("Remaning health points of " + enemy.getName() + ": " + enemy.getHp());
    }

    public void leechSeed(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks "  + enemy.getName() + " with " + this.getAttacks().get(2));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire":
                attackPoints = 19;
                super.attack(pokemon, enemy, attackPoints);
                System.out.println(pokemon.getName() + " gained " + attackPoints + " hp.");
                pokemon.setHp(pokemon.getHp() + attackPoints);
                break;
            case "water":
                attackPoints = 14;
                super.attack(pokemon, enemy, attackPoints);
                System.out.println(pokemon.getName() + " gained " + attackPoints + " hp.");
                pokemon.setHp(pokemon.getHp() + attackPoints);
                break;
            case "grass":
                attackPoints = 9;
                super.attack(pokemon, enemy, attackPoints);
                System.out.println(pokemon.getName() + " gained " + attackPoints + " hp.");
                pokemon.setHp(pokemon.getHp() + attackPoints);
                break;
            case "electric":
                attackPoints = 29;
                super.attack(pokemon, enemy, attackPoints);
                System.out.println(pokemon.getName() + " gained " + attackPoints + " hp.");
                pokemon.setHp(pokemon.getHp() + attackPoints);
                break;
        }
        System.out.println("Remaning health points of " + enemy.getName() + ": " + enemy.getHp());
    }

    public void leaveBlade(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks "  + enemy.getName() + " with " + this.getAttacks().get(3));
        String enemyType = enemy.getType();
        int attackPoints;
        switch (enemyType) {
            case "fire":
                attackPoints = 21;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "water":
                attackPoints = 16;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "grass":
                attackPoints = 11;
                super.attack(pokemon, enemy, attackPoints);
                break;
            case "electric":
                attackPoints = 31;
                super.attack(pokemon, enemy, attackPoints);
                break;
        }
        System.out.println("Remaning health points of " + enemy.getName() + ": " + enemy.getHp());
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
