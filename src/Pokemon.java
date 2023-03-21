import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public abstract class Pokemon {

    // When pokemon gets the right food(equals own property) , health points ar going up
    public void eats(String food) {
        if(this.getFood().equals(food)) {
            this.setHp(this.getHp() + 20);
            System.out.println(this.getName() + " is eating " + food + ". Health points up: +20.");
        } else {
            System.out.println(this.getName() + " doesn't eat " + food);
        }
    }



    private final String name;
    private final int level;
    private int hp;
    private final String food;
    private final String sound;
    private final String type;

    public Pokemon(String name, int level, int hp, String food, String sound, String type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.type = type;
    }

    // General attack method for all sorts of attacks
    public void attack(Pokemon pokemon, Pokemon enemy, int attackPoints) {
        List<String> foods = new ArrayList<String>(Arrays.asList("firenougats", "Pokeflakes", "Pokeleafs", "Pokebrocks"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to feed your Pokemon?: ");
        for (String food : foods
                ) {
            System.out.println("\t"+ food);
        }

        enemy.setHp(enemy.getHp() - attackPoints);
        System.out.println(enemy.getName() + " loses " + attackPoints + " hp.");
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public String getType() {
        return type;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

}
