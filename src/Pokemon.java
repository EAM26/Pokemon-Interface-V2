import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public abstract class Pokemon {

    // When pokemon gets the right food(equals own property) , health points ar going up
    public void eats(String food) {
        if(this.getFood().toLowerCase().equals(food) || this.getFood().equals("Everything")) {
            this.setHp(this.getHp() + 20);
            System.out.println(this.getName() + " likes eating " + food + ". Health points up: +20.");
        } else {
            this.setHp(this.getHp() - 5);
            System.out.println(this.getName() + " doesn't like " + food + ". Health points down: -5.");
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

    // Pick food of choice before attack. Hp up or down depending on food property pokemon
    public String feed() {
        Boolean isFeeding = true;
        List<String> foods = new ArrayList<String>(Arrays.asList("firenougats", "pokeflakes", "pokeleafs", "pokebrocks"));
        Scanner scanner = new Scanner(System.in);
        while(isFeeding) {
            System.out.println("What would you like to feed your Pokemon?: ");
            System.out.println("[firenougats, pokeflakes, pokeleafs or pokebrocks]");
            String chosenFood = scanner.nextLine();
            if(foods.contains(chosenFood.toLowerCase())) {
                return chosenFood.toLowerCase();
            } else {
                System.out.println(chosenFood + " not a valid option. Try again.");
            }
        }
        return "";
    }

    // Calculates new health points and shows message
    public void attackCalc(Pokemon pokemon, Pokemon enemy, int attackPoints) {
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
